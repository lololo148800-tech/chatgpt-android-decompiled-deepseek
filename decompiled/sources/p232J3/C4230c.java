package p232J3;

import java.util.ArrayList;
import p057C3.C1535M;
import p057C3.C1561g0;
import p1016t3.AbstractC19754D;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p165G9.C3024j;
import p281L3.InterfaceC4930q;
import p379Pb.LVf.efyhmdM;

/* JADX INFO: renamed from: J3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4230c implements InterfaceC4251w, InterfaceC4250v {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC4251w f13821Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4250v f13822Z;

    /* JADX INFO: renamed from: o0 */
    public C4228b[] f13823o0 = new C4228b[0];

    /* JADX INFO: renamed from: p0 */
    public long f13824p0;

    /* JADX INFO: renamed from: q0 */
    public long f13825q0;

    /* JADX INFO: renamed from: r0 */
    public long f13826r0;

    /* JADX INFO: renamed from: s0 */
    public C4233e f13827s0;

    public C4230c(InterfaceC4251w interfaceC4251w, boolean z6, long j10, long j11) {
        this.f13821Y = interfaceC4251w;
        this.f13824p0 = z6 ? j10 : -9223372036854775807L;
        this.f13825q0 = j10;
        this.f13826r0 = j11;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: a */
    public final long mo4916a() {
        long jMo4916a = this.f13821Y.mo4916a();
        if (jMo4916a != Long.MIN_VALUE) {
            long j10 = this.f13826r0;
            if (j10 == Long.MIN_VALUE || jMo4916a < j10) {
                return jMo4916a;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: b */
    public final void mo2295b(InterfaceC4251w interfaceC4251w) {
        if (this.f13827s0 != null) {
            return;
        }
        InterfaceC4250v interfaceC4250v = this.f13822Z;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2295b(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: c */
    public final void mo4917c() throws C4233e {
        C4233e c4233e = this.f13827s0;
        if (c4233e != null) {
            throw c4233e;
        }
        this.f13821Y.mo4917c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: d */
    public final long mo4918d(long j10) {
        this.f13824p0 = -9223372036854775807L;
        boolean z6 = false;
        for (C4228b c4228b : this.f13823o0) {
            if (c4228b != null) {
                c4228b.f13819Z = false;
            }
        }
        long jMo4918d = this.f13821Y.mo4918d(j10);
        if (jMo4918d == j10) {
            z6 = true;
        } else if (jMo4918d >= this.f13825q0) {
            long j11 = this.f13826r0;
            if (j11 == Long.MIN_VALUE || jMo4918d <= j11) {
                z6 = true;
            }
        }
        AbstractC20800b.m21320h(z6);
        return jMo4918d;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: e */
    public final void mo4919e(long j10) {
        this.f13821Y.mo4919e(j10);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: f */
    public final void mo4920f(InterfaceC4250v interfaceC4250v, long j10) {
        this.f13822Z = interfaceC4250v;
        this.f13821Y.mo4920f(this, j10);
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: g */
    public final boolean mo4921g() {
        return this.f13821Y.mo4921g();
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: h */
    public final void mo2307h(InterfaceC4221V interfaceC4221V) {
        InterfaceC4250v interfaceC4250v = this.f13822Z;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2307h(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: i */
    public final long mo4922i() {
        if (m5000n()) {
            long j10 = this.f13824p0;
            this.f13824p0 = -9223372036854775807L;
            long jMo4922i = mo4922i();
            return jMo4922i != -9223372036854775807L ? jMo4922i : j10;
        }
        long jMo4922i2 = this.f13821Y.mo4922i();
        if (jMo4922i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC20800b.m21320h(jMo4922i2 >= this.f13825q0);
        long j11 = this.f13826r0;
        AbstractC20800b.m21320h(j11 == Long.MIN_VALUE || jMo4922i2 <= j11);
        return jMo4922i2;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: j */
    public final boolean mo4923j(C1535M c1535m) {
        return this.f13821Y.mo4923j(c1535m);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: k */
    public final C4227a0 mo4924k() {
        return this.f13821Y.mo4924k();
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: l */
    public final long mo4925l() {
        long jMo4925l = this.f13821Y.mo4925l();
        if (jMo4925l != Long.MIN_VALUE) {
            long j10 = this.f13826r0;
            if (j10 == Long.MIN_VALUE || jMo4925l < j10) {
                return jMo4925l;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: m */
    public final long mo4926m(long j10, C1561g0 c1561g0) {
        long j11 = this.f13825q0;
        if (j10 == j11) {
            return j11;
        }
        long jM21409j = AbstractC20817s.m21409j(c1561g0.f4356a, 0L, j10 - j11);
        long j12 = this.f13826r0;
        long jM21409j2 = AbstractC20817s.m21409j(c1561g0.f4357b, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        if (jM21409j != c1561g0.f4356a || jM21409j2 != c1561g0.f4357b) {
            c1561g0 = new C1561g0(jM21409j, jM21409j2);
        }
        return this.f13821Y.mo4926m(j10, c1561g0);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5000n() {
        return this.f13824p0 != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: o */
    public final long mo4927o(InterfaceC4930q[] interfaceC4930qArr, boolean[] zArr, InterfaceC4220U[] interfaceC4220UArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z6;
        C3024j c3024jM20705c;
        int iM3880c;
        this.f13823o0 = new C4228b[interfaceC4220UArr.length];
        InterfaceC4220U[] interfaceC4220UArr2 = new InterfaceC4220U[interfaceC4220UArr.length];
        int i10 = 0;
        while (true) {
            InterfaceC4220U interfaceC4220U = null;
            if (i10 >= interfaceC4220UArr.length) {
                break;
            }
            C4228b[] c4228bArr = this.f13823o0;
            C4228b c4228b = (C4228b) interfaceC4220UArr[i10];
            c4228bArr[i10] = c4228b;
            if (c4228b != null) {
                interfaceC4220U = c4228b.f13818Y;
            }
            interfaceC4220UArr2[i10] = interfaceC4220U;
            i10++;
        }
        long jMo4927o = this.f13821Y.mo4927o(interfaceC4930qArr, zArr, interfaceC4220UArr2, zArr2, j10);
        if (m5000n()) {
            long j12 = this.f13825q0;
            if (j10 != j12 || j12 == 0) {
                j11 = -9223372036854775807L;
            } else {
                int length = interfaceC4930qArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        j11 = -9223372036854775807L;
                    } else {
                        InterfaceC4930q interfaceC4930q = interfaceC4930qArr[i11];
                        if (interfaceC4930q != null) {
                            C19788o c19788oMo4911h = interfaceC4930q.mo4911h();
                            String str = c19788oMo4911h.f62752m;
                            ArrayList arrayList = AbstractC19754D.f62557a;
                            if (str != null) {
                                byte b = -1;
                                switch (str.hashCode()) {
                                    case -2123537834:
                                        if (str.equals("audio/eac3-joc")) {
                                            b = 0;
                                        }
                                        break;
                                    case -432837260:
                                        if (str.equals("audio/mpeg-L1")) {
                                            b = 1;
                                        }
                                        break;
                                    case -432837259:
                                        if (str.equals("audio/mpeg-L2")) {
                                            b = 2;
                                        }
                                        break;
                                    case -53558318:
                                        if (str.equals("audio/mp4a-latm")) {
                                            b = 3;
                                        }
                                        break;
                                    case 187078296:
                                        if (str.equals("audio/ac3")) {
                                            b = 4;
                                        }
                                        break;
                                    case 187094639:
                                        if (str.equals("audio/raw")) {
                                            b = 5;
                                        }
                                        break;
                                    case 1504578661:
                                        if (str.equals(efyhmdM.xtWvHstH)) {
                                            b = 6;
                                        }
                                        break;
                                    case 1504619009:
                                        if (str.equals("audio/flac")) {
                                            b = 7;
                                        }
                                        break;
                                    case 1504831518:
                                        if (str.equals("audio/mpeg")) {
                                            b = 8;
                                        }
                                        break;
                                    case 1903231877:
                                        if (str.equals("audio/g711-alaw")) {
                                            b = 9;
                                        }
                                        break;
                                    case 1903589369:
                                        if (str.equals("audio/g711-mlaw")) {
                                            b = 10;
                                        }
                                        break;
                                }
                                switch (b) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        continue;
                                    case 3:
                                        String str2 = c19788oMo4911h.f62749j;
                                        if (str2 != null && (c3024jM20705c = AbstractC19754D.m20705c(str2)) != null && (iM3880c = c3024jM20705c.m3880c()) != 0 && iM3880c != 16) {
                                        }
                                        break;
                                }
                            }
                            j11 = jMo4927o;
                        }
                        i11++;
                    }
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.f13824p0 = j11;
        if (jMo4927o != j10) {
            if (jMo4927o >= this.f13825q0) {
                long j13 = this.f13826r0;
                z6 = j13 == Long.MIN_VALUE || jMo4927o <= j13;
            }
        }
        AbstractC20800b.m21320h(z6);
        for (int i12 = 0; i12 < interfaceC4220UArr.length; i12++) {
            InterfaceC4220U interfaceC4220U2 = interfaceC4220UArr2[i12];
            if (interfaceC4220U2 == null) {
                this.f13823o0[i12] = null;
            } else {
                C4228b[] c4228bArr2 = this.f13823o0;
                C4228b c4228b2 = c4228bArr2[i12];
                if (c4228b2 == null || c4228b2.f13818Y != interfaceC4220U2) {
                    c4228bArr2[i12] = new C4228b(this, interfaceC4220U2);
                }
            }
            interfaceC4220UArr[i12] = this.f13823o0[i12];
        }
        return jMo4927o;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: p */
    public final void mo4928p(long j10) {
        this.f13821Y.mo4928p(j10);
    }
}
