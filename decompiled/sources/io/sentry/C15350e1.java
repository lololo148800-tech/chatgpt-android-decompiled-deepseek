package io.sentry;

import p817j$.time.Instant;

/* JADX INFO: renamed from: io.sentry.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15350e1 extends AbstractC15169V0 {

    /* JADX INFO: renamed from: Y */
    public final Instant f47929Y = Instant.now();

    @Override // io.sentry.AbstractC15169V0
    /* JADX INFO: renamed from: d */
    public final long mo16356d() {
        Instant instant = this.f47929Y;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
