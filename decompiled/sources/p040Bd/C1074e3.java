package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.e3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1074e3 {
    public static final C1067d3 Companion = new C1067d3();

    /* JADX INFO: renamed from: a */
    public final String f2923a;

    /* JADX INFO: renamed from: b */
    public final Integer f2924b;

    /* JADX INFO: renamed from: c */
    public final Integer f2925c;

    public /* synthetic */ C1074e3(int i10, String str, Integer num, Integer num2) {
        if ((i10 & 1) == 0) {
            this.f2923a = null;
        } else {
            this.f2923a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2924b = null;
        } else {
            this.f2924b = num;
        }
        if ((i10 & 4) == 0) {
            this.f2925c = null;
        } else {
            this.f2925c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074e3)) {
            return false;
        }
        C1074e3 c1074e3 = (C1074e3) obj;
        return AbstractC16544l.m18089b(this.f2923a, c1074e3.f2923a) && AbstractC16544l.m18089b(this.f2924b, c1074e3.f2924b) && AbstractC16544l.m18089b(this.f2925c, c1074e3.f2925c);
    }

    public final int hashCode() {
        String str = this.f2923a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f2924b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f2925c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
