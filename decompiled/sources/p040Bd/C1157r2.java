package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.r2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1157r2 implements InterfaceC1136o {
    public static final C1151q2 Companion = new C1151q2();

    /* JADX INFO: renamed from: a */
    public final String f3078a;

    /* JADX INFO: renamed from: b */
    public final String f3079b;

    public /* synthetic */ C1157r2(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1145p2.f3064a.getDescriptor());
            throw null;
        }
        this.f3078a = str;
        this.f3079b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157r2)) {
            return false;
        }
        C1157r2 c1157r2 = (C1157r2) obj;
        return AbstractC16544l.m18089b(this.f3078a, c1157r2.f3078a) && AbstractC16544l.m18089b(this.f3079b, c1157r2.f3079b);
    }

    public final int hashCode() {
        return this.f3079b.hashCode() + (this.f3078a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
