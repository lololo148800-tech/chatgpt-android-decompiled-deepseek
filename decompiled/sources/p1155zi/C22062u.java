package p1155zi;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22062u {
    public static final C22058t Companion = new C22058t();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f69761c;

    /* JADX INFO: renamed from: a */
    public final Map f69762a;

    /* JADX INFO: renamed from: b */
    public final List f69763b;

    static {
        C22042p c22042p = C22042p.f69730a;
        f69761c = new KSerializer[]{new C11131E(c22042p, C22018j.f69664a, 1), new C11158d(c22042p, 0)};
    }

    public /* synthetic */ C22062u(int i10, List list, Map map) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C22054s.f69741a.getDescriptor());
            throw null;
        }
        this.f69762a = map;
        this.f69763b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22062u)) {
            return false;
        }
        C22062u c22062u = (C22062u) obj;
        return AbstractC16544l.m18089b(this.f69762a, c22062u.f69762a) && AbstractC16544l.m18089b(this.f69763b, c22062u.f69763b);
    }

    public final int hashCode() {
        return this.f69763b.hashCode() + (this.f69762a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C22062u(List accountOrdering, Map map) {
        AbstractC16544l.m18094g(accountOrdering, "accountOrdering");
        this.f69762a = map;
        this.f69763b = accountOrdering;
    }
}
