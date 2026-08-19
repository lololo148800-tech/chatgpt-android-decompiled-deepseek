package p902n8;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: n8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17522i {

    /* JADX INFO: renamed from: e */
    public static final C17522i f56047e = new C17522i(Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d, 0);

    /* JADX INFO: renamed from: a */
    public final int f56048a;

    /* JADX INFO: renamed from: b */
    public final double f56049b;

    /* JADX INFO: renamed from: c */
    public final double f56050c;

    /* JADX INFO: renamed from: d */
    public final double f56051d;

    public C17522i(double d10, double d11, double d12, int i10) {
        this.f56048a = i10;
        this.f56049b = d10;
        this.f56050c = d11;
        this.f56051d = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17522i)) {
            return false;
        }
        C17522i c17522i = (C17522i) obj;
        return this.f56048a == c17522i.f56048a && Double.compare(this.f56049b, c17522i.f56049b) == 0 && Double.compare(this.f56050c, c17522i.f56050c) == 0 && Double.compare(this.f56051d, c17522i.f56051d) == 0;
    }

    public final int hashCode() {
        int i10 = this.f56048a * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f56049b);
        int i11 = (i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f56050c);
        int i12 = (i11 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f56051d);
        return i12 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "VitalInfo(sampleCount=" + this.f56048a + ", minValue=" + this.f56049b + ", maxValue=" + this.f56050c + ", meanValue=" + this.f56051d + Separators.RPAREN;
    }
}
