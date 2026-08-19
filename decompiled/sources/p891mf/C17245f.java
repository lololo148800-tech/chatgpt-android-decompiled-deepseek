package p891mf;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p505Uf.C7638A;

/* JADX INFO: renamed from: mf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C17245f implements InterfaceC17246g {

    /* JADX INFO: renamed from: a */
    public final C7638A f55024a;

    /* JADX INFO: renamed from: b */
    public final C5551u f55025b;

    public C17245f(C7638A permission, C5551u c5551u) {
        AbstractC16544l.m18094g(permission, "permission");
        this.f55024a = permission;
        this.f55025b = c5551u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17245f)) {
            return false;
        }
        C17245f c17245f = (C17245f) obj;
        return AbstractC16544l.m18089b(this.f55024a, c17245f.f55024a) && AbstractC16544l.m18089b(this.f55025b, c17245f.f55025b);
    }

    public final int hashCode() {
        int iHashCode = this.f55024a.hashCode() * 31;
        C5551u c5551u = this.f55025b;
        return iHashCode + (c5551u == null ? 0 : c5551u.f18004Y.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
