package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11864D0 extends AbstractC11984n0 implements Runnable, InterfaceC11968j0 {

    /* JADX INFO: renamed from: t0 */
    public final Runnable f36118t0;

    public RunnableC11864D0(Runnable runnable) {
        runnable.getClass();
        this.f36118t0 = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11984n0
    /* JADX INFO: renamed from: c */
    public final String mo13260c() {
        return AbstractC10763a.m11054l("task=[", this.f36118t0.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f36118t0.run();
        } catch (Throwable th2) {
            m13496e(th2);
            throw th2;
        }
    }
}
