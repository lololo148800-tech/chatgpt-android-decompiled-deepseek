package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1107xh.EnumC21254q;

/* JADX INFO: renamed from: uh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20264b {

    /* JADX INFO: renamed from: a */
    public final String f64089a;

    /* JADX INFO: renamed from: b */
    public final String f64090b;

    /* JADX INFO: renamed from: c */
    public final String f64091c;

    /* JADX INFO: renamed from: d */
    public final EnumC21254q f64092d;

    /* JADX INFO: renamed from: e */
    public final String f64093e;

    public C20264b(String str, String str2, String str3, EnumC21254q enumC21254q, String str4) {
        this.f64089a = str;
        this.f64090b = str2;
        this.f64091c = str3;
        this.f64092d = enumC21254q;
        this.f64093e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20264b)) {
            return false;
        }
        C20264b c20264b = (C20264b) obj;
        return AbstractC16544l.m18089b(this.f64089a, c20264b.f64089a) && AbstractC16544l.m18089b(this.f64090b, c20264b.f64090b) && AbstractC16544l.m18089b(this.f64091c, c20264b.f64091c) && this.f64092d == c20264b.f64092d && AbstractC16544l.m18089b(this.f64093e, c20264b.f64093e);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f64089a.hashCode() * 31, 31, this.f64090b);
        String str = this.f64091c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        EnumC21254q enumC21254q = this.f64092d;
        int iHashCode2 = (iHashCode + (enumC21254q == null ? 0 : enumC21254q.hashCode())) * 31;
        String str2 = this.f64093e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
