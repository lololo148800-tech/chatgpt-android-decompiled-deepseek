package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11876H0 extends AbstractC12004s0 {

    /* JADX INFO: renamed from: t0 */
    public InterfaceFutureC12028y0 f36135t0;

    /* JADX INFO: renamed from: u0 */
    public ScheduledFuture f36136u0;

    @Override // com.google.android.gms.internal.play_billing.AbstractC11984n0
    /* JADX INFO: renamed from: c */
    public final String mo13260c() {
        InterfaceFutureC12028y0 interfaceFutureC12028y0 = this.f36135t0;
        ScheduledFuture scheduledFuture = this.f36136u0;
        if (interfaceFutureC12028y0 == null) {
            return null;
        }
        String strM11054l = AbstractC10763a.m11054l("inputFuture=[", interfaceFutureC12028y0.toString(), "]");
        if (scheduledFuture == null) {
            return strM11054l;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strM11054l;
        }
        return strM11054l + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11984n0
    /* JADX INFO: renamed from: d */
    public final void mo13268d() {
        InterfaceFutureC12028y0 interfaceFutureC12028y0 = this.f36135t0;
        if ((interfaceFutureC12028y0 != null) & (this.f36304Y instanceof C11944d0)) {
            Object obj = this.f36304Y;
            interfaceFutureC12028y0.cancel((obj instanceof C11944d0) && ((C11944d0) obj).f36249a);
        }
        ScheduledFuture scheduledFuture = this.f36136u0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f36135t0 = null;
        this.f36136u0 = null;
    }
}
