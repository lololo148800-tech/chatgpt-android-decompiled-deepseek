package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC11882J0 extends AbstractC12004s0 implements RunnableFuture {

    /* JADX INFO: renamed from: t0 */
    public volatile RunnableC11879I0 f36150t0;

    public RunnableFutureC11882J0(Callable callable) {
        this.f36150t0 = new RunnableC11879I0(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11984n0
    /* JADX INFO: renamed from: c */
    public final String mo13260c() {
        RunnableC11879I0 runnableC11879I0 = this.f36150t0;
        return runnableC11879I0 != null ? AbstractC10763a.m11054l("task=[", runnableC11879I0.toString(), "]") : super.mo13260c();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11984n0
    /* JADX INFO: renamed from: d */
    public final void mo13268d() {
        RunnableC11879I0 runnableC11879I0;
        Object obj = this.f36304Y;
        if (((obj instanceof C11944d0) && ((C11944d0) obj).f36249a) && (runnableC11879I0 = this.f36150t0) != null) {
            RunnableC12020w0 runnableC12020w0 = RunnableC11879I0.f36145p0;
            RunnableC12020w0 runnableC12020w1 = RunnableC11879I0.f36144o0;
            Runnable runnable = (Runnable) runnableC11879I0.get();
            if (runnable instanceof Thread) {
                RunnableC12016v0 runnableC12016v0 = new RunnableC12016v0(runnableC11879I0);
                runnableC12016v0.setExclusiveOwnerThread(Thread.currentThread());
                if (runnableC11879I0.compareAndSet(runnable, runnableC12016v0)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) runnableC11879I0.getAndSet(runnableC12020w1)) == runnableC12020w0) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) runnableC11879I0.getAndSet(runnableC12020w1)) == runnableC12020w0) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th2;
                    }
                }
            }
        }
        this.f36150t0 = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        RunnableC11879I0 runnableC11879I0 = this.f36150t0;
        if (runnableC11879I0 != null) {
            runnableC11879I0.run();
        }
        this.f36150t0 = null;
    }
}
