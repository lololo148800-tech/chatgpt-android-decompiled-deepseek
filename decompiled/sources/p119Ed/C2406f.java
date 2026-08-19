package p119Ed;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ed.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2406f {
    public static final C2405e Companion = new C2405e();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f7473b = {new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f7474a;

    public /* synthetic */ C2406f(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f7474a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C2404d.f7472a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2406f) && AbstractC16544l.m18089b(this.f7474a, ((C2406f) obj).f7474a);
    }

    public final int hashCode() {
        return this.f7474a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
