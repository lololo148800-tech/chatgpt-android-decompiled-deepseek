package p505Uf;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C22028l1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Uf.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7659t {
    public static final C7658s Companion = new C7658s();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f24181b = {new C11158d(C22028l1.f69689a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f24182a;

    public /* synthetic */ C7659t(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f24182a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C7657r.f24180a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7659t) && AbstractC16544l.m18089b(this.f24182a, ((C7659t) obj).f24182a);
    }

    public final int hashCode() {
        return this.f24182a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
