package p904nb;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: nb.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC17545b implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f56129e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f56130a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f56131b;

    /* JADX INFO: renamed from: c */
    public final int f56132c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f56133d;

    public ThreadFactoryC17545b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f56131b = str;
        this.f56132c = i10;
        this.f56133d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f56129e.newThread(new RunnableC17544a(this, 0, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f56131b + " Thread #" + this.f56130a.getAndIncrement());
        return threadNewThread;
    }
}
