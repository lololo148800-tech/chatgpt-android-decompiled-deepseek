package p570X8;

import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9077e implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9077e f27805a = new C9077e();

    /* JADX INFO: renamed from: b */
    public static final C18662c f27806b = C18662c.m20036b("eventTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C18662c f27807c = C18662c.m20036b("eventCode");

    /* JADX INFO: renamed from: d */
    public static final C18662c f27808d = C18662c.m20036b("eventUptimeMs");

    /* JADX INFO: renamed from: e */
    public static final C18662c f27809e = C18662c.m20036b("sourceExtension");

    /* JADX INFO: renamed from: f */
    public static final C18662c f27810f = C18662c.m20036b("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g */
    public static final C18662c f27811g = C18662c.m20036b("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h */
    public static final C18662c f27812h = C18662c.m20036b("networkConnectionInfo");

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        C9083k c9083k = (C9083k) ((AbstractC9090r) obj);
        interfaceC18664e.mo8315b(f27806b, c9083k.f27838a);
        interfaceC18664e.mo8316c(f27807c, c9083k.f27839b);
        interfaceC18664e.mo8315b(f27808d, c9083k.f27840c);
        interfaceC18664e.mo8316c(f27809e, c9083k.f27841d);
        interfaceC18664e.mo8316c(f27810f, c9083k.f27842e);
        interfaceC18664e.mo8315b(f27811g, c9083k.f27843f);
        interfaceC18664e.mo8316c(f27812h, c9083k.f27844g);
    }
}
