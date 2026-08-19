package p273Kl;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Kl.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4758Z0 {

    /* JADX INFO: renamed from: a */
    public final String f15522a;

    /* JADX INFO: renamed from: b */
    public final long f15523b;

    public C4758Z0(long j10, String codec) {
        AbstractC16544l.m18094g(codec, "codec");
        this.f15522a = codec;
        this.f15523b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4758Z0)) {
            return false;
        }
        C4758Z0 c4758z0 = (C4758Z0) obj;
        return AbstractC16544l.m18089b(this.f15522a, c4758z0.f15522a) && this.f15523b == c4758z0.f15523b;
    }

    public final int hashCode() {
        int iHashCode = this.f15522a.hashCode() * 31;
        long j10 = this.f15523b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "TrackBitrateInfo(codec=" + this.f15522a + ", maxBitrate=" + this.f15523b + ')';
    }
}
