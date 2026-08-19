package p147Fh;

import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: renamed from: Fh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2751h extends WebView {
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
