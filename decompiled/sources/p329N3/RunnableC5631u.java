package p329N3;

import p001A.C0030P;
import p057C3.C1526D;
import p057C3.C1558f;
import p057C3.SurfaceHolderCallbackC1523A;
import p083D3.C1865c;
import p083D3.C1868f;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p232J3.C4253y;
import p658b5.C11232c;

/* JADX INFO: renamed from: N3.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5631u implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18296Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11232c f18297Z;

    public /* synthetic */ RunnableC5631u(C11232c c11232c, int i10, long j10) {
        this.f18296Y = 1;
        this.f18297Z = c11232c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11232c c11232c = this.f18297Z;
        int i10 = this.f18296Y;
        c11232c.getClass();
        switch (i10) {
            case 0:
                int i11 = AbstractC20817s.f66106a;
                C1868f c1868f = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y.f4055E0;
                c1868f.m2748D(c1868f.m2747C(), 1016, new C0030P(15));
                break;
            case 1:
                int i12 = AbstractC20817s.f66106a;
                C1868f c1868f2 = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y.f4055E0;
                c1868f2.m2748D(c1868f2.m2778z((C4253y) c1868f2.f5367p0.f68q0), 1018, new C1865c(23));
                break;
            case 2:
                int i13 = AbstractC20817s.f66106a;
                C1868f c1868f3 = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y.f4055E0;
                c1868f3.m2748D(c1868f3.m2778z((C4253y) c1868f3.f5367p0.f68q0), 1021, new C1865c(24));
                break;
            case 3:
                int i14 = AbstractC20817s.f66106a;
                C1868f c1868f4 = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y.f4055E0;
                c1868f4.m2748D(c1868f4.m2747C(), 1030, new C1865c(1));
                break;
            case 4:
                int i15 = AbstractC20817s.f66106a;
                C1526D c1526d = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y;
                c1526d.getClass();
                C1868f c1868f5 = c1526d.f4055E0;
                c1868f5.m2748D(c1868f5.m2747C(), 1015, new C0030P(14));
                break;
            case 5:
                int i16 = AbstractC20817s.f66106a;
                C1526D c1526d2 = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y;
                c1526d2.getClass();
                C1868f c1868f6 = c1526d2.f4055E0;
                c1868f6.m2748D(c1868f6.m2747C(), 1017, new C1865c(25));
                break;
            default:
                int i17 = AbstractC20817s.f66106a;
                C1868f c1868f7 = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y.f4055E0;
                c1868f7.m2748D(c1868f7.m2747C(), 1019, new C1865c(19));
                break;
        }
    }

    public /* synthetic */ RunnableC5631u(C11232c c11232c, long j10, int i10) {
        this.f18296Y = 2;
        this.f18297Z = c11232c;
    }

    public /* synthetic */ RunnableC5631u(C11232c c11232c, Object obj, int i10) {
        this.f18296Y = i10;
        this.f18297Z = c11232c;
    }

    public /* synthetic */ RunnableC5631u(C11232c c11232c, String str, long j10, long j11) {
        this.f18296Y = 0;
        this.f18297Z = c11232c;
    }

    public /* synthetic */ RunnableC5631u(C11232c c11232c, C19788o c19788o, C1558f c1558f) {
        this.f18296Y = 5;
        this.f18297Z = c11232c;
    }
}
