package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p320Mj.C5461n;
import p342Nj.C5813g;
import p342Nj.InterfaceC5816j;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: Jj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C4454s implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final C5813g f14498b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5816j f14499c;

    /* JADX INFO: renamed from: d */
    public final C5461n f14500d;

    public C4454s(C5813g c5813g, InterfaceC5816j service, C5461n fallbackModeManager) {
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        this.f14498b = c5813g;
        this.f14499c = service;
        this.f14500d = fallbackModeManager;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C4454s) {
            C5813g c5813g = this.f14498b;
            String str = c5813g.f18968a;
            C5813g c5813g2 = ((C4454s) otherWorker).f14498b;
            if (AbstractC16544l.m18089b(str, c5813g2.f18968a) && AbstractC16544l.m18089b(c5813g.f18969b, c5813g2.f18969b) && c5813g.f18971d == c5813g2.f18971d) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C4452r(this, null));
    }
}
