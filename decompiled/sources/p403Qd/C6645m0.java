package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.m0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6645m0 extends AbstractC6653q0 {
    public static final C6643l0 Companion = new C6643l0();

    /* JADX INFO: renamed from: b */
    public final String f21409b;

    /* JADX INFO: renamed from: c */
    public final String f21410c;

    public /* synthetic */ C6645m0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C6641k0.f21404a.getDescriptor());
            throw null;
        }
        this.f21409b = str;
        this.f21410c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6645m0)) {
            return false;
        }
        C6645m0 c6645m0 = (C6645m0) obj;
        return AbstractC16544l.m18089b(this.f21409b, c6645m0.f21409b) && AbstractC16544l.m18089b(this.f21410c, c6645m0.f21410c);
    }

    public final int hashCode() {
        String str = this.f21409b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21410c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C6645m0(String str, String str2) {
        this.f21409b = str;
        this.f21410c = str2;
    }
}
