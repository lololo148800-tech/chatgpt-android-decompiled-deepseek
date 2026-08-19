package p911o0;

import p1095x1.InterfaceC21056J;
import p1140z1.AbstractC21668N;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p736f0.AbstractC13472J;

/* JADX INFO: renamed from: o0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17751c0 extends AbstractC13472J {

    /* JADX INFO: renamed from: A0 */
    public int f56683A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f56684B0;

    @Override // p736f0.AbstractC13472J
    /* JADX INFO: renamed from: K0 */
    public final long mo14997K0(InterfaceC21056J interfaceC21056J, long j10) {
        int iMo21531l = this.f56683A0 == 1 ? interfaceC21056J.mo21531l(C7536a.m7853h(j10)) : interfaceC21056J.mo21532o(C7536a.m7853h(j10));
        if (iMo21531l < 0) {
            iMo21531l = 0;
        }
        if (iMo21531l >= 0) {
            return AbstractC9388w4.m9966i(iMo21531l, iMo21531l, 0, Integer.MAX_VALUE);
        }
        AbstractC9406z4.m9983b("width(" + iMo21531l + ") must be >= 0");
        throw null;
    }

    @Override // p736f0.AbstractC13472J
    /* JADX INFO: renamed from: L0 */
    public final boolean mo14998L0() {
        return this.f56684B0;
    }

    @Override // p736f0.AbstractC13472J, p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f56683A0 == 1 ? interfaceC21056J.mo21531l(i10) : interfaceC21056J.mo21532o(i10);
    }

    @Override // p736f0.AbstractC13472J, p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return this.f56683A0 == 1 ? interfaceC21056J.mo21531l(i10) : interfaceC21056J.mo21532o(i10);
    }
}
