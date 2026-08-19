package sm;

import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: sm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19686b implements InterfaceC18770c {

    /* JADX INFO: renamed from: Y */
    public static final C19686b f62377Y = new C19686b();

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
