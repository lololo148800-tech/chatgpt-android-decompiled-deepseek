package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17967e1 {

    /* JADX INFO: renamed from: a */
    public final long f57348a;

    /* JADX INFO: renamed from: b */
    public final long f57349b;

    public C17967e1(long j10, long j11) {
        this.f57348a = j10;
        this.f57349b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17967e1)) {
            return false;
        }
        C17967e1 c17967e1 = (C17967e1) obj;
        return this.f57348a == c17967e1.f57348a && this.f57349b == c17967e1.f57349b;
    }

    public final int hashCode() {
        long j10 = this.f57348a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57349b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Redirect(duration=");
        sb2.append(this.f57348a);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57349b, Separators.RPAREN, sb2);
    }
}
