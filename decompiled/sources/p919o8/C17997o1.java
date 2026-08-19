package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17997o1 {

    /* JADX INFO: renamed from: a */
    public final long f57469a;

    public C17997o1(long j10) {
        this.f57469a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17997o1) && this.f57469a == ((C17997o1) obj).f57469a;
    }

    public final int hashCode() {
        long j10 = this.f57469a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57469a, Separators.RPAREN, new StringBuilder("Action(count="));
    }
}
