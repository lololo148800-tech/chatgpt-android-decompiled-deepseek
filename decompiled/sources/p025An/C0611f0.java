package p025An;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p301M.RunnableC5228j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0611f0 extends AbstractC0609e0 implements InterfaceC0585M {

    /* JADX INFO: renamed from: Z */
    public final Executor f1855Z;

    public C0611f0(Executor executor) {
        this.f1855Z = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: S */
    public final InterfaceC0595V mo1199S(long j10, Runnable runnable, InterfaceC18776i interfaceC18776i) {
        Executor executor = this.f1855Z;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                AbstractC0575H.m1181j(interfaceC18776i, AbstractC0575H.m1172a("The task was rejected", e10));
            }
        }
        return scheduledFutureSchedule != null ? new C0594U(scheduledFutureSchedule) : RunnableC0577I.f1807u0.mo1199S(j10, runnable, interfaceC18776i);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        try {
            this.f1855Z.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC0575H.m1181j(interfaceC18776i, AbstractC0575H.m1172a("The task was rejected", e10));
            C3516e c3516e = AbstractC0593T.f1824a;
            ExecutorC3515d.f10633Z.mo872V0(interfaceC18776i, runnable);
        }
    }

    @Override // p025An.AbstractC0609e0
    /* JADX INFO: renamed from: Z0 */
    public final Executor mo1243Z0() {
        return this.f1855Z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1855Z;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0611f0) && ((C0611f0) obj).f1855Z == this.f1855Z;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1855Z);
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: k */
    public final void mo1211k(long j10, C0624m c0624m) {
        Executor executor = this.f1855Z;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC5228j(this, 1, c0624m), j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                AbstractC0575H.m1181j(c0624m.f1874q0, AbstractC0575H.m1172a("The task was rejected", e10));
            }
        }
        if (scheduledFutureSchedule != null) {
            c0624m.m1265v(new C0616i(scheduledFutureSchedule, 0));
        } else {
            RunnableC0577I.f1807u0.mo1211k(j10, c0624m);
        }
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return this.f1855Z.toString();
    }
}
