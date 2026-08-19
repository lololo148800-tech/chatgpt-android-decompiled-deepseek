package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p349O0.C5997d;

/* JADX INFO: renamed from: P0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6299u extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6299u f20430c;

    static {
        int i10 = 0;
        f20430c = new C6299u(i10, i10, 3);
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        if (c5947d0.f19377n != 0) {
            C5997d.m6470z("Cannot reset when inserting");
            throw null;
        }
        c5947d0.m6350A();
        c5947d0.f19383t = 0;
        c5947d0.f19384u = c5947d0.m6375m() - c5947d0.f19371h;
        c5947d0.f19372i = 0;
        c5947d0.f19373j = 0;
        c5947d0.f19378o = 0;
    }
}
