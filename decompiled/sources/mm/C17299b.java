package mm;

import co.C11836z;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: mm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C17299b implements InterfaceC18770c {

    /* JADX INFO: renamed from: Y */
    public C11836z f55123Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC18770c f55124Z;

    /* JADX INFO: renamed from: o0 */
    public Object f55125o0;

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return C18777j.f59682Y;
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        this.f55124Z = null;
        this.f55125o0 = obj;
    }
}
