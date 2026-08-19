package p911o0;

import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p492U1.C7536a;
import p492U1.C7540e;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17789v0 extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public float f56766A0;

    /* JADX INFO: renamed from: B0 */
    public float f56767B0;

    /* JADX INFO: renamed from: C0 */
    public float f56768C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f56769D0;

    /* JADX INFO: renamed from: z0 */
    public float f56770z0;

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX INFO: renamed from: K0 */
    public final long m19517K0(InterfaceC21095p interfaceC21095p) {
        int iMo7866k0;
        int iMo7866k1;
        int iMo7866k2;
        int i10 = 0;
        if (C7540e.m7873a(this.f56767B0, Float.NaN)) {
            iMo7866k0 = Integer.MAX_VALUE;
        } else {
            iMo7866k0 = interfaceC21095p.mo7866k0(this.f56767B0);
            if (iMo7866k0 < 0) {
                iMo7866k0 = 0;
            }
        }
        if (C7540e.m7873a(this.f56768C0, Float.NaN)) {
            iMo7866k1 = Integer.MAX_VALUE;
        } else {
            iMo7866k1 = interfaceC21095p.mo7866k0(this.f56768C0);
            if (iMo7866k1 < 0) {
                iMo7866k1 = 0;
            }
        }
        if (C7540e.m7873a(this.f56770z0, Float.NaN)) {
            iMo7866k2 = 0;
        } else {
            iMo7866k2 = interfaceC21095p.mo7866k0(this.f56770z0);
            if (iMo7866k2 > iMo7866k0) {
                iMo7866k2 = iMo7866k0;
            }
            if (iMo7866k2 < 0) {
                iMo7866k2 = 0;
            }
            if (iMo7866k2 == Integer.MAX_VALUE) {
                iMo7866k2 = 0;
            }
        }
        if (!C7540e.m7873a(this.f56766A0, Float.NaN)) {
            int iMo7866k3 = interfaceC21095p.mo7866k0(this.f56766A0);
            if (iMo7866k3 > iMo7866k1) {
                iMo7866k3 = iMo7866k1;
            }
            if (iMo7866k3 < 0) {
                iMo7866k3 = 0;
            }
            if (iMo7866k3 != Integer.MAX_VALUE) {
                i10 = iMo7866k3;
            }
        }
        return AbstractC9388w4.m9958a(iMo7866k2, iMo7866k0, i10, iMo7866k1);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        long jM19517K0 = m19517K0(abstractC21668N);
        return C7536a.m7852g(jM19517K0) ? C7536a.m7854i(jM19517K0) : AbstractC9388w4.m9965h(interfaceC21056J.mo21532o(i10), jM19517K0);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        int iM7856k;
        int iM7854i;
        int iM7855j;
        int iM7853h;
        long jM9958a;
        long jM19517K0 = m19517K0(interfaceC21059M);
        if (this.f56769D0) {
            jM9958a = AbstractC9388w4.m9963f(j10, jM19517K0);
        } else {
            if (C7540e.m7873a(this.f56770z0, Float.NaN)) {
                iM7856k = C7536a.m7856k(j10);
                int iM7854i2 = C7536a.m7854i(jM19517K0);
                if (iM7856k > iM7854i2) {
                    iM7856k = iM7854i2;
                }
            } else {
                iM7856k = C7536a.m7856k(jM19517K0);
            }
            if (C7540e.m7873a(this.f56767B0, Float.NaN)) {
                iM7854i = C7536a.m7854i(j10);
                int iM7856k2 = C7536a.m7856k(jM19517K0);
                if (iM7854i < iM7856k2) {
                    iM7854i = iM7856k2;
                }
            } else {
                iM7854i = C7536a.m7854i(jM19517K0);
            }
            if (C7540e.m7873a(this.f56766A0, Float.NaN)) {
                iM7855j = C7536a.m7855j(j10);
                int iM7853h2 = C7536a.m7853h(jM19517K0);
                if (iM7855j > iM7853h2) {
                    iM7855j = iM7853h2;
                }
            } else {
                iM7855j = C7536a.m7855j(jM19517K0);
            }
            if (C7540e.m7873a(this.f56768C0, Float.NaN)) {
                iM7853h = C7536a.m7853h(j10);
                int iM7855j2 = C7536a.m7855j(jM19517K0);
                if (iM7853h < iM7855j2) {
                    iM7853h = iM7855j2;
                }
            } else {
                iM7853h = C7536a.m7853h(jM19517K0);
            }
            jM9958a = AbstractC9388w4.m9958a(iM7856k, iM7854i, iM7855j, iM7853h);
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(jM9958a);
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 11));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        long jM19517K0 = m19517K0(abstractC21668N);
        return C7536a.m7851f(jM19517K0) ? C7536a.m7853h(jM19517K0) : AbstractC9388w4.m9964g(interfaceC21056J.mo21530b(i10), jM19517K0);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        long jM19517K0 = m19517K0(abstractC21668N);
        return C7536a.m7851f(jM19517K0) ? C7536a.m7853h(jM19517K0) : AbstractC9388w4.m9964g(interfaceC21056J.mo21529G(i10), jM19517K0);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        long jM19517K0 = m19517K0(abstractC21668N);
        return C7536a.m7852g(jM19517K0) ? C7536a.m7854i(jM19517K0) : AbstractC9388w4.m9965h(interfaceC21056J.mo21531l(i10), jM19517K0);
    }
}
