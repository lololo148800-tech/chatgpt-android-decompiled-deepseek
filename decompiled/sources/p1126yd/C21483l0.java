package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.l0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21483l0 implements InterfaceC21409C {
    public static final C21475h0 Companion = new C21475h0();

    /* JADX INFO: renamed from: a */
    public final C21481k0 f68083a;

    public /* synthetic */ C21483l0(int i10, C21481k0 c21481k0) {
        if (1 == (i10 & 1)) {
            this.f68083a = c21481k0;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21473g0.f68072a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21483l0) && AbstractC16544l.m18089b(this.f68083a, ((C21483l0) obj).f68083a);
    }

    public final int hashCode() {
        return this.f68083a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
