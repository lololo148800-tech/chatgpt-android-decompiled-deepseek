package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p049Bm.InterfaceC1439n;
import p349O0.C5947D0;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6304z extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6304z f20435c = new C6304z(0, 2, 1);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        ((InterfaceC1439n) c6277d.m6798d(1)).invoke(abstractC0865o.m1934g(), c6277d.m6798d(0));
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        if (AbstractC9186P.m9747a(i10, 0)) {
            return "value";
        }
        return AbstractC9186P.m9747a(i10, 1) ? "block" : super.mo6759c(i10);
    }
}
