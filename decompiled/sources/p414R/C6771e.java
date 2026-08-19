package p414R;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import mm.C17315r;
import p001A.C0083q0;
import p001A.RunnableC0066i;
import p001A.RunnableC0068j;
import p178H.C3170s0;
import p178H.C3175v;
import p178H.RunnableC3160n0;
import p221Ii.RunnableC3724c;
import p253K.AbstractC4503n;
import p277L.ScheduledExecutorServiceC4831d;
import p283L5.AbstractC4941g;
import p329N3.RunnableC5611a;
import p465T.AbstractC7171g;
import p465T.AbstractC7173i;
import p465T.C7172h;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8482G2;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: R.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6771e implements InterfaceC6780n, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: Y */
    public final C6773g f21723Y;

    /* JADX INFO: renamed from: Z */
    public final HandlerThread f21724Z;

    /* JADX INFO: renamed from: o0 */
    public final ScheduledExecutorServiceC4831d f21725o0;

    /* JADX INFO: renamed from: p0 */
    public final Handler f21726p0;

    /* JADX INFO: renamed from: q0 */
    public final AtomicBoolean f21727q0;

    /* JADX INFO: renamed from: r0 */
    public final float[] f21728r0;

    /* JADX INFO: renamed from: s0 */
    public final float[] f21729s0;

    /* JADX INFO: renamed from: t0 */
    public final LinkedHashMap f21730t0;

    /* JADX INFO: renamed from: u0 */
    public int f21731u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f21732v0;

    /* JADX INFO: renamed from: w0 */
    public final ArrayList f21733w0;

    public C6771e(C3175v c3175v) {
        Map mapEmptyMap = Collections.emptyMap();
        this.f21727q0 = new AtomicBoolean(false);
        this.f21728r0 = new float[16];
        this.f21729s0 = new float[16];
        this.f21730t0 = new LinkedHashMap();
        this.f21731u0 = 0;
        this.f21732v0 = false;
        this.f21733w0 = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f21724Z = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f21726p0 = handler;
        this.f21725o0 = new ScheduledExecutorServiceC4831d(handler);
        this.f21723Y = new C6773g();
        try {
            try {
                AbstractC16347a.m17947b(new C0083q0(this, c3175v, mapEmptyMap, 3)).get();
            } catch (InterruptedException | ExecutionException e10) {
                e = e10;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    @Override // p414R.InterfaceC6780n
    /* JADX INFO: renamed from: a */
    public final void mo7201a(C3170s0 c3170s0) {
        if (this.f21727q0.get()) {
            c3170s0.m4001c();
        } else {
            m7204d(new RunnableC3724c(this, 13, c3170s0), new RunnableC3160n0(c3170s0, 1));
        }
    }

    @Override // p414R.InterfaceC6780n
    /* JADX INFO: renamed from: b */
    public final void mo7202b(C6779m c6779m) {
        if (this.f21727q0.get()) {
            c6779m.close();
            return;
        }
        RunnableC3724c runnableC3724c = new RunnableC3724c(this, 12, c6779m);
        Objects.requireNonNull(c6779m);
        m7204d(runnableC3724c, new RunnableC5611a(c6779m, 2));
    }

    /* JADX INFO: renamed from: c */
    public final void m7203c() {
        if (this.f21732v0 && this.f21731u0 == 0) {
            LinkedHashMap linkedHashMap = this.f21730t0;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C6779m) it.next()).close();
            }
            Iterator it2 = this.f21733w0.iterator();
            while (it2.hasNext()) {
                ((C6767a) it2.next()).f21707c.m10748b(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            C6773g c6773g = this.f21723Y;
            if (((AtomicBoolean) c6773g.f21738o0).getAndSet(false)) {
                AbstractC7173i.m7545c((Thread) c6773g.f21740q0);
                c6773g.m7218l();
            }
            this.f21724Z.quit();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7204d(Runnable runnable, Runnable runnable2) {
        try {
            this.f21725o0.execute(new RunnableC0066i(this, runnable2, runnable, 12));
        } catch (RejectedExecutionException e10) {
            AbstractC8072d6.m8493j("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7205e(Exception exc) {
        ArrayList arrayList = this.f21733w0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6767a) it.next()).f21707c.m10748b(exc);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: f */
    public final Bitmap m7206f(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        AbstractC8482G2.m9129c(fArr2, i10);
        AbstractC8482G2.m9130d(fArr2);
        Size sizeM5250f = AbstractC4503n.m5250f(size, i10);
        C6773g c6773g = this.f21723Y;
        c6773g.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeM5250f.getHeight() * sizeM5250f.getWidth() * 4);
        AbstractC4941g.m5554M("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeM5250f.getHeight() * sizeM5250f.getWidth()) * 4);
        AbstractC4941g.m5554M("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = AbstractC7173i.f22796a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        AbstractC7173i.m7544b("glGenTextures");
        int i11 = iArr2[0];
        GLES20.glActiveTexture(33985);
        AbstractC7173i.m7544b("glActiveTexture");
        GLES20.glBindTexture(3553, i11);
        AbstractC7173i.m7544b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeM5250f.getWidth(), sizeM5250f.getHeight(), 0, 6407, 5121, null);
        AbstractC7173i.m7544b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        AbstractC7173i.m7544b("glGenFramebuffers");
        int i12 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i12);
        AbstractC7173i.m7544b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i11, 0);
        AbstractC7173i.m7544b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        AbstractC7173i.m7544b("glActiveTexture");
        GLES20.glBindTexture(36197, c6773g.f21736Y);
        AbstractC7173i.m7544b("glBindTexture");
        c6773g.f21745v0 = null;
        GLES20.glViewport(0, 0, sizeM5250f.getWidth(), sizeM5250f.getHeight());
        GLES20.glScissor(0, 0, sizeM5250f.getWidth(), sizeM5250f.getHeight());
        AbstractC7171g abstractC7171g = (AbstractC7171g) c6773g.f21747x0;
        abstractC7171g.getClass();
        if (abstractC7171g instanceof C7172h) {
            GLES20.glUniformMatrix4fv(((C7172h) abstractC7171g).f22794f, 1, false, fArr2, 0);
            AbstractC7173i.m7544b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC7173i.m7544b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeM5250f.getWidth(), sizeM5250f.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        AbstractC7173i.m7544b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        AbstractC7173i.m7544b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i12}, 0);
        AbstractC7173i.m7544b("glDeleteFramebuffers");
        int i13 = c6773g.f21736Y;
        GLES20.glActiveTexture(33984);
        AbstractC7173i.m7544b("glActiveTexture");
        GLES20.glBindTexture(36197, i13);
        AbstractC7173i.m7544b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM5250f.getWidth(), sizeM5250f.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m11187f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeM5250f.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public final void m7207g(C17315r c17315r) {
        ArrayList arrayList = this.f21733w0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (c17315r == null) {
            m7205e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i10 = -1;
                int i11 = -1;
                Bitmap bitmapM7206f = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    C6767a c6767a = (C6767a) it.next();
                    int i12 = c6767a.f21706b;
                    if (i10 != i12 || bitmapM7206f == null) {
                        if (bitmapM7206f != null) {
                            bitmapM7206f.recycle();
                        }
                        bitmapM7206f = m7206f((Size) c17315r.f55147Z, (float[]) c17315r.f55148o0, i12);
                        i11 = -1;
                        i10 = i12;
                    }
                    int i13 = c6767a.f21705a;
                    if (i11 != i13) {
                        byteArrayOutputStream.reset();
                        bitmapM7206f.compress(Bitmap.CompressFormat.JPEG, i13, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i11 = i13;
                    }
                    Surface surface = (Surface) c17315r.f55146Y;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.m11190i(byteArray, surface);
                    c6767a.f21707c.m10747a(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            m7205e(e10);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Surface surface;
        C6779m c6779m;
        float[] fArr;
        int i10;
        if (this.f21727q0.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr2 = this.f21728r0;
        surfaceTexture.getTransformMatrix(fArr2);
        Iterator it = this.f21730t0.entrySet().iterator();
        C17315r c17315r = null;
        while (true) {
            C17315r c17315r2 = c17315r;
            while (true) {
                if (!it.hasNext()) {
                    try {
                        m7207g(c17315r2);
                        return;
                    } catch (RuntimeException e10) {
                        m7205e(e10);
                        return;
                    }
                }
                Map.Entry entry = (Map.Entry) it.next();
                surface = (Surface) entry.getValue();
                c6779m = (C6779m) entry.getKey();
                float[] fArr3 = c6779m.f21781q0;
                fArr = this.f21729s0;
                Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
                i10 = c6779m.f21779o0;
                if (i10 == 34) {
                    try {
                        this.f21723Y.m7220n(surfaceTexture.getTimestamp(), fArr, surface);
                    } catch (RuntimeException e11) {
                        AbstractC8072d6.m8488e("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e11);
                    }
                }
            }
            boolean z6 = true;
            AbstractC4941g.m5559R("Unsupported format: " + i10, i10 == 256);
            if (c17315r2 != null) {
                z6 = false;
            }
            AbstractC4941g.m5559R("Only one JPEG output is supported.", z6);
            c17315r = new C17315r(surface, c6779m.f21780p0, (float[]) fArr.clone());
        }
    }

    @Override // p414R.InterfaceC6780n
    public final void release() {
        if (this.f21727q0.getAndSet(true)) {
            return;
        }
        m7204d(new RunnableC5611a(this, 3), new RunnableC0068j(0));
    }
}
