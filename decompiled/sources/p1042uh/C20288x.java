package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C20288x {

    /* JADX INFO: renamed from: a */
    public final String f64147a;

    /* JADX INFO: renamed from: b */
    public final String f64148b;

    /* JADX INFO: renamed from: c */
    public final String f64149c;

    /* JADX INFO: renamed from: d */
    public final String f64150d;

    public C20288x(String str, String str2, String str3, String str4) {
        this.f64147a = str;
        this.f64148b = str2;
        this.f64149c = str3;
        this.f64150d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20288x)) {
            return false;
        }
        C20288x c20288x = (C20288x) obj;
        return AbstractC16544l.m18089b(this.f64147a, c20288x.f64147a) && AbstractC16544l.m18089b(this.f64148b, c20288x.f64148b) && AbstractC16544l.m18089b(this.f64149c, c20288x.f64149c) && AbstractC16544l.m18089b(this.f64150d, c20288x.f64150d);
    }

    public final int hashCode() {
        int iHashCode = this.f64147a.hashCode() * 31;
        String str = this.f64148b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64149c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64150d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
