package p936p0;

import p054C0.C1501n;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p349O0.InterfaceC5982V0;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: p0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C18284x extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC5982V0 f58373A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC5982V0 f58374B0;

    /* JADX INFO: renamed from: z0 */
    public float f58375z0;

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        InterfaceC5982V0 interfaceC5982V0 = this.f58373A0;
        int iRound = (interfaceC5982V0 == null || ((Number) interfaceC5982V0.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) interfaceC5982V0.getValue()).floatValue() * this.f58375z0);
        InterfaceC5982V0 interfaceC5982V1 = this.f58374B0;
        int iRound2 = (interfaceC5982V1 == null || ((Number) interfaceC5982V1.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) interfaceC5982V1.getValue()).floatValue() * this.f58375z0);
        int iM7856k = iRound != Integer.MAX_VALUE ? iRound : C7536a.m7856k(j10);
        int iM7855j = iRound2 != Integer.MAX_VALUE ? iRound2 : C7536a.m7855j(j10);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C7536a.m7854i(j10);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = C7536a.m7853h(j10);
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iM7856k, iRound, iM7855j, iRound2));
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 13));
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
