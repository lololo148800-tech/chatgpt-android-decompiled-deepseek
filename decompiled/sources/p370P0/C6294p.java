package p370P0;

import java.util.ArrayList;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p349O0.C5995c;
import p349O0.C5997d;
import p571X9.AbstractC9180O;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: P0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6294p extends AbstractC6276C {

    /* JADX INFO: renamed from: c */
    public static final C6294p f20425c = new C6294p(1, 0, 2);

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        C5995c c5995c;
        int iM6366c;
        int iM6796c = c6277d.m6796c(0);
        if (!(c5947d0.f19377n == 0)) {
            C5997d.m6470z("Cannot move a group while inserting");
            throw null;
        }
        if (!(iM6796c >= 0)) {
            C5997d.m6470z("Parameter offset is out of bounds");
            throw null;
        }
        if (iM6796c == 0) {
            return;
        }
        int i10 = c5947d0.f19383t;
        int i11 = c5947d0.f19385v;
        int i12 = c5947d0.f19384u;
        int i13 = i10;
        while (iM6796c > 0) {
            i13 += c5947d0.f19365b[(c5947d0.m6378p(i13) * 5) + 3];
            if (i13 > i12) {
                C5997d.m6470z("Parameter offset is out of bounds");
                throw null;
            }
            iM6796c--;
        }
        int i14 = c5947d0.f19365b[(c5947d0.m6378p(i13) * 5) + 3];
        int iM6369f = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(c5947d0.f19383t));
        int iM6369f2 = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i13));
        int i15 = i13 + i14;
        int iM6369f3 = c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(i15));
        int i16 = iM6369f3 - iM6369f2;
        c5947d0.m6381s(i16, Math.max(c5947d0.f19383t - 1, 0));
        c5947d0.m6380r(i14);
        int[] iArr = c5947d0.f19365b;
        int iM6378p = c5947d0.m6378p(i15) * 5;
        AbstractC17678l.m19303j(c5947d0.m6378p(i10) * 5, iM6378p, (i14 * 5) + iM6378p, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = c5947d0.f19366c;
            AbstractC17678l.m19304k(iM6369f, c5947d0.m6370g(iM6369f2 + i16), c5947d0.m6370g(iM6369f3 + i16), objArr, objArr);
        }
        int i17 = iM6369f2 + i16;
        int i18 = i17 - iM6369f;
        int i19 = c5947d0.f19374k;
        int i20 = c5947d0.f19375l;
        int length = c5947d0.f19366c.length;
        int i21 = c5947d0.f19376m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iM6378p2 = c5947d0.m6378p(i23);
            int i24 = i22;
            int i25 = i18;
            iArr[(iM6378p2 * 5) + 4] = C5947D0.m6349h(C5947D0.m6349h(c5947d0.m6369f(iArr, iM6378p2) - i18, i21 < iM6378p2 ? 0 : i19, i20, length), c5947d0.f19374k, c5947d0.f19375l, c5947d0.f19366c.length);
            i23++;
            i18 = i25;
            i22 = i24;
            i19 = i19;
            i20 = i20;
        }
        int i26 = i15 + i14;
        int iM6376n = c5947d0.m6376n();
        int iM6461q = C5997d.m6461q(c5947d0.f19367d, i15, iM6376n);
        ArrayList arrayList = new ArrayList();
        if (iM6461q >= 0) {
            while (iM6461q < c5947d0.f19367d.size() && (iM6366c = c5947d0.m6366c((c5995c = (C5995c) c5947d0.f19367d.get(iM6461q)))) >= i15 && iM6366c < i26) {
                arrayList.add(c5995c);
                c5947d0.f19367d.remove(iM6461q);
            }
        }
        int i27 = i10 - i15;
        int size = arrayList.size();
        for (int i28 = 0; i28 < size; i28++) {
            C5995c c5995c2 = (C5995c) arrayList.get(i28);
            int iM6366c2 = c5947d0.m6366c(c5995c2) + i27;
            if (iM6366c2 >= c5947d0.f19370g) {
                c5995c2.f19473a = -(iM6376n - iM6366c2);
            } else {
                c5995c2.f19473a = iM6366c2;
            }
            c5947d0.f19367d.add(C5997d.m6461q(c5947d0.f19367d, iM6366c2, iM6376n), c5995c2);
        }
        if (c5947d0.m6352C(i15, i14)) {
            C5997d.m6470z("Unexpectedly removed anchors");
            throw null;
        }
        c5947d0.m6374l(i11, c5947d0.f19384u, i10);
        if (i16 > 0) {
            c5947d0.m6353D(i17, i16, i15 - 1);
        }
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: b */
    public final String mo6758b(int i10) {
        return AbstractC9180O.m9737b(i10, 0) ? "offset" : super.mo6758b(i10);
    }
}
