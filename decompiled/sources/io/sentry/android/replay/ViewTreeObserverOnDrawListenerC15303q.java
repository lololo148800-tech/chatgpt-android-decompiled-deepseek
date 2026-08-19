package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p571X9.AbstractC9227W;
import p784hb.C14437f;

/* JADX INFO: renamed from: io.sentry.android.replay.q */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnDrawListenerC15303q implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: Y */
    public final C15304r f47800Y;

    /* JADX INFO: renamed from: Z */
    public final C15524y1 f47801Z;

    /* JADX INFO: renamed from: o0 */
    public final C14437f f47802o0;

    /* JADX INFO: renamed from: p0 */
    public final ScheduledExecutorService f47803p0;

    /* JADX INFO: renamed from: q0 */
    public final ReplayIntegration f47804q0;

    /* JADX INFO: renamed from: r0 */
    public WeakReference f47805r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f47806s0;

    /* JADX INFO: renamed from: t0 */
    public final Object f47807t0;

    /* JADX INFO: renamed from: u0 */
    public final Object f47808u0;

    /* JADX INFO: renamed from: v0 */
    public final Object f47809v0;

    /* JADX INFO: renamed from: w0 */
    public final AtomicBoolean f47810w0;

    /* JADX INFO: renamed from: x0 */
    public final AtomicBoolean f47811x0;

    /* JADX INFO: renamed from: y0 */
    public Bitmap f47812y0;

    public ViewTreeObserverOnDrawListenerC15303q(C15304r c15304r, C15524y1 c15524y1, C14437f mainLooperHandler, ScheduledExecutorService scheduledExecutorService, ReplayIntegration replayIntegration) {
        AbstractC16544l.m18094g(mainLooperHandler, "mainLooperHandler");
        this.f47800Y = c15304r;
        this.f47801Z = c15524y1;
        this.f47802o0 = mainLooperHandler;
        this.f47803p0 = scheduledExecutorService;
        this.f47804q0 = replayIntegration;
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        this.f47806s0 = AbstractC9227W.m9799b(enumC17307j, C15267a.f47673r0);
        this.f47807t0 = AbstractC9227W.m9799b(enumC17307j, C15267a.f47674s0);
        this.f47808u0 = AbstractC9227W.m9799b(enumC17307j, new C15302p(this, 1));
        this.f47809v0 = AbstractC9227W.m9799b(enumC17307j, new C15302p(this, 0));
        this.f47810w0 = new AtomicBoolean(false);
        this.f47811x0 = new AtomicBoolean(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m16520a(View root) {
        AbstractC16544l.m18094g(root, "root");
        WeakReference weakReference = this.f47805r0;
        m16521b(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f47805r0;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f47805r0 = new WeakReference(root);
        if (root.getViewTreeObserver() != null && root.getViewTreeObserver().isAlive()) {
            root.getViewTreeObserver().addOnDrawListener(this);
        }
        this.f47810w0.set(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m16521b(View view) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        WeakReference weakReference = this.f47805r0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f47801Z.getLogger().mo16298o(EnumC15375i1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.f47810w0.set(true);
        }
    }
}
