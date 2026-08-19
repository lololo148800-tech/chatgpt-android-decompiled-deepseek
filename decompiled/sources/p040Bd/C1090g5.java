package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.g5 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1090g5 {
    public static final C1083f5 Companion = new C1083f5();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f2983c = {null, new C11158d(C1017V4.f2821a, 0)};

    /* JADX INFO: renamed from: a */
    public final C1111j5 f2984a;

    /* JADX INFO: renamed from: b */
    public final List f2985b;

    public /* synthetic */ C1090g5(int i10, C1111j5 c1111j5, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1076e5.f2929a.getDescriptor());
            throw null;
        }
        this.f2984a = c1111j5;
        this.f2985b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1090g5)) {
            return false;
        }
        C1090g5 c1090g5 = (C1090g5) obj;
        return AbstractC16544l.m18089b(this.f2984a, c1090g5.f2984a) && AbstractC16544l.m18089b(this.f2985b, c1090g5.f2985b);
    }

    public final int hashCode() {
        return this.f2985b.hashCode() + (this.f2984a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
