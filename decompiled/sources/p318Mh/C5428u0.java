package p318Mh;

import java.util.List;
import p1143z4.AbstractC21767I;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Mh.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5428u0 extends AbstractC5362F0 {

    /* JADX INFO: renamed from: g */
    public static final C5428u0 f17738g = new C5428u0("subscription_access_check");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17739h;

    /* JADX INFO: renamed from: i */
    public static final List f17740i;

    static {
        C5370J0 c5370j0 = new C5370J0("access_error", AbstractC21767I.f69048j, true, null);
        f17739h = c5370j0;
        f17740i = AbstractC9393x3.m9974d(c5370j0);
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17740i;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5428u0);
    }

    public final int hashCode() {
        return -1419702423;
    }

    public final String toString() {
        return "█";
    }
}
