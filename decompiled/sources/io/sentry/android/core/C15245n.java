package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.android.core.internal.util.InterfaceC15239k;
import io.sentry.profilemeasurements.C15420b;

/* JADX INFO: renamed from: io.sentry.android.core.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15245n implements InterfaceC15239k {

    /* JADX INFO: renamed from: a */
    public float f47569a = 0.0f;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C15246o f47570b;

    public C15245n(C15246o c15246o) {
        this.f47570b = c15246o;
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC15239k
    /* JADX INFO: renamed from: b */
    public final void mo16417b(long j10, long j11, long j12, long j13, boolean z6, boolean z10, float f10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j11 - System.nanoTime());
        C15246o c15246o = this.f47570b;
        long j14 = jElapsedRealtimeNanos - c15246o.f47571a;
        if (j14 < 0) {
            return;
        }
        if (z10) {
            c15246o.f47580j.addLast(new C15420b(Long.valueOf(j14), Long.valueOf(j12)));
        } else if (z6) {
            c15246o.f47579i.addLast(new C15420b(Long.valueOf(j14), Long.valueOf(j12)));
        }
        if (f10 != this.f47569a) {
            this.f47569a = f10;
            c15246o.f47578h.addLast(new C15420b(Long.valueOf(j14), Float.valueOf(f10)));
        }
    }
}
