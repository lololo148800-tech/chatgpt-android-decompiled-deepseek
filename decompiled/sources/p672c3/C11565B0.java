package p672c3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: c3.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11565B0 {

    /* JADX INFO: renamed from: a */
    public final int f34965a;

    /* JADX INFO: renamed from: b */
    public final int f34966b;

    public C11565B0(int i10, int i11) {
        this.f34965a = i10;
        this.f34966b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11565B0)) {
            return false;
        }
        C11565B0 c11565b0 = (C11565B0) obj;
        return this.f34965a == c11565b0.f34965a && this.f34966b == c11565b0.f34966b;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f34966b) + (AbstractC0010F.m24h(this.f34965a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + AbstractC10763a.m11042C(this.f34965a) + ", height=" + AbstractC10763a.m11042C(this.f34966b) + ')';
    }
}
