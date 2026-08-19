package p164G8;

import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p036B8.C0848a;
import p301M.RunnableC5228j;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: G8.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3011e implements Runnable, Closeable {

    /* JADX INFO: renamed from: Y */
    public final Set f9078Y = Collections.newSetFromMap(new ConcurrentHashMap());

    public RunnableC3011e() {
        C0848a c0848a = C0848a.f2359Z;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c0848a.getClass();
        if (c0848a.f2360Y.isShutdown()) {
            return;
        }
        try {
            new WeakReference(this);
            c0848a.f2360Y.scheduleWithFixedDelay(new RunnableC5228j(this), 0L, 1L, timeUnit);
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C3013g c3013g : this.f9078Y) {
            synchronized (c3013g) {
                while (true) {
                    try {
                        Reference referencePoll = c3013g.f9085q0.poll();
                        if (referencePoll != null) {
                            c3013g.f9086r0.remove(referencePoll);
                            if (c3013g.f9090v0.compareAndSet(false, true)) {
                                RunnableC3011e runnableC3011e = (RunnableC3011e) C3013g.f9080w0.get();
                                if (runnableC3011e != null) {
                                    runnableC3011e.f9078Y.remove(c3013g);
                                }
                                c3013g.f9081Y.f9065Z.getClass();
                            }
                            c3013g.m3856i();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
