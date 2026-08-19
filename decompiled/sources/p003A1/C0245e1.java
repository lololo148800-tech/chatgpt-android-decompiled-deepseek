package p003A1;

import p049Bm.InterfaceC1439n;
import p334Na.AbstractC5695b;
import p349O0.C5994b0;
import p349O0.C5997d;
import p635a1.C10444b;
import p635a1.InterfaceC10460r;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: A1.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0245e1 implements InterfaceC10460r {

    /* JADX INFO: renamed from: Y */
    public final C5994b0 f936Y = C5997d.m6428O(1.0f);

    @Override // p635a1.InterfaceC10460r
    /* JADX INFO: renamed from: W */
    public final float mo814W() {
        return this.f936Y.m6409g();
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        return C10444b.f30933B0;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }
}
