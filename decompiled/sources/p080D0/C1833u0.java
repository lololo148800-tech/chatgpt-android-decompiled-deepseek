package p080D0;

import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.C20710G0;
import p1071w0.C20750g0;
import p1071w0.EnumC20729S;
import p1071w0.EnumC20730T;
import p1071w0.InterfaceC20772r0;
import p204I1.C3581L;
import p349O0.C6002f0;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p544W9.AbstractC8676n;
import p759g1.C13800b;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;

/* JADX INFO: renamed from: D0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1833u0 implements InterfaceC20772r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1837w0 f5295b;

    public /* synthetic */ C1833u0(C1837w0 c1837w0, int i10) {
        this.f5294a = i10;
        this.f5295b = c1837w0;
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: a */
    public final void mo464a() {
        switch (this.f5294a) {
            case 0:
                C1837w0 c1837w0 = this.f5295b;
                c1837w0.f5319o.setValue(null);
                c1837w0.f5320p.setValue(null);
                break;
            default:
                m2676i();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: b */
    public final void mo465b(long j10) {
        C20710G0 c20710g0M21294d;
        C20710G0 c20710g0M21294d2;
        C20710G0 c20710g0M21294d3;
        switch (this.f5294a) {
            case 0:
                C1837w0 c1837w0 = this.f5295b;
                long jM2572a = AbstractC1783Q.m2572a(c1837w0.m2685i(true));
                C20750g0 c20750g0 = c1837w0.f5308d;
                if (c20750g0 != null && (c20710g0M21294d = c20750g0.m21294d()) != null) {
                    long jM21219e = c20710g0M21294d.m21219e(jM2572a);
                    c1837w0.f5316l = jM21219e;
                    c1837w0.f5320p.setValue(new C13800b(jM21219e));
                    c1837w0.f5318n = 0L;
                    c1837w0.f5319o.setValue(EnumC20729S.f65724Y);
                    c1837w0.m2692p(false);
                    break;
                }
                break;
            default:
                C1837w0 c1837w1 = this.f5295b;
                if (c1837w1.m2684h()) {
                    C6002f0 c6002f0 = c1837w1.f5319o;
                    if (((EnumC20729S) c6002f0.getValue()) == null) {
                        c6002f0.setValue(EnumC20729S.f65726o0);
                        c1837w1.f5321q = -1;
                        c1837w1.m2687k();
                        C20750g0 c20750g1 = c1837w1.f5308d;
                        if (c20750g1 == null || (c20710g0M21294d3 = c20750g1.m21294d()) == null || !c20710g0M21294d3.m21217c(j10)) {
                            C20750g0 c20750g2 = c1837w1.f5308d;
                            if (c20750g2 != null && (c20710g0M21294d2 = c20750g2.m21294d()) != null) {
                                int iMo1765a = c1837w1.f5306b.mo1765a(c20710g0M21294d2.m21216b(j10, true));
                                C6045C c6045cM2678c = C1837w0.m2678c(c1837w1.m2686j().f19682a, AbstractC8676n.m9365b(iMo1765a, iMo1765a));
                                c1837w1.m2682f(false);
                                InterfaceC18285a interfaceC18285a = c1837w1.f5312h;
                                if (interfaceC18285a != null) {
                                    ((C18286b) interfaceC18285a).m19828a(9);
                                }
                                c1837w1.f5307c.invoke(c6045cM2678c);
                            }
                        } else if (c1837w1.m2686j().f19682a.f10934Y.length() != 0) {
                            c1837w1.m2682f(false);
                            c1837w1.f5317m = Integer.valueOf((int) (C1837w0.m2677a(c1837w1, C6045C.m6612a(c1837w1.m2686j(), null, C3581L.f10906b, 5), j10, true, false, C1828s.f5268f, true) >> 32));
                        }
                        c1837w1.m2690n(EnumC20730T.f65728Y);
                        c1837w1.f5316l = j10;
                        c1837w1.f5320p.setValue(new C13800b(j10));
                        c1837w1.f5318n = 0L;
                        break;
                    }
                }
                break;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        switch (this.f5294a) {
            case 0:
                C1837w0 c1837w0 = this.f5295b;
                c1837w0.f5319o.setValue(null);
                c1837w0.f5320p.setValue(null);
                break;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: d */
    public final void mo467d() {
        int i10 = this.f5294a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Type inference failed for: r0v6, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: e */
    public final void mo468e(long j10) {
        C20710G0 c20710g0M21294d;
        InterfaceC18285a interfaceC18285a;
        C20710G0 c20710g0M21294d2;
        Integer num;
        int iM21216b;
        switch (this.f5294a) {
            case 0:
                C1837w0 c1837w0 = this.f5295b;
                c1837w0.f5318n = C13800b.m15311l(c1837w0.f5318n, j10);
                C20750g0 c20750g0 = c1837w0.f5308d;
                if (c20750g0 != null && (c20710g0M21294d = c20750g0.m21294d()) != null) {
                    c1837w0.f5320p.setValue(new C13800b(C13800b.m15311l(c1837w0.f5316l, c1837w0.f5318n)));
                    InterfaceC6073v interfaceC6073v = c1837w0.f5306b;
                    C13800b c13800bM2683g = c1837w0.m2683g();
                    AbstractC16544l.m18091d(c13800bM2683g);
                    int iMo1765a = interfaceC6073v.mo1765a(c20710g0M21294d.m21216b(c13800bM2683g.f43584a, true));
                    long jM9365b = AbstractC8676n.m9365b(iMo1765a, iMo1765a);
                    if (!C3581L.m4266b(jM9365b, c1837w0.m2686j().f19683b)) {
                        C20750g0 c20750g1 = c1837w0.f5308d;
                        if ((c20750g1 == null || ((Boolean) c20750g1.f65826q.getValue()).booleanValue()) && (interfaceC18285a = c1837w0.f5312h) != null) {
                            ((C18286b) interfaceC18285a).m19828a(9);
                        }
                        c1837w0.f5307c.invoke(C1837w0.m2678c(c1837w0.m2686j().f19682a, jM9365b));
                        break;
                    }
                }
                break;
            default:
                C1837w0 c1837w1 = this.f5295b;
                if (c1837w1.m2684h() && c1837w1.m2686j().f19682a.f10934Y.length() != 0) {
                    c1837w1.f5318n = C13800b.m15311l(c1837w1.f5318n, j10);
                    C20750g0 c20750g2 = c1837w1.f5308d;
                    if (c20750g2 != null && (c20710g0M21294d2 = c20750g2.m21294d()) != null) {
                        c1837w1.f5320p.setValue(new C13800b(C13800b.m15311l(c1837w1.f5316l, c1837w1.f5318n)));
                        Integer num2 = c1837w1.f5317m;
                        C1826r c1826r = C1828s.f5268f;
                        if (num2 == null) {
                            C13800b c13800bM2683g2 = c1837w1.m2683g();
                            AbstractC16544l.m18091d(c13800bM2683g2);
                            if (c20710g0M21294d2.m21217c(c13800bM2683g2.f43584a)) {
                                num = c1837w1.f5317m;
                                if (num != null) {
                                    iM21216b = num.intValue();
                                } else {
                                    iM21216b = c20710g0M21294d2.m21216b(c1837w1.f5316l, false);
                                }
                                C13800b c13800bM2683g3 = c1837w1.m2683g();
                                AbstractC16544l.m18091d(c13800bM2683g3);
                                int iM21216b2 = c20710g0M21294d2.m21216b(c13800bM2683g3.f43584a, false);
                                if (c1837w1.f5317m == null || iM21216b != iM21216b2) {
                                    C6045C c6045cM2686j = c1837w1.m2686j();
                                    C13800b c13800bM2683g4 = c1837w1.m2683g();
                                    AbstractC16544l.m18091d(c13800bM2683g4);
                                    C1837w0.m2677a(c1837w1, c6045cM2686j, c13800bM2683g4.f43584a, false, false, c1826r, true);
                                }
                            } else {
                                int iMo1765a2 = c1837w1.f5306b.mo1765a(c20710g0M21294d2.m21216b(c1837w1.f5316l, true));
                                InterfaceC6073v interfaceC6073v2 = c1837w1.f5306b;
                                C13800b c13800bM2683g5 = c1837w1.m2683g();
                                AbstractC16544l.m18091d(c13800bM2683g5);
                                if (iMo1765a2 == interfaceC6073v2.mo1765a(c20710g0M21294d2.m21216b(c13800bM2683g5.f43584a, true))) {
                                    c1826r = C1828s.f5266d;
                                }
                                C6045C c6045cM2686j2 = c1837w1.m2686j();
                                C13800b c13800bM2683g6 = c1837w1.m2683g();
                                AbstractC16544l.m18091d(c13800bM2683g6);
                                C1837w0.m2677a(c1837w1, c6045cM2686j2, c13800bM2683g6.f43584a, false, false, c1826r, true);
                            }
                        } else {
                            num = c1837w1.f5317m;
                            if (num != null) {
                                iM21216b = num.intValue();
                            } else {
                                iM21216b = c20710g0M21294d2.m21216b(c1837w1.f5316l, false);
                            }
                            C13800b c13800bM2683g7 = c1837w1.m2683g();
                            AbstractC16544l.m18091d(c13800bM2683g7);
                            int iM21216b3 = c20710g0M21294d2.m21216b(c13800bM2683g7.f43584a, false);
                            if (c1837w1.f5317m == null) {
                            }
                            C6045C c6045cM2686j3 = c1837w1.m2686j();
                            C13800b c13800bM2683g8 = c1837w1.m2683g();
                            AbstractC16544l.m18091d(c13800bM2683g8);
                            C1837w0.m2677a(c1837w1, c6045cM2686j3, c13800bM2683g8.f43584a, false, false, c1826r, true);
                        }
                        int i10 = C3581L.f10907c;
                    }
                    c1837w1.m2692p(false);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2676i() {
        C1837w0 c1837w0 = this.f5295b;
        c1837w0.f5319o.setValue(null);
        c1837w0.f5320p.setValue(null);
        c1837w0.m2692p(true);
        c1837w0.f5317m = null;
        boolean zM4267c = C3581L.m4267c(c1837w0.m2686j().f19683b);
        c1837w0.m2690n(zM4267c ? EnumC20730T.f65730o0 : EnumC20730T.f65729Z);
        C20750g0 c20750g0 = c1837w0.f5308d;
        if (c20750g0 != null) {
            c20750g0.f65822m.setValue(Boolean.valueOf(!zM4267c && AbstractC1807h0.m2609D(c1837w0, true)));
        }
        C20750g0 c20750g1 = c1837w0.f5308d;
        if (c20750g1 != null) {
            c20750g1.f65823n.setValue(Boolean.valueOf(!zM4267c && AbstractC1807h0.m2609D(c1837w0, false)));
        }
        C20750g0 c20750g2 = c1837w0.f5308d;
        if (c20750g2 == null) {
            return;
        }
        c20750g2.f65824o.setValue(Boolean.valueOf(zM4267c && AbstractC1807h0.m2609D(c1837w0, true)));
    }

    @Override // p1071w0.InterfaceC20772r0
    public final void onCancel() {
        switch (this.f5294a) {
            case 0:
                break;
            default:
                m2676i();
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m2672f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2673g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m2674h() {
    }

    /* JADX INFO: renamed from: j */
    private final void m2675j() {
    }
}
