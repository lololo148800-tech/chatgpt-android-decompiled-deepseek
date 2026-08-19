package p083D3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p057C3.C1571p;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1073w3.AbstractC20817s;
import p232J3.C4253y;

/* JADX INFO: renamed from: D3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1870h {

    /* JADX INFO: renamed from: h */
    public static final C1571p f5380h = new C1571p(1);

    /* JADX INFO: renamed from: i */
    public static final Random f5381i = new Random();

    /* JADX INFO: renamed from: d */
    public C1873k f5385d;

    /* JADX INFO: renamed from: f */
    public String f5387f;

    /* JADX INFO: renamed from: a */
    public final C19763M f5382a = new C19763M();

    /* JADX INFO: renamed from: b */
    public final C19762L f5383b = new C19762L();

    /* JADX INFO: renamed from: c */
    public final HashMap f5384c = new HashMap();

    /* JADX INFO: renamed from: e */
    public AbstractC19764N f5386e = AbstractC19764N.f62601a;

    /* JADX INFO: renamed from: g */
    public long f5388g = -1;

    /* JADX INFO: renamed from: a */
    public final void m2781a(C1869g c1869g) {
        long j10 = c1869g.f5375c;
        if (j10 != -1) {
            this.f5388g = j10;
        }
        this.f5387f = null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2782b(C1863a c1863a) {
        C1873k c1873k;
        try {
            String str = this.f5387f;
            if (str != null) {
                C1869g c1869g = (C1869g) this.f5384c.get(str);
                c1869g.getClass();
                m2781a(c1869g);
            }
            Iterator it = this.f5384c.values().iterator();
            while (it.hasNext()) {
                C1869g c1869g2 = (C1869g) it.next();
                it.remove();
                if (c1869g2.f5377e && (c1873k = this.f5385d) != null) {
                    c1873k.m2851d(c1863a, c1869g2.f5373a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final C1869g m2783c(int i10, C4253y c4253y) {
        long j10;
        long j11;
        HashMap map = this.f5384c;
        C1869g c1869g = null;
        long j12 = Long.MAX_VALUE;
        for (C1869g c1869g2 : map.values()) {
            if (c1869g2.f5375c == -1 && i10 == c1869g2.f5374b && c4253y != null) {
                C1870h c1870h = c1869g2.f5379g;
                C1869g c1869g3 = (C1869g) c1870h.f5384c.get(c1870h.f5387f);
                if (c1869g3 != null) {
                    j11 = c1869g3.f5375c;
                    if (j11 == -1) {
                        j11 = 1 + c1870h.f5388g;
                    }
                } else {
                    j11 = 1 + c1870h.f5388g;
                }
                long j13 = c4253y.f13898d;
                if (j13 >= j11) {
                    c1869g2.f5375c = j13;
                }
            }
            C4253y c4253y2 = c1869g2.f5376d;
            if (c4253y != null) {
                long j14 = c4253y.f13898d;
                if (c4253y2 == null) {
                    if (!c4253y.m5017b() && j14 == c1869g2.f5375c) {
                        j10 = c1869g2.f5375c;
                        if (j10 != -1) {
                        }
                        c1869g = c1869g2;
                        j12 = j10;
                    }
                } else if (j14 == c4253y2.f13898d && c4253y.f13896b == c4253y2.f13896b && c4253y.f13897c == c4253y2.f13897c) {
                    j10 = c1869g2.f5375c;
                    if (j10 != -1) {
                    }
                    c1869g = c1869g2;
                    j12 = j10;
                }
            } else if (i10 == c1869g2.f5374b) {
                j10 = c1869g2.f5375c;
                if (j10 != -1 || j10 < j12) {
                    c1869g = c1869g2;
                    j12 = j10;
                } else if (j10 == j12) {
                    int i11 = AbstractC20817s.f66106a;
                    if (c1869g.f5376d != null && c4253y2 != null) {
                        c1869g = c1869g2;
                    }
                }
            }
        }
        if (c1869g != null) {
            return c1869g;
        }
        String str = (String) f5380h.get();
        C1869g c1869g4 = new C1869g(this, str, i10, c4253y);
        map.put(str, c1869g4);
        return c1869g4;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m2784d(AbstractC19764N abstractC19764N, C4253y c4253y) {
        return m2783c(abstractC19764N.mo2416g(c4253y.f13895a, this.f5383b).f62579c, c4253y).f5373a;
    }

    /* JADX INFO: renamed from: e */
    public final void m2785e(C1863a c1863a) {
        C4253y c4253y;
        boolean zM20728p = c1863a.f5348b.m20728p();
        HashMap map = this.f5384c;
        if (zM20728p) {
            String str = this.f5387f;
            if (str != null) {
                C1869g c1869g = (C1869g) map.get(str);
                c1869g.getClass();
                m2781a(c1869g);
                return;
            }
            return;
        }
        C1869g c1869g2 = (C1869g) map.get(this.f5387f);
        int i10 = c1863a.f5349c;
        C4253y c4253y2 = c1863a.f5350d;
        this.f5387f = m2783c(i10, c4253y2).f5373a;
        m2786f(c1863a);
        if (c4253y2 == null || !c4253y2.m5017b()) {
            return;
        }
        long j10 = c4253y2.f13898d;
        if (c1869g2 != null && c1869g2.f5375c == j10 && (c4253y = c1869g2.f5376d) != null && c4253y.f13896b == c4253y2.f13896b && c4253y.f13897c == c4253y2.f13897c) {
            return;
        }
        m2783c(i10, new C4253y(j10, c4253y2.f13895a));
        this.f5385d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /* JADX INFO: renamed from: f */
    public final synchronized void m2786f(C1863a c1863a) {
        long j10;
        this.f5385d.getClass();
        if (c1863a.f5348b.m20728p()) {
            return;
        }
        C4253y c4253y = c1863a.f5350d;
        if (c4253y != null) {
            long j11 = c4253y.f13898d;
            C1869g c1869g = (C1869g) this.f5384c.get(this.f5387f);
            if (c1869g != null) {
                j10 = c1869g.f5375c;
                if (j10 == -1) {
                    j10 = this.f5388g + 1;
                }
            } else {
                j10 = this.f5388g + 1;
            }
            if (j11 < j10) {
                return;
            }
            C1869g c1869g2 = (C1869g) this.f5384c.get(this.f5387f);
            if (c1869g2 != null && c1869g2.f5375c == -1 && c1869g2.f5374b != c1863a.f5349c) {
                return;
            }
        }
        C1869g c1869gM2783c = m2783c(c1863a.f5349c, c1863a.f5350d);
        if (this.f5387f == null) {
            this.f5387f = c1869gM2783c.f5373a;
        }
        C4253y c4253y2 = c1863a.f5350d;
        if (c4253y2 != null && c4253y2.m5017b()) {
            C4253y c4253y3 = c1863a.f5350d;
            C1869g c1869gM2783c2 = m2783c(c1863a.f5349c, new C4253y(c4253y3.f13895a, c4253y3.f13898d, c4253y3.f13896b));
            if (!c1869gM2783c2.f5377e) {
                c1869gM2783c2.f5377e = true;
                c1863a.f5348b.mo2416g(c1863a.f5350d.f13895a, this.f5383b);
                this.f5383b.m20717d(c1863a.f5350d.f13896b);
                Math.max(0L, AbstractC20817s.m21399M(0L) + AbstractC20817s.m21399M(this.f5383b.f62581e));
                this.f5385d.getClass();
            }
        }
        if (!c1869gM2783c.f5377e) {
            c1869gM2783c.f5377e = true;
            this.f5385d.getClass();
        }
        if (c1869gM2783c.f5373a.equals(this.f5387f) && !c1869gM2783c.f5378f) {
            c1869gM2783c.f5378f = true;
            C1873k c1873k = this.f5385d;
            String str = c1869gM2783c.f5373a;
            c1873k.getClass();
            C4253y c4253y4 = c1863a.f5350d;
            if (c4253y4 == null || !c4253y4.m5017b()) {
                c1873k.m2849b();
                c1873k.f5398i = str;
                c1873k.f5399j = AbstractC1871i.m2800i().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
                c1873k.m2850c(c1863a.f5348b, c1863a.f5350d);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2787g(C1863a c1863a, int i10) {
        try {
            this.f5385d.getClass();
            boolean z6 = i10 == 0;
            Iterator it = this.f5384c.values().iterator();
            while (it.hasNext()) {
                C1869g c1869g = (C1869g) it.next();
                if (c1869g.m2779a(c1863a)) {
                    it.remove();
                    if (c1869g.f5377e) {
                        boolean zEquals = c1869g.f5373a.equals(this.f5387f);
                        if (z6 && zEquals) {
                            boolean z10 = c1869g.f5378f;
                        }
                        if (zEquals) {
                            m2781a(c1869g);
                        }
                        this.f5385d.m2851d(c1863a, c1869g.f5373a);
                    }
                }
            }
            m2785e(c1863a);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
