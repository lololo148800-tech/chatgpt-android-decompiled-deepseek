package p919o8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17914L1 {

    /* JADX INFO: renamed from: a */
    public final int f57113a;

    /* JADX INFO: renamed from: b */
    public final long f57114b;

    public C17914L1(int i10, long j10) {
        AbstractC14376f.m15825D(i10, "state");
        this.f57113a = i10;
        this.f57114b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17914L1)) {
            return false;
        }
        C17914L1 c17914l1 = (C17914L1) obj;
        return this.f57113a == c17914l1.f57113a && this.f57114b == c17914l1.f57114b;
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57113a) * 31;
        long j10 = this.f57114b;
        return iM24h + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PageState(state=");
        int i10 = this.f57113a;
        if (i10 == 1) {
            str = "ACTIVE";
        } else if (i10 == 2) {
            str = "PASSIVE";
        } else if (i10 == 3) {
            str = "HIDDEN";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "TERMINATED";
        } else {
            str = "FROZEN";
        }
        sb2.append(str);
        sb2.append(", start=");
        return AbstractC10763a.m11050h(this.f57114b, Separators.RPAREN, sb2);
    }
}
