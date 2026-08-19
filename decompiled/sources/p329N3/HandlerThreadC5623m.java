package p329N3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20804f;
import p1073w3.RunnableC20803e;

/* JADX INFO: renamed from: N3.m */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerThreadC5623m extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: Y */
    public RunnableC20803e f18241Y;

    /* JADX INFO: renamed from: Z */
    public Handler f18242Z;

    /* JADX INFO: renamed from: o0 */
    public Error f18243o0;

    /* JADX INFO: renamed from: p0 */
    public RuntimeException f18244p0;

    /* JADX INFO: renamed from: q0 */
    public C5624n f18245q0;

    /* JADX INFO: renamed from: a */
    public final void m6025a(int i10) throws C20804f {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f18241Y.getClass();
        RunnableC20803e runnableC20803e = this.f18241Y;
        runnableC20803e.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC20800b.m21317e("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC20800b.m21317e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC20803e.f66074o0 = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC20803e.f66071s0, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z6 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i11 = AbstractC20817s.f66106a;
        AbstractC20800b.m21317e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z6);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC20803e.f66074o0, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC20800b.m21317e("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC20803e.f66075p0 = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC20803e.f66074o0;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC20800b.m21317e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC20800b.m21317e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC20803e.f66076q0 = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC20803e.f66073Z;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new C20804f(sb2.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC20803e.f66077r0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC20803e);
        SurfaceTexture surfaceTexture2 = this.f18241Y.f66077r0;
        surfaceTexture2.getClass();
        this.f18245q0 = new C5624n(this, surfaceTexture2, i10 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m6026b() {
        this.f18241Y.getClass();
        RunnableC20803e runnableC20803e = this.f18241Y;
        runnableC20803e.f66072Y.removeCallbacks(runnableC20803e);
        try {
            SurfaceTexture surfaceTexture = runnableC20803e.f66077r0;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC20803e.f66073Z, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC20803e.f66074o0;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC20803e.f66074o0;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC20803e.f66076q0;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC20803e.f66074o0, runnableC20803e.f66076q0);
            }
            EGLContext eGLContext = runnableC20803e.f66075p0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC20803e.f66074o0, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC20803e.f66074o0;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC20803e.f66074o0);
            }
            runnableC20803e.f66074o0 = null;
            runnableC20803e.f66075p0 = null;
            runnableC20803e.f66076q0 = null;
            runnableC20803e.f66077r0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    m6026b();
                } catch (Throwable th2) {
                    try {
                        AbstractC20800b.m21325m("PlaceholderSurface", "Failed to release placeholder surface", th2);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                m6025a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                AbstractC20800b.m21325m("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f18243o0 = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                AbstractC20800b.m21325m("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f18244p0 = e11;
                synchronized (this) {
                    notify();
                }
            } catch (C20804f e12) {
                AbstractC20800b.m21325m("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.f18244p0 = new IllegalStateException(e12);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
