package p265Kb;

import java.math.BigDecimal;

/* JADX INFO: renamed from: Kb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4617j extends Number {

    /* JADX INFO: renamed from: Y */
    public final String f15046Y;

    public C4617j(String str) {
        this.f15046Y = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f15046Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4617j)) {
            return false;
        }
        Object obj2 = ((C4617j) obj).f15046Y;
        String str = this.f15046Y;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f15046Y);
    }

    public final int hashCode() {
        return this.f15046Y.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f15046Y;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f15046Y;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f15046Y;
    }
}
