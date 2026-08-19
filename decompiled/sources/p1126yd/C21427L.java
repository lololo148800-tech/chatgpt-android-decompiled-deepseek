package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.L */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21427L implements InterfaceC21409C {
    public static final C21425K Companion = new C21425K();

    /* JADX INFO: renamed from: a */
    public final String f67999a;

    public C21427L(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f67999a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21423J.f67994a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21427L) {
            return AbstractC16544l.m18089b(this.f67999a, ((C21427L) obj).f67999a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f67999a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
