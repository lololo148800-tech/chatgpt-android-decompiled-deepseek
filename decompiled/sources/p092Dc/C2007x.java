package p092Dc;

import bb.AbstractC11281F;
import bb.C11312f0;
import bg.C11423w;
import com.openai.chatgpt.app.p681di.LoggedOutViewModelFactory_Factory;
import com.openai.viewmodel.ViewModelFactory;
import com.openai.viewmodel.ViewModelFactoryProvider;
import gd.C13889R1;
import gd.C13969n2;
import gd.InterfaceC13849E;
import gd.InterfaceC13858H;
import io.sentry.hints.C15370i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ni.AbstractC17631e;
import ni.AbstractC17640n;
import ni.C17636j;
import ni.C17637k;
import p016Ae.C0453o;
import p033B5.InterfaceC0832p;
import p1081wc.C20876W;
import p1081wc.C20884c;
import p1081wc.InterfaceC20901t;
import p1081wc.InterfaceC20904w;
import p118Ec.C2400d;
import p142Fc.C2709c;
import p190Hc.InterfaceC3283d;
import p215Ic.C3686c;
import p248Jk.C4471b;
import p248Jk.C4472c;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4478i;
import p451Sb.C7102a;
import p579Xh.InterfaceC9514a;
import p873lh.C16951b;
import p876lm.InterfaceC17068a;
import p948pi.AbstractC18425h;

/* JADX INFO: renamed from: Dc.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C2007x implements InterfaceC3283d, InterfaceC13858H, InterfaceC20901t, ViewModelFactoryProvider, InterfaceC9514a {

    /* JADX INFO: renamed from: a */
    public final AbstractC18425h f6151a;

    /* JADX INFO: renamed from: b */
    public final C17636j f6152b;

    /* JADX INFO: renamed from: c */
    public final C1998o f6153c;

    /* JADX INFO: renamed from: d */
    public final C2007x f6154d = this;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f6155e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4478i f6156f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4478i f6157g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4478i f6158h;

    /* JADX INFO: renamed from: i */
    public final C4474e f6159i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4478i f6160j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4478i f6161k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4478i f6162l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4478i f6163m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC4478i f6164n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4478i f6165o;

    public C2007x(C1998o c1998o, C15370i c15370i, C7102a c7102a, C20884c c20884c, AbstractC18425h abstractC18425h, C17636j c17636j) {
        this.f6153c = c1998o;
        this.f6151a = abstractC18425h;
        this.f6152b = c17636j;
        InterfaceC4478i appCoroutineScope = c1998o.f6042f;
        AbstractC16544l.m18094g(appCoroutineScope, "appCoroutineScope");
        this.f6155e = C4472c.m5205a(new C16951b(appCoroutineScope, 4));
        InterfaceC4478i statsigInstance = c1998o.f6058n;
        AbstractC16544l.m18094g(statsigInstance, "statsigInstance");
        C4472c.m5205a(new C13889R1(c7102a, statsigInstance, 3));
        InterfaceC4478i experimentManager = c1998o.f6016N;
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f6156f = C4472c.m5205a(new C13889R1(c7102a, experimentManager, 1));
        InterfaceC4478i layerManager = c1998o.f6026U;
        AbstractC16544l.m18094g(layerManager, "layerManager");
        C4472c.m5205a(new C13889R1(c7102a, layerManager, 2));
        InterfaceC4478i configurationManager = c1998o.f6061o0;
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        this.f6157g = C4472c.m5205a(new C13889R1(c7102a, configurationManager, 0));
        InterfaceC4478i analyticsService = c1998o.f6074v;
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f6158h = C4472c.m5205a(new C20876W(c20884c, analyticsService, 0));
        C4474e c4474eM5206a = C4474e.m5206a(c17636j);
        this.f6159i = c4474eM5206a;
        this.f6160j = C4472c.m5205a(new LoggedOutViewModelFactory_Factory(c4474eM5206a, new C2000q(this, 2)));
        this.f6161k = C4472c.m5205a(new C1990g(c15370i, c1998o.f6038d, c1998o.f5997D0, c1998o.f6049i0, 1));
        InterfaceC4478i segmentAnalyticsService = c1998o.f6072u;
        AbstractC16544l.m18094g(segmentAnalyticsService, "segmentAnalyticsService");
        InterfaceC4478i interfaceC4478iM5205a = C4472c.m5205a(new C20876W(c20884c, segmentAnalyticsService, 1));
        this.f6162l = C4472c.m5205a(new C2709c(this.f6156f, interfaceC4478iM5205a, 0));
        InterfaceC4478i statsigAnalyticsService = c1998o.f6060o;
        AbstractC16544l.m18094g(statsigAnalyticsService, "statsigAnalyticsService");
        InterfaceC4478i interfaceC4478iM5205a2 = C4472c.m5205a(new C20876W(c20884c, statsigAnalyticsService, 2));
        this.f6163m = C4472c.m5205a(new C2709c(this.f6156f, interfaceC4478iM5205a2, 1));
        C4474e c4474e = C4479j.f14619c;
        ArrayList arrayList = new ArrayList(2);
        List listEmptyList = Collections.emptyList();
        arrayList.add(this.f6162l);
        arrayList.add(this.f6163m);
        this.f6164n = C4472c.m5205a(new C2400d(new C4479j(arrayList, listEmptyList), this.f6159i, 0));
        InterfaceC4478i interfaceC4478iM5205a3 = C4472c.m5205a(new C0453o(C4472c.m5205a(new C3686c(c1998o.f6040e, this.f6159i, C4474e.m5206a(abstractC18425h), this.f6155e, 2)), 27));
        C4474e scope = this.f6159i;
        InterfaceC4478i onboardingService = c1998o.f6009J0;
        C4471b auth = c1998o.f6023R;
        C4474e application = c1998o.f6038d;
        InterfaceC4478i experimentManager2 = this.f6156f;
        InterfaceC4478i analyticsService2 = this.f6158h;
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(onboardingService, "onboardingService");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(experimentManager2, "experimentManager");
        AbstractC16544l.m18094g(analyticsService2, "analyticsService");
        this.f6165o = C4472c.m5205a(new C11423w(scope, interfaceC4478iM5205a3, (InterfaceC17068a) onboardingService, auth, application, (InterfaceC17068a) experimentManager2, (InterfaceC17068a) analyticsService2));
    }

    @Override // p190Hc.InterfaceC3283d
    /* JADX INFO: renamed from: a */
    public final AbstractC17631e mo3169a() {
        return this.f6152b;
    }

    @Override // p1081wc.InterfaceC20901t
    /* JADX INFO: renamed from: b */
    public final InterfaceC20904w mo3164b() {
        return (InterfaceC20904w) this.f6158h.get();
    }

    @Override // p579Xh.InterfaceC9514a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0832p mo3165c() {
        return (InterfaceC0832p) this.f6161k.get();
    }

    @Override // gd.InterfaceC13858H
    /* JADX INFO: renamed from: d */
    public final InterfaceC13849E mo3166d() {
        return (InterfaceC13849E) this.f6156f.get();
    }

    @Override // gd.InterfaceC13858H
    /* JADX INFO: renamed from: e */
    public final C13969n2 mo3167e() {
        return (C13969n2) this.f6157g.get();
    }

    @Override // p190Hc.InterfaceC3283d
    /* JADX INFO: renamed from: f */
    public final AbstractC17640n mo3170f() {
        return (C17637k) this.f6155e.get();
    }

    @Override // p190Hc.InterfaceC3283d
    /* JADX INFO: renamed from: g */
    public final AbstractC18425h mo3171g() {
        return this.f6151a;
    }

    @Override // com.openai.viewmodel.ViewModelFactoryProvider
    /* JADX INFO: renamed from: h */
    public final Set mo3168h() {
        ViewModelFactory viewModelFactory = (ViewModelFactory) this.f6160j.get();
        int i10 = AbstractC11281F.f34166o0;
        return new C11312f0(viewModelFactory);
    }
}
