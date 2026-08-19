package p893n;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.view.AbstractC10818a;
import androidx.appcompat.view.C10820c;
import androidx.appcompat.view.C10821d;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p030B2.C0750c0;
import p658b5.C11234e;
import p658b5.C11238i;
import p692d0.C12959L;
import p775h2.AbstractC14376f;
import p976r.MenuC18814l;

/* JADX INFO: renamed from: n.r */
/* JADX INFO: loaded from: classes.dex */
public final class C17386r extends WindowCallbackWrapper {

    /* JADX INFO: renamed from: Y */
    public boolean f55499Y;

    /* JADX INFO: renamed from: Z */
    public boolean f55500Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f55501o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ LayoutInflaterFactory2C17390v f55502p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17386r(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v, Window.Callback callback) {
        super(callback);
        this.f55502p0 = layoutInflaterFactory2C17390v;
    }

    /* JADX INFO: renamed from: b */
    public final void m19082b(Window.Callback callback) {
        try {
            this.f55499Y = true;
            callback.onContentChanged();
        } finally {
            this.f55499Y = false;
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f55500Z) {
            return m11097a().dispatchKeyEvent(keyEvent);
        }
        return this.f55502p0.m19103w(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C17389u c17389u;
        boolean z6;
        boolean zM19094J;
        MenuC18814l menuC18814l;
        boolean zPerformShortcut;
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = this.f55502p0;
        layoutInflaterFactory2C17390v.m19089E();
        C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
        if (c17368e == null) {
            c17389u = layoutInflaterFactory2C17390v.f55550Y0;
            if (c17389u == null && layoutInflaterFactory2C17390v.m19094J(c17389u, keyEvent.getKeyCode(), keyEvent)) {
                C17389u c17389u2 = layoutInflaterFactory2C17390v.f55550Y0;
                if (c17389u2 != null) {
                    c17389u2.f55518l = true;
                }
            } else {
                if (layoutInflaterFactory2C17390v.f55550Y0 == null) {
                    C17389u c17389uM19088D = layoutInflaterFactory2C17390v.m19088D(0);
                    layoutInflaterFactory2C17390v.m19095K(c17389uM19088D, keyEvent);
                    zM19094J = layoutInflaterFactory2C17390v.m19094J(c17389uM19088D, keyEvent.getKeyCode(), keyEvent);
                    c17389uM19088D.f55517k = false;
                    if (zM19094J) {
                    }
                }
                z6 = false;
            }
            z6 = true;
        } else {
            C17367D c17367d = c17368e.f55420i;
            if (c17367d == null || (menuC18814l = c17367d.f55406p0) == null) {
                zPerformShortcut = false;
            } else {
                menuC18814l.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                zPerformShortcut = menuC18814l.performShortcut(keyCode, keyEvent, 0);
            }
            if (zPerformShortcut) {
                z6 = true;
            } else {
                c17389u = layoutInflaterFactory2C17390v.f55550Y0;
                if (c17389u == null) {
                    if (layoutInflaterFactory2C17390v.f55550Y0 == null) {
                        C17389u c17389uM19088D2 = layoutInflaterFactory2C17390v.m19088D(0);
                        layoutInflaterFactory2C17390v.m19095K(c17389uM19088D2, keyEvent);
                        zM19094J = layoutInflaterFactory2C17390v.m19094J(c17389uM19088D2, keyEvent.getKeyCode(), keyEvent);
                        c17389uM19088D2.f55517k = false;
                        if (zM19094J) {
                            z6 = true;
                        }
                    }
                    z6 = false;
                } else {
                    if (layoutInflaterFactory2C17390v.f55550Y0 == null) {
                        C17389u c17389uM19088D3 = layoutInflaterFactory2C17390v.m19088D(0);
                        layoutInflaterFactory2C17390v.m19095K(c17389uM19088D3, keyEvent);
                        zM19094J = layoutInflaterFactory2C17390v.m19094J(c17389uM19088D3, keyEvent.getKeyCode(), keyEvent);
                        c17389uM19088D3.f55517k = false;
                        if (zM19094J) {
                            z6 = true;
                        }
                    }
                    z6 = false;
                }
            }
        }
        return z6;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f55499Y) {
            m11097a().onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof MenuC18814l)) {
            return super.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        super.onMenuOpened(i10, menu);
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = this.f55502p0;
        if (i10 == 108) {
            layoutInflaterFactory2C17390v.m19089E();
            C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
            if (c17368e != null && true != c17368e.f55423l) {
                c17368e.f55423l = true;
                ArrayList arrayList = c17368e.f55424m;
                if (arrayList.size() > 0) {
                    throw AbstractC14376f.m15860z(0, arrayList);
                }
            }
        } else {
            layoutInflaterFactory2C17390v.getClass();
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f55501o0) {
            m11097a().onPanelClosed(i10, menu);
            return;
        }
        super.onPanelClosed(i10, menu);
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = this.f55502p0;
        if (i10 != 108) {
            if (i10 != 0) {
                layoutInflaterFactory2C17390v.getClass();
                return;
            }
            C17389u c17389uM19088D = layoutInflaterFactory2C17390v.m19088D(i10);
            if (c17389uM19088D.f55519m) {
                layoutInflaterFactory2C17390v.m19102u(c17389uM19088D, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C17390v.m19089E();
        C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
        if (c17368e == null || !c17368e.f55423l) {
            return;
        }
        c17368e.f55423l = false;
        ArrayList arrayList = c17368e.f55424m;
        if (arrayList.size() > 0) {
            throw AbstractC14376f.m15860z(0, arrayList);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        MenuC18814l menuC18814l = menu instanceof MenuC18814l ? (MenuC18814l) menu : null;
        if (i10 == 0 && menuC18814l == null) {
            return false;
        }
        if (menuC18814l != null) {
            menuC18814l.f59868x = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
        if (menuC18814l != null) {
            menuC18814l.f59868x = false;
        }
        return zOnPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        MenuC18814l menuC18814l = this.f55502p0.m19088D(0).f55514h;
        if (menuC18814l != null) {
            super.onProvideKeyboardShortcuts(list, menuC18814l, i10);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        int i11 = 1;
        boolean z6 = false;
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = this.f55502p0;
        layoutInflaterFactory2C17390v.getClass();
        if (i10 != 0) {
            return super.onWindowStartingActionMode(callback, i10);
        }
        Context context = layoutInflaterFactory2C17390v.f55572w0;
        C11238i c11238i = new C11238i();
        c11238i.f34009Z = context;
        c11238i.f34008Y = callback;
        c11238i.f34010o0 = new ArrayList();
        c11238i.f34011p0 = new C12959L(0);
        AbstractC10818a abstractC10818a = layoutInflaterFactory2C17390v.f55532G0;
        if (abstractC10818a != null) {
            abstractC10818a.mo11098a();
        }
        C11234e c11234e = new C11234e(layoutInflaterFactory2C17390v, c11238i, z6, 28);
        layoutInflaterFactory2C17390v.m19089E();
        C17368E c17368e = layoutInflaterFactory2C17390v.f55526A0;
        if (c17368e != null) {
            C17367D c17367d = c17368e.f55420i;
            if (c17367d != null) {
                c17367d.mo11098a();
            }
            c17368e.f55414c.setHideOnContentScrollEnabled(false);
            c17368e.f55417f.m11137e();
            C17367D c17367d2 = new C17367D(c17368e, c17368e.f55417f.getContext(), c11234e);
            MenuC18814l menuC18814l = c17367d2.f55406p0;
            menuC18814l.m20134w();
            try {
                boolean zM12578w0 = ((C11238i) c17367d2.f55407q0.f34001Z).m12578w0(c17367d2, menuC18814l);
                menuC18814l.m20133v();
                if (zM12578w0) {
                    c17368e.f55420i = c17367d2;
                    c17367d2.mo11104g();
                    c17368e.f55417f.m11135c(c17367d2);
                    c17368e.m19040b(true);
                } else {
                    c17367d2 = null;
                }
                layoutInflaterFactory2C17390v.f55532G0 = c17367d2;
            } catch (Throwable th2) {
                menuC18814l.m20133v();
                throw th2;
            }
        }
        if (layoutInflaterFactory2C17390v.f55532G0 == null) {
            C0750c0 c0750c0 = layoutInflaterFactory2C17390v.f55536K0;
            if (c0750c0 != null) {
                c0750c0.m1600b();
            }
            AbstractC10818a abstractC10818a2 = layoutInflaterFactory2C17390v.f55532G0;
            if (abstractC10818a2 != null) {
                abstractC10818a2.mo11098a();
            }
            if (layoutInflaterFactory2C17390v.f55533H0 == null) {
                boolean z10 = layoutInflaterFactory2C17390v.f55546U0;
                Context context2 = layoutInflaterFactory2C17390v.f55572w0;
                if (z10) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C10820c c10820c = new C10820c(context2, 0);
                        c10820c.getTheme().setTo(themeNewTheme);
                        context2 = c10820c;
                    }
                    layoutInflaterFactory2C17390v.f55533H0 = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C17390v.f55534I0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C17390v.f55534I0.setContentView(layoutInflaterFactory2C17390v.f55533H0);
                    layoutInflaterFactory2C17390v.f55534I0.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C17390v.f55533H0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C17390v.f55534I0.setHeight(-2);
                    layoutInflaterFactory2C17390v.f55535J0 = new RunnableC17380l(layoutInflaterFactory2C17390v, i11);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C17390v.f55538M0.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C17390v.m19089E();
                        C17368E c17368e2 = layoutInflaterFactory2C17390v.f55526A0;
                        Context contextM19041c = c17368e2 != null ? c17368e2.m19041c() : null;
                        if (contextM19041c != null) {
                            context2 = contextM19041c;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C17390v.f55533H0 = (ActionBarContextView) viewStubCompat.m11174a();
                    }
                }
            }
            if (layoutInflaterFactory2C17390v.f55533H0 != null) {
                C0750c0 c0750c1 = layoutInflaterFactory2C17390v.f55536K0;
                if (c0750c1 != null) {
                    c0750c1.m1600b();
                }
                layoutInflaterFactory2C17390v.f55533H0.m11137e();
                Context context3 = layoutInflaterFactory2C17390v.f55533H0.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C17390v.f55533H0;
                C10821d c10821d = new C10821d();
                c10821d.f32086o0 = context3;
                c10821d.f32087p0 = actionBarContextView;
                c10821d.f32088q0 = c11234e;
                MenuC18814l menuC18814l2 = new MenuC18814l(actionBarContextView.getContext());
                menuC18814l2.f59856l = 1;
                c10821d.f32091t0 = menuC18814l2;
                menuC18814l2.f59849e = c10821d;
                if (((C11238i) c11234e.f34001Z).m12578w0(c10821d, menuC18814l2)) {
                    c10821d.mo11104g();
                    layoutInflaterFactory2C17390v.f55533H0.m11135c(c10821d);
                    layoutInflaterFactory2C17390v.f55532G0 = c10821d;
                    if (layoutInflaterFactory2C17390v.f55537L0 && (viewGroup = layoutInflaterFactory2C17390v.f55538M0) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C17390v.f55533H0.setAlpha(0.0f);
                        C0750c0 c0750c0M1573a = AbstractC0738T.m1573a(layoutInflaterFactory2C17390v.f55533H0);
                        c0750c0M1573a.m1599a(1.0f);
                        layoutInflaterFactory2C17390v.f55536K0 = c0750c0M1573a;
                        c0750c0M1573a.m1602d(new C17381m(layoutInflaterFactory2C17390v, i11));
                    } else {
                        layoutInflaterFactory2C17390v.f55533H0.setAlpha(1.0f);
                        layoutInflaterFactory2C17390v.f55533H0.setVisibility(0);
                        if (layoutInflaterFactory2C17390v.f55533H0.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C17390v.f55533H0.getParent();
                            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                            AbstractC0728I.m1543c(view);
                        }
                    }
                    if (layoutInflaterFactory2C17390v.f55534I0 != null) {
                        layoutInflaterFactory2C17390v.f55573x0.getDecorView().post(layoutInflaterFactory2C17390v.f55535J0);
                    }
                } else {
                    layoutInflaterFactory2C17390v.f55532G0 = null;
                }
            }
            layoutInflaterFactory2C17390v.m19097M();
            layoutInflaterFactory2C17390v.f55532G0 = layoutInflaterFactory2C17390v.f55532G0;
        }
        layoutInflaterFactory2C17390v.m19097M();
        AbstractC10818a abstractC10818a3 = layoutInflaterFactory2C17390v.f55532G0;
        if (abstractC10818a3 != null) {
            return c11238i.m12565h0(abstractC10818a3);
        }
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
