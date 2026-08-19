package p858ko;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: ko.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C16486E {

    /* JADX INFO: renamed from: a */
    public final float f51152a;

    /* JADX INFO: renamed from: b */
    public final boolean f51153b;

    /* JADX INFO: renamed from: c */
    public final C16485D f51154c;

    public C16486E(int i10, float f10) {
        f10 = (i10 & 1) != 0 ? 2.0f : f10;
        this.f51152a = f10;
        this.f51153b = true;
        this.f51154c = new C16485D(f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16486E)) {
            return false;
        }
        C16486E c16486e = (C16486E) obj;
        return Float.compare(this.f51152a, c16486e.f51152a) == 0 && this.f51153b == c16486e.f51153b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f51152a) * 31) + (this.f51153b ? 1231 : 1237);
    }

    public final String toString() {
        return "ZoomSpec(maxZoomFactor=" + this.f51152a + ", preventOverOrUnderZoom=" + this.f51153b + Separators.RPAREN;
    }
}
