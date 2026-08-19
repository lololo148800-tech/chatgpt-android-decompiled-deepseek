package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.j1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1107j1 {
    public static final C1100i1 Companion = new C1100i1();

    /* JADX INFO: renamed from: a */
    public final float f3008a;

    /* JADX INFO: renamed from: b */
    public final Float f3009b;

    /* JADX INFO: renamed from: c */
    public final Float f3010c;

    /* JADX INFO: renamed from: d */
    public final Float f3011d;

    /* JADX INFO: renamed from: e */
    public final Float f3012e;

    /* JADX INFO: renamed from: f */
    public final Integer f3013f;

    public /* synthetic */ C1107j1(int i10, float f10, Float f11, Float f12, Float f13, Float f14, Integer num) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1093h1.f2992a.getDescriptor());
            throw null;
        }
        this.f3008a = f10;
        if ((i10 & 2) == 0) {
            this.f3009b = null;
        } else {
            this.f3009b = f11;
        }
        if ((i10 & 4) == 0) {
            this.f3010c = null;
        } else {
            this.f3010c = f12;
        }
        if ((i10 & 8) == 0) {
            this.f3011d = null;
        } else {
            this.f3011d = f13;
        }
        if ((i10 & 16) == 0) {
            this.f3012e = null;
        } else {
            this.f3012e = f14;
        }
        if ((i10 & 32) == 0) {
            this.f3013f = null;
        } else {
            this.f3013f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1107j1)) {
            return false;
        }
        C1107j1 c1107j1 = (C1107j1) obj;
        return Float.compare(this.f3008a, c1107j1.f3008a) == 0 && AbstractC16544l.m18089b(this.f3009b, c1107j1.f3009b) && AbstractC16544l.m18089b(this.f3010c, c1107j1.f3010c) && AbstractC16544l.m18089b(this.f3011d, c1107j1.f3011d) && AbstractC16544l.m18089b(this.f3012e, c1107j1.f3012e) && AbstractC16544l.m18089b(this.f3013f, c1107j1.f3013f);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f3008a) * 31;
        Float f10 = this.f3009b;
        int iHashCode = (iFloatToIntBits + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f3010c;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f3011d;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f3012e;
        int iHashCode4 = (iHashCode3 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Integer num = this.f3013f;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
