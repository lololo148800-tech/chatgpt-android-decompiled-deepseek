package androidx.lifecycle;

import p001A.C0072l;

/* JADX INFO: renamed from: androidx.lifecycle.D */
/* JADX INFO: loaded from: classes.dex */
public final class C11068D implements InterfaceC11070F {

    /* JADX INFO: renamed from: Y */
    public final C11069E f33369Y;

    /* JADX INFO: renamed from: Z */
    public final C0072l f33370Z;

    /* JADX INFO: renamed from: o0 */
    public int f33371o0 = -1;

    public C11068D(C11069E c11069e, C0072l c0072l) {
        this.f33369Y = c11069e;
        this.f33370Z = c0072l;
    }

    /* JADX INFO: renamed from: a */
    public final void m12123a() {
        this.f33369Y.m12120f(this);
    }

    @Override // androidx.lifecycle.InterfaceC11070F
    /* JADX INFO: renamed from: u */
    public final void mo259u(Object obj) {
        int i10 = this.f33371o0;
        int i11 = this.f33369Y.f33365g;
        if (i10 != i11) {
            this.f33371o0 = i11;
            this.f33370Z.mo259u(obj);
        }
    }
}
