package bg;

import android.app.Application;
import gd.C13969n2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import ni.C17636j;
import p041Be.C1219L;
import p1081wc.InterfaceC20904w;
import p1105xc.C21189s;
import p1149zc.AbstractC21864z;
import p220Ih.InterfaceC3721c;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p787he.C14467X;
import p870le.C16916z;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: bg.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C11423w implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34498a = 0;

    /* JADX INFO: renamed from: b */
    public final C4474e f34499b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f34500c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f34501d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f34502e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f34503f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f34504g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f34505h;

    public C11423w(C4474e scope, InterfaceC4478i interfaceC4478i, InterfaceC17068a onboardingService, C4471b auth, C4474e application, InterfaceC17068a experimentManager, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(onboardingService, "onboardingService");
        AbstractC16544l.m18094g(auth, "auth");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f34499b = scope;
        this.f34501d = interfaceC4478i;
        this.f34500c = onboardingService;
        this.f34505h = auth;
        this.f34504g = application;
        this.f34502e = experimentManager;
        this.f34503f = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f34498a) {
            case 0:
                Object obj = this.f34499b.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                C17636j c17636j = (C17636j) obj;
                Object obj2 = this.f34501d.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                C11400B c11400b = (C11400B) obj2;
                Object obj3 = this.f34500c.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C11399A c11399a = (C11399A) obj3;
                Object obj4 = ((C4471b) this.f34505h).get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                AbstractC21864z abstractC21864z = (AbstractC21864z) obj4;
                Object obj5 = ((C4474e) this.f34504g).f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                Application application = (Application) obj5;
                Object obj6 = this.f34502e.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj6;
                Object obj7 = this.f34503f.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                return new C11422v(c17636j, c11400b, c11399a, abstractC21864z, application, interfaceC13849E, (InterfaceC20904w) obj7);
            default:
                Object obj8 = this.f34499b.f14617a;
                AbstractC16544l.m18093f(obj8, "get(...)");
                C17627a c17627a = (C17627a) obj8;
                Object obj9 = this.f34500c.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                C1219L c1219l = (C1219L) obj9;
                Object obj10 = this.f34501d.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                C16916z c16916z = (C16916z) obj10;
                Object obj11 = this.f34502e.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                InterfaceC3721c interfaceC3721c = (InterfaceC3721c) obj11;
                Object obj12 = this.f34503f.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                InterfaceC13849E interfaceC13849E2 = (InterfaceC13849E) obj12;
                Object obj13 = this.f34504g.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                C13969n2 c13969n2 = (C13969n2) obj13;
                Object obj14 = this.f34505h.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                return new C14467X(c17627a, c1219l, c16916z, interfaceC3721c, interfaceC13849E2, c13969n2, (C21189s) obj14);
        }
    }

    public C11423w(C4474e accountUserCoroutineScope, InterfaceC17068a api, InterfaceC4478i interfaceC4478i, InterfaceC17068a modelsRepository, InterfaceC17068a experimentManager, InterfaceC17068a configurationManager, InterfaceC17068a statsc) {
        AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(modelsRepository, "modelsRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(statsc, "statsc");
        this.f34499b = accountUserCoroutineScope;
        this.f34500c = api;
        this.f34501d = interfaceC4478i;
        this.f34502e = modelsRepository;
        this.f34503f = experimentManager;
        this.f34504g = configurationManager;
        this.f34505h = statsc;
    }
}
