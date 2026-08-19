package p773h0;

import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p349O0.C6016m0;
import p492U1.C7536a;
import p544W9.AbstractC8461D;
import p635a1.AbstractC10458p;
import p860l0.EnumC16673F0;
import p909nm.C17690x;

/* JADX INFO: renamed from: h0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14246A0 extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public boolean f44706A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f44707B0;

    /* JADX INFO: renamed from: z0 */
    public C14322z0 f44708z0;

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f44707B0 ? interfaceC21056J.mo21532o(Integer.MAX_VALUE) : interfaceC21056J.mo21532o(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC8461D.m9084a(j10, this.f44707B0 ? EnumC16673F0.f53401Y : EnumC16673F0.f53402Z);
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(C7536a.m7847b(j10, 0, this.f44707B0 ? C7536a.m7854i(j10) : Integer.MAX_VALUE, 0, this.f44707B0 ? Integer.MAX_VALUE : C7536a.m7853h(j10), 5));
        int i10 = abstractC21069XMo21533p.f66981Y;
        int iM7854i = C7536a.m7854i(j10);
        if (i10 > iM7854i) {
            i10 = iM7854i;
        }
        int i11 = abstractC21069XMo21533p.f66982Z;
        int iM7853h = C7536a.m7853h(j10);
        if (i11 > iM7853h) {
            i11 = iM7853h;
        }
        int i12 = abstractC21069XMo21533p.f66982Z - i11;
        int i13 = abstractC21069XMo21533p.f66981Y - i10;
        if (!this.f44707B0) {
            i12 = i13;
        }
        this.f44708z0.m15600f(i12);
        this.f44708z0.f44953b.m6413h(this.f44707B0 ? i11 : i10);
        return interfaceC21059M.mo19936R(i10, i11, C17690x.f56481Y, new C6016m0(this, i12, abstractC21069XMo21533p, 1));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f44707B0 ? interfaceC21056J.mo21530b(i10) : interfaceC21056J.mo21530b(Integer.MAX_VALUE);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f44707B0 ? interfaceC21056J.mo21529G(i10) : interfaceC21056J.mo21529G(Integer.MAX_VALUE);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f44707B0 ? interfaceC21056J.mo21531l(Integer.MAX_VALUE) : interfaceC21056J.mo21531l(i10);
    }
}
