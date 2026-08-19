package p025An;

import p049Bm.InterfaceC1439n;
import p334Na.AbstractC5695b;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.L0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0584L0 implements InterfaceC18774g, InterfaceC18775h {

    /* JADX INFO: renamed from: Y */
    public static final C0584L0 f1815Y = new C0584L0();

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }

    @Override // p972qm.InterfaceC18774g
    public final InterfaceC18775h getKey() {
        return this;
    }
}
