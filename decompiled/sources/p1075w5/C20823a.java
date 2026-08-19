package p1075w5;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import p025An.InterfaceC0627n0;

/* JADX INFO: renamed from: w5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20823a implements InterfaceC20837o {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11105n f66154Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC0627n0 f66155Z;

    public C20823a(AbstractC11105n abstractC11105n, InterfaceC0627n0 interfaceC0627n0) {
        this.f66154Y = abstractC11105n;
        this.f66155Z = interfaceC0627n0;
    }

    @Override // p1075w5.InterfaceC20837o
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo21431e() {
    }

    @Override // p1075w5.InterfaceC20837o
    /* JADX INFO: renamed from: m */
    public final void mo21432m() {
        this.f66154Y.mo7808c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u interfaceC11112u) {
        this.f66155Z.mo1275e(null);
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
        this.f66154Y.mo7806a(this);
    }
}
