package p781h8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: h8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14427b {

    /* JADX INFO: renamed from: a */
    public final String f45346a;

    /* JADX INFO: renamed from: b */
    public final long f45347b;

    /* JADX INFO: renamed from: c */
    public final long f45348c;

    /* JADX INFO: renamed from: d */
    public final boolean f45349d;

    public C14427b(String viewUrl, long j10, long j11, boolean z6) {
        AbstractC16544l.m18094g(viewUrl, "viewUrl");
        this.f45346a = viewUrl;
        this.f45347b = j10;
        this.f45348c = j11;
        this.f45349d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14427b)) {
            return false;
        }
        C14427b c14427b = (C14427b) obj;
        return AbstractC16544l.m18089b(this.f45346a, c14427b.f45346a) && this.f45347b == c14427b.f45347b && this.f45348c == c14427b.f45348c && this.f45349d == c14427b.f45349d;
    }

    public final int hashCode() {
        int iHashCode = this.f45346a.hashCode() * 31;
        long j10 = this.f45347b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f45348c;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f45349d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackedView(viewUrl=");
        sb2.append(this.f45346a);
        sb2.append(", startMs=");
        sb2.append(this.f45347b);
        sb2.append(", durationNs=");
        sb2.append(this.f45348c);
        sb2.append(", hasReplay=");
        return AbstractC14376f.m15823B(sb2, this.f45349d, Separators.RPAREN);
    }
}
