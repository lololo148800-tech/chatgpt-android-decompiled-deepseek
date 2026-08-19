package p505Uf;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11164g;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.EnumC22040o1;
import p1155zi.EnumC22060t1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Uf.w */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7662w {
    public static final C7661v Companion = new C7661v();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f24184b = {new C11131E(EnumC22040o1.Companion.serializer(), new C11131E(EnumC22060t1.Companion.serializer(), C11164g.f33804a, 1), 1)};

    /* JADX INFO: renamed from: a */
    public final Map f24185a;

    public /* synthetic */ C7662w(int i10, Map map) {
        if (1 == (i10 & 1)) {
            this.f24185a = map;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C7660u.f24183a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7662w) && AbstractC16544l.m18089b(this.f24185a, ((C7662w) obj).f24185a);
    }

    public final int hashCode() {
        return this.f24185a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C7662w(Map map) {
        this.f24185a = map;
    }
}
