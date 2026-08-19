package p301M;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p167Gb.C3032c;
import p610Z1.C10142i;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: M.d */
/* JADX INFO: loaded from: classes.dex */
public class C5222d implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: Y */
    public final InterfaceFutureC13608b f16959Y;

    /* JADX INFO: renamed from: Z */
    public C10142i f16960Z;

    public C5222d(InterfaceFutureC13608b interfaceFutureC13608b) {
        interfaceFutureC13608b.getClass();
        this.f16959Y = interfaceFutureC13608b;
    }

    /* JADX INFO: renamed from: c */
    public static C5222d m5765c(InterfaceFutureC13608b interfaceFutureC13608b) {
        return interfaceFutureC13608b instanceof C5222d ? (C5222d) interfaceFutureC13608b : new C5222d(interfaceFutureC13608b);
    }

    @Override // p747fb.InterfaceFutureC13608b
    /* JADX INFO: renamed from: a */
    public final void mo5766a(Runnable runnable, Executor executor) {
        this.f16959Y.mo5766a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f16959Y.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f16959Y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16959Y.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16959Y.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f16959Y.get(j10, timeUnit);
    }

    public C5222d() {
        this.f16959Y = AbstractC16347a.m17947b(new C3032c(this, 12));
    }
}
