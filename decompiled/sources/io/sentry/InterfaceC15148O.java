package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.O */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC15148O {
    /* JADX INFO: renamed from: d */
    void mo15965d(long j10);

    /* JADX INFO: renamed from: m */
    boolean mo15969m();

    /* JADX INFO: renamed from: r */
    Future mo15970r(Runnable runnable, long j10);

    Future submit(Runnable runnable);
}
