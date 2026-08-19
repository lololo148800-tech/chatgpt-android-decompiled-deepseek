package p148Fi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2855u extends AbstractC2841n {
    public static final C2847q Companion = new C2847q();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f8618b = {new C11158d(C2849r.f8604a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f8619a;

    public C2855u(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f8619a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C2845p.f8595a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2855u) && AbstractC16544l.m18089b(this.f8619a, ((C2855u) obj).f8619a);
    }

    public final int hashCode() {
        return this.f8619a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
