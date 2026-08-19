package p025An;

import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.J0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0580J0 extends AbstractC0563B {

    /* JADX INFO: renamed from: Z */
    public static final C0580J0 f1813Z = new C0580J0();

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        C0588N0 c0588n0 = (C0588N0) interfaceC18776i.get(C0588N0.f1818Z);
        if (c0588n0 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c0588n0.f1819Y = true;
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
