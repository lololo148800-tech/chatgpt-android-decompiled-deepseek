package androidx.lifecycle;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p275Kn.C4816c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.lifecycle.L */
/* JADX INFO: loaded from: classes.dex */
public final class C11076L implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ EnumC11103l f33380Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f33381Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC0571F f33382o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC11103l f33383p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0624m f33384q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C4816c f33385r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC19694j f33386s0;

    /* JADX WARN: Multi-variable type inference failed */
    public C11076L(EnumC11103l enumC11103l, C16525B c16525b, InterfaceC0571F interfaceC0571F, EnumC11103l enumC11103l2, C0624m c0624m, C4816c c4816c, InterfaceC1439n interfaceC1439n) {
        this.f33380Y = enumC11103l;
        this.f33381Z = c16525b;
        this.f33382o0 = interfaceC0571F;
        this.f33383p0 = enumC11103l2;
        this.f33384q0 = c0624m;
        this.f33385r0 = c4816c;
        this.f33386s0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.n, sm.j] */
    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        C16525B c16525b = this.f33381Z;
        if (enumC11103l == this.f33380Y) {
            c16525b.f51262Y = AbstractC0575H.m1156D(this.f33382o0, null, null, new C11075K(this.f33385r0, this.f33386s0, null), 3);
            return;
        }
        if (enumC11103l == this.f33383p0) {
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c16525b.f51262Y;
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
            c16525b.f51262Y = null;
        }
        if (enumC11103l == EnumC11103l.ON_DESTROY) {
            this.f33384q0.resumeWith(C17296C.f55119a);
        }
    }
}
