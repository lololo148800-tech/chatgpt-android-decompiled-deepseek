package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C20261Z {

    /* JADX INFO: renamed from: a */
    public final String f64081a;

    /* JADX INFO: renamed from: b */
    public final String f64082b;

    public C20261Z(String name, String str) {
        AbstractC16544l.m18094g(name, "name");
        this.f64081a = name;
        this.f64082b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20261Z)) {
            return false;
        }
        C20261Z c20261z = (C20261Z) obj;
        return AbstractC16544l.m18089b(this.f64081a, c20261z.f64081a) && AbstractC16544l.m18089b(this.f64082b, c20261z.f64082b);
    }

    public final int hashCode() {
        int iHashCode = this.f64081a.hashCode() * 31;
        String str = this.f64082b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
