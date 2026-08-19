package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11960h0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11984n0 f36271Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceFutureC12028y0 f36272Z;

    public RunnableC11960h0(AbstractC11984n0 abstractC11984n0, InterfaceFutureC12028y0 interfaceFutureC12028y0) {
        this.f36271Y = abstractC11984n0;
        this.f36272Z = interfaceFutureC12028y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f36271Y.f36304Y != this) {
            return;
        }
        InterfaceFutureC12028y0 interfaceFutureC12028y0 = this.f36272Z;
        if (AbstractC11984n0.f36302r0.mo13423L(this.f36271Y, this, AbstractC11984n0.m13491f(interfaceFutureC12028y0))) {
            AbstractC11984n0.m13493i(this.f36271Y);
        }
    }
}
