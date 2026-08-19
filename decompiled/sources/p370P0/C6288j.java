package p370P0;

import kotlin.jvm.internal.AbstractC16544l;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;

/* JADX INFO: renamed from: P0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6288j extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6288j f20415c;

    static {
        int i10 = 0;
        f20415c = new C6288j(i10, i10, 3);
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        AbstractC16544l.m18092e(abstractC0865o, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        while (true) {
            int i10 = c5947d0.f19385v;
            if ((i10 < 0 && c5947d0.f19384u > 0) || i10 == 0) {
                break;
            }
            c5947d0.m6354E();
            if (c5947d0.m6382t(c5947d0.f19385v)) {
                abstractC0865o.m1945r();
            }
            c5947d0.m6371i();
        }
        c5947d0.m6371i();
    }
}
