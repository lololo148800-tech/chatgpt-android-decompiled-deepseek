package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bd.g0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1085g0 {
    public static final C1000T Companion = new C1000T();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f2938e;

    /* JADX INFO: renamed from: a */
    public final C1018W f2939a;

    /* JADX INFO: renamed from: b */
    public final C1078f0 f2940b;

    /* JADX INFO: renamed from: c */
    public final List f2941c;

    /* JADX INFO: renamed from: d */
    public final List f2942d;

    static {
        C1024X c1024x = C1024X.f2837a;
        f2938e = new KSerializer[]{null, null, new C11158d(c1024x, 0), new C11158d(c1024x, 0)};
    }

    public /* synthetic */ C1085g0(int i10, C1018W c1018w, C1078f0 c1078f0, List list, List list2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C0994S.f2779a.getDescriptor());
            throw null;
        }
        this.f2939a = c1018w;
        this.f2940b = c1078f0;
        this.f2941c = list;
        this.f2942d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1085g0)) {
            return false;
        }
        C1085g0 c1085g0 = (C1085g0) obj;
        return AbstractC16544l.m18089b(this.f2939a, c1085g0.f2939a) && AbstractC16544l.m18089b(this.f2940b, c1085g0.f2940b) && AbstractC16544l.m18089b(this.f2941c, c1085g0.f2941c) && AbstractC16544l.m18089b(this.f2942d, c1085g0.f2942d);
    }

    public final int hashCode() {
        return this.f2942d.hashCode() + AbstractC14376f.m15858x(this.f2941c, (this.f2940b.hashCode() + (this.f2939a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
