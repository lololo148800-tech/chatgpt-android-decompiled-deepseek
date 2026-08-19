package p1155zi;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.v2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22069v2 {
    public static final C22065u2 Companion = new C22065u2();

    /* JADX INFO: renamed from: a */
    public final Boolean f69770a;

    /* JADX INFO: renamed from: b */
    public final Boolean f69771b;

    /* JADX INFO: renamed from: c */
    public final Boolean f69772c;

    public /* synthetic */ C22069v2(int i10, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i10 & 1) == 0) {
            this.f69770a = null;
        } else {
            this.f69770a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f69771b = null;
        } else {
            this.f69771b = bool2;
        }
        if ((i10 & 4) == 0) {
            this.f69772c = null;
        } else {
            this.f69772c = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22069v2)) {
            return false;
        }
        C22069v2 c22069v2 = (C22069v2) obj;
        return AbstractC16544l.m18089b(this.f69770a, c22069v2.f69770a) && AbstractC16544l.m18089b(this.f69771b, c22069v2.f69771b) && AbstractC16544l.m18089b(this.f69772c, c22069v2.f69772c);
    }

    public final int hashCode() {
        Boolean bool = this.f69770a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f69771b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f69772c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
