package io.sentry;

import io.sentry.hints.InterfaceC15365d;
import io.sentry.hints.InterfaceC15367f;
import io.sentry.hints.InterfaceC15368g;
import io.sentry.hints.InterfaceC15371j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15400l implements InterfaceC15365d, InterfaceC15368g, InterfaceC15371j, InterfaceC15367f {

    /* JADX INFO: renamed from: Y */
    public boolean f48010Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f48011Z = false;

    /* JADX INFO: renamed from: o0 */
    public final CountDownLatch f48012o0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: p0 */
    public final long f48013p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC15127H f48014q0;

    /* JADX INFO: renamed from: r0 */
    public final String f48015r0;

    /* JADX INFO: renamed from: s0 */
    public final C15153P1 f48016s0;

    public C15400l(long j10, InterfaceC15127H interfaceC15127H, String str, C15153P1 c15153p1) {
        this.f48013p0 = j10;
        this.f48015r0 = str;
        this.f48016s0 = c15153p1;
        this.f48014q0 = interfaceC15127H;
    }

    @Override // io.sentry.hints.InterfaceC15368g
    /* JADX INFO: renamed from: a */
    public final boolean mo16388a() {
        return this.f48010Y;
    }

    @Override // io.sentry.hints.InterfaceC15371j
    /* JADX INFO: renamed from: b */
    public final void mo16389b(boolean z6) {
        this.f48011Z = z6;
        this.f48012o0.countDown();
    }

    @Override // io.sentry.hints.InterfaceC15368g
    /* JADX INFO: renamed from: c */
    public final void mo16390c(boolean z6) {
        this.f48010Y = z6;
    }

    @Override // io.sentry.hints.InterfaceC15367f
    /* JADX INFO: renamed from: d */
    public final boolean mo16391d() {
        try {
            return this.f48012o0.await(this.f48013p0, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f48014q0.mo16297h(EnumC15375i1.ERROR, "Exception while awaiting on lock.", e10);
            return false;
        }
    }

    @Override // io.sentry.hints.InterfaceC15371j
    /* JADX INFO: renamed from: e */
    public final boolean mo16392e() {
        return this.f48011Z;
    }
}
