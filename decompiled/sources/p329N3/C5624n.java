package p329N3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.RunnableC20803e;

/* JADX INFO: renamed from: N3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5624n extends Surface {

    /* JADX INFO: renamed from: p0 */
    public static int f18246p0;

    /* JADX INFO: renamed from: q0 */
    public static boolean f18247q0;

    /* JADX INFO: renamed from: Y */
    public final boolean f18248Y;

    /* JADX INFO: renamed from: Z */
    public final HandlerThreadC5623m f18249Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f18250o0;

    public C5624n(HandlerThreadC5623m handlerThreadC5623m, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f18249Z = handlerThreadC5623m;
        this.f18248Y = z6;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m6027a(Context context) {
        String strEglQueryString;
        int i10;
        try {
            if (!f18247q0) {
                int i11 = AbstractC20817s.f66106a;
                if (i11 >= 24 && ((i11 >= 26 || !("samsung".equals(AbstractC20817s.f66108c) || "XT1650".equals(AbstractC20817s.f66109d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i10 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i10 = 0;
                }
                f18246p0 = i10;
                f18247q0 = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f18246p0 != 0;
    }

    /* JADX INFO: renamed from: b */
    public static C5624n m6028b(Context context, boolean z6) {
        boolean z10 = false;
        AbstractC20800b.m21320h(!z6 || m6027a(context));
        HandlerThreadC5623m handlerThreadC5623m = new HandlerThreadC5623m("ExoPlayer:PlaceholderSurface");
        int i10 = z6 ? f18246p0 : 0;
        handlerThreadC5623m.start();
        Handler handler = new Handler(handlerThreadC5623m.getLooper(), handlerThreadC5623m);
        handlerThreadC5623m.f18242Z = handler;
        handlerThreadC5623m.f18241Y = new RunnableC20803e(handler);
        synchronized (handlerThreadC5623m) {
            handlerThreadC5623m.f18242Z.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThreadC5623m.f18245q0 == null && handlerThreadC5623m.f18244p0 == null && handlerThreadC5623m.f18243o0 == null) {
                try {
                    handlerThreadC5623m.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC5623m.f18244p0;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC5623m.f18243o0;
        if (error != null) {
            throw error;
        }
        C5624n c5624n = handlerThreadC5623m.f18245q0;
        c5624n.getClass();
        return c5624n;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f18249Z) {
            try {
                if (!this.f18250o0) {
                    HandlerThreadC5623m handlerThreadC5623m = this.f18249Z;
                    handlerThreadC5623m.f18242Z.getClass();
                    handlerThreadC5623m.f18242Z.sendEmptyMessage(2);
                    this.f18250o0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
