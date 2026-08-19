package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17899G1 {

    /* JADX INFO: renamed from: a */
    public final long f57057a;

    public C17899G1(long j10) {
        this.f57057a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17899G1) && this.f57057a == ((C17899G1) obj).f57057a;
    }

    public final int hashCode() {
        long j10 = this.f57057a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57057a, Separators.RPAREN, new StringBuilder("Frustration(count="));
    }
}
