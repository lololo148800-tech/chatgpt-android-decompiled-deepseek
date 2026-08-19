package p758g0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: g0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C13748Y implements InterfaceC13787s0 {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13787s0 f43357Y;

    /* JADX INFO: renamed from: Z */
    public final long f43358Z;

    public C13748Y(InterfaceC13787s0 interfaceC13787s0, long j10) {
        this.f43357Y = interfaceC13787s0;
        this.f43358Z = j10;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public final AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        long j11 = this.f43358Z;
        return j10 < j11 ? abstractC13784r3 : this.f43357Y.mo3877K(j10 - j11, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public final boolean mo3881d() {
        return this.f43357Y.mo3881d();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13748Y)) {
            return false;
        }
        C13748Y c13748y = (C13748Y) obj;
        return c13748y.f43358Z == this.f43358Z && AbstractC16544l.m18089b(c13748y.f43357Y, this.f43357Y);
    }

    public final int hashCode() {
        int iHashCode = this.f43357Y.hashCode() * 31;
        long j10 = this.f43358Z;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public final long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return this.f43357Y.mo3882q(abstractC13784r, abstractC13784r2, abstractC13784r3) + this.f43358Z;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public final AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return mo3877K(mo3882q(abstractC13784r, abstractC13784r2, abstractC13784r3), abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public final AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        long j11 = this.f43358Z;
        return j10 < j11 ? abstractC13784r : this.f43357Y.mo3884u(j10 - j11, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }
}
