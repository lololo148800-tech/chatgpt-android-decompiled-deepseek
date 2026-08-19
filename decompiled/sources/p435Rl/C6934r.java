package p435Rl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.ViewTreeObserverOnGlobalLayoutListenerC0262k;
import p003A1.ViewTreeObserverOnScrollChangedListenerC0265l;
import p249Jl.SurfaceHolderCallbackC4482b;
import p387Pl.C6460G;

/* JADX INFO: renamed from: Rl.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C6934r extends AbstractC6932p {

    /* JADX INFO: renamed from: a */
    public final View f22207a;

    /* JADX INFO: renamed from: b */
    public final C6460G f22208b;

    /* JADX INFO: renamed from: c */
    public final Handler f22209c;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0262k f22210d;

    /* JADX INFO: renamed from: e */
    public final ViewTreeObserverOnScrollChangedListenerC0265l f22211e;

    /* JADX INFO: renamed from: f */
    public final int[] f22212f;

    /* JADX INFO: renamed from: g */
    public final Rect f22213g;

    /* JADX INFO: renamed from: h */
    public final Rect f22214h;

    /* JADX WARN: Multi-variable type inference failed */
    public C6934r(View view) {
        AbstractC16544l.m18094g(view, "view");
        this.f22207a = view;
        this.f22208b = new C6460G(0, 0);
        this.f22209c = new Handler(Looper.getMainLooper());
        ViewTreeObserverOnGlobalLayoutListenerC0262k viewTreeObserverOnGlobalLayoutListenerC0262k = new ViewTreeObserverOnGlobalLayoutListenerC0262k(this, 1);
        this.f22210d = viewTreeObserverOnGlobalLayoutListenerC0262k;
        ViewTreeObserverOnScrollChangedListenerC0265l viewTreeObserverOnScrollChangedListenerC0265l = new ViewTreeObserverOnScrollChangedListenerC0265l(this, 1);
        this.f22211e = viewTreeObserverOnScrollChangedListenerC0265l;
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0262k);
        view.getViewTreeObserver().addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC0265l);
        if (view instanceof InterfaceC6933q) {
            ((SurfaceHolderCallbackC4482b) ((InterfaceC6933q) view)).setViewVisibility(this);
        }
        this.f22212f = new int[2];
        this.f22213g = new Rect();
        this.f22214h = new Rect();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7316e(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return m7316e(view2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p435Rl.AbstractC6932p
    /* JADX INFO: renamed from: a */
    public final void mo7314a() {
        deleteObservers();
        this.f22209c.removeCallbacksAndMessages(null);
        View view = this.f22207a;
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f22211e);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f22210d);
        if (view instanceof InterfaceC6933q) {
            SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) ((InterfaceC6933q) view);
            if (AbstractC16544l.m18089b(surfaceHolderCallbackC4482b.getViewVisibility(), this)) {
                surfaceHolderCallbackC4482b.setViewVisibility(null);
            }
        }
    }

    @Override // p435Rl.AbstractC6932p
    /* JADX INFO: renamed from: b */
    public final boolean mo5400b() {
        View view = this.f22207a;
        if (view.getWindowVisibility() != 0 || !m7316e(view)) {
            return false;
        }
        int[] iArr = this.f22212f;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = view.getWidth() + i10;
        int height = view.getHeight() + iArr[1];
        Rect rect = this.f22213g;
        rect.set(i10, i11, width, height);
        Rect rect2 = this.f22214h;
        view.getWindowVisibleDisplayFrame(rect2);
        rect2.offset(-rect2.left, -rect2.top);
        return rect.intersect(rect2);
    }

    @Override // p435Rl.AbstractC6932p
    /* JADX INFO: renamed from: d */
    public final C6460G mo5401d() {
        View view = this.f22207a;
        return new C6460G(view.getWidth(), view.getHeight());
    }
}
