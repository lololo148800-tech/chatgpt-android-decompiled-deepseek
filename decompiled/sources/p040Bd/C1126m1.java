package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.m1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1126m1 {
    public static final C1120l1 Companion = new C1120l1();

    /* JADX INFO: renamed from: a */
    public final int f3040a;

    /* JADX INFO: renamed from: b */
    public final Float f3041b;

    public C1126m1(int i10) {
        this.f3040a = i10;
        this.f3041b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1126m1)) {
            return false;
        }
        C1126m1 c1126m1 = (C1126m1) obj;
        return this.f3040a == c1126m1.f3040a && AbstractC16544l.m18089b(this.f3041b, c1126m1.f3041b);
    }

    public final int hashCode() {
        int i10 = this.f3040a * 31;
        Float f10 = this.f3041b;
        return i10 + (f10 == null ? 0 : f10.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C1126m1(int i10, int i11, Float f10) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1114k1.f3022a.getDescriptor());
            throw null;
        }
        this.f3040a = i11;
        this.f3041b = f10;
    }
}
