package p236J7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: J7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4277a extends AbstractC4283g {

    /* JADX INFO: renamed from: a */
    public final boolean f13938a;

    /* JADX INFO: renamed from: b */
    public final long f13939b;

    /* JADX INFO: renamed from: c */
    public final long f13940c;

    /* JADX INFO: renamed from: d */
    public final boolean f13941d;

    /* JADX INFO: renamed from: e */
    public final int f13942e;

    public C4277a(boolean z6, long j10, long j11, boolean z10, int i10) {
        this.f13938a = z6;
        this.f13939b = j10;
        this.f13940c = j11;
        this.f13941d = z10;
        this.f13942e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4277a)) {
            return false;
        }
        C4277a c4277a = (C4277a) obj;
        return this.f13938a == c4277a.f13938a && this.f13939b == c4277a.f13939b && this.f13940c == c4277a.f13940c && this.f13941d == c4277a.f13941d && this.f13942e == c4277a.f13942e;
    }

    public final int hashCode() {
        int i10 = this.f13938a ? 1231 : 1237;
        long j10 = this.f13939b;
        int i11 = ((i10 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f13940c;
        return ((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f13941d ? 1231 : 1237)) * 31) + 1237) * 31) + this.f13942e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(trackErrors=");
        sb2.append(this.f13938a);
        sb2.append(", batchSize=");
        sb2.append(this.f13939b);
        sb2.append(", batchUploadFrequency=");
        sb2.append(this.f13940c);
        sb2.append(", useProxy=");
        sb2.append(this.f13941d);
        sb2.append(", useLocalEncryption=false, batchProcessingLevel=");
        return AbstractC10763a.m11056n(sb2, this.f13942e, Separators.RPAREN);
    }
}
