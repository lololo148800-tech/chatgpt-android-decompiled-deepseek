package p1155zi;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.T0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21962T0 {
    public static final C21959S0 Companion = new C21959S0();

    /* JADX INFO: renamed from: a */
    public final C21954Q0 f69526a;

    public /* synthetic */ C21962T0(int i10, C21954Q0 c21954q0) {
        if ((i10 & 1) == 0) {
            this.f69526a = null;
        } else {
            this.f69526a = c21954q0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21962T0) && AbstractC16544l.m18089b(this.f69526a, ((C21962T0) obj).f69526a);
    }

    public final int hashCode() {
        C21954Q0 c21954q0 = this.f69526a;
        if (c21954q0 == null) {
            return 0;
        }
        return c21954q0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
