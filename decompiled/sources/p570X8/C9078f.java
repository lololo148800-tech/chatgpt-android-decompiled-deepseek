package p570X8;

import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9078f implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9078f f27813a = new C9078f();

    /* JADX INFO: renamed from: b */
    public static final C18662c f27814b = C18662c.m20036b("requestTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C18662c f27815c = C18662c.m20036b("requestUptimeMs");

    /* JADX INFO: renamed from: d */
    public static final C18662c f27816d = C18662c.m20036b("clientInfo");

    /* JADX INFO: renamed from: e */
    public static final C18662c f27817e = C18662c.m20036b("logSource");

    /* JADX INFO: renamed from: f */
    public static final C18662c f27818f = C18662c.m20036b("logSourceName");

    /* JADX INFO: renamed from: g */
    public static final C18662c f27819g = C18662c.m20036b("logEvent");

    /* JADX INFO: renamed from: h */
    public static final C18662c f27820h = C18662c.m20036b("qosTier");

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        C9084l c9084l = (C9084l) ((AbstractC9091s) obj);
        interfaceC18664e.mo8315b(f27814b, c9084l.f27845a);
        interfaceC18664e.mo8315b(f27815c, c9084l.f27846b);
        interfaceC18664e.mo8316c(f27816d, c9084l.f27847c);
        interfaceC18664e.mo8316c(f27817e, c9084l.f27848d);
        interfaceC18664e.mo8316c(f27818f, c9084l.f27849e);
        interfaceC18664e.mo8316c(f27819g, c9084l.f27850f);
        interfaceC18664e.mo8316c(f27820h, EnumC9095w.f27860Y);
    }
}
