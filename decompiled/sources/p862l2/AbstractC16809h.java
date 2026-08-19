package p862l2;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: l2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16809h {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f53936a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f53937b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m18561a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            View view2 = (View) parent;
            m18561a(coordinatorLayout, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
