package p405Qf;

import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import p071Ch.C1692w;
import p1063vf.C20608p;
import p1063vf.C20610r;
import p1149zc.AbstractC21864z;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p364Oh.C6226E;
import p430Rf.C6881c;
import p708dh.C13166t;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: renamed from: Qf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6688c implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21508a = 0;

    /* JADX INFO: renamed from: b */
    public final C4474e f21509b;

    /* JADX INFO: renamed from: c */
    public final C4471b f21510c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f21511d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f21512e;

    /* JADX INFO: renamed from: f */
    public final C4474e f21513f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f21514g;

    public C6688c(C4471b authSessionProvider, InterfaceC17068a accountUserRepository, InterfaceC17068a api, C4474e coroutineScope, InterfaceC4478i interfaceC4478i, C4474e accountSession) {
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f21510c = authSessionProvider;
        this.f21511d = accountUserRepository;
        this.f21514g = api;
        this.f21509b = coroutineScope;
        this.f21512e = interfaceC4478i;
        this.f21513f = accountSession;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f21508a) {
            case 0:
                Object obj = this.f21510c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                AbstractC21864z abstractC21864z = (AbstractC21864z) obj;
                Object obj2 = this.f21511d.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                C13166t c13166t = (C13166t) obj2;
                Object obj3 = this.f21514g.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C6881c c6881c = (C6881c) obj3;
                Object obj4 = this.f21509b.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                C17627a c17627a = (C17627a) obj4;
                Object obj5 = this.f21512e.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                C6689d c6689d = (C6689d) obj5;
                Object obj6 = this.f21513f.f14617a;
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C6687b(abstractC21864z, c13166t, c6881c, c17627a, c6689d, (C18418a) obj6);
            default:
                Object obj7 = this.f21509b.f14617a;
                AbstractC16544l.m18093f(obj7, "get(...)");
                C17627a c17627a2 = (C17627a) obj7;
                Object obj8 = this.f21510c.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                AbstractC21864z abstractC21864z2 = (AbstractC21864z) obj8;
                Object obj9 = this.f21511d.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                C1692w c1692w = (C1692w) obj9;
                Object obj10 = this.f21512e.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                C20610r c20610r = (C20610r) obj10;
                Object obj11 = this.f21513f.f14617a;
                AbstractC16544l.m18093f(obj11, "get(...)");
                C18418a c18418a = (C18418a) obj11;
                Object obj12 = this.f21514g.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C20608p(c17627a2, abstractC21864z2, c1692w, c20610r, c18418a, (C6226E) obj12);
        }
    }

    public C6688c(C4474e scope, C4471b authSessionProvider, InterfaceC17068a playIntegrityService, InterfaceC4478i interfaceC4478i, C4474e accountSession, InterfaceC17068a servicesConfig) {
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(playIntegrityService, "playIntegrityService");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        this.f21509b = scope;
        this.f21510c = authSessionProvider;
        this.f21511d = playIntegrityService;
        this.f21512e = interfaceC4478i;
        this.f21513f = accountSession;
        this.f21514g = servicesConfig;
    }
}
