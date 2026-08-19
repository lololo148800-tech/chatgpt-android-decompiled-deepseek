package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.z4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1207z4 {
    public static final C1183v4 Companion = new C1183v4();

    /* JADX INFO: renamed from: a */
    public final C1201y4 f3176a;

    public /* synthetic */ C1207z4(int i10, C1201y4 c1201y4) {
        if ((i10 & 1) == 0) {
            this.f3176a = null;
        } else {
            this.f3176a = c1201y4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1207z4) && AbstractC16544l.m18089b(this.f3176a, ((C1207z4) obj).f3176a);
    }

    public final int hashCode() {
        C1201y4 c1201y4 = this.f3176a;
        if (c1201y4 == null) {
            return 0;
        }
        return c1201y4.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C1207z4(C1201y4 c1201y4) {
        this.f3176a = c1201y4;
    }
}
