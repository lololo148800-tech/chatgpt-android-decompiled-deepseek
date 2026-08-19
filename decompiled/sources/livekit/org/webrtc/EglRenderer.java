package livekit.org.webrtc;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p001A.RunnableC0066i;

/* JADX INFO: loaded from: classes2.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final Runnable eglExceptionCallback;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private EglThread eglThread;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private final Object threadLock;
    private boolean usePresentationTimeStamp;

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        public /* synthetic */ EglSurfaceCreation(EglRenderer eglRenderer, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else {
                        if (!(obj instanceof SurfaceTexture)) {
                            throw new IllegalStateException("Invalid surface: " + this.surface);
                        }
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        private EglSurfaceCreation() {
        }
    }

    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer, boolean z6) {
            this.listener = frameListener;
            this.scale = f10;
            this.drawer = glDrawer;
            this.applyFpsReduction = z6;
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j10, int i10) {
        if (i10 <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j10 / ((long) i10)) + " us";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$4(float f10, float f11, float f12, float f13) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        this.eglBase.makeCurrent();
        GLES20.glClearColor(f10, f11, f12, f13);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$1(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f10, boolean z6) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f10, glDrawer, z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$3(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$2(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$swapBuffersOnRenderThread$5(VideoFrame videoFrame, long j10, boolean z6) {
        if (!z6) {
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                return;
            } else {
                this.eglBase.makeCurrent();
            }
        }
        if (this.usePresentationTimeStamp) {
            this.eglBase.swapBuffers(videoFrame.getTimestampNs());
        } else {
            this.eglBase.swapBuffers();
        }
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs = (System.nanoTime() - j10) + this.renderSwapBufferTimeNs;
        }
    }

    private void logD(String str) {
        Logging.m18742d(TAG, this.name + str);
    }

    private void logE(String str, Throwable th2) {
        Logging.m18744e(TAG, this.name + str, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j10 = jNanoTime - this.statisticsStartTimeNs;
                if (j10 > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                    float nanos = (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1L)) / j10;
                    logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j10) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format(nanos) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + Separators.DOT);
                    resetStatistics(jNanoTime);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void logW(String str) {
        Logging.m18746w(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z6) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z6 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.getHandler().post(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z6;
        float f10;
        float f11;
        float f12;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase == null || !eglBase.hasSurface()) {
                    logD("Dropping frame - No surface");
                    videoFrame.release();
                    return;
                }
                this.eglBase.makeCurrent();
                synchronized (this.fpsReductionLock) {
                    try {
                        long j10 = this.minRenderPeriodNs;
                        if (j10 != Long.MAX_VALUE) {
                            if (j10 > 0) {
                                long jNanoTime = System.nanoTime();
                                long j11 = this.nextFrameTimeNs;
                                if (jNanoTime < j11) {
                                    logD("Skipping frame rendering - fps reduction is active.");
                                    z6 = false;
                                } else {
                                    long j12 = j11 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j12;
                                    this.nextFrameTimeNs = Math.max(j12, jNanoTime);
                                }
                            }
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long jNanoTime2 = System.nanoTime();
                float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                synchronized (this.layoutLock) {
                    f10 = this.layoutAspectRatio;
                    if (f10 == 0.0f) {
                        f10 = rotatedWidth;
                    }
                }
                if (rotatedWidth > f10) {
                    f12 = f10 / rotatedWidth;
                    f11 = 1.0f;
                } else {
                    f11 = rotatedWidth / f10;
                    f12 = 1.0f;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
                this.drawMatrix.preScale(f12, f11);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                try {
                    if (z6) {
                        try {
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(16384);
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                            long jNanoTime3 = System.nanoTime();
                            swapBuffersOnRenderThread(videoFrame, jNanoTime3);
                            synchronized (this.statisticsLock) {
                                this.framesRendered++;
                                this.renderTimeNs = (jNanoTime3 - jNanoTime2) + this.renderTimeNs;
                            }
                        } catch (GlUtil.GlOutOfMemoryException e10) {
                            logE("Error while drawing frame", e10);
                            ErrorCallback errorCallback = this.errorCallback;
                            if (errorCallback != null) {
                                errorCallback.onGlOutOfMemory();
                            }
                            this.drawer.release();
                            this.frameDrawer.release();
                            this.bitmapTextureFramebuffer.release();
                        }
                    }
                    notifyCallbacks(videoFrame, z6);
                    videoFrame.release();
                } catch (Throwable th3) {
                    videoFrame.release();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void resetStatistics(long j10) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j10;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j10) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.scheduleRenderUpdate(new EglThread.RenderUpdate() { // from class: livekit.org.webrtc.n
                        @Override // livekit.org.webrtc.EglThread.RenderUpdate
                        public final void update(boolean z6) {
                            this.f54499a.lambda$swapBuffersOnRenderThread$5(videoFrame, j10, z6);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f10) {
        addFrameListener(frameListener, f10, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z6) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logD("Initializing EglRenderer");
                this.eglThread = eglThread;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z6;
                eglThread.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = eglThread.createEglBaseWithSharedConnection();
                eglThread.getHandler().post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread.getHandler().postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(LOG_INTERVAL_SEC));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z6;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame2 = this.pendingFrame;
                        z6 = videoFrame2 != null;
                        if (z6) {
                            videoFrame2.release();
                        }
                        this.pendingFrame = videoFrame;
                        videoFrame.retain();
                        this.eglThread.getHandler().post(new RunnableC17041k(this, 2));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z6) {
                    synchronized (this.statisticsLock) {
                        this.framesDropped++;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                Thread thread = eglThread == null ? null : eglThread.getHandler().getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    logD("Already released");
                    return;
                }
                eglThread.getHandler().removeCallbacks(this.logStatisticsRunnable);
                this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
                this.eglThread.getHandler().postAtFrontOfQueue(new RunnableC16969A(this, 1, countDownLatch));
                this.eglThread.release();
                this.eglThread = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                logD("Releasing done.");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    runnable.run();
                } else {
                    eglThread.getHandler().removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.eglThread.getHandler().postAtFrontOfQueue(new RunnableC16969A(this, 2, runnable));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                if (Thread.currentThread() == this.eglThread.getHandler().getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new RunnableC0066i(this, countDownLatch, frameListener, 27));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f10) {
        synchronized (this.fpsReductionLock) {
            try {
                long j10 = this.minRenderPeriodNs;
                if (f10 <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f10);
                }
                if (this.minRenderPeriodNs != j10) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setLayoutAspectRatio(float f10) {
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f10;
        }
    }

    public void setMirror(boolean z6) {
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z6;
        }
    }

    public void setMirrorVertically(boolean z6) {
        synchronized (this.layoutLock) {
            this.mirrorVertically = z6;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() { // from class: livekit.org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: livekit.org.webrtc.EglRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    try {
                        if (EglRenderer.this.eglThread != null) {
                            EglRenderer.this.eglThread.getHandler().removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                            EglRenderer.this.eglThread.getHandler().postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(this, 0);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f10, glDrawer, false);
    }

    public void clearImage(final float f10, final float f11, final float f12, final float f13) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    return;
                }
                eglThread.getHandler().postAtFrontOfQueue(new Runnable() { // from class: livekit.org.webrtc.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54494Y.lambda$clearImage$4(f10, f11, f12, f13);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(final FrameListener frameListener, final float f10, final RendererCommon.GlDrawer glDrawer, final boolean z6) {
        postToRenderThread(new Runnable() { // from class: livekit.org.webrtc.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f54489Y.lambda$addFrameListener$1(glDrawer, frameListener, f10, z6);
            }
        });
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z6) {
        init(EglThread.create(null, context, iArr), glDrawer, z6);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
