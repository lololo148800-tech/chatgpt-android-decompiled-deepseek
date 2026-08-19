package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.InterfaceC21083f0;
import p492U1.C7536a;

/* JADX INFO: renamed from: o0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C17786u implements InterfaceC17784t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21083f0 f56762a;

    /* JADX INFO: renamed from: b */
    public final long f56763b;

    public C17786u(InterfaceC21083f0 interfaceC21083f0, long j10) {
        this.f56762a = interfaceC21083f0;
        this.f56763b = j10;
    }

    /* JADX INFO: renamed from: a */
    public final float m19514a() {
        long j10 = this.f56763b;
        if (!C7536a.m7850e(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f56762a.mo7861O(C7536a.m7854i(j10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17786u)) {
            return false;
        }
        C17786u c17786u = (C17786u) obj;
        return AbstractC16544l.m18089b(this.f56762a, c17786u.f56762a) && C7536a.m7848c(this.f56763b, c17786u.f56763b);
    }

    public final int hashCode() {
        int iHashCode = this.f56762a.hashCode() * 31;
        long j10 = this.f56763b;
        return ((int) (j10 ^ (j10 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f56762a + ", constraints=" + ((Object) C7536a.m7858m(this.f56763b)) + ')';
    }
}
