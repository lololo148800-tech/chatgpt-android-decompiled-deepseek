package p071Ch;

import android.app.Application;
import com.statsig.androidsdk.StatsigUser;
import gd.C13985r2;
import gd.InterfaceC13849E;
import io.sentry.hints.C15370i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ke.C16382j;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import ni.C17627a;
import ni.C17629c;
import ni.C17634h;
import ni.C17641o;
import p016Ae.C0452n;
import p044Bh.InterfaceC1301n;
import p045Bj.C1307e;
import p046Bk.C1342O;
import p092Dc.C1992i;
import p092Dc.C1997n;
import p092Dc.C2004u;
import p092Dc.C2006w;
import p094De.C2029l;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.C21891A;
import p1155zi.C21975X1;
import p1155zi.C22013h2;
import p1155zi.C22038o;
import p1155zi.EnumC21895B;
import p1155zi.EnumC21989b2;
import p1155zi.EnumC22034n;
import p160G5.p161rK.TVCuK;
import p190Hc.C3287h;
import p229J0.C4144v0;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p324Mn.C5531a;
import p337Nd.C5710c;
import p364Oh.C6226E;
import p409Qk.C6752c;
import p432Rh.C6906s;
import p509Uk.C7708a;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8192s6;
import p525Vb.C8258a;
import p571X9.AbstractC9183O2;
import p576Xe.C9473F;
import p625Zh.C10396b;
import p628Zk.InterfaceC10407f;
import p708dh.C13158l;
import p708dh.C13159m;
import p708dh.C13168v;
import p753fh.C13650h;
import p787he.C14459O;
import p870le.C16916z;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p925oe.C18086K;
import p925oe.C18127p;
import p948pi.C18418a;
import p948pi.C18422e;

/* JADX INFO: renamed from: Ch.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664D implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4709a = 7;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f4710b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f4711c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f4712d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f4713e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f4714f;

    public C1664D(InterfaceC17068a store, InterfaceC17068a legacyStore, C4471b authSessionProvider, InterfaceC4478i interfaceC4478i, C4474e coroutineScope) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(legacyStore, "legacyStore");
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f4712d = store;
        this.f4713e = legacyStore;
        this.f4714f = authSessionProvider;
        this.f4710b = interfaceC4478i;
        this.f4711c = coroutineScope;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        String str;
        EnumC22034n enumC22034n;
        String strName;
        C21975X1 c21975x1M22344a;
        EnumC21989b2 enumC21989b2;
        InterfaceC17068a interfaceC17068a = this.f4711c;
        InterfaceC4478i interfaceC4478i = this.f4710b;
        InterfaceC17068a interfaceC17068a2 = this.f4714f;
        InterfaceC17068a interfaceC17068a3 = this.f4713e;
        InterfaceC17068a interfaceC17068a4 = this.f4712d;
        switch (this.f4709a) {
            case 0:
                Object obj = ((C4474e) interfaceC17068a).f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Application application = (Application) obj;
                Object obj2 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                C1676g c1676g = (C1676g) obj2;
                Object obj3 = interfaceC17068a3.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C6226E c6226e = (C6226E) obj3;
                Object obj4 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                C10396b c10396b = (C10396b) obj4;
                Object obj5 = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C1663C(application, c1676g, c6226e, c10396b, (InterfaceC20904w) obj5);
            case 1:
                return new C3287h((AbstractC21864z) ((C4471b) interfaceC17068a).get(), (C2004u) ((C1997n) interfaceC17068a4).get(), (C2006w) ((C1997n) interfaceC17068a3).get(), (C6906s) interfaceC4478i.get(), (C17629c) ((InterfaceC4478i) interfaceC17068a2).get());
            case 2:
                Object obj6 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                Object obj7 = interfaceC17068a3.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                C6226E c6226e2 = (C6226E) obj7;
                Object obj8 = ((C4474e) interfaceC17068a).f14617a;
                AbstractC16544l.m18093f(obj8, "get(...)");
                C18422e c18422e = (C18422e) obj8;
                Object obj9 = ((C4479j) interfaceC17068a2).get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Set set = (Set) obj9;
                Object obj10 = ((C4479j) interfaceC4478i).get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return ((C6752c) obj6).m7188a(new C1307e(set, c18422e, (Set) obj10, c6226e2, 11));
            case 3:
                Object obj11 = ((C4479j) interfaceC17068a).get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Set set2 = (Set) obj11;
                Object obj12 = ((C4479j) interfaceC17068a3).get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                Set set3 = (Set) obj12;
                Object obj13 = ((C4479j) interfaceC17068a2).get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                Set set4 = (Set) obj13;
                Object obj14 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                C6226E c6226e3 = (C6226E) obj14;
                Object obj15 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                return AbstractC9183O2.m9738a(C7708a.f24285a, new C4144v0(set2, set3, set4, (InterfaceC10407f) obj15, AbstractC8168p6.m8749b("HttpClient", null), c6226e3, 2));
            case 4:
                Object obj16 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                C13159m c13159m = (C13159m) obj16;
                Object obj17 = interfaceC17068a3.get();
                AbstractC16544l.m18093f(obj17, "get(...)");
                C13168v c13168v = (C13168v) obj17;
                Object obj18 = ((C4471b) interfaceC17068a2).get();
                AbstractC16544l.m18093f(obj18, "get(...)");
                AbstractC21864z abstractC21864z = (AbstractC21864z) obj18;
                Object obj19 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj19, "get(...)");
                C13650h c13650h = (C13650h) obj19;
                Object obj20 = ((C4474e) interfaceC17068a).f14617a;
                AbstractC16544l.m18093f(obj20, "get(...)");
                return new C13158l(c13159m, c13168v, abstractC21864z, c13650h, (C17641o) obj20);
            case 5:
                Object obj21 = ((C4474e) interfaceC17068a).f14617a;
                AbstractC16544l.m18093f(obj21, "get(...)");
                C18418a c18418a = (C18418a) obj21;
                Object obj22 = ((C4474e) interfaceC17068a2).f14617a;
                AbstractC16544l.m18093f(obj22, "get(...)");
                Application application2 = (Application) obj22;
                Object obj23 = ((C4474e) interfaceC4478i).f14617a;
                AbstractC16544l.m18093f(obj23, "get(...)");
                C17627a c17627a = (C17627a) obj23;
                EnumC21895B enumC21895B = EnumC21895B.f69419Z;
                Object obj24 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj24, "get(...)");
                C1676g c1676g2 = (C1676g) obj24;
                Object obj25 = interfaceC17068a3.get();
                AbstractC16544l.m18093f(obj25, "get(...)");
                C6226E c6226e4 = (C6226E) obj25;
                StatsigUser statsigUser = new StatsigUser(c18418a.f58776d);
                boolean z6 = c18418a.f58773a.f58783b;
                if (!z6) {
                    statsigUser.setCustomIDs(AbstractC17660E.m19258c(new C17309l("account_id", c18418a.f58775c)));
                }
                C21891A c21891a = c18418a.f58774b;
                C22013h2 c22013h2 = c21891a.f69416b;
                Map mapM19244f = AbstractC17659D.m19244f(new C17309l("email", c22013h2.f69656b), new C17309l("phone_number", c22013h2.f69657c));
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : mapM19244f.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    C17309l c17309l = str3 != null ? new C17309l(str2, str3) : null;
                    if (c17309l != null) {
                        arrayList.add(c17309l);
                    }
                }
                statsigUser.setPrivateAttributes(AbstractC17659D.m19253o(arrayList));
                statsigUser.setLocale(AbstractC8012V5.m8334g(application2).toLanguageTag());
                statsigUser.setUserAgent(c6226e4.f20269a);
                Map mapM8793b = AbstractC8192s6.m8793b(!z6);
                C17309l c17309l2 = new C17309l("is_plus_user", Boolean.valueOf(AbstractC16544l.m18089b(c21891a.m22328g(), "plus")));
                C17309l c17309l3 = new C17309l("has_active_subscription", Boolean.valueOf(c21891a.m22325d()));
                String strM22328g = c21891a.m22328g();
                if (strM22328g == null) {
                    strM22328g = "";
                }
                C17309l c17309l4 = new C17309l("plan_type", strM22328g);
                C17309l c17309l5 = new C17309l("has_had_subscription", Boolean.valueOf(c21891a.m22326e()));
                C22038o c22038o = c21891a.f69415a;
                String str4 = (c22038o == null || (c21975x1M22344a = c22038o.m22344a()) == null || (enumC21989b2 = c21975x1M22344a.f69572b) == null) ? null : enumC21989b2.f69621Y;
                if (str4 == null) {
                    str4 = "";
                }
                LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(mapM8793b, AbstractC17659D.m19244f(c17309l2, c17309l3, c17309l4, c17309l5, new C17309l("subscription_purchase_origin", str4)));
                String str5 = (!c21891a.m22331j() || c22038o == null) ? null : c22038o.f69711a;
                if (str5 == null) {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = "";
                }
                C17309l c17309l6 = new C17309l("workspace_id", str5);
                if (c22038o == null || (enumC22034n = c22038o.f69716f) == null || (strName = enumC22034n.name()) == null) {
                    str = null;
                } else {
                    String lowerCase = strName.toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                    str = lowerCase;
                }
                statsigUser.setCustom(AbstractC17659D.m19248j(linkedHashMapM19248j, AbstractC17659D.m19244f(c17309l6, new C17309l("account_structure", str != null ? str : ""))));
                return new C13985r2(statsigUser, AbstractC8192s6.m8794c(enumC21895B, c1676g2.m2506a()), application2, c1676g2, c17627a);
            case 6:
                Object obj26 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj26, "get(...)");
                C9473F c9473f = (C9473F) obj26;
                Object obj27 = ((C4474e) interfaceC17068a).f14617a;
                AbstractC16544l.m18093f(obj27, "get(...)");
                C17634h c17634h = (C17634h) obj27;
                Object obj28 = ((C4474e) interfaceC17068a3).f14617a;
                AbstractC16544l.m18093f(obj28, "get(...)");
                C5710c c5710c = (C5710c) obj28;
                Object obj29 = ((C4474e) interfaceC17068a2).f14617a;
                AbstractC16544l.m18093f(obj29, "get(...)");
                C18418a c18418a2 = (C18418a) obj29;
                Object obj30 = ((C4471b) interfaceC4478i).get();
                AbstractC16544l.m18093f(obj30, "get(...)");
                return new C16382j(c9473f, c17634h, c5710c, c18418a2, (C14459O) obj30);
            case 7:
                ((C1992i) interfaceC4478i).get();
                C5531a c5531a = C5531a.f17986a;
                Object obj31 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj31, "get(...)");
                InterfaceC1301n interfaceC1301n = (InterfaceC1301n) obj31;
                Object obj32 = interfaceC17068a3.get();
                AbstractC16544l.m18093f(obj32, "get(...)");
                C1676g c1676g3 = (C1676g) obj32;
                Object obj33 = ((C4474e) interfaceC17068a).f14617a;
                AbstractC16544l.m18093f(obj33, "get(...)");
                C18418a c18418a3 = (C18418a) obj33;
                Object obj34 = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj34, "get(...)");
                return new C16916z(c5531a, interfaceC1301n, c1676g3, c18418a3, (InterfaceC20904w) obj34);
            default:
                Object obj35 = interfaceC17068a4.get();
                AbstractC16544l.m18093f(obj35, "get(...)");
                C0452n c0452n = (C0452n) obj35;
                Object obj36 = interfaceC17068a3.get();
                AbstractC16544l.m18093f(obj36, "get(...)");
                C2029l c2029l = (C2029l) obj36;
                Object obj37 = interfaceC17068a2.get();
                AbstractC16544l.m18093f(obj37, "get(...)");
                C10396b c10396b2 = (C10396b) obj37;
                Object obj38 = interfaceC4478i.get();
                AbstractC16544l.m18093f(obj38, "get(...)");
                C18127p c18127p = (C18127p) obj38;
                Object obj39 = interfaceC17068a.get();
                AbstractC16544l.m18093f(obj39, "get(...)");
                return new C18086K(c0452n, c2029l, c10396b2, c18127p, (InterfaceC13849E) obj39);
        }
    }

    public C1664D(C1992i clock, InterfaceC17068a integrityTokenGenerator, InterfaceC17068a devicePreferences, C4474e accountSession, InterfaceC17068a analytics) {
        AbstractC16544l.m18094g(clock, "clock");
        AbstractC16544l.m18094g(integrityTokenGenerator, "integrityTokenGenerator");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(analytics, "analytics");
        this.f4710b = clock;
        this.f4712d = integrityTokenGenerator;
        this.f4713e = devicePreferences;
        this.f4711c = accountSession;
        this.f4714f = analytics;
    }

    public C1664D(C4474e context, InterfaceC17068a devicePreferences, InterfaceC17068a servicesConfig, InterfaceC4478i interfaceC4478i, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f4711c = context;
        this.f4712d = devicePreferences;
        this.f4713e = servicesConfig;
        this.f4710b = interfaceC4478i;
        this.f4714f = analyticsService;
    }

    public C1664D(InterfaceC17068a gizmosRepository, C4474e screenCoroutineScope, C4474e conversationInfo, C4474e accountSession, C4471b c4471b) {
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(screenCoroutineScope, "screenCoroutineScope");
        AbstractC16544l.m18094g(conversationInfo, "conversationInfo");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f4712d = gizmosRepository;
        this.f4711c = screenCoroutineScope;
        this.f4713e = conversationInfo;
        this.f4714f = accountSession;
        this.f4710b = c4471b;
    }

    public C1664D(InterfaceC17068a apiService, InterfaceC17068a interfaceC17068a, InterfaceC17068a connectivityChecker, InterfaceC4478i interfaceC4478i, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(apiService, "apiService");
        AbstractC16544l.m18094g(interfaceC17068a, TVCuK.IITEqUDLKW);
        AbstractC16544l.m18094g(connectivityChecker, "connectivityChecker");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f4712d = apiService;
        this.f4713e = interfaceC17068a;
        this.f4714f = connectivityChecker;
        this.f4710b = interfaceC4478i;
        this.f4711c = experimentManager;
    }

    public C1664D(C15370i c15370i, C4479j unqualifiedApplicationInterceptors, C4479j applicationInterceptors, C4479j networkInterceptors, InterfaceC17068a config, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(unqualifiedApplicationInterceptors, "unqualifiedApplicationInterceptors");
        AbstractC16544l.m18094g(applicationInterceptors, "applicationInterceptors");
        AbstractC16544l.m18094g(networkInterceptors, "networkInterceptors");
        AbstractC16544l.m18094g(config, "config");
        this.f4711c = unqualifiedApplicationInterceptors;
        this.f4713e = applicationInterceptors;
        this.f4714f = networkInterceptors;
        this.f4712d = config;
        this.f4710b = interfaceC4478i;
    }

    public C1664D(C8258a c8258a, InterfaceC17068a client, InterfaceC17068a servicesConfig, C4474e authSession, C4479j c4479j, C4479j authProviders) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(authSession, "authSession");
        AbstractC16544l.m18094g(authProviders, "authProviders");
        this.f4712d = client;
        this.f4713e = servicesConfig;
        this.f4711c = authSession;
        this.f4714f = c4479j;
        this.f4710b = authProviders;
    }

    public C1664D(C20513d c20513d, C4474e accountSession, C4474e application, C4474e c4474e, C1342O c1342o, InterfaceC17068a devicePreferences, InterfaceC17068a servicesConfig) {
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        this.f4711c = accountSession;
        this.f4714f = application;
        this.f4710b = c4474e;
        this.f4712d = devicePreferences;
        this.f4713e = servicesConfig;
    }

    public C1664D(C4471b c4471b, C1997n c1997n, C1997n c1997n2, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2) {
        this.f4711c = c4471b;
        this.f4712d = c1997n;
        this.f4713e = c1997n2;
        this.f4710b = interfaceC4478i;
        this.f4714f = interfaceC4478i2;
    }
}
