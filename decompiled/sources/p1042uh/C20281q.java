package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1107xh.EnumC21231V;

/* JADX INFO: renamed from: uh.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20281q {

    /* JADX INFO: renamed from: a */
    public final EnumC21231V f64129a;

    /* JADX INFO: renamed from: b */
    public final String f64130b;

    /* JADX INFO: renamed from: c */
    public final boolean f64131c;

    /* JADX INFO: renamed from: d */
    public final C20240D f64132d;

    public C20281q(EnumC21231V enumC21231V, String str, boolean z6, C20240D c20240d) {
        this.f64129a = enumC21231V;
        this.f64130b = str;
        this.f64131c = z6;
        this.f64132d = c20240d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20281q)) {
            return false;
        }
        C20281q c20281q = (C20281q) obj;
        return this.f64129a == c20281q.f64129a && AbstractC16544l.m18089b(this.f64130b, c20281q.f64130b) && this.f64131c == c20281q.f64131c && AbstractC16544l.m18089b(this.f64132d, c20281q.f64132d);
    }

    public final int hashCode() {
        return this.f64132d.hashCode() + ((AbstractC0168G.m527p(this.f64129a.hashCode() * 31, 31, this.f64130b) + (this.f64131c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
