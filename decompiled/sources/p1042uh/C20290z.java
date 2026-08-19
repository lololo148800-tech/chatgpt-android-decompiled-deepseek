package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C20290z implements InterfaceC20283s {

    /* JADX INFO: renamed from: a */
    public final String f64153a;

    /* JADX INFO: renamed from: b */
    public final C20289y f64154b;

    /* JADX INFO: renamed from: c */
    public final C20288x f64155c;

    public C20290z(String __typename, C20289y c20289y, C20288x c20288x) {
        AbstractC16544l.m18094g(__typename, "__typename");
        this.f64153a = __typename;
        this.f64154b = c20289y;
        this.f64155c = c20288x;
    }

    @Override // p1042uh.InterfaceC20283s
    /* JADX INFO: renamed from: a */
    public final C20288x mo21027a() {
        return this.f64155c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20290z)) {
            return false;
        }
        C20290z c20290z = (C20290z) obj;
        return AbstractC16544l.m18089b(this.f64153a, c20290z.f64153a) && AbstractC16544l.m18089b(this.f64154b, c20290z.f64154b) && AbstractC16544l.m18089b(this.f64155c, c20290z.f64155c);
    }

    public final int hashCode() {
        int iHashCode = this.f64153a.hashCode() * 31;
        C20289y c20289y = this.f64154b;
        int iHashCode2 = (iHashCode + (c20289y == null ? 0 : c20289y.hashCode())) * 31;
        C20288x c20288x = this.f64155c;
        return iHashCode2 + (c20288x != null ? c20288x.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
