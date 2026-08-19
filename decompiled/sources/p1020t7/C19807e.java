package p1020t7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: t7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19807e {

    /* JADX INFO: renamed from: a */
    public final long f62837a;

    /* JADX INFO: renamed from: b */
    public final long f62838b;

    /* JADX INFO: renamed from: c */
    public final long f62839c;

    /* JADX INFO: renamed from: d */
    public final int f62840d;

    /* JADX INFO: renamed from: e */
    public final long f62841e;

    /* JADX INFO: renamed from: f */
    public final long f62842f;

    /* JADX INFO: renamed from: g */
    public final long f62843g;

    public C19807e(long j10, long j11, long j12, int i10, long j13, long j14, long j15) {
        this.f62837a = j10;
        this.f62838b = j11;
        this.f62839c = j12;
        this.f62840d = i10;
        this.f62841e = j13;
        this.f62842f = j14;
        this.f62843g = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19807e)) {
            return false;
        }
        C19807e c19807e = (C19807e) obj;
        return this.f62837a == c19807e.f62837a && this.f62838b == c19807e.f62838b && this.f62839c == c19807e.f62839c && this.f62840d == c19807e.f62840d && this.f62841e == c19807e.f62841e && this.f62842f == c19807e.f62842f && this.f62843g == c19807e.f62843g;
    }

    public final int hashCode() {
        long j10 = this.f62837a;
        long j11 = this.f62838b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f62839c;
        int i11 = (((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f62840d) * 31;
        long j13 = this.f62841e;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f62842f;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f62843g;
        return i13 + ((int) ((j15 >>> 32) ^ j15));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilePersistenceConfig(recentDelayMs=");
        sb2.append(this.f62837a);
        sb2.append(", maxBatchSize=");
        sb2.append(this.f62838b);
        sb2.append(", maxItemSize=");
        sb2.append(this.f62839c);
        sb2.append(", maxItemsPerBatch=");
        sb2.append(this.f62840d);
        sb2.append(", oldFileThreshold=");
        sb2.append(this.f62841e);
        sb2.append(", maxDiskSpace=");
        sb2.append(this.f62842f);
        sb2.append(", cleanupFrequencyThreshold=");
        return AbstractC10763a.m11050h(this.f62843g, Separators.RPAREN, sb2);
    }
}
