package p349O0;

import android.view.Choreographer;
import p003A1.ChoreographerFrameCallbackC0293u0;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0624m;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p229J0.C4171z3;
import p334Na.AbstractC5695b;
import p523V9.AbstractC8154o0;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C5940A implements InterfaceC5977T {

    /* JADX INFO: renamed from: Y */
    public static final C5940A f19324Y = new C5940A();

    /* JADX INFO: renamed from: Z */
    public static final Choreographer f19325Z;

    static {
        C3516e c3516e = AbstractC0593T.f1824a;
        f19325Z = (Choreographer) AbstractC0575H.m1161I(AbstractC2935m.f8797a.f3819q0, new C6041z(2, null));
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
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        ChoreographerFrameCallbackC0293u0 choreographerFrameCallbackC0293u0 = new ChoreographerFrameCallbackC0293u0(c0624m, interfaceC1436k);
        f19325Z.postFrameCallback(choreographerFrameCallbackC0293u0);
        c0624m.m1264u(new C4171z3(choreographerFrameCallbackC0293u0, 23));
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }
}
