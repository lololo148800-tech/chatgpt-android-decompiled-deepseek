package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.C3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0903C3 {
    public static final C0897B3 Companion = new C0897B3();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f2637b = {new C11158d(C1170t3.f3120d, 0)};

    /* JADX INFO: renamed from: a */
    public final List f2638a;

    public /* synthetic */ C0903C3(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f2638a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C0891A3.f2615a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0903C3) && AbstractC16544l.m18089b(this.f2638a, ((C0903C3) obj).f2638a);
    }

    public final int hashCode() {
        return this.f2638a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
