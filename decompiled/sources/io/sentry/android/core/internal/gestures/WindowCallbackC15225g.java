package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.internal.gestures.C15387c;
import java.util.Collections;
import p140Fa.C2685e;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.g */
/* JADX INFO: loaded from: classes3.dex */
public final class WindowCallbackC15225g implements Window.Callback {

    /* JADX INFO: renamed from: Y */
    public final Window.Callback f47498Y;

    /* JADX INFO: renamed from: Z */
    public final Window.Callback f47499Z;

    /* JADX INFO: renamed from: o0 */
    public final GestureDetectorOnGestureListenerC15224f f47500o0;

    /* JADX INFO: renamed from: p0 */
    public final GestureDetectorCompat f47501p0;

    /* JADX INFO: renamed from: q0 */
    public final C15524y1 f47502q0;

    /* JADX INFO: renamed from: r0 */
    public final C2685e f47503r0;

    public WindowCallbackC15225g(Window.Callback callback, Activity activity, GestureDetectorOnGestureListenerC15224f gestureDetectorOnGestureListenerC15224f, C15524y1 c15524y1) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, gestureDetectorOnGestureListenerC15224f);
        C2685e c2685e = new C2685e();
        this.f47498Y = callback;
        this.f47499Z = callback;
        this.f47500o0 = gestureDetectorOnGestureListenerC15224f;
        this.f47502q0 = c15524y1;
        this.f47501p0 = gestureDetectorCompat;
        this.f47503r0 = c2685e;
    }

    /* JADX INFO: renamed from: a */
    public final void m16432a(MotionEvent motionEvent) {
        String str;
        this.f47501p0.f32901a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            GestureDetectorOnGestureListenerC15224f gestureDetectorOnGestureListenerC15224f = this.f47500o0;
            View viewM16429b = gestureDetectorOnGestureListenerC15224f.m16429b("onUp");
            C15223e c15223e = gestureDetectorOnGestureListenerC15224f.f47497g;
            C15387c c15387c = c15223e.f47488b;
            if (viewM16429b == null || c15387c == null) {
                return;
            }
            EnumC15222d enumC15222d = c15223e.f47487a;
            EnumC15222d enumC15222d2 = EnumC15222d.Unknown;
            if (enumC15222d == enumC15222d2) {
                gestureDetectorOnGestureListenerC15224f.f47493c.getLogger().mo16298o(EnumC15375i1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x4 = motionEvent.getX() - c15223e.f47489c;
            float y8 = motionEvent.getY() - c15223e.f47490d;
            if (Math.abs(x4) > Math.abs(y8)) {
                str = x4 > 0.0f ? "right" : "left";
            } else {
                str = y8 > 0.0f ? "down" : "up";
            }
            gestureDetectorOnGestureListenerC15224f.m16428a(c15387c, c15223e.f47487a, Collections.singletonMap("direction", str), motionEvent);
            gestureDetectorOnGestureListenerC15224f.m16430d(c15387c, c15223e.f47487a);
            c15223e.f47488b = null;
            c15223e.f47487a = enumC15222d2;
            c15223e.f47489c = 0.0f;
            c15223e.f47490d = 0.0f;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f47498Y.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f47498Y.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f47498Y.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f47498Y.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f47503r0.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                m16432a(motionEventObtain);
            } catch (Throwable th2) {
                C15524y1 c15524y1 = this.f47502q0;
                if (c15524y1 != null) {
                    try {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error dispatching touch event", th2);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.f47498Y.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f47498Y.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f47498Y.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f47498Y.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f47498Y.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f47498Y.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f47498Y.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f47498Y.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f47498Y.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f47498Y.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.f47498Y.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        this.f47498Y.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f47498Y.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f47498Y.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f47498Y.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f47498Y.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f47498Y.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f47498Y.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f47498Y.onWindowStartingActionMode(callback, i10);
    }
}
