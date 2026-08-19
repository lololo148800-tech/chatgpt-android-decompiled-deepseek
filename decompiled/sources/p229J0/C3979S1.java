package p229J0;

import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21718w;
import p492U1.C7540e;
import p530Vi.AbstractC8301I;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3979S1 extends AbstractC10458p implements InterfaceC21702l, InterfaceC21718w {
    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        float f10 = 0;
        float fM8915f = AbstractC8301I.m8915f(((C7540e) AbstractC21690f.m22204i(this, AbstractC3884B1.f11770a)).f23894Y, f10);
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        boolean z6 = this.f30972y0 && !Float.isNaN(fM8915f) && Float.compare(fM8915f, f10) > 0;
        int iMo7866k0 = Float.isNaN(fM8915f) ? 0 : interfaceC21059M.mo7866k0(fM8915f);
        int iMax = z6 ? Math.max(abstractC21069XMo21533p.f66981Y, iMo7866k0) : abstractC21069XMo21533p.f66981Y;
        int iMax2 = z6 ? Math.max(abstractC21069XMo21533p.f66982Z, iMo7866k0) : abstractC21069XMo21533p.f66982Z;
        return interfaceC21059M.mo19936R(iMax, iMax2, C17690x.f56481Y, new C3974R1(iMax, iMax2, abstractC21069XMo21533p));
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
