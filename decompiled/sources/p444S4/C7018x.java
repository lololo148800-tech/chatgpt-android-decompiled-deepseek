package p444S4;

/* JADX INFO: renamed from: S4.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7018x {

    /* JADX INFO: renamed from: a */
    public final long f22430a;

    /* JADX INFO: renamed from: b */
    public final long f22431b;

    public C7018x(long j10, long j11) {
        this.f22430a = j10;
        this.f22431b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7018x.class.equals(obj.getClass())) {
            return false;
        }
        C7018x c7018x = (C7018x) obj;
        return c7018x.f22430a == this.f22430a && c7018x.f22431b == this.f22431b;
    }

    public final int hashCode() {
        long j10 = this.f22430a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f22431b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f22430a + ", flexIntervalMillis=" + this.f22431b + '}';
    }
}
