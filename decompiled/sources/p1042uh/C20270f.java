package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17873z;

/* JADX INFO: renamed from: uh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20270f implements InterfaceC17873z {

    /* JADX INFO: renamed from: a */
    public final C20264b f64103a;

    /* JADX INFO: renamed from: b */
    public final C20266c f64104b;

    public C20270f(C20264b c20264b, C20266c c20266c) {
        this.f64103a = c20264b;
        this.f64104b = c20266c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20270f)) {
            return false;
        }
        C20270f c20270f = (C20270f) obj;
        return AbstractC16544l.m18089b(this.f64103a, c20270f.f64103a) && AbstractC16544l.m18089b(this.f64104b, c20270f.f64104b);
    }

    public final int hashCode() {
        int iHashCode = this.f64103a.hashCode() * 31;
        C20266c c20266c = this.f64104b;
        return iHashCode + (c20266c == null ? 0 : c20266c.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
