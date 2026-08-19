package p007A5;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import mm.C17296C;
import p025An.C0624m;

/* JADX INFO: renamed from: A5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0368c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1258Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0624m f1259Z;

    public /* synthetic */ C0368c(C0624m c0624m, int i10) {
        this.f1258Y = i10;
        this.f1259Z = c0624m;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f1258Y;
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f1258Y;
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f1258Y;
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f1258Y;
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC11112u interfaceC11112u) {
        switch (this.f1258Y) {
            case 0:
                this.f1259Z.resumeWith(C17296C.f55119a);
                break;
            default:
                this.f1259Z.resumeWith(C17296C.f55119a);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f1258Y;
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }
}
