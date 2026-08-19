package p349O0;

import java.util.ArrayList;
import mm.C17314q;
import p197Hj.C3457c;
import p571X9.AbstractC9227W;
import p692d0.C12982u;

/* JADX INFO: renamed from: O0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6006h0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f19502a;

    /* JADX INFO: renamed from: b */
    public final int f19503b;

    /* JADX INFO: renamed from: c */
    public int f19504c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f19505d;

    /* JADX INFO: renamed from: e */
    public final C12982u f19506e;

    /* JADX INFO: renamed from: f */
    public final C17314q f19507f;

    public C6006h0(int i10, ArrayList arrayList) {
        this.f19502a = arrayList;
        this.f19503b = i10;
        if (!(i10 >= 0)) {
            C5997d.m6443b0("Invalid start index");
            throw null;
        }
        this.f19505d = new ArrayList();
        C12982u c12982u = new C12982u();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C5966N c5966n = (C5966N) this.f19502a.get(i12);
            int i13 = c5966n.f19422c;
            int i14 = c5966n.f19423d;
            c12982u.m14697i(i13, new C5954H(i12, i11, i14));
            i11 += i14;
        }
        this.f19506e = c12982u;
        this.f19507f = AbstractC9227W.m9800c(new C3457c(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6476a(int i10, int i11) {
        int i12;
        C12982u c12982u = this.f19506e;
        C5954H c5954h = (C5954H) c12982u.m14694f(i10);
        if (c5954h == null) {
            return false;
        }
        int i13 = c5954h.f19393b;
        int i14 = i11 - c5954h.f19394c;
        c5954h.f19394c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = c12982u.f41206c;
        long[] jArr = c12982u.f41204a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr[i15];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j10) < 128) {
                        C5954H c5954h2 = (C5954H) objArr[(i15 << 3) + i17];
                        if (c5954h2.f19393b >= i13 && !c5954h2.equals(c5954h) && (i12 = c5954h2.f19393b + i14) >= 0) {
                            c5954h2.f19393b = i12;
                        }
                    }
                    j10 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
