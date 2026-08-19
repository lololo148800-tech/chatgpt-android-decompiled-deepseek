package p040Bd;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.x0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1191x0 {
    public static final C1185w0 Companion = new C1185w0();

    /* JADX INFO: renamed from: a */
    public final int f3143a;

    /* JADX INFO: renamed from: b */
    public final int f3144b;

    public /* synthetic */ C1191x0(int i10, int i11, int i12) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1179v0.f3129a.getDescriptor());
            throw null;
        }
        this.f3143a = i11;
        this.f3144b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191x0)) {
            return false;
        }
        C1191x0 c1191x0 = (C1191x0) obj;
        return this.f3143a == c1191x0.f3143a && this.f3144b == c1191x0.f3144b;
    }

    public final int hashCode() {
        return (this.f3143a * 31) + this.f3144b;
    }

    public final String toString() {
        return "█";
    }
}
