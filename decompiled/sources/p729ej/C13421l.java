package p729ej;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: ej.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C13421l implements InterfaceC13410a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC13410a f42503Y;

    public C13421l(AbstractC13422m this$0, InterfaceC13410a baseContext) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(baseContext, "baseContext");
        this.f42503Y = baseContext;
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: l */
    public final InterfaceC13418i mo3400l() {
        return this.f42503Y.mo3400l();
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: p */
    public final Object mo3404p(AbstractC13422m child, Object obj, String key, InterfaceC1436k handler) {
        AbstractC16544l.m18094g(child, "child");
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(handler, "handler");
        return this.f42503Y.mo3404p(child, obj, key, handler);
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: z */
    public final void mo3410z(String key, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(key, "key");
        this.f42503Y.mo3410z(key, interfaceC1439n);
    }
}
