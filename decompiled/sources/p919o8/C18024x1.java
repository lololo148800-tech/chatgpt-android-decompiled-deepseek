package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18024x1 {

    /* JADX INFO: renamed from: a */
    public final long f57531a;

    public C18024x1(long j10) {
        this.f57531a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18024x1) && this.f57531a == ((C18024x1) obj).f57531a;
    }

    public final int hashCode() {
        long j10 = this.f57531a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f57531a, Separators.RPAREN, new StringBuilder("Crash(count="));
    }
}
