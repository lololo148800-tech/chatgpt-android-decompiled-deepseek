package p071Ch;

import android.app.Application;
import bo.C11534v;
import gd.InterfaceC13849E;
import io.ktor.client.plugins.auth.C15058c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17641o;
import p001A.C0017I0;
import p033B5.C0819c;
import p077Cn.EnumC1733a;
import p086D6.C1961e;
import p086D6.InterfaceC1957a;
import p1034u6.AbstractC20136n;
import p1034u6.C20129g;
import p1034u6.C20137o;
import p1034u6.C20142t;
import p1034u6.EnumC20128f;
import p1034u6.InterfaceC20123a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2215x0;
import p1057v6.C20463c;
import p1057v6.C20467g;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p1099x6.C21143k;
import p1122y6.C21391b;
import p140Fa.C2690j;
import p185H6.C3245a;
import p185H6.C3260p;
import p228J.AbstractC3812N;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p364Oh.C6226E;
import p409Qk.C6752c;
import p457Sh.C7134b;
import p525Vb.C8258a;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p727eh.C13404b;
import p729ej.C13414e;
import p876lm.InterfaceC17068a;
import p900n6.C17507d;
import p909nm.AbstractC17686t;
import p917o6.C17867t;
import p917o6.C17870w;
import p917o6.InterfaceC17835C;
import p924od.C18075e;
import p942p6.EnumC18300d;
import p947pd.C18367g;
import p948pi.C18418a;

/* JADX INFO: renamed from: Ch.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672c implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4740a = 2;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f4741b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f4742c;

    /* JADX INFO: renamed from: d */
    public final C4474e f4743d;

    public C1672c(C4474e application, InterfaceC17068a experimentManager, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f4743d = application;
        this.f4741b = experimentManager;
        this.f4742c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        int i10 = 0;
        int i11 = 1;
        InterfaceC17068a interfaceC17068a = this.f4742c;
        C4474e c4474e = this.f4743d;
        InterfaceC17068a interfaceC17068a2 = this.f4741b;
        switch (this.f4740a) {
            case 0:
                Object obj = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C1671b((C1676g) obj, (C6226E) obj2, (Application) obj3);
            case 1:
                Object obj4 = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                C6752c c6752c = (C6752c) obj4;
                Object obj5 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj6, "get(...)");
                C18418a c18418a = (C18418a) obj6;
                C20467g c20467g = new C20467g();
                C21391b c21391b = new C21391b(AbstractC9306j0.m9891j(c18418a.f58777e, "_apollo.db", new StringBuilder()));
                AbstractC3812N abstractC3812N = c20467g;
                while (true) {
                    C21391b c21391b2 = (C21391b) abstractC3812N.f11539Z;
                    if (c21391b2 == null) {
                        abstractC3812N.f11539Z = c21391b;
                        C11534v c11534v = new C11534v(1);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        C17870w c17870w = C17870w.f56967a;
                        C3260p c3260p = new C3260p(c6752c);
                        C20463c c20463c = C20463c.f64958b;
                        C20463c c20463c2 = C20463c.f64957a;
                        C0017I0 c0017i0 = new C0017I0();
                        c0017i0.f64Y = c20463c;
                        c0017i0.f65Z = c20463c2;
                        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(0, 64, EnumC1733a.f4961Y, 1);
                        c0017i0.f66o0 = c2127d0M3203b;
                        c0017i0.f67p0 = new C2215x0(c2127d0M3203b);
                        c0017i0.f68q0 = AbstractC9227W.m9800c(new C0819c(c20467g, 22));
                        c0017i0.f69r0 = new C13414e();
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((InterfaceC1957a) it.next()) instanceof C1961e) {
                                    throw new IllegalStateException("Apollo: the normalized cache must be configured before the auto persisted queries");
                                }
                            }
                        }
                        ArrayList<InterfaceC20123a> arrayList4 = new ArrayList();
                        for (Object obj7 : arrayList) {
                            if (obj7 instanceof InterfaceC20123a) {
                                arrayList4.add(obj7);
                            }
                        }
                        for (InterfaceC20123a interceptor : arrayList4) {
                            AbstractC16544l.m18094g(interceptor, "interceptor");
                            arrayList.remove(interceptor);
                        }
                        arrayList.add(new C21143k(c0017i0, i11));
                        arrayList.add(C20137o.f63786a);
                        arrayList.add(new C21143k(c0017i0, i10));
                        C20142t c20142t = new C20142t(false);
                        c17870w.mo4139b(c20142t);
                        EnumC20128f[] enumC20128fArr = EnumC20128f.f63760Y;
                        InterfaceC17835C executionContext = c20142t.mo4139b(new C20129g(AbstractC20136n.f63785c));
                        C20513d c20513d = new C20513d();
                        arrayList2.add(new C3245a());
                        arrayList2.add(new C7134b(c18418a));
                        EnumC18300d enumC18300d = EnumC18300d.f58413Y;
                        EnumC18300d enumC18300d2 = EnumC18300d.f58414Z;
                        AbstractC17686t.m19393A(arrayList, new C15058c(10));
                        arrayList.add(new C1961e(enumC18300d, enumC18300d2));
                        Boolean bool = Boolean.TRUE;
                        C2690j c2690j = new C2690j(1);
                        C17867t c17867tM12926b = c11534v.m12926b();
                        C11534v c11534v2 = (C11534v) c2690j.f8261a;
                        c11534v2.f34898a.clear();
                        c11534v2.f34898a.putAll(c17867tM12926b.f56964d);
                        ArrayList arrayList5 = (ArrayList) c2690j.f8262b;
                        arrayList5.clear();
                        AbstractC17686t.m19398v(arrayList, arrayList5);
                        AbstractC16544l.m18094g(executionContext, "executionContext");
                        c2690j.f8268h = executionContext;
                        c2690j.f8270j = "https://android.chat.openai.com/graphql";
                        c2690j.f8271k = c3260p;
                        ArrayList arrayList6 = (ArrayList) c2690j.f8264d;
                        arrayList6.clear();
                        arrayList6.addAll(arrayList2);
                        c2690j.f8269i = bool;
                        c2690j.f8272l = c20513d;
                        ArrayList arrayList7 = (ArrayList) c2690j.f8266f;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList3);
                        return new C17507d(c2690j);
                    }
                    abstractC3812N = c21391b2;
                }
                break;
            case 2:
                Object obj8 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj8, "get(...)");
                Object obj9 = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C13404b((Application) obj8, (InterfaceC13849E) obj9, (InterfaceC20904w) obj10);
            default:
                Object obj11 = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = c4474e.f14617a;
                AbstractC16544l.m18093f(obj12, "get(...)");
                Object obj13 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                return new C18075e((C18367g) obj11, (C17641o) obj12, (InterfaceC13849E) obj13);
        }
    }

    public C1672c(InterfaceC17068a api, C4474e userCoroutineScope, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(userCoroutineScope, "userCoroutineScope");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f4741b = api;
        this.f4743d = userCoroutineScope;
        this.f4742c = experimentManager;
    }

    public C1672c(InterfaceC17068a devicePreferences, InterfaceC17068a servicesConfig, C4474e appContext) {
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(appContext, "appContext");
        this.f4741b = devicePreferences;
        this.f4742c = servicesConfig;
        this.f4743d = appContext;
    }

    public C1672c(C8258a c8258a, InterfaceC17068a client, InterfaceC17068a config, C4474e accountSession) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f4741b = client;
        this.f4742c = config;
        this.f4743d = accountSession;
    }
}
