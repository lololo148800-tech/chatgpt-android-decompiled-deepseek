package p593Y8;

import p1024tb.C19830a;
import p1024tb.InterfaceC19833d;
import p571X9.AbstractC9306j0;
import p663b9.C11265d;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Y8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9676c implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9676c f29169a = new C9676c();

    /* JADX INFO: renamed from: b */
    public static final C18662c f29170b = new C18662c("eventsDroppedCount", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f29171c = new C18662c("reason", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(3))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C11265d c11265d = (C11265d) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8315b(f29170b, c11265d.f34130a);
        interfaceC18664e.mo8316c(f29171c, c11265d.f34131b);
    }
}
