package p911o0;

import p054C0.C1501n;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p492U1.C7536a;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C17723E extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public float f56583A0;

    /* JADX INFO: renamed from: z0 */
    public int f56584z0;

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        int iM7856k;
        int iM7854i;
        int iM7853h;
        int iM8921l;
        if (!C7536a.m7850e(j10) || this.f56584z0 == 1) {
            iM7856k = C7536a.m7856k(j10);
            iM7854i = C7536a.m7854i(j10);
        } else {
            iM7856k = AbstractC8301I.m8921l(Math.round(C7536a.m7854i(j10) * this.f56583A0), C7536a.m7856k(j10), C7536a.m7854i(j10));
            iM7854i = iM7856k;
        }
        if (!C7536a.m7849d(j10) || this.f56584z0 == 2) {
            int iM7855j = C7536a.m7855j(j10);
            iM7853h = C7536a.m7853h(j10);
            iM8921l = iM7855j;
        } else {
            iM8921l = AbstractC8301I.m8921l(Math.round(C7536a.m7853h(j10) * this.f56583A0), C7536a.m7855j(j10), C7536a.m7853h(j10));
            iM7853h = iM8921l;
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iM7856k, iM7854i, iM8921l, iM7853h));
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 9));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21234e(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21242m(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21246q(this, abstractC21668N, interfaceC21056J, i10);
    }
}
