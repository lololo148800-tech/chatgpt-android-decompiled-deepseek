package p178H;

import java.util.concurrent.Executor;
import p228J.InterfaceC3820W;
import p301M.RunnableC5228j;
import p477Tb.C7296c;
import p544W9.AbstractC8577W2;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: H.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3119L extends AbstractC3115H {

    /* JADX INFO: renamed from: F0 */
    public final Executor f9396F0;

    /* JADX INFO: renamed from: G0 */
    public final Object f9397G0 = new Object();

    /* JADX INFO: renamed from: H0 */
    public InterfaceC3127U f9398H0;

    /* JADX INFO: renamed from: I0 */
    public C3118K f9399I0;

    public C3119L(Executor executor) {
        this.f9396F0 = executor;
    }

    @Override // p178H.AbstractC3115H
    /* JADX INFO: renamed from: a */
    public final InterfaceC3127U mo3945a(InterfaceC3820W interfaceC3820W) {
        return interfaceC3820W.mo342i();
    }

    @Override // p178H.AbstractC3115H
    /* JADX INFO: renamed from: c */
    public final void mo3947c() {
        synchronized (this.f9397G0) {
            try {
                InterfaceC3127U interfaceC3127U = this.f9398H0;
                if (interfaceC3127U != null) {
                    interfaceC3127U.close();
                    this.f9398H0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p178H.AbstractC3115H
    /* JADX INFO: renamed from: f */
    public final void mo3949f(InterfaceC3127U interfaceC3127U) {
        synchronized (this.f9397G0) {
            try {
                if (!this.f9377E0) {
                    interfaceC3127U.close();
                    return;
                }
                if (this.f9399I0 != null) {
                    if (interfaceC3127U.mo3968k0().mo3966f() <= this.f9399I0.f9591Z.mo3968k0().mo3966f()) {
                        interfaceC3127U.close();
                    } else {
                        InterfaceC3127U interfaceC3127U2 = this.f9398H0;
                        if (interfaceC3127U2 != null) {
                            interfaceC3127U2.close();
                        }
                        this.f9398H0 = interfaceC3127U;
                    }
                    return;
                }
                C3118K c3118k = new C3118K(interfaceC3127U, this);
                this.f9399I0 = c3118k;
                InterfaceFutureC13608b interfaceFutureC13608bM3946b = m3946b(c3118k);
                C7296c c7296c = new C7296c(c3118k, 12);
                interfaceFutureC13608bM3946b.mo5766a(new RunnableC5228j(interfaceFutureC13608bM3946b, 0, c7296c), AbstractC8577W2.m9240b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
