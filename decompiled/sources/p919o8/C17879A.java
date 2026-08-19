package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.A */
/* JADX INFO: loaded from: classes.dex */
public final class C17879A {

    /* JADX INFO: renamed from: a */
    public final long f56983a;

    /* JADX INFO: renamed from: b */
    public final long f56984b;

    public C17879A(long j10, long j11) {
        this.f56983a = j10;
        this.f56984b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17879A)) {
            return false;
        }
        C17879A c17879a = (C17879A) obj;
        return this.f56983a == c17879a.f56983a && this.f56984b == c17879a.f56984b;
    }

    public final int hashCode() {
        long j10 = this.f56983a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f56984b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Position(x=");
        sb2.append(this.f56983a);
        sb2.append(", y=");
        return AbstractC10763a.m11050h(this.f56984b, Separators.RPAREN, sb2);
    }
}
