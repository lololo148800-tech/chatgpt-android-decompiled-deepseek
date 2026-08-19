package p228J;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: J.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3859r0 implements InterfaceC3861s0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f11668a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final InterfaceC3861s0 f11669b;

    public C3859r0(InterfaceC3861s0 interfaceC3861s0) {
        this.f11669b = interfaceC3861s0;
    }

    @Override // p228J.InterfaceC3861s0
    /* JADX INFO: renamed from: a */
    public final void mo28a(C3865u0 c3865u0) {
        if (this.f11668a.get()) {
            return;
        }
        this.f11669b.mo28a(c3865u0);
    }

    /* JADX INFO: renamed from: b */
    public final void m4587b() {
        this.f11668a.set(true);
    }
}
