package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p049Bm.InterfaceC1436k;
import p349O0.C5947D0;
import p349O0.InterfaceC6023q;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6286h extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6286h f20413c = new C6286h(0, 2, 1);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        ((InterfaceC1436k) c6277d.m6798d(0)).invoke((InterfaceC6023q) c6277d.m6798d(1));
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        if (AbstractC9186P.m9747a(i10, 0)) {
            return "anchor";
        }
        return AbstractC9186P.m9747a(i10, 1) ? "composition" : super.mo6759c(i10);
    }
}
