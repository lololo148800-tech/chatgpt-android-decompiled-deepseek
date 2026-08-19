package p232J3;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import livekit.org.webrtc.MediaStreamTrack;
import p007A5.C0376k;
import p057C3.C1535M;
import p057C3.C1561g0;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1016t3.C19765O;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1142z3.C21728A;
import p1142z3.C21741i;
import p1142z3.C21751s;
import p1142z3.InterfaceC21740h;
import p117Eb.C2391u;
import p133F3.C2658d;
import p133F3.InterfaceC2661g;
import p140Fa.C2685e;
import p221Ii.RunnableC3724c;
import p281L3.InterfaceC4930q;
import p305M3.C5285e;
import p305M3.C5289i;
import p305M3.C5291k;
import p305M3.C5292l;
import p305M3.HandlerC5290j;
import p305M3.InterfaceC5288h;
import p310M9.C5311e;
import p372P3.C6309A;
import p372P3.C6332n;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p673c4.C11646b;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: J3.M */
/* JADX INFO: loaded from: classes.dex */
public final class C4213M implements InterfaceC4251w, InterfaceC6335q, InterfaceC5288h {

    /* JADX INFO: renamed from: Z0 */
    public static final Map f13699Z0;

    /* JADX INFO: renamed from: a1 */
    public static final C19788o f13700a1;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC4250v f13703C0;

    /* JADX INFO: renamed from: D0 */
    public C11646b f13704D0;

    /* JADX INFO: renamed from: G0 */
    public boolean f13707G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f13708H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f13709I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f13710J0;

    /* JADX INFO: renamed from: K0 */
    public C2391u f13711K0;

    /* JADX INFO: renamed from: L0 */
    public InterfaceC6310B f13712L0;

    /* JADX INFO: renamed from: M0 */
    public long f13713M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f13714N0;

    /* JADX INFO: renamed from: P0 */
    public boolean f13716P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f13717Q0;

    /* JADX INFO: renamed from: R0 */
    public int f13718R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f13719S0;

    /* JADX INFO: renamed from: T0 */
    public long f13720T0;

    /* JADX INFO: renamed from: V0 */
    public boolean f13722V0;

    /* JADX INFO: renamed from: W0 */
    public int f13723W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f13724X0;

    /* JADX INFO: renamed from: Y */
    public final Uri f13725Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f13726Y0;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21740h f13727Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC2661g f13728o0;

    /* JADX INFO: renamed from: p0 */
    public final C2685e f13729p0;

    /* JADX INFO: renamed from: q0 */
    public final C2658d f13730q0;

    /* JADX INFO: renamed from: r0 */
    public final C2658d f13731r0;

    /* JADX INFO: renamed from: s0 */
    public final C4216P f13732s0;

    /* JADX INFO: renamed from: t0 */
    public final C5285e f13733t0;

    /* JADX INFO: renamed from: u0 */
    public final long f13734u0;

    /* JADX INFO: renamed from: v0 */
    public final long f13735v0;

    /* JADX INFO: renamed from: x0 */
    public final C5311e f13737x0;

    /* JADX INFO: renamed from: w0 */
    public final C5292l f13736w0 = new C5292l("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: y0 */
    public final C0376k f13738y0 = new C0376k(13, false);

    /* JADX INFO: renamed from: z0 */
    public final RunnableC4208H f13739z0 = new RunnableC4208H(this, 1);

    /* JADX INFO: renamed from: A0 */
    public final RunnableC4208H f13701A0 = new RunnableC4208H(this, 2);

    /* JADX INFO: renamed from: B0 */
    public final Handler f13702B0 = AbstractC20817s.m21411l(null);

    /* JADX INFO: renamed from: F0 */
    public C4212L[] f13706F0 = new C4212L[0];

    /* JADX INFO: renamed from: E0 */
    public C4219T[] f13705E0 = new C4219T[0];

    /* JADX INFO: renamed from: U0 */
    public long f13721U0 = -9223372036854775807L;

    /* JADX INFO: renamed from: O0 */
    public int f13715O0 = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f13699Z0 = DesugarCollections.unmodifiableMap(map);
        C19787n c19787n = new C19787n();
        c19787n.f62703a = "icy";
        c19787n.f62714l = AbstractC19754D.m20711i("application/x-icy");
        f13700a1 = new C19788o(c19787n);
    }

    public C4213M(Uri uri, InterfaceC21740h interfaceC21740h, C5311e c5311e, InterfaceC2661g interfaceC2661g, C2658d c2658d, C2685e c2685e, C2658d c2658d2, C4216P c4216p, C5285e c5285e, int i10, long j10) {
        this.f13725Y = uri;
        this.f13727Z = interfaceC21740h;
        this.f13728o0 = interfaceC2661g;
        this.f13731r0 = c2658d;
        this.f13729p0 = c2685e;
        this.f13730q0 = c2658d2;
        this.f13732s0 = c4216p;
        this.f13733t0 = c5285e;
        this.f13734u0 = i10;
        this.f13737x0 = c5311e;
        this.f13735v0 = j10;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4945A() {
        return this.f13717Q0 || m4952u();
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: D */
    public final InterfaceC6316H mo3044D(int i10, int i11) {
        return m4956y(new C4212L(i10, false));
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: F */
    public final void mo3045F(InterfaceC6310B interfaceC6310B) {
        this.f13702B0.post(new RunnableC3724c(this, 5, interfaceC6310B));
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: a */
    public final long mo4916a() {
        return mo4925l();
    }

    @Override // p305M3.InterfaceC5288h
    /* JADX INFO: renamed from: b */
    public final C5289i mo4946b(C4210J c4210j, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        C5289i c5289i;
        InterfaceC6310B interfaceC6310B;
        C21728A c21728a = c4210j.f13683c;
        Uri uri = c21728a.f68928o0;
        C4244p c4244p = new C4244p(c21728a.f68929p0);
        int i11 = AbstractC20817s.f66106a;
        this.f13729p0.getClass();
        if ((iOException instanceof C19755E) || (iOException instanceof FileNotFoundException) || (iOException instanceof C21751s) || (iOException instanceof C5291k)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = C21741i.f68962Z;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof C21741i) && ((C21741i) cause).f68963Y == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            c5289i = C5292l.f17443e;
        } else {
            int iM4950r = m4950r();
            int i13 = iM4950r > this.f13723W0 ? 1 : 0;
            if (this.f13719S0 || !((interfaceC6310B = this.f13712L0) == null || interfaceC6310B.mo4938l() == -9223372036854775807L)) {
                this.f13723W0 = iM4950r;
            } else if (!this.f13708H0 || m4945A()) {
                this.f13717Q0 = this.f13708H0;
                this.f13720T0 = 0L;
                this.f13723W0 = 0;
                for (C4219T c4219t : this.f13705E0) {
                    c4219t.m4983p(false);
                }
                c4210j.f13687g.f20561a = 0L;
                c4210j.f13690j = 0L;
                c4210j.f13689i = true;
                c4210j.f13693m = false;
            } else {
                this.f13722V0 = true;
                c5289i = C5292l.f17442d;
            }
            c5289i = new C5289i(i13, jMin);
        }
        int i14 = c5289i.f17430a;
        this.f13730q0.m3631d(c4244p, new C4249u(-1, null, AbstractC20817s.m21399M(c4210j.f13690j), AbstractC20817s.m21399M(this.f13713M0)), iOException, true ^ (i14 == 0 || i14 == 1));
        return c5289i;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: c */
    public final void mo4917c() throws IOException {
        int iM3668h = this.f13729p0.m3668h(this.f13715O0);
        C5292l c5292l = this.f13736w0;
        IOException iOException = c5292l.f17446c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC5290j handlerC5290j = c5292l.f17445b;
        if (handlerC5290j != null) {
            if (iM3668h == Integer.MIN_VALUE) {
                iM3668h = handlerC5290j.f17432Y;
            }
            IOException iOException2 = handlerC5290j.f17436q0;
            if (iOException2 != null && handlerC5290j.f17437r0 > iM3668h) {
                throw iOException2;
            }
        }
        if (this.f13724X0 && !this.f13708H0) {
            throw C19755E.m20712a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: d */
    public final long mo4918d(long j10) {
        boolean zM4985r;
        m4949q();
        boolean[] zArr = (boolean[]) this.f13711K0.f7430o0;
        if (!this.f13712L0.mo6853d()) {
            j10 = 0;
        }
        this.f13717Q0 = false;
        this.f13720T0 = j10;
        if (m4952u()) {
            this.f13721U0 = j10;
            return j10;
        }
        if (this.f13715O0 != 7 && (this.f13724X0 || this.f13736w0.m5832a())) {
            int length = this.f13705E0.length;
            int i10 = 0;
            while (true) {
                zM4985r = true;
                if (i10 >= length) {
                    break;
                }
                C4219T c4219t = this.f13705E0[i10];
                if (this.f13710J0) {
                    int i11 = c4219t.f13783q;
                    synchronized (c4219t) {
                        c4219t.m4984q();
                        int i12 = c4219t.f13783q;
                        if (i11 < i12 || i11 > c4219t.f13782p + i12) {
                            zM4985r = false;
                        } else {
                            c4219t.f13786t = Long.MIN_VALUE;
                            c4219t.f13785s = i11 - i12;
                        }
                    }
                } else {
                    zM4985r = c4219t.m4985r(j10, false);
                }
                if (!zM4985r && (zArr[i10] || !this.f13709I0)) {
                    zM4985r = false;
                    break;
                }
                i10++;
            }
            if (zM4985r) {
                return j10;
            }
        }
        this.f13722V0 = false;
        this.f13721U0 = j10;
        this.f13724X0 = false;
        if (this.f13736w0.m5832a()) {
            for (C4219T c4219t2 : this.f13705E0) {
                c4219t2.m4975h();
            }
            HandlerC5290j handlerC5290j = this.f13736w0.f17445b;
            AbstractC20800b.m21321i(handlerC5290j);
            handlerC5290j.m5831a(false);
        } else {
            this.f13736w0.f17446c = null;
            for (C4219T c4219t3 : this.f13705E0) {
                c4219t3.m4983p(false);
            }
        }
        return j10;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: e */
    public final void mo4919e(long j10) {
        long jM4974g;
        int i10;
        if (this.f13710J0) {
            return;
        }
        m4949q();
        if (m4952u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f13711K0.f7431p0;
        int length = this.f13705E0.length;
        for (int i11 = 0; i11 < length; i11++) {
            C4219T c4219t = this.f13705E0[i11];
            boolean z6 = zArr[i11];
            C4217Q c4217q = c4219t.f13767a;
            synchronized (c4219t) {
                try {
                    int i12 = c4219t.f13782p;
                    jM4974g = -1;
                    if (i12 != 0) {
                        long[] jArr = c4219t.f13780n;
                        int i13 = c4219t.f13784r;
                        if (j10 >= jArr[i13]) {
                            int iM4976i = c4219t.m4976i(i13, (!z6 || (i10 = c4219t.f13785s) == i12) ? i12 : i10 + 1, j10, false);
                            if (iM4976i != -1) {
                                jM4974g = c4219t.m4974g(iM4976i);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c4217q.m4966a(jM4974g);
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: f */
    public final void mo4920f(InterfaceC4250v interfaceC4250v, long j10) {
        this.f13703C0 = interfaceC4250v;
        this.f13738y0.m1015h();
        m4957z();
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: g */
    public final boolean mo4921g() {
        boolean z6;
        if (this.f13736w0.m5832a()) {
            C0376k c0376k = this.f13738y0;
            synchronized (c0376k) {
                z6 = c0376k.f1278Z;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    @Override // p305M3.InterfaceC5288h
    /* JADX INFO: renamed from: h */
    public final void mo4947h(C4210J c4210j, long j10, long j11) {
        InterfaceC6310B interfaceC6310B;
        if (this.f13713M0 == -9223372036854775807L && (interfaceC6310B = this.f13712L0) != null) {
            boolean zMo6853d = interfaceC6310B.mo6853d();
            long jM4951t = m4951t(true);
            long j12 = jM4951t == Long.MIN_VALUE ? 0L : jM4951t + 10000;
            this.f13713M0 = j12;
            this.f13732s0.m4962t(j12, zMo6853d, this.f13714N0);
        }
        C21728A c21728a = c4210j.f13683c;
        Uri uri = c21728a.f68928o0;
        C4244p c4244p = new C4244p(c21728a.f68929p0);
        this.f13729p0.getClass();
        this.f13730q0.m3630c(c4244p, new C4249u(-1, null, AbstractC20817s.m21399M(c4210j.f13690j), AbstractC20817s.m21399M(this.f13713M0)));
        this.f13724X0 = true;
        InterfaceC4250v interfaceC4250v = this.f13703C0;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2307h(this);
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: i */
    public final long mo4922i() {
        if (!this.f13717Q0) {
            return -9223372036854775807L;
        }
        if (!this.f13724X0 && m4950r() <= this.f13723W0) {
            return -9223372036854775807L;
        }
        this.f13717Q0 = false;
        return this.f13720T0;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: j */
    public final boolean mo4923j(C1535M c1535m) {
        if (this.f13724X0) {
            return false;
        }
        C5292l c5292l = this.f13736w0;
        if (c5292l.f17446c != null || this.f13722V0) {
            return false;
        }
        if (this.f13708H0 && this.f13718R0 == 0) {
            return false;
        }
        boolean zM1015h = this.f13738y0.m1015h();
        if (c5292l.m5832a()) {
            return zM1015h;
        }
        m4957z();
        return true;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: k */
    public final C4227a0 mo4924k() {
        m4949q();
        return (C4227a0) this.f13711K0.f7429Z;
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: l */
    public final long mo4925l() {
        long jM4951t;
        boolean z6;
        m4949q();
        if (this.f13724X0 || this.f13718R0 == 0) {
            return Long.MIN_VALUE;
        }
        if (m4952u()) {
            return this.f13721U0;
        }
        if (this.f13709I0) {
            int length = this.f13705E0.length;
            jM4951t = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                C2391u c2391u = this.f13711K0;
                if (((boolean[]) c2391u.f7430o0)[i10] && ((boolean[]) c2391u.f7431p0)[i10]) {
                    C4219T c4219t = this.f13705E0[i10];
                    synchronized (c4219t) {
                        z6 = c4219t.f13789w;
                    }
                    if (!z6) {
                        jM4951t = Math.min(jM4951t, this.f13705E0[i10].m4977j());
                    }
                }
            }
        } else {
            jM4951t = Long.MAX_VALUE;
        }
        if (jM4951t == Long.MAX_VALUE) {
            jM4951t = m4951t(false);
        }
        return jM4951t == Long.MIN_VALUE ? this.f13720T0 : jM4951t;
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: m */
    public final long mo4926m(long j10, C1561g0 c1561g0) {
        m4949q();
        if (!this.f13712L0.mo6853d()) {
            return 0L;
        }
        C6309A c6309aMo6854j = this.f13712L0.mo6854j(j10);
        long j11 = c6309aMo6854j.f20441a.f20444a;
        long j12 = c6309aMo6854j.f20442b.f20444a;
        long j13 = c1561g0.f4356a;
        long j14 = c1561g0.f4357b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        int i10 = AbstractC20817s.f66106a;
        long j15 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j14;
        if (((j14 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z6 = false;
        boolean z10 = j15 <= j11 && j11 <= j16;
        if (j15 <= j12 && j12 <= j16) {
            z6 = true;
        }
        if (z10 && z6) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
        } else {
            if (z10) {
                return j11;
            }
            if (!z6) {
                return j15;
            }
        }
        return j12;
    }

    @Override // p305M3.InterfaceC5288h
    /* JADX INFO: renamed from: n */
    public final void mo4948n(C4210J c4210j, long j10, long j11, boolean z6) {
        C21728A c21728a = c4210j.f13683c;
        Uri uri = c21728a.f68928o0;
        C4244p c4244p = new C4244p(c21728a.f68929p0);
        this.f13729p0.getClass();
        this.f13730q0.m3629b(c4244p, new C4249u(-1, null, AbstractC20817s.m21399M(c4210j.f13690j), AbstractC20817s.m21399M(this.f13713M0)));
        if (z6) {
            return;
        }
        for (C4219T c4219t : this.f13705E0) {
            c4219t.m4983p(false);
        }
        if (this.f13718R0 > 0) {
            InterfaceC4250v interfaceC4250v = this.f13703C0;
            interfaceC4250v.getClass();
            interfaceC4250v.mo2307h(this);
        }
    }

    @Override // p232J3.InterfaceC4251w
    /* JADX INFO: renamed from: o */
    public final long mo4927o(InterfaceC4930q[] interfaceC4930qArr, boolean[] zArr, InterfaceC4220U[] interfaceC4220UArr, boolean[] zArr2, long j10) {
        InterfaceC4930q interfaceC4930q;
        m4949q();
        C2391u c2391u = this.f13711K0;
        C4227a0 c4227a0 = (C4227a0) c2391u.f7429Z;
        boolean[] zArr3 = (boolean[]) c2391u.f7431p0;
        int i10 = this.f13718R0;
        for (int i11 = 0; i11 < interfaceC4930qArr.length; i11++) {
            InterfaceC4220U interfaceC4220U = interfaceC4220UArr[i11];
            if (interfaceC4220U != null && (interfaceC4930qArr[i11] == null || !zArr[i11])) {
                int i12 = ((C4211K) interfaceC4220U).f13695Y;
                AbstractC20800b.m21320h(zArr3[i12]);
                this.f13718R0--;
                zArr3[i12] = false;
                interfaceC4220UArr[i11] = null;
            }
        }
        boolean z6 = !this.f13716P0 ? j10 == 0 || this.f13710J0 : i10 != 0;
        for (int i13 = 0; i13 < interfaceC4930qArr.length; i13++) {
            if (interfaceC4220UArr[i13] == null && (interfaceC4930q = interfaceC4930qArr[i13]) != null) {
                AbstractC20800b.m21320h(interfaceC4930q.length() == 1);
                AbstractC20800b.m21320h(interfaceC4930q.mo4908e(0) == 0);
                int iIndexOf = c4227a0.f13816b.indexOf(interfaceC4930q.mo4904a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC20800b.m21320h(!zArr3[iIndexOf]);
                this.f13718R0++;
                zArr3[iIndexOf] = true;
                interfaceC4220UArr[i13] = new C4211K(this, iIndexOf);
                zArr2[i13] = true;
                if (!z6) {
                    C4219T c4219t = this.f13705E0[iIndexOf];
                    z6 = (c4219t.f13783q + c4219t.f13785s == 0 || c4219t.m4985r(j10, true)) ? false : true;
                }
            }
        }
        if (this.f13718R0 == 0) {
            this.f13722V0 = false;
            this.f13717Q0 = false;
            C5292l c5292l = this.f13736w0;
            if (c5292l.m5832a()) {
                for (C4219T c4219t2 : this.f13705E0) {
                    c4219t2.m4975h();
                }
                HandlerC5290j handlerC5290j = c5292l.f17445b;
                AbstractC20800b.m21321i(handlerC5290j);
                handlerC5290j.m5831a(false);
            } else {
                this.f13724X0 = false;
                for (C4219T c4219t3 : this.f13705E0) {
                    c4219t3.m4983p(false);
                }
            }
        } else if (z6) {
            j10 = mo4918d(j10);
            for (int i14 = 0; i14 < interfaceC4220UArr.length; i14++) {
                if (interfaceC4220UArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.f13716P0 = true;
        return j10;
    }

    /* JADX INFO: renamed from: q */
    public final void m4949q() {
        AbstractC20800b.m21320h(this.f13708H0);
        this.f13711K0.getClass();
        this.f13712L0.getClass();
    }

    /* JADX INFO: renamed from: r */
    public final int m4950r() {
        int i10 = 0;
        for (C4219T c4219t : this.f13705E0) {
            i10 += c4219t.f13783q + c4219t.f13782p;
        }
        return i10;
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: s */
    public final void mo3061s() {
        this.f13707G0 = true;
        this.f13702B0.post(this.f13739z0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: t */
    public final long m4951t(boolean z6) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f13705E0.length; i10++) {
            if (z6) {
                jMax = Math.max(jMax, this.f13705E0[i10].m4977j());
            } else {
                C2391u c2391u = this.f13711K0;
                c2391u.getClass();
                if (((boolean[]) c2391u.f7431p0)[i10]) {
                    jMax = Math.max(jMax, this.f13705E0[i10].m4977j());
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4952u() {
        return this.f13721U0 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: v */
    public final void m4953v() {
        long j10;
        int i10;
        C19788o c19788o;
        if (this.f13726Y0 || this.f13708H0 || !this.f13707G0 || this.f13712L0 == null) {
            return;
        }
        for (C4219T c4219t : this.f13705E0) {
            synchronized (c4219t) {
                c19788o = c4219t.f13791y ? null : c4219t.f13792z;
            }
            if (c19788o == null) {
                return;
            }
        }
        this.f13738y0.m1012d();
        int length = this.f13705E0.length;
        C19765O[] c19765oArr = new C19765O[length];
        boolean[] zArr = new boolean[length];
        int i11 = 0;
        while (true) {
            j10 = this.f13735v0;
            if (i11 >= length) {
                break;
            }
            C19788o c19788oM4979l = this.f13705E0[i11].m4979l();
            c19788oM4979l.getClass();
            String str = c19788oM4979l.f62752m;
            boolean zEquals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(AbstractC19754D.m20706d(str));
            boolean z6 = zEquals || AbstractC19754D.m20710h(str);
            zArr[i11] = z6;
            this.f13709I0 = z6 | this.f13709I0;
            this.f13710J0 = j10 != -9223372036854775807L && length == 1 && AbstractC19754D.m20708f(str);
            C11646b c11646b = this.f13704D0;
            if (c11646b != null) {
                if (zEquals || this.f13706F0[i11].f13698b) {
                    C19753C c19753c = c19788oM4979l.f62750k;
                    C19753C c19753c2 = c19753c == null ? new C19753C(c11646b) : c19753c.m20701a(c11646b);
                    C19787n c19787nM20747a = c19788oM4979l.m20747a();
                    c19787nM20747a.f62712j = c19753c2;
                    c19788oM4979l = new C19788o(c19787nM20747a);
                }
                if (zEquals && c19788oM4979l.f62746g == -1 && c19788oM4979l.f62747h == -1 && (i10 = c11646b.f35277Y) != -1) {
                    C19787n c19787nM20747a2 = c19788oM4979l.m20747a();
                    c19787nM20747a2.f62709g = i10;
                    c19788oM4979l = new C19788o(c19787nM20747a2);
                }
            }
            int iMo3638j = this.f13728o0.mo3638j(c19788oM4979l);
            C19787n c19787nM20747a3 = c19788oM4979l.m20747a();
            c19787nM20747a3.f62702I = iMo3638j;
            c19765oArr[i11] = new C19765O(Integer.toString(i11), new C19788o(c19787nM20747a3));
            i11++;
        }
        this.f13711K0 = new C2391u(new C4227a0(c19765oArr), zArr);
        if (this.f13710J0 && this.f13713M0 == -9223372036854775807L) {
            this.f13713M0 = j10;
            this.f13712L0 = new C4209I(this, this.f13712L0);
        }
        this.f13732s0.m4962t(this.f13713M0, this.f13712L0.mo6853d(), this.f13714N0);
        this.f13708H0 = true;
        InterfaceC4250v interfaceC4250v = this.f13703C0;
        interfaceC4250v.getClass();
        interfaceC4250v.mo2295b(this);
    }

    /* JADX INFO: renamed from: w */
    public final void m4954w(int i10) {
        m4949q();
        C2391u c2391u = this.f13711K0;
        boolean[] zArr = (boolean[]) c2391u.f7432q0;
        if (zArr[i10]) {
            return;
        }
        C19788o c19788o = ((C4227a0) c2391u.f7429Z).m4999a(i10).f62605d[0];
        this.f13730q0.m3628a(new C4249u(AbstractC19754D.m20707e(c19788o.f62752m), c19788o, AbstractC20817s.m21399M(this.f13720T0), -9223372036854775807L));
        zArr[i10] = true;
    }

    /* JADX INFO: renamed from: x */
    public final void m4955x(int i10) {
        m4949q();
        boolean[] zArr = (boolean[]) this.f13711K0.f7430o0;
        if (this.f13722V0 && zArr[i10] && !this.f13705E0[i10].m4980m(false)) {
            this.f13721U0 = 0L;
            this.f13722V0 = false;
            this.f13717Q0 = true;
            this.f13720T0 = 0L;
            this.f13723W0 = 0;
            for (C4219T c4219t : this.f13705E0) {
                c4219t.m4983p(false);
            }
            InterfaceC4250v interfaceC4250v = this.f13703C0;
            interfaceC4250v.getClass();
            interfaceC4250v.mo2307h(this);
        }
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceC6316H m4956y(C4212L c4212l) {
        int length = this.f13705E0.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c4212l.equals(this.f13706F0[i10])) {
                return this.f13705E0[i10];
            }
        }
        if (this.f13707G0) {
            AbstractC20800b.m21332t("ProgressiveMediaPeriod", "Extractor added new track (id=" + c4212l.f13697a + ") after finishing tracks.");
            return new C6332n();
        }
        InterfaceC2661g interfaceC2661g = this.f13728o0;
        interfaceC2661g.getClass();
        C4219T c4219t = new C4219T(this.f13733t0, interfaceC2661g, this.f13731r0);
        c4219t.f13772f = this;
        int i11 = length + 1;
        C4212L[] c4212lArr = (C4212L[]) Arrays.copyOf(this.f13706F0, i11);
        c4212lArr[length] = c4212l;
        this.f13706F0 = c4212lArr;
        C4219T[] c4219tArr = (C4219T[]) Arrays.copyOf(this.f13705E0, i11);
        c4219tArr[length] = c4219t;
        this.f13705E0 = c4219tArr;
        return c4219t;
    }

    /* JADX INFO: renamed from: z */
    public final void m4957z() {
        C4210J c4210j = new C4210J(this, this.f13725Y, this.f13727Z, this.f13737x0, this, this.f13738y0);
        if (this.f13708H0) {
            AbstractC20800b.m21320h(m4952u());
            long j10 = this.f13713M0;
            if (j10 != -9223372036854775807L && this.f13721U0 > j10) {
                this.f13724X0 = true;
                this.f13721U0 = -9223372036854775807L;
                return;
            }
            InterfaceC6310B interfaceC6310B = this.f13712L0;
            interfaceC6310B.getClass();
            long j11 = interfaceC6310B.mo6854j(this.f13721U0).f20441a.f20445b;
            long j12 = this.f13721U0;
            c4210j.f13687g.f20561a = j11;
            c4210j.f13690j = j12;
            c4210j.f13689i = true;
            c4210j.f13693m = false;
            for (C4219T c4219t : this.f13705E0) {
                c4219t.f13786t = this.f13721U0;
            }
            this.f13721U0 = -9223372036854775807L;
        }
        this.f13723W0 = m4950r();
        int iM3668h = this.f13729p0.m3668h(this.f13715O0);
        C5292l c5292l = this.f13736w0;
        c5292l.getClass();
        Looper looperMyLooper = Looper.myLooper();
        AbstractC20800b.m21321i(looperMyLooper);
        c5292l.f17446c = null;
        HandlerC5290j handlerC5290j = new HandlerC5290j(c5292l, looperMyLooper, c4210j, this, iM3668h, SystemClock.elapsedRealtime());
        AbstractC20800b.m21320h(c5292l.f17445b == null);
        c5292l.f17445b = handlerC5290j;
        handlerC5290j.f17436q0 = null;
        c5292l.f17444a.execute(handlerC5290j);
        Uri uri = c4210j.f13691k.f68974a;
        this.f13730q0.m3632e(new C4244p(Collections.emptyMap()), new C4249u(-1, null, AbstractC20817s.m21399M(c4210j.f13690j), AbstractC20817s.m21399M(this.f13713M0)));
    }

    @Override // p232J3.InterfaceC4221V
    /* JADX INFO: renamed from: p */
    public final void mo4928p(long j10) {
    }
}
