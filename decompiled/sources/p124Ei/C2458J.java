package p124Ei;

import androidx.compose.animation.AbstractC10831a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p017Af.C0459F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21902C2;
import p1155zi.C21965U0;
import p1155zi.C22057s2;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7373x;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9393x3;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p736f0.InterfaceC13499q;
import p758g0.AbstractC13758e;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;
import p911o0.C17794y;
import p911o0.InterfaceC17783s0;
import p926of.C18173j;

/* JADX INFO: renamed from: Ei.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C2458J extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7643Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2532n1 f7644Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7645o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2458J(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, int i10) {
        super(3);
        this.f7643Y = i10;
        this.f7644Z = c2532n1;
        this.f7645o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Iterable iterableM9974d;
        switch (this.f7643Y) {
            case 0:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C2532n1 c2532n1 = this.f7644Z;
                    List<AbstractC7343b0> list = c2532n1.f7913t;
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC7343b0 abstractC7343b0 : list) {
                        if (abstractC7343b0 instanceof C7373x) {
                            iterableM9974d = AbstractC9393x3.m9974d(new C18173j(((C7373x) abstractC7343b0).f23373c, null));
                        } else if (abstractC7343b0 instanceof C7315A) {
                            List list2 = ((C7315A) abstractC7343b0).f23212c;
                            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new C18173j((C21965U0) it.next(), null));
                            }
                            iterableM9974d = arrayList2;
                        } else {
                            iterableM9974d = C17689w.f56480Y;
                        }
                        AbstractC17686t.m19398v(iterableM9974d, arrayList);
                    }
                    c6021p.m6524S(-1230544576);
                    boolean zM6542f = c6021p.m6542f(c2532n1) | c6021p.m6545h(arrayList);
                    InterfaceC1436k interfaceC1436k = this.f7645o0;
                    boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f2 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0146w(c2532n1, arrayList, interfaceC1436k, 11);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9746I4.m10337a(null, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 255);
                }
                break;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                C10450h c10450h = C10444b.f30944w0;
                C10456n c10456n = C10456n.f30959Y;
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h, c6021p2, 48);
                int i10 = c6021p2.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p2.m6528W();
                if (c6021p2.f19563O) {
                    c6021p2.m6549l(c21696i);
                } else {
                    c6021p2.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p2, c17781r0M19506b);
                C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                c6021p2.m6524S(-1487701383);
                C2532n1 c2532n2 = this.f7644Z;
                C21902C2 c21902c2 = c2532n2.f7897d;
                C22057s2 c22057s2M22333a = c21902c2 != null ? c21902c2.m22333a() : null;
                C5975S c5975s = C6013l.f19514a;
                InterfaceC1436k interfaceC1436k2 = this.f7645o0;
                if (c22057s2M22333a != null) {
                    c6021p2.m6524S(-1487696503);
                    boolean zM6542f3 = c6021p2.m6542f(interfaceC1436k2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f3 || objM6514H2 == c5975s) {
                        objM6514H2 = new C0459F(10, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC2511g1.m3601m(0, (InterfaceC1426a) objM6514H2, c6021p2, null);
                }
                c6021p2.m6553p(false);
                c6021p2.m6524S(-1487692161);
                if (c2532n2.f7882N.f7788a) {
                    c6021p2.m6524S(-1487687002);
                    boolean zM6542f4 = c6021p2.m6542f(interfaceC1436k2);
                    Object objM6514H3 = c6021p2.m6514H();
                    if (zM6542f4 || objM6514H3 == c5975s) {
                        objM6514H3 = new C0459F(11, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H3);
                    }
                    c6021p2.m6553p(false);
                    AbstractC2511g1.m3597i((InterfaceC1426a) objM6514H3, c2532n2, null, c6021p2, 0);
                }
                c6021p2.m6553p(false);
                AbstractC2511g1.m3604p(c2532n2, interfaceC1436k2, null, c6021p2, 0);
                c6021p2.m6553p(true);
                break;
            default:
                InterfaceC17783s0 TopAppBar = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TopAppBar, "$this$TopAppBar");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p3.m6542f(TopAppBar) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C2532n1 c2532n3 = this.f7644Z;
                    AbstractC10831a.m11200c(TopAppBar, (c2532n3.f7873E || c2532n3.f7876H.isEmpty()) ? false : true, null, AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2), null, AbstractC8411c.m8969c(-1753206563, c6021p3, new C2458J(c2532n3, this.f7645o0, 1)), c6021p3, (iIntValue2 & 14) | 1600512, 18);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
