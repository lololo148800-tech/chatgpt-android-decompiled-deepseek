package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11870F0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public C11876H0 f36124Y;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC12028y0 interfaceFutureC12028y0;
        C11948e0 c11948e0;
        C11876H0 c11876h0 = this.f36124Y;
        if (c11876h0 == null || (interfaceFutureC12028y0 = c11876h0.f36135t0) == null) {
            return;
        }
        this.f36124Y = null;
        if (interfaceFutureC12028y0.isDone()) {
            Object obj = c11876h0.f36304Y;
            if (obj == null) {
                if (interfaceFutureC12028y0.isDone()) {
                    if (AbstractC11984n0.f36302r0.mo13423L(c11876h0, null, AbstractC11984n0.m13491f(interfaceFutureC12028y0))) {
                        AbstractC11984n0.m13493i(c11876h0);
                        return;
                    }
                    return;
                }
                RunnableC11960h0 runnableC11960h0 = new RunnableC11960h0(c11876h0, interfaceFutureC12028y0);
                if (AbstractC11984n0.f36302r0.mo13423L(c11876h0, null, runnableC11960h0)) {
                    try {
                        interfaceFutureC12028y0.mo13259b(runnableC11960h0, EnumC12000r0.f36313Y);
                        return;
                    } catch (Throwable th2) {
                        try {
                            c11948e0 = new C11948e0(th2);
                        } catch (Error | Exception unused) {
                            c11948e0 = C11948e0.f36253b;
                        }
                        AbstractC11984n0.f36302r0.mo13423L(c11876h0, runnableC11960h0, c11948e0);
                        return;
                    }
                }
                obj = c11876h0.f36304Y;
            }
            if (obj instanceof C11944d0) {
                interfaceFutureC12028y0.cancel(((C11944d0) obj).f36249a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c11876h0.f36136u0;
            c11876h0.f36136u0 = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    c11876h0.m13496e(new C11873G0(str));
                    throw th3;
                }
            }
            c11876h0.m13496e(new C11873G0(str + ": " + interfaceFutureC12028y0.toString()));
            interfaceFutureC12028y0.cancel(true);
        } catch (Throwable th4) {
            interfaceFutureC12028y0.cancel(true);
            throw th4;
        }
    }
}
