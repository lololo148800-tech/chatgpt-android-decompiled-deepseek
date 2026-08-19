package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17926P1 {

    /* JADX INFO: renamed from: a */
    public final long f57140a;

    public C17926P1(long j10) {
        this.f57140a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17926P1) && this.f57140a == ((C17926P1) obj).f57140a;
    }

    public final int hashCode() {
        long j10 = this.f57140a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57140a, Separators.RPAREN, new StringBuilder("Resource(count="));
    }
}
