package p1095x1;

import p049Bm.InterfaceC1436k;
import p1140z1.InterfaceC21717v;
import p492U1.C7545j;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: x1.T */
/* JADX INFO: loaded from: classes.dex */
public final class C21065T extends AbstractC10458p implements InterfaceC21717v {

    /* JADX INFO: renamed from: A0 */
    public long f66977A0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC1436k f66978z0;

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void mo11280l0(InterfaceC21098s interfaceC21098s) {
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: q */
    public final void mo11281q(long j10) {
        if (C7545j.m7886a(this.f66977A0, j10)) {
            return;
        }
        this.f66978z0.invoke(new C7545j(j10));
        this.f66977A0 = j10;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return true;
    }
}
