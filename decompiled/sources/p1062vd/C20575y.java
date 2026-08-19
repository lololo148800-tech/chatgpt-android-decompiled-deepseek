package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C20575y implements InterfaceC20576z {

    /* JADX INFO: renamed from: a */
    public final String f65303a;

    public C20575y(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f65303a = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20575y) {
            return AbstractC16544l.m18089b(this.f65303a, ((C20575y) obj).f65303a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65303a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
