package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.X2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1027X2 {
    public static final C0914E2 Companion = new C0914E2();

    /* JADX INFO: renamed from: a */
    public final String f2838a;

    /* JADX INFO: renamed from: b */
    public final C1021W2 f2839b;

    public /* synthetic */ C1027X2(int i10, String str, C1021W2 c1021w2) {
        if ((i10 & 1) == 0) {
            this.f2838a = null;
        } else {
            this.f2838a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2839b = null;
        } else {
            this.f2839b = c1021w2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1027X2)) {
            return false;
        }
        C1027X2 c1027x2 = (C1027X2) obj;
        return AbstractC16544l.m18089b(this.f2838a, c1027x2.f2838a) && AbstractC16544l.m18089b(this.f2839b, c1027x2.f2839b);
    }

    public final int hashCode() {
        String str = this.f2838a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1021W2 c1021w2 = this.f2839b;
        return iHashCode + (c1021w2 != null ? c1021w2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
