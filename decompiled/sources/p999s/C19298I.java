package p999s;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p976r.ViewTreeObserverOnGlobalLayoutListenerC18806d;

/* JADX INFO: renamed from: s.I */
/* JADX INFO: loaded from: classes.dex */
public final class C19298I implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC18806d f61142Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19300J f61143Z;

    public C19298I(C19300J c19300j, ViewTreeObserverOnGlobalLayoutListenerC18806d viewTreeObserverOnGlobalLayoutListenerC18806d) {
        this.f61143Z = c19300j;
        this.f61142Y = viewTreeObserverOnGlobalLayoutListenerC18806d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f61143Z.f61149T0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f61142Y);
        }
    }
}
