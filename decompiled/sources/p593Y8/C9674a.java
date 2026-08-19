package p593Y8;

import p1024tb.C19830a;
import p1024tb.InterfaceC19833d;
import p571X9.AbstractC9306j0;
import p663b9.C11262a;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Y8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9674a implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9674a f29162a = new C9674a();

    /* JADX INFO: renamed from: b */
    public static final C18662c f29163b = new C18662c("window", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f29164c = new C18662c("logSourceMetrics", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(2))));

    /* JADX INFO: renamed from: d */
    public static final C18662c f29165d = new C18662c("globalMetrics", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(3))));

    /* JADX INFO: renamed from: e */
    public static final C18662c f29166e = new C18662c("appNamespace", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(4))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C11262a c11262a = (C11262a) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f29163b, c11262a.f34116a);
        interfaceC18664e.mo8316c(f29164c, c11262a.f34117b);
        interfaceC18664e.mo8316c(f29165d, c11262a.f34118c);
        interfaceC18664e.mo8316c(f29166e, c11262a.f34119d);
    }
}
