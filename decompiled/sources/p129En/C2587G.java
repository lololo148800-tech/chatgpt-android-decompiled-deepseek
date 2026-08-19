package p129En;

import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: En.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2587G implements InterfaceC18770c, InterfaceC19688d {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18770c f8026Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18776i f8027Z;

    public C2587G(InterfaceC18770c interfaceC18770c, InterfaceC18776i interfaceC18776i) {
        this.f8026Y = interfaceC18770c;
        this.f8027Z = interfaceC18776i;
    }

    @Override // sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        InterfaceC18770c interfaceC18770c = this.f8026Y;
        if (interfaceC18770c instanceof InterfaceC19688d) {
            return (InterfaceC19688d) interfaceC18770c;
        }
        return null;
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return this.f8027Z;
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        this.f8026Y.resumeWith(obj);
    }
}
