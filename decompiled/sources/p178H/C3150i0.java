package p178H;

import android.view.Surface;
import java.util.concurrent.Executor;
import p001A.C0100z;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;

/* JADX INFO: renamed from: H.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3150i0 implements InterfaceC3820W {

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC3820W f9478p0;

    /* JADX INFO: renamed from: q0 */
    public final Surface f9479q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC3181y f9480r0;

    /* JADX INFO: renamed from: Y */
    public final Object f9475Y = new Object();

    /* JADX INFO: renamed from: Z */
    public int f9476Z = 0;

    /* JADX INFO: renamed from: o0 */
    public boolean f9477o0 = false;

    /* JADX INFO: renamed from: s0 */
    public final C3117J f9481s0 = new C3117J(this, 1);

    public C3150i0(InterfaceC3820W interfaceC3820W) {
        this.f9478p0 = interfaceC3820W;
        this.f9479q0 = interfaceC3820W.getSurface();
    }

    /* JADX INFO: renamed from: a */
    public final void m3987a() {
        synchronized (this.f9475Y) {
            try {
                this.f9477o0 = true;
                this.f9478p0.mo344k();
                if (this.f9476Z == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3820W
    public final void close() {
        synchronized (this.f9475Y) {
            try {
                Surface surface = this.f9479q0;
                if (surface != null) {
                    surface.release();
                }
                this.f9478p0.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p228J.InterfaceC3820W
    public final int getHeight() {
        int height;
        synchronized (this.f9475Y) {
            height = this.f9478p0.getHeight();
        }
        return height;
    }

    @Override // p228J.InterfaceC3820W
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f9475Y) {
            surface = this.f9478p0.getSurface();
        }
        return surface;
    }

    @Override // p228J.InterfaceC3820W
    public final int getWidth() {
        int width;
        synchronized (this.f9475Y) {
            width = this.f9478p0.getWidth();
        }
        return width;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: i */
    public final InterfaceC3127U mo342i() {
        C3118K c3118k;
        synchronized (this.f9475Y) {
            InterfaceC3127U interfaceC3127UMo342i = this.f9478p0.mo342i();
            if (interfaceC3127UMo342i != null) {
                this.f9476Z++;
                c3118k = new C3118K(interfaceC3127UMo342i);
                c3118k.m4027a(this.f9481s0);
            } else {
                c3118k = null;
            }
        }
        return c3118k;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: j */
    public final int mo343j() {
        int iMo343j;
        synchronized (this.f9475Y) {
            iMo343j = this.f9478p0.mo343j();
        }
        return iMo343j;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: k */
    public final void mo344k() {
        synchronized (this.f9475Y) {
            this.f9478p0.mo344k();
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: p */
    public final void mo347p(InterfaceC3819V interfaceC3819V, Executor executor) {
        synchronized (this.f9475Y) {
            this.f9478p0.mo347p(new C0100z(this, 13, interfaceC3819V), executor);
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: t */
    public final int mo350t() {
        int iMo350t;
        synchronized (this.f9475Y) {
            iMo350t = this.f9478p0.mo350t();
        }
        return iMo350t;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: x */
    public final InterfaceC3127U mo354x() {
        C3118K c3118k;
        synchronized (this.f9475Y) {
            InterfaceC3127U interfaceC3127UMo354x = this.f9478p0.mo354x();
            if (interfaceC3127UMo354x != null) {
                this.f9476Z++;
                c3118k = new C3118K(interfaceC3127UMo354x);
                c3118k.m4027a(this.f9481s0);
            } else {
                c3118k = null;
            }
        }
        return c3118k;
    }
}
