package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.Y2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1033Y2 {
    public static final C1205z2 Companion = new C1205z2();

    /* JADX INFO: renamed from: a */
    public final C1027X2 f2859a;

    /* JADX INFO: renamed from: b */
    public final C0902C2 f2860b;

    public /* synthetic */ C1033Y2(int i10, C1027X2 c1027x2, C0902C2 c0902c2) {
        if ((i10 & 1) == 0) {
            this.f2859a = null;
        } else {
            this.f2859a = c1027x2;
        }
        if ((i10 & 2) == 0) {
            this.f2860b = null;
        } else {
            this.f2860b = c0902c2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033Y2)) {
            return false;
        }
        C1033Y2 c1033y2 = (C1033Y2) obj;
        return AbstractC16544l.m18089b(this.f2859a, c1033y2.f2859a) && AbstractC16544l.m18089b(this.f2860b, c1033y2.f2860b);
    }

    public final int hashCode() {
        C1027X2 c1027x2 = this.f2859a;
        int iHashCode = (c1027x2 == null ? 0 : c1027x2.hashCode()) * 31;
        C0902C2 c0902c2 = this.f2860b;
        return iHashCode + (c0902c2 != null ? c0902c2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1033Y2(C0902C2 c0902c2) {
        this.f2859a = null;
        this.f2860b = c0902c2;
    }
}
