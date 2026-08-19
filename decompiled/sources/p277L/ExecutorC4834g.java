package p277L;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p089D9.RunnableC1981a;
import p178H.ThreadFactoryC3157m;

/* JADX INFO: renamed from: L.g */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4834g implements Executor {

    /* JADX INFO: renamed from: o0 */
    public static volatile ExecutorC4834g f15734o0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15735Y;

    /* JADX INFO: renamed from: Z */
    public final ExecutorService f15736Z;

    public ExecutorC4834g(ExecutorService executorService) {
        this.f15735Y = 1;
        this.f15736Z = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15735Y) {
            case 0:
                this.f15736Z.execute(runnable);
                break;
            default:
                this.f15736Z.execute(new RunnableC1981a(runnable, 2));
                break;
        }
    }

    public ExecutorC4834g() {
        this.f15735Y = 0;
        this.f15736Z = Executors.newFixedThreadPool(2, new ThreadFactoryC3157m(1));
    }
}
