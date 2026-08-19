package p758g0;

/* JADX INFO: renamed from: g0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C13790u {

    /* JADX INFO: renamed from: a */
    public double f43556a;

    /* JADX INFO: renamed from: b */
    public double f43557b;

    public C13790u(double d10, double d11) {
        this.f43556a = d10;
        this.f43557b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13790u)) {
            return false;
        }
        C13790u c13790u = (C13790u) obj;
        return Double.compare(this.f43556a, c13790u.f43556a) == 0 && Double.compare(this.f43557b, c13790u.f43557b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f43556a);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f43557b);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f43556a + ", _imaginary=" + this.f43557b + ')';
    }
}
