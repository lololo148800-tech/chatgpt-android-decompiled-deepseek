package p911o0;

import p1095x1.InterfaceC21056J;
import p1140z1.AbstractC21668N;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p736f0.AbstractC13472J;

/* JADX INFO: renamed from: o0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17749b0 extends AbstractC13472J {

    /* JADX INFO: renamed from: A0 */
    public int f56678A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f56679B0;

    @Override // p736f0.AbstractC13472J
    /* JADX INFO: renamed from: K0 */
    public final long mo14997K0(InterfaceC21056J interfaceC21056J, long j10) {
        int iMo21529G = this.f56678A0 == 1 ? interfaceC21056J.mo21529G(C7536a.m7854i(j10)) : interfaceC21056J.mo21530b(C7536a.m7854i(j10));
        if (iMo21529G < 0) {
            iMo21529G = 0;
        }
        if (iMo21529G >= 0) {
            return AbstractC9388w4.m9966i(0, Integer.MAX_VALUE, iMo21529G, iMo21529G);
        }
        AbstractC9406z4.m9983b("height(" + iMo21529G + ") must be >= 0");
        throw null;
    }

    @Override // p736f0.AbstractC13472J
    /* JADX INFO: renamed from: L0 */
    public final boolean mo14998L0() {
        return this.f56679B0;
    }

    @Override // p736f0.AbstractC13472J, p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f56678A0 == 1 ? interfaceC21056J.mo21529G(i10) : interfaceC21056J.mo21530b(i10);
    }

    @Override // p736f0.AbstractC13472J, p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f56678A0 == 1 ? interfaceC21056J.mo21529G(i10) : interfaceC21056J.mo21530b(i10);
    }
}
