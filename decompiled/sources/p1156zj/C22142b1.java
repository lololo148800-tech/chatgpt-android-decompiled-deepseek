package p1156zj;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: zj.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22142b1 {

    /* JADX INFO: renamed from: a */
    public final int f69990a;

    /* JADX INFO: renamed from: b */
    public final int f69991b;

    public C22142b1(int i10, int i11) {
        this.f69990a = i10;
        this.f69991b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22142b1)) {
            return false;
        }
        C22142b1 c22142b1 = (C22142b1) obj;
        return this.f69990a == c22142b1.f69990a && this.f69991b == c22142b1.f69991b;
    }

    public final int hashCode() {
        return (this.f69990a * 31) + this.f69991b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayAssets(hintAnimation=");
        sb2.append(this.f69990a);
        sb2.append(", guideDrawable=");
        return AbstractC10763a.m11056n(sb2, this.f69991b, Separators.RPAREN);
    }
}
