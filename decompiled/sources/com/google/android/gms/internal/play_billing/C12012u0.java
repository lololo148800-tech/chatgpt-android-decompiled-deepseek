package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12012u0 implements InterfaceFutureC12028y0 {

    /* JADX INFO: renamed from: Y */
    public static final C12024x0 f36336Y = new C12024x0(C12012u0.class);

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC12028y0
    /* JADX INFO: renamed from: b */
    public final void mo13259b(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f36336Y.m13556a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", AbstractC10763a.m11055m("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Integer num = 0;
        return super.toString() + "[status=SUCCESS, result=[" + num.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return 0;
    }
}
