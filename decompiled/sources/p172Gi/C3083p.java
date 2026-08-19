package p172Gi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3083p {
    public static final C3082o Companion = new C3082o();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f9286b = {new C11158d(C3078k.f9282a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f9287a;

    public /* synthetic */ C3083p(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f9287a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C3081n.f9285a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3083p) && AbstractC16544l.m18089b(this.f9287a, ((C3083p) obj).f9287a);
    }

    public final int hashCode() {
        return this.f9287a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
