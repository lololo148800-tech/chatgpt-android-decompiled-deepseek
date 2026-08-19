package io.sentry.android.core;

import io.sentry.InterfaceC15127H;
import io.sentry.hints.AbstractC15364c;
import io.sentry.hints.InterfaceC15362a;
import io.sentry.hints.InterfaceC15363b;
import io.sentry.protocol.C15447t;

/* JADX INFO: renamed from: io.sentry.android.core.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C15259w extends AbstractC15364c implements InterfaceC15363b, InterfaceC15362a {

    /* JADX INFO: renamed from: p0 */
    public final long f47632p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f47633q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f47634r0;

    public C15259w(long j10, InterfaceC15127H interfaceC15127H, long j11, boolean z6, boolean z10) {
        super(j10, interfaceC15127H);
        this.f47632p0 = j11;
        this.f47633q0 = z6;
        this.f47634r0 = z10;
    }

    @Override // io.sentry.hints.InterfaceC15363b
    /* JADX INFO: renamed from: a */
    public final boolean mo16488a() {
        return this.f47633q0;
    }

    @Override // io.sentry.hints.InterfaceC15362a
    /* JADX INFO: renamed from: b */
    public final Long mo16460b() {
        return Long.valueOf(this.f47632p0);
    }

    @Override // io.sentry.hints.InterfaceC15362a
    /* JADX INFO: renamed from: c */
    public final boolean mo16461c() {
        return false;
    }

    @Override // io.sentry.hints.InterfaceC15362a
    /* JADX INFO: renamed from: e */
    public final String mo16462e() {
        return this.f47634r0 ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.AbstractC15364c
    /* JADX INFO: renamed from: f */
    public final boolean mo16357f(C15447t c15447t) {
        return true;
    }

    @Override // io.sentry.hints.AbstractC15364c
    /* JADX INFO: renamed from: g */
    public final void mo16358g(C15447t c15447t) {
    }
}
