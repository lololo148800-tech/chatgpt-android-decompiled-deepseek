package p403Qd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11144S;
import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17309l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.a0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6621a0 extends AbstractC6653q0 {
    public static final C6619Z Companion = new C6619Z();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f21352d;

    /* JADX INFO: renamed from: b */
    public final C17309l f21353b;

    /* JADX INFO: renamed from: c */
    public final List f21354c;

    static {
        C11135I c11135i = C11135I.f33763a;
        f21352d = new KSerializer[]{new C11144S(c11135i, c11135i, 1), new C11158d(C11181o0.f33827a, 0)};
    }

    public /* synthetic */ C6621a0(int i10, C17309l c17309l, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C6618Y.f21345a.getDescriptor());
            throw null;
        }
        this.f21353b = c17309l;
        this.f21354c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6621a0)) {
            return false;
        }
        C6621a0 c6621a0 = (C6621a0) obj;
        return AbstractC16544l.m18089b(this.f21353b, c6621a0.f21353b) && AbstractC16544l.m18089b(this.f21354c, c6621a0.f21354c);
    }

    public final int hashCode() {
        int iHashCode = this.f21353b.hashCode() * 31;
        List list = this.f21354c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C6621a0(C17309l c17309l, ArrayList arrayList) {
        this.f21353b = c17309l;
        this.f21354c = arrayList;
    }
}
