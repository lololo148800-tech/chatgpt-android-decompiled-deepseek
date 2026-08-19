package p1026ti;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ti.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19995a implements InterfaceC19998d {

    /* JADX INFO: renamed from: a */
    public final String f63309a;

    /* JADX INFO: renamed from: b */
    public final String f63310b;

    /* JADX INFO: renamed from: c */
    public final String f63311c;

    public C19995a(String str, String str2, String str3) {
        this.f63309a = str;
        this.f63310b = str2;
        this.f63311c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19995a)) {
            return false;
        }
        C19995a c19995a = (C19995a) obj;
        return AbstractC16544l.m18089b(this.f63309a, c19995a.f63309a) && AbstractC16544l.m18089b(this.f63310b, c19995a.f63310b) && AbstractC16544l.m18089b(this.f63311c, c19995a.f63311c);
    }

    public final int hashCode() {
        String str = this.f63309a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63310b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63311c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
