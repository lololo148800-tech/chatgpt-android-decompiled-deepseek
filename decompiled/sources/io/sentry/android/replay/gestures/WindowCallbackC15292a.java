package io.sentry.android.replay.gestures;

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
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.InterfaceC15284o;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: io.sentry.android.replay.gestures.a */
/* JADX INFO: loaded from: classes3.dex */
public final class WindowCallbackC15292a implements Window.Callback {

    /* JADX INFO: renamed from: Y */
    public final Window.Callback f47765Y;

    /* JADX INFO: renamed from: Z */
    public final C15524y1 f47766Z;

    /* JADX INFO: renamed from: o0 */
    public final ReplayIntegration f47767o0;

    public WindowCallbackC15292a(C15524y1 c15524y1, ReplayIntegration replayIntegration, Window.Callback callback) {
        this.f47765Y = callback;
        this.f47766Z = c15524y1;
        this.f47767o0 = replayIntegration;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16514a(MotionEvent motionEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            AbstractC16544l.m18093f(motionEventObtainNoHistory, "obtainNoHistory(event)");
            try {
                InterfaceC15284o interfaceC15284o = this.f47767o0.f47666x0;
                if (interfaceC15284o != null) {
                    interfaceC15284o.mo16496a(motionEventObtainNoHistory);
                }
            } catch (Throwable th2) {
                try {
                    this.f47766Z.getLogger().mo16297h(EnumC15375i1.ERROR, "Error dispatching touch event", th2);
                } finally {
                    motionEventObtainNoHistory.recycle();
                }
            }
        }
        return m16514a(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z6) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.f47765Y;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.f47765Y;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        Window.Callback callback2 = this.f47765Y;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i10);
    }
}
