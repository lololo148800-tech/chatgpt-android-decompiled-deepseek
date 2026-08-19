package p025An;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p530Vi.AbstractC8301I;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.I */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0577I extends AbstractC0605c0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u0 */
    public static final RunnableC0577I f1807u0;

    /* JADX INFO: renamed from: v0 */
    public static final long f1808v0;

    static {
        Long l4;
        RunnableC0577I runnableC0577I = new RunnableC0577I();
        f1807u0 = runnableC0577I;
        runnableC0577I.m1240c1(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f1808v0 = timeUnit.toNanos(l4.longValue());
    }

    @Override // p025An.AbstractC0605c0, p025An.InterfaceC0585M
    /* JADX INFO: renamed from: S */
    public final InterfaceC0595V mo1199S(long j10, Runnable runnable, InterfaceC18776i interfaceC18776i) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return C0649y0.f1903Y;
        }
        long jNanoTime = System.nanoTime();
        C0599Z c0599z = new C0599Z(runnable, j11 + jNanoTime);
        m1235l1(jNanoTime, c0599z);
        return c0599z;
    }

    @Override // p025An.AbstractC0607d0
    /* JADX INFO: renamed from: b1 */
    public final Thread mo1200b1() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f1807u0.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // p025An.AbstractC0607d0
    /* JADX INFO: renamed from: g1 */
    public final void mo1201g1(long j10, AbstractRunnableC0601a0 abstractRunnableC0601a0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p025An.AbstractC0605c0
    /* JADX INFO: renamed from: h1 */
    public final void mo1202h1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo1202h1(runnable);
    }

    /* JADX INFO: renamed from: m1 */
    public final synchronized void m1203m1() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            AbstractC0605c0.f1842r0.set(this, null);
            AbstractC0605c0.f1843s0.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0570E0.f1786a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    _thread = null;
                    m1203m1();
                    if (m1234k1()) {
                        return;
                    }
                    mo1200b1();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                long j11 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo1231e1 = mo1231e1();
                    if (jMo1231e1 == j10) {
                        long jNanoTime = System.nanoTime();
                        if (j11 == j10) {
                            j11 = f1808v0 + jNanoTime;
                        }
                        long j12 = j11 - jNanoTime;
                        if (j12 <= 0) {
                            _thread = null;
                            m1203m1();
                            if (m1234k1()) {
                                return;
                            }
                            mo1200b1();
                            return;
                        }
                        jMo1231e1 = AbstractC8301I.m8918i(jMo1231e1, j12);
                    } else {
                        j11 = Long.MAX_VALUE;
                    }
                    if (jMo1231e1 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            m1203m1();
                            if (m1234k1()) {
                                return;
                            }
                            mo1200b1();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo1231e1);
                    }
                    j10 = Long.MAX_VALUE;
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            m1203m1();
            if (!m1234k1()) {
                mo1200b1();
            }
            throw th2;
        }
    }

    @Override // p025An.AbstractC0605c0, p025An.AbstractC0607d0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return "DefaultExecutor";
    }
}
