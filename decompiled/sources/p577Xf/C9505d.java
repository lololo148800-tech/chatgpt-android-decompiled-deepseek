package p577Xf;

import kotlin.jvm.internal.AbstractC16544l;
import ne.C17600b;
import ni.C17634h;
import p220Ih.InterfaceC3721c;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: renamed from: Xf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C9505d implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28621a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f28622b;

    /* JADX INFO: renamed from: c */
    public final C4471b f28623c;

    /* JADX INFO: renamed from: d */
    public final C4474e f28624d;

    public C9505d(InterfaceC17068a modelsRepository, C4471b conversationCoordinator, C4474e accountSession) {
        AbstractC16544l.m18094g(modelsRepository, "modelsRepository");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f28622b = modelsRepository;
        this.f28623c = conversationCoordinator;
        this.f28624d = accountSession;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f28621a) {
            case 0:
                Object obj = this.f28623c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f28624d.f14617a;
                AbstractC16544l.m18093f(obj2, "get(...)");
                InterfaceC17068a provider = this.f28622b;
                AbstractC16544l.m18094g(provider, "provider");
                return new C9504c((C14459O) obj, provider, (C17634h) obj2);
            default:
                Object obj3 = this.f28622b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f28623c.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = this.f28624d.f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C17600b((InterfaceC3721c) obj3, (C14459O) obj4, (C18418a) obj5);
        }
    }

    public C9505d(C4471b conversationCoordinator, InterfaceC17068a provider, C4474e scope) {
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(provider, "provider");
        AbstractC16544l.m18094g(scope, "scope");
        this.f28623c = conversationCoordinator;
        this.f28622b = provider;
        this.f28624d = scope;
    }
}
