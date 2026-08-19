package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p320Mj.C5461n;
import p342Nj.InterfaceC5816j;
import p729ej.InterfaceC13427r;
import p814ik.C15033e;

/* JADX INFO: renamed from: Jj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C4442m implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f14458b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5816j f14459c;

    /* JADX INFO: renamed from: d */
    public final C15033e f14460d;

    /* JADX INFO: renamed from: e */
    public final C5461n f14461e;

    public C4442m(String inquiryId, InterfaceC5816j service, C15033e deviceIdProvider, C5461n fallbackModeManager) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(deviceIdProvider, "deviceIdProvider");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        this.f14458b = inquiryId;
        this.f14459c = service;
        this.f14460d = deviceIdProvider;
        this.f14461e = fallbackModeManager;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C4442m) {
            if (AbstractC16544l.m18089b(this.f14458b, ((C4442m) otherWorker).f14458b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C4440l(this, null));
    }
}
