package p017Af;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p650ui.layout.AbstractC10868a;
import bg.AbstractC11405e;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import ge.C14111x0;
import ge.EnumC14057V0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import nc.AbstractC17563j;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p011A9.C0415f;
import p037B9.MeDP.MpoABj;
import p040Bd.C0960M0;
import p040Bd.C1203z0;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.EnumC21895B;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22121S;
import p1156zj.C22090C;
import p1156zj.C22177n0;
import p1156zj.C22195t0;
import p1156zj.C22205x;
import p1156zj.EnumC22088B;
import p1156zj.InterfaceC22179o;
import p124Ei.C2497c;
import p124Ei.C2521k;
import p140Fa.C2685e;
import p153Fn.C2925c;
import p168Gd.C3034b;
import p193Hf.C3308G0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4141u3;
import p229J0.C3949M0;
import p229J0.C4042e0;
import p229J0.C4135t3;
import p291Lf.AbstractC5018o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.C6207k;
import p406Qg.C6702M;
import p437Rn.C6959q;
import p478Tc.AbstractC7311o;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p482Tg.C7443a0;
import p492U1.EnumC7546k;
import p523V9.AbstractC8042a0;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8634g;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9200R2;
import p586Y0.C9566r;
import p623Zf.C10312h;
import p623Zf.C10324t;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p690cp.AbstractC12935u;
import p729ej.C13421l;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13490h;
import p736f0.C13493k;
import p736f0.C13502t;
import p752fg.C13642a;
import p758g0.C13771k0;
import p774h1.C14365u;
import p870le.C16883h;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17767k0;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p923oc.C18064t;
import p926of.C18174k;
import p946pc.C18320E;
import p949pj.C18428A;
import p988rc.C18918f;

/* JADX INFO: renamed from: Af.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C0488s extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1590Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1591Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1592o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f1593p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f1594q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f1595r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f1596s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488s(C0960M0 c0960m0, MessagesViewModel messagesViewModel, String str, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q) {
        super(2);
        this.f1590Y = 1;
        this.f1594q0 = c0960m0;
        this.f1595r0 = messagesViewModel;
        this.f1591Z = str;
        this.f1592o0 = interfaceC1436k;
        this.f1593p0 = interfaceC1439n;
        this.f1596s0 = interfaceC10459q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488s(InterfaceC1436k interfaceC1436k, C14111x0 c14111x0, C8870f c8870f, InterfaceC1426a interfaceC1426a, InterfaceC20904w interfaceC20904w, C2925c c2925c) {
        super(2);
        this.f1590Y = 6;
        this.f1592o0 = interfaceC1436k;
        this.f1594q0 = c14111x0;
        this.f1593p0 = c8870f;
        this.f1595r0 = interfaceC1426a;
        this.f1591Z = interfaceC20904w;
        this.f1596s0 = c2925c;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0376  */
    /* JADX WARN: Code duplicated, block: B:110:0x0381  */
    /* JADX WARN: Code duplicated, block: B:113:0x0393  */
    /* JADX WARN: Code duplicated, block: B:117:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:120:0x040f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0452  */
    /* JADX WARN: Code duplicated, block: B:127:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:130:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:133:0x051d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0525  */
    /* JADX WARN: Code duplicated, block: B:142:0x0545  */
    /* JADX WARN: Code duplicated, block: B:93:0x0323  */
    /* JADX WARN: Code duplicated, block: B:94:0x0327  */
    /* JADX WARN: Code duplicated, block: B:99:0x0342  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        boolean z6;
        InterfaceC17763i0 interfaceC17763i0;
        int i10;
        C17785t0 c17785t0;
        C8870f c8870f;
        boolean z10;
        InterfaceC1436k interfaceC1436k;
        InterfaceC5982V0 interfaceC5982V0;
        C10324t c10324t;
        C10456n c10456n;
        int i11;
        boolean zM6542f;
        Object objM6514H;
        boolean zM6542f2;
        Object objM6514H2;
        boolean zM6542f3;
        Object objM6514H3;
        Object objM6514H4;
        C10456n c10456n2 = C10456n.f30959Y;
        InterfaceC1426a interfaceC1426a = null;
        C5975S c5975s = C6013l.f19514a;
        Object obj3 = this.f1593p0;
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f1591Z;
        Object obj5 = this.f1595r0;
        Object obj6 = this.f1594q0;
        Object obj7 = this.f1592o0;
        Object obj8 = this.f1596s0;
        switch (this.f1590Y) {
            case 0:
                C10456n c10456n3 = c10456n2;
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23198c);
                    InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(AbstractC10842a.m11237o(AbstractC8479G.m9122c(AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n3, 1.0f), AbstractC0490u.f1600a), AbstractC8479G.m9124e(c6021p)), AbstractC0479j.f1555a, 0.0f, AbstractC0479j.f1556b, 0.0f, 10), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13380d);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, C10444b.f30943v0, c6021p, 0);
                    int i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(399065222);
                    ArrayList arrayList = (ArrayList) obj6;
                    Iterator it = arrayList.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        C18174k c18174k = (C18174k) next;
                        AbstractC17140a abstractC17140a = (AbstractC17140a) AbstractC0490u.f1601b.getValue();
                        C20416d c20416dM21079a = AbstractC20417e.m21079a(12);
                        InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(c10456n3, 1.0f);
                        c6021p.m6524S(-934077182);
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj3;
                        C1203z0 c1203z0 = (C1203z0) obj5;
                        Iterator it2 = it;
                        String str = (String) obj4;
                        C10456n c10456n4 = c10456n3;
                        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj8;
                        Object obj9 = obj3;
                        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj7;
                        boolean zM6542f4 = c6021p.m6542f(interfaceC1439n) | c6021p.m6542f(c1203z0) | c6021p.m6538d(i13) | c6021p.m6545h(arrayList) | c6021p.m6542f(str) | c6021p.m6542f(interfaceC5985X) | c6021p.m6542f(interfaceC1436k2);
                        Object objM6514H5 = c6021p.m6514H();
                        if (zM6542f4 || objM6514H5 == c5975s) {
                            objM6514H5 = new C0487r(interfaceC1439n, c1203z0, i13, arrayList, interfaceC1436k2, str, interfaceC5985X);
                            c6021p.m6537c0(objM6514H5);
                        }
                        c6021p.m6553p(false);
                        AbstractC5018o.m5646a(c18174k, (InterfaceC1426a) objM6514H5, interfaceC10459qM11243c, c20416dM21079a, 0.0f, abstractC17140a, null, c6021p, 384, 80);
                        it = it2;
                        i13 = i14;
                        c10456n3 = c10456n4;
                        obj3 = obj9;
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                return c17296c;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C0960M0 c0960m0 = (C0960M0) obj6;
                    boolean z11 = c0960m0.f2728c.size() > 1;
                    c6021p2.m6524S(-1988348124);
                    MessagesViewModel messagesViewModel = (MessagesViewModel) obj5;
                    String str2 = (String) obj4;
                    boolean zM6545h = c6021p2.m6545h(messagesViewModel) | c6021p2.m6542f(str2);
                    Object objM6514H6 = c6021p2.m6514H();
                    if (zM6545h || objM6514H6 == c5975s) {
                        z6 = false;
                        objM6514H6 = new C0493x(messagesViewModel, str2, 0);
                        c6021p2.m6537c0(objM6514H6);
                    } else {
                        z6 = false;
                    }
                    c6021p2.m6553p(z6);
                    AbstractC0454A.m1106b(c0960m0, z11, (InterfaceC1426a) objM6514H6, (InterfaceC1436k) obj7, (InterfaceC1439n) obj3, (InterfaceC10459q) obj8, c6021p2, 48);
                }
                return c17296c;
            case 2:
                List list = (List) obj;
                C18428A cameraProperties = (C18428A) obj2;
                AbstractC16544l.m18094g(list, MpoABj.QgZLdjmKFXp);
                AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C22205x((String) it3.next()));
                }
                C22177n0 c22177n0 = (C22177n0) obj6;
                C1313k.m2013a((C1313k) obj5, (C22195t0) obj4, c22177n0, (C13421l) obj8, c22177n0.f70234p0, (C2685e) obj7, cameraProperties, new C22090C(arrayList2, AbstractC22120R0.m22363j(c22177n0.f70232Z.f69986Y), AbstractC22121S.m22366c((InterfaceC22179o) obj3), EnumC22088B.f69817Z, null, null));
                return c17296c;
            case 3:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    Boolean bool = (Boolean) ((InterfaceC5985X) obj8).getValue();
                    bool.getClass();
                    AbstractC8223w5.m8850b(bool, null, null, null, "WebView", null, AbstractC8411c.m8969c(-109574241, c6021p3, new C3308G0((InterfaceC5985X) obj8, (InterfaceC5985X) obj6, (C3034b) obj3, (CanmoreViewModel) obj5, (InterfaceC5982V0) obj4, (InterfaceC5985X) obj7)), c6021p3, 1597440, 46);
                }
                return c17296c;
            case 4:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                    return c17296c;
                }
                EnumC7546k enumC7546k = (EnumC7546k) c6021p4.m6548k(AbstractC0187M0.f710l);
                InterfaceC17763i0 interfaceC17763i1 = (InterfaceC17763i0) obj6;
                InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11236n(c10456n2, AbstractC10842a.m11228f(interfaceC17763i1, enumC7546k), interfaceC17763i1.mo19475d(), AbstractC10842a.m11227e(interfaceC17763i1, enumC7546k), AbstractC7313q.f23196a).mo428M(AbstractC10844c.f32512c);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30947z0, c6021p4, 48);
                int i15 = c6021p4.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p4.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qMo428M);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p4.m6528W();
                if (c6021p4.f19563O) {
                    c6021p4.m6549l(c21696i2);
                } else {
                    c6021p4.m6543f0();
                }
                C21694h c21694h2 = C21698j.f68873f;
                C5997d.m6439Z(c21694h2, c6021p4, c17790wM19515a);
                C21694h c21694h3 = C21698j.f68872e;
                C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m2);
                C21694h c21694h4 = C21698j.f68874g;
                if (!c6021p4.f19563O) {
                    interfaceC17763i0 = interfaceC17763i1;
                    if (!AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i15))) {
                    }
                    C21694h c21694h5 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h5, c6021p4, interfaceC10459qM10923d2);
                    C17794y c17794y = C17794y.f56777a;
                    C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p4, 0);
                    i10 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p4, c10456n2);
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i2);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p4, c17781r0M19506b2);
                    C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m3);
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p4, i10, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p4, interfaceC10459qM10923d3);
                    c17785t0 = C17785t0.f56761a;
                    c8870f = (C8870f) c6021p4.m6548k(AbstractC8873i.f27157a);
                    c6021p4.m6524S(1990338334);
                    c6021p4.m6524S(1990337062);
                    if (c8870f.f27148a == EnumC21895B.f69419Z || ((Boolean) c6021p4.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c6021p4.m6553p(false);
                    interfaceC1436k = (InterfaceC1436k) obj7;
                    interfaceC5982V0 = (InterfaceC5982V0) obj5;
                    if (z10) {
                        c6021p4.m6524S(1990341998);
                        zM6542f2 = c6021p4.m6542f(interfaceC1436k);
                        objM6514H2 = c6021p4.m6514H();
                        if (zM6542f2 || objM6514H2 == c5975s) {
                            objM6514H2 = new C10312h(3, interfaceC1436k);
                            c6021p4.m6537c0(objM6514H2);
                        }
                        c6021p4.m6553p(false);
                        AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, null, false, null, null, AbstractC8411c.m8969c(93693803, c6021p4, new C2521k(interfaceC5982V0, 1)), c6021p4, 196608, 30);
                        c6021p4.m6524S(1990357580);
                        zM6542f3 = c6021p4.m6542f(interfaceC1436k);
                        objM6514H3 = c6021p4.m6514H();
                        if (zM6542f3 || objM6514H3 == c5975s) {
                            objM6514H3 = new C10312h(4, interfaceC1436k);
                            c6021p4.m6537c0(objM6514H3);
                        }
                        c6021p4.m6553p(false);
                        AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H3, null, false, null, null, AbstractC8411c.m8969c(1257113364, c6021p4, new C2521k(interfaceC5982V0, 2)), c6021p4, 196608, 30);
                        c6021p4.m6524S(1990371747);
                        objM6514H4 = c6021p4.m6514H();
                        if (objM6514H4 == c5975s) {
                            objM6514H4 = new C6207k((InterfaceC5985X) obj8, 24);
                            c6021p4.m6537c0(objM6514H4);
                        }
                        c6021p4.m6553p(false);
                        AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H4, null, false, null, null, AbstractC8411c.m8969c(227838515, c6021p4, new C2521k(interfaceC5982V0, 3)), c6021p4, 196614, 30);
                    }
                    c6021p4.m6553p(false);
                    c6021p4.m6524S(1990385415);
                    c10324t = (C10324t) obj3;
                    if (c10324t.f30641e) {
                        AbstractC17758g.m19482b(c6021p4, c17785t0.m19513a(c10456n2, 1.0f, true));
                        InterfaceC10459q interfaceC10459qMo428M2 = AbstractC10842a.m11233k(c10456n2, AbstractC7313q.f23199d).mo428M(new VerticalAlignElement());
                        C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                        C4042e0 c4042e0M4735d = AbstractC4048f0.m4735d((C3949M0) c6021p4.m6548k(AbstractC3959O0.f12302a));
                        c10456n = c10456n2;
                        C4042e0 c4042e0M4731a = c4042e0M4735d.m4731a(c4042e0M4735d.f12744a, ((C14365u) interfaceC5982V0.getValue()).f45062a, c4042e0M4735d.f12746c, c4042e0M4735d.f12747d);
                        c6021p4.m6524S(1990402079);
                        zM6542f = c6021p4.m6542f(interfaceC1436k);
                        objM6514H = c6021p4.m6514H();
                        if (zM6542f || objM6514H == c5975s) {
                            objM6514H = new C10312h(5, interfaceC1436k);
                            c6021p4.m6537c0(objM6514H);
                        }
                        c6021p4.m6553p(false);
                        AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, interfaceC10459qMo428M2, false, null, c4042e0M4731a, null, null, null, null, AbstractC11405e.f34437a, c6021p4, 805306368, 492);
                    } else {
                        c10456n = c10456n2;
                    }
                    c6021p4.m6553p(false);
                    c6021p4.m6553p(true);
                    C10456n c10456n5 = c10456n;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c17794y.m19544b(c10456n5, true), AbstractC7313q.f23202g, 0.0f, 2), 1.0f);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    i11 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11244d);
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i2);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p4, interfaceC21057KM19511e);
                    C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m4);
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p4, i11, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p4, interfaceC10459qM10923d4);
                    AbstractC8042a0.m8413a(((C13642a) obj4).f43093a, C10843b.f32509a.m11240a(c10456n5, C10444b.f30938q0), ((C14365u) interfaceC5982V0.getValue()).f45062a, ((C14365u) interfaceC5982V0.getValue()).f45062a, null, c6021p4, 0, 16);
                    c6021p4.m6553p(true);
                    AbstractC4034c4.m4725a(AbstractC10844c.m11257q(c10456n5, 0.0f, AbstractC7312p.f23194k, 1), AbstractC7311o.f23183a, 0L, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1573031988, c6021p4, new C0148y(c10324t, interfaceC1436k, interfaceC17763i0, 21)), c6021p4, 12582912, 124);
                    c6021p4.m6553p(true);
                    return c17296c;
                }
                interfaceC17763i0 = interfaceC17763i1;
                AbstractC0168G.m537z(i15, c6021p4, i15, c21694h4);
                C21694h c21694h6 = C21698j.f68871d;
                C5997d.m6439Z(c21694h6, c6021p4, interfaceC10459qM10923d2);
                C17794y c17794y2 = C17794y.f56777a;
                C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p4, 0);
                i10 = c6021p4.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p4.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p4, c10456n2);
                c6021p4.m6528W();
                if (c6021p4.f19563O) {
                    c6021p4.m6549l(c21696i2);
                } else {
                    c6021p4.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p4, c17781r0M19506b3);
                C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m5);
                if (c6021p4.f19563O) {
                    AbstractC0168G.m537z(i10, c6021p4, i10, c21694h4);
                } else {
                    AbstractC0168G.m537z(i10, c6021p4, i10, c21694h4);
                }
                C5997d.m6439Z(c21694h6, c6021p4, interfaceC10459qM10923d5);
                c17785t0 = C17785t0.f56761a;
                c8870f = (C8870f) c6021p4.m6548k(AbstractC8873i.f27157a);
                c6021p4.m6524S(1990338334);
                c6021p4.m6524S(1990337062);
                if (c8870f.f27148a == EnumC21895B.f69419Z) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                c6021p4.m6553p(false);
                interfaceC1436k = (InterfaceC1436k) obj7;
                interfaceC5982V0 = (InterfaceC5982V0) obj5;
                if (z10) {
                    c6021p4.m6524S(1990341998);
                    zM6542f2 = c6021p4.m6542f(interfaceC1436k);
                    objM6514H2 = c6021p4.m6514H();
                    if (zM6542f2) {
                        objM6514H2 = new C10312h(3, interfaceC1436k);
                        c6021p4.m6537c0(objM6514H2);
                    } else {
                        objM6514H2 = new C10312h(3, interfaceC1436k);
                        c6021p4.m6537c0(objM6514H2);
                    }
                    c6021p4.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, null, false, null, null, AbstractC8411c.m8969c(93693803, c6021p4, new C2521k(interfaceC5982V0, 1)), c6021p4, 196608, 30);
                    c6021p4.m6524S(1990357580);
                    zM6542f3 = c6021p4.m6542f(interfaceC1436k);
                    objM6514H3 = c6021p4.m6514H();
                    if (zM6542f3) {
                        objM6514H3 = new C10312h(4, interfaceC1436k);
                        c6021p4.m6537c0(objM6514H3);
                    } else {
                        objM6514H3 = new C10312h(4, interfaceC1436k);
                        c6021p4.m6537c0(objM6514H3);
                    }
                    c6021p4.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H3, null, false, null, null, AbstractC8411c.m8969c(1257113364, c6021p4, new C2521k(interfaceC5982V0, 2)), c6021p4, 196608, 30);
                    c6021p4.m6524S(1990371747);
                    objM6514H4 = c6021p4.m6514H();
                    if (objM6514H4 == c5975s) {
                        objM6514H4 = new C6207k((InterfaceC5985X) obj8, 24);
                        c6021p4.m6537c0(objM6514H4);
                    }
                    c6021p4.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H4, null, false, null, null, AbstractC8411c.m8969c(227838515, c6021p4, new C2521k(interfaceC5982V0, 3)), c6021p4, 196614, 30);
                }
                c6021p4.m6553p(false);
                c6021p4.m6524S(1990385415);
                c10324t = (C10324t) obj3;
                if (c10324t.f30641e) {
                    AbstractC17758g.m19482b(c6021p4, c17785t0.m19513a(c10456n2, 1.0f, true));
                    InterfaceC10459q interfaceC10459qMo428M3 = AbstractC10842a.m11233k(c10456n2, AbstractC7313q.f23199d).mo428M(new VerticalAlignElement());
                    C17767k0 c17767k1 = AbstractC4048f0.f12769a;
                    C4042e0 c4042e0M4735d2 = AbstractC4048f0.m4735d((C3949M0) c6021p4.m6548k(AbstractC3959O0.f12302a));
                    c10456n = c10456n2;
                    C4042e0 c4042e0M4731a2 = c4042e0M4735d2.m4731a(c4042e0M4735d2.f12744a, ((C14365u) interfaceC5982V0.getValue()).f45062a, c4042e0M4735d2.f12746c, c4042e0M4735d2.f12747d);
                    c6021p4.m6524S(1990402079);
                    zM6542f = c6021p4.m6542f(interfaceC1436k);
                    objM6514H = c6021p4.m6514H();
                    if (zM6542f) {
                        objM6514H = new C10312h(5, interfaceC1436k);
                        c6021p4.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C10312h(5, interfaceC1436k);
                        c6021p4.m6537c0(objM6514H);
                    }
                    c6021p4.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, interfaceC10459qMo428M3, false, null, c4042e0M4731a2, null, null, null, null, AbstractC11405e.f34437a, c6021p4, 805306368, 492);
                } else {
                    c10456n = c10456n2;
                }
                c6021p4.m6553p(false);
                c6021p4.m6553p(true);
                C10456n c10456n6 = c10456n;
                InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c17794y2.m19544b(c10456n6, true), AbstractC7313q.f23202g, 0.0f, 2), 1.0f);
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i11 = c6021p4.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p4.m6550m();
                InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11244d2);
                c6021p4.m6528W();
                if (c6021p4.f19563O) {
                    c6021p4.m6549l(c21696i2);
                } else {
                    c6021p4.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p4, interfaceC21057KM19511e2);
                C5997d.m6439Z(c21694h3, c6021p4, interfaceC6008i0M6550m6);
                if (c6021p4.f19563O) {
                    AbstractC0168G.m537z(i11, c6021p4, i11, c21694h4);
                } else {
                    AbstractC0168G.m537z(i11, c6021p4, i11, c21694h4);
                }
                C5997d.m6439Z(c21694h6, c6021p4, interfaceC10459qM10923d6);
                AbstractC8042a0.m8413a(((C13642a) obj4).f43093a, C10843b.f32509a.m11240a(c10456n6, C10444b.f30938q0), ((C14365u) interfaceC5982V0.getValue()).f45062a, ((C14365u) interfaceC5982V0.getValue()).f45062a, null, c6021p4, 0, 16);
                c6021p4.m6553p(true);
                AbstractC4034c4.m4725a(AbstractC10844c.m11257q(c10456n6, 0.0f, AbstractC7312p.f23194k, 1), AbstractC7311o.f23183a, 0L, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1573031988, c6021p4, new C0148y(c10324t, interfaceC1436k, interfaceC17763i0, 21)), c6021p4, 12582912, 124);
                c6021p4.m6553p(true);
                return c17296c;
            case 5:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    Object objM6514H7 = c6021p5.m6514H();
                    InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) obj7;
                    C13493k c13493k = (C13493k) obj5;
                    if (objM6514H7 == c5975s) {
                        objM6514H7 = (C13502t) interfaceC1436k3.invoke(c13493k);
                        c6021p5.m6537c0(objM6514H7);
                    }
                    C13502t c13502t = (C13502t) objM6514H7;
                    C13771k0 c13771k0 = (C13771k0) obj6;
                    Object objMo15006c = c13771k0.m15275f().mo15006c();
                    Object obj10 = this.f1593p0;
                    boolean zM6544g = c6021p5.m6544g(AbstractC16544l.m18089b(objMo15006c, obj10));
                    Object objM6514H8 = c6021p5.m6514H();
                    if (zM6544g || objM6514H8 == c5975s) {
                        objM6514H8 = AbstractC16544l.m18089b(c13771k0.m15275f().mo15006c(), obj10) ? C13468F.f42623b : ((C13502t) interfaceC1436k3.invoke(c13493k)).f42749b;
                        c6021p5.m6537c0(objM6514H8);
                    }
                    C13468F c13468f = (C13468F) objM6514H8;
                    Object objM6514H9 = c6021p5.m6514H();
                    C6002f0 c6002f0 = c13771k0.f43492d;
                    if (objM6514H9 == c5975s) {
                        objM6514H9 = new C13490h(AbstractC16544l.m18089b(obj10, c6002f0.getValue()));
                        c6021p5.m6537c0(objM6514H9);
                    }
                    C13490h c13490h = (C13490h) objM6514H9;
                    C13467E c13467e = c13502t.f42748a;
                    boolean zM6545h2 = c6021p5.m6545h(c13502t);
                    Object objM6514H10 = c6021p5.m6514H();
                    if (zM6545h2 || objM6514H10 == c5975s) {
                        objM6514H10 = new C0468O(c13502t, 25);
                        c6021p5.m6537c0(objM6514H10);
                    }
                    InterfaceC10459q interfaceC10459qM11316b = AbstractC10868a.m11316b(c10456n2, (InterfaceC1440o) objM6514H10);
                    c13490h.f42703Y.setValue(Boolean.valueOf(AbstractC16544l.m18089b(obj10, c6002f0.getValue())));
                    InterfaceC10459q interfaceC10459qMo428M4 = interfaceC10459qM11316b.mo428M(c13490h);
                    boolean zM6545h3 = c6021p5.m6545h(obj10);
                    Object objM6514H11 = c6021p5.m6514H();
                    if (zM6545h3 || objM6514H11 == c5975s) {
                        objM6514H11 = new C6702M(obj10, 2);
                        c6021p5.m6537c0(objM6514H11);
                    }
                    InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H11;
                    boolean zM6542f5 = c6021p5.m6542f(c13468f);
                    Object objM6514H12 = c6021p5.m6514H();
                    if (zM6542f5 || objM6514H12 == c5975s) {
                        objM6514H12 = new C7443a0(c13468f, 12);
                        c6021p5.m6537c0(objM6514H12);
                    }
                    AbstractC10831a.m11198a(c13771k0, interfaceC1436k4, interfaceC10459qMo428M4, c13467e, c13468f, (InterfaceC1439n) objM6514H12, AbstractC8411c.m8969c(-616195562, c6021p5, new C2497c((C9566r) obj4, obj10, c13493k, (C8410b) obj8, 6)), c6021p5, 12582912);
                }
                return c17296c;
            case 6:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    c6021p6.m6524S(-2138000986);
                    InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) obj7;
                    if (interfaceC1436k5 != null) {
                        c6021p6.m6524S(1264676281);
                        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
                        C2925c c2925c = (C2925c) obj8;
                        boolean zM6545h4 = c6021p6.m6545h(interfaceC20904w) | c6021p6.m6545h(c2925c) | c6021p6.m6545h(interfaceC1436k5);
                        Object objM6514H13 = c6021p6.m6514H();
                        if (zM6545h4 || objM6514H13 == c5975s) {
                            objM6514H13 = new C6959q(interfaceC20904w, c2925c, interfaceC1436k5, 20);
                            c6021p6.m6537c0(objM6514H13);
                        }
                        interfaceC1426a = (InterfaceC1426a) objM6514H13;
                        c6021p6.m6553p(false);
                    }
                    c6021p6.m6553p(false);
                    C14111x0 c14111x0 = (C14111x0) obj6;
                    if (c14111x0.f44384O) {
                        c6021p6.m6524S(-1853292034);
                        C0415f.m1025a(interfaceC1426a, c14111x0, null, null, c6021p6, 0);
                        c6021p6.m6553p(false);
                    } else {
                        c6021p6.m6524S(-1853127393);
                        AbstractC8634g.m9288b((C8870f) obj3, (InterfaceC1426a) obj5, interfaceC1426a, null, null, c6021p6, 8);
                        c6021p6.m6553p(false);
                    }
                }
                return c17296c;
            case 7:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    EnumC14057V0 enumC14057V0 = (EnumC14057V0) obj6;
                    AbstractC8223w5.m8850b(enumC14057V0, null, C16883h.f54213z0, null, "InputSendButton", null, AbstractC8411c.m8969c(-497736553, c6021p7, new C3308G0((InterfaceC17763i0) obj3, (InterfaceC1426a) obj5, (InterfaceC5982V0) obj4, (InterfaceC5982V0) obj8, enumC14057V0, (InterfaceC1436k) obj7)), c6021p7, 1597824, 42);
                }
                return c17296c;
            default:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    AbstractC12935u abstractC12935u = (AbstractC12935u) obj3;
                    AbstractC16544l.m18094g(abstractC12935u, "<this>");
                    c6021p8.m6525T(2031949787);
                    C18064t c18064tM9765b = AbstractC9200R2.m9765b(abstractC12935u, null, null);
                    c6021p8.m6553p(false);
                    C18918f c18918f = C18918f.f60363j;
                    AbstractC17563j.m19215c((C18320E) obj6, c18064tM9765b, (InterfaceC1441p) obj5, (InterfaceC1442q) obj4, (C18918f) obj7, (InterfaceC5985X) obj8, c6021p8, 229376);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488s(InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, C3034b c3034b, CanmoreViewModel canmoreViewModel, InterfaceC5982V0 interfaceC5982V0, InterfaceC5985X interfaceC5985X3) {
        super(2);
        this.f1590Y = 3;
        this.f1596s0 = interfaceC5985X;
        this.f1594q0 = interfaceC5985X2;
        this.f1593p0 = c3034b;
        this.f1595r0 = canmoreViewModel;
        this.f1591Z = interfaceC5982V0;
        this.f1592o0 = interfaceC5985X3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488s(C13771k0 c13771k0, Object obj, InterfaceC1436k interfaceC1436k, C13493k c13493k, C9566r c9566r, C8410b c8410b) {
        super(2);
        this.f1590Y = 5;
        this.f1594q0 = c13771k0;
        this.f1593p0 = obj;
        this.f1592o0 = interfaceC1436k;
        this.f1595r0 = c13493k;
        this.f1591Z = c9566r;
        this.f1596s0 = c8410b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0488s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(2);
        this.f1590Y = i10;
        this.f1594q0 = obj;
        this.f1593p0 = obj2;
        this.f1595r0 = obj3;
        this.f1591Z = obj4;
        this.f1596s0 = obj5;
        this.f1592o0 = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488s(InterfaceC17763i0 interfaceC17763i0, InterfaceC1436k interfaceC1436k, C10324t c10324t, InterfaceC5982V0 interfaceC5982V0, InterfaceC5985X interfaceC5985X, C13642a c13642a) {
        super(2);
        this.f1590Y = 4;
        this.f1594q0 = interfaceC17763i0;
        this.f1592o0 = interfaceC1436k;
        this.f1593p0 = c10324t;
        this.f1595r0 = interfaceC5982V0;
        this.f1596s0 = interfaceC5985X;
        this.f1591Z = c13642a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488s(C18320E c18320e, AbstractC12935u abstractC12935u, InterfaceC1441p interfaceC1441p, InterfaceC1442q interfaceC1442q, C18918f c18918f, InterfaceC5985X interfaceC5985X) {
        super(2);
        this.f1590Y = 8;
        this.f1594q0 = c18320e;
        this.f1593p0 = abstractC12935u;
        this.f1595r0 = interfaceC1441p;
        this.f1591Z = interfaceC1442q;
        this.f1592o0 = c18918f;
        this.f1596s0 = interfaceC5985X;
    }
}
