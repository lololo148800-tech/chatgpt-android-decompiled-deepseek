package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C1026X1;
import p040Bd.C1032Y1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.x0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2862x0 {
    public static final C2860w0 Companion = new C2860w0();

    /* JADX INFO: renamed from: a */
    public final String f8632a;

    /* JADX INFO: renamed from: b */
    public final C1032Y1 f8633b;

    /* JADX INFO: renamed from: c */
    public final String f8634c;

    static {
        C1026X1 c1026x1 = C1032Y1.Companion;
    }

    public C2862x0(int i10, String str, C1032Y1 c1032y1, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C2858v0.f8628a.getDescriptor());
            throw null;
        }
        this.f8632a = str;
        this.f8633b = c1032y1;
        this.f8634c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2862x0)) {
            return false;
        }
        C2862x0 c2862x0 = (C2862x0) obj;
        return AbstractC16544l.m18089b(this.f8632a, c2862x0.f8632a) && AbstractC16544l.m18089b(this.f8633b, c2862x0.f8633b) && AbstractC16544l.m18089b(this.f8634c, c2862x0.f8634c);
    }

    public final int hashCode() {
        int iHashCode = this.f8632a.hashCode() * 31;
        C1032Y1 c1032y1 = this.f8633b;
        int iHashCode2 = (iHashCode + (c1032y1 == null ? 0 : c1032y1.hashCode())) * 31;
        String str = this.f8634c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
