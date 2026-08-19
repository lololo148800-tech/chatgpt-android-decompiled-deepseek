package p178H;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A.C0090u;

/* JADX INFO: renamed from: H.n */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3159n implements Executor {

    /* JADX INFO: renamed from: o0 */
    public static final ThreadFactoryC3157m f9503o0 = new ThreadFactoryC3157m(0);

    /* JADX INFO: renamed from: Y */
    public final Object f9504Y = new Object();

    /* JADX INFO: renamed from: Z */
    public ThreadPoolExecutor f9505Z;

    public ExecutorC3159n() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f9503o0);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC3155l());
        this.f9505Z = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final void m3989a(C0090u c0090u) {
        ThreadPoolExecutor threadPoolExecutor;
        c0090u.getClass();
        synchronized (this.f9504Y) {
            try {
                if (this.f9505Z.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f9503o0);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC3155l());
                    this.f9505Z = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f9505Z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, new LinkedHashSet(c0090u.f396f).size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f9504Y) {
            this.f9505Z.execute(runnable);
        }
    }
}
