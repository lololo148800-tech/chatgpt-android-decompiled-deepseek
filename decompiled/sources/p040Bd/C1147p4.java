package p040Bd;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.p4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1147p4 {
    public static final C1141o4 Companion = new C1141o4();

    /* JADX INFO: renamed from: a */
    public final int f3066a;

    /* JADX INFO: renamed from: b */
    public final double f3067b;

    /* JADX INFO: renamed from: c */
    public final int f3068c;

    /* JADX INFO: renamed from: d */
    public final double f3069d;

    public /* synthetic */ C1147p4(int i10, int i11, double d10, int i12, double d11) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1135n4.f3051a.getDescriptor());
            throw null;
        }
        this.f3066a = i11;
        this.f3067b = d10;
        this.f3068c = i12;
        this.f3069d = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147p4)) {
            return false;
        }
        C1147p4 c1147p4 = (C1147p4) obj;
        return this.f3066a == c1147p4.f3066a && Double.compare(this.f3067b, c1147p4.f3067b) == 0 && this.f3068c == c1147p4.f3068c && Double.compare(this.f3069d, c1147p4.f3069d) == 0;
    }

    public final int hashCode() {
        int i10 = this.f3066a * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f3067b);
        int i11 = (((i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.f3068c) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f3069d);
        return i11 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "█";
    }
}
