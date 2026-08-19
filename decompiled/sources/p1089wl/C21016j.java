package p1089wl;

import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: wl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21016j implements InterfaceC19688d, InterfaceC18770c {

    /* JADX INFO: renamed from: Y */
    public static final C21016j f66876Y = new C21016j();

    @Override // sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        return null;
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return C18777j.f59682Y;
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
