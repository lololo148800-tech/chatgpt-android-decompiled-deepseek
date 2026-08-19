package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.e0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1071e0 {
    public static final C1064d0 Companion = new C1064d0();

    /* JADX INFO: renamed from: a */
    public final Double f2918a;

    /* JADX INFO: renamed from: b */
    public final Double f2919b;

    /* JADX INFO: renamed from: c */
    public final Double f2920c;

    public /* synthetic */ C1071e0(int i10, Double d10, Double d11, Double d12) {
        if ((i10 & 1) == 0) {
            this.f2918a = null;
        } else {
            this.f2918a = d10;
        }
        if ((i10 & 2) == 0) {
            this.f2919b = null;
        } else {
            this.f2919b = d11;
        }
        if ((i10 & 4) == 0) {
            this.f2920c = null;
        } else {
            this.f2920c = d12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1071e0)) {
            return false;
        }
        C1071e0 c1071e0 = (C1071e0) obj;
        return AbstractC16544l.m18089b(this.f2918a, c1071e0.f2918a) && AbstractC16544l.m18089b(this.f2919b, c1071e0.f2919b) && AbstractC16544l.m18089b(this.f2920c, c1071e0.f2920c);
    }

    public final int hashCode() {
        Double d10 = this.f2918a;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f2919b;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f2920c;
        return iHashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
