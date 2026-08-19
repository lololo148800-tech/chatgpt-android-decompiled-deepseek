package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C20240D {

    /* JADX INFO: renamed from: a */
    public final String f64034a;

    /* JADX INFO: renamed from: b */
    public final String f64035b;

    public C20240D(String str, String str2) {
        this.f64034a = str;
        this.f64035b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20240D)) {
            return false;
        }
        C20240D c20240d = (C20240D) obj;
        return AbstractC16544l.m18089b(this.f64034a, c20240d.f64034a) && AbstractC16544l.m18089b(this.f64035b, c20240d.f64035b);
    }

    public final int hashCode() {
        String str = this.f64034a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64035b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
