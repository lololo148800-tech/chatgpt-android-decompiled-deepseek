package p1014t1;

/* JADX INFO: renamed from: t1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C19737n {

    /* JADX INFO: renamed from: a */
    public final long f62477a;

    /* JADX INFO: renamed from: a */
    public static final boolean m20689a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static String m20690b(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19737n) {
            return this.f62477a == ((C19737n) obj).f62477a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f62477a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m20690b(this.f62477a);
    }
}
