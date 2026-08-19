package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C20529I implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final String f65154a;

    public C20529I(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f65154a = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20529I) {
            return AbstractC16544l.m18089b(this.f65154a, ((C20529I) obj).f65154a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65154a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
