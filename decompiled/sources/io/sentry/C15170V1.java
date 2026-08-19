package io.sentry;

import io.sentry.hints.AbstractC15364c;
import io.sentry.hints.InterfaceC15369h;
import io.sentry.hints.InterfaceC15372k;
import io.sentry.protocol.C15447t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.V1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15170V1 extends AbstractC15364c implements InterfaceC15369h, InterfaceC15372k {

    /* JADX INFO: renamed from: p0 */
    public final AtomicReference f47232p0;

    public C15170V1(long j10, InterfaceC15127H interfaceC15127H) {
        super(j10, interfaceC15127H);
        this.f47232p0 = new AtomicReference();
    }

    @Override // io.sentry.hints.AbstractC15364c
    /* JADX INFO: renamed from: f */
    public final boolean mo16357f(C15447t c15447t) {
        C15447t c15447t2 = (C15447t) this.f47232p0.get();
        return c15447t2 != null && c15447t2.equals(c15447t);
    }

    @Override // io.sentry.hints.AbstractC15364c
    /* JADX INFO: renamed from: g */
    public final void mo16358g(C15447t c15447t) {
        this.f47232p0.set(c15447t);
    }
}
