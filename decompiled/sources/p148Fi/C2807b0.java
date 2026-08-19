package p148Fi;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.b0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2807b0 extends AbstractC2841n {
    public static final C2804a0 Companion = new C2804a0();

    /* JADX INFO: renamed from: a */
    public final C2816e0 f8533a;

    /* JADX INFO: renamed from: b */
    public final C2834k0 f8534b;

    public C2807b0(int i10, C2816e0 c2816e0, C2834k0 c2834k0) {
        if ((i10 & 1) == 0) {
            this.f8533a = null;
        } else {
            this.f8533a = c2816e0;
        }
        if ((i10 & 2) == 0) {
            this.f8534b = null;
        } else {
            this.f8534b = c2834k0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2807b0)) {
            return false;
        }
        C2807b0 c2807b0 = (C2807b0) obj;
        return AbstractC16544l.m18089b(this.f8533a, c2807b0.f8533a) && AbstractC16544l.m18089b(this.f8534b, c2807b0.f8534b);
    }

    public final int hashCode() {
        C2816e0 c2816e0 = this.f8533a;
        int iHashCode = (c2816e0 == null ? 0 : c2816e0.hashCode()) * 31;
        C2834k0 c2834k0 = this.f8534b;
        return iHashCode + (c2834k0 != null ? c2834k0.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
