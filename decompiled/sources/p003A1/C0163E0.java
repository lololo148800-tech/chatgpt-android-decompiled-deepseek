package p003A1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: A1.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0163E0 implements InterfaceC0157C0 {

    /* JADX INFO: renamed from: a */
    public final Matrix f644a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final int[] f645b = new int[2];

    @Override // p003A1.InterfaceC0157C0
    /* JADX INFO: renamed from: a */
    public void mo496a(View view, float[] fArr) {
        Matrix matrix = this.f644a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f645b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        AbstractC14334L.m15612A(matrix, fArr);
    }
}
