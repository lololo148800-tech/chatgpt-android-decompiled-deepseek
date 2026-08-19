package p492U1;

import p571X9.AbstractC9119D4;

/* JADX INFO: renamed from: U1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7548m {

    /* JADX INFO: renamed from: b */
    public static final C7549n[] f23908b = {new C7549n(0), new C7549n(4294967296L), new C7549n(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f23909c = AbstractC9119D4.m9652e(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f23910a;

    /* JADX INFO: renamed from: a */
    public static final boolean m7893a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final long m7894b(long j10) {
        return f23908b[(int) ((j10 & 1095216660480L) >>> 32)].f23911a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m7895c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static int m7896d(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: e */
    public static String m7897e(long j10) {
        long jM7894b = m7894b(j10);
        if (C7549n.m7898a(jM7894b, 0L)) {
            return "Unspecified";
        }
        if (C7549n.m7898a(jM7894b, 4294967296L)) {
            return m7895c(j10) + ".sp";
        }
        if (!C7549n.m7898a(jM7894b, 8589934592L)) {
            return "Invalid";
        }
        return m7895c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7548m) {
            return this.f23910a == ((C7548m) obj).f23910a;
        }
        return false;
    }

    public final int hashCode() {
        return m7896d(this.f23910a);
    }

    public final String toString() {
        return m7897e(this.f23910a);
    }
}
