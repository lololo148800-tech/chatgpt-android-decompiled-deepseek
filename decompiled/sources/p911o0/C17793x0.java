package p911o0;

import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p228J.AbstractC3794B0;
import p492U1.C7536a;
import p492U1.C7540e;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17793x0 extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public float f56775A0;

    /* JADX INFO: renamed from: z0 */
    public float f56776z0;

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        int iMo21532o = interfaceC21056J.mo21532o(i10);
        int iM4485j = !C7540e.m7873a(this.f56776z0, Float.NaN) ? AbstractC3794B0.m4485j(abstractC21668N, this.f56776z0) : 0;
        return iMo21532o < iM4485j ? iM4485j : iMo21532o;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        int iM7856k;
        int iM7855j = 0;
        if (C7540e.m7873a(this.f56776z0, Float.NaN) || C7536a.m7856k(j10) != 0) {
            iM7856k = C7536a.m7856k(j10);
        } else {
            iM7856k = interfaceC21059M.mo7866k0(this.f56776z0);
            int iM7854i = C7536a.m7854i(j10);
            if (iM7856k > iM7854i) {
                iM7856k = iM7854i;
            }
            if (iM7856k < 0) {
                iM7856k = 0;
            }
        }
        int iM7854i2 = C7536a.m7854i(j10);
        if (C7540e.m7873a(this.f56775A0, Float.NaN) || C7536a.m7855j(j10) != 0) {
            iM7855j = C7536a.m7855j(j10);
        } else {
            int iMo7866k0 = interfaceC21059M.mo7866k0(this.f56775A0);
            int iM7853h = C7536a.m7853h(j10);
            if (iMo7866k0 > iM7853h) {
                iMo7866k0 = iM7853h;
            }
            if (iMo7866k0 >= 0) {
                iM7855j = iMo7866k0;
            }
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iM7856k, iM7854i2, iM7855j, C7536a.m7853h(j10)));
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 12));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        int iMo21530b = interfaceC21056J.mo21530b(i10);
        int iM4485j = !C7540e.m7873a(this.f56775A0, Float.NaN) ? AbstractC3794B0.m4485j(abstractC21668N, this.f56775A0) : 0;
        return iMo21530b < iM4485j ? iM4485j : iMo21530b;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        int iMo21529G = interfaceC21056J.mo21529G(i10);
        int iM4485j = !C7540e.m7873a(this.f56775A0, Float.NaN) ? AbstractC3794B0.m4485j(abstractC21668N, this.f56775A0) : 0;
        return iMo21529G < iM4485j ? iM4485j : iMo21529G;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        int iMo21531l = interfaceC21056J.mo21531l(i10);
        int iM4485j = !C7540e.m7873a(this.f56776z0, Float.NaN) ? AbstractC3794B0.m4485j(abstractC21668N, this.f56776z0) : 0;
        return iMo21531l < iM4485j ? iM4485j : iMo21531l;
    }
}
