package p002A0;

import android.content.Context;
import android.webkit.WebSettings;
import cd.C11709i;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16557y;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$SimulcastCodec;
import mm.C17296C;
import mm.C17309l;
import mo.C17327D;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import p003A1.InterfaceC0309z1;
import p006A4.C0348i;
import p006A4.C0355p;
import p008A6.C0386f;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p040Bd.C0958L4;
import p042Bf.C1278t;
import p045Bj.C1307e;
import p046Bk.AbstractC1405r0;
import p046Bk.C1314A;
import p046Bk.C1316B;
import p046Bk.C1360X0;
import p046Bk.C1363Z;
import p046Bk.C1375d0;
import p046Bk.C1383g0;
import p046Bk.C1385h0;
import p046Bk.C1401p0;
import p046Bk.C1407s0;
import p046Bk.C1411u0;
import p046Bk.C1413v0;
import p046Bk.InterfaceC1318C;
import p046Bk.InterfaceC1389j0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p074Ck.C1716a;
import p080D0.AbstractC1783Q;
import p080D0.C1814l;
import p080D0.C1820o;
import p080D0.C1824q;
import p102Dm.AbstractC2119a;
import p1044uj.AbstractC20321X;
import p1044uj.C20319V;
import p1071w0.EnumC20729S;
import p1081wc.C20883b0;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1139z0.AbstractC21627m;
import p1139z0.C21574A0;
import p1139z0.C21616g0;
import p1143z4.C21778h;
import p1156zj.AbstractC22120R0;
import p1156zj.AbstractC22180o0;
import p1156zj.AbstractC22208y0;
import p1156zj.C22090C;
import p1156zj.C22153f0;
import p1156zj.C22177n0;
import p1156zj.C22204w0;
import p1156zj.InterfaceC22179o;
import p124Ei.C2450F;
import p124Ei.C2456I;
import p124Ei.C2529m1;
import p124Ei.C2532n1;
import p124Ei.C2536p0;
import p147Fh.C2746c;
import p147Fh.C2747d;
import p147Fh.C2749f;
import p147Fh.C2751h;
import p153Fn.C2925c;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p193Hf.AbstractC3409v;
import p193Hf.C3355d;
import p193Hf.C3370i;
import p193Hf.C3388o;
import p195Hh.C3430e;
import p225Im.InterfaceC3776x;
import p229J0.C3880A3;
import p229J0.C3899D4;
import p229J0.C3935J4;
import p229J0.C4086l2;
import p229J0.C4098n2;
import p229J0.C4171z3;
import p247Jj.AbstractC4379E;
import p247Jj.AbstractC4402P0;
import p247Jj.AbstractC4433h0;
import p247Jj.C4390J0;
import p247Jj.C4398N0;
import p247Jj.C4400O0;
import p247Jj.C4417Z;
import p247Jj.C4421b0;
import p247Jj.C4425d0;
import p247Jj.C4431g0;
import p247Jj.C4439k0;
import p270Ki.C4700a;
import p278L0.C4848L;
import p278L0.C4897x;
import p344Nl.C5828J;
import p344Nl.C5832d;
import p349O0.C5944C;
import p349O0.C5950F;
import p349O0.InterfaceC5985X;
import p360Od.C6172d;
import p387Pl.C6460G;
import p387Pl.C6501u;
import p387Pl.EnumC6464K;
import p409Qk.C6753d;
import p470T4.AbstractC7255t;
import p492U1.C7543h;
import p507Uh.C7681g;
import p507Uh.InterfaceC7678d;
import p509Uk.C7709b;
import p523V9.AbstractC8056b6;
import p523V9.AbstractC8215v5;
import p537W0.C8410b;
import p544W9.AbstractC8681n4;
import p571X9.AbstractC9112C3;
import p586Y0.C9566r;
import p594Y9.AbstractC9842Z;
import p636a2.C10468e;
import p636a2.C10469f;
import p636a2.C10470g;
import p647ak.AbstractC10740y0;
import p647ak.C10736w0;
import p692d0.C12985x;
import p729ej.C13430u;
import p754fl.C13693c;
import p758g0.C13770k;
import p759g1.C13800b;
import p793ho.C14573E3;
import p793ho.C14769j4;
import p793ho.EnumC14686X2;
import p823j3.C16084f;
import p857kl.C16447N;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p911o0.AbstractC17792x;
import p936p0.C18265e;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19240z1;
import ro.C19261e;

/* JADX INFO: renamed from: A0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0146w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f605Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f606Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f607o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f608p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0146w(Serializable serializable, C0120T c0120t, Serializable serializable2, int i10) {
        super(1);
        this.f605Y = i10;
        this.f607o0 = serializable;
        this.f606Z = c0120t;
        this.f608p0 = serializable2;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        final int i10 = 0;
        final int i11 = 1;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f606Z;
        ?? r12 = this.f608p0;
        Object obj3 = this.f607o0;
        switch (this.f605Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                C0120T c0120t = (C0120T) obj2;
                C16524A c16524a = (C16524A) obj3;
                c16524a.f51261Y = AbstractC1783Q.m2572a(c0120t.m407l().m15316c());
                ((C16524A) r12).f51261Y = 0L;
                c0120t.f509k.setValue(Boolean.TRUE);
                InterfaceC21098s interfaceC21098sM412q = c0120t.m412q();
                c0120t.f511m.setValue(new C13800b(interfaceC21098sM412q != null ? interfaceC21098sM412q.mo21520d(0L) : 9205357640488583168L));
                c0120t.m420y(EnumC20729S.f65724Y, c16524a.f51261Y);
                return c17296c;
            case 1:
                long j11 = ((C13800b) obj).f43584a;
                ((C16084f) obj3).invoke();
                C0120T c0120t2 = (C0120T) obj2;
                if (c0120t2.f502d && c0120t2.f504f) {
                    if (!c0120t2.f503e) {
                        ((C21616g0) r12).invoke();
                        if (c0120t2.f499a.m21881c().f67817Y.length() > 0) {
                            c0120t2.m418w(true);
                        }
                    }
                    c0120t2.m419x(EnumC0123W.f526Y);
                    C21574A0 c21574a0 = c0120t2.f500b;
                    C0120T.m398c(c0120t2, AbstractC21627m.m21966n(c21574a0, c21574a0.m21848a(j11)));
                }
                return c17296c;
            case 2:
                C21778h c21778h = (C21778h) r12;
                C9566r c9566r = (C9566r) obj3;
                c9566r.add(c21778h);
                return new C0348i((C0355p) obj2, c21778h, c9566r, i10);
            case 3:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{(String) obj3, "conversations"});
                String str = (String) r12;
                if (str != null) {
                    AbstractC8056b6.m8452c((C13693c) obj2, "cursor", str);
                }
                return c17296c;
            case 4:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj4 = action.f42521b;
                C22177n0 c22177n0 = obj4 instanceof C22177n0 ? (C22177n0) obj4 : null;
                if (c22177n0 != null) {
                    action.f42521b = new C22153f0(((C22177n0) obj3).f70232Z, ((AbstractC22180o0) obj4).mo22381h(), (InterfaceC22179o) r12, (C22090C) obj2, c22177n0.f70236r0, c22177n0.f70237s0, AbstractC22120R0.m22355b(action, false), c22177n0.f70244z0);
                }
                return c17296c;
            case 5:
                InterfaceC19201o2 it = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it, "it");
                ((C1407s0) obj3).f3754e.invoke(it, ((C1375d0) r12).m2043f((ArrayList) obj2));
                return c17296c;
            case 6:
                List selectedItems = (List) obj;
                AbstractC16544l.m18094g(selectedItems, "selectedItems");
                C1375d0 c1375d0 = (C1375d0) obj3;
                c1375d0.f3648a.f4914i.getBackButton().setEnabled(true);
                ((TextInputLayout) r12).setEnabled(true);
                C1716a c1716a = c1375d0.f3648a;
                c1716a.f4914i.setImportantForAccessibility(1);
                c1716a.f4917l.setImportantForAccessibility(1);
                ((InterfaceC19240z1) obj2).mo20299b().m16594z(selectedItems);
                return c17296c;
            case 7:
                InterfaceC1318C it2 = (InterfaceC1318C) obj;
                AbstractC16544l.m18094g(it2, "it");
                InterfaceC1389j0 interfaceC1389j0 = (InterfaceC1389j0) obj3;
                C1360X0 c1360x0 = (C1360X0) r12;
                if (((C1385h0) interfaceC1389j0).f3693Y.f60962p0) {
                    return AbstractC8215v5.m8839a(c1360x0, C1363Z.f3615r0);
                }
                C1383g0 c1383g0 = (C1383g0) obj2;
                if (it2.equals(C1314A.f3475a)) {
                    return AbstractC8215v5.m8839a(c1360x0, new C1411u0(c1383g0, interfaceC1389j0));
                }
                if (it2 instanceof C1316B) {
                    return AbstractC8215v5.m8839a(c1360x0, new C1413v0(it2, c1383g0, c1360x0, interfaceC1389j0));
                }
                throw new C0644w();
            case 8:
                C10468e constrainAs = (C10468e) obj;
                AbstractC16544l.m18094g(constrainAs, "$this$constrainAs");
                String str2 = ((C0958L4) obj3).f2721b;
                C10470g c10470g = constrainAs.f31003f;
                if (str2 == null || AbstractC21322p.m21681O(str2)) {
                    C10469f c10469f = constrainAs.f31000c;
                    AbstractC7255t.m7697e(c10470g, c10469f.f31008d, 0.0f, 6);
                    C10468e.m10938a(constrainAs, c10469f);
                } else {
                    C10468e.m10938a(constrainAs, (C10469f) r12);
                    C10469f c10469f2 = (C10469f) obj2;
                    AbstractC7255t.m7697e(constrainAs.f31001d, c10469f2.f31006b, 0.0f, 6);
                    AbstractC7255t.m7697e(c10470g, c10469f2.f31008d, 0.0f, 6);
                }
                return c17296c;
            case 9:
                C1820o c1820o = (C1820o) obj;
                int length = c1820o.f5240f.f10892a.f10882a.f10934Y.length();
                ((C1814l) obj3).getClass();
                C1814l.m2639n((C12985x) r12, (C1824q) obj2, c1820o, 0, length);
                return c17296c;
            case 10:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C6172d c6172d = (C6172d) obj3;
                if (c6172d != null) {
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C2450F(c6172d, (InterfaceC1436k) r12, (InterfaceC1436k) obj2, i10), true, -1792825775), 3);
                }
                return c17296c;
            case 11:
                C18265e LazyColumn2 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn2, "$this$LazyColumn");
                C2532n1 c2532n1 = (C2532n1) obj3;
                List list = c2532n1.f7913t;
                LazyColumn2.m19803p(list.size(), null, new C1278t(1, list), new C8410b(new C2456I(0, c2532n1, (ArrayList) r12, (InterfaceC1436k) obj2, list), true, -632812321));
                return c17296c;
            case 12:
                long j12 = ((C7543h) obj).f23897a;
                InterfaceC7678d interfaceC7678d = (InterfaceC7678d) obj3;
                if (AbstractC9842Z.m10490b(interfaceC7678d.mo3586a())) {
                    ((InterfaceC5985X) obj2).setValue(Boolean.TRUE);
                } else if (AbstractC16544l.m18089b(interfaceC7678d.mo3586a(), C7681g.f24220a)) {
                    ((InterfaceC1426a) r12).invoke();
                } else {
                    interfaceC7678d.mo3587b();
                }
                return c17296c;
            case 13:
                long j13 = ((C7543h) obj).f23897a;
                if (((C2532n1) obj3).f7918y) {
                    ((InterfaceC1436k) r12).invoke(C2536p0.f7924a);
                } else {
                    ((C11709i) obj2).m13032b(j13);
                }
                return c17296c;
            case 14:
                String link = (String) obj;
                AbstractC16544l.m18094g(link, "link");
                ((InterfaceC0309z1) obj3).mo877a(link);
                ((InterfaceC20904w) r12).mo21447a(C20883b0.f66503d, AbstractC17659D.m19248j(((C2529m1) obj2).f7863d, AbstractC17660E.m19258c(new C17309l("url", link))));
                return c17296c;
            case 15:
                Context context = (Context) obj;
                AbstractC16544l.m18094g(context, "context");
                C2751h c2751h = new C2751h(context);
                WebSettings settings = c2751h.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setBlockNetworkImage(true);
                settings.setBlockNetworkLoads(false);
                c2751h.setScrollBarSize(0);
                c2751h.setBackgroundColor(0);
                C3430e c3430e = (C3430e) r12;
                c2751h.setWebViewClient(new C2746c(c3430e, (InterfaceC5985X) obj3));
                c2751h.setWebChromeClient(new C2747d(c3430e, (InterfaceC5985X) obj2));
                c2751h.addJavascriptInterface(new C2749f(c2751h), "Android");
                c2751h.loadUrl("file:///android_asset/latex.html");
                return c2751h;
            case 16:
                AbstractC3409v message = (AbstractC3409v) obj;
                AbstractC16544l.m18094g(message, "message");
                ((CanmoreViewModel) obj3).m14395k(new C3355d(message));
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) r12;
                if (message instanceof C3388o) {
                    interfaceC5985X.setValue(Boolean.TRUE);
                    ((InterfaceC5985X) obj2).setValue(Boolean.FALSE);
                } else if (message instanceof C3370i) {
                    interfaceC5985X.setValue(Boolean.FALSE);
                }
                return c17296c;
            case 17:
                C13770k c13770k = (C13770k) obj;
                C16557y c16557y = (C16557y) obj3;
                float fFloatValue = ((Number) c13770k.f43484e.getValue()).floatValue() - c16557y.f51286Y;
                C3935J4 c3935j4 = (C3935J4) r12;
                float fM6409g = c3935j4.f12117c.m6409g();
                c3935j4.m4636b(fM6409g + fFloatValue);
                float fAbs = Math.abs(fM6409g - c3935j4.f12117c.m6409g());
                c16557y.f51286Y = ((Number) c13770k.f43484e.getValue()).floatValue();
                ((C16557y) obj2).f51286Y = ((Number) c13770k.m15269b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c13770k.m15268a();
                }
                return c17296c;
            case 18:
                C3880A3 c3880a3 = (C3880A3) r12;
                AbstractC0575H.m1156D((C2925c) obj3, null, null, new C4098n2(c3880a3, ((Number) obj).floatValue(), null), 3).mo1271H0(new C4086l2(c3880a3, (InterfaceC1426a) obj2, 1));
                return c17296c;
            case 19:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                C20319V c20319v = (C20319V) ((AbstractC20321X) r12);
                C4390J0 c4390j0 = (C4390J0) obj3;
                C4417Z c4417z = (C4417Z) obj2;
                if (C4390J0.m5176e(c4390j0, c20319v.f64230a)) {
                    action2.f42521b = C4390J0.m5178g(c4390j0, c4417z);
                } else {
                    String str3 = c4417z.f14333v0;
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = c20319v.f64230a;
                    action2.m14964a(new C4439k0("There was a problem reaching the server.", AbstractC4379E.m5173a(networkErrorInfo), networkErrorInfo, str3));
                }
                return c17296c;
            case 20:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                C22204w0 c22204w0 = (C22204w0) ((AbstractC22208y0) r12);
                C4390J0 c4390j1 = (C4390J0) obj3;
                C4421b0 c4421b0 = (C4421b0) obj2;
                if (C4390J0.m5176e(c4390j1, c22204w0.f70392a)) {
                    action3.f42521b = C4390J0.m5178g(c4390j1, c4421b0);
                } else {
                    action3.m14964a(new C4439k0(AbstractC4379E.m5174b(c22204w0.f70392a), AbstractC4379E.m5173a(c22204w0.f70392a), c22204w0.f70392a, c4421b0.f14362v0));
                }
                return c17296c;
            case 21:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                C10736w0 c10736w0 = (C10736w0) ((AbstractC10740y0) r12);
                C4390J0 c4390j2 = (C4390J0) obj3;
                C4425d0 c4425d0 = (C4425d0) obj2;
                if (C4390J0.m5176e(c4390j2, c10736w0.f31912a)) {
                    action4.f42521b = C4390J0.m5178g(c4390j2, c4425d0);
                } else {
                    action4.m14964a(new C4439k0(AbstractC4379E.m5174b(c10736w0.f31912a), AbstractC4379E.m5173a(c10736w0.f31912a), c10736w0.f31912a, c4425d0.f14384v0));
                }
                return c17296c;
            case 22:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                C1401p0 c1401p0 = (C1401p0) ((AbstractC1405r0) r12);
                C4390J0 c4390j3 = (C4390J0) obj3;
                C4431g0 c4431g0 = (C4431g0) obj2;
                if (C4390J0.m5176e(c4390j3, c1401p0.f3740b)) {
                    action5.f42521b = C4390J0.m5178g(c4390j3, c4431g0);
                } else {
                    String str4 = c4431g0.f14422v0;
                    String str5 = c1401p0.f3739a;
                    String str6 = str5 != null ? str5 : "There was a problem reaching the server.";
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = c1401p0.f3740b;
                    action5.m14964a(new C4439k0(str6, AbstractC4379E.m5173a(networkErrorInfo2), networkErrorInfo2, str4));
                }
                return c17296c;
            case 23:
                AbstractC4402P0 it3 = (AbstractC4402P0) obj;
                AbstractC16544l.m18094g(it3, "it");
                C4390J0 c4390j4 = (C4390J0) obj3;
                if (it3 instanceof C4400O0) {
                    return AbstractC8215v5.m8839a(c4390j4, new C4171z3(it3, 2));
                }
                if (it3 instanceof C4398N0) {
                    return AbstractC8215v5.m8839a(c4390j4, new C1307e(c4390j4, it3, (AbstractC4433h0) r12, (String) obj2, 8));
                }
                throw new C0644w();
            case 24:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                return new C0348i((C4700a) obj3, (InterfaceC5985X) r12, (InterfaceC5985X) obj2, i11);
            case 25:
                C4897x c4897x = new C4897x((C2925c) r12, (C3899D4) obj2);
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                ((C2963j) obj).m3787m(AbstractC2962i.f8856c, new C2954a((String) obj3, c4897x));
                return c17296c;
            case 26:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                C4848L c4848l = (C4848L) r12;
                float fM5502d = ((InterfaceC21059M) obj3).mo19937Z() ? c4848l.f15782z0.m12638h().m5502d(((C5944C) c4848l.f15782z0.f34071h).getValue()) : c4848l.f15782z0.m12653w();
                EnumC16673F0 enumC16673F0 = c4848l.f15780B0;
                abstractC21068W.m21545d((AbstractC21069X) obj2, AbstractC2119a.m3195i(enumC16673F0 == EnumC16673F0.f53402Z ? fM5502d : 0.0f), AbstractC2119a.m3195i(enumC16673F0 == EnumC16673F0.f53401Y ? fM5502d : 0.0f), 0.0f);
                return c17296c;
            case 27:
                C14573E3 publishTrackImpl = (C14573E3) obj;
                AbstractC16544l.m18094g(publishTrackImpl, "$this$publishTrackImpl");
                C6501u c6501u = (C6501u) obj3;
                C6460G c6460gM7064k = c6501u.m7064k();
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).setWidth(c6460gM7064k.f20962a);
                C6460G c6460gM7064k2 = c6501u.m7064k();
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).setHeight(c6460gM7064k2.f20963b);
                C16525B c16525b = (C16525B) r12;
                EnumC6464K enumC6464K = ((C5828J) c16525b.f51262Y).f19043g;
                EnumC14686X2 enumC14686X2M7049a = enumC6464K != null ? enumC6464K.m7049a() : c6501u.m7065l().f21097a ? EnumC14686X2.SCREEN_SHARE : EnumC14686X2.CAMERA;
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).setSource(enumC14686X2M7049a);
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).addAllLayers((List) obj2);
                C14769j4 c14769j4NewBuilder = LivekitRtc$SimulcastCodec.newBuilder();
                String str7 = ((C5828J) c16525b.f51262Y).f19040d;
                c14769j4NewBuilder.m13863d();
                ((LivekitRtc$SimulcastCodec) c14769j4NewBuilder.f36981Z).setCodec(str7);
                String strM18749id = c6501u.f21090o.m18749id();
                c14769j4NewBuilder.m13863d();
                ((LivekitRtc$SimulcastCodec) c14769j4NewBuilder.f36981Z).setCid(strM18749id);
                LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec = (LivekitRtc$SimulcastCodec) c14769j4NewBuilder.m13861b();
                publishTrackImpl.m13863d();
                ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).addSimulcastCodecs(livekitRtc$SimulcastCodec);
                C5828J c5828j = (C5828J) c16525b.f51262Y;
                C5832d c5832d = c5828j.f19042f;
                if ((c5832d != null ? c5832d.f19056a : null) != null) {
                    if (!AbstractC16544l.m18089b(c5828j.f19040d, c5832d != null ? c5832d.f19056a : null)) {
                        C14769j4 c14769j4NewBuilder2 = LivekitRtc$SimulcastCodec.newBuilder();
                        C5832d c5832d2 = ((C5828J) c16525b.f51262Y).f19042f;
                        AbstractC16544l.m18091d(c5832d2);
                        String str8 = c5832d2.f19056a;
                        c14769j4NewBuilder2.m13863d();
                        ((LivekitRtc$SimulcastCodec) c14769j4NewBuilder2.f36981Z).setCodec(str8);
                        c14769j4NewBuilder2.m13863d();
                        ((LivekitRtc$SimulcastCodec) c14769j4NewBuilder2.f36981Z).setCid("");
                        LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec2 = (LivekitRtc$SimulcastCodec) c14769j4NewBuilder2.m13861b();
                        publishTrackImpl.m13863d();
                        ((LivekitRtc$AddTrackRequest) publishTrackImpl.f36981Z).addSimulcastCodecs(livekitRtc$SimulcastCodec2);
                    }
                }
                return c17296c;
            case 28:
                String sheetName = (String) obj;
                AbstractC16544l.m18094g(sheetName, "sheetName");
                ((InterfaceC5985X) obj2).setValue(Boolean.FALSE);
                ((InterfaceC1436k) obj3).invoke(Integer.valueOf(r12.indexOf(sheetName)));
                return c17296c;
            default:
                C7709b engine = (C7709b) obj;
                AbstractC16544l.m18094g(engine, "$this$engine");
                if (!((Set) obj3).isEmpty()) {
                    throw new IllegalArgumentException("You must scope OkHttp Interceptors with @ApplicationInterceptor or @NetworkInterceptor!");
                }
                for (final InterfaceC17351r interfaceC17351r : (Set) r12) {
                    engine.f24286a = new C6753d(engine.f24286a, new C0386f(new InterfaceC17351r() { // from class: Sh.c
                        @Override // mo.InterfaceC17351r
                        public final C17327D intercept(InterfaceC17350q interfaceC17350q) {
                            switch (i10) {
                                case 0:
                                    break;
                            }
                            return AbstractC9112C3.m9639a(interfaceC17351r, (C19261e) interfaceC17350q);
                        }
                    }, 10), 1);
                }
                for (final InterfaceC17351r interfaceC17351r2 : (Set) obj2) {
                    engine.f24286a = new C6753d(engine.f24286a, new C0386f(new InterfaceC17351r() { // from class: Sh.c
                        @Override // mo.InterfaceC17351r
                        public final C17327D intercept(InterfaceC17350q interfaceC17350q) {
                            switch (i11) {
                                case 0:
                                    break;
                            }
                            return AbstractC9112C3.m9639a(interfaceC17351r2, (C19261e) interfaceC17350q);
                        }
                    }, 9), 1);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0146w(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f605Y = i10;
        this.f607o0 = obj;
        this.f608p0 = obj2;
        this.f606Z = obj3;
    }
}
