package p674c5;

import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p470T4.C7241f;
import p470T4.C7246k;
import p470T4.RunnableC7256u;

/* JADX INFO: renamed from: c5.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11657j implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final C7241f f35302Y;

    /* JADX INFO: renamed from: Z */
    public final C7246k f35303Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f35304o0;

    /* JADX INFO: renamed from: p0 */
    public final int f35305p0;

    public RunnableC11657j(C7241f processor, C7246k token, boolean z6, int i10) {
        AbstractC16544l.m18094g(processor, "processor");
        AbstractC16544l.m18094g(token, "token");
        this.f35302Y = processor;
        this.f35303Z = token;
        this.f35304o0 = z6;
        this.f35305p0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM7650k;
        RunnableC7256u runnableC7256uM7642b;
        if (this.f35304o0) {
            C7241f c7241f = this.f35302Y;
            C7246k c7246k = this.f35303Z;
            int i10 = this.f35305p0;
            c7241f.getClass();
            String str = c7246k.f22979a.f34012a;
            synchronized (c7241f.f22971k) {
                runnableC7256uM7642b = c7241f.m7642b(str);
            }
            zM7650k = C7241f.m7640e(str, runnableC7256uM7642b, i10);
        } else {
            zM7650k = this.f35302Y.m7650k(this.f35303Z, this.f35305p0);
        }
        C7011q.m7408d().m7410a(C7011q.m7409f("StopWorkRunnable"), "StopWorkRunnable for " + this.f35303Z.f22979a.f34012a + "; Processor.stopWork = " + zM7650k);
    }
}
