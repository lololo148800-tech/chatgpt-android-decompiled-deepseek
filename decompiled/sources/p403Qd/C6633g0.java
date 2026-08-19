package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p505Uf.C7638A;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.g0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6633g0 extends AbstractC6653q0 {
    public static final C6631f0 Companion = new C6631f0();

    /* JADX INFO: renamed from: b */
    public final String f21370b;

    /* JADX INFO: renamed from: c */
    public final boolean f21371c;

    /* JADX INFO: renamed from: d */
    public final C7638A f21372d;

    /* JADX INFO: renamed from: e */
    public final C5551u f21373e;

    public C6633g0(String jawboneId, boolean z6, C7638A c7638a, C5551u c5551u) {
        AbstractC16544l.m18094g(jawboneId, "jawboneId");
        this.f21370b = jawboneId;
        this.f21371c = z6;
        this.f21372d = c7638a;
        this.f21373e = c5551u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6633g0)) {
            return false;
        }
        C6633g0 c6633g0 = (C6633g0) obj;
        return AbstractC16544l.m18089b(this.f21370b, c6633g0.f21370b) && this.f21371c == c6633g0.f21371c && AbstractC16544l.m18089b(this.f21372d, c6633g0.f21372d) && AbstractC16544l.m18089b(this.f21373e, c6633g0.f21373e);
    }

    public final int hashCode() {
        int iHashCode = ((this.f21370b.hashCode() * 31) + (this.f21371c ? 1231 : 1237)) * 31;
        C7638A c7638a = this.f21372d;
        int iHashCode2 = (iHashCode + (c7638a == null ? 0 : c7638a.hashCode())) * 31;
        C5551u c5551u = this.f21373e;
        return iHashCode2 + (c5551u != null ? c5551u.f18004Y.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C6633g0(int i10, String str, boolean z6, C7638A c7638a, C5551u c5551u) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C6629e0.f21365a.getDescriptor());
            throw null;
        }
        this.f21370b = str;
        this.f21371c = z6;
        this.f21372d = c7638a;
        this.f21373e = c5551u;
    }
}
