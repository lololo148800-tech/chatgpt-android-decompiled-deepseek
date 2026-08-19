package p341Ni;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p1016t3.InterfaceC19759I;
import p1073w3.AbstractC20817s;
import p1073w3.InterfaceC20806h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5783h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5785i f18824Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f18825Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5783h(C5785i c5785i, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18824Y = c5785i;
        this.f18825Z = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5783h(this.f18824Y, this.f18825Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5783h c5783h = (C5783h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5783h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C1526D c1526d = this.f18824Y.f18876b;
        c1526d.m2256q0();
        final float fM21407h = AbstractC20817s.m21407h(this.f18825Z, 0.0f, 1.0f);
        if (c1526d.f4081e1 != fM21407h) {
            c1526d.f4081e1 = fM21407h;
            c1526d.m2249j0(1, Float.valueOf(c1526d.f4062L0.f4281g * fM21407h), 2);
            c1526d.f4100y0.m10694e(22, new InterfaceC20806h() { // from class: C3.t
                @Override // p1073w3.InterfaceC20806h
                public final void invoke(Object obj2) {
                    ((InterfaceC19759I) obj2).mo2759g(fM21407h);
                }
            });
        }
        return C17296C.f55119a;
    }
}
