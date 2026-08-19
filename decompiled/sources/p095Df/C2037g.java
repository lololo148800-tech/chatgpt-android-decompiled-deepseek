package p095Df;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Df.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2037g {
    public static final C2036f Companion = new C2036f();

    /* JADX INFO: renamed from: a */
    public final String f6243a;

    /* JADX INFO: renamed from: b */
    public final String f6244b;

    public /* synthetic */ C2037g(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2035e.f6242a.getDescriptor());
            throw null;
        }
        this.f6243a = str;
        this.f6244b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037g)) {
            return false;
        }
        C2037g c2037g = (C2037g) obj;
        return AbstractC16544l.m18089b(this.f6243a, c2037g.f6243a) && AbstractC16544l.m18089b(this.f6244b, c2037g.f6244b);
    }

    public final int hashCode() {
        return this.f6244b.hashCode() + (this.f6243a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
