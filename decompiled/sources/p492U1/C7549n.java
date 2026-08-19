package p492U1;

/* JADX INFO: renamed from: U1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7549n {

    /* JADX INFO: renamed from: a */
    public final long f23911a;

    /* JADX INFO: renamed from: a */
    public static final boolean m7898a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static String m7899b(long j10) {
        if (m7898a(j10, 0L)) {
            return "Unspecified";
        }
        if (m7898a(j10, 4294967296L)) {
            return "Sp";
        }
        return m7898a(j10, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7549n) {
            return this.f23911a == ((C7549n) obj).f23911a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f23911a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m7899b(this.f23911a);
    }
}
