package io.sentry.android.core;

import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.hints.InterfaceC15365d;
import io.sentry.hints.InterfaceC15367f;
import io.sentry.hints.InterfaceC15368g;
import io.sentry.hints.InterfaceC15371j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C15188F implements InterfaceC15365d, InterfaceC15368g, InterfaceC15371j, InterfaceC15367f {

    /* JADX INFO: renamed from: p0 */
    public final long f47327p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC15127H f47328q0;

    /* JADX INFO: renamed from: o0 */
    public CountDownLatch f47326o0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: Y */
    public boolean f47324Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f47325Z = false;

    public C15188F(long j10, InterfaceC15127H interfaceC15127H) {
        this.f47327p0 = j10;
        AbstractC8483G3.m9133c(interfaceC15127H, "ILogger is required.");
        this.f47328q0 = interfaceC15127H;
    }

    @Override // io.sentry.hints.InterfaceC15368g
    /* JADX INFO: renamed from: a */
    public final boolean mo16388a() {
        return this.f47324Y;
    }

    @Override // io.sentry.hints.InterfaceC15371j
    /* JADX INFO: renamed from: b */
    public final void mo16389b(boolean z6) {
        this.f47325Z = z6;
        this.f47326o0.countDown();
    }

    @Override // io.sentry.hints.InterfaceC15368g
    /* JADX INFO: renamed from: c */
    public final void mo16390c(boolean z6) {
        this.f47324Y = z6;
    }

    @Override // io.sentry.hints.InterfaceC15367f
    /* JADX INFO: renamed from: d */
    public final boolean mo16391d() {
        try {
            return this.f47326o0.await(this.f47327p0, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f47328q0.mo16297h(EnumC15375i1.ERROR, "Exception while awaiting on lock.", e10);
            return false;
        }
    }

    @Override // io.sentry.hints.InterfaceC15371j
    /* JADX INFO: renamed from: e */
    public final boolean mo16392e() {
        return this.f47325Z;
    }
}
