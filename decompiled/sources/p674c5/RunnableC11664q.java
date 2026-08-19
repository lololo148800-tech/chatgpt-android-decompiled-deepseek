package p674c5;

import p444S4.C7011q;
import p519V4.C7760h;
import p519V4.RunnableC7759g;
import p658b5.C11239j;

/* JADX INFO: renamed from: c5.q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11664q implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C11665r f35319Y;

    /* JADX INFO: renamed from: Z */
    public final C11239j f35320Z;

    public RunnableC11664q(C11665r c11665r, C11239j c11239j) {
        this.f35319Y = c11665r;
        this.f35320Z = c11239j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35319Y.f35325d) {
            try {
                if (((RunnableC11664q) this.f35319Y.f35323b.remove(this.f35320Z)) != null) {
                    InterfaceC11663p interfaceC11663p = (InterfaceC11663p) this.f35319Y.f35324c.remove(this.f35320Z);
                    if (interfaceC11663p != null) {
                        C11239j c11239j = this.f35320Z;
                        C7760h c7760h = (C7760h) interfaceC11663p;
                        C7011q.m7408d().m7410a(C7760h.f24474A0, "Exceeded time limits on execution for " + c11239j);
                        c7760h.f24482t0.execute(new RunnableC7759g(c7760h, 0));
                    }
                } else {
                    C7011q.m7408d().m7410a("WrkTimerRunnable", "Timer with " + this.f35320Z + " is already marked as complete.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
