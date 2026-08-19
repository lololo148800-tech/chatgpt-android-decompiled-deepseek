package p301M;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: M.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5220b extends C5222d implements Runnable {

    /* JADX INFO: renamed from: o0 */
    public InterfaceC5219a f16954o0;

    /* JADX INFO: renamed from: p0 */
    public final LinkedBlockingQueue f16955p0 = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: q0 */
    public final CountDownLatch f16956q0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: r0 */
    public InterfaceFutureC13608b f16957r0;

    /* JADX INFO: renamed from: s0 */
    public volatile InterfaceFutureC13608b f16958s0;

    public RunnableC5220b(InterfaceC5219a interfaceC5219a, InterfaceFutureC13608b interfaceFutureC13608b) {
        this.f16954o0 = interfaceC5219a;
        interfaceFutureC13608b.getClass();
        this.f16957r0 = interfaceFutureC13608b;
    }

    /* JADX INFO: renamed from: d */
    public static Object m5764d(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z6 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th2) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // p301M.C5222d, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean z10 = false;
        if (!this.f16959Y.cancel(z6)) {
            return false;
        }
        while (true) {
            try {
                this.f16955p0.put(Boolean.valueOf(z6));
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        InterfaceFutureC13608b interfaceFutureC13608b = this.f16957r0;
        if (interfaceFutureC13608b != null) {
            interfaceFutureC13608b.cancel(z6);
        }
        InterfaceFutureC13608b interfaceFutureC13608b2 = this.f16958s0;
        if (interfaceFutureC13608b2 != null) {
            interfaceFutureC13608b2.cancel(z6);
        }
        return true;
    }

    @Override // p301M.C5222d, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f16959Y.isDone()) {
            InterfaceFutureC13608b interfaceFutureC13608b = this.f16957r0;
            if (interfaceFutureC13608b != null) {
                interfaceFutureC13608b.get();
            }
            this.f16956q0.await();
            InterfaceFutureC13608b interfaceFutureC13608b2 = this.f16958s0;
            if (interfaceFutureC13608b2 != null) {
                interfaceFutureC13608b2.get();
            }
        }
        return this.f16959Y.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    try {
                        try {
                            InterfaceFutureC13608b interfaceFutureC13608bApply = this.f16954o0.apply(AbstractC5229k.m5778b(this.f16957r0));
                            this.f16958s0 = interfaceFutureC13608bApply;
                            if (this.f16959Y.isCancelled()) {
                                interfaceFutureC13608bApply.cancel(((Boolean) m5764d(this.f16955p0)).booleanValue());
                                this.f16958s0 = null;
                            } else {
                                interfaceFutureC13608bApply.mo5766a(new RunnableC5228j(this, interfaceFutureC13608bApply, false, 5), AbstractC8577W2.m9240b());
                            }
                        } catch (Exception e10) {
                            C10142i c10142i = this.f16960Z;
                            if (c10142i != null) {
                                c10142i.m10748b(e10);
                            }
                        }
                    } catch (Error e11) {
                        C10142i c10142i2 = this.f16960Z;
                        if (c10142i2 != null) {
                            c10142i2.m10748b(e11);
                        }
                    }
                } finally {
                    this.f16954o0 = null;
                    this.f16957r0 = null;
                    this.f16956q0.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                C10142i c10142i3 = this.f16960Z;
                if (c10142i3 != null) {
                    c10142i3.m10748b(cause);
                }
            }
        } catch (UndeclaredThrowableException e13) {
            Throwable cause2 = e13.getCause();
            C10142i c10142i4 = this.f16960Z;
            if (c10142i4 != null) {
                c10142i4.m10748b(cause2);
            }
        }
    }

    @Override // p301M.C5222d, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f16959Y.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC13608b interfaceFutureC13608b = this.f16957r0;
            if (interfaceFutureC13608b != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC13608b.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f16956q0.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC13608b interfaceFutureC13608b2 = this.f16958s0;
                if (interfaceFutureC13608b2 != null) {
                    interfaceFutureC13608b2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f16959Y.get(j10, timeUnit);
    }
}
