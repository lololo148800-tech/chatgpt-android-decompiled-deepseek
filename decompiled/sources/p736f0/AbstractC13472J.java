package p736f0;

import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p571X9.AbstractC9388w4;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13472J extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ int f42632z0;

    public /* synthetic */ AbstractC13472J(int i10) {
        this.f42632z0 = i10;
    }

    /* JADX INFO: renamed from: K0 */
    public abstract long mo14997K0(InterfaceC21056J interfaceC21056J, long j10);

    /* JADX INFO: renamed from: L0 */
    public abstract boolean mo14998L0();

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        switch (this.f42632z0) {
            case 0:
                break;
        }
        return interfaceC21056J.mo21532o(i10);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        long jMo14997K0 = mo14997K0(interfaceC21056J, j10);
        if (mo14998L0()) {
            jMo14997K0 = AbstractC9388w4.m9963f(j10, jMo14997K0);
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(jMo14997K0);
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 10));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        switch (this.f42632z0) {
            case 0:
                break;
        }
        return interfaceC21056J.mo21530b(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        switch (this.f42632z0) {
            case 0:
                break;
        }
        return interfaceC21056J.mo21529G(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        switch (this.f42632z0) {
            case 0:
                break;
        }
        return interfaceC21056J.mo21531l(i10);
    }
}
