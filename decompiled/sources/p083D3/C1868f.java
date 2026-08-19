package p083D3;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import bb.C11299Y;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p001A.C0017I0;
import p001A.C0030P;
import p001A.C0072l;
import p001A.C0100z;
import p057C3.C1526D;
import p057C3.C1567l;
import p057C3.C1579x;
import p057C3.C1580y;
import p1016t3.AbstractC19756F;
import p1016t3.AbstractC19764N;
import p1016t3.C19751A;
import p1016t3.C19753C;
import p1016t3.C19757G;
import p1016t3.C19758H;
import p1016t3.C19760J;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19770U;
import p1016t3.C19773X;
import p1016t3.C19797x;
import p1016t3.InterfaceC19759I;
import p1053v3.C20422c;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p1073w3.C20815q;
import p1073w3.InterfaceC20806h;
import p133F3.InterfaceC2659e;
import p228J.AbstractC3812N;
import p232J3.C4244p;
import p232J3.C4249u;
import p232J3.C4253y;
import p232J3.InterfaceC4203C;
import p607Yo.C10115d;

/* JADX INFO: renamed from: D3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1868f implements InterfaceC19759I, InterfaceC4203C, InterfaceC2659e {

    /* JADX INFO: renamed from: Y */
    public final C20813o f5364Y;

    /* JADX INFO: renamed from: Z */
    public final C19762L f5365Z;

    /* JADX INFO: renamed from: o0 */
    public final C19763M f5366o0;

    /* JADX INFO: renamed from: p0 */
    public final C0017I0 f5367p0;

    /* JADX INFO: renamed from: q0 */
    public final SparseArray f5368q0;

    /* JADX INFO: renamed from: r0 */
    public C10115d f5369r0;

    /* JADX INFO: renamed from: s0 */
    public AbstractC3812N f5370s0;

    /* JADX INFO: renamed from: t0 */
    public C20815q f5371t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f5372u0;

    public C1868f(C20813o c20813o) {
        c20813o.getClass();
        this.f5364Y = c20813o;
        int i10 = AbstractC20817s.f66106a;
        Looper looperMyLooper = Looper.myLooper();
        this.f5369r0 = new C10115d(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, c20813o, new C1865c(0));
        C19762L c19762l = new C19762L();
        this.f5365Z = c19762l;
        this.f5366o0 = new C19763M();
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f64Y = c19762l;
        C11276A c11276a = AbstractC11278C.f34162Z;
        c0017i0.f65Z = C11294T.f34185q0;
        c0017i0.f66o0 = C11299Y.f34197s0;
        this.f5367p0 = c0017i0;
        this.f5368q0 = new SparseArray();
    }

    /* JADX INFO: renamed from: A */
    public final C1863a m2745A(AbstractC19764N abstractC19764N, int i10, C4253y c4253y) {
        C4253y c4253y2 = abstractC19764N.m20728p() ? null : c4253y;
        this.f5364Y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = abstractC19764N.equals(((C1526D) this.f5370s0).m2239Y()) && i10 == ((C1526D) this.f5370s0).m2236V();
        long jM21399M = 0;
        if (c4253y2 == null || !c4253y2.m5017b()) {
            if (z6) {
                C1526D c1526d = (C1526D) this.f5370s0;
                c1526d.m2256q0();
                jM21399M = c1526d.m2233S(c1526d.f4087k1);
            } else if (!abstractC19764N.m20728p()) {
                jM21399M = AbstractC20817s.m21399M(abstractC19764N.mo2411m(i10, this.f5366o0, 0L).f62596k);
            }
        } else if (z6 && ((C1526D) this.f5370s0).m2234T() == c4253y2.f13896b && ((C1526D) this.f5370s0).m2235U() == c4253y2.f13897c) {
            jM21399M = ((C1526D) this.f5370s0).m2237W();
        }
        C4253y c4253y3 = (C4253y) this.f5367p0.f67p0;
        AbstractC19764N abstractC19764NM2239Y = ((C1526D) this.f5370s0).m2239Y();
        int iM2236V = ((C1526D) this.f5370s0).m2236V();
        long jM2237W = ((C1526D) this.f5370s0).m2237W();
        C1526D c1526d2 = (C1526D) this.f5370s0;
        c1526d2.m2256q0();
        return new C1863a(jElapsedRealtime, abstractC19764N, i10, c4253y2, jM21399M, abstractC19764NM2239Y, iM2236V, c4253y3, jM2237W, AbstractC20817s.m21399M(c1526d2.f4087k1.f4267r));
    }

    /* JADX INFO: renamed from: B */
    public final C1863a m2746B(int i10, C4253y c4253y) {
        this.f5370s0.getClass();
        if (c4253y != null) {
            return ((AbstractC19764N) ((C11299Y) this.f5367p0.f66o0).get(c4253y)) != null ? m2778z(c4253y) : m2745A(AbstractC19764N.f62601a, i10, c4253y);
        }
        AbstractC19764N abstractC19764NM2239Y = ((C1526D) this.f5370s0).m2239Y();
        if (i10 >= abstractC19764NM2239Y.mo2420o()) {
            abstractC19764NM2239Y = AbstractC19764N.f62601a;
        }
        return m2745A(abstractC19764NM2239Y, i10, null);
    }

    /* JADX INFO: renamed from: C */
    public final C1863a m2747C() {
        return m2778z((C4253y) this.f5367p0.f69r0);
    }

    /* JADX INFO: renamed from: D */
    public final void m2748D(C1863a c1863a, int i10, InterfaceC20806h interfaceC20806h) {
        this.f5368q0.put(i10, c1863a);
        this.f5369r0.m10694e(i10, interfaceC20806h);
    }

    /* JADX INFO: renamed from: E */
    public final void m2749E(AbstractC3812N abstractC3812N, Looper looper) {
        AbstractC20800b.m21320h(this.f5370s0 == null || ((AbstractC11278C) this.f5367p0.f65Z).isEmpty());
        abstractC3812N.getClass();
        this.f5370s0 = abstractC3812N;
        this.f5371t0 = this.f5364Y.m21372a(looper, null);
        C10115d c10115d = this.f5369r0;
        this.f5369r0 = new C10115d((CopyOnWriteArraySet) c10115d.f29952f, looper, (C20813o) c10115d.f29949c, new C0100z(this, 6, abstractC3812N), c10115d.f29948b);
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: H */
    public final void mo2750H(int i10, C4253y c4253y, C4249u c4249u) {
        C1863a c1863aM2746B = m2746B(i10, c4253y);
        m2748D(c1863aM2746B, 1004, new C0100z(c1863aM2746B, 7, c4249u));
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: I */
    public final void mo2751I(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u, IOException iOException, boolean z6) {
        C1863a c1863aM2746B = m2746B(i10, c4253y);
        m2748D(c1863aM2746B, 1003, new C1865c(c1863aM2746B, c4244p, c4249u, iOException, z6));
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: L */
    public final void mo2752L(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        m2748D(m2746B(i10, c4253y), 1002, new C1865c(13));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: a */
    public final void mo2753a(int i10) {
        m2748D(m2777y(), 6, new C0030P(27));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: b */
    public final void mo2754b(C20422c c20422c) {
        m2748D(m2777y(), 27, new C0030P(22));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: c */
    public final void mo2755c(C19751A c19751a) {
        m2748D(m2777y(), 14, new C0030P(18));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: d */
    public final void mo2756d(C19753C c19753c) {
        m2748D(m2777y(), 28, new C1865c(9));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: e */
    public final void mo2757e(boolean z6) {
        m2748D(m2777y(), 3, new C0030P(19));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: f */
    public final void mo2758f(int i10, boolean z6) {
        m2748D(m2777y(), 5, new C0030P(29));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: g */
    public final void mo2759g(float f10) {
        m2748D(m2747C(), 22, new C0030P(24));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: h */
    public final void mo2760h(int i10) {
        m2748D(m2777y(), 4, new C1865c(2));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: i */
    public final void mo2761i(AbstractC19756F abstractC19756F) {
        C4253y c4253y;
        C1863a c1863aM2777y = (!(abstractC19756F instanceof C1567l) || (c4253y = ((C1567l) abstractC19756F).f4388t0) == null) ? m2777y() : m2778z(c4253y);
        m2748D(c1863aM2777y, 10, new C0072l(c1863aM2777y, 18, abstractC19756F));
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: j */
    public final void mo2762j(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        m2748D(m2746B(i10, c4253y), 1000, new C1865c(7));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: k */
    public final void mo2763k(int i10, C19760J c19760j, C19760J c19760j2) {
        if (i10 == 1) {
            this.f5372u0 = false;
        }
        AbstractC3812N abstractC3812N = this.f5370s0;
        abstractC3812N.getClass();
        C0017I0 c0017i0 = this.f5367p0;
        c0017i0.f67p0 = C0017I0.m60n(abstractC3812N, (AbstractC11278C) c0017i0.f65Z, (C4253y) c0017i0.f68q0, (C19762L) c0017i0.f64Y);
        C1863a c1863aM2777y = m2777y();
        m2748D(c1863aM2777y, 11, new C1866d(c1863aM2777y, i10, c19760j, c19760j2));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: l */
    public final void mo2764l(C19758H c19758h) {
        m2748D(m2777y(), 13, new C0030P(20));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: m */
    public final void mo2765m(C19773X c19773x) {
        C1863a c1863aM2747C = m2747C();
        m2748D(c1863aM2747C, 25, new C1580y(c1863aM2747C, c19773x));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: n */
    public final void mo2766n(C19757G c19757g) {
        m2748D(m2777y(), 12, new C0030P(16));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: o */
    public final void mo2767o(int i10) {
        AbstractC3812N abstractC3812N = this.f5370s0;
        abstractC3812N.getClass();
        C0017I0 c0017i0 = this.f5367p0;
        c0017i0.f67p0 = C0017I0.m60n(abstractC3812N, (AbstractC11278C) c0017i0.f65Z, (C4253y) c0017i0.f68q0, (C19762L) c0017i0.f64Y);
        c0017i0.m67F(((C1526D) abstractC3812N).m2239Y());
        m2748D(m2777y(), 0, new C0030P(21));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: p */
    public final void mo2768p(C19770U c19770u) {
        m2748D(m2777y(), 2, new C0030P(17));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: q */
    public final void mo2769q(AbstractC19756F abstractC19756F) {
        C4253y c4253y;
        m2748D((!(abstractC19756F instanceof C1567l) || (c4253y = ((C1567l) abstractC19756F).f4388t0) == null) ? m2777y() : m2778z(c4253y), 10, new C0030P(28));
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: r */
    public final void mo2770r(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        m2748D(m2746B(i10, c4253y), 1001, new C1865c(15));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: s */
    public final void mo2771s(boolean z6) {
        m2748D(m2747C(), 23, new C1865c(20));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: t */
    public final void mo2772t(List list) {
        C1863a c1863aM2777y = m2777y();
        m2748D(c1863aM2777y, 27, new C1579x(c1863aM2777y, list));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: u */
    public final void mo2773u(int i10, boolean z6) {
        m2748D(m2777y(), -1, new C0030P(25));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: v */
    public final void mo2774v(C19797x c19797x, int i10) {
        m2748D(m2777y(), 1, new C0030P(23));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: w */
    public final void mo2775w(int i10, int i11) {
        m2748D(m2747C(), 24, new C1865c(3));
    }

    @Override // p1016t3.InterfaceC19759I
    /* JADX INFO: renamed from: x */
    public final void mo2776x(boolean z6) {
        m2748D(m2777y(), 7, new C0030P(26));
    }

    /* JADX INFO: renamed from: y */
    public final C1863a m2777y() {
        return m2778z((C4253y) this.f5367p0.f67p0);
    }

    /* JADX INFO: renamed from: z */
    public final C1863a m2778z(C4253y c4253y) {
        this.f5370s0.getClass();
        AbstractC19764N abstractC19764N = c4253y == null ? null : (AbstractC19764N) ((C11299Y) this.f5367p0.f66o0).get(c4253y);
        if (c4253y != null && abstractC19764N != null) {
            return m2745A(abstractC19764N, abstractC19764N.mo2416g(c4253y.f13895a, this.f5365Z).f62579c, c4253y);
        }
        int iM2236V = ((C1526D) this.f5370s0).m2236V();
        AbstractC19764N abstractC19764NM2239Y = ((C1526D) this.f5370s0).m2239Y();
        if (iM2236V >= abstractC19764NM2239Y.mo2420o()) {
            abstractC19764NM2239Y = AbstractC19764N.f62601a;
        }
        return m2745A(abstractC19764NM2239Y, iM2236V, null);
    }
}
