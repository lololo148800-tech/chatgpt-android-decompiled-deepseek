package p988rc;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: rc.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C18931s {

    /* JADX INFO: renamed from: a */
    public final int f60405a;

    /* JADX INFO: renamed from: b */
    public final float f60406b;

    public C18931s(int i10, float f10) {
        this.f60405a = i10;
        this.f60406b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18931s)) {
            return false;
        }
        C18931s c18931s = (C18931s) obj;
        return this.f60405a == c18931s.f60405a && Float.compare(this.f60406b, c18931s.f60406b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f60406b) + (this.f60405a * 31);
    }

    public final String toString() {
        return "TextAnimation(startIndex=" + this.f60405a + ", alpha=" + this.f60406b + Separators.RPAREN;
    }
}
