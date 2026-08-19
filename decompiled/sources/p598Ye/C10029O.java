package p598Ye;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.O */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10029O {
    public static final C10028N Companion = new C10028N();

    /* JADX INFO: renamed from: a */
    public final C10047r f29725a;

    public /* synthetic */ C10029O(int i10, C10047r c10047r) {
        if (1 == (i10 & 1)) {
            this.f29725a = c10047r;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C10027M.f29724a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10029O) && AbstractC16544l.m18089b(this.f29725a, ((C10029O) obj).f29725a);
    }

    public final int hashCode() {
        return this.f29725a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
