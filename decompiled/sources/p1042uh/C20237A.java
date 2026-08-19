package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C20237A {

    /* JADX INFO: renamed from: a */
    public final C20277m f64031a;

    public C20237A(C20277m c20277m) {
        this.f64031a = c20277m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20237A) && AbstractC16544l.m18089b(this.f64031a, ((C20237A) obj).f64031a);
    }

    public final int hashCode() {
        C20277m c20277m = this.f64031a;
        if (c20277m == null) {
            return 0;
        }
        return c20277m.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
