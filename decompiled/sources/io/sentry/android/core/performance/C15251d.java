package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.C15402l1;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.core.performance.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15251d extends AbstractC15248a {

    /* JADX INFO: renamed from: w0 */
    public static final long f47604w0 = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: x0 */
    public static volatile C15251d f47605x0;

    /* JADX INFO: renamed from: Z */
    public boolean f47607Z;

    /* JADX INFO: renamed from: Y */
    public EnumC15250c f47606Y = EnumC15250c.UNKNOWN;

    /* JADX INFO: renamed from: t0 */
    public C15402l1 f47613t0 = null;

    /* JADX INFO: renamed from: u0 */
    public boolean f47614u0 = false;

    /* JADX INFO: renamed from: v0 */
    public boolean f47615v0 = false;

    /* JADX INFO: renamed from: o0 */
    public final C15252e f47608o0 = new C15252e();

    /* JADX INFO: renamed from: p0 */
    public final C15252e f47609p0 = new C15252e();

    /* JADX INFO: renamed from: q0 */
    public final C15252e f47610q0 = new C15252e();

    /* JADX INFO: renamed from: r0 */
    public final HashMap f47611r0 = new HashMap();

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f47612s0 = new ArrayList();

    public C15251d() {
        this.f47607Z = false;
        this.f47607Z = AbstractC15256t.m16473k();
    }

    /* JADX INFO: renamed from: b */
    public static C15251d m16451b() {
        if (f47605x0 == null) {
            synchronized (C15251d.class) {
                try {
                    if (f47605x0 == null) {
                        f47605x0 = new C15251d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47605x0;
    }

    /* JADX INFO: renamed from: c */
    public static void m16452c(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C15252e c15252e = new C15252e();
        c15252e.m16459d(jUptimeMillis);
        m16451b().f47611r0.put(contentProvider, c15252e);
    }

    /* JADX INFO: renamed from: d */
    public static void m16453d(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C15252e c15252e = (C15252e) m16451b().f47611r0.get(contentProvider);
        if (c15252e == null || !c15252e.m16456a()) {
            return;
        }
        c15252e.f47616Y = contentProvider.getClass().getName().concat(".onCreate");
        c15252e.f47619p0 = jUptimeMillis;
    }

    /* JADX INFO: renamed from: a */
    public final C15252e m16454a(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            C15252e c15252e = this.f47608o0;
            if (c15252e.m16457b()) {
                return (this.f47614u0 || !this.f47607Z) ? new C15252e() : c15252e;
            }
        }
        return (this.f47614u0 || !this.f47607Z) ? new C15252e() : this.f47609p0;
    }

    /* JADX INFO: renamed from: e */
    public final void m16455e(Application application) {
        if (this.f47615v0) {
            return;
        }
        boolean z6 = true;
        this.f47615v0 = true;
        if (!this.f47607Z && !AbstractC15256t.m16473k()) {
            z6 = false;
        }
        this.f47607Z = z6;
        application.registerActivityLifecycleCallbacks(f47605x0);
        new Handler(Looper.getMainLooper()).post(new RunnableC15249b(this, application, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jCurrentTimeMillis;
        if (this.f47607Z && this.f47613t0 == null) {
            this.f47613t0 = new C15402l1();
            C15252e c15252e = this.f47608o0;
            long j10 = c15252e.f47617Z;
            if (c15252e.m16458c()) {
                jCurrentTimeMillis = 0;
                if (c15252e.m16457b()) {
                    jCurrentTimeMillis = (c15252e.m16458c() ? c15252e.f47619p0 - c15252e.f47618o0 : 0L) + c15252e.f47617Z;
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (jCurrentTimeMillis - j10 > TimeUnit.MINUTES.toMillis(1L)) {
                this.f47614u0 = true;
            }
        }
    }
}
