package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import p198Hk.C3459b;

/* JADX INFO: renamed from: io.sentry.android.replay.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15300n implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final AtomicBoolean f47791Y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Z */
    public final Object f47792Z = new Object();

    /* JADX INFO: renamed from: o0 */
    public final C15299m f47793o0 = new C15299m(this);

    /* JADX INFO: renamed from: p0 */
    public final C3459b f47794p0 = new C3459b(this, 1);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47791Y.set(true);
        this.f47793o0.clear();
    }
}
