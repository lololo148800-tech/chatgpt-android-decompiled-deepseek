package p406Qg;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import com.openai.chatgpt.R;
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
import p179H0.AbstractC3189g;
import p179H0.C3196n;
import p204I1.C3582M;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p244Jg.C4339c;
import p292Lg.C5034f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p363Og.C6209m;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8080e6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8142m4;
import p571X9.AbstractC9177N2;
import p571X9.AbstractC9225V3;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9775N3;
import p594Y9.AbstractC9821V2;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Qg.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6701L extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21530Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6704O f21531Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f21532o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6701L(C6704O c6704o, InterfaceC3759g interfaceC3759g, int i10) {
        super(3);
        this.f21530Y = i10;
        this.f21531Z = c6704o;
        this.f21532o0 = interfaceC3759g;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x04a9  */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C21694h c21694h;
        C10449g c10449g;
        C10456n c10456n;
        C3196n c3196n;
        C6021p c6021p;
        C21696i c21696i;
        Boolean bool;
        C3196n c3196n2;
        C6704O c6704o;
        C10456n c10456n2;
        C6021p c6021p2;
        C6021p c6021p3;
        boolean z6;
        List list;
        int i10;
        List list2;
        C17296C c17296c = C17296C.f55119a;
        C5975S c5975s = C6013l.f19514a;
        InterfaceC3759g interfaceC3759g = this.f21532o0;
        C6704O c6704o2 = this.f21531Z;
        switch (this.f21530Y) {
            case 0:
                InterfaceC17783s0 TopAppBar = (InterfaceC17783s0) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TopAppBar, "$this$TopAppBar");
                if ((iIntValue & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else if (!AbstractC16544l.m18089b(c6704o2.f21537a, Boolean.FALSE) && !c6704o2.f21545i.isEmpty()) {
                    c6021p4.m6524S(330580929);
                    boolean zM6542f = c6021p4.m6542f(interfaceC3759g);
                    Object objM6514H = c6021p4.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C4339c(interfaceC3759g, 10);
                        c6021p4.m6537c0(objM6514H);
                    }
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                    c6021p4.m6553p(false);
                    AbstractC9821V2.m10460a(c6704o2.f21545i, c6704o2.f21546j, interfaceC1436k, null, (c6704o2.f21538b || c6704o2.f21539c) ? false : true, c6021p4, 64);
                }
                break;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p5.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    boolean z10 = c6704o2.f21539c;
                    c6021p5.m6524S(-393192070);
                    boolean zM6542f2 = c6021p5.m6542f(interfaceC3759g);
                    Object objM6514H2 = c6021p5.m6514H();
                    if (zM6542f2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C6209m(interfaceC3759g, 8);
                        c6021p5.m6537c0(objM6514H2);
                    }
                    c6021p5.m6553p(false);
                    C3196n c3196nM8541g = AbstractC8088f6.m8541g(z10, (InterfaceC1426a) objM6514H2, c6021p5);
                    C10456n c10456n3 = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n3, paddings);
                    C17756f c17756f = AbstractC17770m.f56726c;
                    C10449g c10449g2 = C10444b.f30946y0;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g2, c6021p5, 0);
                    int i11 = c6021p5.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p5.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p5, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p5.m6528W();
                    if (c6021p5.f19563O) {
                        c6021p5.m6549l(c21696i2);
                    } else {
                        c6021p5.m6543f0();
                    }
                    C21694h c21694h2 = C21698j.f68873f;
                    C5997d.m6439Z(c21694h2, c6021p5, c17790wM19515a);
                    C21694h c21694h3 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h3, c6021p5, interfaceC6008i0M6550m);
                    C21694h c21694h4 = C21698j.f68874g;
                    if (c6021p5.f19563O || !AbstractC16544l.m18089b(c6021p5.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p5, i11, c21694h4);
                    }
                    C21694h c21694h5 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h5, c6021p5, interfaceC10459qM10923d);
                    C17794y c17794y = C17794y.f56777a;
                    c6021p5.m6524S(330596596);
                    Boolean bool2 = Boolean.FALSE;
                    Boolean bool3 = c6704o2.f21537a;
                    boolean zM18089b = AbstractC16544l.m18089b(bool3, bool2);
                    boolean z11 = c6704o2.f21538b;
                    List list3 = c6704o2.f21542f;
                    if (zM18089b) {
                        c21694h = c21694h3;
                        c10449g = c10449g2;
                        c10456n = c10456n3;
                        c3196n = c3196nM8541g;
                        c6021p = c6021p5;
                    } else {
                        c6021p5.m6524S(330599230);
                        boolean zM6542f3 = c6021p5.m6542f(interfaceC3759g);
                        Object objM6514H3 = c6021p5.m6514H();
                        if (zM6542f3 || objM6514H3 == c5975s) {
                            objM6514H3 = new C4339c(interfaceC3759g, 11);
                            c6021p5.m6537c0(objM6514H3);
                        }
                        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H3;
                        c6021p5.m6553p(false);
                        float f10 = AbstractC7313q.f23199d;
                        c21694h = c21694h3;
                        c10449g = c10449g2;
                        c10456n = c10456n3;
                        c3196n = c3196nM8541g;
                        AbstractC9775N3.m10381a(interfaceC1436k2, AbstractC10842a.m11237o(AbstractC10842a.m11235m(AbstractC10842a.m11233k(c10456n3, f10), f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23198c, 7), null, AbstractC8142m4.m8676d(R.string.settings_memory_view_search, c6021p5), (z11 || c6704o2.f21539c || (list2 = list3) == null || list2.isEmpty()) ? false : true, null, null, false, c6021p5, 0, 228);
                        c6021p = c6021p5;
                    }
                    c6021p.m6553p(false);
                    C10456n c10456n4 = c10456n;
                    C3196n c3196n3 = c3196n;
                    InterfaceC10459q interfaceC10459qM8507b = AbstractC8080e6.m8507b(c17794y.m19544b(c10456n4, true), c3196n3);
                    C10451i c10451i = C10444b.f30934Y;
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
                    int i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM8507b);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c21696i = c21696i2;
                        c6021p.m6549l(c21696i);
                    } else {
                        c21696i = r17;
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(c21694h, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d2);
                    C10843b c10843b = C10843b.f32509a;
                    FillElement fillElement = AbstractC10844c.f32512c;
                    boolean zM18089b2 = AbstractC16544l.m18089b(bool3, bool2);
                    C10451i c10451i2 = C10444b.f30938q0;
                    if (!zM18089b2) {
                        bool = bool3;
                        C10456n c10456n5 = c10456n4;
                        c3196n2 = c3196n3;
                        C6021p c6021p6 = c6021p;
                        if (z11) {
                            c6021p6.m6524S(-153593638);
                            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p6, 0);
                            int i13 = c6021p6.f19564P;
                            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p6.m6550m();
                            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p6, fillElement);
                            c6021p6.m6528W();
                            if (c6021p6.f19563O) {
                                c6021p6.m6549l(c21696i);
                            } else {
                                c6021p6.m6543f0();
                            }
                            C5997d.m6439Z(c21694h2, c6021p6, c17790wM19515a2);
                            C5997d.m6439Z(c21694h, c6021p6, interfaceC6008i0M6550m3);
                            if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i13))) {
                                AbstractC0168G.m537z(i13, c6021p6, i13, c21694h4);
                            }
                            C5997d.m6439Z(c21694h5, c6021p6, interfaceC10459qM10923d3);
                            c6021p6.m6524S(936388049);
                            int i14 = 0;
                            while (i14 < 5) {
                                C6021p c6021p7 = c6021p6;
                                AbstractC3914G1.m4611a(AbstractC6710f.f21568b, null, null, null, null, null, null, 0.0f, 0.0f, c6021p7, 6, 510);
                                i14++;
                                c6021p6 = c6021p7;
                                c10456n5 = c10456n5;
                            }
                            c10456n2 = c10456n5;
                            c6021p3 = c6021p6;
                            AbstractC3794B0.m4471F(c6021p3, false, true, false);
                        } else {
                            List list4 = list3;
                            if (list4 == null || list4.isEmpty()) {
                                c6021p6.m6524S(-153575043);
                                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i, false);
                                int i15 = c6021p6.f19564P;
                                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p6.m6550m();
                                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p6, fillElement);
                                c6021p6.m6528W();
                                interfaceC3759g = interfaceC3759g;
                                if (c6021p6.f19563O) {
                                    c6021p6.m6549l(c21696i);
                                } else {
                                    c6021p6.m6543f0();
                                }
                                C5997d.m6439Z(c21694h2, c6021p6, interfaceC21057KM19511e2);
                                C5997d.m6439Z(c21694h, c6021p6, interfaceC6008i0M6550m4);
                                if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i15))) {
                                    AbstractC0168G.m537z(i15, c6021p6, i15, c21694h4);
                                }
                                C5997d.m6439Z(c21694h5, c6021p6, interfaceC10459qM10923d4);
                                Object[] objArr = {AbstractC9821V2.m10463d(c6704o2.f21546j, c6021p6)};
                                c6704o = c6704o2;
                                c10456n2 = c10456n5;
                                c6021p2 = c6021p6;
                                AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.settings_memory_view_empty, objArr, c6021p6), AbstractC10842a.m11233k(c10843b.m11240a(c10456n5, c10451i2), AbstractC7313q.f23201f), ((C3949M0) c6021p6.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p6.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p2, 0, 0, 65016);
                                c6021p2.m6553p(true);
                                c6021p2.m6553p(false);
                            } else {
                                c6021p6.m6524S(-153551009);
                                c6021p6.m6524S(-153550141);
                                boolean zM6542f4 = c6021p6.m6542f(c6704o2) | c6021p6.m6542f(interfaceC3759g);
                                Object objM6514H4 = c6021p6.m6514H();
                                if (zM6542f4 || objM6514H4 == c5975s) {
                                    objM6514H4 = new C5034f(c6704o2, 23, interfaceC3759g);
                                    c6021p6.m6537c0(objM6514H4);
                                }
                                InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H4;
                                c6021p6.m6553p(false);
                                c10456n2 = c10456n5;
                                c6021p3 = c6021p6;
                                AbstractC9746I4.m10337a(fillElement, null, null, false, null, null, null, false, interfaceC1436k3, c6021p3, 6, 254);
                                c6021p3.m6553p(false);
                                c6704o = c6704o2;
                                c6021p2 = c6021p3;
                            }
                        }
                        AbstractC3189g.m4035a(c6704o.f21539c, c3196n2, c10843b.m11240a(c10456n2, C10444b.f30935Z), 0L, 0L, false, c6021p2, 64);
                        c6021p2.m6553p(true);
                        c6021p2.m6524S(330758731);
                        if (!AbstractC16544l.m18089b(bool, Boolean.FALSE) || (list = list3) == null || list.isEmpty()) {
                            z6 = false;
                        } else {
                            z6 = false;
                            AbstractC9177N2.m9731a(c6704o, (InterfaceC1436k) interfaceC3759g, null, c6021p2, 0);
                        }
                        c6021p2.m6553p(z6);
                        c6021p2.m6553p(true);
                    } else {
                        c6021p.m6524S(-153617609);
                        InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i, false);
                        int i16 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, fillElement);
                        c6021p.m6528W();
                        bool = bool3;
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e3);
                        C5997d.m6439Z(c21694h, c6021p, interfaceC6008i0M6550m5);
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                            AbstractC0168G.m537z(i16, c6021p, i16, c21694h4);
                        }
                        C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d5);
                        InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10843b.m11240a(c10456n4, c10451i2), AbstractC7313q.f23201f);
                        c6021p.m6524S(936370080);
                        boolean zM6542f5 = c6021p.m6542f(interfaceC3759g);
                        Object objM6514H5 = c6021p.m6514H();
                        if (zM6542f5 || objM6514H5 == c5975s) {
                            i10 = 7;
                            objM6514H5 = new C6209m(interfaceC3759g, 7);
                            c6021p.m6537c0(objM6514H5);
                        } else {
                            i10 = 7;
                        }
                        c6021p.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM11233k, false, null, (InterfaceC1426a) objM6514H5, i10);
                        c3196n2 = c3196n3;
                        c6021p3 = c6021p;
                        AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(R.string.settings_memory_view_disabled, null, c6021p, 2), interfaceC10459qM11209d, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C3582M.m4274b(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, 0L, null, 3, 0, 0L, null, null, 16744446), c6021p3, 0, 0, 131068);
                        c6021p3.m6553p(true);
                        c6021p3.m6553p(false);
                        c10456n2 = c10456n4;
                    }
                    c6704o = c6704o2;
                    c6021p2 = c6021p3;
                    AbstractC3189g.m4035a(c6704o.f21539c, c3196n2, c10843b.m11240a(c10456n2, C10444b.f30935Z), 0L, 0L, false, c6021p2, 64);
                    c6021p2.m6553p(true);
                    c6021p2.m6524S(330758731);
                    if (AbstractC16544l.m18089b(bool, Boolean.FALSE)) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    c6021p2.m6553p(z6);
                    c6021p2.m6553p(true);
                }
                break;
        }
        return c17296c;
    }
}
