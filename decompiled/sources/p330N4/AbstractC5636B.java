package p330N4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p692d0.C12966e;

/* JADX INFO: renamed from: N4.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5636B {

    /* JADX INFO: renamed from: a */
    public static final C5650a f18306a = new C5650a();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f18307b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f18308c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m6041a(ViewGroup viewGroup, AbstractC5673x abstractC5673x) {
        ArrayList arrayList = f18308c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (abstractC5673x == null) {
                abstractC5673x = f18306a;
            }
            AbstractC5673x abstractC5673xClone = abstractC5673x.clone();
            m6045e(viewGroup, abstractC5673xClone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (abstractC5673xClone != null) {
                ViewTreeObserverOnPreDrawListenerC5635A viewTreeObserverOnPreDrawListenerC5635A = new ViewTreeObserverOnPreDrawListenerC5635A();
                viewTreeObserverOnPreDrawListenerC5635A.f18304Y = abstractC5673xClone;
                viewTreeObserverOnPreDrawListenerC5635A.f18305Z = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC5635A);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC5635A);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6042b(FrameLayout frameLayout) {
        f18308c.remove(frameLayout);
        ArrayList arrayList = (ArrayList) m6043c().get(frameLayout);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((AbstractC5673x) arrayList2.get(size)).mo6061n(frameLayout);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C12966e m6043c() {
        C12966e c12966e;
        ThreadLocal threadLocal = f18307b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c12966e = (C12966e) weakReference.get()) != null) {
            return c12966e;
        }
        C12966e c12966e2 = new C12966e(0);
        threadLocal.set(new WeakReference(c12966e2));
        return c12966e2;
    }

    /* JADX INFO: renamed from: d */
    public static void m6044d(C5665p c5665p, C5637C c5637c) {
        FrameLayout frameLayout = c5665p.f18385a;
        ArrayList arrayList = f18308c;
        if (arrayList.contains(frameLayout)) {
            return;
        }
        C5665p c5665p2 = (C5665p) frameLayout.getTag(R.id.transition_current_scene);
        if (c5637c == null) {
            if (c5665p2 != null) {
            }
            View view = c5665p.f18386b;
            FrameLayout frameLayout2 = c5665p.f18385a;
            frameLayout2.removeAllViews();
            frameLayout2.addView(view);
            frameLayout2.setTag(R.id.transition_current_scene, c5665p);
            return;
        }
        arrayList.add(frameLayout);
        AbstractC5673x abstractC5673xClone = c5637c.clone();
        m6045e(frameLayout, abstractC5673xClone);
        View view2 = c5665p.f18386b;
        FrameLayout frameLayout3 = c5665p.f18385a;
        frameLayout3.removeAllViews();
        frameLayout3.addView(view2);
        frameLayout3.setTag(R.id.transition_current_scene, c5665p);
        ViewTreeObserverOnPreDrawListenerC5635A viewTreeObserverOnPreDrawListenerC5635A = new ViewTreeObserverOnPreDrawListenerC5635A();
        viewTreeObserverOnPreDrawListenerC5635A.f18304Y = abstractC5673xClone;
        viewTreeObserverOnPreDrawListenerC5635A.f18305Z = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC5635A);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC5635A);
    }

    /* JADX INFO: renamed from: e */
    public static void m6045e(ViewGroup viewGroup, AbstractC5673x abstractC5673x) {
        ArrayList arrayList = (ArrayList) m6043c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC5673x) it.next()).mo6062v(viewGroup);
            }
        }
        if (abstractC5673x != null) {
            abstractC5673x.m6100g(viewGroup, true);
        }
        C5665p c5665p = (C5665p) viewGroup.getTag(R.id.transition_current_scene);
        if (c5665p != null) {
        }
    }
}
