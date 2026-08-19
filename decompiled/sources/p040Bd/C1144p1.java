package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.p1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1144p1 {
    public static final C1138o1 Companion = new C1138o1();

    /* JADX INFO: renamed from: a */
    public final C1058c1 f3061a;

    /* JADX INFO: renamed from: b */
    public final C1107j1 f3062b;

    /* JADX INFO: renamed from: c */
    public final C1086g1 f3063c;

    public /* synthetic */ C1144p1(int i10, C1058c1 c1058c1, C1107j1 c1107j1, C1086g1 c1086g1) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1132n1.f3050a.getDescriptor());
            throw null;
        }
        this.f3061a = c1058c1;
        this.f3062b = c1107j1;
        this.f3063c = c1086g1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144p1)) {
            return false;
        }
        C1144p1 c1144p1 = (C1144p1) obj;
        return AbstractC16544l.m18089b(this.f3061a, c1144p1.f3061a) && AbstractC16544l.m18089b(this.f3062b, c1144p1.f3062b) && AbstractC16544l.m18089b(this.f3063c, c1144p1.f3063c);
    }

    public final int hashCode() {
        C1058c1 c1058c1 = this.f3061a;
        int iHashCode = (c1058c1 == null ? 0 : c1058c1.hashCode()) * 31;
        C1107j1 c1107j1 = this.f3062b;
        int iHashCode2 = (iHashCode + (c1107j1 == null ? 0 : c1107j1.hashCode())) * 31;
        C1086g1 c1086g1 = this.f3063c;
        return iHashCode2 + (c1086g1 != null ? c1086g1.f2944a.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
