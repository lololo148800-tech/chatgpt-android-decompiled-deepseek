package p479Td;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7369t {
    public static final C7368s Companion = new C7368s();

    /* JADX INFO: renamed from: a */
    public final String f23366a;

    /* JADX INFO: renamed from: b */
    public final String f23367b;

    /* JADX INFO: renamed from: c */
    public final String f23368c;

    /* JADX INFO: renamed from: d */
    public final C7320F f23369d;

    public /* synthetic */ C7369t(int i10, String str, String str2, String str3, C7320F c7320f) {
        if ((i10 & 1) == 0) {
            this.f23366a = null;
        } else {
            this.f23366a = str;
        }
        if ((i10 & 2) == 0) {
            this.f23367b = null;
        } else {
            this.f23367b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f23368c = null;
        } else {
            this.f23368c = str3;
        }
        if ((i10 & 8) != 0) {
            this.f23369d = c7320f;
            return;
        }
        String str4 = this.f23368c;
        this.f23369d = new C7320F(14, str4 == null ? "" : str4, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7369t)) {
            return false;
        }
        C7369t c7369t = (C7369t) obj;
        return AbstractC16544l.m18089b(this.f23366a, c7369t.f23366a) && AbstractC16544l.m18089b(this.f23367b, c7369t.f23367b) && AbstractC16544l.m18089b(this.f23368c, c7369t.f23368c);
    }

    public final int hashCode() {
        String str = this.f23366a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23367b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23368c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C7369t(String str, String str2, String str3) {
        this.f23366a = str;
        this.f23367b = str2;
        this.f23368c = str3;
        this.f23369d = new C7320F(14, str3 == null ? "" : str3, null, false, false);
    }
}
