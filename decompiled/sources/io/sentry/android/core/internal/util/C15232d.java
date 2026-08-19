package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p821j1.C16037b;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15232d {

    /* JADX INFO: renamed from: a */
    public long f47530a;

    /* JADX INFO: renamed from: b */
    public int f47531b;

    /* JADX INFO: renamed from: c */
    public Object f47532c;

    /* JADX INFO: renamed from: d */
    public Object f47533d;

    /* JADX INFO: renamed from: e */
    public final Object f47534e;

    public C15232d(long j10, int i10) {
        C15230b c15230b = C15230b.f47526a;
        this.f47533d = new AtomicInteger(0);
        this.f47534e = new AtomicLong(0L);
        this.f47532c = c15230b;
        this.f47530a = j10;
        this.f47531b = i10 <= 0 ? 1 : i10;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16440a() {
        ((C15230b) this.f47532c).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = (AtomicLong) this.f47534e;
        long j10 = atomicLong.get();
        AtomicInteger atomicInteger = (AtomicInteger) this.f47533d;
        if (j10 == 0 || atomicLong.get() + this.f47530a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f47531b) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public C15232d() {
        this.f47530a = 0L;
        this.f47531b = 0;
        this.f47534e = new C16037b();
    }
}
