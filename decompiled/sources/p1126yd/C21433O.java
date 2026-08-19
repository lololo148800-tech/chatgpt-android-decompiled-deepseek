package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C1032Y1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.O */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21433O implements InterfaceC21409C {
    public static final C21431N Companion = new C21431N();

    /* JADX INFO: renamed from: a */
    public final String f68003a;

    /* JADX INFO: renamed from: b */
    public final C1032Y1 f68004b;

    public C21433O(int i10, String str, C1032Y1 c1032y1) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21429M.f68000a.getDescriptor());
            throw null;
        }
        this.f68003a = str;
        this.f68004b = c1032y1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21433O)) {
            return false;
        }
        C21433O c21433o = (C21433O) obj;
        return AbstractC16544l.m18089b(this.f68003a, c21433o.f68003a) && AbstractC16544l.m18089b(this.f68004b, c21433o.f68004b);
    }

    public final int hashCode() {
        return this.f68004b.hashCode() + (this.f68003a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
