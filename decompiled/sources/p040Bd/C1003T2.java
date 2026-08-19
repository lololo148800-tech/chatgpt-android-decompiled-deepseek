package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.T2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1003T2 {
    public static final C0997S2 Companion = new C0997S2();

    /* JADX INFO: renamed from: a */
    public final String f2797a;

    /* JADX INFO: renamed from: b */
    public final String f2798b;

    /* JADX INFO: renamed from: c */
    public final String f2799c;

    /* JADX INFO: renamed from: d */
    public final String f2800d;

    public C1003T2(int i10, String str, String str2, String str3, String str4) {
        if ((i10 & 1) == 0) {
            this.f2797a = null;
        } else {
            this.f2797a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2798b = null;
        } else {
            this.f2798b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f2799c = null;
        } else {
            this.f2799c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f2800d = null;
        } else {
            this.f2800d = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1003T2)) {
            return false;
        }
        C1003T2 c1003t2 = (C1003T2) obj;
        String str = c1003t2.f2797a;
        String str2 = this.f2797a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        if (!zM18089b || !AbstractC16544l.m18089b(this.f2798b, c1003t2.f2798b) || !AbstractC16544l.m18089b(this.f2799c, c1003t2.f2799c)) {
            return false;
        }
        String str3 = this.f2800d;
        String str4 = c1003t2.f2800d;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        return zM18089b2;
    }

    public final int hashCode() {
        String str = this.f2797a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2798b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2799c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2800d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
