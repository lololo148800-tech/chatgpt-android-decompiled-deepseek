package p998rp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: rp.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC19264c {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f61064a;

    /* JADX INFO: renamed from: b */
    public static ExecutorService f61065b;

    /* JADX INFO: renamed from: c */
    public static final int f61066c;

    /* JADX INFO: renamed from: d */
    public static final long f61067d;

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactoryC19263b(new C19262a()));
        f61064a = executorServiceNewCachedThreadPool;
        f61065b = executorServiceNewCachedThreadPool;
        f61066c = Runtime.getRuntime().availableProcessors();
        f61067d = 100000L;
    }

    /* JADX INFO: renamed from: a */
    public static long m20336a() {
        return f61067d;
    }

    /* JADX INFO: renamed from: b */
    public static int m20337b() {
        return f61066c;
    }

    /* JADX INFO: renamed from: c */
    public static Future m20338c(Runnable runnable) {
        if (f61065b.isShutdown() || f61065b.isTerminated()) {
            f61065b = f61064a;
        }
        return f61065b.submit(runnable);
    }

    /* JADX INFO: renamed from: d */
    public static void m20339d(Future[] futureArr) throws ExecutionException, InterruptedException {
        for (Future future : futureArr) {
            future.get();
        }
    }
}
