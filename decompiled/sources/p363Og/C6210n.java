package p363Og;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3984T1;
import p349O0.C6013l;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9274d4;
import p594Y9.AbstractC9697A3;
import p870le.C16862T;
import p964qe.AbstractC18689b;

/* JADX INFO: renamed from: Og.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C6210n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20215Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3759g f20216Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6210n(InterfaceC3759g interfaceC3759g, int i10) {
        super(2);
        this.f20215Y = i10;
        this.f20216Z = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20215Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(-473089511);
                    InterfaceC3759g interfaceC3759g = this.f20216Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC3759g);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C6209m(interfaceC3759g, 0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H, null, false, null, null, AbstractC6199c.f20193b, c6021p, 196608, 30);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(1384589388);
                    InterfaceC3759g interfaceC3759g2 = this.f20216Z;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC3759g2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C16862T(interfaceC3759g2, 9);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC9697A3.m10288c((InterfaceC1426a) objM6514H2, null, AbstractC18689b.f59504b, c6021p2, 384, 2);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC9274d4.m9842a(AbstractC18689b.f59503a, null, AbstractC8411c.m8969c(1538101296, c6021p3, new C6210n(this.f20216Z, 1)), null, false, null, c6021p3, 390, 58);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
