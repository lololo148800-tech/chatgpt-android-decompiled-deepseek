package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C20538S implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final String f65164a;

    public C20538S(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f65164a = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20538S) {
            return AbstractC16544l.m18089b(this.f65164a, ((C20538S) obj).f65164a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65164a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
