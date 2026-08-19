package p124Ei;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import bf.C11349D;
import bf.C11363S;
import bf.InterfaceC11374b0;
import com.openai.feature.reporting.ReportingViewModel;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.C0286s;
import p020Ai.C0515d;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21891A;
import p197Hj.C3457c;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3896D1;
import p254K0.C4506c;
import p254K0.C4507d;
import p254K0.C4508e;
import p254K0.C4515l;
import p254K0.C4516m;
import p254K0.C4518o;
import p291Lf.AbstractC5023t;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p403Qd.C6658t;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8152n6;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p552Wg.C8843e;
import p575Xd.C9436E;
import p594Y9.AbstractC9839Y2;
import p621Zd.C10282c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.C13489g;
import p774h1.C14365u;
import p860l0.C16663C;
import p870le.C16863U;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import sg.C19540D;
import sg.C19575q;
import sg.C19578t;
import sg.C19581w;
import td.C19849l;

/* JADX INFO: renamed from: Ei.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2474R0 extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7710Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7711Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7712o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f7713p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2474R0(Object obj, Object obj2, Object obj3, int i10) {
        super(4);
        this.f7710Y = i10;
        this.f7712o0 = obj;
        this.f7713p0 = obj2;
        this.f7711Z = obj3;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC10459q interfaceC10459qM11209d = C10456n.f30959Y;
        C5975S c5975s = C6013l.f19514a;
        int i10 = 6;
        C17296C c17296c = C17296C.f55119a;
        Object obj5 = this.f7711Z;
        Object obj6 = this.f7713p0;
        Object obj7 = this.f7712o0;
        switch (this.f7710Y) {
            case 0:
                C13489g AnimatedContent = (C13489g) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6021p c6021p = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                if (!zBooleanValue && ((EnumC2444C) obj7) == EnumC2444C.f7593Y) {
                    AbstractC2511g1.m3603o((C2532n1) obj6, (InterfaceC1436k) obj5, null, c6021p, 0);
                }
                break;
            case 1:
                C10845a c10845a = (C10845a) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i11 = (iIntValue2 & 6) == 0 ? iIntValue2 | (c6021p2.m6542f(c10845a) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i11 |= c6021p2.m6538d(iIntValue) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C21891A c21891a = (C21891A) ((List) obj7).get(iIntValue);
                    c6021p2.m6524S(-976060747);
                    c6021p2.m6524S(661252980);
                    if (!c21891a.m22329h()) {
                        c6021p2.m6524S(-1696959289);
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj5;
                        boolean zM6542f = c6021p2.m6542f(interfaceC1436k) | c6021p2.m6545h(c21891a);
                        Object objM6514H = c6021p2.m6514H();
                        if (zM6542f || objM6514H == c5975s) {
                            objM6514H = new C0286s(interfaceC1436k, 25, c21891a);
                            c6021p2.m6537c0(objM6514H);
                        }
                        c6021p2.m6553p(false);
                        interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM11209d, false, null, (InterfaceC1426a) objM6514H, 7);
                    }
                    c6021p2.m6553p(false);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i12 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11209d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p2, i12, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    AbstractC8152n6.m8699c(c21891a, c21891a.equals(((C0515d) obj6).m1126b()), null, c6021p2, 0);
                    c6021p2.m6553p(true);
                    c6021p2.m6553p(false);
                }
                break;
            case 2:
                int iIntValue3 = ((Number) obj2).intValue();
                C6021p c6021p3 = (C6021p) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Object objM6514H2 = c6021p3.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = new C4506c();
                    c6021p3.m6537c0(objM6514H2);
                }
                C4506c c4506c = (C4506c) objM6514H2;
                Object objM6514H3 = c6021p3.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = new C4507d();
                    c6021p3.m6537c0(objM6514H3);
                }
                C4507d c4507d = (C4507d) objM6514H3;
                Object objM6514H4 = c6021p3.m6514H();
                if (objM6514H4 == c5975s) {
                    objM6514H4 = new C4508e(c4506c);
                    c6021p3.m6537c0(objM6514H4);
                }
                C4508e c4508e = (C4508e) objM6514H4;
                C4516m c4516m = (C4516m) obj6;
                boolean zM6542f2 = c6021p3.m6542f(c4516m);
                Object objM6514H5 = c6021p3.m6514H();
                if (zM6542f2 || objM6514H5 == c5975s) {
                    objM6514H5 = new C3457c(c4516m, 12);
                    c6021p3.m6537c0(objM6514H5);
                }
                InterfaceC10459q interfaceC10459qM11316b = AbstractC10868a.m11316b(interfaceC10459qM11209d, new C4515l(iIntValue3, 0, (InterfaceC1426a) objM6514H5, (C4518o) obj7, c4506c, c4508e));
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i13 = c6021p3.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11316b);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p3.m6528W();
                if (c6021p3.f19563O) {
                    c6021p3.m6549l(c21696i2);
                } else {
                    c6021p3.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p3, interfaceC21057KM19511e2);
                C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m2);
                C21694h c21694h2 = C21698j.f68874g;
                if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p3, i13, c21694h2);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d2);
                ((C8410b) obj5).mo985d(c4507d, Integer.valueOf(iIntValue3), c6021p3, Integer.valueOf(iIntValue4 & 112));
                c6021p3.m6553p(true);
                break;
            case 3:
                C10845a c10845a2 = (C10845a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6021p c6021p4 = (C6021p) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i14 = (6 & iIntValue6) == 0 ? iIntValue6 | (c6021p4.m6542f(c10845a2) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i14 |= c6021p4.m6538d(iIntValue5) ? 32 : 16;
                }
                if ((i14 & 147) == 146 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC6601G abstractC6601G = (AbstractC6601G) ((List) obj7).get(iIntValue5);
                    c6021p4.m6524S(1738154029);
                    c6021p4.m6524S(1441542806);
                    if (abstractC6601G instanceof AbstractC6659u) {
                        C9436E c9436e = new C9436E(3, (Set) null);
                        InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459qM11209d, 1.0f);
                        AbstractC6659u abstractC6659u = (AbstractC6659u) abstractC6601G;
                        C8843e c8843e = C8843e.f27077o0;
                        C6658t c6658t = AbstractC6659u.Companion;
                        AbstractC5023t.m5650a((C10282c) obj6, (C10282c) obj5, abstractC6659u, false, c9436e, c8843e, interfaceC10459qM11244d, null, false, false, false, false, false, null, null, c6021p4, 1797120, 0, 32640);
                    }
                    c6021p4.m6553p(false);
                    c6021p4.m6553p(false);
                }
                break;
            case 4:
                C10845a c10845a3 = (C10845a) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C6021p c6021p5 = (C6021p) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i15 = (iIntValue8 & 6) == 0 ? iIntValue8 | (c6021p5.m6542f(c10845a3) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i15 |= c6021p5.m6538d(iIntValue7) ? 32 : 16;
                }
                if ((i15 & 147) == 146 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    C11349D c11349d = (C11349D) ((List) obj7).get(iIntValue7);
                    c6021p5.m6524S(1552032946);
                    AbstractC8090g0.m8543b(((C11363S) obj6).f34359a, c11349d, (InterfaceC1436k) obj5, c6021p5, 0);
                    c6021p5.m6553p(false);
                }
                break;
            case 5:
                C13489g AnimatedContent2 = (C13489g) obj;
                C17309l name$for$destructuring$parameter$0$ = (C17309l) obj2;
                C6021p c6021p6 = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent2, "$this$AnimatedContent");
                AbstractC16544l.m18094g(name$for$destructuring$parameter$0$, "$name$for$destructuring$parameter$0$");
                C19578t c19578t = (C19578t) name$for$destructuring$parameter$0$.f55136Y;
                C19581w c19581w = (C19581w) name$for$destructuring$parameter$0$.f55137Z;
                InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(interfaceC10459qM11209d, AbstractC8479G.m9124e(c6021p6), 14);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p6, 0);
                int i16 = c6021p6.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p6.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p6, interfaceC10459qM9126g);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i3 = C21698j.f68869b;
                c6021p6.m6528W();
                if (c6021p6.f19563O) {
                    c6021p6.m6549l(c21696i3);
                } else {
                    c6021p6.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p6, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p6, interfaceC6008i0M6550m3);
                C21694h c21694h3 = C21698j.f68874g;
                if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i16))) {
                    AbstractC0168G.m537z(i16, c6021p6, i16, c21694h3);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p6, interfaceC10459qM10923d3);
                if (c19581w == null) {
                    c6021p6.m6524S(1044934276);
                    AbstractC8086f4.m8519f(6, c6021p6);
                    c6021p6.m6553p(false);
                } else {
                    C19575q c19575q = (C19575q) obj7;
                    ReportingViewModel reportingViewModel = (ReportingViewModel) obj6;
                    if (c19578t == null) {
                        c6021p6.m6524S(1045040792);
                        c6021p6.m6524S(864997094);
                        boolean zM6542f3 = c6021p6.m6542f(reportingViewModel);
                        Object objM6514H6 = c6021p6.m6514H();
                        if (zM6542f3 || objM6514H6 == c5975s) {
                            objM6514H6 = new C16863U(1, reportingViewModel, ReportingViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 11);
                            c6021p6.m6537c0(objM6514H6);
                        }
                        c6021p6.m6553p(false);
                        AbstractC8086f4.m8522i(c19575q, c19581w, (InterfaceC1436k) ((InterfaceC3759g) objM6514H6), c6021p6, 6);
                        c6021p6.m6553p(false);
                    } else {
                        c6021p6.m6524S(1045170031);
                        c6021p6.m6524S(865001542);
                        boolean zM6542f4 = c6021p6.m6542f(reportingViewModel);
                        Object objM6514H7 = c6021p6.m6514H();
                        if (zM6542f4 || objM6514H7 == c5975s) {
                            objM6514H7 = new C16863U(1, reportingViewModel, ReportingViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 12);
                            c6021p6.m6537c0(objM6514H7);
                        }
                        c6021p6.m6553p(false);
                        AbstractC8086f4.m8521h(c19575q, c19578t, (C19540D) obj5, (InterfaceC1436k) ((InterfaceC3759g) objM6514H7), c6021p6, 6);
                        c6021p6.m6553p(false);
                    }
                }
                c6021p6.m6553p(true);
                break;
            default:
                C10845a c10845a4 = (C10845a) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                C6021p c6021p7 = (C6021p) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i17 = (iIntValue10 & 6) == 0 ? iIntValue10 | (c6021p7.m6542f(c10845a4) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i17 |= c6021p7.m6538d(iIntValue9) ? 32 : 16;
                }
                if ((i17 & 147) == 146 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    InterfaceC11374b0 interfaceC11374b0 = (InterfaceC11374b0) ((List) obj7).get(iIntValue9);
                    c6021p7.m6524S(-1266356619);
                    c6021p7.m6524S(-456489645);
                    C19849l c19849l = (C19849l) obj6;
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj5;
                    boolean zM6542f5 = c6021p7.m6542f(c19849l) | c6021p7.m6542f(interfaceC1436k2) | c6021p7.m6545h(interfaceC11374b0);
                    Object objM6514H8 = c6021p7.m6514H();
                    if (zM6542f5 || objM6514H8 == c5975s) {
                        objM6514H8 = new C16663C(c19849l, interfaceC1436k2, interfaceC11374b0, i10);
                        c6021p7.m6537c0(objM6514H8);
                    }
                    InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H8;
                    c6021p7.m6553p(false);
                    float f10 = AbstractC3896D1.f11851a;
                    AbstractC9839Y2.m10485b(interfaceC11374b0, interfaceC1436k3, null, false, false, false, null, null, AbstractC3896D1.m4607a(C14365u.f45059i, 0L, 0L, 0L, c6021p7, 510), c6021p7, 0, 252);
                    c6021p7.m6553p(false);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2474R0(List list, InterfaceC1436k interfaceC1436k, C0515d c0515d) {
        super(4);
        this.f7710Y = 1;
        this.f7712o0 = list;
        this.f7711Z = interfaceC1436k;
        this.f7713p0 = c0515d;
    }
}
