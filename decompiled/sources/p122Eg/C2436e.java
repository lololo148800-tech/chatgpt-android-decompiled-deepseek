package p122Eg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Eg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2436e implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f7572a;

    /* JADX INFO: renamed from: b */
    public final String f7573b;

    /* JADX INFO: renamed from: c */
    public final String f7574c;

    public C2436e(String str, String str2, String str3) {
        this.f7572a = str;
        this.f7573b = str2;
        this.f7574c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2436e)) {
            return false;
        }
        C2436e c2436e = (C2436e) obj;
        return AbstractC16544l.m18089b(this.f7572a, c2436e.f7572a) && AbstractC16544l.m18089b(this.f7573b, c2436e.f7573b) && AbstractC16544l.m18089b(this.f7574c, c2436e.f7574c);
    }

    public final int hashCode() {
        String str = this.f7572a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7573b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7574c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
