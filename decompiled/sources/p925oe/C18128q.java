package p925oe;

import gd.C13969n2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import p092Dc.C1991h;
import p094De.C2029l;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p481Tf.C7403h;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: oe.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18128q implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final C4474e f57825a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f57826b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f57827c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f57828d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f57829e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f57830f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f57831g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f57832h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f57833i;

    public C18128q(C4474e coroutineScope, InterfaceC17068a notificationDisplayService, InterfaceC17068a cache, InterfaceC17068a unreadConversationRepository, InterfaceC17068a stringResolver, InterfaceC17068a store, InterfaceC17068a configurationManager, InterfaceC17068a experimentManager, InterfaceC17068a conversationRepository) {
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(notificationDisplayService, "notificationDisplayService");
        AbstractC16544l.m18094g(cache, "cache");
        AbstractC16544l.m18094g(unreadConversationRepository, "unreadConversationRepository");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(conversationRepository, "conversationRepository");
        this.f57825a = coroutineScope;
        this.f57826b = notificationDisplayService;
        this.f57827c = cache;
        this.f57828d = unreadConversationRepository;
        this.f57829e = stringResolver;
        this.f57830f = store;
        this.f57831g = configurationManager;
        this.f57832h = experimentManager;
        this.f57833i = conversationRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f57825a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        C17627a c17627a = (C17627a) obj;
        Object obj2 = this.f57826b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C7403h c7403h = (C7403h) obj2;
        Object obj3 = this.f57827c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C2029l c2029l = (C2029l) obj3;
        Object obj4 = this.f57828d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C18114g0 c18114g0 = (C18114g0) obj4;
        Object obj5 = this.f57829e.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C1991h c1991h = (C1991h) obj5;
        Object obj6 = this.f57830f.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C18129r c18129r = (C18129r) obj6;
        Object obj7 = this.f57831g.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        C13969n2 c13969n2 = (C13969n2) obj7;
        Object obj8 = this.f57832h.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj8;
        Object obj9 = this.f57833i.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        return new C18127p(c17627a, c7403h, c2029l, c18114g0, c1991h, c18129r, c13969n2, interfaceC13849E, (C18077B) obj9);
    }
}
