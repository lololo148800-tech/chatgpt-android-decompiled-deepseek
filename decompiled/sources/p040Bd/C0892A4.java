package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.A4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0892A4 {
    public static final C1171t4 Companion = new C1171t4();

    /* JADX INFO: renamed from: a */
    public final C1207z4 f2616a;

    public /* synthetic */ C0892A4(int i10, C1207z4 c1207z4) {
        if ((i10 & 1) == 0) {
            this.f2616a = null;
        } else {
            this.f2616a = c1207z4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0892A4) && AbstractC16544l.m18089b(this.f2616a, ((C0892A4) obj).f2616a);
    }

    public final int hashCode() {
        C1207z4 c1207z4 = this.f2616a;
        if (c1207z4 == null) {
            return 0;
        }
        return c1207z4.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C0892A4(C1207z4 c1207z4) {
        this.f2616a = c1207z4;
    }
}
