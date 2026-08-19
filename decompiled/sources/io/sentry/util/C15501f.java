package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.util.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15501f implements Serializable {

    /* JADX INFO: renamed from: Z */
    public static final AtomicLong f48422Z = new AtomicLong(8682522807148012L);

    /* JADX INFO: renamed from: Y */
    public final AtomicLong f48423Y;

    public C15501f() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f48422Z;
            j10 = atomicLong.get();
            j11 = 1181783497276652981L * j10;
        } while (!atomicLong.compareAndSet(j10, j11));
        this.f48423Y = new AtomicLong(((System.nanoTime() ^ j11) ^ 25214903917L) & 281474976710655L);
    }

    /* JADX INFO: renamed from: a */
    public final int m16685a(int i10) {
        long j10;
        long j11;
        AtomicLong atomicLong = this.f48423Y;
        do {
            j10 = atomicLong.get();
            j11 = ((25214903917L * j10) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return (int) (j11 >>> (48 - i10));
    }

    /* JADX INFO: renamed from: b */
    public final double m16686b() {
        return ((((long) m16685a(26)) << 27) + ((long) m16685a(27))) * 1.1102230246251565E-16d;
    }
}
