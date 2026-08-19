package p232J3;

import p057C3.C1535M;
import p057C3.C1561g0;
import p1073w3.AbstractC20817s;
import p281L3.InterfaceC4930q;
import p305M3.C5285e;

/* JADX INFO: renamed from: J3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4245q implements InterfaceC4251w, InterfaceC4250v {

    /* JADX INFO: renamed from: Y */
    public final C4253y f13872Y;

    /* JADX INFO: renamed from: Z */
    public final long f13873Z;

    /* JADX INFO: renamed from: o0 */
    public final C5285e f13874o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC4226a f13875p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC4251w f13876q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC4250v f13877r0;

    /* JADX INFO: renamed from: s0 */
    public long f13878s0 = -9223372036854775807L;

    public C4245q(C4253y c4253y, C5285e c5285e, long j10) {
        this.f13872Y = c4253y;
        this.f13874o0 = c5285e;
        this.f13873Z = j10;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: a */
    public final long mo4916a() {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4916a();
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: b */
    public final void mo2295b(InterfaceC4251w interfaceC4251w) {
        InterfaceC4250v interfaceC4250v = this.f13877r0;
        int i10 = AbstractC20817s.f66106a;
        interfaceC4250v.mo2295b(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: c */
    public final void mo4917c() {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        if (interfaceC4251w != null) {
            interfaceC4251w.mo4917c();
            return;
        }
        AbstractC4226a abstractC4226a = this.f13875p0;
        if (abstractC4226a != null) {
            abstractC4226a.mo4931i();
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: d */
    public final long mo4918d(long j10) {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4918d(j10);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: e */
    public final void mo4919e(long j10) {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        interfaceC4251w.mo4919e(j10);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: f */
    public final void mo4920f(InterfaceC4250v interfaceC4250v, long j10) {
        this.f13877r0 = interfaceC4250v;
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        if (interfaceC4251w != null) {
            long j11 = this.f13878s0;
            if (j11 == -9223372036854775807L) {
                j11 = this.f13873Z;
            }
            interfaceC4251w.mo4920f(this, j11);
        }
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: g */
    public final boolean mo4921g() {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        return interfaceC4251w != null && interfaceC4251w.mo4921g();
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: h */
    public final void mo2307h(InterfaceC4221V interfaceC4221V) {
        InterfaceC4250v interfaceC4250v = this.f13877r0;
        int i10 = AbstractC20817s.f66106a;
        interfaceC4250v.mo2307h(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: i */
    public final long mo4922i() {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4922i();
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: j */
    public final boolean mo4923j(C1535M c1535m) {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        return interfaceC4251w != null && interfaceC4251w.mo4923j(c1535m);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: k */
    public final C4227a0 mo4924k() {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4924k();
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: l */
    public final long mo4925l() {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4925l();
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: m */
    public final long mo4926m(long j10, C1561g0 c1561g0) {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4926m(j10, c1561g0);
    }

    /* JADX INFO: renamed from: n */
    public final void m5011n(C4253y c4253y) {
        long j10 = this.f13878s0;
        if (j10 == -9223372036854775807L) {
            j10 = this.f13873Z;
        }
        AbstractC4226a abstractC4226a = this.f13875p0;
        abstractC4226a.getClass();
        InterfaceC4251w interfaceC4251wMo4929a = abstractC4226a.mo4929a(c4253y, this.f13874o0, j10);
        this.f13876q0 = interfaceC4251wMo4929a;
        if (this.f13877r0 != null) {
            interfaceC4251wMo4929a.mo4920f(this, j10);
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: o */
    public final long mo4927o(InterfaceC4930q[] interfaceC4930qArr, boolean[] zArr, InterfaceC4220U[] interfaceC4220UArr, boolean[] zArr2, long j10) {
        long j11 = this.f13878s0;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f13873Z) ? j10 : j11;
        this.f13878s0 = -9223372036854775807L;
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        return interfaceC4251w.mo4927o(interfaceC4930qArr, zArr, interfaceC4220UArr, zArr2, j12);
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: p */
    public final void mo4928p(long j10) {
        InterfaceC4251w interfaceC4251w = this.f13876q0;
        int i10 = AbstractC20817s.f66106a;
        interfaceC4251w.mo4928p(j10);
    }
}
