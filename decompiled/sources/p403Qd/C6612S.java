package p403Qd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p380Pd.AbstractC6389f;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.S */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6612S extends AbstractC6653q0 {
    public static final C6611Q Companion = new C6611Q();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f21338c = {new C11158d(AbstractC6389f.Companion.serializer(), 0)};

    /* JADX INFO: renamed from: b */
    public final List f21339b;

    public /* synthetic */ C6612S(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f21339b = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6610P.f21337a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6612S) && AbstractC16544l.m18089b(this.f21339b, ((C6612S) obj).f21339b);
    }

    public final int hashCode() {
        return this.f21339b.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6612S(ArrayList arrayList) {
        this.f21339b = arrayList;
    }
}
