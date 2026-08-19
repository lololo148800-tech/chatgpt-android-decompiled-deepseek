package p1075w5;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11111t;
import androidx.lifecycle.InterfaceC11112u;
import java.util.concurrent.CancellationException;
import p007A5.AbstractC0371f;
import p025An.InterfaceC0627n0;
import p1121y5.C21388a;
import p864l5.C16826m;

/* JADX INFO: renamed from: w5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C20840r implements InterfaceC20837o {

    /* JADX INFO: renamed from: Y */
    public final C16826m f66264Y;

    /* JADX INFO: renamed from: Z */
    public final C20831i f66265Z;

    /* JADX INFO: renamed from: o0 */
    public final C21388a f66266o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC11105n f66267p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC0627n0 f66268q0;

    public C20840r(C16826m c16826m, C20831i c20831i, C21388a c21388a, AbstractC11105n abstractC11105n, InterfaceC0627n0 interfaceC0627n0) {
        this.f66264Y = c16826m;
        this.f66265Z = c20831i;
        this.f66266o0 = c21388a;
        this.f66267p0 = abstractC11105n;
        this.f66268q0 = interfaceC0627n0;
    }

    @Override // p1075w5.InterfaceC20837o
    /* JADX INFO: renamed from: e */
    public final void mo21431e() {
        C21388a c21388a = this.f66266o0;
        if (c21388a.f67898Z.isAttachedToWindow()) {
            return;
        }
        ViewOnAttachStateChangeListenerC20842t viewOnAttachStateChangeListenerC20842tM1003c = AbstractC0371f.m1003c(c21388a.f67898Z);
        C20840r c20840r = viewOnAttachStateChangeListenerC20842tM1003c.f66273p0;
        if (c20840r != null) {
            c20840r.f66268q0.mo1275e(null);
            C21388a c21388a2 = c20840r.f66266o0;
            boolean z6 = c21388a2 instanceof InterfaceC11111t;
            AbstractC11105n abstractC11105n = c20840r.f66267p0;
            if (z6) {
                abstractC11105n.mo7808c(c21388a2);
            }
            abstractC11105n.mo7808c(c20840r);
        }
        viewOnAttachStateChangeListenerC20842tM1003c.f66273p0 = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // p1075w5.InterfaceC20837o
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo21432m() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC0371f.m1003c(this.f66266o0.f67898Z).m21440a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }

    @Override // p1075w5.InterfaceC20837o
    public final void start() {
        AbstractC11105n abstractC11105n = this.f66267p0;
        abstractC11105n.mo7806a(this);
        C21388a c21388a = this.f66266o0;
        if (c21388a instanceof InterfaceC11111t) {
            C21388a c21388a2 = c21388a;
            abstractC11105n.mo7808c(c21388a2);
            abstractC11105n.mo7806a(c21388a2);
        }
        ViewOnAttachStateChangeListenerC20842t viewOnAttachStateChangeListenerC20842tM1003c = AbstractC0371f.m1003c(c21388a.f67898Z);
        C20840r c20840r = viewOnAttachStateChangeListenerC20842tM1003c.f66273p0;
        if (c20840r != null) {
            c20840r.f66268q0.mo1275e(null);
            C21388a c21388a3 = c20840r.f66266o0;
            boolean z6 = c21388a3 instanceof InterfaceC11111t;
            AbstractC11105n abstractC11105n2 = c20840r.f66267p0;
            if (z6) {
                abstractC11105n2.mo7808c(c21388a3);
            }
            abstractC11105n2.mo7808c(c20840r);
        }
        viewOnAttachStateChangeListenerC20842tM1003c.f66273p0 = this;
    }
}
