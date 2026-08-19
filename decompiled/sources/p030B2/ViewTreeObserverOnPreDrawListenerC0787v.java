package p030B2;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC16544l;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: B2.v */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0787v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2198Y = 1;

    /* JADX INFO: renamed from: Z */
    public final View f2199Z;

    /* JADX INFO: renamed from: o0 */
    public ViewTreeObserver f2200o0;

    /* JADX INFO: renamed from: p0 */
    public final Runnable f2201p0;

    public ViewTreeObserverOnPreDrawListenerC0787v(View view, RunnableC13542a runnableC13542a) {
        this.f2199Z = view;
        this.f2201p0 = runnableC13542a;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        AbstractC16544l.m18093f(viewTreeObserver, "getViewTreeObserver(...)");
        this.f2200o0 = viewTreeObserver;
    }

    /* JADX INFO: renamed from: a */
    public static void m1779a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0787v viewTreeObserverOnPreDrawListenerC0787v = new ViewTreeObserverOnPreDrawListenerC0787v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0787v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0787v);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f2198Y) {
            case 0:
                boolean zIsAlive = this.f2200o0.isAlive();
                View view = this.f2199Z;
                if (zIsAlive) {
                    this.f2200o0.removeOnPreDrawListener(this);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                view.removeOnAttachStateChangeListener(this);
                this.f2201p0.run();
                return true;
            default:
                boolean zIsAlive2 = this.f2200o0.isAlive();
                View view2 = this.f2199Z;
                if (zIsAlive2) {
                    this.f2200o0.removeOnPreDrawListener(this);
                } else {
                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                view2.removeOnAttachStateChangeListener(this);
                ((RunnableC13542a) this.f2201p0).run();
                return false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v2) {
        switch (this.f2198Y) {
            case 0:
                this.f2200o0 = v2.getViewTreeObserver();
                break;
            default:
                AbstractC16544l.m18094g(v2, "v");
                ViewTreeObserver viewTreeObserver = v2.getViewTreeObserver();
                AbstractC16544l.m18093f(viewTreeObserver, "getViewTreeObserver(...)");
                this.f2200o0 = viewTreeObserver;
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        switch (this.f2198Y) {
            case 0:
                boolean zIsAlive = this.f2200o0.isAlive();
                View view = this.f2199Z;
                if (zIsAlive) {
                    this.f2200o0.removeOnPreDrawListener(this);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                AbstractC16544l.m18094g(v2, "v");
                boolean zIsAlive2 = this.f2200o0.isAlive();
                View view2 = this.f2199Z;
                if (zIsAlive2) {
                    this.f2200o0.removeOnPreDrawListener(this);
                } else {
                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public ViewTreeObserverOnPreDrawListenerC0787v(View view, Runnable runnable) {
        this.f2199Z = view;
        this.f2200o0 = view.getViewTreeObserver();
        this.f2201p0 = runnable;
    }
}
