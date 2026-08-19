package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.q0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22047q0 {
    public static final C22043p0 Companion = new C22043p0();

    /* JADX INFO: renamed from: a */
    public final String f69735a;

    /* JADX INFO: renamed from: b */
    public final String f69736b;

    public /* synthetic */ C22047q0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C22039o0.f69722a.getDescriptor());
            throw null;
        }
        this.f69735a = str;
        this.f69736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22047q0)) {
            return false;
        }
        C22047q0 c22047q0 = (C22047q0) obj;
        return AbstractC16544l.m18089b(this.f69735a, c22047q0.f69735a) && AbstractC16544l.m18089b(this.f69736b, c22047q0.f69736b);
    }

    public final int hashCode() {
        return this.f69736b.hashCode() + (this.f69735a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
