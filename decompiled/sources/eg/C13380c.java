package eg;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: eg.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13380c {
    public static final C13379b Companion = new C13379b();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f42418b = {new C11158d(C13381d.f42420a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f42419a;

    public /* synthetic */ C13380c(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f42419a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C13378a.f42417a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13380c) && AbstractC16544l.m18089b(this.f42419a, ((C13380c) obj).f42419a);
    }

    public final int hashCode() {
        return this.f42419a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
