package p722e8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: e8.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13317a0 {

    /* JADX INFO: renamed from: a */
    public final long f42209a;

    /* JADX INFO: renamed from: b */
    public final long f42210b;

    public C13317a0(long j10, long j11) {
        this.f42209a = j10;
        this.f42210b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13317a0)) {
            return false;
        }
        C13317a0 c13317a0 = (C13317a0) obj;
        return this.f42209a == c13317a0.f42209a && this.f42210b == c13317a0.f42210b;
    }

    public final int hashCode() {
        long j10 = this.f42209a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f42210b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timing(startTime=");
        sb2.append(this.f42209a);
        sb2.append(", duration=");
        return AbstractC10763a.m11050h(this.f42210b, Separators.RPAREN, sb2);
    }
}
