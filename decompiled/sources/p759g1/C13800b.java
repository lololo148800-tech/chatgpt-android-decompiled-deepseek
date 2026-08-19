package p759g1;

import p523V9.AbstractC8080e6;
import p523V9.AbstractC8088f6;

/* JADX INFO: renamed from: g1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13800b {

    /* JADX INFO: renamed from: a */
    public final long f43584a;

    public /* synthetic */ C13800b(long j10) {
        this.f43584a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final long m15300a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m15301b(float f10, int i10, long j10) {
        float fIntBitsToFloat = (i10 & 1) != 0 ? Float.intBitsToFloat((int) (j10 >> 32)) : 0.0f;
        if ((i10 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m15300a(fIntBitsToFloat, f10);
    }

    /* JADX INFO: renamed from: c */
    public static final long m15302c(float f10, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m15303d(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: e */
    public static final float m15304e(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    /* JADX INFO: renamed from: f */
    public static final float m15305f(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    /* JADX INFO: renamed from: g */
    public static final float m15306g(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: h */
    public static final float m15307h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: i */
    public static int m15308i(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m15309j(long j10) {
        long j11 = j10 & 9223372034707292159L;
        return (((~j11) & (j11 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    /* JADX INFO: renamed from: k */
    public static final long m15310k(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: l */
    public static final long m15311l(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: m */
    public static final long m15312m(float f10, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: n */
    public static String m15313n(long j10) {
        if (!AbstractC8088f6.m8538d(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC8080e6.m8508c(m15306g(j10)) + ", " + AbstractC8080e6.m8508c(m15307h(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13800b) {
            return this.f43584a == ((C13800b) obj).f43584a;
        }
        return false;
    }

    public final int hashCode() {
        return m15308i(this.f43584a);
    }

    public final String toString() {
        return m15313n(this.f43584a);
    }
}
