package p766g8;

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
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8128k6;
import p548Wd.p549VF.zakks;
import p592Y7.AbstractC9667b;
import p592Y7.EnumC9668c;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p867l8.C16829a;
import p867l8.C16830b;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: g8.f */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC13829f implements Window.Callback {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13823a f43860Y;

    /* JADX INFO: renamed from: Z */
    public final Window.Callback f43861Z;

    /* JADX INFO: renamed from: o0 */
    public final C11234e f43862o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1436k f43863p0;

    /* JADX INFO: renamed from: q0 */
    public final C16829a[] f43864q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC11256c f43865r0;

    /* JADX INFO: renamed from: s0 */
    public final WeakReference f43866s0;

    public WindowCallbackC13829f(Window window, InterfaceC13823a sdkCore, Window.Callback callback, C11234e c11234e, C16830b c16830b, C16829a[] c16829aArr, InterfaceC11256c internalLogger) {
        C13828e c13828e = C13828e.f43859Y;
        AbstractC16544l.m18094g(window, "window");
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f43860Y = sdkCore;
        this.f43861Z = callback;
        this.f43862o0 = c11234e;
        this.f43863p0 = c13828e;
        this.f43864q0 = c16829aArr;
        this.f43865r0 = internalLogger;
        this.f43866s0 = new WeakReference(window);
    }

    /* JADX INFO: renamed from: a */
    public final void m15473a(NullPointerException nullPointerException) {
        String message = nullPointerException.getMessage();
        if (message == null || !AbstractC21322p.m21667A(message, "Parameter specified as non-null is null", false)) {
            throw nullPointerException;
        }
        AbstractC7889G0.m8184b(this.f43865r0, 5, EnumC11255b.f34099Z, C13825b.f43847s0, nullPointerException, false, 48);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f43861Z.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window window;
        View currentFocus;
        if (keyEvent == null) {
            AbstractC7889G0.m8185c(this.f43865r0, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C13825b.f43844p0, null, 56);
        } else {
            int keyCode = keyEvent.getKeyCode();
            InterfaceC13823a interfaceC13823a = this.f43860Y;
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                AbstractC9667b.m10254a(interfaceC13823a).mo10260p(EnumC9668c.f29152q0, "back", C17690x.f56481Y);
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1 && (window = (Window) this.f43866s0.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l(zakks.QPxZkdn, AbstractC8128k6.m8642h(currentFocus)), new C17309l("action.target.resource_id", AbstractC8128k6.m8641g(window.getContext(), currentFocus.getId())));
                for (C16829a c16829a : this.f43864q0) {
                    c16829a.getClass();
                    C16829a.m18565a(currentFocus, linkedHashMapM19246h);
                }
                AbstractC9667b.m10254a(interfaceC13823a).mo10260p(EnumC9668c.f29151p0, "", linkedHashMapM19246h);
            }
        }
        try {
            return this.f43861Z.dispatchKeyEvent(keyEvent);
        } catch (NullPointerException e10) {
            m15473a(e10);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f43861Z.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f43861Z.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        if (motionEvent != null) {
            MotionEvent motionEvent2 = (MotionEvent) this.f43863p0.invoke(motionEvent);
            try {
                try {
                    this.f43862o0.m12503G(motionEvent2);
                } catch (Exception e10) {
                    AbstractC7889G0.m8185c(this.f43865r0, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), C13825b.f43845q0, e10, 48);
                }
                motionEvent2.recycle();
            } catch (Throwable th2) {
                motionEvent2.recycle();
                throw th2;
            }
        } else {
            AbstractC7889G0.m8185c(this.f43865r0, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), C13825b.f43846r0, null, 56);
        }
        try {
            return this.f43861Z.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException e11) {
            m15473a(e11);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f43861Z.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f43861Z.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f43861Z.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f43861Z.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f43861Z.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu p10) {
        AbstractC16544l.m18094g(p10, "p1");
        return this.f43861Z.onCreatePanelMenu(i10, p10);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f43861Z.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f43861Z.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC16544l.m18094g(item, "item");
        Window window = (Window) this.f43866s0.get();
        AbstractC9667b.m10254a(this.f43860Y).mo10260p(EnumC9668c.f29148Y, "", AbstractC17659D.m19246h(new C17309l("action.target.classname", item.getClass().getCanonicalName()), new C17309l("action.target.resource_id", AbstractC8128k6.m8641g(window != null ? window.getContext() : null, item.getItemId())), new C17309l("action.target.title", item.getTitle())));
        try {
            return this.f43861Z.onMenuItemSelected(i10, item);
        } catch (NullPointerException e10) {
            m15473a(e10);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu p10) {
        AbstractC16544l.m18094g(p10, "p1");
        return this.f43861Z.onMenuOpened(i10, p10);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu p10) {
        AbstractC16544l.m18094g(p10, "p1");
        this.f43861Z.onPanelClosed(i10, p10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu p10) {
        AbstractC16544l.m18094g(p10, "p2");
        return this.f43861Z.onPreparePanel(i10, view, p10);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f43861Z.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f43861Z.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f43861Z.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f43861Z.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f43861Z.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f43861Z.onWindowStartingActionMode(callback, i10);
    }
}
