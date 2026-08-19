package p677c8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: c8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11691c {

    /* JADX INFO: renamed from: a */
    public final long f35476a;

    /* JADX INFO: renamed from: b */
    public final long f35477b;

    public C11691c(long j10, long j11) {
        this.f35476a = j10;
        this.f35477b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11691c)) {
            return false;
        }
        C11691c c11691c = (C11691c) obj;
        return this.f35476a == c11691c.f35476a && this.f35477b == c11691c.f35477b;
    }

    public final int hashCode() {
        long j10 = this.f35476a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f35477b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Time(timestamp=");
        sb2.append(this.f35476a);
        sb2.append(", nanoTime=");
        return AbstractC10763a.m11050h(this.f35477b, Separators.RPAREN, sb2);
    }

    public /* synthetic */ C11691c() {
        this(System.currentTimeMillis(), System.nanoTime());
    }
}
