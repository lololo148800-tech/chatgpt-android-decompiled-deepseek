package p1073w3;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: w3.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC20803e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: s0 */
    public static final int[] f66071s0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: Y */
    public final Handler f66072Y;

    /* JADX INFO: renamed from: Z */
    public final int[] f66073Z = new int[1];

    /* JADX INFO: renamed from: o0 */
    public EGLDisplay f66074o0;

    /* JADX INFO: renamed from: p0 */
    public EGLContext f66075p0;

    /* JADX INFO: renamed from: q0 */
    public EGLSurface f66076q0;

    /* JADX INFO: renamed from: r0 */
    public SurfaceTexture f66077r0;

    public RunnableC20803e(Handler handler) {
        this.f66072Y = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f66072Y.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f66077r0;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
