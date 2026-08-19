package p832jb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: jb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16181a {

    /* JADX INFO: renamed from: a */
    public final long f50223a;

    /* JADX INFO: renamed from: b */
    public final long f50224b;

    /* JADX INFO: renamed from: c */
    public final long f50225c;

    public C16181a(long j10, long j11, long j12) {
        this.f50223a = j10;
        this.f50224b = j11;
        this.f50225c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16181a)) {
            return false;
        }
        C16181a c16181a = (C16181a) obj;
        return this.f50223a == c16181a.f50223a && this.f50224b == c16181a.f50224b && this.f50225c == c16181a.f50225c;
    }

    public final int hashCode() {
        long j10 = this.f50223a;
        long j11 = this.f50224b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f50225c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f50223a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f50224b);
        sb2.append(", uptimeMillis=");
        return AbstractC10763a.m11050h(this.f50225c, "}", sb2);
    }
}
