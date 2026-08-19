package p330N4;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: N4.J */
/* JADX INFO: loaded from: classes.dex */
public final class C5644J extends C5643I {
    @Override // p544W9.AbstractC8627e4
    /* JADX INFO: renamed from: b */
    public final float mo6076b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p544W9.AbstractC8627e4
    /* JADX INFO: renamed from: c */
    public final void mo6077c(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p330N4.C5643I, p544W9.AbstractC8627e4
    /* JADX INFO: renamed from: d */
    public final void mo6072d(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p330N4.C5643I
    /* JADX INFO: renamed from: f */
    public final void mo6073f(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p330N4.C5643I
    /* JADX INFO: renamed from: g */
    public final void mo6074g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p330N4.C5643I
    /* JADX INFO: renamed from: h */
    public final void mo6075h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
