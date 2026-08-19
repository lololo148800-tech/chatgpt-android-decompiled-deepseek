package p030B2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p056C2.C1511e;
import p056C2.InterfaceC1522p;
import p108E2.C2257p;
import p999s.C19376s;

/* JADX INFO: renamed from: B2.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0738T {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f2096a;

    /* JADX INFO: renamed from: b */
    public static Field f2097b;

    /* JADX INFO: renamed from: c */
    public static boolean f2098c;

    /* JADX INFO: renamed from: d */
    public static final int[] f2099d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e */
    public static final C0724E f2100e = new C0724E();

    /* JADX INFO: renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0726G f2101f = new ViewTreeObserverOnGlobalLayoutListenerC0726G();

    /* JADX INFO: renamed from: a */
    public static C0750c0 m1573a(View view) {
        if (f2096a == null) {
            f2096a = new WeakHashMap();
        }
        C0750c0 c0750c0 = (C0750c0) f2096a.get(view);
        if (c0750c0 != null) {
            return c0750c0;
        }
        C0750c0 c0750c1 = new C0750c0(view);
        f2096a.put(view, c0750c1);
        return c0750c1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1574b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0737S.f2092d;
        C0737S c0737s = (C0737S) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0737s == null) {
            c0737s = new C0737S();
            c0737s.f2093a = null;
            c0737s.f2094b = null;
            c0737s.f2095c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0737s);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0737s.f2093a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0737S.f2092d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0737s.f2093a == null) {
                            c0737s.f2093a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0737S.f2092d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0737s.f2093a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0737s.f2093a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        View viewM1572a = c0737s.m1572a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM1572a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0737s.f2094b == null) {
                    c0737s.f2094b = new SparseArray();
                }
                c0737s.f2094b.put(keyCode, new WeakReference(viewM1572a));
            }
        }
        return viewM1572a != null;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m1575c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0734O.m1567a(view);
        }
        if (f2098c) {
            return null;
        }
        if (f2097b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2097b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2098c = true;
                return null;
            }
        }
        try {
            Object obj = f2097b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2098c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m1576d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0733N.m1561a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m1577e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static String[] m1578f(C19376s c19376s) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0736Q.m1570a(c19376s) : (String[]) c19376s.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: g */
    public static void m1579g(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = m1576d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z6) {
                    accessibilityEventObtain.getText().add(m1576d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        AbstractC15256t.m16466d("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m1576d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1581i(View view, int i10) {
        ArrayList arrayListM1577e = m1577e(view);
        for (int i11 = 0; i11 < arrayListM1577e.size(); i11++) {
            if (((C1511e) arrayListM1577e.get(i11)).m2210a() == i10) {
                arrayListM1577e.remove(i11);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1582j(View view, C1511e c1511e, InterfaceC1522p interfaceC1522p) {
        C0747b c0747b;
        C1511e c1511e2 = new C1511e(null, c1511e.f4038b, null, interfaceC1522p, c1511e.f4039c);
        View.AccessibilityDelegate accessibilityDelegateM1575c = m1575c(view);
        if (accessibilityDelegateM1575c == null) {
            c0747b = null;
        } else {
            c0747b = accessibilityDelegateM1575c instanceof C0745a ? ((C0745a) accessibilityDelegateM1575c).f2113a : new C0747b(accessibilityDelegateM1575c);
        }
        if (c0747b == null) {
            c0747b = new C0747b();
        }
        m1584l(view, c0747b);
        m1581i(view, c1511e2.m2210a());
        m1577e(view).add(c1511e2);
        m1579g(view, 0);
    }

    /* JADX INFO: renamed from: k */
    public static void m1583k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0734O.m1568b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m1584l(View view, C0747b c0747b) {
        if (c0747b == null && (m1575c(view) instanceof C0745a)) {
            c0747b = new C0747b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0747b == null ? null : c0747b.f2119b);
    }

    /* JADX INFO: renamed from: m */
    public static void m1585m(View view, CharSequence charSequence) {
        new C0725F(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m1540f(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0726G viewTreeObserverOnGlobalLayoutListenerC0726G = f2101f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0726G.f2084Y.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0726G);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0726G);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0726G.f2084Y.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0726G);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0726G);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1586n(View view, AbstractC0754e0 abstractC0754e0) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC0754e0 != null ? new C0764j0(abstractC0754e0) : null);
            return;
        }
        PathInterpolator pathInterpolator = C0762i0.f2153e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (abstractC0754e0 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0760h0 = new ViewOnApplyWindowInsetsListenerC0760h0(view, abstractC0754e0);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0760h0);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0760h0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static C0755f m1580h(View view, C0755f c0755f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0755f + ", view=" + view.getClass().getSimpleName() + lZYtIbClQJm.RjaBTkAKotKtmPS + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0736Q.m1571b(view, c0755f);
        }
        C2257p c2257p = (C2257p) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0785u interfaceC0785u = f2100e;
        if (c2257p == null) {
            if (view instanceof InterfaceC0785u) {
                interfaceC0785u = (InterfaceC0785u) view;
            }
            return interfaceC0785u.mo1533a(c0755f);
        }
        C0755f c0755fM3299a = C2257p.m3299a(view, c0755f);
        if (c0755fM3299a == null) {
            return null;
        }
        if (view instanceof InterfaceC0785u) {
            interfaceC0785u = (InterfaceC0785u) view;
        }
        return interfaceC0785u.mo1533a(c0755fM3299a);
    }
}
