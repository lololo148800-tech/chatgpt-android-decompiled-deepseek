package p964qe;

import androidx.compose.foundation.gestures.AbstractC10840a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.feature.messages.MessagesViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p025An.C0644w;
import p042Bf.C1275q;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4141u3;
import p229J0.C4135t3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p860l0.C16670E0;
import p860l0.C16780t0;
import p860l0.C16782u;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17780r;
import p911o0.C17786u;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: qe.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18697j extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59516Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18698k f59517Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f59518o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ MessagesViewModel f59519p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18697j(C18698k c18698k, InterfaceC3759g interfaceC3759g, MessagesViewModel messagesViewModel, int i10) {
        super(3);
        this.f59516Y = i10;
        this.f59517Z = c18698k;
        this.f59518o0 = interfaceC3759g;
        this.f59519p0 = messagesViewModel;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int size;
        int i10;
        switch (this.f59516Y) {
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
                    InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                    float fM19514a = BoxWithConstraints.m19514a() * 0.85f;
                    float fMo7864b0 = interfaceC7537b.mo7864b0(fM19514a);
                    float fMo7864b1 = interfaceC7537b.mo7864b0(BoxWithConstraints.m19514a() * 0.7f);
                    c6021p.m6524S(1384617835);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    Throwable th2 = null;
                    Object obj4 = objM6514H;
                    if (objM6514H == c5975s) {
                        C16782u c16782u = new C16782u(C18695h.f59514Y, C18696i.f59515Y, AbstractC13758e.m15255t(0, 0, null, 7), AbstractC13758e.m15250o());
                        C18694g c18694g = new C18694g(1, fMo7864b1);
                        C16780t0 c16780t0 = new C16780t0();
                        c18694g.invoke(c16780t0);
                        C16782u.m18546h(c16782u, new C16670E0(c16780t0.f53852a));
                        c6021p.m6537c0(c16782u);
                        obj4 = c16782u;
                    }
                    C16782u c16782u2 = (C16782u) obj4;
                    c6021p.m6553p(false);
                    C18698k c18698k = this.f59517Z;
                    int i11 = 0;
                    for (Object obj5 : c18698k.f59522c) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            Throwable th3 = th2;
                            AbstractC17681o.m19388q();
                            throw th3;
                        }
                        List list = (List) obj5;
                        boolean z6 = c18698k.f59521b;
                        List list2 = c18698k.f59522c;
                        if (z6) {
                            size = (list2.size() - 1) - i11;
                        } else {
                            if (z6) {
                                throw new C0644w();
                            }
                            size = i11;
                        }
                        float fM6409g = (size * fMo7864b0) + c16782u2.f53868j.m6409g();
                        int iIntValue2 = ((Number) c16782u2.f53865g.getValue()).intValue();
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        c6021p.m6524S(-872630878);
                        boolean zM6538d = c6021p.m6538d(iIntValue2) | c6021p.m6538d(size);
                        InterfaceC3759g interfaceC3759g = this.f59518o0;
                        boolean zM6542f = zM6538d | c6021p.m6542f(interfaceC3759g) | c6021p.m6538d(i11);
                        Object objM6514H2 = c6021p.m6514H();
                        if (zM6542f || objM6514H2 == c5975s) {
                            i10 = 1;
                            objM6514H2 = new C18693f(iIntValue2, size, interfaceC3759g, i11, null);
                            c6021p.m6537c0(objM6514H2);
                        } else {
                            i10 = 1;
                        }
                        c6021p.m6553p(false);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, numValueOf);
                        InterfaceC10459q interfaceC10459qM11256p = AbstractC10844c.m11256p(C10456n.f30959Y, fM19514a);
                        c6021p.m6524S(-872621000);
                        boolean zM6536c = c6021p.m6536c(fM6409g);
                        Object objM6514H3 = c6021p.m6514H();
                        if (zM6536c || objM6514H3 == c5975s) {
                            objM6514H3 = new C18694g(0, fM6409g);
                            c6021p.m6537c0(objM6514H3);
                        }
                        c6021p.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11218d = AbstractC10840a.m11218d(AbstractC10842a.m11230h(interfaceC10459qM11256p, (InterfaceC1436k) objM6514H3), c16782u2, EnumC16673F0.f53402Z);
                        int i13 = size;
                        float f10 = i13 == 0 ? AbstractC7313q.f23201f : AbstractC7313q.f23199d;
                        float f11 = AbstractC7313q.f23199d;
                        InterfaceC10459q interfaceC10459qM11236n = AbstractC10842a.m11236n(interfaceC10459qM11218d, f10, f11, i13 == list2.size() - i10 ? AbstractC7313q.f23201f : f11, f11);
                        InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                        int i14 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11236n);
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                        C21694h c21694h = C21698j.f68874g;
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                        AbstractC4034c4.m4725a(null, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c, 0L, 0L, 0.0f, AbstractC7306j.f23144b, null, AbstractC8411c.m8969c(-1953344309, c6021p, new C1275q(i13, interfaceC3759g, i11, c18698k, list, this.f59519p0)), c6021p, 12582912, 93);
                        c6021p.m6553p(true);
                        i11 = i12;
                        c18698k = c18698k;
                        fM19514a = fM19514a;
                        th2 = null;
                        c5975s = c5975s;
                    }
                }
                return C17296C.f55119a;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p2.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC17758g.m19481a(AbstractC10844c.m11244d(AbstractC10842a.m11232j(C10456n.f30959Y, paddings), 1.0f), null, false, AbstractC8411c.m8969c(2139035749, c6021p2, new C18697j(this.f59517Z, this.f59518o0, this.f59519p0, 0)), c6021p2, 3072, 6);
                }
                return C17296C.f55119a;
        }
    }
}
