package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p571X9.AbstractC9180O;

/* JADX INFO: renamed from: P0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6298t extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6298t f20429c = new C6298t(2, 0, 2);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        abstractC0865o.mo1943p(c6277d.m6796c(0), c6277d.m6796c(1));
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: b */
    public final String mo6758b(int i10) {
        if (AbstractC9180O.m9737b(i10, 0)) {
            return "removeIndex";
        }
        return AbstractC9180O.m9737b(i10, 1) ? "count" : super.mo6758b(i10);
    }
}
