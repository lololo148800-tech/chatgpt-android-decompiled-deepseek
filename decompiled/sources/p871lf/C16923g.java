package p871lf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: lf.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16923g extends AbstractC16927k {
    public static final C16922f Companion = new C16922f();

    /* JADX INFO: renamed from: a */
    public final String f54361a;

    /* JADX INFO: renamed from: b */
    public final String f54362b;

    public C16923g(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C16921e.f54360a.getDescriptor());
            throw null;
        }
        this.f54361a = str;
        if ((i10 & 2) == 0) {
            this.f54362b = null;
        } else {
            this.f54362b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16923g)) {
            return false;
        }
        C16923g c16923g = (C16923g) obj;
        return AbstractC16544l.m18089b(this.f54361a, c16923g.f54361a) && AbstractC16544l.m18089b(this.f54362b, c16923g.f54362b);
    }

    public final int hashCode() {
        int iHashCode = this.f54361a.hashCode() * 31;
        String str = this.f54362b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
