package p266Kc;

import io.sentry.AbstractC15152P0;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p528Vg.C8285d;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Kc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4637f implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public static final C4637f f15095Y = new C4637f();

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C8285d c8285d = (C8285d) obj;
        AbstractC15152P0.m16336j("apiEnvironment", c8285d.f25823a.name());
        AbstractC15152P0.m16336j("useAuth0Staging", String.valueOf(c8285d.f25825c));
        AbstractC15152P0.m16336j("voiceCanary", String.valueOf(c8285d.f25826d));
        return C17296C.f55119a;
    }
}
