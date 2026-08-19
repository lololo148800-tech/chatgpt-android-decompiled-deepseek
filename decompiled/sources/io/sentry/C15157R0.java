package io.sentry;

import io.sentry.util.AbstractC15500e;

/* JADX INFO: renamed from: io.sentry.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15157R0 implements InterfaceC15172W0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15172W0 f47181a;

    public C15157R0() {
        if (AbstractC15500e.f48420a || !AbstractC15500e.f48421b) {
            this.f47181a = new C15355f1(1);
        } else {
            this.f47181a = new C15355f1(0);
        }
    }

    @Override // io.sentry.InterfaceC15172W0
    /* JADX INFO: renamed from: a */
    public final AbstractC15169V0 mo16338a() {
        return this.f47181a.mo16338a();
    }
}
