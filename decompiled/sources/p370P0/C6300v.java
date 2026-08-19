package p370P0;

import java.util.ArrayList;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p349O0.C5947D0;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6300v extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6300v f20431c;

    static {
        int i10 = 1;
        f20431c = new C6300v(0, i10, i10);
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        ((ArrayList) c1313k.f3470e).add((InterfaceC1426a) c6277d.m6798d(0));
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        return AbstractC9186P.m9747a(i10, 0) ? "effect" : super.mo6759c(i10);
    }
}
