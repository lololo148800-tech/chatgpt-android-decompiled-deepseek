package p837ji;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p279L1.VOxZ.sVoFrD;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: ji.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16218g {
    public static final C16217f Companion = new C16217f();

    /* JADX INFO: renamed from: a */
    public final String f50327a;

    /* JADX INFO: renamed from: b */
    public final double f50328b;

    /* JADX INFO: renamed from: c */
    public final double f50329c;

    /* JADX INFO: renamed from: d */
    public final Double f50330d;

    public /* synthetic */ C16218g(int i10, String str, double d10, double d11, Double d12) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C16216e.f50326a.getDescriptor());
            throw null;
        }
        this.f50327a = str;
        this.f50328b = d10;
        this.f50329c = d11;
        if ((i10 & 8) == 0) {
            this.f50330d = null;
        } else {
            this.f50330d = d12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16218g)) {
            return false;
        }
        C16218g c16218g = (C16218g) obj;
        return AbstractC16544l.m18089b(this.f50327a, c16218g.f50327a) && Double.compare(this.f50328b, c16218g.f50328b) == 0 && Double.compare(this.f50329c, c16218g.f50329c) == 0 && AbstractC16544l.m18089b(this.f50330d, c16218g.f50330d);
    }

    public final int hashCode() {
        int iHashCode = this.f50327a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f50328b);
        int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f50329c);
        int i11 = (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        Double d10 = this.f50330d;
        return i11 + (d10 == null ? 0 : d10.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C16218g(String str, double d10, double d11, Double d12) {
        AbstractC16544l.m18094g(str, sVoFrD.JHuGVACb);
        this.f50327a = str;
        this.f50328b = d10;
        this.f50329c = d11;
        this.f50330d = d12;
    }
}
