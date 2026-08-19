package io.sentry.android.replay.capture;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import coil.compose.AsyncImagePainter;
import com.openai.feature.jawbone.tools.JawboneToolViewModel;
import gd.C13985r2;
import io.sentry.EnumC15527z1;
import io.sentry.android.replay.C15294h;
import io.sentry.protocol.C15447t;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mk.C17280a;
import mm.C17296C;
import mo.C17334a;
import mo.C17339f;
import mo.C17347n;
import nc.AbstractC17566m;
import ni.C17628b;
import p003A1.AbstractC0168G;
import p003A1.C0256i;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0309z1;
import p013Ab.C0420b;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p1000s0.C19425u;
import p1013t0.C19721i;
import p1071w0.C20718K0;
import p1081wc.AbstractC20892k;
import p1081wc.C20869O;
import p1081wc.C20881a0;
import p1081wc.C20896o;
import p1081wc.InterfaceC20904w;
import p1140z1.AbstractC21678Y;
import p172Gi.C3080m;
import p195Hh.C3430e;
import p200Hm.C3508g;
import p204I1.AbstractC3597m;
import p204I1.C3588d;
import p204I1.C3590f;
import p204I1.C3595k;
import p204I1.C3596l;
import p225Im.InterfaceC3759g;
import p239Ja.C4307j;
import p269Kh.C4688o;
import p349O0.C5944C;
import p349O0.InterfaceC5985X;
import p392Q0.C6546d;
import p478Tc.C7297a;
import p478Tc.C7299c;
import p479Td.C7351f0;
import p492U1.C7536a;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8152n6;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8656j3;
import p571X9.AbstractC9212T2;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.TfazcFv;
import p620Zc.InterfaceC10277b;
import p635a1.C10456n;
import p749fd.C13625j;
import p749fd.EnumC13617b;
import p759g1.C13801c;
import p759g1.C13803e;
import p784hb.C14437f;
import p835jg.C16206a;
import p860l0.C16660B;
import p860l0.C16672F;
import p860l0.C16698N1;
import p860l0.InterfaceC16794y;
import p882m1.AbstractC17140a;
import p886m5.AbstractC17167b;
import p891mf.C17243d;
import p891mf.C17244e;
import p891mf.C17248i;
import p906nh.C17620b;
import p906nh.C17625g;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p911o0.C17786u;
import p923oc.C18064t;
import p936p0.C18265e;
import p936p0.C18266f;
import p936p0.C18280t;
import p948pi.C18418a;
import p953q0.C18561T;
import p988rc.C18919g;
import pf.C18390f;
import pf.C18391g;
import td.C19847j;
import td.C19849l;
import tf.C19906K;
import tf.C19926k;
import tf.C19935t;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15272c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47693Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f47694Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f47695o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f47696p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15272c(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f47693Y = i10;
        this.f47694Z = obj;
        this.f47696p0 = obj2;
        this.f47695o0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15272c(C17280a c17280a, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2) {
        super(0);
        this.f47693Y = 11;
        this.f47694Z = c17280a;
        this.f47696p0 = (AbstractC16546n) interfaceC1426a;
        this.f47695o0 = (AbstractC16546n) interfaceC1426a2;
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v55, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v77, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C17296C c17296c;
        C4307j c4307j;
        C17296C c17296c2;
        switch (this.f47693Y) {
            case 0:
                C15294h c15294h = ((AbstractC15275f) this.f47695o0).f47714i;
                if (c15294h != null) {
                    c15294h.m16519m("replay.id", String.valueOf((C15447t) this.f47696p0));
                }
                return C17296C.f55119a;
            case 1:
                C15294h c15294h2 = ((AbstractC15275f) this.f47695o0).f47714i;
                if (c15294h2 != null) {
                    c15294h2.m16519m("segment.id", String.valueOf((Integer) this.f47696p0));
                }
                return C17296C.f55119a;
            case 2:
                C15294h c15294h3 = ((AbstractC15275f) this.f47695o0).f47714i;
                if (c15294h3 != null) {
                    c15294h3.m16519m("replay.type", String.valueOf((EnumC15527z1) this.f47696p0));
                }
                return C17296C.f55119a;
            case 3:
                C15294h c15294h4 = ((AbstractC15275f) this.f47695o0).f47714i;
                if (c15294h4 != null) {
                    Date date = (Date) this.f47696p0;
                    c15294h4.m16519m("segment.timestamp", date == null ? null : AbstractC8656j3.m9344l(date));
                }
                return C17296C.f55119a;
            case 4:
                C15294h c15294h5 = ((AbstractC15275f) this.f47695o0).f47714i;
                if (c15294h5 != null) {
                    c15294h5.m16519m("replay.screen-at-start", String.valueOf((String) this.f47696p0));
                }
                return C17296C.f55119a;
            case 5:
                AbstractC8160o6.m8726a((C3430e) this.f47694Z, "OTP retriever unregistering receiver", null, 6);
                ((Context) this.f47696p0).unregisterReceiver((C16206a) this.f47695o0);
                return C17296C.f55119a;
            case 6:
                C16672F c16672f = (C16672F) this.f47694Z;
                C14437f c14437f = c16672f.f53394D0;
                while (true) {
                    boolean zM7109n = ((C6546d) c14437f.f45413Y).m7109n();
                    c17296c = C17296C.f55119a;
                    if (zM7109n) {
                        C6546d c6546d = (C6546d) c14437f.f45413Y;
                        if (c6546d.m7108m()) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C13801c c13801c = (C13801c) ((C16660B) c6546d.f21182Y[c6546d.f21184o0 - 1]).f53358a.invoke();
                        if (c13801c == null ? true : c16672f.m18498M0(c16672f.f53398H0, c13801c)) {
                            ((C16660B) c6546d.m7111p(c6546d.f21184o0 - 1)).f53359b.resumeWith(c17296c);
                        }
                    }
                }
                if (c16672f.f53397G0) {
                    C13801c c13801cM18497L0 = c16672f.m18497L0();
                    if (c13801cM18497L0 != null && c16672f.m18498M0(c16672f.f53398H0, c13801cM18497L0)) {
                        c16672f.f53397G0 = false;
                    }
                }
                ((C16698N1) this.f47696p0).f53512e = C16672F.m18496K0(c16672f, (InterfaceC16794y) this.f47695o0);
                return c17296c;
            case 7:
                C20896o c20896o = C20896o.f66600d;
                C4688o c4688o = (C4688o) this.f47696p0;
                ((InterfaceC20904w) this.f47694Z).mo21447a(c20896o, AbstractC0168G.m535x("to_model_slug", c4688o.f15253b));
                ((InterfaceC1436k) this.f47695o0).invoke(c4688o);
                return C17296C.f55119a;
            case 8:
                ((InterfaceC10277b) this.f47694Z).mo10876f();
                ((InterfaceC1426a) this.f47696p0).invoke();
                ((InterfaceC1426a) this.f47695o0).invoke();
                return C17296C.f55119a;
            case 9:
                ((InterfaceC20904w) this.f47694Z).mo21447a(C20869O.f66437f, C17690x.f56481Y);
                ((JawboneToolViewModel) this.f47696p0).m14395k(new C17244e((String) this.f47695o0));
                return C17296C.f55119a;
            case 10:
                ((JawboneToolViewModel) this.f47694Z).m14395k(new C17243d((String) this.f47696p0, !((C17248i) this.f47695o0).f55031b));
                return C17296C.f55119a;
            case 11:
                if (((C17280a) this.f47694Z).f55088Y) {
                    ((AbstractC16546n) this.f47696p0).invoke();
                } else {
                    ((AbstractC16546n) this.f47695o0).invoke();
                }
                return C17296C.f55119a;
            case 12:
                AbstractC8152n6 abstractC8152n6 = ((C17339f) this.f47694Z).f55231b;
                List listMo8703e = (List) this.f47696p0;
                if (abstractC8152n6 != null) {
                    listMo8703e = abstractC8152n6.mo8703e((String) this.f47695o0, listMo8703e);
                }
                List<Certificate> list = listMo8703e;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (Certificate certificate : list) {
                    AbstractC16544l.m18092e(certificate, TfazcFv.GJZibOkYRo);
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 13:
                return AbstractC9212T2.m9778b((C18919g) this.f47696p0, (InterfaceC1436k) this.f47695o0, (C18064t) this.f47694Z);
            case 14:
                AbstractC17140a painter = ((AbstractC17167b) ((AsyncImagePainter) this.f47694Z).f35875D0.getValue()).getPainter();
                C13803e c13803e = painter != null ? new C13803e(painter.getF38830r0()) : null;
                C10456n c10456n = C10456n.f30959Y;
                if (c13803e != null) {
                    long j10 = c13803e.f43598a;
                    if (j10 != 9205357640488583168L && C13803e.m15333e(j10) != Float.POSITIVE_INFINITY && C13803e.m15331c(j10) != Float.POSITIVE_INFINITY) {
                        float fM15333e = C13803e.m15333e(j10);
                        float fM15331c = C13803e.m15331c(j10);
                        C17786u c17786u = (C17786u) this.f47696p0;
                        float fM7854i = fM15333e > ((float) C7536a.m7854i(c17786u.f56763b)) ? C7536a.m7854i(c17786u.f56763b) / fM15333e : 1.0f;
                        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) this.f47695o0;
                        return AbstractC10844c.m11253m(c10456n, interfaceC7537b.mo7862P(fM15333e * fM7854i), interfaceC7537b.mo7862P(fM15331c * fM7854i));
                    }
                }
                return AbstractC10844c.m11252l(c10456n, AbstractC17566m.f56205a);
            case 15:
                ((InterfaceC1426a) this.f47694Z).invoke();
                ((InterfaceC1436k) this.f47696p0).invoke((C4688o) this.f47695o0);
                return C17296C.f55119a;
            case 16:
                File file = new File(((C17625g) this.f47696p0).f56401Y.getCacheDir(), AbstractC9306j0.m9889h("whisper/", ((C18418a) this.f47694Z).f58777e));
                file.mkdirs();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
                ((C17628b) this.f47695o0).m19237b(new C17620b(file, null));
                return file;
            case 17:
                C18265e c18265e = (C18265e) ((C5944C) this.f47694Z).getValue();
                C18280t c18280t = (C18280t) this.f47696p0;
                return new C18266f(c18280t, c18265e, (C10845a) this.f47695o0, new C0420b((C3508g) ((C18561T) c18280t.f58348d.f1143e).getValue(), c18265e));
            case 18:
                AbstractC8152n6 abstractC8152n7 = ((C17339f) this.f47694Z).f55231b;
                AbstractC16544l.m18091d(abstractC8152n7);
                return abstractC8152n7.mo8703e(((C17334a) this.f47695o0).f55209i.f55289d, ((C17347n) this.f47696p0).m19011a());
            case 19:
                C3080m c3080m = (C3080m) this.f47696p0;
                Set set = (Set) this.f47694Z;
                ((InterfaceC1436k) this.f47695o0).invoke(set.contains(c3080m) ? AbstractC17665J.m19263c(set, c3080m) : AbstractC17665J.m19267g(set, c3080m));
                return C17296C.f55119a;
            case 20:
                ((InterfaceC1439n) this.f47694Z).invoke((Set) ((InterfaceC5985X) this.f47696p0).getValue(), (String) ((InterfaceC5985X) this.f47695o0).getValue());
                return C17296C.f55119a;
            case 21:
                return new C19425u((InterfaceC1441p) ((InterfaceC5985X) this.f47694Z).getValue(), (InterfaceC1436k) ((InterfaceC5985X) this.f47696p0).getValue(), ((Number) ((InterfaceC1426a) this.f47695o0).invoke()).intValue());
            case 22:
                AbstractC21678Y abstractC21678Y = (AbstractC21678Y) this.f47696p0;
                ?? r6 = (AbstractC16546n) this.f47695o0;
                C19721i c19721i = (C19721i) this.f47694Z;
                C13801c c13801cM20666K0 = C19721i.m20666K0(c19721i, abstractC21678Y, r6);
                if (c13801cM20666K0 == null) {
                    return null;
                }
                C16672F c16672f2 = c19721i.f62434z0;
                if (C7545j.m7886a(c16672f2.f53398H0, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c13801cM20666K0.m15326m(c16672f2.m18500O0(c16672f2.f53398H0, c13801cM20666K0) ^ (-9223372034707292160L));
            case 23:
                if (!((C19849l) ((InterfaceC5985X) this.f47695o0).getValue()).f62940d) {
                    ((InterfaceC1436k) ((InterfaceC3759g) this.f47694Z)).invoke(new C19847j((String) this.f47696p0, null));
                }
                return C17296C.f55119a;
            case 24:
                EnumC13617b enumC13617b = ((C19906K) this.f47694Z).f63082g;
                EnumC13617b enumC13617b2 = EnumC13617b.f43009Z;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f47696p0;
                if (enumC13617b == enumC13617b2) {
                    interfaceC1436k.invoke(C19926k.f63183a);
                } else {
                    C13625j c13625j = (C13625j) this.f47695o0;
                    c13625j.f43049b.clear();
                    c13625j.f43050c.clear();
                    c13625j.f43051d.clear();
                    interfaceC1436k.invoke(new C19935t(EnumC13617b.f43011p0));
                }
                return C17296C.f55119a;
            case 25:
                ((C0256i) ((InterfaceC0172H0) this.f47694Z)).m827c(new C3590f(6, (String) this.f47696p0, null));
                ((InterfaceC1426a) this.f47695o0).invoke();
                return C17296C.f55119a;
            case 26:
                C7543h c7543h = (C7543h) ((C7299c) this.f47694Z).f23109b.getValue();
                if (c7543h != null) {
                    ((InterfaceC10277b) this.f47696p0).mo10871a();
                    ((InterfaceC1436k) this.f47695o0).invoke(new C7543h(c7543h.f23897a));
                }
                return C17296C.f55119a;
            case 27:
                AbstractC3597m it = (AbstractC3597m) ((C3588d) this.f47696p0).f10930a;
                InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) this.f47695o0;
                ((C20718K0) this.f47694Z).getClass();
                boolean z6 = it instanceof C3596l;
                C17296C c17296c3 = C17296C.f55119a;
                if (z6) {
                    C4307j c4307j2 = ((C3596l) it).f10953c;
                    if (c4307j2 != null) {
                        AbstractC16544l.m18094g(it, "it");
                        ((C7297a) c4307j2.f13996Z).f23105a.invoke();
                        c17296c2 = c17296c3;
                    } else {
                        c17296c2 = null;
                    }
                    if (c17296c2 == null) {
                        try {
                            interfaceC0309z1.mo877a(((C3596l) it).f10951a);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((it instanceof C3595k) && (c4307j = ((C3595k) it).f10950c) != null) {
                    AbstractC16544l.m18094g(it, "it");
                    ((C7297a) c4307j.f13996Z).f23105a.invoke();
                }
                return c17296c3;
            case 28:
                String string = ((AbstractC20892k) this.f47694Z).toString();
                C20881a0 c20881a0 = (C20881a0) this.f47696p0;
                C3430e c3430e = c20881a0.f66498b;
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Statsig track event: ", string, ", properties: ");
                Map map = (Map) this.f47695o0;
                sbM11058p.append(map);
                AbstractC8160o6.m8726a(c3430e, sbM11058p.toString(), null, 6);
                C13985r2 c13985r2 = c20881a0.f66497a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                c13985r2.f44049e.logEvent(string, linkedHashMap);
                return C17296C.f55119a;
            default:
                C7351f0 c7351f0 = (C7351f0) this.f47695o0;
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f47696p0;
                String str = (String) this.f47694Z;
                if (str == null) {
                    interfaceC1436k2.invoke(new C18391g(c7351f0));
                } else {
                    interfaceC1436k2.invoke(new C18390f(c7351f0, str));
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15272c(C19721i c19721i, AbstractC21678Y abstractC21678Y, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f47693Y = 22;
        this.f47694Z = c19721i;
        this.f47696p0 = abstractC21678Y;
        this.f47695o0 = (AbstractC16546n) interfaceC1426a;
    }
}
