package p492U1;

import p571X9.AbstractC9306j0;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;

/* JADX INFO: renamed from: U1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7536a {

    /* JADX INFO: renamed from: a */
    public final long f23888a;

    public /* synthetic */ C7536a(long j10) {
        this.f23888a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final long m7846a(int i10, int i11, int i12, int i13) {
        if (!(i12 >= 0 && i10 >= 0)) {
            AbstractC9406z4.m9983b("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0");
            throw null;
        }
        if (!(i11 >= i10)) {
            AbstractC9406z4.m9983b("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')');
            throw null;
        }
        if (i13 >= i12) {
            return AbstractC9388w4.m9966i(i10, i11, i12, i13);
        }
        AbstractC9406z4.m9983b("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')');
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m7847b(long j10, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = m7856k(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = m7854i(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = m7855j(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = m7853h(j10);
        }
        return m7846a(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7848c(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7849d(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7850e(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m7851f(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m7852g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final int m7853h(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m7854i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (int) (j10 >> 33);
        int i12 = i11 & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    /* JADX INFO: renamed from: j */
    public static final int m7855j(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final int m7856k(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m7857l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0 || (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0;
    }

    /* JADX INFO: renamed from: m */
    public static String m7858m(long j10) {
        int iM7854i = m7854i(j10);
        String strValueOf = iM7854i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM7854i);
        int iM7853h = m7853h(j10);
        String strValueOf2 = iM7853h != Integer.MAX_VALUE ? String.valueOf(iM7853h) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(m7856k(j10));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(m7855j(j10));
        sb2.append(", maxHeight = ");
        return AbstractC9306j0.m9892k(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7536a) {
            return this.f23888a == ((C7536a) obj).f23888a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23888a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m7858m(this.f23888a);
    }
}
