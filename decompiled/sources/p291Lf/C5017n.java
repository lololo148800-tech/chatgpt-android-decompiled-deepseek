package p291Lf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p273Kl.C4714D;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.C17786u;
import p926of.AbstractC18176m;
import p926of.C18174k;
import p946pc.AbstractC18351q;
import p946pc.C18320E;

/* JADX INFO: renamed from: Lf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5017n extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16374Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f16375Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f16376o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f16377p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f16378q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5017n(int i10, int i11, C5019p c5019p, InterfaceC1436k interfaceC1436k) {
        super(3);
        this.f16375Z = i10;
        this.f16376o0 = i11;
        this.f16377p0 = c5019p;
        this.f16378q0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC1426a interfaceC1426a;
        InterfaceC1436k interfaceC1436k;
        switch (this.f16374Y) {
            case 0:
                C17786u BoxWithConstraints = (C17786u) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    c6021p.m6524S(1044189533);
                    boolean z6 = (iIntValue & 14) == 4;
                    int i10 = this.f16375Z;
                    boolean zM6538d = z6 | c6021p.m6538d(i10);
                    int i11 = this.f16376o0;
                    boolean zM6538d2 = zM6538d | c6021p.m6538d(i11);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (zM6538d2 || objM6514H == c5975s) {
                        objM6514H = new C5016m(BoxWithConstraints, i10, i11);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
                    c6021p.m6553p(false);
                    int i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(-1740447904);
                    for (AbstractC18176m abstractC18176m : ((C5019p) this.f16377p0).f16382a) {
                        c6021p.m6524S(-1740443760);
                        if (!(abstractC18176m instanceof C18174k) || (interfaceC1436k = (InterfaceC1436k) this.f16378q0) == null) {
                            interfaceC1426a = null;
                        } else {
                            c6021p.m6524S(-1740440076);
                            boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6542f(abstractC18176m);
                            Object objM6514H2 = c6021p.m6514H();
                            if (zM6542f || objM6514H2 == c5975s) {
                                objM6514H2 = new C4714D(interfaceC1436k, 7, (C18174k) abstractC18176m);
                                c6021p.m6537c0(objM6514H2);
                            }
                            c6021p.m6553p(false);
                            interfaceC1426a = (InterfaceC1426a) objM6514H2;
                        }
                        c6021p.m6553p(false);
                        AbstractC5018o.m5646a(abstractC18176m, interfaceC1426a, null, null, 0.0f, null, null, c6021p, 0, 124);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                break;
            default:
                C18320E BasicRichText = (C18320E) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BasicRichText, "$this$BasicRichText");
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c6021p2.m6542f(BasicRichText) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C5997d.m6440a(AbstractC18351q.f58595f.mo6405a(Integer.valueOf(this.f16375Z + 1)), AbstractC8411c.m8968b(113720474, c6021p2, new C8409a((C8410b) this.f16377p0, BasicRichText, (List) this.f16378q0, this.f16376o0, 23)), c6021p2, 56);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5017n(int i10, C8410b c8410b, List list, int i11) {
        super(3);
        this.f16375Z = i10;
        this.f16377p0 = c8410b;
        this.f16378q0 = list;
        this.f16376o0 = i11;
    }
}
