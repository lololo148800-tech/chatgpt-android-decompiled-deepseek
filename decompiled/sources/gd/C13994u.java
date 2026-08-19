package gd;

import ao.C11131E;
import ao.C11181o0;
import ao.C11192u;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1071w0.AbstractC20734X;
import p559Wn.InterfaceC8975g;
import p909nm.C17690x;

/* JADX INFO: renamed from: gd.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13994u {
    public static final C13990t Companion = new C13990t();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f44063d;

    /* JADX INFO: renamed from: a */
    public final double f44064a;

    /* JADX INFO: renamed from: b */
    public final Map f44065b;

    /* JADX INFO: renamed from: c */
    public final Map f44066c;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11192u c11192u = C11192u.f33846a;
        f44063d = new KSerializer[]{null, new C11131E(c11181o0, c11192u, 1), new C11131E(c11181o0, c11192u, 1)};
    }

    public /* synthetic */ C13994u(int i10, double d10, Map map, Map map2) {
        this.f44064a = (i10 & 1) == 0 ? 1.0d : d10;
        int i11 = i10 & 2;
        C17690x c17690x = C17690x.f56481Y;
        if (i11 == 0) {
            this.f44065b = c17690x;
        } else {
            this.f44065b = map;
        }
        if ((i10 & 4) == 0) {
            this.f44066c = c17690x;
        } else {
            this.f44066c = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13994u)) {
            return false;
        }
        C13994u c13994u = (C13994u) obj;
        return Double.compare(this.f44064a, c13994u.f44064a) == 0 && AbstractC16544l.m18089b(this.f44065b, c13994u.f44065b) && AbstractC16544l.m18089b(this.f44066c, c13994u.f44066c);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f44064a);
        return this.f44066c.hashCode() + AbstractC20734X.m21250u(((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31, this.f44065b);
    }

    public final String toString() {
        return "█";
    }

    public C13994u() {
        C17690x c17690x = C17690x.f56481Y;
        this.f44064a = 1.0d;
        this.f44065b = c17690x;
        this.f44066c = c17690x;
    }
}
