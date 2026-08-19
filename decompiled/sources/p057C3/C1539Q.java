package p057C3;

import android.util.Pair;
import bb.AbstractC11278C;
import bb.C11333z;
import java.util.ArrayList;
import p001A.C0072l;
import p001A.RunnableC0066i;
import p083D3.C1868f;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19775b;
import p1073w3.AbstractC20800b;
import p1073w3.C20815q;
import p232J3.C4253y;

/* JADX INFO: renamed from: C3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1539Q {

    /* JADX INFO: renamed from: c */
    public final C1868f f4203c;

    /* JADX INFO: renamed from: d */
    public final C20815q f4204d;

    /* JADX INFO: renamed from: e */
    public final C0072l f4205e;

    /* JADX INFO: renamed from: f */
    public long f4206f;

    /* JADX INFO: renamed from: g */
    public int f4207g;

    /* JADX INFO: renamed from: h */
    public boolean f4208h;

    /* JADX INFO: renamed from: i */
    public C1537O f4209i;

    /* JADX INFO: renamed from: j */
    public C1537O f4210j;

    /* JADX INFO: renamed from: k */
    public C1537O f4211k;

    /* JADX INFO: renamed from: l */
    public int f4212l;

    /* JADX INFO: renamed from: m */
    public Object f4213m;

    /* JADX INFO: renamed from: n */
    public long f4214n;

    /* JADX INFO: renamed from: a */
    public final C19762L f4201a = new C19762L();

    /* JADX INFO: renamed from: b */
    public final C19763M f4202b = new C19763M();

    /* JADX INFO: renamed from: o */
    public ArrayList f4215o = new ArrayList();

    public C1539Q(C1868f c1868f, C20815q c20815q, C0072l c0072l, C1573r c1573r) {
        this.f4203c = c1868f;
        this.f4204d = c20815q;
        this.f4205e = c0072l;
    }

    /* JADX INFO: renamed from: l */
    public static C4253y m2344l(AbstractC19764N abstractC19764N, Object obj, long j10, long j11, C19763M c19763m, C19762L c19762l) {
        abstractC19764N.mo2416g(obj, c19762l);
        abstractC19764N.m20727n(c19762l.f62579c, c19763m);
        abstractC19764N.mo2413b(obj);
        int i10 = c19762l.f62583g.f62663a;
        if (i10 != 0) {
            if (i10 == 1) {
                c19762l.m20719f(0);
            }
            c19762l.f62583g.getClass();
            c19762l.m20720g(0);
        }
        abstractC19764N.mo2416g(obj, c19762l);
        int iM20716c = c19762l.m20716c(j10);
        return iM20716c == -1 ? new C4253y(obj, j11, c19762l.m20715b(j10)) : new C4253y(obj, iM20716c, c19762l.m20718e(iM20716c), j11, -1);
    }

    /* JADX INFO: renamed from: a */
    public final C1537O m2345a() {
        C1537O c1537o = this.f4209i;
        if (c1537o == null) {
            return null;
        }
        if (c1537o == this.f4210j) {
            this.f4210j = c1537o.f4188l;
        }
        c1537o.m2339g();
        int i10 = this.f4212l - 1;
        this.f4212l = i10;
        if (i10 == 0) {
            this.f4211k = null;
            C1537O c1537o2 = this.f4209i;
            this.f4213m = c1537o2.f4178b;
            this.f4214n = c1537o2.f4182f.f4192a.f13898d;
        }
        this.f4209i = this.f4209i.f4188l;
        m2354j();
        return this.f4209i;
    }

    /* JADX INFO: renamed from: b */
    public final void m2346b() {
        if (this.f4212l == 0) {
            return;
        }
        C1537O c1537o = this.f4209i;
        AbstractC20800b.m21321i(c1537o);
        this.f4213m = c1537o.f4178b;
        this.f4214n = c1537o.f4182f.f4192a.f13898d;
        while (c1537o != null) {
            c1537o.m2339g();
            c1537o = c1537o.f4188l;
        }
        this.f4209i = null;
        this.f4211k = null;
        this.f4210j = null;
        this.f4212l = 0;
        m2354j();
    }

    /* JADX INFO: renamed from: c */
    public final C1538P m2347c(AbstractC19764N abstractC19764N, C1537O c1537o, long j10) {
        C1538P c1538pM2350f;
        long j11;
        C1538P c1538p = c1537o.f4182f;
        long j12 = (c1537o.f4191o + c1538p.f4196e) - j10;
        if (c1538p.f4198g) {
            C1538P c1538p2 = c1537o.f4182f;
            C4253y c4253y = c1538p2.f4192a;
            int iM20724d = abstractC19764N.m20724d(abstractC19764N.mo2413b(c4253y.f13895a), this.f4201a, this.f4202b, this.f4207g, this.f4208h);
            if (iM20724d != -1) {
                C19762L c19762l = this.f4201a;
                int i10 = abstractC19764N.mo2410f(iM20724d, c19762l, true).f62579c;
                Object obj = c19762l.f62578b;
                obj.getClass();
                long jM2357n = c4253y.f13898d;
                long j13 = 0;
                if (abstractC19764N.mo2411m(i10, this.f4202b, 0L).f62598m == iM20724d) {
                    Pair pairM20726j = abstractC19764N.m20726j(this.f4202b, this.f4201a, i10, -9223372036854775807L, Math.max(0L, j12));
                    if (pairM20726j != null) {
                        obj = pairM20726j.first;
                        long jLongValue = ((Long) pairM20726j.second).longValue();
                        C1537O c1537o2 = c1537o.f4188l;
                        if (c1537o2 == null || !c1537o2.f4178b.equals(obj)) {
                            jM2357n = m2357n(obj);
                            if (jM2357n == -1) {
                                jM2357n = this.f4206f;
                                this.f4206f = 1 + jM2357n;
                            }
                        } else {
                            jM2357n = c1537o2.f4182f.f4192a.f13898d;
                        }
                        j11 = jLongValue;
                        j13 = -9223372036854775807L;
                    }
                } else {
                    j11 = 0;
                }
                C4253y c4253yM2344l = m2344l(abstractC19764N, obj, j11, jM2357n, this.f4202b, this.f4201a);
                if (j13 != -9223372036854775807L && c1538p2.f4194c != -9223372036854775807L) {
                    int i11 = abstractC19764N.mo2416g(c4253y.f13895a, c19762l).f62583g.f62663a;
                    c19762l.f62583g.getClass();
                    if (i11 > 0) {
                        c19762l.m20720g(0);
                    }
                }
                return m2348d(abstractC19764N, c4253yM2344l, j13, j11);
            }
            return null;
        }
        C4253y c4253y2 = c1538p.f4192a;
        Object obj2 = c4253y2.f13895a;
        C19762L c19762l2 = this.f4201a;
        abstractC19764N.mo2416g(obj2, c19762l2);
        boolean zM5017b = c4253y2.m5017b();
        Object obj3 = c4253y2.f13895a;
        if (zM5017b) {
            C19775b c19775b = c19762l2.f62583g;
            int i12 = c4253y2.f13896b;
            int i13 = c19775b.m20732a(i12).f62655a;
            if (i13 != -1) {
                int iM20731a = c19762l2.f62583g.m20732a(i12).m20731a(c4253y2.f13897c);
                if (iM20731a < i13) {
                    c1538pM2350f = m2349e(abstractC19764N, c4253y2.f13895a, i12, iM20731a, c1538p.f4194c, c4253y2.f13898d);
                } else {
                    long jLongValue2 = c1538p.f4194c;
                    if (jLongValue2 == -9223372036854775807L) {
                        Pair pairM20726j2 = abstractC19764N.m20726j(this.f4202b, c19762l2, c19762l2.f62579c, -9223372036854775807L, Math.max(0L, j12));
                        if (pairM20726j2 != null) {
                            jLongValue2 = ((Long) pairM20726j2.second).longValue();
                        }
                    }
                    abstractC19764N.mo2416g(obj3, c19762l2);
                    int i14 = c4253y2.f13896b;
                    c19762l2.m20717d(i14);
                    c19762l2.f62583g.m20732a(i14).getClass();
                    c1538pM2350f = m2350f(abstractC19764N, c4253y2.f13895a, Math.max(0L, jLongValue2), c1538p.f4194c, c4253y2.f13898d);
                }
            }
            return null;
        }
        int i15 = c4253y2.f13899e;
        if (i15 != -1) {
            c19762l2.m20719f(i15);
        }
        int iM20718e = c19762l2.m20718e(i15);
        c19762l2.m20720g(i15);
        if (iM20718e != c19762l2.f62583g.m20732a(i15).f62655a) {
            c1538pM2350f = m2349e(abstractC19764N, c4253y2.f13895a, c4253y2.f13899e, iM20718e, c1538p.f4196e, c4253y2.f13898d);
        } else {
            abstractC19764N.mo2416g(obj3, c19762l2);
            c19762l2.m20717d(i15);
            c19762l2.f62583g.m20732a(i15).getClass();
            c1538pM2350f = m2350f(abstractC19764N, c4253y2.f13895a, 0L, c1538p.f4196e, c4253y2.f13898d);
        }
        return c1538pM2350f;
    }

    /* JADX INFO: renamed from: d */
    public final C1538P m2348d(AbstractC19764N abstractC19764N, C4253y c4253y, long j10, long j11) {
        abstractC19764N.mo2416g(c4253y.f13895a, this.f4201a);
        if (!c4253y.m5017b()) {
            return m2350f(abstractC19764N, c4253y.f13895a, j11, j10, c4253y.f13898d);
        }
        return m2349e(abstractC19764N, c4253y.f13895a, c4253y.f13896b, c4253y.f13897c, j10, c4253y.f13898d);
    }

    /* JADX INFO: renamed from: e */
    public final C1538P m2349e(AbstractC19764N abstractC19764N, Object obj, int i10, int i11, long j10, long j11) {
        C4253y c4253y = new C4253y(obj, i10, i11, j11, -1);
        C19762L c19762l = this.f4201a;
        long jM20714a = abstractC19764N.mo2416g(obj, c19762l).m20714a(i10, i11);
        if (i11 == c19762l.m20718e(i10)) {
            c19762l.f62583g.getClass();
        }
        c19762l.m20720g(i10);
        return new C1538P(c4253y, (jM20714a == -9223372036854775807L || 0 < jM20714a) ? 0L : Math.max(0L, jM20714a - 1), j10, -9223372036854775807L, jM20714a, false, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final C1538P m2350f(AbstractC19764N abstractC19764N, Object obj, long j10, long j11, long j12) {
        long j13;
        C19762L c19762l = this.f4201a;
        abstractC19764N.mo2416g(obj, c19762l);
        int iM20715b = c19762l.m20715b(j10);
        if (iM20715b != -1) {
            c19762l.m20719f(iM20715b);
        }
        boolean z6 = false;
        if (iM20715b != -1) {
            c19762l.m20720g(iM20715b);
        } else if (c19762l.f62583g.f62663a > 0) {
            c19762l.m20720g(0);
        }
        C4253y c4253y = new C4253y(obj, j12, iM20715b);
        if (!c4253y.m5017b() && iM20715b == -1) {
            z6 = true;
        }
        boolean zM2353i = m2353i(abstractC19764N, c4253y);
        boolean zM2352h = m2352h(abstractC19764N, c4253y, z6);
        if (iM20715b != -1) {
            c19762l.m20720g(iM20715b);
        }
        if (iM20715b != -1) {
            c19762l.m20717d(iM20715b);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        long j14 = (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? c19762l.f62580d : j13;
        return new C1538P(c4253y, (j14 == -9223372036854775807L || j10 < j14) ? j10 : Math.max(0L, j14 - ((long) 1)), j11, j13, j14, false, z6, zM2353i, zM2352h);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX INFO: renamed from: g */
    public final C1538P m2351g(AbstractC19764N abstractC19764N, C1538P c1538p) {
        long j10;
        long jM20714a;
        long j11;
        C4253y c4253y = c1538p.f4192a;
        boolean zM5017b = c4253y.m5017b();
        int i10 = c4253y.f13899e;
        boolean z6 = !zM5017b && i10 == -1;
        boolean zM2353i = m2353i(abstractC19764N, c4253y);
        boolean zM2352h = m2352h(abstractC19764N, c4253y, z6);
        Object obj = c4253y.f13895a;
        C19762L c19762l = this.f4201a;
        abstractC19764N.mo2416g(obj, c19762l);
        if (c4253y.m5017b() || i10 == -1) {
            j10 = -9223372036854775807L;
        } else {
            c19762l.m20717d(i10);
            j10 = 0;
        }
        boolean zM5017b2 = c4253y.m5017b();
        int i11 = c4253y.f13896b;
        if (!zM5017b2) {
            if (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) {
                jM20714a = c19762l.f62580d;
            } else {
                j11 = j10;
            }
            if (c4253y.m5017b()) {
                c19762l.m20720g(i11);
            } else if (i10 != -1) {
                c19762l.m20720g(i10);
            }
            return new C1538P(c4253y, c1538p.f4193b, c1538p.f4194c, j10, j11, false, z6, zM2353i, zM2352h);
        }
        jM20714a = c19762l.m20714a(i11, c4253y.f13897c);
        j11 = jM20714a;
        if (c4253y.m5017b()) {
            c19762l.m20720g(i11);
        } else if (i10 != -1) {
            c19762l.m20720g(i10);
        }
        return new C1538P(c4253y, c1538p.f4193b, c1538p.f4194c, j10, j11, false, z6, zM2353i, zM2352h);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2352h(AbstractC19764N abstractC19764N, C4253y c4253y, boolean z6) {
        int iMo2413b = abstractC19764N.mo2413b(c4253y.f13895a);
        if (abstractC19764N.mo2411m(abstractC19764N.mo2410f(iMo2413b, this.f4201a, false).f62579c, this.f4202b, 0L).f62593h) {
            return false;
        }
        return abstractC19764N.m20724d(iMo2413b, this.f4201a, this.f4202b, this.f4207g, this.f4208h) == -1 && z6;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2353i(AbstractC19764N abstractC19764N, C4253y c4253y) {
        if (!(!c4253y.m5017b() && c4253y.f13899e == -1)) {
            return false;
        }
        Object obj = c4253y.f13895a;
        return abstractC19764N.mo2411m(abstractC19764N.mo2416g(obj, this.f4201a).f62579c, this.f4202b, 0L).f62599n == abstractC19764N.mo2413b(obj);
    }

    /* JADX INFO: renamed from: j */
    public final void m2354j() {
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        for (C1537O c1537o = this.f4209i; c1537o != null; c1537o = c1537o.f4188l) {
            c11333zM12690s.m12762a(c1537o.f4182f.f4192a);
        }
        C1537O c1537o2 = this.f4210j;
        this.f4204d.m21377c(new RunnableC0066i(this, c11333zM12690s, c1537o2 == null ? null : c1537o2.f4182f.f4192a, 5));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2355k(C1537O c1537o) {
        AbstractC20800b.m21321i(c1537o);
        boolean z6 = false;
        if (c1537o.equals(this.f4211k)) {
            return false;
        }
        this.f4211k = c1537o;
        while (true) {
            c1537o = c1537o.f4188l;
            if (c1537o == null) {
                break;
            }
            if (c1537o == this.f4210j) {
                this.f4210j = this.f4209i;
                z6 = true;
            }
            c1537o.m2339g();
            this.f4212l--;
        }
        C1537O c1537o2 = this.f4211k;
        c1537o2.getClass();
        if (c1537o2.f4188l != null) {
            c1537o2.m2334b();
            c1537o2.f4188l = null;
            c1537o2.m2335c();
        }
        m2354j();
        return z6;
    }

    /* JADX INFO: renamed from: m */
    public final C4253y m2356m(AbstractC19764N abstractC19764N, Object obj, long j10) {
        long jM2357n;
        int iMo2413b;
        Object obj2 = obj;
        C19762L c19762l = this.f4201a;
        int i10 = abstractC19764N.mo2416g(obj2, c19762l).f62579c;
        Object obj3 = this.f4213m;
        if (obj3 == null || (iMo2413b = abstractC19764N.mo2413b(obj3)) == -1 || abstractC19764N.mo2410f(iMo2413b, c19762l, false).f62579c != i10) {
            C1537O c1537o = this.f4209i;
            while (true) {
                if (c1537o == null) {
                    C1537O c1537o2 = this.f4209i;
                    while (true) {
                        if (c1537o2 == null) {
                            jM2357n = m2357n(obj2);
                            if (jM2357n != -1) {
                                break;
                            }
                            jM2357n = this.f4206f;
                            this.f4206f = 1 + jM2357n;
                            if (this.f4209i != null) {
                                break;
                            }
                            this.f4213m = obj2;
                            this.f4214n = jM2357n;
                            break;
                        }
                        int iMo2413b2 = abstractC19764N.mo2413b(c1537o2.f4178b);
                        if (iMo2413b2 != -1 && abstractC19764N.mo2410f(iMo2413b2, c19762l, false).f62579c == i10) {
                            jM2357n = c1537o2.f4182f.f4192a.f13898d;
                            break;
                        }
                        c1537o2 = c1537o2.f4188l;
                    }
                } else {
                    if (c1537o.f4178b.equals(obj2)) {
                        jM2357n = c1537o.f4182f.f4192a.f13898d;
                        break;
                    }
                    c1537o = c1537o.f4188l;
                }
            }
        } else {
            jM2357n = this.f4214n;
        }
        long j11 = jM2357n;
        abstractC19764N.mo2416g(obj2, c19762l);
        int i11 = c19762l.f62579c;
        C19763M c19763m = this.f4202b;
        abstractC19764N.m20727n(i11, c19763m);
        boolean z6 = false;
        for (int iMo2413b3 = abstractC19764N.mo2413b(obj); iMo2413b3 >= c19763m.f62598m; iMo2413b3--) {
            abstractC19764N.mo2410f(iMo2413b3, c19762l, true);
            boolean z10 = c19762l.f62583g.f62663a > 0;
            z6 |= z10;
            if (c19762l.m20716c(c19762l.f62580d) != -1) {
                obj2 = c19762l.f62578b;
                obj2.getClass();
            }
            if (z6 && (!z10 || c19762l.f62580d != 0)) {
                break;
            }
        }
        return m2344l(abstractC19764N, obj2, j10, j11, this.f4202b, this.f4201a);
    }

    /* JADX INFO: renamed from: n */
    public final long m2357n(Object obj) {
        for (int i10 = 0; i10 < this.f4215o.size(); i10++) {
            C1537O c1537o = (C1537O) this.f4215o.get(i10);
            if (c1537o.f4178b.equals(obj)) {
                return c1537o.f4182f.f4192a.f13898d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2358o(AbstractC19764N abstractC19764N) {
        C1537O c1537o;
        C1537O c1537o2 = this.f4209i;
        if (c1537o2 == null) {
            return true;
        }
        int iMo2413b = abstractC19764N.mo2413b(c1537o2.f4178b);
        while (true) {
            iMo2413b = abstractC19764N.m20724d(iMo2413b, this.f4201a, this.f4202b, this.f4207g, this.f4208h);
            while (true) {
                c1537o2.getClass();
                c1537o = c1537o2.f4188l;
                if (c1537o == null || c1537o2.f4182f.f4198g) {
                    break;
                }
                c1537o2 = c1537o;
            }
            if (iMo2413b == -1 || c1537o == null || abstractC19764N.mo2413b(c1537o.f4178b) != iMo2413b) {
                break;
            }
            c1537o2 = c1537o;
        }
        boolean zM2355k = m2355k(c1537o2);
        c1537o2.f4182f = m2351g(abstractC19764N, c1537o2.f4182f);
        return !zM2355k;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2359p(AbstractC19764N abstractC19764N, long j10, long j11) {
        C1538P c1538pM2351g;
        C1537O c1537o = this.f4209i;
        C1537O c1537o2 = null;
        while (c1537o != null) {
            C1538P c1538p = c1537o.f4182f;
            if (c1537o2 == null) {
                c1538pM2351g = m2351g(abstractC19764N, c1538p);
            } else {
                C1538P c1538pM2347c = m2347c(abstractC19764N, c1537o2, j10);
                if (c1538pM2347c == null) {
                    return !m2355k(c1537o2);
                }
                if (c1538p.f4193b != c1538pM2347c.f4193b || !c1538p.f4192a.equals(c1538pM2347c.f4192a)) {
                    return !m2355k(c1537o2);
                }
                c1538pM2351g = c1538pM2347c;
            }
            c1537o.f4182f = c1538pM2351g.m2342a(c1538p.f4194c);
            long j12 = c1538p.f4196e;
            if (j12 != -9223372036854775807L) {
                long j13 = c1538pM2351g.f4196e;
                if (j12 != j13) {
                    c1537o.m2341i();
                    return (m2355k(c1537o) || (c1537o == this.f4210j && !c1537o.f4182f.f4197f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1537o.f4191o + j13) ? 1 : (j11 == ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1537o.f4191o + j13) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c1537o2 = c1537o;
            c1537o = c1537o.f4188l;
        }
        return true;
    }
}
