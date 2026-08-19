package p349O0;

import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p334Na.AbstractC5695b;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6040y0 implements InterfaceC5977T {

    /* JADX INFO: renamed from: Y */
    public static final C6040y0 f19676Y = new C6040y0();

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
        return C5975S.f19444Z;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }

    @Override // p349O0.InterfaceC5977T
    /* JADX INFO: renamed from: v0 */
    public final Object mo876v0(InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C3516e c3516e = AbstractC0593T.f1824a;
        return AbstractC0575H.m1168P(AbstractC2935m.f8797a, new C6038x0(interfaceC1436k, null), abstractC19687c);
    }
}
