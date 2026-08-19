package p070Cg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0468O;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3984T1;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8512L2;
import p594Y9.AbstractC9733G3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p911o0.AbstractC17758g;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Cg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1659g extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4684Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1660h f4685Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ FailwhaleViewModel f4686o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1659g(C1660h c1660h, FailwhaleViewModel failwhaleViewModel) {
        super(3);
        this.f4685Z = c1660h;
        this.f4686o0 = failwhaleViewModel;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4684Y) {
            case 0:
                C17794y HeroContent = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(HeroContent, "$this$HeroContent");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p.m6524S(-1236579125);
                    FailwhaleViewModel failwhaleViewModel = this.f4686o0;
                    boolean zM6542f = c6021p.m6542f(failwhaleViewModel);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C1658f(failwhaleViewModel, 0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459qM11244d, false, null, null, null, null, null, null, AbstractC1654b.f4679a, c6021p, 805306416, 508);
                    C1660h c1660h = this.f4685Z;
                    if (c1660h.f4688b != null) {
                        AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23198c));
                        InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                        c6021p.m6524S(-1236561998);
                        boolean zM6542f2 = c6021p.m6542f(failwhaleViewModel);
                        Object objM6514H2 = c6021p.m6514H();
                        if (zM6542f2 || objM6514H2 == c5975s) {
                            objM6514H2 = new C1658f(failwhaleViewModel, 1);
                            c6021p.m6537c0(objM6514H2);
                        }
                        c6021p.m6553p(false);
                        AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H2, interfaceC10459qM11244d2, false, null, null, null, null, null, null, AbstractC8411c.m8969c(1428616652, c6021p, new C0468O(c1660h, 2)), c6021p, 805306416, 508);
                    }
                }
                break;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17425e c17425eM9171a = AbstractC8512L2.m9171a();
                    C1660h c1660h2 = this.f4685Z;
                    AbstractC9733G3.m10320a(AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings), c17425eM9171a, c1660h2.f4687a, null, AbstractC8411c.m8969c(43615295, c6021p2, new C1659g(this.f4686o0, c1660h2)), c6021p2, 24576, 8);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1659g(FailwhaleViewModel failwhaleViewModel, C1660h c1660h) {
        super(3);
        this.f4686o0 = failwhaleViewModel;
        this.f4685Z = c1660h;
    }
}
