package p229J0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p758g0.C13740P;
import p773h0.C14288i0;
import p773h0.C14292k0;
import p773h0.EnumC14284g0;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.D4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3899D4 {

    /* JADX INFO: renamed from: a */
    public final boolean f11881a;

    /* JADX INFO: renamed from: b */
    public final C14292k0 f11882b;

    /* JADX INFO: renamed from: c */
    public final C13740P f11883c;

    /* JADX INFO: renamed from: d */
    public C0624m f11884d;

    public C3899D4(boolean z6, boolean z10, C14292k0 c14292k0) {
        this.f11881a = z10;
        this.f11882b = c14292k0;
        this.f11883c = new C13740P(Boolean.valueOf(z6));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4608a() {
        C13740P c13740p = this.f11883c;
        return ((Boolean) c13740p.f43330b.getValue()).booleanValue() || ((Boolean) c13740p.f43331c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final Object m4609b(EnumC14284g0 enumC14284g0, AbstractC19694j abstractC19694j) {
        C3887B4 c3887b4 = new C3887B4(this, new C3893C4(this, null), enumC14284g0, null);
        C14292k0 c14292k0 = this.f11882b;
        c14292k0.getClass();
        Object objM1183l = AbstractC0575H.m1183l(new C14288i0(enumC14284g0, c14292k0, c3887b4, null), abstractC19694j);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }
}
