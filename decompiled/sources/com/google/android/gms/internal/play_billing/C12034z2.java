package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12034z2 implements InterfaceFutureC12028y0 {

    /* JADX INFO: renamed from: Y */
    public final WeakReference f36367Y;

    /* JADX INFO: renamed from: Z */
    public final C12030y2 f36368Z = new C12030y2(this);

    public C12034z2(C12026x2 c12026x2) {
        this.f36367Y = new WeakReference(c12026x2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC12028y0
    /* JADX INFO: renamed from: b */
    public final void mo13259b(Runnable runnable, Executor executor) {
        this.f36368Z.mo13259b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        C12026x2 c12026x2 = (C12026x2) this.f36367Y.get();
        boolean zCancel = this.f36368Z.cancel(z6);
        if (!zCancel || c12026x2 == null) {
            return zCancel;
        }
        c12026x2.f36357a = null;
        c12026x2.f36358b = null;
        c12026x2.f36359c.m13220i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f36368Z.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36368Z.f36349Y instanceof C11920W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f36368Z.isDone();
    }

    public final String toString() {
        return this.f36368Z.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f36368Z.get(j10, timeUnit);
    }
}
