package p1126yd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.r0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21495r0 {
    public static final C21493q0 Companion = new C21493q0();

    /* JADX INFO: renamed from: a */
    public final String f68108a;

    /* JADX INFO: renamed from: b */
    public final String f68109b;

    public /* synthetic */ C21495r0(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f68108a = null;
        } else {
            this.f68108a = str;
        }
        if ((i10 & 2) == 0) {
            this.f68109b = null;
        } else {
            this.f68109b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21495r0)) {
            return false;
        }
        C21495r0 c21495r0 = (C21495r0) obj;
        return AbstractC16544l.m18089b(this.f68108a, c21495r0.f68108a) && AbstractC16544l.m18089b(this.f68109b, c21495r0.f68109b);
    }

    public final int hashCode() {
        String str = this.f68108a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f68109b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
