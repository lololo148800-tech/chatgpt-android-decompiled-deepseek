package p998rp;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: rp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC19263b implements ThreadFactory {

    /* JADX INFO: renamed from: b */
    public static final ThreadFactory f61062b = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final C19262a f61063a;

    public ThreadFactoryC19263b(C19262a c19262a) {
        this.f61063a = c19262a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f61062b.newThread(runnable);
        threadNewThread.setUncaughtExceptionHandler(this.f61063a);
        return threadNewThread;
    }
}
