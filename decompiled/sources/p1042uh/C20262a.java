package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20262a {

    /* JADX INFO: renamed from: a */
    public final C20268d f64083a;

    public C20262a(C20268d c20268d) {
        this.f64083a = c20268d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20262a) && AbstractC16544l.m18089b(this.f64083a, ((C20262a) obj).f64083a);
    }

    public final int hashCode() {
        C20268d c20268d = this.f64083a;
        if (c20268d == null) {
            return 0;
        }
        return c20268d.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
