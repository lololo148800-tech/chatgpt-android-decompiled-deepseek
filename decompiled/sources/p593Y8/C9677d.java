package p593Y8;

import p1024tb.C19830a;
import p1024tb.InterfaceC19833d;
import p571X9.AbstractC9306j0;
import p663b9.C11266e;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Y8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9677d implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9677d f29172a = new C9677d();

    /* JADX INFO: renamed from: b */
    public static final C18662c f29173b = new C18662c("logSource", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f29174c = new C18662c("logEventDropped", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(2))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C11266e c11266e = (C11266e) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8316c(f29173b, c11266e.f34133a);
        interfaceC18664e.mo8316c(f29174c, c11266e.f34134b);
    }
}
