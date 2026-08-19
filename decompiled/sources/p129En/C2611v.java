package p129En;

import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: En.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C2611v implements InterfaceC18776i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC18776i f8097Y;

    /* JADX INFO: renamed from: Z */
    public final Throwable f8098Z;

    public C2611v(InterfaceC18776i interfaceC18776i, Throwable th2) {
        this.f8097Y = interfaceC18776i;
        this.f8098Z = th2;
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return this.f8097Y.fold(obj, interfaceC1439n);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h interfaceC18775h) {
        return this.f8097Y.get(interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return this.f8097Y.minusKey(interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return this.f8097Y.plus(interfaceC18776i);
    }
}
