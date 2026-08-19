package p080D0;

import android.view.ActionMode;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0256i;
import p003A1.C0278p0;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0303x1;
import p1071w0.AbstractC20740b0;
import p1071w0.C20710G0;
import p1071w0.C20724N0;
import p1071w0.C20750g0;
import p1071w0.EnumC20730T;
import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3587c;
import p204I1.C3590f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p477Tb.C7296c;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8448A4;
import p544W9.AbstractC8676n;
import p737f1.C13522n;
import p759g1.C13800b;
import p759g1.C13801c;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;

/* JADX INFO: renamed from: D0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1837w0 {

    /* JADX INFO: renamed from: a */
    public final C20724N0 f5305a;

    /* JADX INFO: renamed from: b */
    public InterfaceC6073v f5306b = AbstractC20740b0.f65748c;

    /* JADX INFO: renamed from: c */
    public AbstractC16546n f5307c = C1787V.f5123q0;

    /* JADX INFO: renamed from: d */
    public C20750g0 f5308d;

    /* JADX INFO: renamed from: e */
    public final C6002f0 f5309e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0172H0 f5310f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0303x1 f5311g;

    /* JADX INFO: renamed from: h */
    public InterfaceC18285a f5312h;

    /* JADX INFO: renamed from: i */
    public C13522n f5313i;

    /* JADX INFO: renamed from: j */
    public final C6002f0 f5314j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f5315k;

    /* JADX INFO: renamed from: l */
    public long f5316l;

    /* JADX INFO: renamed from: m */
    public Integer f5317m;

    /* JADX INFO: renamed from: n */
    public long f5318n;

    /* JADX INFO: renamed from: o */
    public final C6002f0 f5319o;

    /* JADX INFO: renamed from: p */
    public final C6002f0 f5320p;

    /* JADX INFO: renamed from: q */
    public int f5321q;

    /* JADX INFO: renamed from: r */
    public C6045C f5322r;

    /* JADX INFO: renamed from: s */
    public C1829s0 f5323s;

    /* JADX INFO: renamed from: t */
    public final C1833u0 f5324t;

    /* JADX INFO: renamed from: u */
    public final C7296c f5325u;

    public C1837w0(C20724N0 c20724n0) {
        this.f5305a = c20724n0;
        C6045C c6045c = new C6045C(0L, (String) null, 7);
        C5975S c5975s = C5975S.f19448r0;
        this.f5309e = C5997d.m6430Q(c6045c, c5975s);
        Boolean bool = Boolean.TRUE;
        this.f5314j = C5997d.m6430Q(bool, c5975s);
        this.f5315k = C5997d.m6430Q(bool, c5975s);
        this.f5316l = 0L;
        this.f5318n = 0L;
        this.f5319o = C5997d.m6430Q(null, c5975s);
        this.f5320p = C5997d.m6430Q(null, c5975s);
        this.f5321q = -1;
        this.f5322r = new C6045C(0L, (String) null, 7);
        this.f5324t = new C1833u0(this, 1);
        this.f5325u = new C7296c(this, 5);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public static final long m2677a(C1837w0 c1837w0, C6045C c6045c, long j10, boolean z6, boolean z10, C1826r c1826r, boolean z11) {
        C20710G0 c20710g0M21294d;
        boolean z12;
        boolean z13;
        InterfaceC18285a interfaceC18285a;
        int i10;
        C20750g0 c20750g0 = c1837w0.f5308d;
        if (c20750g0 == null || (c20710g0M21294d = c20750g0.m21294d()) == null) {
            return C3581L.f10906b;
        }
        InterfaceC6073v interfaceC6073v = c1837w0.f5306b;
        long j11 = c6045c.f19683b;
        int i11 = C3581L.f10907c;
        int iMo1766b = interfaceC6073v.mo1766b((int) (j11 >> 32));
        InterfaceC6073v interfaceC6073v2 = c1837w0.f5306b;
        long j12 = c6045c.f19683b;
        long jM9365b = AbstractC8676n.m9365b(iMo1766b, interfaceC6073v2.mo1766b((int) (j12 & 4294967295L)));
        int iM21216b = c20710g0M21294d.m21216b(j10, false);
        int i12 = (z10 || z6) ? iM21216b : (int) (jM9365b >> 32);
        int i13 = (!z10 || z6) ? iM21216b : (int) (jM9365b & 4294967295L);
        C1829s0 c1829s0 = c1837w0.f5323s;
        int i14 = -1;
        if (!z6 && c1829s0 != null && (i10 = c1837w0.f5321q) != -1) {
            i14 = i10;
        }
        C1829s0 c1829s0M2607B = AbstractC1807h0.m2607B(c20710g0M21294d.f65650a, i12, i13, i14, jM9365b, z6, z10);
        if (!c1829s0M2607B.mo2578f(c1829s0)) {
            return j12;
        }
        c1837w0.f5323s = c1829s0M2607B;
        c1837w0.f5321q = iM21216b;
        C1824q c1824qM2654a = c1826r.m2654a(c1829s0M2607B);
        long jM9365b2 = AbstractC8676n.m9365b(c1837w0.f5306b.mo1765a(c1824qM2654a.f5257a.f5254b), c1837w0.f5306b.mo1765a(c1824qM2654a.f5258b.f5254b));
        if (C3581L.m4266b(jM9365b2, j12)) {
            return j12;
        }
        boolean z14 = C3581L.m4271g(jM9365b2) != C3581L.m4271g(j12) && C3581L.m4266b(AbstractC8676n.m9365b((int) (jM9365b2 & 4294967295L), (int) (jM9365b2 >> 32)), j12);
        boolean z15 = C3581L.m4267c(jM9365b2) && C3581L.m4267c(j12);
        C3590f c3590f = c6045c.f19682a;
        if (z11 && c3590f.f10934Y.length() > 0 && !z14 && !z15 && (interfaceC18285a = c1837w0.f5312h) != null) {
            ((C18286b) interfaceC18285a).m19828a(9);
        }
        c1837w0.f5307c.invoke(m2678c(c3590f, jM9365b2));
        if (!z11) {
            c1837w0.m2692p(!C3581L.m4267c(jM9365b2));
        }
        C20750g0 c20750g1 = c1837w0.f5308d;
        if (c20750g1 != null) {
            c20750g1.f65826q.setValue(Boolean.valueOf(z11));
        }
        C20750g0 c20750g2 = c1837w0.f5308d;
        if (c20750g2 != null) {
            c20750g2.f65822m.setValue(Boolean.valueOf(!C3581L.m4267c(jM9365b2) && AbstractC1807h0.m2609D(c1837w0, true)));
        }
        C20750g0 c20750g3 = c1837w0.f5308d;
        if (c20750g3 == null) {
            z12 = false;
        } else {
            if (C3581L.m4267c(jM9365b2)) {
                z12 = false;
            } else {
                z12 = false;
                if (AbstractC1807h0.m2609D(c1837w0, false)) {
                    z13 = true;
                }
                c20750g3.f65823n.setValue(Boolean.valueOf(z13));
            }
            z13 = z12;
            c20750g3.f65823n.setValue(Boolean.valueOf(z13));
        }
        C20750g0 c20750g4 = c1837w0.f5308d;
        if (c20750g4 != null) {
            c20750g4.f65824o.setValue(Boolean.valueOf((C3581L.m4267c(jM9365b2) && AbstractC1807h0.m2609D(c1837w0, true)) ? true : z12));
        }
        return jM9365b2;
    }

    /* JADX INFO: renamed from: c */
    public static C6045C m2678c(C3590f c3590f, long j10) {
        return new C6045C(c3590f, j10, (C3581L) null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: b */
    public final void m2679b(boolean z6) {
        if (C3581L.m4267c(m2686j().f19683b)) {
            return;
        }
        InterfaceC0172H0 interfaceC0172H0 = this.f5310f;
        if (interfaceC0172H0 != null) {
            ((C0256i) interfaceC0172H0).m827c(AbstractC8448A4.m9057b(m2686j()));
        }
        if (z6) {
            int iM4269e = C3581L.m4269e(m2686j().f19683b);
            this.f5307c.invoke(m2678c(m2686j().f19682a, AbstractC8676n.m9365b(iM4269e, iM4269e)));
            m2690n(EnumC20730T.f65728Y);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: d */
    public final void m2680d() {
        if (C3581L.m4267c(m2686j().f19683b)) {
            return;
        }
        InterfaceC0172H0 interfaceC0172H0 = this.f5310f;
        if (interfaceC0172H0 != null) {
            ((C0256i) interfaceC0172H0).m827c(AbstractC8448A4.m9057b(m2686j()));
        }
        C3590f c3590fM9059d = AbstractC8448A4.m9059d(m2686j(), m2686j().f19682a.f10934Y.length());
        C3590f c3590fM9058c = AbstractC8448A4.m9058c(m2686j(), m2686j().f19682a.f10934Y.length());
        C3587c c3587c = new C3587c(c3590fM9059d);
        c3587c.m4290b(c3590fM9058c);
        C3590f c3590fM4297i = c3587c.m4297i();
        int iM4270f = C3581L.m4270f(m2686j().f19683b);
        this.f5307c.invoke(m2678c(c3590fM4297i, AbstractC8676n.m9365b(iM4270f, iM4270f)));
        m2690n(EnumC20730T.f65728Y);
        this.f5305a.f65710f = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: e */
    public final void m2681e(C13800b c13800b) {
        if (!C3581L.m4267c(m2686j().f19683b)) {
            C20750g0 c20750g0 = this.f5308d;
            C20710G0 c20710g0M21294d = c20750g0 != null ? c20750g0.m21294d() : null;
            int iM4269e = (c13800b == null || c20710g0M21294d == null) ? C3581L.m4269e(m2686j().f19683b) : this.f5306b.mo1765a(c20710g0M21294d.m21216b(c13800b.f43584a, true));
            this.f5307c.invoke(C6045C.m6612a(m2686j(), null, AbstractC8676n.m9365b(iM4269e, iM4269e), 5));
        }
        m2690n((c13800b == null || m2686j().f19682a.f10934Y.length() <= 0) ? EnumC20730T.f65728Y : EnumC20730T.f65730o0);
        m2692p(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m2682f(boolean z6) {
        C13522n c13522n;
        C20750g0 c20750g0 = this.f5308d;
        if (c20750g0 != null && !c20750g0.m21292b() && (c13522n = this.f5313i) != null) {
            c13522n.m15073b();
        }
        this.f5322r = m2686j();
        m2692p(z6);
        m2690n(EnumC20730T.f65729Z);
    }

    /* JADX INFO: renamed from: g */
    public final C13800b m2683g() {
        return (C13800b) this.f5320p.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2684h() {
        return ((Boolean) this.f5315k.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final long m2685i(boolean z6) {
        C20710G0 c20710g0M21294d;
        long j10;
        C20750g0 c20750g0 = this.f5308d;
        if (c20750g0 == null || (c20710g0M21294d = c20750g0.m21294d()) == null) {
            return 9205357640488583168L;
        }
        C3578I c3578i = c20710g0M21294d.f65650a;
        C20750g0 c20750g1 = this.f5308d;
        C3590f c3590f = c20750g1 != null ? c20750g1.f65810a.f65943a : null;
        if (c3590f == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC16544l.m18089b(c3590f.f10934Y, c3578i.f10892a.f10882a.f10934Y)) {
            return 9205357640488583168L;
        }
        C6045C c6045cM2686j = m2686j();
        if (z6) {
            long j11 = c6045cM2686j.f19683b;
            int i10 = C3581L.f10907c;
            j10 = j11 >> 32;
        } else {
            long j12 = c6045cM2686j.f19683b;
            int i11 = C3581L.f10907c;
            j10 = j12 & 4294967295L;
        }
        return AbstractC1807h0.m2637z(c3578i, this.f5306b.mo1766b((int) j10), z6, C3581L.m4271g(m2686j().f19683b));
    }

    /* JADX INFO: renamed from: j */
    public final C6045C m2686j() {
        return (C6045C) this.f5309e.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m2687k() {
        InterfaceC0303x1 interfaceC0303x1 = this.f5311g;
        if ((interfaceC0303x1 != null ? ((C0278p0) interfaceC0303x1).f1010d : 0) != 1 || interfaceC0303x1 == null) {
            return;
        }
        C0278p0 c0278p0 = (C0278p0) interfaceC0303x1;
        c0278p0.f1010d = 2;
        ActionMode actionMode = c0278p0.f1008b;
        if (actionMode != null) {
            actionMode.finish();
        }
        c0278p0.f1008b = null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: l */
    public final void m2688l() {
        C3590f c3590fM825a;
        InterfaceC0172H0 interfaceC0172H0 = this.f5310f;
        if (interfaceC0172H0 == null || (c3590fM825a = ((C0256i) interfaceC0172H0).m825a()) == null) {
            return;
        }
        C3587c c3587c = new C3587c(AbstractC8448A4.m9059d(m2686j(), m2686j().f19682a.f10934Y.length()));
        c3587c.m4290b(c3590fM825a);
        C3590f c3590fM4297i = c3587c.m4297i();
        C3590f c3590fM9058c = AbstractC8448A4.m9058c(m2686j(), m2686j().f19682a.f10934Y.length());
        C3587c c3587c2 = new C3587c(c3590fM4297i);
        c3587c2.m4290b(c3590fM9058c);
        C3590f c3590fM4297i2 = c3587c2.m4297i();
        int length = c3590fM825a.f10934Y.length() + C3581L.m4270f(m2686j().f19683b);
        this.f5307c.invoke(m2678c(c3590fM4297i2, AbstractC8676n.m9365b(length, length)));
        m2690n(EnumC20730T.f65728Y);
        this.f5305a.f65710f = true;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: m */
    public final void m2689m() {
        C6045C c6045cM2678c = m2678c(m2686j().f19682a, AbstractC8676n.m9365b(0, m2686j().f19682a.f10934Y.length()));
        this.f5307c.invoke(c6045cM2678c);
        this.f5322r = C6045C.m6612a(this.f5322r, null, c6045cM2678c.f19683b, 5);
        m2682f(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m2690n(EnumC20730T enumC20730T) {
        C20750g0 c20750g0 = this.f5308d;
        if (c20750g0 != null) {
            if (c20750g0.m21291a() == enumC20730T) {
                c20750g0 = null;
            }
            if (c20750g0 != null) {
                c20750g0.f65820k.setValue(enumC20730T);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX INFO: renamed from: o */
    public final void m2691o() {
        C13801c c13801c;
        float fM15307h;
        InterfaceC21098s interfaceC21098sM21293c;
        InterfaceC21098s interfaceC21098sM21293c2;
        InterfaceC21098s interfaceC21098sM21293c3;
        InterfaceC21098s interfaceC21098sM21293c4;
        InterfaceC0172H0 interfaceC0172H0;
        if (m2684h()) {
            C20750g0 c20750g0 = this.f5308d;
            if (c20750g0 == null || ((Boolean) c20750g0.f65826q.getValue()).booleanValue()) {
                C1835v0 c1835v0 = !C3581L.m4267c(m2686j().f19683b) ? new C1835v0(this, 0) : null;
                boolean zM4267c = C3581L.m4267c(m2686j().f19683b);
                C6002f0 c6002f0 = this.f5314j;
                C1835v0 c1835v1 = (zM4267c || !((Boolean) c6002f0.getValue()).booleanValue()) ? null : new C1835v0(this, 1);
                C1835v0 c1835v2 = (((Boolean) c6002f0.getValue()).booleanValue() && (interfaceC0172H0 = this.f5310f) != null && ((C0256i) interfaceC0172H0).m826b()) ? new C1835v0(this, 2) : null;
                C1835v0 c1835v3 = C3581L.m4268d(m2686j().f19683b) != m2686j().f19682a.f10934Y.length() ? new C1835v0(this, 3) : null;
                InterfaceC0303x1 interfaceC0303x1 = this.f5311g;
                if (interfaceC0303x1 != null) {
                    C20750g0 c20750g1 = this.f5308d;
                    if (c20750g1 == null) {
                        c1835v1 = c1835v1;
                        c1835v3 = c1835v3;
                        c13801c = C13801c.f43585e;
                    } else {
                        C20750g0 c20750g2 = c20750g1.f65825p ? null : c20750g1;
                        if (c20750g2 != null) {
                            int iMo1766b = this.f5306b.mo1766b((int) (m2686j().f19683b >> 32));
                            int iMo1766b2 = this.f5306b.mo1766b((int) (m2686j().f19683b & 4294967295L));
                            C20750g0 c20750g3 = this.f5308d;
                            long jMo21517D = 0;
                            long jMo21517D2 = (c20750g3 == null || (interfaceC21098sM21293c4 = c20750g3.m21293c()) == null) ? 0L : interfaceC21098sM21293c4.mo21517D(m2685i(true));
                            C20750g0 c20750g4 = this.f5308d;
                            if (c20750g4 != null && (interfaceC21098sM21293c3 = c20750g4.m21293c()) != null) {
                                jMo21517D = interfaceC21098sM21293c3.mo21517D(m2685i(false));
                            }
                            C20750g0 c20750g5 = this.f5308d;
                            float fM15307h2 = 0.0f;
                            if (c20750g5 == null || (interfaceC21098sM21293c2 = c20750g5.m21293c()) == null) {
                                c1835v1 = c1835v1;
                                c1835v3 = c1835v3;
                                fM15307h = 0.0f;
                            } else {
                                C20710G0 c20710g0M21294d = c20750g2.m21294d();
                                fM15307h = C13800b.m15307h(interfaceC21098sM21293c2.mo21517D(AbstractC8088f6.m8536b(0.0f, c20710g0M21294d != null ? c20710g0M21294d.f65650a.m4253c(iMo1766b).f43587b : 0.0f)));
                            }
                            C20750g0 c20750g6 = this.f5308d;
                            if (c20750g6 != null && (interfaceC21098sM21293c = c20750g6.m21293c()) != null) {
                                C20710G0 c20710g0M21294d2 = c20750g2.m21294d();
                                fM15307h2 = C13800b.m15307h(interfaceC21098sM21293c.mo21517D(AbstractC8088f6.m8536b(0.0f, c20710g0M21294d2 != null ? c20710g0M21294d2.f65650a.m4253c(iMo1766b2).f43587b : 0.0f)));
                            }
                            c13801c = new C13801c(Math.min(C13800b.m15306g(jMo21517D2), C13800b.m15306g(jMo21517D)), Math.min(fM15307h, fM15307h2), Math.max(C13800b.m15306g(jMo21517D2), C13800b.m15306g(jMo21517D)), (c20750g2.f65810a.f65949g.getDensity() * 25) + Math.max(C13800b.m15307h(jMo21517D2), C13800b.m15307h(jMo21517D)));
                        } else {
                            c1835v1 = c1835v1;
                            c1835v3 = c1835v3;
                            c13801c = C13801c.f43585e;
                        }
                    }
                    ((C0278p0) interfaceC0303x1).m863a(c13801c, c1835v0, c1835v2, c1835v1, c1835v3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2692p(boolean z6) {
        C20750g0 c20750g0 = this.f5308d;
        if (c20750g0 != null) {
            c20750g0.f65821l.setValue(Boolean.valueOf(z6));
        }
        if (z6) {
            m2691o();
        } else {
            m2687k();
        }
    }
}
