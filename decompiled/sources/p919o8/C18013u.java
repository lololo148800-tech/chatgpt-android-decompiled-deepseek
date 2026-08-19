package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.u */
/* JADX INFO: loaded from: classes.dex */
public final class C18013u {

    /* JADX INFO: renamed from: a */
    public final long f57504a;

    public C18013u(long j10) {
        this.f57504a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18013u) && this.f57504a == ((C18013u) obj).f57504a;
    }

    public final int hashCode() {
        long j10 = this.f57504a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57504a, Separators.RPAREN, new StringBuilder("Error(count="));
    }
}
