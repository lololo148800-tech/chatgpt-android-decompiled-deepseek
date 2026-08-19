package p1126yd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.X0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21451X0 {
    public static final C21449W0 Companion = new C21449W0();

    /* JADX INFO: renamed from: a */
    public final Boolean f68038a;

    /* JADX INFO: renamed from: b */
    public final String f68039b;

    public /* synthetic */ C21451X0(int i10, Boolean bool, String str) {
        if ((i10 & 1) == 0) {
            this.f68038a = null;
        } else {
            this.f68038a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f68039b = null;
        } else {
            this.f68039b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21451X0)) {
            return false;
        }
        C21451X0 c21451x0 = (C21451X0) obj;
        return AbstractC16544l.m18089b(this.f68038a, c21451x0.f68038a) && AbstractC16544l.m18089b(this.f68039b, c21451x0.f68039b);
    }

    public final int hashCode() {
        Boolean bool = this.f68038a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f68039b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
