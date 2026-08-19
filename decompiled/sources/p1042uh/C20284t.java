package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C20284t implements InterfaceC20283s {

    /* JADX INFO: renamed from: a */
    public final String f64134a;

    /* JADX INFO: renamed from: b */
    public final C20289y f64135b;

    /* JADX INFO: renamed from: c */
    public final C20288x f64136c;

    public C20284t(String __typename, C20289y c20289y, C20288x c20288x) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f64134a = __typename;
        this.f64135b = c20289y;
        this.f64136c = c20288x;
    }

    @Override // p1042uh.InterfaceC20283s
    /* JADX INFO: renamed from: a */
    public final C20288x mo21027a() {
        return this.f64136c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20284t)) {
            return false;
        }
        C20284t c20284t = (C20284t) obj;
        return AbstractC16544l.m18089b(this.f64134a, c20284t.f64134a) && AbstractC16544l.m18089b(this.f64135b, c20284t.f64135b) && AbstractC16544l.m18089b(this.f64136c, c20284t.f64136c);
    }

    public final int hashCode() {
        int iHashCode = this.f64134a.hashCode() * 31;
        C20289y c20289y = this.f64135b;
        return this.f64136c.hashCode() + ((iHashCode + (c20289y == null ? 0 : c20289y.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
