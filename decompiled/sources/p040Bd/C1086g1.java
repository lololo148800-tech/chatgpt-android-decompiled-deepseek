package p040Bd;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.g1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1086g1 {
    public static final C1079f1 Companion = new C1079f1();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f2943b = {new C11131E(C11181o0.f33827a, new C11158d(C1114k1.f3022a, 0), 1)};

    /* JADX INFO: renamed from: a */
    public final Map f2944a;

    public /* synthetic */ C1086g1(int i10, Map map) {
        if (1 == (i10 & 1)) {
            this.f2944a = map;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C1072e1.f2921a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1086g1) && AbstractC16544l.m18089b(this.f2944a, ((C1086g1) obj).f2944a);
    }

    public final int hashCode() {
        return this.f2944a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
