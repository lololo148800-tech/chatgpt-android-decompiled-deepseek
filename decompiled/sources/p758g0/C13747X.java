package p758g0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: g0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C13747X implements InterfaceC13772l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13726B f43355a;

    /* JADX INFO: renamed from: b */
    public final long f43356b;

    public C13747X(InterfaceC13726B interfaceC13726B, long j10) {
        this.f43355a = interfaceC13726B;
        this.f43356b = j10;
    }

    @Override // p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 mo15214a(C13783q0 c13783q0) {
        return new C13748Y(this.f43355a.mo15214a(c13783q0), this.f43356b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13747X)) {
            return false;
        }
        C13747X c13747x = (C13747X) obj;
        return c13747x.f43356b == this.f43356b && AbstractC16544l.m18089b(c13747x.f43355a, this.f43355a);
    }

    public final int hashCode() {
        int iHashCode = this.f43355a.hashCode() * 31;
        long j10 = this.f43356b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }
}
