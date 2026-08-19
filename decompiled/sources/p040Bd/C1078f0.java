package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.f0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1078f0 {
    public static final C1030Y Companion = new C1030Y();

    /* JADX INFO: renamed from: a */
    public final C1050b0 f2931a;

    /* JADX INFO: renamed from: b */
    public final C1071e0 f2932b;

    /* JADX INFO: renamed from: c */
    public final long f2933c;

    /* JADX INFO: renamed from: d */
    public final double f2934d;

    /* JADX INFO: renamed from: e */
    public final boolean f2935e;

    public /* synthetic */ C1078f0(int i10, C1050b0 c1050b0, C1071e0 c1071e0, long j10, double d10, boolean z6) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C1024X.f2837a.getDescriptor());
            throw null;
        }
        this.f2931a = c1050b0;
        this.f2932b = c1071e0;
        this.f2933c = j10;
        this.f2934d = d10;
        this.f2935e = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1078f0)) {
            return false;
        }
        C1078f0 c1078f0 = (C1078f0) obj;
        return AbstractC16544l.m18089b(this.f2931a, c1078f0.f2931a) && AbstractC16544l.m18089b(this.f2932b, c1078f0.f2932b) && this.f2933c == c1078f0.f2933c && Double.compare(this.f2934d, c1078f0.f2934d) == 0 && this.f2935e == c1078f0.f2935e;
    }

    public final int hashCode() {
        int iHashCode = (this.f2932b.hashCode() + (this.f2931a.hashCode() * 31)) * 31;
        long j10 = this.f2933c;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2934d);
        return ((i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + (this.f2935e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
