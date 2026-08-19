package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.view.View;
import com.auth0.android.request.internal.RunnableC11843b;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;
import p741f5.RunnableC13542a;
import p784hb.C14437f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: io.sentry.android.replay.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C15317w implements Closeable, InterfaceC15290f {

    /* JADX INFO: renamed from: Y */
    public final C15524y1 f47849Y;

    /* JADX INFO: renamed from: Z */
    public final ReplayIntegration f47850Z;

    /* JADX INFO: renamed from: o0 */
    public final C14437f f47851o0;

    /* JADX INFO: renamed from: p0 */
    public final ScheduledExecutorService f47852p0;

    /* JADX INFO: renamed from: q0 */
    public final AtomicBoolean f47853q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f47854r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f47855s0;

    /* JADX INFO: renamed from: t0 */
    public ViewTreeObserverOnDrawListenerC15303q f47856t0;

    /* JADX INFO: renamed from: u0 */
    public ScheduledFuture f47857u0;

    /* JADX INFO: renamed from: v0 */
    public final C17314q f47858v0;

    public C15317w(C15524y1 c15524y1, ReplayIntegration replayIntegration, C14437f mainLooperHandler, ScheduledExecutorService scheduledExecutorService) {
        AbstractC16544l.m18094g(mainLooperHandler, "mainLooperHandler");
        this.f47849Y = c15524y1;
        this.f47850Z = replayIntegration;
        this.f47851o0 = mainLooperHandler;
        this.f47852p0 = scheduledExecutorService;
        this.f47853q0 = new AtomicBoolean(false);
        this.f47854r0 = new ArrayList();
        this.f47855s0 = new Object();
        this.f47858v0 = AbstractC9227W.m9800c(C15267a.f47678w0);
    }

    @Override // io.sentry.android.replay.InterfaceC15290f
    /* JADX INFO: renamed from: a */
    public final void mo16513a(View root, boolean z6) {
        ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q;
        AbstractC16544l.m18094g(root, "root");
        synchronized (this.f47855s0) {
            try {
                if (z6) {
                    this.f47854r0.add(new WeakReference(root));
                    ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q2 = this.f47856t0;
                    if (viewTreeObserverOnDrawListenerC15303q2 != null) {
                        viewTreeObserverOnDrawListenerC15303q2.m16520a(root);
                    }
                } else {
                    ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q3 = this.f47856t0;
                    if (viewTreeObserverOnDrawListenerC15303q3 != null) {
                        viewTreeObserverOnDrawListenerC15303q3.m16521b(root);
                    }
                    AbstractC17686t.m19393A(this.f47854r0, new C15309v(root, 0));
                    WeakReference weakReference = (WeakReference) AbstractC17680n.m19353c0(this.f47854r0);
                    View view = weakReference != null ? (View) weakReference.get() : null;
                    if (view != null && !root.equals(view) && (viewTreeObserverOnDrawListenerC15303q = this.f47856t0) != null) {
                        viewTreeObserverOnDrawListenerC15303q.m16520a(view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m16524k();
        ScheduledExecutorService capturer = (ScheduledExecutorService) this.f47858v0.getValue();
        AbstractC16544l.m18093f(capturer, "capturer");
        AbstractC8716t3.m9424a(capturer, this.f47849Y);
    }

    /* JADX INFO: renamed from: e */
    public final void m16523e(C15304r c15304r) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        if (this.f47853q0.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f47852p0;
        ReplayIntegration replayIntegration = this.f47850Z;
        C15524y1 c15524y1 = this.f47849Y;
        this.f47856t0 = new ViewTreeObserverOnDrawListenerC15303q(c15304r, c15524y1, this.f47851o0, scheduledExecutorService, replayIntegration);
        ScheduledExecutorService capturer = (ScheduledExecutorService) this.f47858v0.getValue();
        AbstractC16544l.m18093f(capturer, "capturer");
        long j10 = 1000 / ((long) c15304r.f47817e);
        TimeUnit unit = TimeUnit.MILLISECONDS;
        RunnableC13542a runnableC13542a = new RunnableC13542a(this, 10);
        AbstractC16544l.m18094g(unit, "unit");
        try {
            scheduledFutureScheduleAtFixedRate = capturer.scheduleAtFixedRate(new RunnableC11843b(runnableC13542a, 16, c15524y1), 100L, j10, unit);
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to submit task WindowRecorder.capture to executor", th2);
            scheduledFutureScheduleAtFixedRate = null;
        }
        this.f47857u0 = scheduledFutureScheduleAtFixedRate;
    }

    /* JADX INFO: renamed from: k */
    public final void m16524k() {
        synchronized (this.f47855s0) {
            try {
                for (WeakReference weakReference : this.f47854r0) {
                    ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q = this.f47856t0;
                    if (viewTreeObserverOnDrawListenerC15303q != null) {
                        viewTreeObserverOnDrawListenerC15303q.m16521b((View) weakReference.get());
                    }
                }
                this.f47854r0.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q2 = this.f47856t0;
        if (viewTreeObserverOnDrawListenerC15303q2 != null) {
            WeakReference weakReference2 = viewTreeObserverOnDrawListenerC15303q2.f47805r0;
            viewTreeObserverOnDrawListenerC15303q2.m16521b(weakReference2 != null ? (View) weakReference2.get() : null);
            WeakReference weakReference3 = viewTreeObserverOnDrawListenerC15303q2.f47805r0;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            Bitmap bitmap = viewTreeObserverOnDrawListenerC15303q2.f47812y0;
            if (bitmap != null) {
                bitmap.recycle();
            }
            viewTreeObserverOnDrawListenerC15303q2.f47811x0.set(false);
        }
        this.f47856t0 = null;
        ScheduledFuture scheduledFuture = this.f47857u0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f47857u0 = null;
        this.f47853q0.set(false);
    }
}
