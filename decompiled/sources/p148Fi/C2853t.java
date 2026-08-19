package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2853t {
    public static final C2851s Companion = new C2851s();

    /* JADX INFO: renamed from: a */
    public final String f8610a;

    /* JADX INFO: renamed from: b */
    public final double f8611b;

    public /* synthetic */ C2853t(int i10, String str, double d10) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2849r.f8604a.getDescriptor());
            throw null;
        }
        this.f8610a = str;
        this.f8611b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2853t)) {
            return false;
        }
        C2853t c2853t = (C2853t) obj;
        return AbstractC16544l.m18089b(this.f8610a, c2853t.f8610a) && Double.compare(this.f8611b, c2853t.f8611b) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f8610a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8611b);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "█";
    }
}
