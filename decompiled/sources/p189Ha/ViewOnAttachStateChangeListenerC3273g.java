package p189Ha;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import p897n3.C17474a;

/* JADX INFO: renamed from: Ha.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3273g implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Y */
    public final WeakReference f9950Y;

    /* JADX INFO: renamed from: Z */
    public final WeakReference f9951Z;

    public ViewOnAttachStateChangeListenerC3273g(C3277k c3277k, View view) {
        this.f9950Y = new WeakReference(c3277k);
        this.f9951Z = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m4148a() {
        WeakReference weakReference = this.f9951Z;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.f9950Y.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.f9950Y;
        if (weakReference.get() == null) {
            m4148a();
            return;
        }
        AbstractC3276j abstractC3276j = (AbstractC3276j) weakReference.get();
        C17474a c17474a = AbstractC3276j.f9967x;
        abstractC3276j.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f9950Y.get() == null) {
            m4148a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f9950Y.get() == null) {
            m4148a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
