package io.sentry.transport;

import io.sentry.AbstractC15169V0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15172W0;
import io.sentry.ThreadFactoryC15522y;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p784hb.C14438g;

/* JADX INFO: renamed from: io.sentry.transport.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15489l extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: Y */
    public final int f48377Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC15169V0 f48378Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC15127H f48379o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC15172W0 f48380p0;

    /* JADX INFO: renamed from: q0 */
    public final C14438g f48381q0;

    public C15489l(int i10, ThreadFactoryC15522y threadFactoryC15522y, RejectedExecutionHandlerC15478a rejectedExecutionHandlerC15478a, InterfaceC15127H interfaceC15127H, InterfaceC15172W0 interfaceC15172W0) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC15522y, rejectedExecutionHandlerC15478a);
        this.f48378Z = null;
        this.f48381q0 = new C14438g(2);
        this.f48377Y = i10;
        this.f48379o0 = interfaceC15127H;
        this.f48380p0 = interfaceC15172W0;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        C14438g c14438g = this.f48381q0;
        try {
            super.afterExecute(runnable, th2);
        } finally {
            c14438g.getClass();
            int i10 = C15490m.f48382Y;
            ((C15490m) c14438g.f45414Y).releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C14438g c14438g = this.f48381q0;
        if (C15490m.m16681a((C15490m) c14438g.f45414Y) < this.f48377Y) {
            C15490m.m16682b((C15490m) c14438g.f45414Y);
            return super.submit(runnable);
        }
        this.f48378Z = this.f48380p0.mo16338a();
        this.f48379o0.mo16298o(EnumC15375i1.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC15488k();
    }
}
