package p330N4;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p544W9.AbstractC8627e4;

/* JADX INFO: renamed from: N4.I */
/* JADX INFO: loaded from: classes.dex */
public class C5643I extends AbstractC8627e4 {

    /* JADX INFO: renamed from: d */
    public static boolean f18335d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f18336e = true;

    /* JADX INFO: renamed from: f */
    public static boolean f18337f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f18338g = true;

    @Override // p544W9.AbstractC8627e4
    /* JADX INFO: renamed from: d */
    public void mo6072d(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo6072d(view, i10);
        } else if (f18338g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f18338g = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo6073f(View view, int i10, int i11, int i12, int i13) {
        if (f18337f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f18337f = false;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo6074g(View view, Matrix matrix) {
        if (f18335d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f18335d = false;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo6075h(View view, Matrix matrix) {
        if (f18336e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f18336e = false;
            }
        }
    }
}
