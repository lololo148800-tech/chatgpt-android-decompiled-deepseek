package p214Ib;

import java.io.Serializable;
import java.math.BigInteger;
import p265Kb.C4617j;
import p379Pb.LVf.efyhmdM;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Ib.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3678u extends AbstractC3673p {

    /* JADX INFO: renamed from: Y */
    public final Serializable f11175Y;

    public C3678u(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f11175Y = bool;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4397s(C3678u c3678u) {
        Serializable serializable = c3678u.f11175Y;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3678u.class != obj.getClass()) {
            return false;
        }
        C3678u c3678u = (C3678u) obj;
        Serializable serializable = this.f11175Y;
        Serializable serializable2 = c3678u.f11175Y;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m4397s(this) && m4397s(c3678u)) {
            return mo4383q().longValue() == c3678u.mo4383q().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = mo4383q().doubleValue();
        double dDoubleValue2 = c3678u.mo4383q().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: f */
    public final boolean mo4380f() {
        Serializable serializable = this.f11175Y;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(mo4384r());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f11175Y;
        if (serializable == null) {
            return 31;
        }
        if (m4397s(this)) {
            jDoubleToLongBits = mo4383q().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(mo4383q().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: i */
    public final int mo4381i() {
        return this.f11175Y instanceof Number ? mo4383q().intValue() : Integer.parseInt(mo4384r());
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: p */
    public final long mo4382p() {
        return this.f11175Y instanceof Number ? mo4383q().longValue() : Long.parseLong(mo4384r());
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: q */
    public final Number mo4383q() {
        Serializable serializable = this.f11175Y;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C4617j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // p214Ib.AbstractC3673p
    /* JADX INFO: renamed from: r */
    public final String mo4384r() {
        Serializable serializable = this.f11175Y;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return mo4383q().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError(efyhmdM.SlGpAyhgh + serializable.getClass());
    }

    public C3678u(Number number) {
        Objects.requireNonNull(number);
        this.f11175Y = number;
    }

    public C3678u(String str) {
        Objects.requireNonNull(str);
        this.f11175Y = str;
    }
}
