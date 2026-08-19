package p858ko;

import android.gov.nist.core.Separators;
import p544W9.AbstractC8753z4;

/* JADX INFO: renamed from: ko.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C16485D {

    /* JADX INFO: renamed from: a */
    public final float f51150a = 1.0f;

    /* JADX INFO: renamed from: b */
    public final float f51151b;

    public C16485D(float f10) {
        this.f51151b = f10;
    }

    /* JADX INFO: renamed from: a */
    public final float m18060a(long j10) {
        return AbstractC8753z4.m9514b(j10) * this.f51150a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16485D)) {
            return false;
        }
        C16485D c16485d = (C16485D) obj;
        return Float.compare(this.f51150a, c16485d.f51150a) == 0 && Float.compare(this.f51151b, c16485d.f51151b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51151b) + (Float.floatToIntBits(this.f51150a) * 31);
    }

    public final String toString() {
        return "ZoomRange(minZoomAsRatioOfBaseZoom=" + this.f51150a + ", maxZoomAsRatioOfSize=" + this.f51151b + Separators.RPAREN;
    }
}
