package p1063vf;

import android.net.Uri;
import mm.C17296C;
import p001A.RunnableC0074m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p057C3.C1526D;
import p057C3.C1529G;
import p057C3.C1531I;
import p057C3.C1547Z;
import p083D3.C1863a;
import p083D3.C1865c;
import p083D3.C1868f;
import p1016t3.AbstractC19764N;
import p1016t3.C19794u;
import p1016t3.C19797x;
import p103Dn.AbstractC2124C;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20599g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Uri f65356Y;

    /* JADX INFO: renamed from: Z */
    public int f65357Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20603k f65358o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f65359p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20599g(C20603k c20603k, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65358o0 = c20603k;
        this.f65359p0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20599g(this.f65358o0, this.f65359p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20599g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        boolean z6;
        C19794u c19794u;
        C20598f c20598f;
        int iM2236V;
        AbstractC19764N abstractC19764N;
        C1868f c1868f;
        C1547Z c1547zM2378f;
        int i10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f65357Z;
        C20603k c20603k = this.f65358o0;
        C1526D c1526d = c20603k.f65377k;
        if (i11 != 0) {
            if (i11 == 1) {
                uri = this.f65356Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c1526d.getClass();
            iM2236V = c1526d.m2236V();
            c1526d.m2256q0();
            if (iM2236V != -1) {
                AbstractC20800b.m21316d(iM2236V >= 0);
                abstractC19764N = c1526d.f4087k1.f4250a;
                if (abstractC19764N.m20728p() || iM2236V < abstractC19764N.mo2420o()) {
                    c1868f = c1526d.f4055E0;
                    if (!c1868f.f5372u0) {
                        C1863a c1863aM2777y = c1868f.m2777y();
                        c1868f.f5372u0 = true;
                        c1868f.m2748D(c1863aM2777y, -1, new C1865c(26));
                    }
                    c1526d.f4066P0++;
                    if (c1526d.m2243d0()) {
                        AbstractC20800b.m21332t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                        C1529G c1529g = new C1529G(c1526d.f4087k1);
                        c1529g.m2263f(1);
                        C1526D c1526d2 = c1526d.f4098w0.f4421Y;
                        c1526d2.f4097v0.m21377c(new RunnableC0074m(c1526d2, 10, c1529g));
                    } else {
                        c1547zM2378f = c1526d.f4087k1;
                        i10 = c1547zM2378f.f4254e;
                        if (i10 != 3 || (i10 == 4 && !abstractC19764N.m20728p())) {
                            c1547zM2378f = c1526d.f4087k1.m2378f(2);
                        }
                        int iM2236V2 = c1526d.m2236V();
                        long j10 = this.f65359p0;
                        C1547Z c1547zM2244e0 = c1526d.m2244e0(c1547zM2378f, abstractC19764N, c1526d.m2245f0(abstractC19764N, iM2236V, j10));
                        c1526d.f4099x0.f4161t0.m21376a(3, new C1531I(abstractC19764N, iM2236V, AbstractC20817s.m21390D(j10))).m21374b();
                        c1526d.m2254o0(c1547zM2244e0, 0, true, 1, c1526d.m2238X(c1547zM2244e0), iM2236V2);
                    }
                }
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C19797x c19797xM4513B = c1526d.m4513B();
        uri = (c19797xM4513B == null || (c19794u = c19797xM4513B.f62786b) == null) ? null : c19794u.f62779a;
        c1526d.getClass();
        c1526d.m2256q0();
        if (c1526d.f4072V0.f62567a.f62693a.get(5)) {
            if (c1526d.m2242b0() != 1 && c1526d.m2242b0() != 4) {
                z6 = false;
            }
            if (z6 && uri != null) {
                c20603k.m21194b(false, uri);
                c20598f = new C20598f(2, null);
                this.f65356Y = null;
                this.f65357Z = 2;
                if (AbstractC2124C.m3220s(c20603k.f65372f, c20598f, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            c1526d.getClass();
            iM2236V = c1526d.m2236V();
            c1526d.m2256q0();
            if (iM2236V != -1) {
                AbstractC20800b.m21316d(iM2236V >= 0);
                abstractC19764N = c1526d.f4087k1.f4250a;
                if (abstractC19764N.m20728p()) {
                    c1868f = c1526d.f4055E0;
                    if (!c1868f.f5372u0) {
                        C1863a c1863aM2777y2 = c1868f.m2777y();
                        c1868f.f5372u0 = true;
                        c1868f.m2748D(c1863aM2777y2, -1, new C1865c(26));
                    }
                    c1526d.f4066P0++;
                    if (c1526d.m2243d0()) {
                        AbstractC20800b.m21332t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                        C1529G c1529g2 = new C1529G(c1526d.f4087k1);
                        c1529g2.m2263f(1);
                        C1526D c1526d3 = c1526d.f4098w0.f4421Y;
                        c1526d3.f4097v0.m21377c(new RunnableC0074m(c1526d3, 10, c1529g2));
                    } else {
                        c1547zM2378f = c1526d.f4087k1;
                        i10 = c1547zM2378f.f4254e;
                        if (i10 != 3) {
                            c1547zM2378f = c1526d.f4087k1.m2378f(2);
                        } else {
                            c1547zM2378f = c1526d.f4087k1.m2378f(2);
                        }
                        int iM2236V3 = c1526d.m2236V();
                        long j11 = this.f65359p0;
                        C1547Z c1547zM2244e1 = c1526d.m2244e0(c1547zM2378f, abstractC19764N, c1526d.m2245f0(abstractC19764N, iM2236V, j11));
                        c1526d.f4099x0.f4161t0.m21376a(3, new C1531I(abstractC19764N, iM2236V, AbstractC20817s.m21390D(j11))).m21374b();
                        c1526d.m2254o0(c1547zM2244e1, 0, true, 1, c1526d.m2238X(c1547zM2244e1), iM2236V3);
                    }
                } else {
                    c1868f = c1526d.f4055E0;
                    if (!c1868f.f5372u0) {
                        C1863a c1863aM2777y3 = c1868f.m2777y();
                        c1868f.f5372u0 = true;
                        c1868f.m2748D(c1863aM2777y3, -1, new C1865c(26));
                    }
                    c1526d.f4066P0++;
                    if (c1526d.m2243d0()) {
                        AbstractC20800b.m21332t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                        C1529G c1529g3 = new C1529G(c1526d.f4087k1);
                        c1529g3.m2263f(1);
                        C1526D c1526d4 = c1526d.f4098w0.f4421Y;
                        c1526d4.f4097v0.m21377c(new RunnableC0074m(c1526d4, 10, c1529g3));
                    } else {
                        c1547zM2378f = c1526d.f4087k1;
                        i10 = c1547zM2378f.f4254e;
                        if (i10 != 3) {
                            c1547zM2378f = c1526d.f4087k1.m2378f(2);
                        } else {
                            c1547zM2378f = c1526d.f4087k1.m2378f(2);
                        }
                        int iM2236V4 = c1526d.m2236V();
                        long j12 = this.f65359p0;
                        C1547Z c1547zM2244e2 = c1526d.m2244e0(c1547zM2378f, abstractC19764N, c1526d.m2245f0(abstractC19764N, iM2236V, j12));
                        c1526d.f4099x0.f4161t0.m21376a(3, new C1531I(abstractC19764N, iM2236V, AbstractC20817s.m21390D(j12))).m21374b();
                        c1526d.m2254o0(c1547zM2244e2, 0, true, 1, c1526d.m2238X(c1547zM2244e2), iM2236V4);
                    }
                }
            }
            return C17296C.f55119a;
        }
        String strValueOf = String.valueOf(uri);
        this.f65356Y = uri;
        this.f65357Z = 1;
        if (c20603k.f65369c.m21195a(strValueOf, this) == enumC19250a) {
            return enumC19250a;
        }
        z6 = true;
        if (z6) {
            c20603k.m21194b(false, uri);
            c20598f = new C20598f(2, null);
            this.f65356Y = null;
            this.f65357Z = 2;
            if (AbstractC2124C.m3220s(c20603k.f65372f, c20598f, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        c1526d.getClass();
        iM2236V = c1526d.m2236V();
        c1526d.m2256q0();
        if (iM2236V != -1) {
            AbstractC20800b.m21316d(iM2236V >= 0);
            abstractC19764N = c1526d.f4087k1.f4250a;
            if (abstractC19764N.m20728p()) {
                c1868f = c1526d.f4055E0;
                if (!c1868f.f5372u0) {
                    C1863a c1863aM2777y4 = c1868f.m2777y();
                    c1868f.f5372u0 = true;
                    c1868f.m2748D(c1863aM2777y4, -1, new C1865c(26));
                }
                c1526d.f4066P0++;
                if (c1526d.m2243d0()) {
                    AbstractC20800b.m21332t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    C1529G c1529g4 = new C1529G(c1526d.f4087k1);
                    c1529g4.m2263f(1);
                    C1526D c1526d5 = c1526d.f4098w0.f4421Y;
                    c1526d5.f4097v0.m21377c(new RunnableC0074m(c1526d5, 10, c1529g4));
                } else {
                    c1547zM2378f = c1526d.f4087k1;
                    i10 = c1547zM2378f.f4254e;
                    if (i10 != 3) {
                        c1547zM2378f = c1526d.f4087k1.m2378f(2);
                    } else {
                        c1547zM2378f = c1526d.f4087k1.m2378f(2);
                    }
                    int iM2236V5 = c1526d.m2236V();
                    long j13 = this.f65359p0;
                    C1547Z c1547zM2244e3 = c1526d.m2244e0(c1547zM2378f, abstractC19764N, c1526d.m2245f0(abstractC19764N, iM2236V, j13));
                    c1526d.f4099x0.f4161t0.m21376a(3, new C1531I(abstractC19764N, iM2236V, AbstractC20817s.m21390D(j13))).m21374b();
                    c1526d.m2254o0(c1547zM2244e3, 0, true, 1, c1526d.m2238X(c1547zM2244e3), iM2236V5);
                }
            } else {
                c1868f = c1526d.f4055E0;
                if (!c1868f.f5372u0) {
                    C1863a c1863aM2777y5 = c1868f.m2777y();
                    c1868f.f5372u0 = true;
                    c1868f.m2748D(c1863aM2777y5, -1, new C1865c(26));
                }
                c1526d.f4066P0++;
                if (c1526d.m2243d0()) {
                    AbstractC20800b.m21332t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    C1529G c1529g5 = new C1529G(c1526d.f4087k1);
                    c1529g5.m2263f(1);
                    C1526D c1526d6 = c1526d.f4098w0.f4421Y;
                    c1526d6.f4097v0.m21377c(new RunnableC0074m(c1526d6, 10, c1529g5));
                } else {
                    c1547zM2378f = c1526d.f4087k1;
                    i10 = c1547zM2378f.f4254e;
                    if (i10 != 3) {
                        c1547zM2378f = c1526d.f4087k1.m2378f(2);
                    } else {
                        c1547zM2378f = c1526d.f4087k1.m2378f(2);
                    }
                    int iM2236V6 = c1526d.m2236V();
                    long j14 = this.f65359p0;
                    C1547Z c1547zM2244e4 = c1526d.m2244e0(c1547zM2378f, abstractC19764N, c1526d.m2245f0(abstractC19764N, iM2236V, j14));
                    c1526d.f4099x0.f4161t0.m21376a(3, new C1531I(abstractC19764N, iM2236V, AbstractC20817s.m21390D(j14))).m21374b();
                    c1526d.m2254o0(c1547zM2244e4, 0, true, 1, c1526d.m2238X(c1547zM2244e4), iM2236V6);
                }
            }
        }
        return C17296C.f55119a;
    }
}
