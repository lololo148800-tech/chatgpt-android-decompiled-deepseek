package p817j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16028z {

    /* JADX INFO: renamed from: c */
    private static final C16028z f49462c = new C16028z();

    /* JADX INFO: renamed from: a */
    private final boolean f49463a;

    /* JADX INFO: renamed from: b */
    private final double f49464b;

    private C16028z() {
        this.f49463a = false;
        this.f49464b = Double.NaN;
    }

    /* JADX INFO: renamed from: a */
    public static C16028z m17584a() {
        return f49462c;
    }

    private C16028z(double d10) {
        this.f49463a = true;
        this.f49464b = d10;
    }

    /* JADX INFO: renamed from: d */
    public static C16028z m17585d(double d10) {
        return new C16028z(d10);
    }

    /* JADX INFO: renamed from: b */
    public final double m17586b() {
        if (!this.f49463a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f49464b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17587c() {
        return this.f49463a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16028z)) {
            return false;
        }
        C16028z c16028z = (C16028z) obj;
        boolean z6 = this.f49463a;
        if (z6 && c16028z.f49463a) {
            if (Double.compare(this.f49464b, c16028z.f49464b) == 0) {
                return true;
            }
        } else if (z6 == c16028z.f49463a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f49463a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f49464b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f49463a) {
            return "OptionalDouble[" + this.f49464b + "]";
        }
        return "OptionalDouble.empty";
    }
}
