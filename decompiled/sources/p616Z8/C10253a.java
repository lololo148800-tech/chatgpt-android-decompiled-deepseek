package p616Z8;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: Z8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10253a {

    /* JADX INFO: renamed from: a */
    public final int f30460a;

    /* JADX INFO: renamed from: b */
    public final long f30461b;

    public C10253a(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f30460a = i10;
        this.f30461b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10253a)) {
            return false;
        }
        C10253a c10253a = (C10253a) obj;
        return AbstractC0010F.m17a(this.f30460a, c10253a.f30460a) && this.f30461b == c10253a.f30461b;
    }

    public final int hashCode() {
        int iM24h = (AbstractC0010F.m24h(this.f30460a) ^ 1000003) * 1000003;
        long j10 = this.f30461b;
        return iM24h ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f30460a;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return AbstractC10763a.m11050h(this.f30461b, "}", sb2);
    }
}
