package io.sentry.hints;

import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.protocol.C15447t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.hints.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15364c implements InterfaceC15367f {

    /* JADX INFO: renamed from: Y */
    public final CountDownLatch f47949Y = new CountDownLatch(1);

    /* JADX INFO: renamed from: Z */
    public final long f47950Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC15127H f47951o0;

    public AbstractC15364c(long j10, InterfaceC15127H interfaceC15127H) {
        this.f47950Z = j10;
        this.f47951o0 = interfaceC15127H;
    }

    @Override // io.sentry.hints.InterfaceC15367f
    /* JADX INFO: renamed from: d */
    public final boolean mo16391d() {
        try {
            return this.f47949Y.await(this.f47950Z, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f47951o0.mo16297h(EnumC15375i1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo16357f(C15447t c15447t);

    /* JADX INFO: renamed from: g */
    public abstract void mo16358g(C15447t c15447t);
}
