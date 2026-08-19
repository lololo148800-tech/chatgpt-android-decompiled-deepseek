package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: renamed from: io.sentry.transport.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C15490m extends AbstractQueuedSynchronizer {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ int f48382Y = 0;

    public C15490m() {
        setState(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m16681a(C15490m c15490m) {
        return c15490m.getState();
    }

    /* JADX INFO: renamed from: b */
    public static void m16682b(C15490m c15490m) {
        int state;
        do {
            state = c15490m.getState();
        } while (!c15490m.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i10) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i10) {
        int state;
        int i11;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i11 = state - 1;
        } while (!compareAndSetState(state, i11));
        return i11 == 0;
    }
}
