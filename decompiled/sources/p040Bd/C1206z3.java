package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.z3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1206z3 {
    public static final C1200y3 Companion = new C1200y3();

    /* JADX INFO: renamed from: a */
    public final String f3173a;

    /* JADX INFO: renamed from: b */
    public final String f3174b;

    /* JADX INFO: renamed from: c */
    public final Integer f3175c;

    public /* synthetic */ C1206z3(int i10, String str, String str2, Integer num) {
        if ((i10 & 1) == 0) {
            this.f3173a = null;
        } else {
            this.f3173a = str;
        }
        if ((i10 & 2) == 0) {
            this.f3174b = null;
        } else {
            this.f3174b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f3175c = null;
        } else {
            this.f3175c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1206z3)) {
            return false;
        }
        C1206z3 c1206z3 = (C1206z3) obj;
        return AbstractC16544l.m18089b(this.f3173a, c1206z3.f3173a) && AbstractC16544l.m18089b(this.f3174b, c1206z3.f3174b) && AbstractC16544l.m18089b(this.f3175c, c1206z3.f3175c);
    }

    public final int hashCode() {
        String str = this.f3173a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3174b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f3175c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
