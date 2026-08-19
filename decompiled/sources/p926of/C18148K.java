package p926of;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C18148K implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57894a;

    public C18148K(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f57894a = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18148K) {
            return AbstractC16544l.m18089b(this.f57894a, ((C18148K) obj).f57894a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57894a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
