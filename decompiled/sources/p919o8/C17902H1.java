package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17902H1 {

    /* JADX INFO: renamed from: a */
    public final long f57080a;

    /* JADX INFO: renamed from: b */
    public final long f57081b;

    public C17902H1(long j10, long j11) {
        this.f57080a = j10;
        this.f57081b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17902H1)) {
            return false;
        }
        C17902H1 c17902h1 = (C17902H1) obj;
        return this.f57080a == c17902h1.f57080a && this.f57081b == c17902h1.f57081b;
    }

    public final int hashCode() {
        long j10 = this.f57080a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57081b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InForegroundPeriod(start=");
        sb2.append(this.f57080a);
        sb2.append(", duration=");
        return AbstractC10763a.m11050h(this.f57081b, Separators.RPAREN, sb2);
    }
}
