package p330N4;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;
import p038Ba.C0857g;

/* JADX INFO: renamed from: N4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5659j extends AbstractC5673x {

    /* JADX INFO: renamed from: J0 */
    public static final String[] f18377J0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: K0 */
    public static final C5657h f18378K0 = new C5657h();

    /* JADX INFO: renamed from: L0 */
    public static final C0857g f18379L0 = new C0857g(Matrix.class, "animatedTransform", 8);

    /* JADX INFO: renamed from: I */
    public static void m6088I(C5640F c5640f) {
        Matrix matrix;
        View view = c5640f.f18321b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = c5640f.f18320a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i10 = AbstractC5658i.f18376a[imageView.getScaleType().ordinal()];
                if (i10 == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i10 != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f10 = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f11 = intrinsicHeight;
                    float fMax = Math.max(width / f10, height / f11);
                    int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
                    int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(fMax, fMax);
                    matrix3.postTranslate(iRound, iRound2);
                    matrix = matrix3;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: c */
    public final void mo6056c(C5640F c5640f) {
        m6088I(c5640f);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: f */
    public final void mo6058f(C5640F c5640f) {
        m6088I(c5640f);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: j */
    public final Animator mo6083j(ViewGroup viewGroup, C5640F c5640f, C5640F c5640f2) {
        if (c5640f != null && c5640f2 != null) {
            HashMap map = c5640f.f18320a;
            Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
            HashMap map2 = c5640f2.f18320a;
            Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
                Object obj = (Matrix) map2.get("android:changeImageTransform:matrix");
                boolean z6 = (matrix == null && obj == null) || (matrix != null && matrix.equals(obj));
                if (rect.equals(rect2) && z6) {
                    return null;
                }
                ImageView imageView = (ImageView) c5640f2.f18321b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                C0857g c0857g = f18379L0;
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    C5657h c5657h = f18378K0;
                    C5662m c5662m = AbstractC5663n.f18382a;
                    return ObjectAnimator.ofObject(imageView, c0857g, c5657h, c5662m, c5662m);
                }
                if (matrix == null) {
                    matrix = AbstractC5663n.f18382a;
                }
                if (obj == null) {
                    obj = AbstractC5663n.f18382a;
                }
                c0857g.set(imageView, matrix);
                return ObjectAnimator.ofObject(imageView, c0857g, new C5638D(), matrix, obj);
            }
        }
        return null;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: q */
    public final String[] mo6084q() {
        return f18377J0;
    }
}
