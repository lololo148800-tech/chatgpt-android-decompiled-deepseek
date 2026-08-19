package p428Rd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Rd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6864c implements InterfaceC6866e {
    public static final C6863b Companion = new C6863b();

    /* JADX INFO: renamed from: a */
    public final String f22031a;

    public C6864c(String gizmoId) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f22031a = gizmoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6864c) {
            return AbstractC16544l.m18089b(this.f22031a, ((C6864c) obj).f22031a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22031a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6864c(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f22031a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6862a.f22030a.getDescriptor());
            throw null;
        }
    }
}
