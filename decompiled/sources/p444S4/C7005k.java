package p444S4;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p025An.C0631p0;
import p402Qc.C6593i;
import p697d5.C13018a;
import p697d5.C13027j;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: S4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7005k implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: Y */
    public final C13027j f22413Y = new C13027j();

    public C7005k(C0631p0 c0631p0) {
        c0631p0.mo1271H0(new C6593i(this, 6));
    }

    @Override // p747fb.InterfaceFutureC13608b
    /* JADX INFO: renamed from: a */
    public final void mo5766a(Runnable runnable, Executor executor) {
        this.f22413Y.mo5766a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f22413Y.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f22413Y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f22413Y.f41326Y instanceof C13018a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f22413Y.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f22413Y.get(j10, timeUnit);
    }
}
