package p117Eb;

import p1024tb.C19830a;
import p1024tb.InterfaceC19833d;
import p141Fb.C2705d;
import p141Fb.EnumC2702a;
import p141Fb.EnumC2704c;
import p571X9.AbstractC9306j0;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Eb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2371a implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C2371a f7369a = new C2371a();

    /* JADX INFO: renamed from: b */
    public static final C18662c f7370b = new C18662c("projectNumber", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f7371c = new C18662c("messageId", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f7372d = new C18662c("instanceId", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f7373e = new C18662c("messageType", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(4))));

    /* JADX INFO: renamed from: f */
    public static final C18662c f7374f = new C18662c("sdkPlatform", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(5))));

    /* JADX INFO: renamed from: g */
    public static final C18662c f7375g = new C18662c("packageName", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(6))));

    /* JADX INFO: renamed from: h */
    public static final C18662c f7376h = new C18662c("collapseKey", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(7))));

    /* JADX INFO: renamed from: i */
    public static final C18662c f7377i = new C18662c("priority", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(8))));

    /* JADX INFO: renamed from: j */
    public static final C18662c f7378j = new C18662c("ttl", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(9))));

    /* JADX INFO: renamed from: k */
    public static final C18662c f7379k = new C18662c("topic", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(10))));

    /* JADX INFO: renamed from: l */
    public static final C18662c f7380l = new C18662c("bulkId", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(11))));

    /* JADX INFO: renamed from: m */
    public static final C18662c f7381m = new C18662c("event", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(12))));

    /* JADX INFO: renamed from: n */
    public static final C18662c f7382n = new C18662c("analyticsLabel", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(13))));

    /* JADX INFO: renamed from: o */
    public static final C18662c f7383o = new C18662c("campaignId", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(14))));

    /* JADX INFO: renamed from: p */
    public static final C18662c f7384p = new C18662c("composerLabel", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(15))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C2705d c2705d = (C2705d) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8315b(f7370b, c2705d.f8322a);
        interfaceC18664e.mo8316c(f7371c, c2705d.f8323b);
        interfaceC18664e.mo8316c(f7372d, c2705d.f8324c);
        interfaceC18664e.mo8316c(f7373e, c2705d.f8325d);
        interfaceC18664e.mo8316c(f7374f, EnumC2704c.ANDROID);
        interfaceC18664e.mo8316c(f7375g, c2705d.f8326e);
        interfaceC18664e.mo8316c(f7376h, c2705d.f8327f);
        interfaceC18664e.mo8314a(f7377i, c2705d.f8328g);
        interfaceC18664e.mo8314a(f7378j, c2705d.f8329h);
        interfaceC18664e.mo8316c(f7379k, c2705d.f8330i);
        interfaceC18664e.mo8315b(f7380l, 0L);
        interfaceC18664e.mo8316c(f7381m, EnumC2702a.MESSAGE_DELIVERED);
        interfaceC18664e.mo8316c(f7382n, c2705d.f8331j);
        interfaceC18664e.mo8315b(f7383o, 0L);
        interfaceC18664e.mo8316c(f7384p, c2705d.f8332k);
    }
}
