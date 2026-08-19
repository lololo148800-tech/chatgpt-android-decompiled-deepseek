package ge;

import bf.C11349D;
import bf.C11385m;
import bf.C11386n;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C14031I implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final C11349D f44119a;

    /* JADX INFO: renamed from: b */
    public final C11386n f44120b;

    static {
        C11385m c11385m = C11386n.Companion;
    }

    public C14031I(C11349D gizmo, C11386n social) {
        AbstractC16544l.m18094g(gizmo, "gizmo");
        AbstractC16544l.m18094g(social, "social");
        this.f44119a = gizmo;
        this.f44120b = social;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14031I)) {
            return false;
        }
        C14031I c14031i = (C14031I) obj;
        return AbstractC16544l.m18089b(this.f44119a, c14031i.f44119a) && AbstractC16544l.m18089b(this.f44120b, c14031i.f44120b);
    }

    public final int hashCode() {
        return this.f44120b.hashCode() + (this.f44119a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
