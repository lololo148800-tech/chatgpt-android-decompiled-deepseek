package p610Z1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: Z1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10145l implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: Y */
    public final WeakReference f30069Y;

    /* JADX INFO: renamed from: Z */
    public final C10144k f30070Z = new C10144k(this);

    public C10145l(C10142i c10142i) {
        this.f30069Y = new WeakReference(c10142i);
    }

    @Override // p747fb.InterfaceFutureC13608b
    /* JADX INFO: renamed from: a */
    public final void mo5766a(Runnable runnable, Executor executor) {
        this.f30070Z.mo5766a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        C10142i c10142i = (C10142i) this.f30069Y.get();
        boolean zCancel = this.f30070Z.cancel(z6);
        if (zCancel && c10142i != null) {
            c10142i.f30064a = null;
            c10142i.f30065b = null;
            c10142i.f30066c.m10745k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f30070Z.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f30070Z.f30061Y instanceof C10134a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f30070Z.isDone();
    }

    public final String toString() {
        return this.f30070Z.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f30070Z.get(j10, timeUnit);
    }
}
