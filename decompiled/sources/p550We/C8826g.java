package p550We;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: We.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8826g {
    public static final C8825f Companion = new C8825f();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f27011b = {new C11158d(C8827h.f27013a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f27012a;

    public /* synthetic */ C8826g(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f27012a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C8824e.f27010a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8826g) && AbstractC16544l.m18089b(this.f27012a, ((C8826g) obj).f27012a);
    }

    public final int hashCode() {
        return this.f27012a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C8826g(ArrayList arrayList) {
        this.f27012a = arrayList;
    }
}
