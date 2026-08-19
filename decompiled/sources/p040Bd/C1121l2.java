package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.l2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1121l2 {
    public static final C1115k2 Companion = new C1115k2();

    /* JADX INFO: renamed from: a */
    public final String f3034a;

    public /* synthetic */ C1121l2(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f3034a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C1108j2.f3014a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1121l2) && AbstractC16544l.m18089b(this.f3034a, ((C1121l2) obj).f3034a);
    }

    public final int hashCode() {
        return this.f3034a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
