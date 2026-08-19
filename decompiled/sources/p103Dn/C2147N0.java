package p103Dn;

import om.C18235b;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Dn.N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2147N0 implements InterfaceC2135H0 {

    /* JADX INFO: renamed from: a */
    public final long f6577a;

    /* JADX INFO: renamed from: b */
    public final long f6578b;

    public C2147N0(long j10, long j11) {
        this.f6577a = j10;
        this.f6578b = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("stopTimeout(", j10, " ms) cannot be negative").toString());
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("replayExpiration(", j11, " ms) cannot be negative").toString());
        }
    }

    @Override // p103Dn.InterfaceC2135H0
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3248a(InterfaceC2149O0 interfaceC2149O0) {
        return AbstractC2124C.m3215n(new C2134H(AbstractC2124C.m3201E(interfaceC2149O0, new C2143L0(this, null)), new C2145M0(2, null), 2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2147N0) {
            C2147N0 c2147n0 = (C2147N0) obj;
            if (this.f6577a == c2147n0.f6577a && this.f6578b == c2147n0.f6578b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6577a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f6578b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        C18235b c18235b = new C18235b(2);
        long j10 = this.f6577a;
        if (j10 > 0) {
            c18235b.add("stopTimeout=" + j10 + "ms");
        }
        long j11 = this.f6578b;
        if (j11 < Long.MAX_VALUE) {
            c18235b.add("replayExpiration=" + j11 + "ms");
        }
        return AbstractC9306j0.m9892k(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC17680n.m19349Y(AbstractC9393x3.m9971a(c18235b), null, null, null, 0, null, null, 63), ')');
    }
}
