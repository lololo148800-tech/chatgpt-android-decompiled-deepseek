package p370P0;

import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6036w0;
import p571X9.AbstractC9180O;

/* JADX INFO: renamed from: P0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6302x extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6302x f20433c = new C6302x(1, 0, 2);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        int iM6796c = c6277d.m6796c(0);
        int iM6377o = c5947d0.m6377o();
        int i10 = c5947d0.f19385v;
        int iM6355F = c5947d0.m6355F(c5947d0.f19365b, c5947d0.m6378p(i10));
        int iM6369f = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i10 + 1));
        for (int iMax = Math.max(iM6355F, iM6369f - iM6796c); iMax < iM6369f; iMax++) {
            Object obj = c5947d0.f19366c[c5947d0.m6370g(iMax)];
            if (obj instanceof C6036w0) {
                c1313k.m2022i(((C6036w0) obj).f19669a, iM6377o - iMax, -1, -1);
            } else if (obj instanceof C6018n0) {
                ((C6018n0) obj).m6502d();
            }
        }
        C5997d.m6437X(iM6796c > 0);
        int i11 = c5947d0.f19385v;
        int iM6355F2 = c5947d0.m6355F(c5947d0.f19365b, c5947d0.m6378p(i11));
        int iM6369f2 = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i11 + 1)) - iM6796c;
        C5997d.m6437X(iM6369f2 >= iM6355F2);
        c5947d0.m6353D(iM6369f2, iM6796c, i11);
        int i12 = c5947d0.f19372i;
        if (i12 >= iM6355F2) {
            c5947d0.f19372i = i12 - iM6796c;
        }
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: b */
    public final String mo6758b(int i10) {
        return AbstractC9180O.m9737b(i10, 0) ? "count" : super.mo6758b(i10);
    }
}
