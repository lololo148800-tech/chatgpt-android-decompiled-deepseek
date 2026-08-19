package io.sentry.android.core.performance;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.core.performance.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15252e implements Comparable {

    /* JADX INFO: renamed from: Y */
    public String f47616Y;

    /* JADX INFO: renamed from: Z */
    public long f47617Z;

    /* JADX INFO: renamed from: o0 */
    public long f47618o0;

    /* JADX INFO: renamed from: p0 */
    public long f47619p0;

    /* JADX INFO: renamed from: a */
    public final boolean m16456a() {
        return this.f47619p0 == 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16457b() {
        return this.f47618o0 != 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16458c() {
        return this.f47619p0 != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f47617Z, ((C15252e) obj).f47617Z);
    }

    /* JADX INFO: renamed from: d */
    public final void m16459d(long j10) {
        this.f47618o0 = j10;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f47618o0;
        this.f47617Z = System.currentTimeMillis() - jUptimeMillis;
        System.nanoTime();
        TimeUnit.MILLISECONDS.toNanos(jUptimeMillis);
    }
}
