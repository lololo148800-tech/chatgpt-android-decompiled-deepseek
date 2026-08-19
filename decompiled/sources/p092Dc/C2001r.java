package p092Dc;

import bb.AbstractC11281F;
import bg.C11423w;
import com.openai.chatgpt.app.p681di.ConversationViewModelFactory_Factory;
import com.openai.viewmodel.ViewModelFactory;
import com.openai.viewmodel.ViewModelFactoryProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17634h;
import p018Ag.C0504i;
import p040Bd.C1002T1;
import p041Be.C1223P;
import p071Ch.C1664D;
import p1025te.C19865P;
import p1128yg.C21540d;
import p118Ec.C2400d;
import p148Fi.AbstractC2792U0;
import p151Fl.C2913s;
import p217Ie.C3709e;
import p218If.C3711b;
import p248Jk.C4471b;
import p248Jk.C4472c;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4478i;
import p337Nd.C5710c;
import p342Nj.C5815i;
import p404Qe.C6676l;
import p481Tf.C7416u;
import p577Xf.C9505d;
import p787he.C14460P;
import p873lh.C16951b;
import p876lm.InterfaceC17068a;
import tf.C19910O;

/* JADX INFO: renamed from: Dc.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C2001r implements ViewModelFactoryProvider {

    /* JADX INFO: renamed from: A */
    public final InterfaceC4478i f6089A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC4478i f6090B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC4478i f6091C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC4478i f6092D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC4478i f6093E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC4478i f6094F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC4478i f6095G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC4478i f6096H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC4478i f6097I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC4478i f6098J;

    /* JADX INFO: renamed from: a */
    public final C17634h f6099a;

    /* JADX INFO: renamed from: b */
    public final C1998o f6100b;

    /* JADX INFO: renamed from: c */
    public final C2005v f6101c;

    /* JADX INFO: renamed from: d */
    public final C1996m f6102d;

    /* JADX INFO: renamed from: e */
    public final C2001r f6103e = this;

    /* JADX INFO: renamed from: f */
    public final C4474e f6104f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4478i f6105g;

    /* JADX INFO: renamed from: h */
    public final C4474e f6106h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4478i f6107i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4478i f6108j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4478i f6109k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4478i f6110l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4478i f6111m;

    /* JADX INFO: renamed from: n */
    public final C4471b f6112n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4478i f6113o;

    /* JADX INFO: renamed from: p */
    public final C4471b f6114p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4478i f6115q;

    /* JADX INFO: renamed from: r */
    public final C4471b f6116r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4478i f6117s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC4478i f6118t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC4478i f6119u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC4478i f6120v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC4478i f6121w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4478i f6122x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4478i f6123y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC4478i f6124z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2001r(C1998o c1998o, C2005v c2005v, C1996m c1996m, C5710c c5710c, C17634h c17634h) {
        this.f6100b = c1998o;
        this.f6101c = c2005v;
        this.f6102d = c1996m;
        this.f6099a = c17634h;
        C4474e c4474eM5206a = C4474e.m5206a(c17634h);
        this.f6104f = c4474eM5206a;
        this.f6105g = C4472c.m5205a(new ConversationViewModelFactory_Factory(c4474eM5206a, new C2000q(this, 0)));
        C4474e c4474eM5206a2 = C4474e.m5206a(c5710c);
        this.f6106h = c4474eM5206a2;
        this.f6107i = C4472c.m5205a(new C1993j(c4474eM5206a2, 10, (boolean) (0 == true ? 1 : 0)));
        C1992i clock = c1998o.f6013L0;
        InterfaceC4478i integrityTokenGenerator = c1998o.f6045g0;
        InterfaceC4478i devicePreferences = c1998o.f6048i;
        C4474e accountSession = c1996m.f5946f;
        InterfaceC4478i analytics = c1996m.f5962n;
        AbstractC16544l.m18094g(clock, "clock");
        AbstractC16544l.m18094g(integrityTokenGenerator, "integrityTokenGenerator");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(analytics, "analytics");
        InterfaceC4478i interfaceC4478iM5205a = C4472c.m5205a(new C1664D(clock, (InterfaceC17068a) integrityTokenGenerator, (InterfaceC17068a) devicePreferences, accountSession, (InterfaceC17068a) analytics));
        this.f6108j = interfaceC4478iM5205a;
        C4474e accountUserCoroutineScope = c1996m.f5948g;
        InterfaceC4478i api = c1996m.f5941c0;
        InterfaceC4478i modelsRepository = c1996m.f5975t0;
        InterfaceC4478i experimentManager = c1996m.f5964o;
        InterfaceC4478i configurationManager = c1996m.f5952i;
        InterfaceC4478i statsc = c1998o.f6015M0;
        AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(modelsRepository, "modelsRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(statsc, "statsc");
        this.f6109k = C4472c.m5205a(new C11423w(accountUserCoroutineScope, api, interfaceC4478iM5205a, modelsRepository, experimentManager, configurationManager, statsc));
        C4474e context = c1998o.f6038d;
        InterfaceC4478i layerManager = c1996m.f5954j;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        this.f6110l = C4472c.m5205a(new C3711b(context, layerManager, 2));
        this.f6111m = C4472c.m5205a(C19865P.f62968a);
        C4471b c4471b = new C4471b();
        this.f6112n = c4471b;
        C4474e coroutineScope = this.f6104f;
        InterfaceC4478i stringResolver = c1998o.f6006I;
        InterfaceC4478i experimentManager2 = c1996m.f5964o;
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(experimentManager2, "experimentManager");
        this.f6113o = C4472c.m5205a(new C1989f(coroutineScope, c4471b, (InterfaceC17068a) stringResolver, (InterfaceC17068a) experimentManager2));
        this.f6114p = new C4471b();
        InterfaceC4478i requester = c1996m.f5976u;
        AbstractC16544l.m18094g(requester, "requester");
        C1223P c1223p = new C1223P(requester, 7);
        InterfaceC4478i conversationIdsProvider = this.f6107i;
        C4474e application = c1998o.f6038d;
        InterfaceC4478i fileServiceApi = c1998o.f5995C0;
        C1992i fileDownloader = c1998o.f6017N0;
        C4471b inputDecorationProvider = this.f6112n;
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(fileServiceApi, "fileServiceApi");
        AbstractC16544l.m18094g(fileDownloader, "fileDownloader");
        AbstractC16544l.m18094g(inputDecorationProvider, "inputDecorationProvider");
        this.f6115q = C4472c.m5205a(new C6676l((InterfaceC17068a) conversationIdsProvider, application, c1223p, (InterfaceC17068a) fileServiceApi, fileDownloader, inputDecorationProvider));
        C4474e c4474e = C4479j.f14619c;
        ArrayList arrayList = new ArrayList(3);
        List listEmptyList = Collections.emptyList();
        arrayList.add(this.f6113o);
        arrayList.add(this.f6114p);
        arrayList.add(this.f6115q);
        C4471b.m5204a(this.f6112n, C4472c.m5205a(new C5815i(new C4479j(arrayList, listEmptyList), 1)));
        C4471b c4471b2 = new C4471b();
        this.f6116r = c4471b2;
        InterfaceC4478i gizmosRepository = c1996m.f5934Y;
        C4474e screenCoroutineScope = this.f6104f;
        C4474e conversationInfo = this.f6106h;
        C4474e accountSession2 = c1996m.f5946f;
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(screenCoroutineScope, "screenCoroutineScope");
        AbstractC16544l.m18094g(conversationInfo, "conversationInfo");
        AbstractC16544l.m18094g(accountSession2, "accountSession");
        InterfaceC4478i interfaceC4478iM5205a2 = C4472c.m5205a(new C1664D((InterfaceC17068a) gizmosRepository, screenCoroutineScope, conversationInfo, accountSession2, c4471b2));
        this.f6117s = interfaceC4478iM5205a2;
        C4471b c4471b3 = this.f6114p;
        C4474e application2 = c1998o.f6038d;
        InterfaceC4478i inputStateFlow = this.f6111m;
        C4471b inputDecorationProvider2 = this.f6112n;
        AbstractC16544l.m18094g(application2, "application");
        AbstractC16544l.m18094g(inputStateFlow, "inputStateFlow");
        AbstractC16544l.m18094g(inputDecorationProvider2, "inputDecorationProvider");
        C4471b.m5204a(c4471b3, C4472c.m5205a(new C3709e(application2, inputStateFlow, inputDecorationProvider2, interfaceC4478iM5205a2)));
        ArrayList arrayList2 = new ArrayList(3);
        List listEmptyList2 = Collections.emptyList();
        arrayList2.add(this.f6110l);
        arrayList2.add(this.f6114p);
        arrayList2.add(this.f6115q);
        C4479j c4479j = new C4479j(arrayList2, listEmptyList2);
        C4471b c4471b4 = this.f6116r;
        InterfaceC4478i conversationIdsProvider2 = this.f6107i;
        InterfaceC4478i repository = c1996m.f5951h0;
        InterfaceC4478i service = this.f6109k;
        InterfaceC4478i settingsRepository = c1996m.f5904D;
        C4474e coroutineScope2 = this.f6104f;
        InterfaceC4478i latencyTracker = c1996m.f5977u0;
        InterfaceC4478i networkErrorMapper = c1998o.f6035b0;
        InterfaceC4478i conversationItemMapper = c1996m.f5979v0;
        C4474e accountSession3 = c1996m.f5946f;
        InterfaceC4478i variantsInStreamManager = c1996m.f5981w0;
        InterfaceC4478i activelyStreamingConversationRepository = c1996m.f5957k0;
        InterfaceC4478i unreadConversationRepository = c1996m.f5953i0;
        InterfaceC4478i searchModeRepository = this.f6113o;
        InterfaceC4478i stringResolver2 = c1998o.f6006I;
        InterfaceC4478i analyticsService = c1996m.f5962n;
        InterfaceC4478i experimentManager3 = c1996m.f5964o;
        AbstractC16544l.m18094g(conversationIdsProvider2, "conversationIdsProvider");
        AbstractC16544l.m18094g(repository, "repository");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(coroutineScope2, "coroutineScope");
        AbstractC16544l.m18094g(latencyTracker, "latencyTracker");
        AbstractC16544l.m18094g(networkErrorMapper, "networkErrorMapper");
        AbstractC16544l.m18094g(conversationItemMapper, "conversationItemMapper");
        AbstractC16544l.m18094g(accountSession3, "accountSession");
        AbstractC16544l.m18094g(variantsInStreamManager, "variantsInStreamManager");
        AbstractC16544l.m18094g(activelyStreamingConversationRepository, "activelyStreamingConversationRepository");
        AbstractC16544l.m18094g(unreadConversationRepository, "unreadConversationRepository");
        AbstractC16544l.m18094g(searchModeRepository, "searchModeRepository");
        AbstractC16544l.m18094g(stringResolver2, "stringResolver");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(experimentManager3, "experimentManager");
        C4471b.m5204a(c4471b4, C4472c.m5205a(new C14460P(conversationIdsProvider2, repository, service, settingsRepository, coroutineScope2, latencyTracker, networkErrorMapper, conversationItemMapper, c4479j, accountSession3, variantsInStreamManager, activelyStreamingConversationRepository, unreadConversationRepository, searchModeRepository, stringResolver2, analyticsService, experimentManager3)));
        InterfaceC4478i analytics2 = c1996m.f5962n;
        C4471b conversationCoordinator = this.f6116r;
        AbstractC16544l.m18094g(analytics2, "analytics");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        this.f6118t = C4472c.m5205a(new C0504i(conversationCoordinator, analytics2));
        ArrayList arrayList3 = new ArrayList(1);
        List listEmptyList3 = Collections.emptyList();
        arrayList3.add(this.f6118t);
        C4479j c4479j2 = new C4479j(arrayList3, listEmptyList3);
        C4474e scope = this.f6104f;
        AbstractC16544l.m18094g(scope, "scope");
        this.f6119u = C4472c.m5205a(new C2400d(c4479j2, scope, 1));
        InterfaceC4478i appCoroutineScope = c1998o.f6042f;
        AbstractC16544l.m18094g(appCoroutineScope, "appCoroutineScope");
        this.f6120v = C4472c.m5205a(new C16951b(appCoroutineScope, 3));
        this.f6121w = C4472c.m5205a(C21540d.f68226a);
        C1998o c1998o2 = this.f6100b;
        C4474e context2 = c1998o2.f6038d;
        AbstractC16544l.m18094g(context2, "context");
        InterfaceC4478i interfaceC4478iM5205a3 = C4472c.m5205a(new C1993j(context2, 7));
        C4471b conversationCoordinator2 = this.f6116r;
        C1996m c1996m2 = this.f6102d;
        InterfaceC4478i configurationManager2 = c1996m2.f5952i;
        InterfaceC4478i assistantSessionProvider = c1998o2.f5999E0;
        AbstractC16544l.m18094g(conversationCoordinator2, "conversationCoordinator");
        AbstractC16544l.m18094g(configurationManager2, "configurationManager");
        AbstractC16544l.m18094g(assistantSessionProvider, "assistantSessionProvider");
        this.f6122x = C4472c.m5205a(new C1989f(conversationCoordinator2, (InterfaceC17068a) configurationManager2, interfaceC4478iM5205a3, (InterfaceC17068a) assistantSessionProvider));
        InterfaceC4478i modelsRepository2 = c1996m2.f5975t0;
        C4471b conversationCoordinator3 = this.f6116r;
        C4474e accountSession4 = c1996m2.f5946f;
        AbstractC16544l.m18094g(modelsRepository2, "modelsRepository");
        AbstractC16544l.m18094g(conversationCoordinator3, "conversationCoordinator");
        AbstractC16544l.m18094g(accountSession4, "accountSession");
        this.f6123y = C4472c.m5205a(new C9505d(modelsRepository2, conversationCoordinator3, accountSession4));
        this.f6124z = C4472c.m5205a(AbstractC2792U0.f8519a);
        C4471b conversationCoordinator4 = this.f6116r;
        InterfaceC4478i provider = c1996m2.f5983x0;
        C4474e scope2 = this.f6104f;
        AbstractC16544l.m18094g(conversationCoordinator4, "conversationCoordinator");
        AbstractC16544l.m18094g(provider, "provider");
        AbstractC16544l.m18094g(scope2, "scope");
        this.f6089A = C4472c.m5205a(new C9505d(conversationCoordinator4, provider, scope2));
        InterfaceC4478i api2 = c1996m2.f5901B0;
        InterfaceC4478i gizmoIdProvider = this.f6117s;
        C4471b conversationCoordinator5 = this.f6116r;
        InterfaceC4478i modelsRepository3 = c1996m2.f5975t0;
        AbstractC16544l.m18094g(api2, "api");
        AbstractC16544l.m18094g(gizmoIdProvider, "gizmoIdProvider");
        AbstractC16544l.m18094g(conversationCoordinator5, "conversationCoordinator");
        AbstractC16544l.m18094g(modelsRepository3, "modelsRepository");
        this.f6090B = C4472c.m5205a(new C1989f(conversationCoordinator5, (InterfaceC17068a) api2, (InterfaceC17068a) gizmoIdProvider, (InterfaceC17068a) modelsRepository3));
        C4474e coroutineScope3 = this.f6104f;
        C4471b conversationCoordinator6 = this.f6116r;
        AbstractC16544l.m18094g(coroutineScope3, "coroutineScope");
        AbstractC16544l.m18094g(conversationCoordinator6, "conversationCoordinator");
        this.f6091C = C4472c.m5205a(new C2913s(coroutineScope3, conversationCoordinator6));
        this.f6092D = C4472c.m5205a(C19910O.f63108a);
        InterfaceC4478i imageDownloader = c1996m2.f5913H0;
        InterfaceC4478i fileServiceApi2 = c1998o2.f5995C0;
        AbstractC16544l.m18094g(imageDownloader, "imageDownloader");
        AbstractC16544l.m18094g(fileServiceApi2, "fileServiceApi");
        this.f6093E = C4472c.m5205a(new C1002T1(imageDownloader, fileServiceApi2, 12));
        InterfaceC4478i analyticsService2 = c1996m2.f5962n;
        AbstractC16544l.m18094g(analyticsService2, "analyticsService");
        this.f6094F = C4472c.m5205a(new C16951b(analyticsService2, 12));
        C4474e context3 = c1998o2.f6038d;
        C4474e scope3 = c1996m2.f5948g;
        InterfaceC4478i releaseCompletable = c1996m2.f5986z;
        InterfaceC4478i customDataSourceFactory = c1996m2.f5915I0;
        AbstractC16544l.m18094g(context3, "context");
        AbstractC16544l.m18094g(scope3, "scope");
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        AbstractC16544l.m18094g(customDataSourceFactory, "customDataSourceFactory");
        this.f6095G = C4472c.m5205a(new C7416u(context3, scope3, releaseCompletable, customDataSourceFactory, 4));
        C4474e conversationInfo2 = this.f6106h;
        InterfaceC4478i analyticsService3 = c1996m2.f5962n;
        AbstractC16544l.m18094g(conversationInfo2, "conversationInfo");
        AbstractC16544l.m18094g(analyticsService3, "analyticsService");
        this.f6096H = C4472c.m5205a(new C3711b(conversationInfo2, analyticsService3, 0));
        InterfaceC4478i api3 = c1996m2.f5917J0;
        InterfaceC4478i conversationRepository = c1996m2.f5951h0;
        AbstractC16544l.m18094g(api3, "api");
        AbstractC16544l.m18094g(conversationRepository, "conversationRepository");
        this.f6097I = C4472c.m5205a(new C1002T1(api3, conversationRepository, 3));
        C4471b conversationCoordinator7 = this.f6116r;
        InterfaceC4478i conversationService = c1996m2.f5943d0;
        AbstractC16544l.m18094g(conversationCoordinator7, "conversationCoordinator");
        AbstractC16544l.m18094g(conversationService, "conversationService");
        this.f6098J = C4472c.m5205a(new C0504i(conversationCoordinator7, conversationService, 2));
    }

    @Override // com.openai.viewmodel.ViewModelFactoryProvider
    /* JADX INFO: renamed from: h */
    public final Set mo3168h() {
        return AbstractC11281F.m12704s(2, (ViewModelFactory) this.f6102d.f5966p.get(), (ViewModelFactory) this.f6105g.get());
    }
}
