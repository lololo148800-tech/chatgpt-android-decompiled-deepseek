package p797i1;

/* JADX INFO: renamed from: i1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C14916r {

    /* JADX INFO: renamed from: a */
    public final double f46467a;

    /* JADX INFO: renamed from: b */
    public final double f46468b;

    /* JADX INFO: renamed from: c */
    public final double f46469c;

    /* JADX INFO: renamed from: d */
    public final double f46470d;

    /* JADX INFO: renamed from: e */
    public final double f46471e;

    /* JADX INFO: renamed from: f */
    public final double f46472f;

    /* JADX INFO: renamed from: g */
    public final double f46473g;

    public /* synthetic */ C14916r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14916r)) {
            return false;
        }
        C14916r c14916r = (C14916r) obj;
        return Double.compare(this.f46467a, c14916r.f46467a) == 0 && Double.compare(this.f46468b, c14916r.f46468b) == 0 && Double.compare(this.f46469c, c14916r.f46469c) == 0 && Double.compare(this.f46470d, c14916r.f46470d) == 0 && Double.compare(this.f46471e, c14916r.f46471e) == 0 && Double.compare(this.f46472f, c14916r.f46472f) == 0 && Double.compare(this.f46473g, c14916r.f46473g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f46467a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f46468b);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f46469c);
        int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f46470d);
        int i12 = (i11 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f46471e);
        int i13 = (i12 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f46472f);
        int i14 = (i13 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f46473g);
        return i14 + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f46467a + ", a=" + this.f46468b + ", b=" + this.f46469c + ", c=" + this.f46470d + ", d=" + this.f46471e + ", e=" + this.f46472f + ", f=" + this.f46473g + ')';
    }

    public C14916r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f46467a = d10;
        this.f46468b = d11;
        this.f46469c = d12;
        this.f46470d = d13;
        this.f46471e = d14;
        this.f46472f = d15;
        this.f46473g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
