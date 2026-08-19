package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11879I0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: o0 */
    public static final RunnableC12020w0 f36144o0 = new RunnableC12020w0();

    /* JADX INFO: renamed from: p0 */
    public static final RunnableC12020w0 f36145p0 = new RunnableC12020w0();

    /* JADX INFO: renamed from: Y */
    public final Callable f36146Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RunnableFutureC11882J0 f36147Z;

    public RunnableC11879I0(RunnableFutureC11882J0 runnableFutureC11882J0, Callable callable) {
        this.f36147Z = runnableFutureC11882J0;
        callable.getClass();
        this.f36146Y = callable;
    }

    /* JADX INFO: renamed from: a */
    public final void m13273a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC12016v0 runnableC12016v0 = null;
        boolean z6 = false;
        int i10 = 0;
        while (true) {
            boolean z10 = runnable instanceof RunnableC12016v0;
            RunnableC12020w0 runnableC12020w0 = f36145p0;
            if (!z10) {
                if (runnable != runnableC12020w0) {
                    break;
                }
            } else {
                runnableC12016v0 = (RunnableC12016v0) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC12020w0 || compareAndSet(runnable, runnableC12020w0)) {
                z6 = Thread.interrupted() || z6;
                LockSupport.park(runnableC12016v0);
            }
            runnable = (Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            RunnableFutureC11882J0 runnableFutureC11882J0 = this.f36147Z;
            boolean zIsDone = runnableFutureC11882J0.isDone();
            RunnableC12020w0 runnableC12020w0 = f36144o0;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f36146Y.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC12020w0)) {
                            m13273a(threadCurrentThread);
                        }
                        runnableFutureC11882J0.m13496e(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, runnableC12020w0)) {
                            m13273a(threadCurrentThread);
                        }
                        runnableFutureC11882J0.getClass();
                        if (AbstractC11984n0.f36302r0.mo13423L(runnableFutureC11882J0, null, AbstractC11984n0.f36303s0)) {
                            AbstractC11984n0.m13493i(runnableFutureC11882J0);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC12020w0)) {
                m13273a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            runnableFutureC11882J0.getClass();
            if (objCall == null) {
                objCall = AbstractC11984n0.f36303s0;
            }
            if (AbstractC11984n0.f36302r0.mo13423L(runnableFutureC11882J0, null, objCall)) {
                AbstractC11984n0.m13493i(runnableFutureC11882J0);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strM11054l;
        Runnable runnable = (Runnable) get();
        if (runnable == f36144o0) {
            strM11054l = "running=[DONE]";
        } else if (runnable instanceof RunnableC12016v0) {
            strM11054l = "running=[INTERRUPTED]";
        } else {
            strM11054l = runnable instanceof Thread ? AbstractC10763a.m11054l("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return AbstractC9306j0.m9890i(strM11054l, ", ", this.f36146Y.toString());
    }
}
