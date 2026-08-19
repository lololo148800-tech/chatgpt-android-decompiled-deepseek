package p501Ub;

import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p499U9.AbstractExecutorServiceC7583m;

/* JADX INFO: renamed from: Ub.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7605g extends AbstractExecutorServiceC7583m {

    /* JADX INFO: renamed from: Z */
    public static final ThreadLocal f24043Z = new ThreadLocal();

    /* JADX INFO: renamed from: Y */
    public final ThreadPoolExecutor f24044Y;

    public C7605g() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: Ub.n
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new RunnableC7611m(runnable, 0));
            }
        });
        this.f24044Y = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f24043Z.get();
        if (deque == null || deque.size() > 1) {
            this.f24044Y.execute(new RunnableC7611m(runnable, 1));
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
