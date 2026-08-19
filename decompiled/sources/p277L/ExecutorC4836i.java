package p277L;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p003A1.RunnableC0153B;
import p089D9.RunnableC1981a;

/* JADX INFO: renamed from: L.i */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4836i implements Executor {

    /* JADX INFO: renamed from: Z */
    public final Executor f15739Z;

    /* JADX INFO: renamed from: Y */
    public final ArrayDeque f15738Y = new ArrayDeque();

    /* JADX INFO: renamed from: o0 */
    public final RunnableC0153B f15740o0 = new RunnableC0153B(this, 6);

    /* JADX INFO: renamed from: p0 */
    public int f15741p0 = 1;

    /* JADX INFO: renamed from: q0 */
    public long f15742q0 = 0;

    public ExecutorC4836i(Executor executor) {
        executor.getClass();
        this.f15739Z = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f15738Y) {
            int i10 = this.f15741p0;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f15742q0;
                RunnableC1981a runnableC1981a = new RunnableC1981a(runnable, 1);
                this.f15738Y.add(runnableC1981a);
                this.f15741p0 = 2;
                try {
                    this.f15739Z.execute(this.f15740o0);
                    if (this.f15741p0 != 2) {
                        return;
                    }
                    synchronized (this.f15738Y) {
                        try {
                            if (this.f15742q0 == j10 && this.f15741p0 == 2) {
                                this.f15741p0 = 3;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f15738Y) {
                        try {
                            int i11 = this.f15741p0;
                            boolean z6 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f15738Y.removeLastOccurrence(runnableC1981a)) {
                                z6 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z6) {
                                throw e10;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f15738Y.add(runnable);
        }
    }
}
