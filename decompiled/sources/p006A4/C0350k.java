package p006A4;

import androidx.compose.animation.AbstractC10832b;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.gestures.AbstractC10840a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.glance.appwidget.protobuf.C11043g0;
import com.openai.feature.interstitial.FeatureInterstitialViewModel;
import com.openai.feature.onboarding.LoginViewModel;
import com.openai.feature.voice.impl.VoiceModeViewModelImpl;
import com.openai.voice.VoiceModeViewModel;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p002A0.C0136m;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p017Af.C0477h;
import p040Bd.C0918F0;
import p040Bd.C0924G0;
import p042Bf.C1268j;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1825q0;
import p086D6.C1970n;
import p1000s0.C19408d;
import p103Dn.AbstractC2124C;
import p1048uo.AbstractC20405l;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.C21778h;
import p1155zi.C21987b0;
import p1155zi.EnumC21974X0;
import p1156zj.C22090C;
import p1156zj.C22153f0;
import p1156zj.C22195t0;
import p1156zj.C22205x;
import p1156zj.EnumC22088B;
import p1156zj.EnumC22094E;
import p124Ei.AbstractC2511g1;
import p124Ei.C2456I;
import p124Ei.C2484W0;
import p124Ei.C2527m;
import p124Ei.C2532n1;
import p140Fa.C2685e;
import p153Fn.C2925c;
import p172Gi.C3077j;
import p204I1.C3582M;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p284L7.C4957b;
import p294Li.AbstractC5094p;
import p302M0.AbstractC5253e;
import p321Mk.C5463a;
import p321Mk.C5466d;
import p321Mk.C5474l;
import p321Mk.C5485w;
import p321Mk.C5486x;
import p321Mk.C5487y;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p365Oi.C6256d;
import p467T1.C7199i;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p482Tg.C7448e;
import p492U1.C7536a;
import p492U1.EnumC7546k;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8033Y5;
import p523V9.AbstractC8112i6;
import p523V9.AbstractC8114j0;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8223w5;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8748z;
import p553Wh.C8870f;
import p562X0.C9013h;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p586Y0.C9566r;
import p623Zf.C10324t;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p658b5.C11238i;
import p676c7.C11682a;
import p722e8.C13298H;
import p729ej.C13421l;
import p743f7.InterfaceC13576b;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p809if.AbstractC14977b;
import p809if.C14981f;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p909nm.C17691y;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17790w;
import p949pj.C18428A;
import p953q0.C18558P;

/* JADX INFO: renamed from: A4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0350k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1211Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1212Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1213o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f1214p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f1215q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f1216r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0350k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(2);
        this.f1211Y = i10;
        this.f1212Z = obj;
        this.f1213o0 = obj2;
        this.f1214p0 = obj3;
        this.f1215q0 = obj4;
        this.f1216r0 = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0487  */
    /* JADX WARN: Code duplicated, block: B:111:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:116:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:117:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:121:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:123:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:129:0x0532  */
    /* JADX WARN: Code duplicated, block: B:237:0x049f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x049f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x049f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:35:0x0156  */
    /* JADX WARN: Code duplicated, block: B:36:0x015a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0175  */
    /* JADX WARN: Code duplicated, block: B:44:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x0281  */
    /* JADX WARN: Code duplicated, block: B:80:0x043b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0458  */
    /* JADX WARN: Code duplicated, block: B:86:0x0468  */
    /* JADX WARN: Code duplicated, block: B:88:0x046d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0472  */
    /* JADX WARN: Code duplicated, block: B:93:0x0478  */
    /* JADX WARN: Code duplicated, block: B:95:0x047d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0482  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        float f10;
        InterfaceC5985X interfaceC5985X;
        InterfaceC5985X interfaceC5985X2;
        float fFloatValue;
        float fFloatValue2;
        float f11;
        float f12;
        Iterator it;
        LinkedHashMap linkedHashMap;
        int iM15321h;
        int iM15318e;
        C5463a c5463a;
        Float fValueOf;
        float fFloatValue3;
        Float fValueOf2;
        float fFloatValue4;
        C5463a c5463a2;
        boolean z6;
        boolean z10;
        float f13;
        C0136m c0136m;
        float f14;
        C18558P c18558p;
        float f15;
        float f16;
        float f17;
        float f18;
        Object obj3;
        FeatureInterstitialViewModel featureInterstitialViewModel;
        boolean zM6542f;
        Object objM6514H;
        int i10;
        C14981f c14981f;
        C5984W0 c5984w0;
        InterfaceC5985X interfaceC5985X3;
        LoginViewModel loginViewModel;
        InterfaceC20904w interfaceC20904w;
        boolean zM6545h;
        Object objM6514H2;
        C5975S c5975s = C6013l.f19514a;
        C10456n c10456n = C10456n.f30959Y;
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f1214p0;
        Object obj5 = this.f1213o0;
        Object obj6 = this.f1216r0;
        Object obj7 = this.f1215q0;
        Object obj8 = this.f1212Z;
        switch (this.f1211Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                int i11 = 2;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C21778h c21778h = (C21778h) obj8;
                    C5997d.m6444c(c21778h, new C0146w((C9566r) obj4, c21778h, (C0355p) obj7, i11), c6021p);
                    AbstractC0357r.m991a(c21778h, (C9013h) obj5, AbstractC8411c.m8968b(-497631156, c6021p, new C0349j((C0354o) obj6, 0, c21778h)), c6021p, 456);
                }
                return c17296c;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23200e), C10444b.f30946y0, c6021p2, 0);
                    int i12 = c6021p2.f19564P;
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
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p2, i12, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                    c6021p2.m6524S(-2111716522);
                    C0924G0 c0924g0 = (C0924G0) obj8;
                    int i13 = 0;
                    for (Object obj9 : c0924g0.f2669d) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        C0918F0 c0918f0 = (C0918F0) obj9;
                        String str = c0918f0.f2652d;
                        c6021p2.m6524S(1766014848);
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj7;
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj6;
                        boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k) | c6021p2.m6545h(c0918f0) | c6021p2.m6542f(interfaceC1439n) | c6021p2.m6542f(c0924g0) | c6021p2.m6538d(i13);
                        Object objM6514H3 = c6021p2.m6514H();
                        if (zM6542f2 || objM6514H3 == c5975s) {
                            objM6514H3 = new C0477h(i13, 1, interfaceC1436k, c0918f0, interfaceC1439n, c0924g0);
                            c6021p2.m6537c0(objM6514H3);
                        }
                        c6021p2.m6553p(false);
                        AbstractC8114j0.m8613d((String) obj5, (String) obj4, c0918f0, str, AbstractC10842a.m11237o(AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H3, 7), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7), c6021p2, 512);
                        i13 = i14;
                    }
                    c6021p2.m6553p(false);
                    c6021p2.m6553p(true);
                }
                return c17296c;
            case 2:
                List absolutePaths = (List) obj;
                C18428A cameraProperties = (C18428A) obj2;
                AbstractC16544l.m18094g(absolutePaths, "absolutePaths");
                AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
                C22153f0 c22153f0 = (C22153f0) obj8;
                List list = c22153f0.f70040q0.f69822Y;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C22205x) it2.next()).f70393Y);
                }
                ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(absolutePaths, arrayList);
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayListM19361k0, 10));
                Iterator it3 = arrayListM19361k0.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C22205x((String) it3.next()));
                }
                C22090C c22090c = c22153f0.f70040q0;
                EnumC22094E side = c22090c.f69823Z;
                AbstractC16544l.m18094g(side, "side");
                String idClassKey = c22090c.f69824o0;
                AbstractC16544l.m18094g(idClassKey, "idClassKey");
                EnumC22088B captureMethod = c22090c.f69825p0;
                AbstractC16544l.m18094g(captureMethod, "captureMethod");
                C1313k.m2013a((C1313k) obj5, (C22195t0) obj4, c22153f0, (C13421l) obj7, c22153f0.f70039p0, (C2685e) obj6, cameraProperties, new C22090C(arrayList2, side, idClassKey, captureMethod, c22090c.f69826q0, c22090c.f69827r0));
                return c17296c;
            case 3:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C10449g c10449g = C10444b.f30947z0;
                    C0136m c0136m2 = AbstractC17770m.f56728e;
                    C10456n c10456n2 = C10456n.f30959Y;
                    float fM5662d = 1.0f;
                    InterfaceC10459q interfaceC10459qM11205a = AbstractC10832b.m11205a(AbstractC10840a.m11222h(AbstractC10844c.m11244d(c10456n2, 1.0f), (C19408d) obj8, EnumC16673F0.f53402Z, false, true, C11043g0.m12022d((C19408d) obj8, null, null, c6021p3, 0, 30), null, 36), AbstractC13758e.m15255t(600, 0, AbstractC13725A.f43289b, 2), 2);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c0136m2, c10449g, c6021p3, 54);
                    int i15 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11205a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p3, i15, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d2);
                    VoiceModeViewModel voiceModeViewModel = (VoiceModeViewModel) obj5;
                    C2484W0 c2484w0 = new C2484W0(voiceModeViewModel.f40343c, 0);
                    VoiceModeViewModelImpl voiceModeViewModelImpl = (VoiceModeViewModelImpl) voiceModeViewModel;
                    C2532n1 c2532n1 = (C2532n1) obj4;
                    boolean z11 = c2532n1.f7873E;
                    C6256d c6256d = (C6256d) obj7;
                    C6256d c6256d2 = z11 ? c6256d : voiceModeViewModelImpl.f39972F;
                    float f19 = AbstractC2511g1.f7806a;
                    C19408d c19408d = (C19408d) obj8;
                    if (z11) {
                        Iterator it4 = c2532n1.f7876H.iterator();
                        int i16 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i16 = -1;
                            } else if (!AbstractC8033Y5.m8383a((C3077j) it4.next())) {
                                i16++;
                            }
                        }
                        fM5662d = AbstractC5094p.m5662d(c19408d, i16);
                    } else {
                        C3077j c3077j = c2532n1.f7877I;
                        if (c3077j == null || !AbstractC8033Y5.m8383a(c3077j) || !c2532n1.f7881M) {
                            f10 = 0.0f;
                        }
                        float f20 = AbstractC2511g1.f7808c;
                        AbstractC8748z.m9500a(c2484w0, voiceModeViewModelImpl.f39973G, c6256d2, AbstractC10844c.m11255o(c10456n2, 0.0f, 0.0f, f20, f20, 3), 0L, false, c2532n1.f7886R, f10, c6021p3, 199680, 16);
                        AbstractC8223w5.m8850b(Boolean.valueOf(z11), null, C2527m.f7855w0, C10444b.f30938q0, "pager", null, AbstractC8411c.m8969c(-613021840, c6021p3, new C2456I(c2532n1, c6256d, c19408d, (InterfaceC1436k) obj6)), c6021p3, 1600896, 34);
                        c6021p3.m6553p(true);
                    }
                    f10 = fM5662d;
                    float f21 = AbstractC2511g1.f7808c;
                    AbstractC8748z.m9500a(c2484w0, voiceModeViewModelImpl.f39973G, c6256d2, AbstractC10844c.m11255o(c10456n2, 0.0f, 0.0f, f21, f21, 3), 0L, false, c2532n1.f7886R, f10, c6021p3, 199680, 16);
                    AbstractC8223w5.m8850b(Boolean.valueOf(z11), null, C2527m.f7855w0, C10444b.f30938q0, "pager", null, AbstractC8411c.m8969c(-613021840, c6021p3, new C2456I(c2532n1, c6256d, c19408d, (InterfaceC1436k) obj6)), c6021p3, 1600896, 34);
                    c6021p3.m6553p(true);
                }
                return c17296c;
            case 4:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3914G1.m4612b((C8410b) obj8, (C8410b) obj5, (C8410b) obj4, (C8410b) obj7, (C8410b) obj6, c6021p4, 384);
                }
                return c17296c;
            case 5:
                C11682a datadogContext = (C11682a) obj;
                InterfaceC13576b eventBatchWriter = (InterfaceC13576b) obj2;
                AbstractC16544l.m18094g(datadogContext, "datadogContext");
                AbstractC16544l.m18094g(eventBatchWriter, "eventBatchWriter");
                C4957b c4957b = (C4957b) obj8;
                C15358g1 c15358g1 = c4957b.f16176r0;
                String name = Thread.currentThread().getName();
                C17691y c17691y = C17691y.f56482Y;
                long jLongValue = ((Long) obj7).longValue();
                AbstractC16544l.m18093f(name, "name");
                c4957b.f16173o0.mo12662a(eventBatchWriter, c15358g1.m16582j(2, (String) obj5, null, (LinkedHashMap) obj4, c17691y, jLongValue, name, datadogContext, true, (String) obj6, false, true, (28672 & 4096) != 0 ? null : null, (28672 & 8192) != 0 ? null : null, C17689w.f56480Y), 1);
                return c17296c;
            case 6:
                C18558P LazyLayout = (C18558P) obj;
                long j10 = ((C7536a) obj2).f23888a;
                AbstractC16544l.m18094g(LazyLayout, "$this$LazyLayout");
                long jM8603a = AbstractC8112i6.m8603a(C7536a.m7854i(j10), C7536a.m7853h(j10));
                InterfaceC5985X interfaceC5985X4 = (InterfaceC5985X) obj6;
                C5474l c5474l = (C5474l) interfaceC5985X4.getValue();
                EnumC7546k layoutDirection = LazyLayout.f59128Z.getLayoutDirection();
                C13801c c13801c = (C13801c) obj4;
                C5466d c5466d = (C5466d) obj5;
                float f22 = c13801c.f43589d;
                float f23 = c13801c.f43588c;
                float f24 = c13801c.f43587b;
                float f25 = c13801c.f43586a;
                long j11 = c5466d.f17851c;
                Map map = c5466d.f17850b;
                C11238i c11238i = (C11238i) obj8;
                if (c5474l != null && AbstractC16544l.m18089b(c5474l.f17878a, map) && c5474l.f17879b == layoutDirection) {
                    interfaceC5985X = interfaceC5985X4;
                    if (C13803e.m15330b(c5474l.f17880c, jM8603a)) {
                        interfaceC5985X2 = interfaceC5985X;
                        j11 = j11;
                    }
                    interfaceC5985X2.setValue(c5474l);
                    fFloatValue = ((Number) c11238i.m12567m0().m15224e()).floatValue();
                    fFloatValue2 = ((Number) c11238i.m12568n0().m15224e()).floatValue();
                    f11 = fFloatValue - f25;
                    f12 = fFloatValue2 - f24;
                    float fM15333e = C13803e.m15333e(jM8603a) + f11;
                    float fM15331c = C13803e.m15331c(jM8603a) + f12;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        c5463a2 = (C5463a) entry.getValue();
                        z6 = c5463a2.f17843f;
                        Iterator it5 = it;
                        z10 = c5463a2.f17842e;
                        if (z6 || !z10) {
                            f13 = f22;
                            c0136m = c5463a2.f17840c;
                            f14 = f23;
                            C0136m c0136m3 = c5463a2.f17841d;
                            c18558p = LazyLayout;
                            f15 = c5463a2.f17839b;
                            f16 = c0136m3.f570b;
                            if (!z10) {
                                f17 = c5463a2.f17838a;
                                f18 = c0136m.f570b;
                                if (z6) {
                                    if (f18 + f17 > f11 || f17 >= fM15333e) {
                                    }
                                } else if (f18 + f17 > f11 || f17 >= fM15333e || f16 + f15 <= f12 || f15 >= fM15331c) {
                                }
                            } else if (f16 + f15 > f12 || f15 >= fM15331c) {
                            }
                            it = it5;
                            f22 = f13;
                            f23 = f14;
                            LazyLayout = c18558p;
                        } else {
                            c18558p = LazyLayout;
                            f13 = f22;
                            f14 = f23;
                        }
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                        it = it5;
                        f22 = f13;
                        f23 = f14;
                        LazyLayout = c18558p;
                    }
                    C18558P c18558p2 = LazyLayout;
                    float f26 = f22;
                    float f27 = f23;
                    linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        c5463a = (C5463a) entry2.getValue();
                        fValueOf = Float.valueOf(fFloatValue);
                        if (c5463a.f17842e) {
                            fValueOf = null;
                        }
                        if (fValueOf != null) {
                            fFloatValue3 = fValueOf.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        fValueOf2 = Float.valueOf(fFloatValue2);
                        if (c5463a.f17843f) {
                            fValueOf2 = null;
                        }
                        if (fValueOf2 != null) {
                            fFloatValue4 = fValueOf2.floatValue();
                        } else {
                            fFloatValue4 = 0.0f;
                        }
                        float f28 = (c5463a.f17838a - fFloatValue3) + f25;
                        float f29 = (c5463a.f17839b - fFloatValue4) + f24;
                        linkedHashMap.put(key, new C13801c(f28, f29, c5463a.f17840c.f570b + f28, c5463a.f17841d.f570b + f29));
                    }
                    ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry3.getKey()).intValue();
                        C13801c c13801c2 = (C13801c) entry3.getValue();
                        iM15321h = (int) c13801c2.m15321h();
                        iM15318e = (int) c13801c2.m15318e();
                        if (iM15321h >= 0 || iM15318e < 0) {
                            AbstractC9406z4.m9983b("width(" + iM15321h + ") and height(" + iM15318e + ") must be >= 0");
                            throw null;
                        }
                        C18558P c18558p3 = c18558p2;
                        arrayList3.add(new C17309l(c18558p3.m19938a(iIntValue, AbstractC9388w4.m9966i(iM15321h, iM15321h, iM15318e, iM15318e)), new C13800b(c13801c2.m15320g())));
                        c18558p2 = c18558p3;
                    }
                    long jM8603a2 = AbstractC8112i6.m8603a(C13803e.m15333e(j11) + f25 + f27, C13803e.m15331c(j11) + f24 + f26);
                    return c18558p2.mo19936R(Math.min((int) C13803e.m15333e(jM8603a2), C7536a.m7854i(j10)), Math.min((int) C13803e.m15331c(jM8603a2), C7536a.m7853h(j10)), C17690x.f56481Y, new C1825q0(2, arrayList3));
                }
                interfaceC5985X = interfaceC5985X4;
                C5474l c5474l2 = new C5474l(map, layoutDirection, jM8603a);
                long jM8603a3 = AbstractC8112i6.m8603a(C13803e.m15333e(j11) + f25 + f23, C13803e.m15331c(j11) + f24 + f22);
                float fM8915f = AbstractC8301I.m8915f(C13803e.m15333e(jM8603a3) - C13803e.m15333e(jM8603a), 0.0f);
                float fM8915f2 = AbstractC8301I.m8915f(C13803e.m15331c(jM8603a3) - C13803e.m15331c(jM8603a), 0.0f);
                c11238i.getClass();
                C2925c c2925c = (C2925c) obj7;
                if (((C13756d) c11238i.f34009Z) == null && ((C13756d) c11238i.f34010o0) == null) {
                    long j12 = ((C13800b) ((InterfaceC1436k) c11238i.f34008Y).invoke(c5474l2)).f43584a;
                    float fM15306g = C13800b.m15306g(j12);
                    float fM15307h = C13800b.m15307h(j12);
                    c11238i.f34009Z = AbstractC13758e.m15236a(fM15306g);
                    c11238i.f34010o0 = AbstractC13758e.m15236a(fM15307h);
                    AbstractC2124C.m3226y(new C1970n(C5997d.m6441a0(new C5485w(c11238i, 0)), 5, new C5486x(c11238i, jM8603a, null)), c2925c);
                    AbstractC2124C.m3226y(new C1970n(C5997d.m6441a0(new C5485w(c11238i, 1)), 5, new C5487y(c11238i, jM8603a, null)), c2925c);
                }
                c11238i.m12567m0().m15228i(Float.valueOf(0.0f), Float.valueOf(fM8915f));
                c11238i.m12568n0().m15228i(Float.valueOf(0.0f), Float.valueOf(fM8915f2));
                c11238i.m12543J0(jM8603a);
                interfaceC5985X2 = interfaceC5985X;
                c5474l = c5474l2;
                interfaceC5985X2.setValue(c5474l);
                fFloatValue = ((Number) c11238i.m12567m0().m15224e()).floatValue();
                fFloatValue2 = ((Number) c11238i.m12568n0().m15224e()).floatValue();
                f11 = fFloatValue - f25;
                f12 = fFloatValue2 - f24;
                float fM15333e2 = C13803e.m15333e(jM8603a) + f11;
                float fM15331c2 = C13803e.m15331c(jM8603a) + f12;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it.next();
                    c5463a2 = (C5463a) entry4.getValue();
                    z6 = c5463a2.f17843f;
                    Iterator it6 = it;
                    z10 = c5463a2.f17842e;
                    if (z6) {
                        f13 = f22;
                        c0136m = c5463a2.f17840c;
                        f14 = f23;
                        C0136m c0136m4 = c5463a2.f17841d;
                        c18558p = LazyLayout;
                        f15 = c5463a2.f17839b;
                        f16 = c0136m4.f570b;
                        if (!z10) {
                            f17 = c5463a2.f17838a;
                            f18 = c0136m.f570b;
                            if (z6) {
                                if (f18 + f17 > f11) {
                                }
                            } else if (f18 + f17 > f11) {
                            }
                        } else if (f16 + f15 > f12) {
                        }
                    } else {
                        f13 = f22;
                        c0136m = c5463a2.f17840c;
                        f14 = f23;
                        C0136m c0136m5 = c5463a2.f17841d;
                        c18558p = LazyLayout;
                        f15 = c5463a2.f17839b;
                        f16 = c0136m5.f570b;
                        if (!z10) {
                            f17 = c5463a2.f17838a;
                            f18 = c0136m.f570b;
                            if (z6) {
                                if (f18 + f17 > f11) {
                                }
                            } else if (f18 + f17 > f11) {
                            }
                        } else if (f16 + f15 > f12) {
                        }
                    }
                    it = it6;
                    f22 = f13;
                    f23 = f14;
                    LazyLayout = c18558p;
                }
                C18558P c18558p4 = LazyLayout;
                float f210 = f22;
                float f211 = f23;
                linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap3.size()));
                while (r2.hasNext()) {
                    Object key2 = entry2.getKey();
                    c5463a = (C5463a) entry2.getValue();
                    fValueOf = Float.valueOf(fFloatValue);
                    if (c5463a.f17842e) {
                        fValueOf = null;
                    }
                    if (fValueOf != null) {
                        fFloatValue3 = fValueOf.floatValue();
                    } else {
                        fFloatValue3 = 0.0f;
                    }
                    fValueOf2 = Float.valueOf(fFloatValue2);
                    if (c5463a.f17843f) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue4 = fValueOf2.floatValue();
                    } else {
                        fFloatValue4 = 0.0f;
                    }
                    float f212 = (c5463a.f17838a - fFloatValue3) + f25;
                    float f213 = (c5463a.f17839b - fFloatValue4) + f24;
                    linkedHashMap.put(key2, new C13801c(f212, f213, c5463a.f17840c.f570b + f212, c5463a.f17841d.f570b + f213));
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                while (r0.hasNext()) {
                    int iIntValue2 = ((Number) entry3.getKey()).intValue();
                    C13801c c13801c3 = (C13801c) entry3.getValue();
                    iM15321h = (int) c13801c3.m15321h();
                    iM15318e = (int) c13801c3.m15318e();
                    if (iM15321h >= 0) {
                    }
                    AbstractC9406z4.m9983b("width(" + iM15321h + ") and height(" + iM15318e + ") must be >= 0");
                    throw null;
                }
                long jM8603a4 = AbstractC8112i6.m8603a(C13803e.m15333e(j11) + f25 + f211, C13803e.m15331c(j11) + f24 + f210);
                return c18558p4.mo19936R(Math.min((int) C13803e.m15333e(jM8603a4), C7536a.m7854i(j10)), Math.min((int) C13803e.m15331c(jM8603a4), C7536a.m7853h(j10)), C17690x.f56481Y, new C1825q0(2, arrayList4));
            case 7:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC8018W4.m8341a((C21987b0) obj8, (C8870f) obj5, (InterfaceC1426a) obj4, (InterfaceC1426a) obj7, (InterfaceC1426a) obj6, c6021p5, 64);
                }
                return c17296c;
            case 8:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                    return c17296c;
                }
                float f30 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10456n, f30);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30936o0, false);
                int i17 = c6021p6.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p6.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p6, interfaceC10459qM11233k);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i3 = C21698j.f68869b;
                c6021p6.m6528W();
                if (c6021p6.f19563O) {
                    c6021p6.m6549l(c21696i3);
                } else {
                    c6021p6.m6543f0();
                }
                C21694h c21694h3 = C21698j.f68873f;
                C5997d.m6439Z(c21694h3, c6021p6, interfaceC21057KM19511e);
                C21694h c21694h4 = C21698j.f68872e;
                C5997d.m6439Z(c21694h4, c6021p6, interfaceC6008i0M6550m3);
                C21694h c21694h5 = C21698j.f68874g;
                if (!c6021p6.f19563O) {
                    obj3 = obj7;
                    if (!AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i17))) {
                    }
                    C21694h c21694h6 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h6, c6021p6, interfaceC10459qM10923d3);
                    c6021p6.m6524S(-1675563741);
                    featureInterstitialViewModel = (FeatureInterstitialViewModel) obj8;
                    zM6542f = c6021p6.m6542f(featureInterstitialViewModel);
                    objM6514H = c6021p6.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        objM6514H = new C13298H(featureInterstitialViewModel, 17);
                        c6021p6.m6537c0(objM6514H);
                    }
                    c6021p6.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H, null, false, null, null, AbstractC14977b.f46635a, c6021p6, 196608, 30);
                    c6021p6.m6553p(true);
                    C10449g c10449g2 = C10444b.f30947z0;
                    InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23201f), 0.0f, AbstractC7313q.f23207l, 0.0f, 0.0f, 13);
                    C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g2, c6021p6, 48);
                    i10 = c6021p6.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p6.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p6, interfaceC10459qM11237o);
                    c6021p6.m6528W();
                    if (c6021p6.f19563O) {
                        c6021p6.m6549l(c21696i3);
                    } else {
                        c6021p6.m6543f0();
                    }
                    C5997d.m6439Z(c21694h3, c6021p6, c17790wM19515a3);
                    C5997d.m6439Z(c21694h4, c6021p6, interfaceC6008i0M6550m4);
                    if (c6021p6.f19563O || !AbstractC16544l.m18089b(c6021p6.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p6, i10, c21694h5);
                    }
                    C5997d.m6439Z(c21694h6, c6021p6, interfaceC10459qM10923d4);
                    c14981f = (C14981f) obj5;
                    String strM8676d = AbstractC8142m4.m8676d(c14981f.f46639a, c6021p6);
                    c5984w0 = AbstractC3947L4.f12183a;
                    AbstractC4124r4.m4768b(strM8676d, null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, C3582M.m4274b(((C3941K4) c6021p6.m6548k(c5984w0)).f12148d, ((C3949M0) c6021p6.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC9119D4.m9650c(24), null, null, 0L, null, 0, 0, 0L, null, null, 16777212), c6021p6, 0, 0, 65022);
                    c6021p6.m6524S(-1675535838);
                    interfaceC5985X3 = (InterfaceC5985X) obj6;
                    if (((EnumC21974X0) interfaceC5985X3.getValue()).f69566Z) {
                        AbstractC17758g.m19482b(c6021p6, AbstractC10844c.m11245e(c10456n, f30));
                        AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(c14981f.f46640b, c6021p6), null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p6.m6548k(c5984w0)).f12154j, c6021p6, 0, 0, 65022);
                    }
                    c6021p6.m6553p(false);
                    AbstractC17758g.m19482b(c6021p6, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23203h));
                    loginViewModel = (LoginViewModel) obj4;
                    C10324t c10324t = (C10324t) AbstractC9112C3.m9642d(loginViewModel.f40343c, c6021p6).getValue();
                    c6021p6.m6524S(-1675519496);
                    interfaceC20904w = (InterfaceC20904w) obj3;
                    zM6545h = c6021p6.m6545h(interfaceC20904w) | c6021p6.m6542f(interfaceC5985X3) | c6021p6.m6545h(loginViewModel);
                    objM6514H2 = c6021p6.m6514H();
                    if (zM6545h || objM6514H2 == c5975s) {
                        objM6514H2 = new C7448e(interfaceC20904w, loginViewModel, interfaceC5985X3, 26);
                        c6021p6.m6537c0(objM6514H2);
                    }
                    c6021p6.m6553p(false);
                    AbstractC20405l.m21070a(c10324t, (InterfaceC1436k) objM6514H2, null, false, c6021p6, 3080, 4);
                    c6021p6.m6553p(true);
                    return c17296c;
                }
                obj3 = obj7;
                AbstractC0168G.m537z(i17, c6021p6, i17, c21694h5);
                C21694h c21694h7 = C21698j.f68871d;
                C5997d.m6439Z(c21694h7, c6021p6, interfaceC10459qM10923d3);
                c6021p6.m6524S(-1675563741);
                featureInterstitialViewModel = (FeatureInterstitialViewModel) obj8;
                zM6542f = c6021p6.m6542f(featureInterstitialViewModel);
                objM6514H = c6021p6.m6514H();
                if (zM6542f) {
                    objM6514H = new C13298H(featureInterstitialViewModel, 17);
                    c6021p6.m6537c0(objM6514H);
                } else {
                    objM6514H = new C13298H(featureInterstitialViewModel, 17);
                    c6021p6.m6537c0(objM6514H);
                }
                c6021p6.m6553p(false);
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H, null, false, null, null, AbstractC14977b.f46635a, c6021p6, 196608, 30);
                c6021p6.m6553p(true);
                C10449g c10449g3 = C10444b.f30947z0;
                InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23201f), 0.0f, AbstractC7313q.f23207l, 0.0f, 0.0f, 13);
                C17790w c17790wM19515a4 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g3, c6021p6, 48);
                i10 = c6021p6.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p6.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p6, interfaceC10459qM11237o2);
                c6021p6.m6528W();
                if (c6021p6.f19563O) {
                    c6021p6.m6549l(c21696i3);
                } else {
                    c6021p6.m6543f0();
                }
                C5997d.m6439Z(c21694h3, c6021p6, c17790wM19515a4);
                C5997d.m6439Z(c21694h4, c6021p6, interfaceC6008i0M6550m5);
                if (c6021p6.f19563O) {
                    AbstractC0168G.m537z(i10, c6021p6, i10, c21694h5);
                } else {
                    AbstractC0168G.m537z(i10, c6021p6, i10, c21694h5);
                }
                C5997d.m6439Z(c21694h7, c6021p6, interfaceC10459qM10923d5);
                c14981f = (C14981f) obj5;
                String strM8676d2 = AbstractC8142m4.m8676d(c14981f.f46639a, c6021p6);
                c5984w0 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(strM8676d2, null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, C3582M.m4274b(((C3941K4) c6021p6.m6548k(c5984w0)).f12148d, ((C3949M0) c6021p6.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC9119D4.m9650c(24), null, null, 0L, null, 0, 0, 0L, null, null, 16777212), c6021p6, 0, 0, 65022);
                c6021p6.m6524S(-1675535838);
                interfaceC5985X3 = (InterfaceC5985X) obj6;
                if (((EnumC21974X0) interfaceC5985X3.getValue()).f69566Z) {
                    AbstractC17758g.m19482b(c6021p6, AbstractC10844c.m11245e(c10456n, f30));
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(c14981f.f46640b, c6021p6), null, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p6.m6548k(c5984w0)).f12154j, c6021p6, 0, 0, 65022);
                }
                c6021p6.m6553p(false);
                AbstractC17758g.m19482b(c6021p6, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23203h));
                loginViewModel = (LoginViewModel) obj4;
                C10324t c10324t2 = (C10324t) AbstractC9112C3.m9642d(loginViewModel.f40343c, c6021p6).getValue();
                c6021p6.m6524S(-1675519496);
                interfaceC20904w = (InterfaceC20904w) obj3;
                zM6545h = c6021p6.m6545h(interfaceC20904w) | c6021p6.m6542f(interfaceC5985X3) | c6021p6.m6545h(loginViewModel);
                objM6514H2 = c6021p6.m6514H();
                if (zM6545h) {
                    objM6514H2 = new C7448e(interfaceC20904w, loginViewModel, interfaceC5985X3, 26);
                    c6021p6.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C7448e(interfaceC20904w, loginViewModel, interfaceC5985X3, 26);
                    c6021p6.m6537c0(objM6514H2);
                }
                c6021p6.m6553p(false);
                AbstractC20405l.m21070a(c10324t2, (InterfaceC1436k) objM6514H2, null, false, c6021p6, 3080, 4);
                c6021p6.m6553p(true);
                return c17296c;
            default:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11256p((InterfaceC10459q) obj8, AbstractC7312p.f23193j), AbstractC7313q.f23201f, 0.0f, 2);
                    float f31 = AbstractC4017a.f12601a;
                    AbstractC4034c4.m4725a(interfaceC10459qM11235m, AbstractC4141u3.m4770a(AbstractC5253e.f17195a, c6021p7), 0L, 0L, AbstractC7306j.f23147e, 0.0f, null, AbstractC8411c.m8969c(2105878604, c6021p7, new C1268j((InterfaceC5985X) obj5, (InterfaceC1426a) obj4, (InterfaceC1436k) obj7, (String) obj6)), c6021p7, 12582912, 108);
                }
                return c17296c;
        }
    }
}
