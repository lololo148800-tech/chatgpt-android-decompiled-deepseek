package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.sentry.C15109B;
import io.sentry.C15347d1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.exception.C15351a;
import io.sentry.protocol.C15437j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p544W9.AbstractC8465D3;
import p561X.C8990d;
import p571X9.AbstractC9306j0;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: io.sentry.android.core.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15208a extends Thread {

    /* JADX INFO: renamed from: Y */
    public final boolean f47439Y;

    /* JADX INFO: renamed from: Z */
    public final C15254r f47440Z;

    /* JADX INFO: renamed from: o0 */
    public final C15184B f47441o0;

    /* JADX INFO: renamed from: p0 */
    public final C8990d f47442p0;

    /* JADX INFO: renamed from: q0 */
    public final long f47443q0;

    /* JADX INFO: renamed from: r0 */
    public final long f47444r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC15127H f47445s0;

    /* JADX INFO: renamed from: t0 */
    public volatile long f47446t0;

    /* JADX INFO: renamed from: u0 */
    public final AtomicBoolean f47447u0;

    /* JADX INFO: renamed from: v0 */
    public final Context f47448v0;

    /* JADX INFO: renamed from: w0 */
    public final RunnableC13542a f47449w0;

    public C15208a(long j10, boolean z6, C15254r c15254r, InterfaceC15127H interfaceC15127H, Context context) {
        C8990d c8990d = new C8990d(18);
        C15184B c15184b = new C15184B();
        super("|ANR-WatchDog|");
        this.f47446t0 = 0L;
        this.f47447u0 = new AtomicBoolean(false);
        this.f47442p0 = c8990d;
        this.f47444r0 = j10;
        this.f47443q0 = 500L;
        this.f47439Y = z6;
        this.f47440Z = c15254r;
        this.f47445s0 = interfaceC15127H;
        this.f47441o0 = c15184b;
        this.f47448v0 = context;
        this.f47449w0 = new RunnableC13542a(this, c8990d);
        if (j10 < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.f47449w0.run();
        while (!isInterrupted()) {
            ((Handler) this.f47441o0.f47305a).post(this.f47449w0);
            try {
                Thread.sleep(this.f47443q0);
                this.f47442p0.getClass();
                if (SystemClock.uptimeMillis() - this.f47446t0 > this.f47444r0) {
                    if (this.f47439Y || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.f47448v0.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f47445s0.mo16297h(EnumC15375i1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.f47447u0.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(((Handler) this.f47441o0.f47305a).getLooper().getThread(), AbstractC10763a.m11050h(this.f47444r0, " ms.", new StringBuilder("Application Not Responding for at least ")));
                            C15254r c15254r = this.f47440Z;
                            ((AnrIntegration) c15254r.f47623o0).getClass();
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c15254r.f47622Z;
                            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(C15183A.f47265b.f47266a);
                            String strM9889h = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strM9889h = AbstractC9306j0.m9889h("Background ", strM9889h);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(applicationNotResponding.f47303Y, strM9889h);
                            C15437j c15437j = new C15437j();
                            c15437j.f48157Y = "ANR";
                            C15347d1 c15347d1 = new C15347d1(new C15351a(c15437j, applicationNotResponding2, applicationNotResponding2.f47303Y, true));
                            c15347d1.f47919G0 = EnumC15375i1.ERROR;
                            C15109B.f47017a.mo16239F(c15347d1, AbstractC8465D3.m9087a(new C15255s(zEquals)));
                        }
                    } else {
                        this.f47445s0.mo16298o(EnumC15375i1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f47447u0.set(true);
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f47445s0.mo16298o(EnumC15375i1.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f47445s0.mo16298o(EnumC15375i1.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }
}
