package p344Nl;

import mm.C17296C;
import p002A0.C0132i;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2149O0;
import p124Ei.C2502d1;
import p387Pl.C6487g;
import p387Pl.C6497q;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9873d3;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5838j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19080Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6487g f19081Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5842n f19082o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6497q f19083p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5838j(C6487g c6487g, C5842n c5842n, C6497q c6497q, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19081Z = c6487g;
        this.f19082o0 = c5842n;
        this.f19083p0 = c6497q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5838j(this.f19081Z, this.f19082o0, this.f19083p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C5838j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19080Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            int i11 = 0;
            int i12 = 6;
            InterfaceC2149O0 interfaceC2149O0M10529c = AbstractC9873d3.m10529c(new C2502d1(i11, i12, C6487g.class, this.f19081Z, "features", "getFeatures()Ljava/util/Set;"));
            C0132i c0132i = new C0132i(this.f19082o0, 17, this.f19083p0);
            this.f19080Y = 1;
            if (interfaceC2149O0M10529c.mo3141d(c0132i, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
