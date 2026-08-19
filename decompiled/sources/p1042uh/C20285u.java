package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C20285u implements InterfaceC20283s {

    /* JADX INFO: renamed from: a */
    public final String f64137a;

    /* JADX INFO: renamed from: b */
    public final C20289y f64138b;

    /* JADX INFO: renamed from: c */
    public final C20288x f64139c;

    public C20285u(String __typename, C20289y c20289y, C20288x c20288x) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f64137a = __typename;
        this.f64138b = c20289y;
        this.f64139c = c20288x;
    }

    @Override // p1042uh.InterfaceC20283s
    /* JADX INFO: renamed from: a */
    public final C20288x mo21027a() {
        return this.f64139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20285u)) {
            return false;
        }
        C20285u c20285u = (C20285u) obj;
        return AbstractC16544l.m18089b(this.f64137a, c20285u.f64137a) && AbstractC16544l.m18089b(this.f64138b, c20285u.f64138b) && AbstractC16544l.m18089b(this.f64139c, c20285u.f64139c);
    }

    public final int hashCode() {
        int iHashCode = (this.f64138b.hashCode() + (this.f64137a.hashCode() * 31)) * 31;
        C20288x c20288x = this.f64139c;
        return iHashCode + (c20288x == null ? 0 : c20288x.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
