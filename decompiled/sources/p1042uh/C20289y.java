package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C20289y {

    /* JADX INFO: renamed from: a */
    public final String f64151a;

    /* JADX INFO: renamed from: b */
    public final String f64152b;

    public C20289y(String str, String str2) {
        this.f64151a = str;
        this.f64152b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20289y)) {
            return false;
        }
        C20289y c20289y = (C20289y) obj;
        return AbstractC16544l.m18089b(this.f64151a, c20289y.f64151a) && AbstractC16544l.m18089b(this.f64152b, c20289y.f64152b);
    }

    public final int hashCode() {
        int iHashCode = this.f64151a.hashCode() * 31;
        String str = this.f64152b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
