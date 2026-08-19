package p268Kf;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Kf.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4671z {
    public static final C4670y Companion = new C4670y();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f15209d = {null, null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final double f15210a;

    /* JADX INFO: renamed from: b */
    public final double f15211b;

    /* JADX INFO: renamed from: c */
    public final List f15212c;

    public C4671z(double d10, double d11, List list) {
        this.f15210a = d10;
        this.f15211b = d11;
        this.f15212c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4671z)) {
            return false;
        }
        C4671z c4671z = (C4671z) obj;
        return Double.compare(this.f15210a, c4671z.f15210a) == 0 && Double.compare(this.f15211b, c4671z.f15211b) == 0 && AbstractC16544l.m18089b(this.f15212c, c4671z.f15212c);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f15210a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f15211b);
        return this.f15212c.hashCode() + (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C4671z(int i10, double d10, double d11, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C4669x.f15208a.getDescriptor());
            throw null;
        }
        this.f15210a = d10;
        this.f15211b = d11;
        if ((i10 & 4) == 0) {
            this.f15212c = C17689w.f56480Y;
        } else {
            this.f15212c = list;
        }
    }
}
