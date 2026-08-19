package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17948X0 {

    /* JADX INFO: renamed from: a */
    public final long f57273a;

    /* JADX INFO: renamed from: b */
    public final long f57274b;

    public C17948X0(long j10, long j11) {
        this.f57273a = j10;
        this.f57274b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17948X0)) {
            return false;
        }
        C17948X0 c17948x0 = (C17948X0) obj;
        return this.f57273a == c17948x0.f57273a && this.f57274b == c17948x0.f57274b;
    }

    public final int hashCode() {
        long j10 = this.f57273a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57274b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Download(duration=");
        sb2.append(this.f57273a);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57274b, Separators.RPAREN, sb2);
    }
}
