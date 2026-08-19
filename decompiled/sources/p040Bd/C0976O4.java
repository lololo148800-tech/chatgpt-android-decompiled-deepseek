package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.O4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0976O4 {
    public static final C0970N4 Companion = new C0970N4();

    /* JADX INFO: renamed from: a */
    public final C1111j5 f2755a;

    /* JADX INFO: renamed from: b */
    public final Integer f2756b;

    public /* synthetic */ C0976O4(int i10, C1111j5 c1111j5, Integer num) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C0964M4.f2737a.getDescriptor());
            throw null;
        }
        this.f2755a = c1111j5;
        if ((i10 & 2) == 0) {
            this.f2756b = null;
        } else {
            this.f2756b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0976O4)) {
            return false;
        }
        C0976O4 c0976o4 = (C0976O4) obj;
        return AbstractC16544l.m18089b(this.f2755a, c0976o4.f2755a) && AbstractC16544l.m18089b(this.f2756b, c0976o4.f2756b);
    }

    public final int hashCode() {
        int iHashCode = this.f2755a.hashCode() * 31;
        Integer num = this.f2756b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
