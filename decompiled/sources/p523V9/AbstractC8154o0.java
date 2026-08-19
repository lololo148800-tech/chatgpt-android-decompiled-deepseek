package p523V9;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.openai.chatgpt.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0738T;
import p030B2.C0737S;
import p030B2.InterfaceC0769m;
import p049Bm.InterfaceC1439n;
import p379Pb.LVf.efyhmdM;
import p647ak.AbstractC10712k0;
import p647ak.AbstractC10729t;
import p775h2.AbstractC14376f;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.C19252c;
import p996rm.C19253d;
import p996rm.C19254e;
import p996rm.C19255f;
import sm.AbstractC19685a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8154o0 {

    /* JADX INFO: renamed from: a */
    public static boolean f25584a;

    /* JADX INFO: renamed from: b */
    public static Method f25585b;

    /* JADX INFO: renamed from: c */
    public static boolean f25586c;

    /* JADX INFO: renamed from: d */
    public static Field f25587d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC18770c m8710a(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c, InterfaceC18770c interfaceC18770c2) {
        AbstractC16544l.m18094g(interfaceC1439n, "<this>");
        if (interfaceC1439n instanceof AbstractC19685a) {
            return ((AbstractC19685a) interfaceC1439n).create(interfaceC18770c, interfaceC18770c2);
        }
        InterfaceC18776i context = interfaceC18770c2.getContext();
        return context == C18777j.f59682Y ? new C19252c(interfaceC1439n, interfaceC18770c2, interfaceC18770c) : new C19253d(interfaceC18770c2, context, interfaceC1439n, interfaceC18770c);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8712c(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0737S.f2092d;
        C0737S c0737s = (C0737S) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0737s == null) {
            c0737s = new C0737S();
            c0737s.f2093a = null;
            c0737s.f2094b = null;
            c0737s.f2095c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0737s);
        }
        WeakReference weakReference2 = c0737s.f2095c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0737s.f2095c = new WeakReference(keyEvent);
        if (c0737s.f2094b == null) {
            c0737s.f2094b = new SparseArray();
        }
        SparseArray sparseArray = c0737s.f2094b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw AbstractC14376f.m15860z(size, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8713d(InterfaceC0769m interfaceC0769m, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0769m == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0769m.mo1712f(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f25584a) {
                        try {
                            f25585b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f25584a = true;
                    }
                    Method method = f25585b;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (AbstractC0738T.m1574b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && AbstractC0738T.m1574b(view, keyEvent)) || interfaceC0769m.mo1712f(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f25586c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f25587d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f25586c = true;
        }
        Field field = f25587d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (AbstractC0738T.m1574b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC18770c m8714e(InterfaceC18770c interfaceC18770c) {
        InterfaceC18770c<Object> interfaceC18770cIntercepted;
        AbstractC16544l.m18094g(interfaceC18770c, "<this>");
        AbstractC19687c abstractC19687c = interfaceC18770c instanceof AbstractC19687c ? (AbstractC19687c) interfaceC18770c : null;
        return (abstractC19687c == null || (interfaceC18770cIntercepted = abstractC19687c.intercepted()) == null) ? interfaceC18770c : interfaceC18770cIntercepted;
    }

    /* JADX INFO: renamed from: f */
    public static Object m8715f(InterfaceC1439n interfaceC1439n, Object obj, InterfaceC18770c interfaceC18770c) {
        AbstractC16544l.m18094g(interfaceC1439n, "<this>");
        InterfaceC18776i context = interfaceC18770c.getContext();
        Object c19254e = context == C18777j.f59682Y ? new C19254e(interfaceC18770c) : new C19255f(interfaceC18770c, context);
        AbstractC16529F.m18081e(2, interfaceC1439n);
        return interfaceC1439n.invoke(obj, c19254e);
    }

    /* JADX INFO: renamed from: b */
    public static final void m8711b(AbstractC10712k0 abstractC10712k0) {
        AbstractC16544l.m18094g(abstractC10712k0, efyhmdM.SDWfpGnpKGQOGpv);
        Iterator it = abstractC10712k0.mo11015j().iterator();
        while (it.hasNext()) {
            new File(((AbstractC10729t) it.next()).mo11035a()).delete();
        }
    }
}
