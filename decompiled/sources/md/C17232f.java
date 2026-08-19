package md;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: md.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C17232f {
    public static final C17231e Companion = new C17231e();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f54986b = {new C11158d(C17233g.f54988a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f54987a;

    public /* synthetic */ C17232f(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f54987a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C17230d.f54985a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17232f) && AbstractC16544l.m18089b(this.f54987a, ((C17232f) obj).f54987a);
    }

    public final int hashCode() {
        return this.f54987a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C17232f(ArrayList arrayList) {
        this.f54987a = arrayList;
    }
}
