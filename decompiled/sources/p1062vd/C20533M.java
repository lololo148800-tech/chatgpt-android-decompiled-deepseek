package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C20533M implements InterfaceC20539T {

    /* JADX INFO: renamed from: a */
    public final String f65158a;

    public C20533M(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f65158a = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20533M) {
            return AbstractC16544l.m18089b(this.f65158a, ((C20533M) obj).f65158a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65158a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
