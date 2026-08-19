package p036B8;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: B8.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0849b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public static final ThreadFactoryC0849b f2361a = new ThreadFactoryC0849b();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "dd-task-scheduler");
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}
