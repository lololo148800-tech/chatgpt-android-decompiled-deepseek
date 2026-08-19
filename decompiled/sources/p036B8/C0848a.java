package p036B8;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p031B3.C0805i;

/* JADX INFO: renamed from: B8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0848a extends AbstractExecutorService {

    /* JADX INFO: renamed from: Z */
    public static final C0848a f2359Z = new C0848a();

    /* JADX INFO: renamed from: Y */
    public final ScheduledExecutorService f2360Y;

    public C0848a() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ThreadFactoryC0849b.f2361a);
        this.f2360Y = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        try {
            Runtime.getRuntime().addShutdownHook(new C0805i(scheduledExecutorServiceNewSingleThreadScheduledExecutor));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f2360Y.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2360Y.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f2360Y.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f2360Y.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f2360Y.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f2360Y.shutdownNow();
    }
}
