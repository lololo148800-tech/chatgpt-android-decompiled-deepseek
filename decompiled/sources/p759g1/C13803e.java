package p759g1;

import p523V9.AbstractC8080e6;

/* JADX INFO: renamed from: g1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13803e {

    /* JADX INFO: renamed from: a */
    public final long f43598a;

    public /* synthetic */ C13803e(long j10) {
        this.f43598a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static long m15329a(float f10, long j10) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15330b(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: c */
    public static final float m15331c(long j10) {
        if (j10 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    /* JADX INFO: renamed from: d */
    public static final float m15332d(long j10) {
        if (j10 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    /* JADX INFO: renamed from: e */
    public static final float m15333e(long j10) {
        if (j10 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m15334f(long j10) {
        if (j10 == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j11 = j10 & (~((((-9223372034707292160L) & j10) >>> 31) * ((long) (-1))));
        return ((j11 & 4294967295L) & (j11 >>> 32)) == 0;
    }

    /* JADX INFO: renamed from: g */
    public static String m15335g(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC8080e6.m8508c(m15333e(j10)) + ", " + AbstractC8080e6.m8508c(m15331c(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13803e) {
            return this.f43598a == ((C13803e) obj).f43598a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f43598a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m15335g(this.f43598a);
    }
}
