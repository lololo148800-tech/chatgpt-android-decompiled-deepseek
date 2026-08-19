package p745f9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.ErrorBoundaryKt;

/* JADX INFO: renamed from: f9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13583a {

    /* JADX INFO: renamed from: f */
    public static final C13583a f42938f = new C13583a(10485760, RCHTTPStatusCodes.SUCCESS, ErrorBoundaryKt.SAMPLING_RATE, 81920, 604800000);

    /* JADX INFO: renamed from: a */
    public final long f42939a;

    /* JADX INFO: renamed from: b */
    public final int f42940b;

    /* JADX INFO: renamed from: c */
    public final int f42941c;

    /* JADX INFO: renamed from: d */
    public final long f42942d;

    /* JADX INFO: renamed from: e */
    public final int f42943e;

    public C13583a(long j10, int i10, int i11, int i12, long j11) {
        this.f42939a = j10;
        this.f42940b = i10;
        this.f42941c = i11;
        this.f42942d = j11;
        this.f42943e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13583a)) {
            return false;
        }
        C13583a c13583a = (C13583a) obj;
        return this.f42939a == c13583a.f42939a && this.f42940b == c13583a.f42940b && this.f42941c == c13583a.f42941c && this.f42942d == c13583a.f42942d && this.f42943e == c13583a.f42943e;
    }

    public final int hashCode() {
        long j10 = this.f42939a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f42940b) * 1000003) ^ this.f42941c) * 1000003;
        long j11 = this.f42942d;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f42943e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f42939a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f42940b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f42941c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f42942d);
        sb2.append(", maxBlobByteSizePerRow=");
        return AbstractC10763a.m11056n(sb2, this.f42943e, "}");
    }
}
