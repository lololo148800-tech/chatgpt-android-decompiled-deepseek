package p232J3;

import p1016t3.C19788o;
import p758g0.AbstractC13784r;
import p758g0.InterfaceC13787s0;
import p758g0.InterfaceC13789t0;

/* JADX INFO: renamed from: J3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4249u implements InterfaceC13787s0 {

    /* JADX INFO: renamed from: Y */
    public final int f13891Y;

    /* JADX INFO: renamed from: Z */
    public final long f13892Z;

    /* JADX INFO: renamed from: o0 */
    public final long f13893o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f13894p0;

    public C4249u(int i10, C19788o c19788o, long j10, long j11) {
        this.f13891Y = i10;
        this.f13894p0 = c19788o;
        this.f13892Z = j10;
        this.f13893o0 = j11;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((InterfaceC13789t0) this.f13894p0).mo3877K(m5014a(j10), abstractC13784r, abstractC13784r2, m5015b(j10, abstractC13784r, abstractC13784r3, abstractC13784r2));
    }

    /* JADX INFO: renamed from: a */
    public long m5014a(long j10) {
        long j11 = j10 + this.f13893o0;
        if (j11 <= 0) {
            return 0L;
        }
        long j12 = this.f13892Z;
        long j13 = j11 / j12;
        if (this.f13891Y != 1 && j13 % ((long) 2) != 0) {
            return ((j13 + 1) * j12) - j11;
        }
        Long.signum(j13);
        return j11 - (j13 * j12);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC13784r m5015b(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        long j11 = this.f13893o0;
        long j12 = j10 + j11;
        long j13 = this.f13892Z;
        return j12 > j13 ? ((InterfaceC13789t0) this.f13894p0).mo3877K(j13 - j11, abstractC13784r, abstractC13784r3, abstractC13784r2) : abstractC13784r2;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public boolean mo3881d() {
        return true;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return Long.MAX_VALUE;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return mo3877K(Long.MAX_VALUE, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((InterfaceC13789t0) this.f13894p0).mo3884u(m5014a(j10), abstractC13784r, abstractC13784r2, m5015b(j10, abstractC13784r, abstractC13784r3, abstractC13784r2));
    }

    public C4249u(InterfaceC13789t0 interfaceC13789t0, int i10, long j10) {
        this.f13894p0 = interfaceC13789t0;
        this.f13891Y = i10;
        this.f13892Z = ((long) (interfaceC13789t0.mo3878N() + interfaceC13789t0.mo3876F())) * 1000000;
        this.f13893o0 = j10 * 1000000;
    }
}
