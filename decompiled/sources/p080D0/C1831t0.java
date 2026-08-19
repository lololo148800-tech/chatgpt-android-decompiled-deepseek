package p080D0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20740b0;
import p1071w0.C20710G0;
import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3590f;
import p204I1.C3599o;
import p350O1.C6043A;
import p350O1.C6045C;
import p350O1.C6052a;
import p350O1.InterfaceC6060i;
import p350O1.InterfaceC6073v;
import p467T1.EnumC7198h;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9393x3;
import p759g1.C13801c;
import p759g1.C13803e;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: D0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1831t0 {

    /* JADX INFO: renamed from: a */
    public final C3590f f5282a;

    /* JADX INFO: renamed from: b */
    public final long f5283b;

    /* JADX INFO: renamed from: c */
    public final C3578I f5284c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6073v f5285d;

    /* JADX INFO: renamed from: e */
    public final C1766B0 f5286e;

    /* JADX INFO: renamed from: f */
    public long f5287f;

    /* JADX INFO: renamed from: g */
    public final C3590f f5288g;

    /* JADX INFO: renamed from: h */
    public final C6045C f5289h;

    /* JADX INFO: renamed from: i */
    public final C20710G0 f5290i;

    public C1831t0(C6045C c6045c, InterfaceC6073v interfaceC6073v, C20710G0 c20710g0, C1766B0 c1766b0) {
        C3590f c3590f = c6045c.f19682a;
        C3578I c3578i = c20710g0 != null ? c20710g0.f65650a : null;
        long j10 = c6045c.f19683b;
        this.f5282a = c3590f;
        this.f5283b = j10;
        this.f5284c = c3578i;
        this.f5285d = interfaceC6073v;
        this.f5286e = c1766b0;
        this.f5287f = j10;
        this.f5288g = c3590f;
        this.f5289h = c6045c;
        this.f5290i = c20710g0;
    }

    /* JADX INFO: renamed from: a */
    public final List m2655a(InterfaceC1436k interfaceC1436k) {
        if (!C3581L.m4267c(this.f5287f)) {
            return AbstractC17681o.m19382k(new C6052a("", 0), new C6043A(C3581L.m4270f(this.f5287f), C3581L.m4270f(this.f5287f)));
        }
        InterfaceC6060i interfaceC6060i = (InterfaceC6060i) interfaceC1436k.invoke(this);
        if (interfaceC6060i != null) {
            return AbstractC9393x3.m9974d(interfaceC6060i);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m2656b() {
        C3578I c3578i = this.f5284c;
        if (c3578i == null) {
            return null;
        }
        int iM4269e = C3581L.m4269e(this.f5287f);
        InterfaceC6073v interfaceC6073v = this.f5285d;
        return Integer.valueOf(interfaceC6073v.mo1765a(c3578i.m4256f(c3578i.m4257g(interfaceC6073v.mo1766b(iM4269e)), true)));
    }

    /* JADX INFO: renamed from: c */
    public final Integer m2657c() {
        C3578I c3578i = this.f5284c;
        if (c3578i == null) {
            return null;
        }
        int iM4270f = C3581L.m4270f(this.f5287f);
        InterfaceC6073v interfaceC6073v = this.f5285d;
        return Integer.valueOf(interfaceC6073v.mo1765a(c3578i.m4260j(c3578i.m4257g(interfaceC6073v.mo1766b(iM4270f)))));
    }

    /* JADX INFO: renamed from: d */
    public final Integer m2658d() {
        int length;
        C3578I c3578i = this.f5284c;
        if (c3578i == null) {
            return null;
        }
        int iM2671q = m2671q();
        while (true) {
            C3590f c3590f = this.f5282a;
            if (iM2671q < c3590f.f10934Y.length()) {
                int length2 = this.f5288g.f10934Y.length() - 1;
                if (iM2671q <= length2) {
                    length2 = iM2671q;
                }
                long jM4263m = c3578i.m4263m(length2);
                int i10 = C3581L.f10907c;
                int i11 = (int) (jM4263m & 4294967295L);
                if (i11 > iM2671q) {
                    length = this.f5285d.mo1765a(i11);
                    break;
                }
                iM2671q++;
            } else {
                length = c3590f.f10934Y.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: e */
    public final Integer m2659e() {
        int iMo1765a;
        C3578I c3578i = this.f5284c;
        if (c3578i == null) {
            return null;
        }
        for (int iM2671q = m2671q(); iM2671q > 0; iM2671q--) {
            int length = this.f5288g.f10934Y.length() - 1;
            if (iM2671q <= length) {
                length = iM2671q;
            }
            long jM4263m = c3578i.m4263m(length);
            int i10 = C3581L.f10907c;
            int i11 = (int) (jM4263m >> 32);
            if (i11 < iM2671q) {
                iMo1765a = this.f5285d.mo1765a(i11);
                return Integer.valueOf(iMo1765a);
            }
        }
        iMo1765a = 0;
        return Integer.valueOf(iMo1765a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2660f() {
        C3578I c3578i = this.f5284c;
        return (c3578i != null ? c3578i.m4261k(m2671q()) : null) != EnumC7198h.f22860Z;
    }

    /* JADX INFO: renamed from: g */
    public final int m2661g(C3578I c3578i, int i10) {
        int iM2671q = m2671q();
        C1766B0 c1766b0 = this.f5286e;
        if (c1766b0.f5041a == null) {
            c1766b0.f5041a = Float.valueOf(c3578i.m4253c(iM2671q).f43586a);
        }
        int iM4257g = c3578i.m4257g(iM2671q) + i10;
        if (iM4257g < 0) {
            return 0;
        }
        C3599o c3599o = c3578i.f10893b;
        if (iM4257g >= c3599o.f10963f) {
            return this.f5288g.f10934Y.length();
        }
        float fM4310b = c3599o.m4310b(iM4257g) - 1;
        Float f10 = c1766b0.f5041a;
        AbstractC16544l.m18091d(f10);
        float fFloatValue = f10.floatValue();
        if ((m2660f() && fFloatValue >= c3578i.m4259i(iM4257g)) || (!m2660f() && fFloatValue <= c3578i.m4258h(iM4257g))) {
            return c3578i.m4256f(iM4257g, true);
        }
        return this.f5285d.mo1765a(c3599o.m4313e(AbstractC8088f6.m8536b(f10.floatValue(), fM4310b)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    /* JADX INFO: renamed from: h */
    public final int m2662h(C20710G0 c20710g0, int i10) {
        C13801c c13801cMo21528y;
        InterfaceC21098s interfaceC21098s = c20710g0.f65651b;
        if (interfaceC21098s == null) {
            c13801cMo21528y = C13801c.f43585e;
        } else {
            InterfaceC21098s interfaceC21098s2 = c20710g0.f65652c;
            c13801cMo21528y = interfaceC21098s2 != null ? interfaceC21098s2.mo21528y(interfaceC21098s, true) : null;
            if (c13801cMo21528y == null) {
                c13801cMo21528y = C13801c.f43585e;
            }
        }
        long j10 = this.f5289h.f19683b;
        int i11 = C3581L.f10907c;
        InterfaceC6073v interfaceC6073v = this.f5285d;
        int iMo1766b = interfaceC6073v.mo1766b((int) (j10 & 4294967295L));
        C3578I c3578i = c20710g0.f65650a;
        C13801c c13801cM4253c = c3578i.m4253c(iMo1766b);
        return interfaceC6073v.mo1765a(c3578i.f10893b.m4313e(AbstractC8088f6.m8536b(c13801cM4253c.f43586a, (C13803e.m15331c(c13801cMo21528y.m15319f()) * i10) + c13801cM4253c.f43587b)));
    }

    /* JADX INFO: renamed from: i */
    public final void m2663i() {
        C3590f c3590f = this.f5288g;
        C1766B0 c1766b0 = this.f5286e;
        c1766b0.f5041a = null;
        if (c3590f.f10934Y.length() > 0) {
            if (m2660f()) {
                c1766b0.f5041a = null;
                if (c3590f.f10934Y.length() > 0) {
                    String str = c3590f.f10934Y;
                    long j10 = this.f5287f;
                    int i10 = C3581L.f10907c;
                    int iM21281v = AbstractC20740b0.m21281v((int) (j10 & 4294967295L), str);
                    if (iM21281v != -1) {
                        m2670p(iM21281v, iM21281v);
                        return;
                    }
                    return;
                }
                return;
            }
            c1766b0.f5041a = null;
            if (c3590f.f10934Y.length() > 0) {
                String str2 = c3590f.f10934Y;
                long j11 = this.f5287f;
                int i11 = C3581L.f10907c;
                int iM21278s = AbstractC20740b0.m21278s((int) (j11 & 4294967295L), str2);
                if (iM21278s != -1) {
                    m2670p(iM21278s, iM21278s);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2664j() {
        this.f5286e.f5041a = null;
        C3590f c3590f = this.f5288g;
        if (c3590f.f10934Y.length() > 0) {
            int iM4269e = C3581L.m4269e(this.f5287f);
            String str = c3590f.f10934Y;
            int iM21279t = AbstractC20740b0.m21279t(iM4269e, str);
            if (iM21279t == C3581L.m4269e(this.f5287f) && iM21279t != str.length()) {
                iM21279t = AbstractC20740b0.m21279t(iM21279t + 1, str);
            }
            m2670p(iM21279t, iM21279t);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2665k() {
        this.f5286e.f5041a = null;
        C3590f c3590f = this.f5288g;
        if (c3590f.f10934Y.length() > 0) {
            int iM4270f = C3581L.m4270f(this.f5287f);
            String str = c3590f.f10934Y;
            int iM21280u = AbstractC20740b0.m21280u(iM4270f, str);
            if (iM21280u == C3581L.m4270f(this.f5287f) && iM21280u != 0) {
                iM21280u = AbstractC20740b0.m21280u(iM21280u - 1, str);
            }
            m2670p(iM21280u, iM21280u);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2666l() {
        C3590f c3590f = this.f5288g;
        C1766B0 c1766b0 = this.f5286e;
        c1766b0.f5041a = null;
        if (c3590f.f10934Y.length() > 0) {
            if (m2660f()) {
                c1766b0.f5041a = null;
                if (c3590f.f10934Y.length() > 0) {
                    String str = c3590f.f10934Y;
                    long j10 = this.f5287f;
                    int i10 = C3581L.f10907c;
                    int iM21278s = AbstractC20740b0.m21278s((int) (j10 & 4294967295L), str);
                    if (iM21278s != -1) {
                        m2670p(iM21278s, iM21278s);
                        return;
                    }
                    return;
                }
                return;
            }
            c1766b0.f5041a = null;
            if (c3590f.f10934Y.length() > 0) {
                String str2 = c3590f.f10934Y;
                long j11 = this.f5287f;
                int i11 = C3581L.f10907c;
                int iM21281v = AbstractC20740b0.m21281v((int) (j11 & 4294967295L), str2);
                if (iM21281v != -1) {
                    m2670p(iM21281v, iM21281v);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2667m() {
        Integer numM2656b;
        this.f5286e.f5041a = null;
        if (this.f5288g.f10934Y.length() <= 0 || (numM2656b = m2656b()) == null) {
            return;
        }
        int iIntValue = numM2656b.intValue();
        m2670p(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: n */
    public final void m2668n() {
        Integer numM2657c;
        this.f5286e.f5041a = null;
        if (this.f5288g.f10934Y.length() <= 0 || (numM2657c = m2657c()) == null) {
            return;
        }
        int iIntValue = numM2657c.intValue();
        m2670p(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: o */
    public final void m2669o() {
        if (this.f5288g.f10934Y.length() > 0) {
            int i10 = C3581L.f10907c;
            this.f5287f = AbstractC8676n.m9365b((int) (this.f5283b >> 32), (int) (this.f5287f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2670p(int i10, int i11) {
        this.f5287f = AbstractC8676n.m9365b(i10, i11);
    }

    /* JADX INFO: renamed from: q */
    public final int m2671q() {
        long j10 = this.f5287f;
        int i10 = C3581L.f10907c;
        return this.f5285d.mo1766b((int) (j10 & 4294967295L));
    }
}
