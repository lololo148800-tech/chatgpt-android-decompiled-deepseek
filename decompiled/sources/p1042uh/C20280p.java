package p1042uh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C20280p {

    /* JADX INFO: renamed from: a */
    public final String f64124a;

    /* JADX INFO: renamed from: b */
    public final String f64125b;

    /* JADX INFO: renamed from: c */
    public final String f64126c;

    /* JADX INFO: renamed from: d */
    public final String f64127d;

    /* JADX INFO: renamed from: e */
    public final List f64128e;

    public C20280p(String str, String str2, String str3, String str4, List list) {
        this.f64124a = str;
        this.f64125b = str2;
        this.f64126c = str3;
        this.f64127d = str4;
        this.f64128e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20280p)) {
            return false;
        }
        C20280p c20280p = (C20280p) obj;
        return AbstractC16544l.m18089b(this.f64124a, c20280p.f64124a) && AbstractC16544l.m18089b(this.f64125b, c20280p.f64125b) && AbstractC16544l.m18089b(this.f64126c, c20280p.f64126c) && AbstractC16544l.m18089b(this.f64127d, c20280p.f64127d) && AbstractC16544l.m18089b(this.f64128e, c20280p.f64128e);
    }

    public final int hashCode() {
        int iHashCode = this.f64124a.hashCode() * 31;
        String str = this.f64125b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64126c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64127d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f64128e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
