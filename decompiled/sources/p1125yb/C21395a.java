package p1125yb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: yb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21395a {

    /* JADX INFO: renamed from: a */
    public final String f67922a;

    /* JADX INFO: renamed from: b */
    public final long f67923b;

    /* JADX INFO: renamed from: c */
    public final long f67924c;

    public C21395a(long j10, long j11, String str) {
        this.f67922a = str;
        this.f67923b = j10;
        this.f67924c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21395a)) {
            return false;
        }
        C21395a c21395a = (C21395a) obj;
        return this.f67922a.equals(c21395a.f67922a) && this.f67923b == c21395a.f67923b && this.f67924c == c21395a.f67924c;
    }

    public final int hashCode() {
        int iHashCode = (this.f67922a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f67923b;
        long j11 = this.f67924c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f67922a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f67923b);
        sb2.append(", tokenCreationTimestamp=");
        return AbstractC10763a.m11050h(this.f67924c, "}", sb2);
    }
}
