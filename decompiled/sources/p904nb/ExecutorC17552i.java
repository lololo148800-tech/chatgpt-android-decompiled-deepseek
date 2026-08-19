package p904nb;

import io.sentry.android.core.RunnableC15195M;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p089D9.RunnableC1981a;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: nb.i */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC17552i implements Executor {

    /* JADX INFO: renamed from: r0 */
    public static final Logger f56150r0 = Logger.getLogger(ExecutorC17552i.class.getName());

    /* JADX INFO: renamed from: Y */
    public final Executor f56151Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayDeque f56152Z = new ArrayDeque();

    /* JADX INFO: renamed from: o0 */
    public int f56153o0 = 1;

    /* JADX INFO: renamed from: p0 */
    public long f56154p0 = 0;

    /* JADX INFO: renamed from: q0 */
    public final RunnableC15195M f56155q0 = new RunnableC15195M(this);

    public ExecutorC17552i(Executor executor) {
        AbstractC20502t.m21157h(executor);
        this.f56151Y = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC20502t.m21157h(runnable);
        synchronized (this.f56152Z) {
            int i10 = this.f56153o0;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f56154p0;
                RunnableC1981a runnableC1981a = new RunnableC1981a(runnable, 3);
                this.f56152Z.add(runnableC1981a);
                this.f56153o0 = 2;
                try {
                    this.f56151Y.execute(this.f56155q0);
                    if (this.f56153o0 != 2) {
                        return;
                    }
                    synchronized (this.f56152Z) {
                        try {
                            if (this.f56154p0 == j10 && this.f56153o0 == 2) {
                                this.f56153o0 = 3;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f56152Z) {
                        try {
                            int i11 = this.f56153o0;
                            boolean z6 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f56152Z.removeLastOccurrence(runnableC1981a)) {
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
            this.f56152Z.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f56151Y + "}";
    }
}
