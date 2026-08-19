package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17950Y0 {

    /* JADX INFO: renamed from: a */
    public final long f57278a;

    /* JADX INFO: renamed from: b */
    public final long f57279b;

    public C17950Y0(long j10, long j11) {
        this.f57278a = j10;
        this.f57279b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17950Y0)) {
            return false;
        }
        C17950Y0 c17950y0 = (C17950Y0) obj;
        return this.f57278a == c17950y0.f57278a && this.f57279b == c17950y0.f57279b;
    }

    public final int hashCode() {
        long j10 = this.f57278a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57279b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirstByte(duration=");
        sb2.append(this.f57278a);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57279b, Separators.RPAREN, sb2);
    }
}
