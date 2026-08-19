package p040Bd;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.F4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0922F4 {
    public static final C0916E4 Companion = new C0916E4();

    /* JADX INFO: renamed from: a */
    public final int f2662a;

    /* JADX INFO: renamed from: b */
    public final int f2663b;

    public /* synthetic */ C0922F4(int i10, int i11, int i12) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0910D4.f2643a.getDescriptor());
            throw null;
        }
        this.f2662a = i11;
        this.f2663b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0922F4)) {
            return false;
        }
        C0922F4 c0922f4 = (C0922F4) obj;
        return this.f2662a == c0922f4.f2662a && this.f2663b == c0922f4.f2663b;
    }

    public final int hashCode() {
        return (this.f2662a * 31) + this.f2663b;
    }

    public final String toString() {
        return "█";
    }
}
