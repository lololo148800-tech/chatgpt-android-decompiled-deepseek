package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17908J1 {

    /* JADX INFO: renamed from: a */
    public final long f57099a;

    public C17908J1(long j10) {
        this.f57099a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17908J1) && this.f57099a == ((C17908J1) obj).f57099a;
    }

    public final int hashCode() {
        long j10 = this.f57099a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57099a, Separators.RPAREN, new StringBuilder("LongTask(count="));
    }
}
