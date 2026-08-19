package p277L;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p719e5.C13285a;

/* JADX INFO: renamed from: L.f */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4833f implements Executor {

    /* JADX INFO: renamed from: o0 */
    public static volatile ExecutorC4833f f15731o0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15732Y;

    /* JADX INFO: renamed from: Z */
    public final Object f15733Z;

    public ExecutorC4833f() {
        this.f15732Y = 0;
        this.f15733Z = Executors.newSingleThreadExecutor(new ThreadFactoryC4832e(0));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15732Y) {
            case 0:
                ((ExecutorService) this.f15733Z).execute(runnable);
                break;
            default:
                ((C13285a) this.f15733Z).f41992c.post(runnable);
                break;
        }
    }

    public ExecutorC4833f(C13285a c13285a) {
        this.f15732Y = 1;
        this.f15733Z = c13285a;
    }
}
