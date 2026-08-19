package p993rj;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: rj.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C19035O {

    /* JADX INFO: renamed from: a */
    public final long f60682a = 1;

    /* JADX INFO: renamed from: b */
    public final boolean f60683b = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19035O)) {
            return false;
        }
        C19035O c19035o = (C19035O) obj;
        return this.f60682a == c19035o.f60682a && this.f60683b == c19035o.f60683b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        long j10 = this.f60682a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        boolean z6 = this.f60683b;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return i10 + r6;
    }

    public final String toString() {
        return "ExtraCameraOptions(dynamicRange=" + this.f60682a + ", previewStabilization=" + this.f60683b + Separators.RPAREN;
    }
}
