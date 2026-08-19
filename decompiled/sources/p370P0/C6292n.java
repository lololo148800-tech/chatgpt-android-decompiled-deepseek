package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5943B0;
import p349O0.C5947D0;
import p349O0.C5995c;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6292n extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6292n f20423c = new C6292n(0, 2, 1);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        C5943B0 c5943b0 = (C5943B0) c6277d.m6798d(1);
        C5995c c5995c = (C5995c) c6277d.m6798d(0);
        c5947d0.m6367d();
        c5995c.getClass();
        c5947d0.m6383u(c5943b0, c5943b0.m6341f(c5995c));
        c5947d0.m6372j();
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        if (AbstractC9186P.m9747a(i10, 0)) {
            return "anchor";
        }
        return AbstractC9186P.m9747a(i10, 1) ? "from" : super.mo6759c(i10);
    }
}
