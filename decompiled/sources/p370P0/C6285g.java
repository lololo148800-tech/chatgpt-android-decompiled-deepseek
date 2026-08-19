package p370P0;

import kotlin.jvm.internal.AbstractC16544l;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6285g extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6285g f20412c = new C6285g(0, 1, 1);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        AbstractC16544l.m18092e(abstractC0865o, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) c6277d.m6798d(0)) {
            abstractC0865o.m1933f(obj);
        }
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        return AbstractC9186P.m9747a(i10, 0) ? "nodes" : super.mo6759c(i10);
    }
}
