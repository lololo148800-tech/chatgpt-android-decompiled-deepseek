package p593Y8;

import p1024tb.C19830a;
import p1024tb.InterfaceC19833d;
import p571X9.AbstractC9306j0;
import p663b9.C11267f;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Y8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9679f implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public static final C9679f f29176a = new C9679f();

    /* JADX INFO: renamed from: b */
    public static final C18662c f29177b = new C18662c("currentCacheSizeBytes", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(1))));

    /* JADX INFO: renamed from: c */
    public static final C18662c f29178c = new C18662c("maxCacheSizeBytes", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(2))));

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        C11267f c11267f = (C11267f) obj;
        InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
        interfaceC18664e.mo8315b(f29177b, c11267f.f34135a);
        interfaceC18664e.mo8315b(f29178c, c11267f.f34136b);
    }
}
