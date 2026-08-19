package p057C3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import bb.C11333z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.C0072l;
import p001A.RunnableC0074m;
import p003A1.AbstractC0168G;
import p083D3.C1868f;
import p083D3.C1875m;
import p1016t3.AbstractC19764N;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1016t3.C19757G;
import p1016t3.C19761K;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19788o;
import p1016t3.C19793t;
import p1016t3.C19797x;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p1073w3.C20814p;
import p1073w3.C20815q;
import p109E3.C2271L;
import p1139z0.C21585H;
import p1142z3.C21741i;
import p133F3.C2656b;
import p206I3.C3613b;
import p232J3.AbstractC4226a;
import p232J3.C4222W;
import p232J3.C4227a0;
import p232J3.C4253y;
import p232J3.InterfaceC4220U;
import p232J3.InterfaceC4221V;
import p232J3.InterfaceC4250v;
import p232J3.InterfaceC4251w;
import p257K3.C4537e;
import p281L3.AbstractC4931r;
import p281L3.C4928o;
import p281L3.C4932s;
import p281L3.InterfaceC4930q;
import p305M3.C5285e;
import p305M3.C5287g;
import p305M3.InterfaceC5284d;

/* JADX INFO: renamed from: C3.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1532J implements Handler.Callback, InterfaceC4250v, InterfaceC1549a0 {

    /* JADX INFO: renamed from: f1 */
    public static final long f4122f1 = AbstractC20817s.m21399M(10000);

    /* JADX INFO: renamed from: A0 */
    public final ArrayList f4123A0;

    /* JADX INFO: renamed from: B0 */
    public final C20813o f4124B0;

    /* JADX INFO: renamed from: C0 */
    public final C1576u f4125C0;

    /* JADX INFO: renamed from: D0 */
    public final C1539Q f4126D0;

    /* JADX INFO: renamed from: E0 */
    public final C1546Y f4127E0;

    /* JADX INFO: renamed from: F0 */
    public final C1560g f4128F0;

    /* JADX INFO: renamed from: G0 */
    public final long f4129G0;

    /* JADX INFO: renamed from: H0 */
    public final C1875m f4130H0;

    /* JADX INFO: renamed from: I0 */
    public C1561g0 f4131I0;

    /* JADX INFO: renamed from: J0 */
    public C1547Z f4132J0;

    /* JADX INFO: renamed from: K0 */
    public C1529G f4133K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f4134L0;

    /* JADX INFO: renamed from: N0 */
    public boolean f4136N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f4137O0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f4139Q0;

    /* JADX INFO: renamed from: T0 */
    public boolean f4142T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f4143U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f4144V0;

    /* JADX INFO: renamed from: W0 */
    public int f4145W0;

    /* JADX INFO: renamed from: X0 */
    public C1531I f4146X0;

    /* JADX INFO: renamed from: Y */
    public final AbstractC1554d[] f4147Y;

    /* JADX INFO: renamed from: Y0 */
    public long f4148Y0;

    /* JADX INFO: renamed from: Z */
    public final Set f4149Z;

    /* JADX INFO: renamed from: Z0 */
    public long f4150Z0;

    /* JADX INFO: renamed from: a1 */
    public int f4151a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f4152b1;

    /* JADX INFO: renamed from: c1 */
    public C1567l f4153c1;

    /* JADX INFO: renamed from: e1 */
    public C1573r f4155e1;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC1554d[] f4156o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC4931r f4157p0;

    /* JADX INFO: renamed from: q0 */
    public final C4932s f4158q0;

    /* JADX INFO: renamed from: r0 */
    public final C1564i f4159r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC5284d f4160s0;

    /* JADX INFO: renamed from: t0 */
    public final C20815q f4161t0;

    /* JADX INFO: renamed from: u0 */
    public final HandlerThread f4162u0;

    /* JADX INFO: renamed from: v0 */
    public final Looper f4163v0;

    /* JADX INFO: renamed from: w0 */
    public final C19763M f4164w0;

    /* JADX INFO: renamed from: x0 */
    public final C19762L f4165x0;

    /* JADX INFO: renamed from: y0 */
    public final long f4166y0;

    /* JADX INFO: renamed from: z0 */
    public final C1565j f4167z0;

    /* JADX INFO: renamed from: R0 */
    public int f4140R0 = 0;

    /* JADX INFO: renamed from: S0 */
    public boolean f4141S0 = false;

    /* JADX INFO: renamed from: M0 */
    public boolean f4135M0 = false;

    /* JADX INFO: renamed from: d1 */
    public long f4154d1 = -9223372036854775807L;

    /* JADX INFO: renamed from: P0 */
    public long f4138P0 = -9223372036854775807L;

    public C1532J(AbstractC1554d[] abstractC1554dArr, AbstractC4931r abstractC4931r, C4932s c4932s, C1564i c1564i, InterfaceC5284d interfaceC5284d, C1868f c1868f, C1561g0 c1561g0, C1560g c1560g, long j10, Looper looper, C20813o c20813o, C1576u c1576u, C1875m c1875m, C1573r c1573r) {
        this.f4125C0 = c1576u;
        this.f4147Y = abstractC1554dArr;
        this.f4157p0 = abstractC4931r;
        this.f4158q0 = c4932s;
        this.f4159r0 = c1564i;
        this.f4160s0 = interfaceC5284d;
        this.f4131I0 = c1561g0;
        this.f4128F0 = c1560g;
        this.f4129G0 = j10;
        this.f4124B0 = c20813o;
        this.f4130H0 = c1875m;
        this.f4155e1 = c1573r;
        this.f4166y0 = c1564i.f4371g;
        C19761K c19761k = AbstractC19764N.f62601a;
        C1547Z c1547zM2372h = C1547Z.m2372h(c4932s);
        this.f4132J0 = c1547zM2372h;
        this.f4133K0 = new C1529G(c1547zM2372h);
        this.f4156o0 = new AbstractC1554d[abstractC1554dArr.length];
        C4928o c4928o = (C4928o) abstractC4931r;
        c4928o.getClass();
        for (int i10 = 0; i10 < abstractC1554dArr.length; i10++) {
            AbstractC1554d abstractC1554d = abstractC1554dArr[i10];
            abstractC1554d.f4299q0 = i10;
            abstractC1554d.f4300r0 = c1875m;
            abstractC1554d.f4301s0 = c20813o;
            this.f4156o0[i10] = abstractC1554d;
            AbstractC1554d abstractC1554d2 = this.f4156o0[i10];
            synchronized (abstractC1554d2.f4295Y) {
                abstractC1554d2.f4294C0 = c4928o;
            }
        }
        this.f4167z0 = new C1565j(this, c20813o);
        this.f4123A0 = new ArrayList();
        this.f4149Z = Collections.newSetFromMap(new IdentityHashMap());
        this.f4164w0 = new C19763M();
        this.f4165x0 = new C19762L();
        abstractC4931r.f16094a = this;
        abstractC4931r.f16095b = interfaceC5284d;
        this.f4152b1 = true;
        C20815q c20815qM21372a = c20813o.m21372a(looper, null);
        this.f4126D0 = new C1539Q(c1868f, c20815qM21372a, new C0072l(this, 15), c1573r);
        this.f4127E0 = new C1546Y(this, c1868f, c20815qM21372a, c1875m);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f4162u0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f4163v0 = looper2;
        this.f4161t0 = c20813o.m21372a(looper2, this);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m2266G(AbstractC19764N abstractC19764N, C1531I c1531i, boolean z6, int i10, boolean z10, C19763M c19763m, C19762L c19762l) {
        int iM2267H;
        AbstractC19764N abstractC19764N2 = c1531i.f4119a;
        if (abstractC19764N.m20728p()) {
            return null;
        }
        AbstractC19764N abstractC19764N3 = abstractC19764N2.m20728p() ? abstractC19764N : abstractC19764N2;
        try {
            Pair pairM20725i = abstractC19764N3.m20725i(c19763m, c19762l, c1531i.f4120b, c1531i.f4121c);
            if (abstractC19764N.equals(abstractC19764N3)) {
                return pairM20725i;
            }
            if (abstractC19764N.mo2413b(pairM20725i.first) != -1) {
                return (abstractC19764N3.mo2416g(pairM20725i.first, c19762l).f62582f && abstractC19764N3.mo2411m(c19762l.f62579c, c19763m, 0L).f62598m == abstractC19764N3.mo2413b(pairM20725i.first)) ? abstractC19764N.m20725i(c19763m, c19762l, abstractC19764N.mo2416g(pairM20725i.first, c19762l).f62579c, c1531i.f4121c) : pairM20725i;
            }
            if (z6 && (iM2267H = m2267H(c19763m, c19762l, i10, z10, pairM20725i.first, abstractC19764N3, abstractC19764N)) != -1) {
                return abstractC19764N.m20725i(c19763m, c19762l, iM2267H, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m2267H(C19763M c19763m, C19762L c19762l, int i10, boolean z6, Object obj, AbstractC19764N abstractC19764N, AbstractC19764N abstractC19764N2) {
        Object obj2 = abstractC19764N.mo2411m(abstractC19764N.mo2416g(obj, c19762l).f62579c, c19763m, 0L).f62586a;
        for (int i11 = 0; i11 < abstractC19764N2.mo2420o(); i11++) {
            if (abstractC19764N2.mo2411m(i11, c19763m, 0L).f62586a.equals(obj2)) {
                return i11;
            }
        }
        int iMo2413b = abstractC19764N.mo2413b(obj);
        int iMo2417h = abstractC19764N.mo2417h();
        int iM20724d = iMo2413b;
        int iMo2413b2 = -1;
        for (int i12 = 0; i12 < iMo2417h && iMo2413b2 == -1; i12++) {
            iM20724d = abstractC19764N.m20724d(iM20724d, c19762l, c19763m, i10, z6);
            if (iM20724d == -1) {
                break;
            }
            iMo2413b2 = abstractC19764N2.mo2413b(abstractC19764N.mo2419l(iM20724d));
        }
        if (iMo2413b2 == -1) {
            return -1;
        }
        return abstractC19764N2.mo2410f(iMo2413b2, c19762l, false).f62579c;
    }

    /* JADX INFO: renamed from: O */
    public static void m2268O(AbstractC1554d abstractC1554d, long j10) {
        abstractC1554d.f4308z0 = true;
        if (abstractC1554d instanceof C4537e) {
            C4537e c4537e = (C4537e) abstractC1554d;
            AbstractC20800b.m21320h(c4537e.f4308z0);
            c4537e.f14834W0 = j10;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2269q(AbstractC1554d abstractC1554d) {
        return abstractC1554d.f4302t0 != 0;
    }

    /* JADX INFO: renamed from: A */
    public final void m2270A(int i10, int i11, C4222W c4222w) {
        this.f4133K0.m2263f(1);
        C1546Y c1546y = this.f4127E0;
        c1546y.getClass();
        AbstractC20800b.m21316d(i10 >= 0 && i10 <= i11 && i11 <= ((ArrayList) c1546y.f4239c).size());
        c1546y.f4247k = c4222w;
        c1546y.m2371k(i10, i11);
        m2315l(c1546y.m2363c(), false);
    }

    /* JADX INFO: renamed from: B */
    public final void m2271B() throws C1567l {
        float f10 = this.f4167z0.mo2332g().f62564a;
        C1539Q c1539q = this.f4126D0;
        C1537O c1537o = c1539q.f4209i;
        C1537O c1537o2 = c1539q.f4210j;
        C4932s c4932s = null;
        C1537O c1537o3 = c1537o;
        boolean z6 = true;
        while (c1537o3 != null && c1537o3.f4180d) {
            C4932s c4932sM2340h = c1537o3.m2340h(f10, this.f4132J0.f4250a);
            C4932s c4932s2 = c1537o3 == this.f4126D0.f4209i ? c4932sM2340h : c4932s;
            C4932s c4932s3 = c1537o3.f4190n;
            if (c4932s3 != null) {
                int length = c4932s3.f16098c.length;
                InterfaceC4930q[] interfaceC4930qArr = c4932sM2340h.f16098c;
                if (length == interfaceC4930qArr.length) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= interfaceC4930qArr.length) {
                            if (c1537o3 == c1537o2) {
                                z6 = false;
                            }
                            c1537o3 = c1537o3.f4188l;
                            c4932s = c4932s2;
                        } else if (c4932sM2340h.m5541a(c4932s3, i10)) {
                            i10++;
                        }
                    }
                }
            }
            if (z6) {
                C1539Q c1539q2 = this.f4126D0;
                C1537O c1537o4 = c1539q2.f4209i;
                boolean zM2355k = c1539q2.m2355k(c1537o4);
                boolean[] zArr = new boolean[this.f4147Y.length];
                c4932s2.getClass();
                long jM2333a = c1537o4.m2333a(c4932s2, this.f4132J0.f4268s, zM2355k, zArr);
                C1547Z c1547z = this.f4132J0;
                boolean z10 = (c1547z.f4254e == 4 || jM2333a == c1547z.f4268s) ? false : true;
                C1547Z c1547z2 = this.f4132J0;
                this.f4132J0 = m2318o(c1547z2.f4251b, jM2333a, c1547z2.f4252c, c1547z2.f4253d, z10, 5);
                if (z10) {
                    m2274E(jM2333a);
                }
                boolean[] zArr2 = new boolean[this.f4147Y.length];
                int i11 = 0;
                while (true) {
                    AbstractC1554d[] abstractC1554dArr = this.f4147Y;
                    if (i11 >= abstractC1554dArr.length) {
                        break;
                    }
                    AbstractC1554d abstractC1554d = abstractC1554dArr[i11];
                    boolean zM2269q = m2269q(abstractC1554d);
                    zArr2[i11] = zM2269q;
                    InterfaceC4220U interfaceC4220U = c1537o4.f4179c[i11];
                    if (zM2269q) {
                        if (interfaceC4220U != abstractC1554d.f4303u0) {
                            m2297c(abstractC1554d);
                        } else if (zArr[i11]) {
                            long j10 = this.f4148Y0;
                            abstractC1554d.f4308z0 = false;
                            abstractC1554d.f4306x0 = j10;
                            abstractC1554d.f4307y0 = j10;
                            abstractC1554d.mo2398o(j10, false);
                        }
                    }
                    i11++;
                }
                m2301e(zArr2, this.f4148Y0);
            } else {
                this.f4126D0.m2355k(c1537o3);
                if (c1537o3.f4180d) {
                    c1537o3.m2333a(c4932sM2340h, Math.max(c1537o3.f4182f.f4193b, this.f4148Y0 - c1537o3.f4191o), false, new boolean[c1537o3.f4185i.length]);
                }
            }
            m2313k(true);
            if (this.f4132J0.f4254e != 4) {
                m2321s();
                m2308h0();
                this.f4161t0.m21379e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[PHI: r5 r6 r8
      0x00c3: PHI (r5v4 J3.y) = (r5v3 J3.y), (r5v12 J3.y) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r6v2 long) = (r6v1 long), (r6v24 long) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r8v3 long) = (r8v2 long), (r8v9 long) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX INFO: renamed from: C */
    public final void m2272C(boolean z6, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        C4253y c4253y;
        AbstractC19764N abstractC19764N;
        List list;
        this.f4161t0.m21378d(2);
        this.f4153c1 = null;
        m2312j0(false, true);
        C1565j c1565j = this.f4167z0;
        c1565j.f4375Z = false;
        C1563h0 c1563h0 = (C1563h0) c1565j.f4376o0;
        if (c1563h0.f4362o0) {
            c1563h0.m2424a(c1563h0.mo2330e());
            c1563h0.f4362o0 = false;
        }
        this.f4148Y0 = 1000000000000L;
        for (AbstractC1554d abstractC1554d : this.f4147Y) {
            try {
                m2297c(abstractC1554d);
            } catch (C1567l | RuntimeException e10) {
                AbstractC20800b.m21325m("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z6) {
            for (AbstractC1554d abstractC1554d2 : this.f4147Y) {
                if (this.f4149Z.remove(abstractC1554d2)) {
                    try {
                        abstractC1554d2.m2407x();
                    } catch (RuntimeException e11) {
                        AbstractC20800b.m21325m("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f4145W0 = 0;
        C1547Z c1547z = this.f4132J0;
        C4253y c4253y2 = c1547z.f4251b;
        long jLongValue = c1547z.f4268s;
        if (this.f4132J0.f4251b.m5017b()) {
            j10 = this.f4132J0.f4252c;
        } else {
            C1547Z c1547z2 = this.f4132J0;
            C19762L c19762l = this.f4165x0;
            C4253y c4253y3 = c1547z2.f4251b;
            AbstractC19764N abstractC19764N2 = c1547z2.f4250a;
            if (abstractC19764N2.m20728p() || abstractC19764N2.mo2416g(c4253y3.f13895a, c19762l).f62582f) {
                j10 = this.f4132J0.f4252c;
            } else {
                j10 = this.f4132J0.f4268s;
            }
        }
        if (z10) {
            this.f4146X0 = null;
            Pair pairM2305g = m2305g(this.f4132J0.f4250a);
            c4253y2 = (C4253y) pairM2305g.first;
            jLongValue = ((Long) pairM2305g.second).longValue();
            j10 = -9223372036854775807L;
            if (c4253y2.equals(this.f4132J0.f4251b)) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = false;
        }
        long j11 = jLongValue;
        long j12 = j10;
        this.f4126D0.m2346b();
        this.f4139Q0 = false;
        AbstractC19764N abstractC19764N3 = this.f4132J0.f4250a;
        if (z11 && (abstractC19764N3 instanceof C1557e0)) {
            C1557e0 c1557e0 = (C1557e0) abstractC19764N3;
            C4222W c4222w = (C4222W) this.f4127E0.f4247k;
            AbstractC19764N[] abstractC19764NArr = c1557e0.f4330h;
            AbstractC19764N[] abstractC19764NArr2 = new AbstractC19764N[abstractC19764NArr.length];
            for (int i10 = 0; i10 < abstractC19764NArr.length; i10++) {
                abstractC19764NArr2[i10] = new C1555d0(abstractC19764NArr[i10]);
            }
            C1557e0 c1557e1 = new C1557e0(abstractC19764NArr2, c1557e0.f4331i, c4222w);
            if (c4253y2.f13896b != -1) {
                c1557e1.mo2416g(c4253y2.f13895a, this.f4165x0);
                int i11 = this.f4165x0.f62579c;
                C19763M c19763m = this.f4164w0;
                c1557e1.mo2411m(i11, c19763m, 0L);
                if (c19763m.m20722a()) {
                    c4253y = new C4253y(c4253y2.f13898d, c4253y2.f13895a);
                } else {
                    c4253y = c4253y2;
                }
            } else {
                c4253y = c4253y2;
            }
            abstractC19764N = c1557e1;
        } else {
            c4253y = c4253y2;
            abstractC19764N = abstractC19764N3;
        }
        C1547Z c1547z3 = this.f4132J0;
        int i12 = c1547z3.f4254e;
        C1567l c1567l = z12 ? null : c1547z3.f4255f;
        C4227a0 c4227a0 = z13 ? C4227a0.f13814d : c1547z3.f4257h;
        C4932s c4932s = z13 ? this.f4158q0 : c1547z3.f4258i;
        if (z13) {
            C11276A c11276a = AbstractC11278C.f34162Z;
            list = C11294T.f34185q0;
        } else {
            list = c1547z3.f4259j;
        }
        this.f4132J0 = new C1547Z(abstractC19764N, c4253y, j12, j11, i12, c1567l, false, c4227a0, c4932s, list, c4253y, c1547z3.f4261l, c1547z3.f4262m, c1547z3.f4263n, c1547z3.f4264o, j11, 0L, j11, 0L, false);
        if (z11) {
            C1539Q c1539q = this.f4126D0;
            if (!c1539q.f4215o.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < c1539q.f4215o.size(); i13++) {
                    ((C1537O) c1539q.f4215o.get(i13)).m2339g();
                }
                c1539q.f4215o = arrayList;
            }
            C1546Y c1546y = this.f4127E0;
            HashMap map = (HashMap) c1546y.f4242f;
            for (C1544W c1544w : map.values()) {
                try {
                    c1544w.f4229a.m4996n(c1544w.f4230b);
                } catch (RuntimeException e12) {
                    AbstractC20800b.m21325m("MediaSourceList", "Failed to release child source.", e12);
                }
                AbstractC4226a abstractC4226a = c1544w.f4229a;
                C21585H c21585h = c1544w.f4231c;
                abstractC4226a.m4998q(c21585h);
                c1544w.f4229a.m4997p(c21585h);
            }
            map.clear();
            ((HashSet) c1546y.f4244h).clear();
            c1546y.f4237a = false;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2273D() {
        C1537O c1537o = this.f4126D0.f4209i;
        this.f4136N0 = c1537o != null && c1537o.f4182f.f4199h && this.f4135M0;
    }

    /* JADX INFO: renamed from: E */
    public final void m2274E(long j10) {
        C1537O c1537o = this.f4126D0.f4209i;
        long j11 = j10 + (c1537o == null ? 1000000000000L : c1537o.f4191o);
        this.f4148Y0 = j11;
        ((C1563h0) this.f4167z0.f4376o0).m2424a(j11);
        for (AbstractC1554d abstractC1554d : this.f4147Y) {
            if (m2269q(abstractC1554d)) {
                long j12 = this.f4148Y0;
                abstractC1554d.f4308z0 = false;
                abstractC1554d.f4306x0 = j12;
                abstractC1554d.f4307y0 = j12;
                abstractC1554d.mo2398o(j12, false);
            }
        }
        for (C1537O c1537o2 = r0.f4209i; c1537o2 != null; c1537o2 = c1537o2.f4188l) {
            for (InterfaceC4930q interfaceC4930q : c1537o2.f4190n.f16098c) {
                if (interfaceC4930q != null) {
                    interfaceC4930q.mo4913j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2275F(AbstractC19764N abstractC19764N, AbstractC19764N abstractC19764N2) {
        if (abstractC19764N.m20728p() && abstractC19764N2.m20728p()) {
            return;
        }
        ArrayList arrayList = this.f4123A0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0168G.m507B(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2276I(long j10) {
        this.f4161t0.f66101a.sendEmptyMessageAtTime(2, j10 + ((this.f4132J0.f4254e != 3 || m2292Z()) ? f4122f1 : 1000L));
    }

    /* JADX INFO: renamed from: J */
    public final void m2277J(boolean z6) throws C1567l {
        C4253y c4253y = this.f4126D0.f4209i.f4182f.f4192a;
        long jM2279L = m2279L(c4253y, this.f4132J0.f4268s, true, false);
        if (jM2279L != this.f4132J0.f4268s) {
            C1547Z c1547z = this.f4132J0;
            this.f4132J0 = m2318o(c4253y, jM2279L, c1547z.f4252c, c1547z.f4253d, z6, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: K */
    public final void m2278K(C1531I c1531i) throws Throwable {
        long j10;
        long j11;
        boolean z6;
        C4253y c4253y;
        long j12;
        long j13;
        long j14;
        C1547Z c1547z;
        int i10;
        this.f4133K0.m2263f(1);
        Pair pairM2266G = m2266G(this.f4132J0.f4250a, c1531i, true, this.f4140R0, this.f4141S0, this.f4164w0, this.f4165x0);
        if (pairM2266G == null) {
            Pair pairM2305g = m2305g(this.f4132J0.f4250a);
            c4253y = (C4253y) pairM2305g.first;
            long jLongValue = ((Long) pairM2305g.second).longValue();
            z6 = !this.f4132J0.f4250a.m20728p();
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            Object obj = pairM2266G.first;
            long jLongValue2 = ((Long) pairM2266G.second).longValue();
            long j15 = c1531i.f4121c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            C4253y c4253yM2356m = this.f4126D0.m2356m(this.f4132J0.f4250a, obj, jLongValue2);
            if (c4253yM2356m.m5017b()) {
                this.f4132J0.f4250a.mo2416g(c4253yM2356m.f13895a, this.f4165x0);
                if (this.f4165x0.m20718e(c4253yM2356m.f13896b) == c4253yM2356m.f13897c) {
                    this.f4165x0.f62583g.getClass();
                }
                j10 = 0;
                j11 = j15;
                c4253y = c4253yM2356m;
                z6 = true;
            } else {
                j10 = jLongValue2;
                j11 = j15;
                z6 = c1531i.f4121c == -9223372036854775807L;
                c4253y = c4253yM2356m;
            }
        }
        try {
            if (!this.f4132J0.f4250a.m20728p()) {
                if (pairM2266G == null) {
                    if (this.f4132J0.f4254e != 1) {
                        m2291Y(4);
                    }
                    m2272C(false, true, false, true);
                } else {
                    if (c4253y.equals(this.f4132J0.f4251b)) {
                        C1537O c1537o = this.f4126D0.f4209i;
                        long jMo4926m = (c1537o == null || !c1537o.f4180d || j10 == 0) ? j10 : c1537o.f4177a.mo4926m(j10, this.f4131I0);
                        if (AbstractC20817s.m21399M(jMo4926m) == AbstractC20817s.m21399M(this.f4132J0.f4268s) && ((i10 = (c1547z = this.f4132J0).f4254e) == 2 || i10 == 3)) {
                            long j16 = c1547z.f4268s;
                            this.f4132J0 = m2318o(c4253y, j16, j11, j16, z6, 2);
                            return;
                        }
                        j13 = jMo4926m;
                    } else {
                        j13 = j10;
                    }
                    boolean z10 = this.f4132J0.f4254e == 4;
                    C1539Q c1539q = this.f4126D0;
                    long jM2279L = m2279L(c4253y, j13, c1539q.f4209i != c1539q.f4210j, z10);
                    z6 |= j10 != jM2279L;
                    try {
                        C1547Z c1547z2 = this.f4132J0;
                        AbstractC19764N abstractC19764N = c1547z2.f4250a;
                        m2310i0(abstractC19764N, c4253y, abstractC19764N, c1547z2.f4251b, j11, true);
                        j14 = jM2279L;
                    } catch (Throwable th2) {
                        th = th2;
                        j12 = jM2279L;
                        this.f4132J0 = m2318o(c4253y, j12, j11, j12, z6, 2);
                        throw th;
                    }
                }
                this.f4132J0 = m2318o(c4253y, j14, j11, j14, z6, 2);
            }
            this.f4146X0 = c1531i;
            j14 = j10;
            this.f4132J0 = m2318o(c4253y, j14, j11, j14, z6, 2);
        } catch (Throwable th3) {
            th = th3;
            j12 = j10;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: L */
    public final long m2279L(C4253y c4253y, long j10, boolean z6, boolean z10) throws C1567l {
        m2300d0();
        m2312j0(false, true);
        if (z10 || this.f4132J0.f4254e == 3) {
            m2291Y(2);
        }
        C1539Q c1539q = this.f4126D0;
        C1537O c1537o = c1539q.f4209i;
        C1537O c1537o2 = c1537o;
        while (c1537o2 != null && !c4253y.equals(c1537o2.f4182f.f4192a)) {
            c1537o2 = c1537o2.f4188l;
        }
        if (z6 || c1537o != c1537o2 || (c1537o2 != null && c1537o2.f4191o + j10 < 0)) {
            AbstractC1554d[] abstractC1554dArr = this.f4147Y;
            for (AbstractC1554d abstractC1554d : abstractC1554dArr) {
                m2297c(abstractC1554d);
            }
            if (c1537o2 != null) {
                while (c1539q.f4209i != c1537o2) {
                    c1539q.m2345a();
                }
                c1539q.m2355k(c1537o2);
                c1537o2.f4191o = 1000000000000L;
                m2301e(new boolean[abstractC1554dArr.length], c1539q.f4210j.m2337e());
            }
        }
        if (c1537o2 != null) {
            c1539q.m2355k(c1537o2);
            if (!c1537o2.f4180d) {
                c1537o2.f4182f = c1537o2.f4182f.m2343b(j10);
            } else if (c1537o2.f4181e) {
                ?? r10 = c1537o2.f4177a;
                j10 = r10.mo4918d(j10);
                r10.mo4919e(j10 - this.f4166y0);
            }
            m2274E(j10);
            m2321s();
        } else {
            c1539q.m2346b();
            m2274E(j10);
        }
        m2313k(false);
        this.f4161t0.m21379e(2);
        return j10;
    }

    /* JADX INFO: renamed from: M */
    public final void m2280M(C1553c0 c1553c0) {
        Looper looper = c1553c0.f4288f;
        Looper looper2 = this.f4163v0;
        C20815q c20815q = this.f4161t0;
        if (looper != looper2) {
            c20815q.m21376a(15, c1553c0).m21374b();
            return;
        }
        synchronized (c1553c0) {
        }
        try {
            c1553c0.f4283a.mo2224a(c1553c0.f4286d, c1553c0.f4287e);
            c1553c0.m2386b(true);
            int i10 = this.f4132J0.f4254e;
            if (i10 == 3 || i10 == 2) {
                c20815q.m21379e(2);
            }
        } catch (Throwable th2) {
            c1553c0.m2386b(true);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2281N(C1553c0 c1553c0) {
        Looper looper = c1553c0.f4288f;
        if (looper.getThread().isAlive()) {
            this.f4124B0.m21372a(looper, null).m21377c(new RunnableC0074m(this, 11, c1553c0));
        } else {
            AbstractC20800b.m21332t("TAG", "Trying to send message on a dead thread.");
            c1553c0.m2386b(false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2282P(AtomicBoolean atomicBoolean, boolean z6) {
        if (this.f4142T0 != z6) {
            this.f4142T0 = z6;
            if (!z6) {
                for (AbstractC1554d abstractC1554d : this.f4147Y) {
                    if (!m2269q(abstractC1554d) && this.f4149Z.remove(abstractC1554d)) {
                        abstractC1554d.m2407x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2283Q(C1528F c1528f) {
        this.f4133K0.m2263f(1);
        int i10 = c1528f.f4105c;
        ArrayList arrayList = c1528f.f4103a;
        C4222W c4222w = c1528f.f4104b;
        if (i10 != -1) {
            this.f4146X0 = new C1531I(new C1557e0(arrayList, c4222w), c1528f.f4105c, c1528f.f4106d);
        }
        C1546Y c1546y = this.f4127E0;
        ArrayList arrayList2 = (ArrayList) c1546y.f4239c;
        c1546y.m2371k(0, arrayList2.size());
        m2315l(c1546y.m2361a(arrayList2.size(), arrayList, c4222w), false);
    }

    /* JADX INFO: renamed from: R */
    public final void m2284R(boolean z6) throws C1567l {
        this.f4135M0 = z6;
        m2273D();
        if (this.f4136N0) {
            C1539Q c1539q = this.f4126D0;
            if (c1539q.f4210j != c1539q.f4209i) {
                m2277J(true);
                m2313k(false);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2285S(int i10, int i11, boolean z6, boolean z10) {
        this.f4133K0.m2263f(z10 ? 1 : 0);
        this.f4132J0 = this.f4132J0.m2376d(i11, i10, z6);
        m2312j0(false, false);
        for (C1537O c1537o = this.f4126D0.f4209i; c1537o != null; c1537o = c1537o.f4188l) {
            for (InterfaceC4930q interfaceC4930q : c1537o.f4190n.f16098c) {
                if (interfaceC4930q != null) {
                    interfaceC4930q.mo4905b(z6);
                }
            }
        }
        if (!m2292Z()) {
            m2300d0();
            m2308h0();
            return;
        }
        int i12 = this.f4132J0.f4254e;
        C20815q c20815q = this.f4161t0;
        if (i12 != 3) {
            if (i12 == 2) {
                c20815q.m21379e(2);
            }
        } else {
            C1565j c1565j = this.f4167z0;
            c1565j.f4375Z = true;
            ((C1563h0) c1565j.f4376o0).m2425b();
            m2296b0();
            c20815q.m21379e(2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2286T(C19757G c19757g) {
        this.f4161t0.m21378d(16);
        C1565j c1565j = this.f4167z0;
        c1565j.mo2329d(c19757g);
        C19757G c19757gMo2332g = c1565j.mo2332g();
        m2317n(c19757gMo2332g, c19757gMo2332g.f62564a, true, true);
    }

    /* JADX INFO: renamed from: U */
    public final void m2287U(C1573r c1573r) {
        this.f4155e1 = c1573r;
        AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
        C1539Q c1539q = this.f4126D0;
        c1539q.getClass();
        c1573r.getClass();
        if (c1539q.f4215o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c1539q.f4215o.size(); i10++) {
            ((C1537O) c1539q.f4215o.get(i10)).m2339g();
        }
        c1539q.f4215o = arrayList;
    }

    /* JADX INFO: renamed from: V */
    public final void m2288V(int i10) throws C1567l {
        this.f4140R0 = i10;
        AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
        C1539Q c1539q = this.f4126D0;
        c1539q.f4207g = i10;
        if (!c1539q.m2358o(abstractC19764N)) {
            m2277J(true);
        }
        m2313k(false);
    }

    /* JADX INFO: renamed from: W */
    public final void m2289W(boolean z6) throws C1567l {
        this.f4141S0 = z6;
        AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
        C1539Q c1539q = this.f4126D0;
        c1539q.f4208h = z6;
        if (!c1539q.m2358o(abstractC19764N)) {
            m2277J(true);
        }
        m2313k(false);
    }

    /* JADX INFO: renamed from: X */
    public final void m2290X(C4222W c4222w) {
        this.f4133K0.m2263f(1);
        C1546Y c1546y = this.f4127E0;
        int size = ((ArrayList) c1546y.f4239c).size();
        if (c4222w.f13794b.length != size) {
            c4222w = new C4222W(new Random(c4222w.f13793a.nextLong())).m4987a(size);
        }
        c1546y.f4247k = c4222w;
        m2315l(c1546y.m2363c(), false);
    }

    /* JADX INFO: renamed from: Y */
    public final void m2291Y(int i10) {
        C1547Z c1547z = this.f4132J0;
        if (c1547z.f4254e != i10) {
            if (i10 != 2) {
                this.f4154d1 = -9223372036854775807L;
            }
            this.f4132J0 = c1547z.m2378f(i10);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m2292Z() {
        C1547Z c1547z = this.f4132J0;
        return c1547z.f4261l && c1547z.f4263n == 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2293a(C1528F c1528f, int i10) {
        this.f4133K0.m2263f(1);
        C1546Y c1546y = this.f4127E0;
        if (i10 == -1) {
            i10 = ((ArrayList) c1546y.f4239c).size();
        }
        m2315l(c1546y.m2361a(i10, c1528f.f4103a, c1528f.f4104b), false);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m2294a0(AbstractC19764N abstractC19764N, C4253y c4253y) {
        if (c4253y.m5017b() || abstractC19764N.m20728p()) {
            return false;
        }
        int i10 = abstractC19764N.mo2416g(c4253y.f13895a, this.f4165x0).f62579c;
        C19763M c19763m = this.f4164w0;
        abstractC19764N.m20727n(i10, c19763m);
        return c19763m.m20722a() && c19763m.f62593h && c19763m.f62590e != -9223372036854775807L;
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: b */
    public final void mo2295b(InterfaceC4251w interfaceC4251w) {
        this.f4161t0.m21376a(8, interfaceC4251w).m21374b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2296b0() {
        C1537O c1537o = this.f4126D0.f4209i;
        if (c1537o == null) {
            return;
        }
        C4932s c4932s = c1537o.f4190n;
        int i10 = 0;
        while (true) {
            AbstractC1554d[] abstractC1554dArr = this.f4147Y;
            if (i10 >= abstractC1554dArr.length) {
                return;
            }
            if (c4932s.m5542b(i10)) {
                AbstractC1554d abstractC1554d = abstractC1554dArr[i10];
                int i11 = abstractC1554d.f4302t0;
                if (i11 == 1) {
                    AbstractC20800b.m21320h(i11 == 1);
                    abstractC1554d.f4302t0 = 2;
                    abstractC1554d.mo2401r();
                }
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2297c(AbstractC1554d abstractC1554d) {
        if (m2269q(abstractC1554d)) {
            C1565j c1565j = this.f4167z0;
            if (abstractC1554d == ((AbstractC1554d) c1565j.f4378q0)) {
                c1565j.f4379r0 = null;
                c1565j.f4378q0 = null;
                c1565j.f4374Y = true;
            }
            int i10 = abstractC1554d.f4302t0;
            if (i10 == 2) {
                AbstractC20800b.m21320h(i10 == 2);
                abstractC1554d.f4302t0 = 1;
                abstractC1554d.mo2402s();
            }
            AbstractC20800b.m21320h(abstractC1554d.f4302t0 == 1);
            abstractC1554d.f4297o0.m16638m();
            abstractC1554d.f4302t0 = 0;
            abstractC1554d.f4303u0 = null;
            abstractC1554d.f4304v0 = null;
            abstractC1554d.f4308z0 = false;
            abstractC1554d.mo2396m();
            this.f4145W0--;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m2298c0(boolean z6, boolean z10) {
        m2272C(z6 || !this.f4142T0, false, true, false);
        this.f4133K0.m2263f(z10 ? 1 : 0);
        C1564i c1564i = this.f4159r0;
        if (c1564i.f4372h.remove(this.f4130H0) != null) {
            c1564i.m2429d();
        }
        m2291Y(1);
    }

    /* JADX WARN: Code duplicated, block: B:229:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0514  */
    /* JADX WARN: Code duplicated, block: B:373:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:383:0x0615  */
    /* JADX WARN: Code duplicated, block: B:385:0x061b  */
    /* JADX WARN: Code duplicated, block: B:387:0x0623  */
    /* JADX WARN: Code duplicated, block: B:389:0x0627  */
    /* JADX WARN: Code duplicated, block: B:395:0x063e  */
    /* JADX WARN: Code duplicated, block: B:404:0x065b  */
    /* JADX WARN: Code duplicated, block: B:407:0x0661  */
    /* JADX WARN: Code duplicated, block: B:420:0x0695  */
    /* JADX WARN: Code duplicated, block: B:422:0x0698  */
    /* JADX WARN: Code duplicated, block: B:423:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:425:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:426:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:433:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:440:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:443:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:459:0x0762  */
    /* JADX WARN: Code duplicated, block: B:486:0x067e A[EDGE_INSN: B:486:0x067e->B:413:0x067e BREAK  A[LOOP:5: B:405:0x065c->B:412:0x067b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Instruction removed from duplicated block: B:385:0x061b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [L3.s] */
    /* JADX WARN: Type inference failed for: r1v2, types: [J3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [J3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [J3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v26, types: [J3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v75, types: [J3.V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v85, types: [L3.q[]] */
    /* JADX WARN: Type inference failed for: r4v86, types: [L3.q] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m2299d() throws C1567l {
        long j10;
        boolean z6;
        boolean z10;
        boolean z11;
        C1537O c1537o;
        C1560g c1560g;
        long j11;
        long j12;
        int i10;
        int i11;
        boolean zM2320r;
        boolean z12;
        boolean z13;
        C1547Z c1547z;
        int i12;
        int i13;
        AbstractC1554d[] abstractC1554dArr;
        C1547Z c1547z2;
        InterfaceC4220U interfaceC4220U;
        C1537O c1537o2;
        boolean z14;
        boolean z15;
        C1539Q c1539q;
        C1537O c1537o3;
        C1537O c1537o4;
        boolean z16;
        AbstractC1554d[] abstractC1554dArr2;
        this.f4124B0.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f4161t0.m21378d(2);
        long j13 = -9223372036854775807L;
        if (this.f4132J0.f4250a.m20728p() || !this.f4127E0.f4237a) {
            j10 = -9223372036854775807L;
        } else {
            C1539Q c1539q2 = this.f4126D0;
            long j14 = this.f4148Y0;
            C1537O c1537o5 = c1539q2.f4211k;
            if (c1537o5 != null) {
                AbstractC20800b.m21320h(c1537o5.f4188l == null);
                if (c1537o5.f4180d) {
                    c1537o5.f4177a.mo4928p(j14 - c1537o5.f4191o);
                }
            }
            C1539Q c1539q3 = this.f4126D0;
            C1537O c1537o6 = c1539q3.f4211k;
            if (c1537o6 == null || (!c1537o6.f4182f.f4200i && c1537o6.m2338f() && c1539q3.f4211k.f4182f.f4196e != -9223372036854775807L && c1539q3.f4212l < 100)) {
                C1539Q c1539q4 = this.f4126D0;
                long j15 = this.f4148Y0;
                C1547Z c1547z3 = this.f4132J0;
                C1537O c1537o7 = c1539q4.f4211k;
                C1538P c1538pM2348d = c1537o7 == null ? c1539q4.m2348d(c1547z3.f4250a, c1547z3.f4251b, c1547z3.f4252c, c1547z3.f4268s) : c1539q4.m2347c(c1547z3.f4250a, c1537o7, j15);
                if (c1538pM2348d != null) {
                    C1539Q c1539q5 = this.f4126D0;
                    C1537O c1537o8 = c1539q5.f4211k;
                    long j16 = c1537o8 == null ? 1000000000000L : (c1537o8.f4191o + c1537o8.f4182f.f4196e) - c1538pM2348d.f4193b;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= c1539q5.f4215o.size()) {
                            c1537o2 = null;
                            break;
                        }
                        C1538P c1538p = ((C1537O) c1539q5.f4215o.get(i14)).f4182f;
                        long j17 = c1538p.f4196e;
                        if ((j17 == j13 || j17 == c1538pM2348d.f4196e) && c1538p.f4193b == c1538pM2348d.f4193b && c1538p.f4192a.equals(c1538pM2348d.f4192a)) {
                            c1537o2 = (C1537O) c1539q5.f4215o.remove(i14);
                            break;
                        } else {
                            i14++;
                            j13 = -9223372036854775807L;
                        }
                    }
                    if (c1537o2 == null) {
                        C1532J c1532j = (C1532J) c1539q5.f4205e.f310Z;
                        c1537o2 = new C1537O(c1532j.f4156o0, j16, c1532j.f4157p0, c1532j.f4159r0.f4365a, c1532j.f4127E0, c1538pM2348d, c1532j.f4158q0);
                    } else {
                        c1537o2.f4182f = c1538pM2348d;
                        c1537o2.f4191o = j16;
                    }
                    C1537O c1537o9 = c1539q5.f4211k;
                    if (c1537o9 == null) {
                        c1539q5.f4209i = c1537o2;
                        c1539q5.f4210j = c1537o2;
                    } else if (c1537o2 != c1537o9.f4188l) {
                        c1537o9.m2334b();
                        c1537o9.f4188l = c1537o2;
                        c1537o9.m2335c();
                    }
                    c1539q5.f4213m = null;
                    c1539q5.f4211k = c1537o2;
                    c1539q5.f4212l++;
                    c1539q5.m2354j();
                    c1537o2.f4177a.mo4920f(this, c1538pM2348d.f4193b);
                    if (this.f4126D0.f4209i == c1537o2) {
                        m2274E(c1538pM2348d.f4193b);
                    }
                    z14 = false;
                    m2313k(false);
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (this.f4139Q0) {
                this.f4139Q0 = m2319p();
                m2302e0();
            } else {
                m2321s();
            }
            C1539Q c1539q6 = this.f4126D0;
            C1537O c1537o10 = c1539q6.f4210j;
            if (c1537o10 == null) {
                z15 = z14;
                break;
            }
            C1537O c1537o11 = c1537o10.f4188l;
            AbstractC1554d[] abstractC1554dArr3 = this.f4147Y;
            if (c1537o11 != null && !this.f4136N0) {
                if (!c1537o10.f4180d) {
                    z15 = z14;
                    break;
                }
                ?? r6 = z14;
                while (true) {
                    if (r6 >= abstractC1554dArr3.length) {
                        C1537O c1537o12 = c1537o10.f4188l;
                        if (c1537o12.f4180d || this.f4148Y0 >= c1537o12.m2337e()) {
                            C4932s c4932s = c1537o10.f4190n;
                            C1537O c1537o13 = c1539q6.f4210j;
                            AbstractC20800b.m21321i(c1537o13);
                            c1539q6.f4210j = c1537o13.f4188l;
                            c1539q6.m2354j();
                            C1537O c1537o14 = c1539q6.f4210j;
                            AbstractC20800b.m21321i(c1537o14);
                            C4932s c4932s2 = c1537o14.f4190n;
                            AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
                            C4932s c4932s3 = c4932s;
                            z15 = false;
                            m2310i0(abstractC19764N, c1537o14.f4182f.f4192a, abstractC19764N, c1537o10.f4182f.f4192a, -9223372036854775807L, false);
                            if (c1537o14.f4180d && c1537o14.f4177a.mo4922i() != -9223372036854775807L) {
                                long jM2337e = c1537o14.m2337e();
                                for (AbstractC1554d abstractC1554d : abstractC1554dArr3) {
                                    if (abstractC1554d.f4303u0 != null) {
                                        m2268O(abstractC1554d, jM2337e);
                                    }
                                }
                                if (!c1537o14.m2338f()) {
                                    c1539q6.m2355k(c1537o14);
                                    m2313k(false);
                                    m2321s();
                                    break;
                                }
                                break;
                            }
                            int i15 = 0;
                            while (i15 < abstractC1554dArr3.length) {
                                C4932s c4932s4 = c4932s3;
                                boolean zM5542b = c4932s4.m5542b(i15);
                                boolean zM5542b2 = c4932s2.m5542b(i15);
                                if (zM5542b && !abstractC1554dArr3[i15].f4308z0) {
                                    boolean z17 = this.f4156o0[i15].f4296Z == -2;
                                    C1559f0 c1559f0 = c4932s4.f16097b[i15];
                                    C1559f0 c1559f1 = c4932s2.f16097b[i15];
                                    if (!zM5542b2 || !c1559f1.equals(c1559f0) || z17) {
                                        m2268O(abstractC1554dArr3[i15], c1537o14.m2337e());
                                    }
                                }
                                i15++;
                                c4932s3 = c4932s4;
                            }
                            break;
                        }
                    } else {
                        AbstractC1554d abstractC1554d2 = abstractC1554dArr3[r6];
                        InterfaceC4220U interfaceC4220U2 = c1537o10.f4179c[r6];
                        if (abstractC1554d2.f4303u0 == interfaceC4220U2) {
                            if (interfaceC4220U2 != null && !abstractC1554d2.m2393j()) {
                                C1537O c1537o15 = c1537o10.f4188l;
                                if (!c1537o10.f4182f.f4197f || !c1537o15.f4180d || (!(abstractC1554d2 instanceof C4537e) && !(abstractC1554d2 instanceof C3613b) && abstractC1554d2.f4307y0 < c1537o15.m2337e())) {
                                }
                            }
                            r6++;
                        }
                    }
                    z15 = z14;
                    break;
                }
            }
            z15 = z14;
            if (c1537o10.f4182f.f4200i || this.f4136N0) {
                for (?? r10 = z15; r10 < abstractC1554dArr3.length; r10++) {
                    AbstractC1554d abstractC1554d3 = abstractC1554dArr3[r10];
                    InterfaceC4220U interfaceC4220U3 = c1537o10.f4179c[r10];
                    if (interfaceC4220U3 != null && abstractC1554d3.f4303u0 == interfaceC4220U3 && abstractC1554d3.m2393j()) {
                        long j18 = c1537o10.f4182f.f4196e;
                        m2268O(abstractC1554d3, (j18 == -9223372036854775807L || j18 == Long.MIN_VALUE) ? -9223372036854775807L : c1537o10.f4191o + j18);
                    }
                }
            }
            long j19 = -9223372036854775807L;
            C1539Q c1539q7 = this.f4126D0;
            C1537O c1537o16 = c1539q7.f4210j;
            if (c1537o16 != null && c1539q7.f4209i != c1537o16 && !c1537o16.f4183g) {
                ?? r11 = c1537o16.f4190n;
                boolean z18 = z15;
                ?? r12 = z18;
                while (true) {
                    abstractC1554dArr2 = this.f4147Y;
                    if (r12 >= abstractC1554dArr2.length) {
                        break;
                    }
                    AbstractC1554d abstractC1554d4 = abstractC1554dArr2[r12];
                    if (m2269q(abstractC1554d4)) {
                        InterfaceC4220U interfaceC4220U4 = abstractC1554d4.f4303u0;
                        InterfaceC4220U[] interfaceC4220UArr = c1537o16.f4179c;
                        boolean z19 = interfaceC4220U4 != interfaceC4220UArr[r12] ? true : z15;
                        if (!r11.m5542b(r12) || z19) {
                            if (!abstractC1554d4.f4308z0) {
                                ?? r13 = r11.f16098c[r12];
                                int length = r13 != 0 ? r13.length() : z15;
                                C19788o[] c19788oArr = new C19788o[length];
                                for (?? r14 = z15; r14 < length; r14++) {
                                    c19788oArr[r14] = r13.mo4906c(r14);
                                }
                                abstractC1554d4.m2406w(c19788oArr, interfaceC4220UArr[r12], c1537o16.m2337e(), c1537o16.f4191o, c1537o16.f4182f.f4192a);
                                boolean z20 = this.f4144V0;
                                if (z20 && z20) {
                                    this.f4144V0 = z15;
                                    if (this.f4132J0.f4265p) {
                                        this.f4161t0.m21379e(2);
                                    }
                                }
                            } else if (abstractC1554d4.mo2394k()) {
                                m2297c(abstractC1554d4);
                            } else {
                                z18 = true;
                            }
                        }
                    }
                    r12++;
                }
                if (!z18) {
                    m2301e(new boolean[abstractC1554dArr2.length], this.f4126D0.f4210j.m2337e());
                }
            }
            boolean z21 = z15;
            while (m2292Z() && !this.f4136N0 && (c1537o3 = (c1539q = this.f4126D0).f4209i) != null && (c1537o4 = c1537o3.f4188l) != null && this.f4148Y0 >= c1537o4.m2337e() && c1537o4.f4183g) {
                if (z21) {
                    m2322t();
                }
                C1537O c1537oM2345a = c1539q.m2345a();
                c1537oM2345a.getClass();
                if (this.f4132J0.f4251b.f13895a.equals(c1537oM2345a.f4182f.f4192a.f13895a)) {
                    C4253y c4253y = this.f4132J0.f4251b;
                    if (c4253y.f13896b == -1) {
                        C4253y c4253y2 = c1537oM2345a.f4182f.f4192a;
                        if (c4253y2.f13896b != -1 || c4253y.f13899e == c4253y2.f13899e) {
                            z16 = z15;
                        } else {
                            z16 = true;
                        }
                    } else {
                        z16 = z15;
                    }
                } else {
                    z16 = z15;
                }
                C1538P c1538p2 = c1537oM2345a.f4182f;
                C4253y c4253y3 = c1538p2.f4192a;
                long j20 = c1538p2.f4193b;
                long j21 = j19;
                this.f4132J0 = m2318o(c4253y3, j20, c1538p2.f4194c, j20, !z16, 0);
                m2273D();
                m2308h0();
                if (this.f4132J0.f4254e == 3) {
                    m2296b0();
                }
                C4932s c4932s5 = c1539q.f4209i.f4190n;
                int i16 = 0;
                while (true) {
                    AbstractC1554d[] abstractC1554dArr4 = this.f4147Y;
                    if (i16 < abstractC1554dArr4.length) {
                        if (c4932s5.m5542b(i16)) {
                            abstractC1554dArr4[i16].mo2390c();
                        }
                        i16++;
                    }
                }
                j19 = j21;
                z21 = true;
                z15 = false;
            }
            j10 = j19;
            this.f4155e1.getClass();
        }
        int i17 = this.f4132J0.f4254e;
        if (i17 == 1 || i17 == 4) {
            return;
        }
        C1537O c1537o17 = this.f4126D0.f4209i;
        if (c1537o17 == null) {
            m2276I(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        m2308h0();
        if (c1537o17.f4180d) {
            this.f4124B0.getClass();
            this.f4150Z0 = AbstractC20817s.m21390D(SystemClock.elapsedRealtime());
            c1537o17.f4177a.mo4919e(this.f4132J0.f4268s - this.f4166y0);
            z6 = true;
            z10 = true;
            int i18 = 0;
            while (true) {
                AbstractC1554d[] abstractC1554dArr5 = this.f4147Y;
                if (i18 >= abstractC1554dArr5.length) {
                    break;
                }
                AbstractC1554d abstractC1554d5 = abstractC1554dArr5[i18];
                if (m2269q(abstractC1554d5)) {
                    abstractC1554d5.mo2405v(this.f4148Y0, this.f4150Z0);
                    boolean z22 = z10 && abstractC1554d5.mo2394k();
                    boolean z23 = c1537o17.f4179c[i18] != abstractC1554d5.f4303u0;
                    boolean z24 = z23 || (!z23 && abstractC1554d5.m2393j()) || abstractC1554d5.mo2395l() || abstractC1554d5.mo2394k();
                    z6 = z6 && z24;
                    if (!z24) {
                        InterfaceC4220U interfaceC4220U5 = abstractC1554d5.f4303u0;
                        interfaceC4220U5.getClass();
                        interfaceC4220U5.mo4942b();
                    }
                    z10 = z22;
                }
                i18++;
            }
        } else {
            c1537o17.f4177a.mo4917c();
            z6 = true;
            z10 = true;
        }
        long j22 = c1537o17.f4182f.f4196e;
        boolean z25 = z10 && c1537o17.f4180d && (j22 == j10 || j22 <= this.f4132J0.f4268s);
        if (z25 && this.f4136N0) {
            this.f4136N0 = false;
            m2285S(this.f4132J0.f4263n, 5, false, false);
        }
        if (!z25 || !c1537o17.f4182f.f4200i) {
            C1547Z c1547z4 = this.f4132J0;
            if (c1547z4.f4254e != 2) {
                z11 = true;
                if (this.f4132J0.f4254e == 3 && (this.f4145W0 != 0 ? !z6 : !m2320r())) {
                    m2312j0(m2292Z(), false);
                    m2291Y(2);
                    if (this.f4137O0) {
                        for (c1537o = this.f4126D0.f4209i; c1537o != null; c1537o = c1537o.f4188l) {
                            for (InterfaceC4930q interfaceC4930q : c1537o.f4190n.f16098c) {
                                if (interfaceC4930q != null) {
                                    interfaceC4930q.mo4914k();
                                }
                            }
                        }
                        c1560g = this.f4128F0;
                        j11 = c1560g.f4348h;
                        if (j11 != -9223372036854775807L) {
                            long j23 = j11 + c1560g.f4342b;
                            c1560g.f4348h = j23;
                            j12 = c1560g.f4347g;
                            if (j12 != -9223372036854775807L && j23 > j12) {
                                c1560g.f4348h = j12;
                            }
                            c1560g.f4352l = -9223372036854775807L;
                        }
                    }
                    m2300d0();
                }
            } else {
                if (this.f4145W0 == 0) {
                    zM2320r = m2320r();
                } else if (z6) {
                    if (c1547z4.f4256g) {
                        C1539Q c1539q8 = this.f4126D0;
                        long j24 = m2294a0(c1547z4.f4250a, c1539q8.f4209i.f4182f.f4192a) ? this.f4128F0.f4348h : j10;
                        C1537O c1537o18 = c1539q8.f4211k;
                        boolean z26 = c1537o18.m2338f() && c1537o18.f4182f.f4200i;
                        boolean z27 = c1537o18.f4182f.f4192a.m5017b() && !c1537o18.f4180d;
                        if (!z26 && !z27) {
                            C1547Z c1547z5 = this.f4132J0;
                            AbstractC19764N abstractC19764N2 = c1547z5.f4250a;
                            long j25 = c1547z5.f4266q;
                            C1537O c1537o19 = this.f4126D0.f4211k;
                            long jMax = c1537o19 == null ? 0L : Math.max(0L, j25 - (this.f4148Y0 - c1537o19.f4191o));
                            float f10 = this.f4167z0.mo2332g().f62564a;
                            boolean z28 = this.f4132J0.f4261l;
                            boolean z29 = this.f4137O0;
                            C1564i c1564i = this.f4159r0;
                            c1564i.getClass();
                            if (f10 != 1.0f) {
                                jMax = Math.round(jMax / ((double) f10));
                            }
                            long jMin = z29 ? c1564i.f4369e : c1564i.f4368d;
                            if (j24 != -9223372036854775807L) {
                                jMin = Math.min(j24 / 2, jMin);
                            }
                            if (jMin > 0 && jMax < jMin) {
                                C5285e c5285e = c1564i.f4365a;
                                synchronized (c5285e) {
                                    i11 = c5285e.f17406d * c5285e.f17404b;
                                }
                                if (i11 < c1564i.m2427b()) {
                                    zM2320r = false;
                                }
                            }
                        }
                    }
                    zM2320r = true;
                } else {
                    zM2320r = false;
                }
                if (zM2320r) {
                    m2291Y(3);
                    this.f4153c1 = null;
                    if (m2292Z()) {
                        m2312j0(false, false);
                        C1565j c1565j = this.f4167z0;
                        z11 = true;
                        c1565j.f4375Z = true;
                        ((C1563h0) c1565j.f4376o0).m2425b();
                        m2296b0();
                    }
                } else {
                    z11 = true;
                    if (this.f4132J0.f4254e == 3) {
                        m2312j0(m2292Z(), false);
                        m2291Y(2);
                        if (this.f4137O0) {
                            while (c1537o != null) {
                                while (i10 < r4) {
                                    if (interfaceC4930q != null) {
                                        interfaceC4930q.mo4914k();
                                    }
                                }
                            }
                            c1560g = this.f4128F0;
                            j11 = c1560g.f4348h;
                            if (j11 != -9223372036854775807L) {
                                long j26 = j11 + c1560g.f4342b;
                                c1560g.f4348h = j26;
                                j12 = c1560g.f4347g;
                                if (j12 != -9223372036854775807L) {
                                    c1560g.f4348h = j12;
                                }
                                c1560g.f4352l = -9223372036854775807L;
                            }
                        }
                        m2300d0();
                    }
                }
            }
            if (this.f4132J0.f4254e == 2) {
                i13 = 0;
                while (true) {
                    abstractC1554dArr = this.f4147Y;
                    if (i13 < abstractC1554dArr.length) {
                        break;
                    }
                    if (!m2269q(abstractC1554dArr[i13]) && (interfaceC4220U = this.f4147Y[i13].f4303u0) == c1537o17.f4179c[i13]) {
                        interfaceC4220U.getClass();
                        interfaceC4220U.mo4942b();
                    }
                    i13++;
                }
                c1547z2 = this.f4132J0;
                if (c1547z2.f4256g && c1547z2.f4267r < 500000 && m2319p()) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (!z12) {
                this.f4154d1 = -9223372036854775807L;
            } else if (this.f4154d1 == -9223372036854775807L) {
                this.f4124B0.getClass();
                this.f4154d1 = SystemClock.elapsedRealtime();
            } else {
                this.f4124B0.getClass();
                if (SystemClock.elapsedRealtime() - this.f4154d1 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            if (m2292Z() || this.f4132J0.f4254e != 3) {
                z13 = false;
            } else {
                z13 = z11;
            }
            if (this.f4144V0 || !this.f4143U0 || !z13) {
                z11 = false;
            }
            c1547z = this.f4132J0;
            if (c1547z.f4265p != z11) {
                this.f4132J0 = new C1547Z(c1547z.f4250a, c1547z.f4251b, c1547z.f4252c, c1547z.f4253d, c1547z.f4254e, c1547z.f4255f, c1547z.f4256g, c1547z.f4257h, c1547z.f4258i, c1547z.f4259j, c1547z.f4260k, c1547z.f4261l, c1547z.f4262m, c1547z.f4263n, c1547z.f4264o, c1547z.f4266q, c1547z.f4267r, c1547z.f4268s, c1547z.f4269t, z11);
            }
            this.f4143U0 = false;
            if (!z11 && (i12 = this.f4132J0.f4254e) != 4 && (z13 || i12 == 2 || (i12 == 3 && this.f4145W0 != 0))) {
                m2276I(jUptimeMillis);
            }
            Trace.endSection();
        }
        m2291Y(4);
        m2300d0();
        z11 = true;
        if (this.f4132J0.f4254e == 2) {
            i13 = 0;
            while (true) {
                abstractC1554dArr = this.f4147Y;
                if (i13 < abstractC1554dArr.length) {
                    break;
                    break;
                } else {
                    if (!m2269q(abstractC1554dArr[i13])) {
                    }
                    i13++;
                }
            }
            c1547z2 = this.f4132J0;
            if (c1547z2.f4256g) {
                z12 = false;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (!z12) {
            this.f4154d1 = -9223372036854775807L;
        } else if (this.f4154d1 == -9223372036854775807L) {
            this.f4124B0.getClass();
            this.f4154d1 = SystemClock.elapsedRealtime();
        } else {
            this.f4124B0.getClass();
            if (SystemClock.elapsedRealtime() - this.f4154d1 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (m2292Z()) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (this.f4144V0) {
            z11 = false;
        } else {
            z11 = false;
        }
        c1547z = this.f4132J0;
        if (c1547z.f4265p != z11) {
            this.f4132J0 = new C1547Z(c1547z.f4250a, c1547z.f4251b, c1547z.f4252c, c1547z.f4253d, c1547z.f4254e, c1547z.f4255f, c1547z.f4256g, c1547z.f4257h, c1547z.f4258i, c1547z.f4259j, c1547z.f4260k, c1547z.f4261l, c1547z.f4262m, c1547z.f4263n, c1547z.f4264o, c1547z.f4266q, c1547z.f4267r, c1547z.f4268s, c1547z.f4269t, z11);
        }
        this.f4143U0 = false;
        if (!z11) {
            m2276I(jUptimeMillis);
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2300d0() {
        int i10;
        C1565j c1565j = this.f4167z0;
        c1565j.f4375Z = false;
        C1563h0 c1563h0 = (C1563h0) c1565j.f4376o0;
        if (c1563h0.f4362o0) {
            c1563h0.m2424a(c1563h0.mo2330e());
            c1563h0.f4362o0 = false;
        }
        for (AbstractC1554d abstractC1554d : this.f4147Y) {
            if (m2269q(abstractC1554d) && (i10 = abstractC1554d.f4302t0) == 2) {
                AbstractC20800b.m21320h(i10 == 2);
                abstractC1554d.f4302t0 = 1;
                abstractC1554d.mo2402s();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX INFO: renamed from: e */
    public final void m2301e(boolean[] zArr, long j10) throws C1567l {
        AbstractC1554d[] abstractC1554dArr;
        Set set;
        int i10;
        C1537O c1537o;
        C4932s c4932s;
        Set set2;
        InterfaceC1536N interfaceC1536N;
        C1539Q c1539q = this.f4126D0;
        C1537O c1537o2 = c1539q.f4210j;
        C4932s c4932s2 = c1537o2.f4190n;
        int i11 = 0;
        while (true) {
            abstractC1554dArr = this.f4147Y;
            int length = abstractC1554dArr.length;
            set = this.f4149Z;
            if (i11 >= length) {
                break;
            }
            if (!c4932s2.m5542b(i11) && set.remove(abstractC1554dArr[i11])) {
                abstractC1554dArr[i11].m2407x();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < abstractC1554dArr.length) {
            if (c4932s2.m5542b(i12)) {
                boolean z6 = zArr[i12];
                AbstractC1554d abstractC1554d = abstractC1554dArr[i12];
                if (m2269q(abstractC1554d)) {
                    i10 = i12;
                    c1539q = c1539q;
                    c1537o = c1537o2;
                    c4932s = c4932s2;
                    set2 = set;
                } else {
                    C1537O c1537o3 = c1539q.f4210j;
                    boolean z10 = c1537o3 == c1539q.f4209i;
                    C4932s c4932s3 = c1537o3.f4190n;
                    C1559f0 c1559f0 = c4932s3.f16097b[i12];
                    InterfaceC4930q interfaceC4930q = c4932s3.f16098c[i12];
                    int length2 = interfaceC4930q != null ? interfaceC4930q.length() : 0;
                    C19788o[] c19788oArr = new C19788o[length2];
                    c4932s = c4932s2;
                    for (int i13 = 0; i13 < length2; i13++) {
                        c19788oArr[i13] = interfaceC4930q.mo4906c(i13);
                    }
                    boolean z11 = m2292Z() && this.f4132J0.f4254e == 3;
                    boolean z12 = !z6 && z11;
                    this.f4145W0++;
                    set.add(abstractC1554d);
                    InterfaceC4220U interfaceC4220U = c1537o3.f4179c[i12];
                    c1537o = c1537o2;
                    boolean z13 = z11;
                    long j11 = c1537o3.f4191o;
                    C1538P c1538p = c1537o3.f4182f;
                    AbstractC20800b.m21320h(abstractC1554d.f4302t0 == 0);
                    abstractC1554d.f4298p0 = c1559f0;
                    abstractC1554d.f4302t0 = 1;
                    abstractC1554d.mo2397n(z12, z10);
                    boolean z14 = z10;
                    i10 = i12;
                    set2 = set;
                    abstractC1554d.m2406w(c19788oArr, interfaceC4220U, j10, j11, c1538p.f4192a);
                    abstractC1554d.f4308z0 = false;
                    abstractC1554d.f4306x0 = j10;
                    abstractC1554d.f4307y0 = j10;
                    abstractC1554d.mo2398o(j10, z12);
                    abstractC1554d.mo2224a(11, new C1527E(this));
                    C1565j c1565j = this.f4167z0;
                    c1565j.getClass();
                    InterfaceC1536N interfaceC1536NMo2391h = abstractC1554d.mo2391h();
                    if (interfaceC1536NMo2391h != null && interfaceC1536NMo2391h != (interfaceC1536N = (InterfaceC1536N) c1565j.f4379r0)) {
                        if (interfaceC1536N != null) {
                            throw new C1567l(2, 1000, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        c1565j.f4379r0 = interfaceC1536NMo2391h;
                        c1565j.f4378q0 = abstractC1554d;
                        ((C2271L) interfaceC1536NMo2391h).mo2329d((C19757G) ((C1563h0) c1565j.f4376o0).f4364q0);
                    }
                    if (z13 && z14) {
                        AbstractC20800b.m21320h(abstractC1554d.f4302t0 == 1);
                        abstractC1554d.f4302t0 = 2;
                        abstractC1554d.mo2401r();
                    }
                }
            } else {
                i10 = i12;
                c1539q = c1539q;
                c1537o = c1537o2;
                c4932s = c4932s2;
                set2 = set;
            }
            i12 = i10 + 1;
            set = set2;
            c1539q = c1539q;
            c4932s2 = c4932s;
            c1537o2 = c1537o;
        }
        c1537o2.f4183g = true;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [J3.V, java.lang.Object] */
    /* JADX INFO: renamed from: e0 */
    public final void m2302e0() {
        C1537O c1537o = this.f4126D0.f4211k;
        boolean z6 = this.f4139Q0 || (c1537o != null && c1537o.f4177a.mo4921g());
        C1547Z c1547z = this.f4132J0;
        if (z6 != c1547z.f4256g) {
            this.f4132J0 = new C1547Z(c1547z.f4250a, c1547z.f4251b, c1547z.f4252c, c1547z.f4253d, c1547z.f4254e, c1547z.f4255f, z6, c1547z.f4257h, c1547z.f4258i, c1547z.f4259j, c1547z.f4260k, c1547z.f4261l, c1547z.f4262m, c1547z.f4263n, c1547z.f4264o, c1547z.f4266q, c1547z.f4267r, c1547z.f4268s, c1547z.f4269t, c1547z.f4265p);
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m2303f(AbstractC19764N abstractC19764N, Object obj, long j10) {
        C19762L c19762l = this.f4165x0;
        int i10 = abstractC19764N.mo2416g(obj, c19762l).f62579c;
        C19763M c19763m = this.f4164w0;
        abstractC19764N.m20727n(i10, c19763m);
        if (c19763m.f62590e == -9223372036854775807L || !c19763m.m20722a() || !c19763m.f62593h) {
            return -9223372036854775807L;
        }
        long j11 = c19763m.f62591f;
        return AbstractC20817s.m21390D((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - c19763m.f62590e) - (j10 + c19762l.f62581e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f0 */
    public final void m2304f0(C4932s c4932s) {
        AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
        InterfaceC4930q[] interfaceC4930qArr = c4932s.f16098c;
        C1564i c1564i = this.f4159r0;
        C1562h c1562h = (C1562h) c1564i.f4372h.get(this.f4130H0);
        c1562h.getClass();
        int iMax = c1564i.f4370f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                AbstractC1554d[] abstractC1554dArr = this.f4147Y;
                int i12 = 13107200;
                if (i10 < abstractC1554dArr.length) {
                    if (interfaceC4930qArr[i10] != null) {
                        switch (abstractC1554dArr[i10].f4296Z) {
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        c1562h.f4359b = iMax;
        c1564i.m2429d();
    }

    /* JADX INFO: renamed from: g */
    public final Pair m2305g(AbstractC19764N abstractC19764N) {
        long j10 = 0;
        if (abstractC19764N.m20728p()) {
            return Pair.create(C1547Z.f4249u, 0L);
        }
        Pair pairM20725i = abstractC19764N.m20725i(this.f4164w0, this.f4165x0, abstractC19764N.mo2412a(this.f4141S0), -9223372036854775807L);
        C4253y c4253yM2356m = this.f4126D0.m2356m(abstractC19764N, pairM20725i.first, 0L);
        long jLongValue = ((Long) pairM20725i.second).longValue();
        if (c4253yM2356m.m5017b()) {
            Object obj = c4253yM2356m.f13895a;
            C19762L c19762l = this.f4165x0;
            abstractC19764N.mo2416g(obj, c19762l);
            if (c4253yM2356m.f13897c == c19762l.m20718e(c4253yM2356m.f13896b)) {
                c19762l.f62583g.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(c4253yM2356m, Long.valueOf(j10));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2306g0(List list, int i10, int i11) {
        this.f4133K0.m2263f(1);
        C1546Y c1546y = this.f4127E0;
        c1546y.getClass();
        ArrayList arrayList = (ArrayList) c1546y.f4239c;
        AbstractC20800b.m21316d(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        AbstractC20800b.m21316d(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((C1545X) arrayList.get(i12)).f4232a.mo4935r((C19797x) list.get(i12 - i10));
        }
        m2315l(c1546y.m2363c(), false);
    }

    @Override // p232J3.InterfaceC4250v
    /* JADX INFO: renamed from: h */
    public final void mo2307h(InterfaceC4221V interfaceC4221V) {
        this.f4161t0.m21376a(9, (InterfaceC4251w) interfaceC4221V).m21374b();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Type inference failed for: r1v35, types: [J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: h0 */
    public final void m2308h0() {
        C19757G c19757gMo2332g;
        C1537O c1537o = this.f4126D0.f4209i;
        if (c1537o == null) {
            return;
        }
        long jMo4922i = c1537o.f4180d ? c1537o.f4177a.mo4922i() : -9223372036854775807L;
        if (jMo4922i != -9223372036854775807L) {
            if (!c1537o.m2338f()) {
                this.f4126D0.m2355k(c1537o);
                m2313k(false);
                m2321s();
            }
            m2274E(jMo4922i);
            if (jMo4922i != this.f4132J0.f4268s) {
                C1547Z c1547z = this.f4132J0;
                this.f4132J0 = m2318o(c1547z.f4251b, jMo4922i, c1547z.f4252c, jMo4922i, true, 5);
            }
        } else {
            C1565j c1565j = this.f4167z0;
            boolean z6 = c1537o != this.f4126D0.f4210j;
            AbstractC1554d abstractC1554d = (AbstractC1554d) c1565j.f4378q0;
            C1563h0 c1563h0 = (C1563h0) c1565j.f4376o0;
            if (abstractC1554d == null || abstractC1554d.mo2394k() || ((z6 && ((AbstractC1554d) c1565j.f4378q0).f4302t0 != 2) || (!((AbstractC1554d) c1565j.f4378q0).mo2395l() && (z6 || ((AbstractC1554d) c1565j.f4378q0).m2393j())))) {
                c1565j.f4374Y = true;
                if (c1565j.f4375Z) {
                    c1563h0.m2425b();
                }
            } else {
                InterfaceC1536N interfaceC1536N = (InterfaceC1536N) c1565j.f4379r0;
                interfaceC1536N.getClass();
                long jMo2330e = interfaceC1536N.mo2330e();
                if (!c1565j.f4374Y) {
                    c1563h0.m2424a(jMo2330e);
                    c19757gMo2332g = interfaceC1536N.mo2332g();
                    if (!c19757gMo2332g.equals((C19757G) c1563h0.f4364q0)) {
                        c1563h0.mo2329d(c19757gMo2332g);
                        ((C1532J) c1565j.f4377p0).f4161t0.m21376a(16, c19757gMo2332g).m21374b();
                    }
                } else if (jMo2330e >= c1563h0.mo2330e()) {
                    c1565j.f4374Y = false;
                    if (c1565j.f4375Z) {
                        c1563h0.m2425b();
                    }
                    c1563h0.m2424a(jMo2330e);
                    c19757gMo2332g = interfaceC1536N.mo2332g();
                    if (!c19757gMo2332g.equals((C19757G) c1563h0.f4364q0)) {
                        c1563h0.mo2329d(c19757gMo2332g);
                        ((C1532J) c1565j.f4377p0).f4161t0.m21376a(16, c19757gMo2332g).m21374b();
                    }
                } else if (c1563h0.f4362o0) {
                    c1563h0.m2424a(c1563h0.mo2330e());
                    c1563h0.f4362o0 = false;
                }
            }
            long jMo2330e2 = c1565j.mo2330e();
            this.f4148Y0 = jMo2330e2;
            long j10 = jMo2330e2 - c1537o.f4191o;
            long j11 = this.f4132J0.f4268s;
            if (!this.f4123A0.isEmpty() && !this.f4132J0.f4251b.m5017b()) {
                if (this.f4152b1) {
                    this.f4152b1 = false;
                }
                C1547Z c1547z2 = this.f4132J0;
                c1547z2.f4250a.mo2413b(c1547z2.f4251b.f13895a);
                int iMin = Math.min(this.f4151a1, this.f4123A0.size());
                if (iMin > 0 && this.f4123A0.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f4123A0.size() && this.f4123A0.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.f4151a1 = iMin;
            }
            if (this.f4167z0.mo2331f()) {
                boolean z10 = !this.f4133K0.f4111e;
                C1547Z c1547z3 = this.f4132J0;
                this.f4132J0 = m2318o(c1547z3.f4251b, j10, c1547z3.f4252c, j10, z10, 6);
            } else {
                C1547Z c1547z4 = this.f4132J0;
                c1547z4.f4268s = j10;
                c1547z4.f4269t = SystemClock.elapsedRealtime();
            }
        }
        this.f4132J0.f4266q = this.f4126D0.f4211k.m2336d();
        C1547Z c1547z5 = this.f4132J0;
        long j12 = c1547z5.f4266q;
        C1537O c1537o2 = this.f4126D0.f4211k;
        c1547z5.f4267r = c1537o2 == null ? 0L : Math.max(0L, j12 - (this.f4148Y0 - c1537o2.f4191o));
        C1547Z c1547z6 = this.f4132J0;
        if (c1547z6.f4261l && c1547z6.f4254e == 3 && m2294a0(c1547z6.f4250a, c1547z6.f4251b)) {
            C1547Z c1547z7 = this.f4132J0;
            float f10 = 1.0f;
            if (c1547z7.f4264o.f62564a == 1.0f) {
                C1560g c1560g = this.f4128F0;
                long jM2303f = m2303f(c1547z7.f4250a, c1547z7.f4251b.f13895a, c1547z7.f4268s);
                long j13 = this.f4132J0.f4266q;
                C1537O c1537o3 = this.f4126D0.f4211k;
                long jMax = c1537o3 == null ? 0L : Math.max(0L, j13 - (this.f4148Y0 - c1537o3.f4191o));
                if (c1560g.f4343c != -9223372036854775807L) {
                    long j14 = jM2303f - jMax;
                    long j15 = c1560g.f4353m;
                    if (j15 == -9223372036854775807L) {
                        c1560g.f4353m = j14;
                        c1560g.f4354n = 0L;
                    } else {
                        long jMax2 = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        c1560g.f4353m = jMax2;
                        c1560g.f4354n = (long) ((9.999871E-4f * Math.abs(j14 - jMax2)) + (0.999f * c1560g.f4354n));
                    }
                    if (c1560g.f4352l == -9223372036854775807L || SystemClock.elapsedRealtime() - c1560g.f4352l >= 1000) {
                        c1560g.f4352l = SystemClock.elapsedRealtime();
                        long j16 = (c1560g.f4354n * 3) + c1560g.f4353m;
                        if (c1560g.f4348h > j16) {
                            float fM21390D = AbstractC20817s.m21390D(1000L);
                            long[] jArr = {j16, c1560g.f4345e, c1560g.f4348h - (((long) ((c1560g.f4351k - 1.0f) * fM21390D)) + ((long) ((c1560g.f4349i - 1.0f) * fM21390D)))};
                            long j17 = jArr[0];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j18 = jArr[i10];
                                if (j18 > j17) {
                                    j17 = j18;
                                }
                            }
                            c1560g.f4348h = j17;
                        } else {
                            long jM21409j = AbstractC20817s.m21409j(jM2303f - ((long) (Math.max(0.0f, c1560g.f4351k - 1.0f) / 1.0E-7f)), c1560g.f4348h, j16);
                            c1560g.f4348h = jM21409j;
                            long j19 = c1560g.f4347g;
                            if (j19 != -9223372036854775807L && jM21409j > j19) {
                                c1560g.f4348h = j19;
                            }
                        }
                        long j20 = jM2303f - c1560g.f4348h;
                        if (Math.abs(j20) < c1560g.f4341a) {
                            c1560g.f4351k = 1.0f;
                        } else {
                            c1560g.f4351k = AbstractC20817s.m21407h((1.0E-7f * j20) + 1.0f, c1560g.f4350j, c1560g.f4349i);
                        }
                        f10 = c1560g.f4351k;
                    } else {
                        f10 = c1560g.f4351k;
                    }
                }
                if (this.f4167z0.mo2332g().f62564a != f10) {
                    C19757G c19757g = new C19757G(f10, this.f4132J0.f4264o.f62565b);
                    this.f4161t0.m21378d(16);
                    this.f4167z0.mo2329d(c19757g);
                    m2317n(this.f4132J0.f4264o, this.f4167z0.mo2332g().f62564a, false, false);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        boolean z6;
        C1537O c1537o;
        int i11;
        C1537O c1537o2;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    m2285S(i13 >> 4, i13 & 15, z10, true);
                    break;
                case 2:
                    m2299d();
                    break;
                case 3:
                    m2278K((C1531I) message.obj);
                    break;
                case 4:
                    m2286T((C19757G) message.obj);
                    break;
                case 5:
                    this.f4131I0 = (C1561g0) message.obj;
                    break;
                case 6:
                    m2298c0(false, true);
                    break;
                case 7:
                    m2327y();
                    return true;
                case 8:
                    m2316m((InterfaceC4251w) message.obj);
                    break;
                case 9:
                    m2309i((InterfaceC4251w) message.obj);
                    break;
                case 10:
                    m2271B();
                    break;
                case 11:
                    m2288V(message.arg1);
                    break;
                case 12:
                    m2289W(message.arg1 != 0);
                    break;
                case 13:
                    m2282P((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case 14:
                    C1553c0 c1553c0 = (C1553c0) message.obj;
                    c1553c0.getClass();
                    m2280M(c1553c0);
                    break;
                case 15:
                    m2281N((C1553c0) message.obj);
                    break;
                case 16:
                    C19757G c19757g = (C19757G) message.obj;
                    m2317n(c19757g, c19757g.f62564a, true, false);
                    break;
                case 17:
                    m2283Q((C1528F) message.obj);
                    break;
                case 18:
                    m2293a((C1528F) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC0168G.m507B(message.obj);
                    m2324v();
                    throw null;
                case 20:
                    m2270A(message.arg1, message.arg2, (C4222W) message.obj);
                    break;
                case 21:
                    m2290X((C4222W) message.obj);
                    break;
                case 22:
                    m2323u();
                    break;
                case 23:
                    m2284R(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m2271B();
                    m2277J(true);
                    break;
                case 26:
                    m2271B();
                    m2277J(true);
                    break;
                case 27:
                    m2306g0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    m2287U((C1573r) message.obj);
                    break;
                case 29:
                    m2325w();
                    break;
            }
        } catch (C1567l e10) {
            e = e10;
            int i14 = e.f4383o0;
            C1539Q c1539q = this.f4126D0;
            if (i14 == 1 && (c1537o2 = c1539q.f4210j) != null) {
                e = new C1567l(e.getMessage(), e.getCause(), e.f62561Y, e.f4383o0, e.f4384p0, e.f4385q0, e.f4386r0, e.f4387s0, c1537o2.f4182f.f4192a, e.f62562Z, e.f4389u0);
            }
            if (e.f4389u0 && (this.f4153c1 == null || (i11 = e.f62561Y) == 5004 || i11 == 5003)) {
                AbstractC20800b.m21333u("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C1567l c1567l = this.f4153c1;
                if (c1567l != null) {
                    c1567l.addSuppressed(e);
                    e = this.f4153c1;
                } else {
                    this.f4153c1 = e;
                }
                C20815q c20815q = this.f4161t0;
                C20814p c20814pM21376a = c20815q.m21376a(25, e);
                c20815q.getClass();
                Message message2 = c20814pM21376a.f66099a;
                message2.getClass();
                c20815q.f66101a.sendMessageAtFrontOfQueue(message2);
                c20814pM21376a.m21373a();
                z6 = true;
            } else {
                C1567l c1567l2 = this.f4153c1;
                if (c1567l2 != null) {
                    c1567l2.addSuppressed(e);
                    e = this.f4153c1;
                }
                AbstractC20800b.m21325m("ExoPlayerImplInternal", "Playback error", e);
                if (e.f4383o0 == 1) {
                    if (c1539q.f4209i != c1539q.f4210j) {
                        while (true) {
                            c1537o = c1539q.f4209i;
                            if (c1537o == c1539q.f4210j) {
                                break;
                            }
                            c1539q.m2345a();
                        }
                        c1537o.getClass();
                        m2322t();
                        C1538P c1538p = c1537o.f4182f;
                        C4253y c4253y = c1538p.f4192a;
                        long j10 = c1538p.f4193b;
                        this.f4132J0 = m2318o(c4253y, j10, c1538p.f4194c, j10, true, 0);
                    }
                    z6 = true;
                } else {
                    z6 = true;
                }
                m2298c0(z6, false);
                this.f4132J0 = this.f4132J0.m2377e(e);
            }
        } catch (C2656b e11) {
            m2311j(e11.f8166Y, e11);
        } catch (RuntimeException e12) {
            C1567l c1567l3 = new C1567l(2, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1000, e12);
            AbstractC20800b.m21325m("ExoPlayerImplInternal", "Playback error", c1567l3);
            m2298c0(true, false);
            this.f4132J0 = this.f4132J0.m2377e(c1567l3);
        } catch (C19755E e13) {
            boolean z11 = e13.f62559Y;
            int i15 = e13.f62560Z;
            if (i15 == 1) {
                i10 = z11 ? 3001 : 3003;
            } else {
                if (i15 == 4) {
                    i10 = z11 ? 3002 : 3004;
                }
                m2311j(i12, e13);
            }
            i12 = i10;
            m2311j(i12, e13);
        } catch (C21741i e14) {
            m2311j(e14.f68963Y, e14);
        } catch (IOException e15) {
            m2311j(2000, e15);
        }
        z6 = true;
        m2322t();
        return z6;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [J3.V, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public final void m2309i(InterfaceC4251w interfaceC4251w) {
        C1537O c1537o = this.f4126D0.f4211k;
        if (c1537o == null || c1537o.f4177a != interfaceC4251w) {
            return;
        }
        long j10 = this.f4148Y0;
        if (c1537o != null) {
            AbstractC20800b.m21320h(c1537o.f4188l == null);
            if (c1537o.f4180d) {
                c1537o.f4177a.mo4928p(j10 - c1537o.f4191o);
            }
        }
        m2321s();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2310i0(AbstractC19764N abstractC19764N, C4253y c4253y, AbstractC19764N abstractC19764N2, C4253y c4253y2, long j10, boolean z6) {
        if (!m2294a0(abstractC19764N, c4253y)) {
            C19757G c19757g = c4253y.m5017b() ? C19757G.f62563d : this.f4132J0.f4264o;
            C1565j c1565j = this.f4167z0;
            if (c1565j.mo2332g().equals(c19757g)) {
                return;
            }
            this.f4161t0.m21378d(16);
            c1565j.mo2329d(c19757g);
            m2317n(this.f4132J0.f4264o, c19757g.f62564a, false, false);
            return;
        }
        Object obj = c4253y.f13895a;
        C19762L c19762l = this.f4165x0;
        int i10 = abstractC19764N.mo2416g(obj, c19762l).f62579c;
        C19763M c19763m = this.f4164w0;
        abstractC19764N.m20727n(i10, c19763m);
        C19793t c19793t = c19763m.f62594i;
        C1560g c1560g = this.f4128F0;
        c1560g.getClass();
        c1560g.f4343c = AbstractC20817s.m21390D(c19793t.f62774a);
        c1560g.f4346f = AbstractC20817s.m21390D(c19793t.f62775b);
        c1560g.f4347g = AbstractC20817s.m21390D(c19793t.f62776c);
        float f10 = c19793t.f62777d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        c1560g.f4350j = f10;
        float f11 = c19793t.f62778e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        c1560g.f4349i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            c1560g.f4343c = -9223372036854775807L;
        }
        c1560g.m2423a();
        if (j10 != -9223372036854775807L) {
            c1560g.f4344d = m2303f(abstractC19764N, obj, j10);
            c1560g.m2423a();
            return;
        }
        if (!AbstractC20817s.m21400a(!abstractC19764N2.m20728p() ? abstractC19764N2.mo2411m(abstractC19764N2.mo2416g(c4253y2.f13895a, c19762l).f62579c, c19763m, 0L).f62586a : null, c19763m.f62586a) || z6) {
            c1560g.f4344d = -9223372036854775807L;
            c1560g.m2423a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2311j(int i10, IOException iOException) {
        C1567l c1567l = new C1567l(0, i10, iOException);
        C1537O c1537o = this.f4126D0.f4209i;
        if (c1537o != null) {
            C1538P c1538p = c1537o.f4182f;
            c1567l = new C1567l(c1567l.getMessage(), c1567l.getCause(), c1567l.f62561Y, c1567l.f4383o0, c1567l.f4384p0, c1567l.f4385q0, c1567l.f4386r0, c1567l.f4387s0, c1538p.f4192a, c1567l.f62562Z, c1567l.f4389u0);
        }
        AbstractC20800b.m21325m("ExoPlayerImplInternal", "Playback error", c1567l);
        m2298c0(false, false);
        this.f4132J0 = this.f4132J0.m2377e(c1567l);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2312j0(boolean z6, boolean z10) {
        long jElapsedRealtime;
        this.f4137O0 = z6;
        if (!z6 || z10) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f4124B0.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f4138P0 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: k */
    public final void m2313k(boolean z6) {
        C1537O c1537o = this.f4126D0.f4211k;
        C4253y c4253y = c1537o == null ? this.f4132J0.f4251b : c1537o.f4182f.f4192a;
        boolean zEquals = this.f4132J0.f4260k.equals(c4253y);
        if (!zEquals) {
            this.f4132J0 = this.f4132J0.m2374b(c4253y);
        }
        C1547Z c1547z = this.f4132J0;
        c1547z.f4266q = c1537o == null ? c1547z.f4268s : c1537o.m2336d();
        C1547Z c1547z2 = this.f4132J0;
        long j10 = c1547z2.f4266q;
        C1537O c1537o2 = this.f4126D0.f4211k;
        c1547z2.f4267r = c1537o2 != null ? Math.max(0L, j10 - (this.f4148Y0 - c1537o2.f4191o)) : 0L;
        if ((!zEquals || z6) && c1537o != null && c1537o.f4180d) {
            m2304f0(c1537o.f4190n);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final synchronized void m2314k0(C1568m c1568m, long j10) {
        this.f4124B0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z6 = false;
        while (!((Boolean) c1568m.get()).booleanValue() && j10 > 0) {
            try {
                this.f4124B0.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z6 = true;
            }
            this.f4124B0.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: l */
    public final void m2315l(p1016t3.AbstractC19764N r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p057C3.C1532J.m2315l(t3.N, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public final void m2316m(InterfaceC4251w interfaceC4251w) throws C1567l {
        C1539Q c1539q = this.f4126D0;
        C1537O c1537o = c1539q.f4211k;
        if (c1537o == null || c1537o.f4177a != interfaceC4251w) {
            return;
        }
        float f10 = this.f4167z0.mo2332g().f62564a;
        AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
        c1537o.f4180d = true;
        c1537o.f4189m = c1537o.f4177a.mo4924k();
        C4932s c4932sM2340h = c1537o.m2340h(f10, abstractC19764N);
        C1538P c1538p = c1537o.f4182f;
        long j10 = c1538p.f4196e;
        long j11 = c1538p.f4193b;
        long jM2333a = c1537o.m2333a(c4932sM2340h, (j10 == -9223372036854775807L || j11 < j10) ? j11 : Math.max(0L, j10 - 1), false, new boolean[c1537o.f4185i.length]);
        long j12 = c1537o.f4191o;
        C1538P c1538p2 = c1537o.f4182f;
        c1537o.f4191o = (c1538p2.f4193b - jM2333a) + j12;
        c1537o.f4182f = c1538p2.m2343b(jM2333a);
        m2304f0(c1537o.f4190n);
        if (c1537o == c1539q.f4209i) {
            m2274E(c1537o.f4182f.f4193b);
            m2301e(new boolean[this.f4147Y.length], c1539q.f4210j.m2337e());
            C1547Z c1547z = this.f4132J0;
            C4253y c4253y = c1547z.f4251b;
            long j13 = c1537o.f4182f.f4193b;
            this.f4132J0 = m2318o(c4253y, j13, c1547z.f4252c, j13, false, 5);
        }
        m2321s();
    }

    /* JADX INFO: renamed from: n */
    public final void m2317n(C19757G c19757g, float f10, boolean z6, boolean z10) {
        int i10;
        C1532J c1532j = this;
        if (z6) {
            if (z10) {
                c1532j.f4133K0.m2263f(1);
            }
            C1547Z c1547z = c1532j.f4132J0;
            c1532j = this;
            c1532j.f4132J0 = new C1547Z(c1547z.f4250a, c1547z.f4251b, c1547z.f4252c, c1547z.f4253d, c1547z.f4254e, c1547z.f4255f, c1547z.f4256g, c1547z.f4257h, c1547z.f4258i, c1547z.f4259j, c1547z.f4260k, c1547z.f4261l, c1547z.f4262m, c1547z.f4263n, c19757g, c1547z.f4266q, c1547z.f4267r, c1547z.f4268s, c1547z.f4269t, c1547z.f4265p);
        }
        float f11 = c19757g.f62564a;
        C1537O c1537o = c1532j.f4126D0.f4209i;
        while (true) {
            i10 = 0;
            if (c1537o == null) {
                break;
            }
            InterfaceC4930q[] interfaceC4930qArr = c1537o.f4190n.f16098c;
            int length = interfaceC4930qArr.length;
            while (i10 < length) {
                InterfaceC4930q interfaceC4930q = interfaceC4930qArr[i10];
                if (interfaceC4930q != null) {
                    interfaceC4930q.mo4912i(f11);
                }
                i10++;
            }
            c1537o = c1537o.f4188l;
        }
        AbstractC1554d[] abstractC1554dArr = c1532j.f4147Y;
        int length2 = abstractC1554dArr.length;
        while (i10 < length2) {
            AbstractC1554d abstractC1554d = abstractC1554dArr[i10];
            if (abstractC1554d != null) {
                abstractC1554d.mo2408y(f10, c19757g.f62564a);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final C1547Z m2318o(C4253y c4253y, long j10, long j11, long j12, boolean z6, int i10) {
        C4227a0 c4227a0;
        C4932s c4932s;
        List list;
        C11294T c11294tM12768j;
        boolean z10;
        int i11;
        int i12;
        this.f4152b1 = (!this.f4152b1 && j10 == this.f4132J0.f4268s && c4253y.equals(this.f4132J0.f4251b)) ? false : true;
        m2273D();
        C1547Z c1547z = this.f4132J0;
        C4227a0 c4227a1 = c1547z.f4257h;
        C4932s c4932s2 = c1547z.f4258i;
        List list2 = c1547z.f4259j;
        if (this.f4127E0.f4237a) {
            C1537O c1537o = this.f4126D0.f4209i;
            C4227a0 c4227a2 = c1537o == null ? C4227a0.f13814d : c1537o.f4189m;
            C4932s c4932s3 = c1537o == null ? this.f4158q0 : c1537o.f4190n;
            InterfaceC4930q[] interfaceC4930qArr = c4932s3.f16098c;
            C11333z c11333z = new C11333z(4);
            int length = interfaceC4930qArr.length;
            int i13 = 0;
            boolean z11 = false;
            while (i13 < length) {
                InterfaceC4930q interfaceC4930q = interfaceC4930qArr[i13];
                if (interfaceC4930q == null) {
                    i12 = 1;
                } else {
                    C19753C c19753c = interfaceC4930q.mo4906c(0).f62750k;
                    if (c19753c == null) {
                        c11333z.m12762a(new C19753C(new InterfaceC19752B[0]));
                        i12 = 1;
                    } else {
                        c11333z.m12762a(c19753c);
                        i12 = 1;
                        z11 = true;
                    }
                }
                i13 += i12;
            }
            if (z11) {
                c11294tM12768j = c11333z.m12768j();
            } else {
                C11276A c11276a = AbstractC11278C.f34162Z;
                c11294tM12768j = C11294T.f34185q0;
            }
            if (c1537o != null) {
                C1538P c1538p = c1537o.f4182f;
                if (c1538p.f4194c != j11) {
                    c1537o.f4182f = c1538p.m2342a(j11);
                }
            }
            C1537O c1537o2 = this.f4126D0.f4209i;
            if (c1537o2 != null) {
                C4932s c4932s4 = c1537o2.f4190n;
                boolean z12 = false;
                int i14 = 0;
                while (true) {
                    AbstractC1554d[] abstractC1554dArr = this.f4147Y;
                    if (i14 >= abstractC1554dArr.length) {
                        z10 = true;
                        break;
                    }
                    if (c4932s4.m5542b(i14)) {
                        i11 = 1;
                        if (abstractC1554dArr[i14].f4296Z != 1) {
                            z10 = false;
                            break;
                        }
                        if (c4932s4.f16097b[i14].f4339a != 0) {
                            z12 = true;
                        }
                    } else {
                        i11 = 1;
                    }
                    i14 += i11;
                }
                boolean z13 = z12 && z10;
                if (z13 != this.f4144V0) {
                    this.f4144V0 = z13;
                    if (!z13 && this.f4132J0.f4265p) {
                        this.f4161t0.m21379e(2);
                    }
                }
            }
            list = c11294tM12768j;
            c4227a0 = c4227a2;
            c4932s = c4932s3;
        } else if (c4253y.equals(c1547z.f4251b)) {
            c4227a0 = c4227a1;
            c4932s = c4932s2;
            list = list2;
        } else {
            c4227a0 = C4227a0.f13814d;
            c4932s = this.f4158q0;
            list = C11294T.f34185q0;
        }
        if (z6) {
            C1529G c1529g = this.f4133K0;
            if (!c1529g.f4111e || c1529g.f4109c == 5) {
                c1529g.f4110d = true;
                c1529g.f4111e = true;
                c1529g.f4109c = i10;
            } else {
                AbstractC20800b.m21316d(i10 == 5);
            }
        }
        C1547Z c1547z2 = this.f4132J0;
        long j13 = c1547z2.f4266q;
        C1537O c1537o3 = this.f4126D0.f4211k;
        return c1547z2.m2375c(c4253y, j10, j11, j12, c1537o3 == null ? 0L : Math.max(0L, j13 - (this.f4148Y0 - c1537o3.f4191o)), c4227a0, c4932s, list);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [J3.V, J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final boolean m2319p() {
        C1537O c1537o = this.f4126D0.f4211k;
        if (c1537o == null) {
            return false;
        }
        try {
            ?? r6 = c1537o.f4177a;
            if (c1537o.f4180d) {
                for (InterfaceC4220U interfaceC4220U : c1537o.f4179c) {
                    if (interfaceC4220U != null) {
                        interfaceC4220U.mo4942b();
                    }
                }
            } else {
                r6.mo4917c();
            }
            return (!c1537o.f4180d ? 0L : r6.mo4916a()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2320r() {
        C1537O c1537o = this.f4126D0.f4209i;
        long j10 = c1537o.f4182f.f4196e;
        return c1537o.f4180d && (j10 == -9223372036854775807L || this.f4132J0.f4268s < j10 || !m2292Z());
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [J3.V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [J3.V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: s */
    public final void m2321s() {
        boolean zM2428c;
        if (m2319p()) {
            C1537O c1537o = this.f4126D0.f4211k;
            long jMo4916a = !c1537o.f4180d ? 0L : c1537o.f4177a.mo4916a();
            C1537O c1537o2 = this.f4126D0.f4211k;
            long jMax = c1537o2 == null ? 0L : Math.max(0L, jMo4916a - (this.f4148Y0 - c1537o2.f4191o));
            C1537O c1537o3 = this.f4126D0.f4209i;
            long j10 = m2294a0(this.f4132J0.f4250a, c1537o.f4182f.f4192a) ? this.f4128F0.f4348h : -9223372036854775807L;
            C1875m c1875m = this.f4130H0;
            AbstractC19764N abstractC19764N = this.f4132J0.f4250a;
            float f10 = this.f4167z0.mo2332g().f62564a;
            boolean z6 = this.f4132J0.f4261l;
            C1533K c1533k = new C1533K(c1875m, jMax, f10, this.f4137O0, j10);
            zM2428c = this.f4159r0.m2428c(c1533k);
            C1537O c1537o4 = this.f4126D0.f4209i;
            if (!zM2428c && c1537o4.f4180d && jMax < 500000 && this.f4166y0 > 0) {
                c1537o4.f4177a.mo4919e(this.f4132J0.f4268s);
                zM2428c = this.f4159r0.m2428c(c1533k);
            }
        } else {
            zM2428c = false;
        }
        this.f4139Q0 = zM2428c;
        if (zM2428c) {
            C1537O c1537o5 = this.f4126D0.f4211k;
            long j11 = this.f4148Y0;
            float f11 = this.f4167z0.mo2332g().f62564a;
            long j12 = this.f4138P0;
            AbstractC20800b.m21320h(c1537o5.f4188l == null);
            long j13 = j11 - c1537o5.f4191o;
            ?? r6 = c1537o5.f4177a;
            C1534L c1534l = new C1534L();
            c1534l.f4172b = -3.4028235E38f;
            c1534l.f4173c = -9223372036854775807L;
            c1534l.f4171a = j13;
            AbstractC20800b.m21316d(f11 > 0.0f || f11 == -3.4028235E38f);
            c1534l.f4172b = f11;
            AbstractC20800b.m21316d(j12 >= 0 || j12 == -9223372036854775807L);
            c1534l.f4173c = j12;
            r6.mo4923j(new C1535M(c1534l));
        }
        m2302e0();
    }

    /* JADX INFO: renamed from: t */
    public final void m2322t() {
        C1529G c1529g = this.f4133K0;
        C1547Z c1547z = this.f4132J0;
        boolean z6 = c1529g.f4110d | (((C1547Z) c1529g.f4112f) != c1547z);
        c1529g.f4110d = z6;
        c1529g.f4112f = c1547z;
        if (z6) {
            C1526D c1526d = this.f4125C0.f4421Y;
            c1526d.f4097v0.m21377c(new RunnableC0074m(c1526d, 10, c1529g));
            this.f4133K0 = new C1529G(this.f4132J0);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2323u() {
        m2315l(this.f4127E0.m2363c(), true);
    }

    /* JADX INFO: renamed from: v */
    public final void m2324v() {
        this.f4133K0.m2263f(1);
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final void m2325w() {
        this.f4133K0.m2263f(1);
        int i10 = 0;
        m2272C(false, false, false, true);
        C1564i c1564i = this.f4159r0;
        c1564i.getClass();
        long id2 = Thread.currentThread().getId();
        long j10 = c1564i.f4373i;
        AbstractC20800b.m21319g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        c1564i.f4373i = id2;
        HashMap map = c1564i.f4372h;
        C1875m c1875m = this.f4130H0;
        if (!map.containsKey(c1875m)) {
            map.put(c1875m, new C1562h());
        }
        C1562h c1562h = (C1562h) map.get(c1875m);
        c1562h.getClass();
        int i11 = c1564i.f4370f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        c1562h.f4359b = i11;
        c1562h.f4358a = false;
        m2291Y(this.f4132J0.f4250a.m20728p() ? 4 : 2);
        C5287g c5287g = (C5287g) this.f4160s0;
        c5287g.getClass();
        C1546Y c1546y = this.f4127E0;
        AbstractC20800b.m21320h(!c1546y.f4237a);
        c1546y.f4248l = c5287g;
        while (true) {
            ArrayList arrayList = (ArrayList) c1546y.f4239c;
            if (i10 >= arrayList.size()) {
                c1546y.f4237a = true;
                this.f4161t0.m21379e(2);
                return;
            } else {
                C1545X c1545x = (C1545X) arrayList.get(i10);
                c1546y.m2367g(c1545x);
                ((HashSet) c1546y.f4244h).add(c1545x);
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final synchronized boolean m2326x() {
        if (!this.f4134L0 && this.f4163v0.getThread().isAlive()) {
            this.f4161t0.m21379e(7);
            m2314k0(new C1568m(this, 2), this.f4129G0);
            return this.f4134L0;
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m2327y() {
        try {
            m2272C(true, false, true, false);
            m2328z();
            C1564i c1564i = this.f4159r0;
            if (c1564i.f4372h.remove(this.f4130H0) != null) {
                c1564i.m2429d();
            }
            if (c1564i.f4372h.isEmpty()) {
                c1564i.f4373i = -1L;
            }
            m2291Y(1);
            HandlerThread handlerThread = this.f4162u0;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f4134L0 = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            HandlerThread handlerThread2 = this.f4162u0;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f4134L0 = true;
                notifyAll();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2328z() {
        for (int i10 = 0; i10 < this.f4147Y.length; i10++) {
            AbstractC1554d abstractC1554d = this.f4156o0[i10];
            synchronized (abstractC1554d.f4295Y) {
                abstractC1554d.f4294C0 = null;
            }
            AbstractC1554d abstractC1554d2 = this.f4147Y[i10];
            AbstractC20800b.m21320h(abstractC1554d2.f4302t0 == 0);
            abstractC1554d2.mo2399p();
        }
    }
}
