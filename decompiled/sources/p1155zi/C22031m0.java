package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.m0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22031m0 extends AbstractC22035n0 {
    public static final C22027l0 Companion = new C22027l0();

    /* JADX INFO: renamed from: b */
    public final String f69690b;

    public C22031m0(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f69690b = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22031m0) {
            return AbstractC16544l.m18089b(this.f69690b, ((C22031m0) obj).f69690b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69690b.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C22031m0(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f69690b = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C22023k0.f69666a.getDescriptor());
            throw null;
        }
    }
}
