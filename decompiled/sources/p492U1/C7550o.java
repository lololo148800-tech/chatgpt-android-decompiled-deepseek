package p492U1;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: U1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7550o {

    /* JADX INFO: renamed from: a */
    public final long f23912a;

    /* JADX INFO: renamed from: a */
    public static final long m7900a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m7901b(long j10, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return m7900a(f10, f11);
    }

    /* JADX INFO: renamed from: c */
    public static final float m7902c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: d */
    public static final float m7903d(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static final long m7904e(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: f */
    public static final long m7905f(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: g */
    public static final long m7906g(float f10, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: h */
    public static String m7907h(long j10) {
        return Separators.LPAREN + m7902c(j10) + ", " + m7903d(j10) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7550o) {
            return this.f23912a == ((C7550o) obj).f23912a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23912a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m7907h(this.f23912a);
    }
}
