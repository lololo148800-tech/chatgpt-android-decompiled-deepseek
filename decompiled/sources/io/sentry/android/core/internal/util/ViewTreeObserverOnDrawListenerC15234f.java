package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.RunnableC15214e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.f */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnDrawListenerC15234f implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: Y */
    public final Handler f47537Y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: Z */
    public final AtomicReference f47538Z;

    /* JADX INFO: renamed from: o0 */
    public final RunnableC15214e f47539o0;

    public ViewTreeObserverOnDrawListenerC15234f(View view, RunnableC15214e runnableC15214e) {
        this.f47538Z = new AtomicReference(view);
        this.f47539o0 = runnableC15214e;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f47538Z.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.e
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserverOnDrawListenerC15234f viewTreeObserverOnDrawListenerC15234f = this.f47535Y;
                viewTreeObserverOnDrawListenerC15234f.getClass();
                view.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC15234f);
            }
        });
        this.f47537Y.postAtFrontOfQueue(this.f47539o0);
    }
}
