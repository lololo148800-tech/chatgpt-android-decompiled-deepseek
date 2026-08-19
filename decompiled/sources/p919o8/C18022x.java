package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.x */
/* JADX INFO: loaded from: classes.dex */
public final class C18022x {

    /* JADX INFO: renamed from: a */
    public final long f57529a;

    public C18022x(long j10) {
        this.f57529a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18022x) && this.f57529a == ((C18022x) obj).f57529a;
    }

    public final int hashCode() {
        long j10 = this.f57529a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57529a, Separators.RPAREN, new StringBuilder("LongTask(count="));
    }
}
