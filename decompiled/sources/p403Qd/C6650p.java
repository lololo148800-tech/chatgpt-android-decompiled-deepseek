package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6650p extends AbstractC6661w {
    public static final C6648o Companion = new C6648o();

    /* JADX INFO: renamed from: c */
    public final String f21413c;

    public C6650p(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f21413c = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6650p) {
            return AbstractC16544l.m18089b(this.f21413c, ((C6650p) obj).f21413c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21413c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6650p(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f21413c = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6646n.f21411a.getDescriptor());
            throw null;
        }
    }
}
