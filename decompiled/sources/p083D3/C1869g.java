package p083D3;

import p1016t3.AbstractC19764N;
import p1016t3.C19763M;
import p232J3.C4253y;

/* JADX INFO: renamed from: D3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1869g {

    /* JADX INFO: renamed from: a */
    public final String f5373a;

    /* JADX INFO: renamed from: b */
    public int f5374b;

    /* JADX INFO: renamed from: c */
    public long f5375c;

    /* JADX INFO: renamed from: d */
    public final C4253y f5376d;

    /* JADX INFO: renamed from: e */
    public boolean f5377e;

    /* JADX INFO: renamed from: f */
    public boolean f5378f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1870h f5379g;

    public C1869g(C1870h c1870h, String str, int i10, C4253y c4253y) {
        this.f5379g = c1870h;
        this.f5373a = str;
        this.f5374b = i10;
        this.f5375c = c4253y == null ? -1L : c4253y.f13898d;
        if (c4253y == null || !c4253y.m5017b()) {
            return;
        }
        this.f5376d = c4253y;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2779a(C1863a c1863a) {
        C4253y c4253y = c1863a.f5350d;
        if (c4253y == null) {
            return this.f5374b != c1863a.f5349c;
        }
        long j10 = this.f5375c;
        if (j10 == -1) {
            return false;
        }
        if (c4253y.f13898d > j10) {
            return true;
        }
        C4253y c4253y2 = this.f5376d;
        if (c4253y2 == null) {
            return false;
        }
        AbstractC19764N abstractC19764N = c1863a.f5348b;
        int iMo2413b = abstractC19764N.mo2413b(c4253y.f13895a);
        int iMo2413b2 = abstractC19764N.mo2413b(c4253y2.f13895a);
        if (c4253y.f13898d < c4253y2.f13898d || iMo2413b < iMo2413b2) {
            return false;
        }
        if (iMo2413b > iMo2413b2) {
            return true;
        }
        boolean zM5017b = c4253y.m5017b();
        int i10 = c4253y2.f13896b;
        if (!zM5017b) {
            int i11 = c4253y.f13899e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = c4253y.f13896b;
        if (i12 > i10) {
            return true;
        }
        if (i12 == i10) {
            if (c4253y.f13897c > c4253y2.f13897c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2780b(AbstractC19764N abstractC19764N, AbstractC19764N abstractC19764N2) {
        int i10 = this.f5374b;
        if (i10 < abstractC19764N.mo2420o()) {
            C1870h c1870h = this.f5379g;
            abstractC19764N.m20727n(i10, c1870h.f5382a);
            C19763M c19763m = c1870h.f5382a;
            int i11 = c19763m.f62598m;
            while (true) {
                if (i11 > c19763m.f62599n) {
                    i10 = -1;
                    break;
                }
                int iMo2413b = abstractC19764N2.mo2413b(abstractC19764N.mo2419l(i11));
                if (iMo2413b != -1) {
                    i10 = abstractC19764N2.mo2410f(iMo2413b, c1870h.f5383b, false).f62579c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= abstractC19764N2.mo2420o()) {
            i10 = -1;
            break;
        }
        this.f5374b = i10;
        if (i10 == -1) {
            return false;
        }
        C4253y c4253y = this.f5376d;
        return c4253y == null || abstractC19764N2.mo2413b(c4253y.f13895a) != -1;
    }
}
