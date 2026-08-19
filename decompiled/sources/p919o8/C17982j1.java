package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: o8.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17982j1 {

    /* JADX INFO: renamed from: a */
    public final long f57400a;

    /* JADX INFO: renamed from: b */
    public final long f57401b;

    public C17982j1(long j10, long j11) {
        this.f57400a = j10;
        this.f57401b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17982j1)) {
            return false;
        }
        C17982j1 c17982j1 = (C17982j1) obj;
        return this.f57400a == c17982j1.f57400a && this.f57401b == c17982j1.f57401b;
    }

    public final int hashCode() {
        long j10 = this.f57400a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57401b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ssl(duration=");
        sb2.append(this.f57400a);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57401b, Separators.RPAREN, sb2);
    }
}
