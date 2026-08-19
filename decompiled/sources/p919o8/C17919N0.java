package p919o8;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: o8.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17919N0 {

    /* JADX INFO: renamed from: a */
    public final long f57122a;

    /* JADX INFO: renamed from: b */
    public final long f57123b;

    public C17919N0(long j10, long j11) {
        this.f57122a = j10;
        this.f57123b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17919N0)) {
            return false;
        }
        C17919N0 c17919n0 = (C17919N0) obj;
        return this.f57122a == c17919n0.f57122a && this.f57123b == c17919n0.f57123b;
    }

    public final int hashCode() {
        long j10 = this.f57122a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57123b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connect(duration=");
        sb2.append(this.f57122a);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57123b, TfazcFv.nFk, sb2);
    }
}
