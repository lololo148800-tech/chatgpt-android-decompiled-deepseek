package p018Ag;

import kotlin.jvm.internal.AbstractC16544l;
import p016Ae.C0452n;
import p1081wc.InterfaceC20904w;
import p1105xc.C21185o;
import p1151ze.C21878b;
import p146Fg.C2734c;
import p193Hf.C3414w1;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p364Oh.C6226E;
import p432Rh.C6901n;
import p787he.C14459O;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Ag.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0504i implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1637a;

    /* JADX INFO: renamed from: b */
    public final C4471b f1638b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f1639c;

    public C0504i(C4471b conversationCoordinator, InterfaceC17068a analytics) {
        this.f1637a = 4;
        AbstractC16544l.m18094g(analytics, "analytics");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        this.f1639c = analytics;
        this.f1638b = conversationCoordinator;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f1637a) {
            case 0:
                Object obj = this.f1638b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f1639c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C0503h((C6901n) obj, (C6226E) obj2);
            case 1:
                Object obj3 = this.f1638b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f1639c.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C2734c((C6901n) obj3, (C6226E) obj4);
            case 2:
                Object obj5 = this.f1638b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f1639c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C3414w1((C14459O) obj5, (C0452n) obj6);
            case 3:
                Object obj7 = this.f1638b.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f1639c.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C21185o((C6901n) obj7, (C6226E) obj8);
            default:
                Object obj9 = this.f1639c.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f1638b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C21878b((InterfaceC20904w) obj9, (C14459O) obj10);
        }
    }

    public C0504i(C4471b requester, InterfaceC17068a servicesConfig, int i10) {
        this.f1637a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(requester, "requester");
                AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
                this.f1638b = requester;
                this.f1639c = servicesConfig;
                break;
            case 2:
                AbstractC16544l.m18094g(requester, "conversationCoordinator");
                AbstractC16544l.m18094g(servicesConfig, "conversationService");
                this.f1638b = requester;
                this.f1639c = servicesConfig;
                break;
            case 3:
                AbstractC16544l.m18094g(requester, "requester");
                AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
                this.f1638b = requester;
                this.f1639c = servicesConfig;
                break;
            default:
                AbstractC16544l.m18094g(requester, "requester");
                AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
                this.f1638b = requester;
                this.f1639c = servicesConfig;
                break;
        }
    }
}
