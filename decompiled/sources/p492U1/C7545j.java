package p492U1;

/* JADX INFO: renamed from: U1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7545j {

    /* JADX INFO: renamed from: a */
    public final long f23903a;

    /* JADX INFO: renamed from: a */
    public static final boolean m7886a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final int m7887b(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final int m7888c(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: d */
    public static int m7889d(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: e */
    public static String m7890e(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7545j) {
            return this.f23903a == ((C7545j) obj).f23903a;
        }
        return false;
    }

    public final int hashCode() {
        return m7889d(this.f23903a);
    }

    public final String toString() {
        return m7890e(this.f23903a);
    }
}
