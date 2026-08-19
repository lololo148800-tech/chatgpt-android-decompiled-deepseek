package p232J3;

import p057C3.C1534L;
import p057C3.C1535M;
import p057C3.C1561g0;
import p281L3.InterfaceC4930q;

/* JADX INFO: renamed from: J3.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C4225Z implements InterfaceC4251w, InterfaceC4250v {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC4251w f13804Y;

    /* JADX INFO: renamed from: Z */
    public final long f13805Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC4250v f13806o0;

    public C4225Z(InterfaceC4251w interfaceC4251w, long j10) {
        this.f13804Y = interfaceC4251w;
        this.f13805Z = j10;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: a */
    public final long mo4916a() {
        long jMo4916a = this.f13804Y.mo4916a();
        if (jMo4916a == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f13805Z + jMo4916a;
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: b */
    public final void mo2295b(InterfaceC4251w interfaceC4251w) {
        InterfaceC4250v interfaceC4250v = this.f13806o0;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2295b(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: c */
    public final void mo4917c() {
        this.f13804Y.mo4917c();
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: d */
    public final long mo4918d(long j10) {
        long j11 = this.f13805Z;
        return this.f13804Y.mo4918d(j10 - j11) + j11;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: e */
    public final void mo4919e(long j10) {
        this.f13804Y.mo4919e(j10 - this.f13805Z);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: f */
    public final void mo4920f(InterfaceC4250v interfaceC4250v, long j10) {
        this.f13806o0 = interfaceC4250v;
        this.f13804Y.mo4920f(this, j10 - this.f13805Z);
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: g */
    public final boolean mo4921g() {
        return this.f13804Y.mo4921g();
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: h */
    public final void mo2307h(InterfaceC4221V interfaceC4221V) {
        InterfaceC4250v interfaceC4250v = this.f13806o0;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2307h(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: i */
    public final long mo4922i() {
        long jMo4922i = this.f13804Y.mo4922i();
        if (jMo4922i == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f13805Z + jMo4922i;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: j */
    public final boolean mo4923j(C1535M c1535m) {
        C1534L c1534l = new C1534L();
        c1534l.f4172b = c1535m.f4175b;
        c1534l.f4173c = c1535m.f4176c;
        c1534l.f4171a = c1535m.f4174a - this.f13805Z;
        return this.f13804Y.mo4923j(new C1535M(c1534l));
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: k */
    public final C4227a0 mo4924k() {
        return this.f13804Y.mo4924k();
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: l */
    public final long mo4925l() {
        long jMo4925l = this.f13804Y.mo4925l();
        if (jMo4925l == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f13805Z + jMo4925l;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: m */
    public final long mo4926m(long j10, C1561g0 c1561g0) {
        long j11 = this.f13805Z;
        return this.f13804Y.mo4926m(j10 - j11, c1561g0) + j11;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: o */
    public final long mo4927o(InterfaceC4930q[] interfaceC4930qArr, boolean[] zArr, InterfaceC4220U[] interfaceC4220UArr, boolean[] zArr2, long j10) {
        InterfaceC4220U[] interfaceC4220UArr2 = new InterfaceC4220U[interfaceC4220UArr.length];
        int i10 = 0;
        while (true) {
            InterfaceC4220U interfaceC4220U = null;
            if (i10 >= interfaceC4220UArr.length) {
                break;
            }
            C4224Y c4224y = (C4224Y) interfaceC4220UArr[i10];
            if (c4224y != null) {
                interfaceC4220U = c4224y.f13802Y;
            }
            interfaceC4220UArr2[i10] = interfaceC4220U;
            i10++;
        }
        long j11 = this.f13805Z;
        long jMo4927o = this.f13804Y.mo4927o(interfaceC4930qArr, zArr, interfaceC4220UArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < interfaceC4220UArr.length; i11++) {
            InterfaceC4220U interfaceC4220U2 = interfaceC4220UArr2[i11];
            if (interfaceC4220U2 == null) {
                interfaceC4220UArr[i11] = null;
            } else {
                InterfaceC4220U interfaceC4220U3 = interfaceC4220UArr[i11];
                if (interfaceC4220U3 == null || ((C4224Y) interfaceC4220U3).f13802Y != interfaceC4220U2) {
                    interfaceC4220UArr[i11] = new C4224Y(interfaceC4220U2, j11);
                }
            }
        }
        return jMo4927o + j11;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: p */
    public final void mo4928p(long j10) {
        this.f13804Y.mo4928p(j10 - this.f13805Z);
    }
}
