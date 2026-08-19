package za;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: za.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21820c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f69250a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f69251b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m22304a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            View view2 = (View) parent;
            m22304a(viewGroup, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
