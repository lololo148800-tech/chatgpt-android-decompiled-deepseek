package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20268d {

    /* JADX INFO: renamed from: a */
    public final String f64099a;

    /* JADX INFO: renamed from: b */
    public final C20241E f64100b;

    public C20268d(String str, C20241E c20241e) {
        this.f64099a = str;
        this.f64100b = c20241e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20268d)) {
            return false;
        }
        C20268d c20268d = (C20268d) obj;
        return AbstractC16544l.m18089b(this.f64099a, c20268d.f64099a) && AbstractC16544l.m18089b(this.f64100b, c20268d.f64100b);
    }

    public final int hashCode() {
        return this.f64100b.hashCode() + (this.f64099a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
