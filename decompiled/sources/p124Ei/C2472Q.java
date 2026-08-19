package p124Ei;

import p1155zi.EnumC22033m2;
import p172Gi.EnumC3062D;

/* JADX INFO: renamed from: Ei.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C2472Q implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final EnumC3062D f7703a;

    /* JADX INFO: renamed from: b */
    public final EnumC22033m2 f7704b;

    /* JADX INFO: renamed from: c */
    public final boolean f7705c;

    public C2472Q(EnumC3062D enumC3062D, EnumC22033m2 enumC22033m2, int i10) {
        enumC22033m2 = (i10 & 2) != 0 ? null : enumC22033m2;
        this.f7703a = enumC3062D;
        this.f7704b = enumC22033m2;
        this.f7705c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2472Q)) {
            return false;
        }
        C2472Q c2472q = (C2472Q) obj;
        return this.f7703a == c2472q.f7703a && this.f7704b == c2472q.f7704b && this.f7705c == c2472q.f7705c;
    }

    public final int hashCode() {
        int iHashCode = this.f7703a.hashCode() * 31;
        EnumC22033m2 enumC22033m2 = this.f7704b;
        return ((iHashCode + (enumC22033m2 == null ? 0 : enumC22033m2.hashCode())) * 31) + (this.f7705c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
