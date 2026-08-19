package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.X4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1029X4 {
    public static final C1023W4 Companion = new C1023W4();

    /* JADX INFO: renamed from: a */
    public final String f2840a;

    /* JADX INFO: renamed from: b */
    public final String f2841b;

    public /* synthetic */ C1029X4(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1017V4.f2821a.getDescriptor());
            throw null;
        }
        this.f2840a = str;
        if ((i10 & 2) == 0) {
            this.f2841b = null;
        } else {
            this.f2841b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1029X4)) {
            return false;
        }
        C1029X4 c1029x4 = (C1029X4) obj;
        return AbstractC16544l.m18089b(this.f2840a, c1029x4.f2840a) && AbstractC16544l.m18089b(this.f2841b, c1029x4.f2841b);
    }

    public final int hashCode() {
        int iHashCode = this.f2840a.hashCode() * 31;
        String str = this.f2841b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
