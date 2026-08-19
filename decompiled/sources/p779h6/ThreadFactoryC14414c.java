package p779h6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: h6.c */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC14414c implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f45288d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final ThreadGroup f45289a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f45290b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f45291c;

    public ThreadFactoryC14414c() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f45289a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f45291c = "lottie-" + f45288d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f45289a, runnable, this.f45291c + this.f45290b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
