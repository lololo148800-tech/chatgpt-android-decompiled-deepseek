package p253K;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: K.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4503n {

    /* JADX INFO: renamed from: a */
    public static final RectF f14693a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static Matrix m5245a(RectF rectF, RectF rectF2, int i10, boolean z6) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f14693a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i10);
        if (z6) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5246b(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5247c(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid rotation degrees: "));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m5248d(Size size, boolean z6, Size size2) {
        float width;
        float width2;
        if (z6) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    /* JADX INFO: renamed from: e */
    public static Size m5249e(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* JADX INFO: renamed from: f */
    public static Size m5250f(Size size, int i10) {
        AbstractC4941g.m5554M("Invalid rotation degrees: " + i10, i10 % 90 == 0);
        return m5247c(m5251g(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* JADX INFO: renamed from: g */
    public static int m5251g(int i10) {
        return ((i10 % 360) + 360) % 360;
    }
}
