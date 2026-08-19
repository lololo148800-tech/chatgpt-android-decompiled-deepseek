package p766g8;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import androidx.work.impl.utils.p651oZ.HhJS;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8128k6;
import p592Y7.AbstractC9667b;
import p592Y7.EnumC9668c;
import p592Y7.InterfaceC9670e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p867l8.C16829a;
import p867l8.C16830b;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: g8.c */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC13826c implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13823a f43849a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f43850b;

    /* JADX INFO: renamed from: c */
    public final C16829a[] f43851c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f43852d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC11256c f43853e;

    /* JADX INFO: renamed from: f */
    public final int[] f43854f;

    /* JADX INFO: renamed from: g */
    public EnumC9668c f43855g;

    /* JADX INFO: renamed from: h */
    public WeakReference f43856h;

    /* JADX INFO: renamed from: i */
    public float f43857i;

    /* JADX INFO: renamed from: j */
    public float f43858j;

    public GestureDetectorOnGestureListenerC13826c(InterfaceC13823a sdkCore, WeakReference weakReference, C16829a[] c16829aArr, C16830b c16830b, WeakReference weakReference2, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f43849a = sdkCore;
        this.f43850b = weakReference;
        this.f43851c = c16829aArr;
        this.f43852d = weakReference2;
        this.f43853e = internalLogger;
        this.f43854f = new int[2];
        this.f43856h = new WeakReference(null);
    }

    /* JADX INFO: renamed from: b */
    public static void m15469b(ViewGroup viewGroup, float f10, float f11, LinkedList linkedList, int[] iArr) {
        if (viewGroup.getVisibility() == 0) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                AbstractC16544l.m18093f(child, "child");
                child.getLocationInWindow(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                int width = child.getWidth();
                int height = child.getHeight();
                if (f10 >= i11 && f10 <= i11 + width && f11 >= i12 && f11 <= i12 + height) {
                    linkedList.add(child);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap m15471c(View view, String str, MotionEvent motionEvent) {
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("action.target.classname", AbstractC8128k6.m8642h(view)), new C17309l("action.target.resource_id", str));
        if (motionEvent != null) {
            float x4 = motionEvent.getX() - this.f43857i;
            float y8 = motionEvent.getY() - this.f43858j;
            linkedHashMapM19246h.put("action.gesture.direction", Math.abs(x4) > Math.abs(y8) ? x4 > 0.0f ? "right" : "left" : y8 > 0.0f ? "down" : "up");
        }
        for (C16829a c16829a : this.f43851c) {
            c16829a.getClass();
            C16829a.m18565a(view, linkedHashMapM19246h);
        }
        return linkedHashMapM19246h;
    }

    /* JADX INFO: renamed from: d */
    public final void m15472d(View view) {
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("action.target.classname", AbstractC8128k6.m8642h(view)), new C17309l("action.target.resource_id", AbstractC8128k6.m8641g((Context) this.f43852d.get(), view.getId())));
        for (C16829a c16829a : this.f43851c) {
            c16829a.getClass();
            C16829a.m18565a(view, linkedHashMapM19246h);
        }
        AbstractC9667b.m10254a(this.f43849a).mo10260p(EnumC9668c.f29148Y, "", linkedHashMapM19246h);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        AbstractC16544l.m18094g(e10, "e");
        this.f43856h.clear();
        this.f43855g = null;
        this.f43858j = 0.0f;
        this.f43857i = 0.0f;
        this.f43857i = e10.getX();
        this.f43858j = e10.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent endUpEvent, float f10, float f11) {
        AbstractC16544l.m18094g(endUpEvent, "endUpEvent");
        this.f43855g = EnumC9668c.f29150o0;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        AbstractC16544l.m18094g(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent currentMoveEvent, float f10, float f11) {
        View decorView;
        View view;
        AbstractC16544l.m18094g(currentMoveEvent, "currentMoveEvent");
        InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(this.f43849a);
        Window window = (Window) this.f43850b.get();
        if (window != null && (decorView = window.getDecorView()) != null && this.f43855g == null) {
            if (motionEvent == null) {
                view = null;
                break;
            }
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            LinkedList linkedList = new LinkedList();
            linkedList.add(decorView);
            boolean z6 = true;
            while (true) {
                if (!linkedList.isEmpty()) {
                    view = (View) linkedList.removeFirst();
                    if (linkedList.isEmpty()) {
                        AbstractC16544l.m18093f(view, "view");
                        if (AbstractC21329w.m21734u(view.getClass().getName(), "androidx.compose.ui.platform.ComposeView", false)) {
                            z6 = false;
                        }
                    }
                    AbstractC16544l.m18093f(view, "view");
                    if (view.getVisibility() == 0 && (ScrollingView.class.isAssignableFrom(view.getClass()) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass()))) {
                        break;
                    }
                    if (view instanceof ViewGroup) {
                        m15469b((ViewGroup) view, x4, y8, linkedList, this.f43854f);
                    }
                } else {
                    if (z6) {
                        AbstractC7889G0.m8184b(this.f43853e, 3, EnumC11255b.f34098Y, C13825b.f43842Z, null, false, 56);
                    }
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.f43856h = new WeakReference(view);
                LinkedHashMap linkedHashMapM15471c = m15471c(view, AbstractC8128k6.m8641g((Context) this.f43852d.get(), view.getId()), null);
                EnumC9668c enumC9668c = EnumC9668c.f29149Z;
                interfaceC9670eM10254a.mo10263s(linkedHashMapM15471c);
                this.f43855g = enumC9668c;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        AbstractC16544l.m18094g(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        View viewM15470a;
        AbstractC16544l.m18094g(e10, "e");
        Window window = (Window) this.f43850b.get();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || (viewM15470a = m15470a(decorView, e10.getX(), e10.getY())) == null) {
            return false;
        }
        m15472d(viewM15470a);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final View m15470a(View view, float f10, float f11) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(view);
        View view2 = null;
        boolean z6 = true;
        while (!linkedList.isEmpty()) {
            View view3 = (View) linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                AbstractC16544l.m18093f(view3, "view");
                if (AbstractC21329w.m21734u(view3.getClass().getName(), HhJS.ArqUfJSikicMyn, false)) {
                    z6 = false;
                }
            }
            AbstractC16544l.m18093f(view3, "view");
            if (view3.isClickable() && view3.getVisibility() == 0) {
                view2 = view3;
            }
            if (view3 instanceof ViewGroup) {
                m15469b((ViewGroup) view3, f10, f11, linkedList, this.f43854f);
            }
        }
        if (view2 == null && z6) {
            AbstractC7889G0.m8184b(this.f43853e, 3, EnumC11255b.f34098Y, C13825b.f43843o0, null, false, 56);
        }
        return view2;
    }
}
