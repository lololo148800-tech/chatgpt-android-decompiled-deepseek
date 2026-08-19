package p572Xa;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: Xa.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9422p {

    /* JADX INFO: renamed from: a */
    public final int f28402a;

    /* JADX INFO: renamed from: b */
    public final long f28403b;

    public C9422p(int i10, long j10) {
        this.f28402a = i10;
        this.f28403b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9422p) {
            C9422p c9422p = (C9422p) obj;
            if (this.f28402a == c9422p.f28402a && this.f28403b == c9422p.f28403b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28403b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f28402a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f28402a);
        sb2.append(", eventTimestamp=");
        return AbstractC10763a.m11050h(this.f28403b, "}", sb2);
    }
}
