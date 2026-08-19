package p025An;

import java.util.concurrent.Executor;
import p050Bn.C1451e;
import p153Fn.AbstractC2923a;
import p972qm.C18777j;

/* JADX INFO: renamed from: An.S */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0592S implements Executor {

    /* JADX INFO: renamed from: Y */
    public final C1451e f1823Y;

    public ExecutorC0592S(C1451e c1451e) {
        this.f1823Y = c1451e;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C18777j c18777j = C18777j.f59682Y;
        C1451e c1451e = this.f1823Y;
        if (AbstractC2923a.m3738l(c1451e, c18777j)) {
            AbstractC2923a.m3737k(c1451e, c18777j, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f1823Y.toString();
    }
}
