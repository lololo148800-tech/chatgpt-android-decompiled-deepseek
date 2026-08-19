package p676c7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: c7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11687f {

    /* JADX INFO: renamed from: a */
    public final long f35447a;

    /* JADX INFO: renamed from: b */
    public final long f35448b;

    /* JADX INFO: renamed from: c */
    public final long f35449c;

    /* JADX INFO: renamed from: d */
    public final long f35450d;

    public C11687f(long j10, long j11, long j12, long j13) {
        this.f35447a = j10;
        this.f35448b = j11;
        this.f35449c = j12;
        this.f35450d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11687f)) {
            return false;
        }
        C11687f c11687f = (C11687f) obj;
        return this.f35447a == c11687f.f35447a && this.f35448b == c11687f.f35448b && this.f35449c == c11687f.f35449c && this.f35450d == c11687f.f35450d;
    }

    public final int hashCode() {
        long j10 = this.f35447a;
        long j11 = this.f35448b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f35449c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f35450d;
        return i11 + ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeInfo(deviceTimeNs=");
        sb2.append(this.f35447a);
        sb2.append(", serverTimeNs=");
        sb2.append(this.f35448b);
        sb2.append(", serverTimeOffsetNs=");
        sb2.append(this.f35449c);
        sb2.append(", serverTimeOffsetMs=");
        return AbstractC10763a.m11050h(this.f35450d, Separators.RPAREN, sb2);
    }
}
