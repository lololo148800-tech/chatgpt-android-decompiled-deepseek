package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C20286v {

    /* JADX INFO: renamed from: a */
    public final String f64140a;

    /* JADX INFO: renamed from: b */
    public final String f64141b;

    /* JADX INFO: renamed from: c */
    public final C20278n f64142c;

    /* JADX INFO: renamed from: d */
    public final String f64143d;

    public C20286v(String str, String str2, C20278n c20278n, String str3) {
        this.f64140a = str;
        this.f64141b = str2;
        this.f64142c = c20278n;
        this.f64143d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20286v)) {
            return false;
        }
        C20286v c20286v = (C20286v) obj;
        return AbstractC16544l.m18089b(this.f64140a, c20286v.f64140a) && AbstractC16544l.m18089b(this.f64141b, c20286v.f64141b) && AbstractC16544l.m18089b(this.f64142c, c20286v.f64142c) && AbstractC16544l.m18089b(this.f64143d, c20286v.f64143d);
    }

    public final int hashCode() {
        String str = this.f64140a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64141b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C20278n c20278n = this.f64142c;
        int iHashCode3 = (iHashCode2 + (c20278n == null ? 0 : c20278n.hashCode())) * 31;
        String str3 = this.f64143d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
