package p095Df;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Df.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2034d {
    public static final C2033c Companion = new C2033c();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f6240b = {new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f6241a;

    public /* synthetic */ C2034d(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f6241a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C2032b.f6239a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2034d) && AbstractC16544l.m18089b(this.f6241a, ((C2034d) obj).f6241a);
    }

    public final int hashCode() {
        return this.f6241a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C2034d(List list) {
        this.f6241a = list;
    }
}
