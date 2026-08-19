package p044Bh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bh.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1291d {
    public static final C1290c Companion = new C1290c();

    /* JADX INFO: renamed from: a */
    public final String f3428a;

    /* JADX INFO: renamed from: b */
    public final String f3429b;

    public /* synthetic */ C1291d(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1289b.f3427a.getDescriptor());
            throw null;
        }
        this.f3428a = str;
        this.f3429b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1291d)) {
            return false;
        }
        C1291d c1291d = (C1291d) obj;
        return AbstractC16544l.m18089b(this.f3428a, c1291d.f3428a) && AbstractC16544l.m18089b(this.f3429b, c1291d.f3429b);
    }

    public final int hashCode() {
        String str = this.f3428a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3429b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1291d(String str, String str2) {
        this.f3428a = str;
        this.f3429b = str2;
    }
}
