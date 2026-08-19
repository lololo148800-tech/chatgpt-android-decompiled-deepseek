package p485Tk;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p140Fa.C2685e;
import p334Na.AbstractC5695b;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Tk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C7500i implements InterfaceC18774g {

    /* JADX INFO: renamed from: Z */
    public static final C2685e f23802Z = new C2685e();

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f23803Y;

    public C7500i(InterfaceC18776i callContext) {
        AbstractC16544l.m18094g(callContext, "callContext");
        this.f23803Y = callContext;
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
        return f23802Z;
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
