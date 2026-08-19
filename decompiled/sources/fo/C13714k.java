package fo;

import kotlin.jvm.internal.AbstractC16544l;
import p174Gk.AbstractC3100b;
import p198Hk.C3460c;

/* JADX INFO: renamed from: fo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C13714k implements InterfaceC13708e {

    /* JADX INFO: renamed from: a */
    public final C13713j f43267a;

    /* JADX INFO: renamed from: b */
    public final C13711h f43268b;

    public C13714k(C13711h reachabilityWatcher) {
        AbstractC16544l.m18095h(reachabilityWatcher, "reachabilityWatcher");
        this.f43268b = reachabilityWatcher;
        this.f43267a = new C13713j(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // fo.InterfaceC13708e
    /* JADX INFO: renamed from: a */
    public final void mo15175a() {
        ((C3460c) AbstractC3100b.f9328a.getValue()).f10515a.add(this.f43267a);
    }
}
