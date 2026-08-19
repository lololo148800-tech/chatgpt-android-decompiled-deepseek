package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17945W0 {

    /* JADX INFO: renamed from: a */
    public final long f57232a;

    /* JADX INFO: renamed from: b */
    public final long f57233b;

    public C17945W0(long j10, long j11) {
        this.f57232a = j10;
        this.f57233b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17945W0)) {
            return false;
        }
        C17945W0 c17945w0 = (C17945W0) obj;
        return this.f57232a == c17945w0.f57232a && this.f57233b == c17945w0.f57233b;
    }

    public final int hashCode() {
        long j10 = this.f57232a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57233b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dns(duration=");
        sb2.append(this.f57232a);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57233b, Separators.RPAREN, sb2);
    }
}
