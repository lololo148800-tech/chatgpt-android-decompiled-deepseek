package p009A7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p089D9.RunnableC1981a;

/* JADX INFO: renamed from: A7.d */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0394d implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1311a;

    /* JADX INFO: renamed from: b */
    public final Object f1312b;

    /* JADX INFO: renamed from: c */
    public final Object f1313c;

    public ThreadFactoryC0394d() {
        this.f1311a = 2;
        this.f1312b = Executors.defaultThreadFactory();
        this.f1313c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1311a) {
            case 0:
                Thread thread = new Thread(runnable, "datadog-" + ((String) this.f1312b) + "-thread-" + ((AtomicInteger) this.f1313c).getAndIncrement());
                thread.setPriority(5);
                thread.setDaemon(false);
                return thread;
            case 1:
                Thread threadNewThread = ((ThreadFactory) this.f1313c).newThread(new RunnableC1981a(runnable, 0));
                threadNewThread.setName((String) this.f1312b);
                return threadNewThread;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f1313c;
                Thread threadNewThread2 = ((ThreadFactory) this.f1312b).newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread2;
        }
    }

    public ThreadFactoryC0394d(String str, int i10) {
        this.f1311a = i10;
        switch (i10) {
            case 1:
                this.f1313c = Executors.defaultThreadFactory();
                this.f1312b = str;
                break;
            default:
                this.f1312b = str;
                this.f1313c = new AtomicInteger(1);
                break;
        }
    }
}
