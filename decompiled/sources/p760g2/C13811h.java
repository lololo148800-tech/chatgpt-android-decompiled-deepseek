package p760g2;

import java.util.ArrayList;
import p001A.AbstractC0010F;
import p655b2.C11218b;
import p655b2.C11219c;
import p655b2.C11221e;

/* JADX INFO: renamed from: g2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C13811h extends C13807d {

    /* JADX INFO: renamed from: r0 */
    public float f43774r0 = -1.0f;

    /* JADX INFO: renamed from: s0 */
    public int f43775s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public int f43776t0 = -1;

    /* JADX INFO: renamed from: u0 */
    public C13806c f43777u0 = this.f43639K;

    /* JADX INFO: renamed from: v0 */
    public int f43778v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public boolean f43779w0;

    public C13811h() {
        this.f43647S.clear();
        this.f43647S.add(this.f43777u0);
        int length = this.f43646R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f43646R[i10] = this.f43777u0;
        }
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: B */
    public final boolean mo15336B() {
        return this.f43779w0;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: C */
    public final boolean mo15337C() {
        return this.f43779w0;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: T */
    public final void mo15373T(C11219c c11219c, boolean z6) {
        if (this.f43649U == null) {
            return;
        }
        C13806c c13806c = this.f43777u0;
        c11219c.getClass();
        int iM12456n = C11219c.m12456n(c13806c);
        if (this.f43778v0 == 1) {
            this.f43654Z = iM12456n;
            this.f43656a0 = 0;
            m15366M(this.f43649U.m15383l());
            m15371R(0);
            return;
        }
        this.f43654Z = 0;
        this.f43656a0 = iM12456n;
        m15371R(this.f43649U.m15387r());
        m15366M(0);
    }

    /* JADX INFO: renamed from: U */
    public final void m15413U(int i10) {
        this.f43777u0.m15353l(i10);
        this.f43779w0 = true;
    }

    /* JADX INFO: renamed from: V */
    public final void m15414V(int i10) {
        if (this.f43778v0 == i10) {
            return;
        }
        this.f43778v0 = i10;
        ArrayList arrayList = this.f43647S;
        arrayList.clear();
        if (this.f43778v0 == 1) {
            this.f43777u0 = this.f43638J;
        } else {
            this.f43777u0 = this.f43639K;
        }
        arrayList.add(this.f43777u0);
        C13806c[] c13806cArr = this.f43646R;
        int length = c13806cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            c13806cArr[i11] = this.f43777u0;
        }
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: c */
    public final void mo15340c(C11219c c11219c, boolean z6) {
        C13808e c13808e = this.f43649U;
        if (c13808e == null) {
            return;
        }
        Object objMo15381j = c13808e.mo15381j(2);
        Object objMo15381j2 = c13808e.mo15381j(4);
        C13808e c13808e2 = this.f43649U;
        boolean z10 = c13808e2 != null && c13808e2.f43688q0[0] == 2;
        if (this.f43778v0 == 0) {
            objMo15381j = c13808e.mo15381j(3);
            objMo15381j2 = c13808e.mo15381j(5);
            C13808e c13808e3 = this.f43649U;
            z10 = c13808e3 != null && c13808e3.f43688q0[1] == 2;
        }
        if (this.f43779w0) {
            C13806c c13806c = this.f43777u0;
            if (c13806c.f43622c) {
                C11221e c11221eM12467k = c11219c.m12467k(c13806c);
                c11219c.m12460d(c11221eM12467k, this.f43777u0.m15345d());
                if (this.f43775s0 != -1) {
                    if (z10) {
                        c11219c.m12462f(c11219c.m12467k(objMo15381j2), c11221eM12467k, 0, 5);
                    }
                } else if (this.f43776t0 != -1 && z10) {
                    C11221e c11221eM12467k2 = c11219c.m12467k(objMo15381j2);
                    c11219c.m12462f(c11221eM12467k, c11219c.m12467k(objMo15381j), 0, 5);
                    c11219c.m12462f(c11221eM12467k2, c11221eM12467k, 0, 5);
                }
                this.f43779w0 = false;
                return;
            }
        }
        if (this.f43775s0 != -1) {
            C11221e c11221eM12467k3 = c11219c.m12467k(this.f43777u0);
            c11219c.m12461e(c11221eM12467k3, c11219c.m12467k(objMo15381j), this.f43775s0, 8);
            if (z10) {
                c11219c.m12462f(c11219c.m12467k(objMo15381j2), c11221eM12467k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f43776t0 != -1) {
            C11221e c11221eM12467k4 = c11219c.m12467k(this.f43777u0);
            C11221e c11221eM12467k5 = c11219c.m12467k(objMo15381j2);
            c11219c.m12461e(c11221eM12467k4, c11221eM12467k5, -this.f43776t0, 8);
            if (z10) {
                c11219c.m12462f(c11221eM12467k4, c11219c.m12467k(objMo15381j), 0, 5);
                c11219c.m12462f(c11221eM12467k5, c11221eM12467k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f43774r0 != -1.0f) {
            C11221e c11221eM12467k6 = c11219c.m12467k(this.f43777u0);
            C11221e c11221eM12467k7 = c11219c.m12467k(objMo15381j2);
            float f10 = this.f43774r0;
            C11218b c11218bM12468l = c11219c.m12468l();
            c11218bM12468l.f33944d.m12445g(c11221eM12467k6, -1.0f);
            c11218bM12468l.f33944d.m12445g(c11221eM12467k7, f10);
            c11219c.m12459c(c11218bM12468l);
        }
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: d */
    public final boolean mo15341d() {
        return true;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: j */
    public final C13806c mo15381j(int i10) {
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h != 1) {
            if (iM24h != 2) {
                if (iM24h != 3) {
                    if (iM24h != 4) {
                        return null;
                    }
                }
            }
            if (this.f43778v0 == 0) {
                return this.f43777u0;
            }
            return null;
        }
        if (this.f43778v0 == 1) {
            return this.f43777u0;
        }
        return null;
    }
}
