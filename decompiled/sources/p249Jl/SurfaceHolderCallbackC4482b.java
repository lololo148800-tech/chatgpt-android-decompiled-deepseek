package p249Jl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.RendererCommon;
import livekit.org.webrtc.SurfaceEglRenderer;
import livekit.org.webrtc.ThreadUtils;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;
import p001A.RunnableC0000A;
import p147Fh.RunnableC2748e;
import p160G5.p161rK.TVCuK;
import p435Rl.C6934r;
import p435Rl.InterfaceC6933q;

/* JADX INFO: renamed from: Jl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceHolderCallbackC4482b extends TextureView implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents, InterfaceC6933q {
    public static final C4481a Companion = new C4481a();

    /* JADX INFO: renamed from: o0 */
    public final String f14625o0;

    /* JADX INFO: renamed from: p0 */
    public final RendererCommon.VideoLayoutMeasure f14626p0;

    /* JADX INFO: renamed from: q0 */
    public final SurfaceEglRenderer f14627q0;

    /* JADX INFO: renamed from: r0 */
    public int f14628r0;

    /* JADX INFO: renamed from: s0 */
    public int f14629s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f14630t0;

    /* JADX INFO: renamed from: u0 */
    public int f14631u0;

    /* JADX INFO: renamed from: v0 */
    public int f14632v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f14633w0;

    /* JADX INFO: renamed from: x0 */
    public C6934r f14634x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceHolderCallbackC4482b(Context context) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        this.f14626p0 = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.f14625o0 = resourceName;
        this.f14627q0 = new SurfaceEglRenderer(resourceName);
        setSurfaceTextureListener(this);
    }

    private final String getResourceName() {
        try {
            String resourceEntryName = getResources().getResourceEntryName(getId());
            AbstractC16544l.m18091d(resourceEntryName);
            return resourceEntryName;
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5210b() {
        int i10;
        ThreadUtils.checkIsOnMainThread();
        if (!this.f14630t0 || this.f14628r0 == 0 || this.f14629s0 == 0 || getWidth() == 0 || getHeight() == 0) {
            this.f14632v0 = 0;
            this.f14631u0 = 0;
            return;
        }
        float width = getWidth() / getHeight();
        int i11 = this.f14628r0;
        int i12 = this.f14629s0;
        if (i11 / i12 > width) {
            i11 = (int) (i12 * width);
        } else {
            i12 = (int) (i11 / width);
        }
        int iMin = Math.min(getWidth(), i11);
        int iMin2 = Math.min(getHeight(), i12);
        m5209a("updateSurfaceSize. Layout size: " + getWidth() + 'x' + getHeight() + ", frame size: " + this.f14628r0 + 'x' + this.f14629s0 + ", requested surface size: " + iMin + 'x' + iMin2 + ", old surface size: " + this.f14631u0 + 'x' + this.f14632v0);
        if (iMin == this.f14631u0 && iMin2 == this.f14632v0) {
            return;
        }
        this.f14631u0 = iMin;
        this.f14632v0 = iMin2;
        int width2 = getWidth();
        int height = getHeight();
        double d10 = ((double) iMin2) / ((double) iMin);
        int i13 = (int) (((double) width2) * d10);
        if (height > i13) {
            i10 = width2;
        } else {
            i10 = (int) (((double) height) / d10);
            i13 = height;
        }
        int i14 = (width2 - i10) / 2;
        int i15 = (height - i13) / 2;
        m5209a("video=" + iMin + 'x' + iMin2 + " view=" + width2 + 'x' + height + " newView=" + i10 + 'x' + i13 + " off=" + i14 + ',' + i15);
        Matrix matrix = new Matrix();
        getTransform(matrix);
        matrix.setScale(((float) i10) / ((float) width2), ((float) i13) / ((float) height));
        matrix.postTranslate((float) i14, (float) i15);
        setTransform(matrix);
    }

    public C6934r getViewVisibility() {
        return this.f14634x0;
    }

    @Override // livekit.org.webrtc.VideoSink
    public final void onFrame(VideoFrame frame) {
        AbstractC16544l.m18094g(frame, "frame");
        if (!this.f14633w0) {
            AbstractC15256t.m16465c("TextureViewRenderer", "Received frame when not initialized! You must call Room.initVideoRenderer(view) before using this view!");
        }
        this.f14627q0.onFrame(frame);
    }

    @Override // livekit.org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 == 0 || i12 == 180) ? i10 : i11;
        if (i12 == 0 || i12 == 180) {
            i10 = i11;
        }
        RunnableC2748e runnableC2748e = new RunnableC2748e(this, i13, i10, 1);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnableC2748e.run();
        } else {
            post(runnableC2748e);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        ThreadUtils.checkIsOnMainThread();
        this.f14627q0.setLayoutAspectRatio((i12 - i10) / (i13 - i11));
        m5210b();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ThreadUtils.checkIsOnMainThread();
        Point pointMeasure = this.f14626p0.measure(i10, i11, this.f14628r0, this.f14629s0);
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
        m5209a("onMeasure(). New size: " + pointMeasure.x + 'x' + pointMeasure.y);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        AbstractC16544l.m18094g(surface, "surface");
        ThreadUtils.checkIsOnMainThread();
        this.f14627q0.createEglSurface(getSurfaceTexture());
        this.f14632v0 = 0;
        this.f14631u0 = 0;
        m5210b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        AbstractC16544l.m18094g(surface, "surface");
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f14627q0.releaseEglSurface(new RunnableC0000A(countDownLatch, 28));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        AbstractC16544l.m18094g(surface, "surface");
        ThreadUtils.checkIsOnMainThread();
        m5209a("surfaceChanged: size: " + i10 + 'x' + i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        AbstractC16544l.m18094g(surface, "surface");
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        AbstractC16544l.m18094g(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        C6934r viewVisibility = getViewVisibility();
        if (viewVisibility != null) {
            boolean zMo5400b = viewVisibility.mo5400b();
            if (!viewVisibility.mo5401d().equals(viewVisibility.f22208b)) {
                zMo5400b = true;
            }
            if (zMo5400b) {
                viewVisibility.m7315c();
            }
        }
    }

    public final void setEnableHardwareScaler(boolean z6) {
        ThreadUtils.checkIsOnMainThread();
        this.f14630t0 = z6;
        m5210b();
    }

    public final void setFpsReduction(float f10) {
        this.f14627q0.setFpsReduction(f10);
    }

    public final void setMirror(boolean z6) {
        this.f14627q0.setMirror(z6);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.f14626p0.setScalingType(scalingType);
        requestLayout();
    }

    public void setViewVisibility(C6934r c6934r) {
        this.f14634x0 = c6934r;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i10, int i11, int i12) {
        AbstractC16544l.m18094g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        AbstractC16544l.m18094g(holder, "holder");
        ThreadUtils.checkIsOnMainThread();
        this.f14632v0 = 0;
        this.f14631u0 = 0;
        m5210b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        AbstractC16544l.m18094g(holder, "holder");
    }

    /* JADX INFO: renamed from: a */
    public final void m5209a(String str) {
        Logging.m18742d("TextureViewRenderer", this.f14625o0 + TVCuK.TSVznKpbYeKVd + str);
    }

    @Override // livekit.org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
    }
}
