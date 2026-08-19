package sm;

import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: sm.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19691g extends AbstractC19685a {
    public AbstractC19691g(InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        if (interfaceC18770c != null && interfaceC18770c.getContext() != C18777j.f59682Y) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return C18777j.f59682Y;
    }
}
