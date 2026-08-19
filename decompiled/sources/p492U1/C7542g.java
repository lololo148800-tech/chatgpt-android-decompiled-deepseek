package p492U1;

/* JADX INFO: renamed from: U1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7542g {

    /* JADX INFO: renamed from: a */
    public final long f23896a;

    /* JADX INFO: renamed from: a */
    public static final float m7876a(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static final float m7877b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static String m7878c(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C7540e.m7874b(m7877b(j10))) + " x " + ((Object) C7540e.m7874b(m7876a(j10)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7542g) {
            return this.f23896a == ((C7542g) obj).f23896a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23896a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m7878c(this.f23896a);
    }
}
