package p858ko;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p001A.AbstractC0010F;
import p1095x1.AbstractC21073a0;

/* JADX INFO: renamed from: ko.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C16499b {

    /* JADX INFO: renamed from: a */
    public final long f51181a;

    /* JADX INFO: renamed from: b */
    public final float f51182b;

    public C16499b(float f10, long j10) {
        this.f51181a = j10;
        this.f51182b = f10;
    }

    /* JADX INFO: renamed from: a */
    public final long m18063a() {
        return AbstractC21073a0.m21558d(this.f51182b, this.f51181a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16499b)) {
            return false;
        }
        C16499b c16499b = (C16499b) obj;
        return AbstractC21073a0.m21555a(this.f51181a, c16499b.f51181a) && Float.compare(this.f51182b, c16499b.f51182b) == 0;
    }

    public final int hashCode() {
        int i10 = AbstractC21073a0.f66991b;
        long j10 = this.f51181a;
        return Float.floatToIntBits(this.f51182b) + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        return AbstractC0010F.m20d("ContentZoomFactor(baseZoom=", AbstractC10763a.m11054l("BaseZoomFactor(value=", AbstractC21073a0.m21559e(this.f51181a), Separators.RPAREN), ", userZoom=", "UserZoomFactor(value=" + this.f51182b + Separators.RPAREN, Separators.RPAREN);
    }
}
