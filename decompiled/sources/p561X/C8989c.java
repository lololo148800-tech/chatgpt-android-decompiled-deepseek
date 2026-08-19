package p561X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8470E2;

/* JADX INFO: renamed from: X.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8989c {

    /* JADX INFO: renamed from: a */
    public Size f27427a;

    /* JADX INFO: renamed from: b */
    public Rect f27428b;

    /* JADX INFO: renamed from: c */
    public int f27429c;

    /* JADX INFO: renamed from: d */
    public Matrix f27430d;

    /* JADX INFO: renamed from: e */
    public int f27431e;

    /* JADX INFO: renamed from: f */
    public boolean f27432f;

    /* JADX INFO: renamed from: g */
    public boolean f27433g;

    /* JADX INFO: renamed from: h */
    public EnumC8993g f27434h;

    /* JADX INFO: renamed from: a */
    public final Matrix m9573a(Size size, int i10, Rect rect) {
        Matrix matrix = null;
        if (!m9578f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (m9578f()) {
            matrix = new Matrix(this.f27430d);
            matrix.postConcat(m9575c(size, i10));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    /* JADX INFO: renamed from: b */
    public final Size m9574b() {
        return AbstractC4503n.m5247c(this.f27429c) ? new Size(this.f27428b.height(), this.f27428b.width()) : new Size(this.f27428b.width(), this.f27428b.height());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX INFO: renamed from: c */
    public final Matrix m9575c(Size size, int i10) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        AbstractC4941g.m5559R(null, m9578f());
        if (AbstractC4503n.m5248d(size, true, m9574b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeM9574b = m9574b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeM9574b.getWidth(), sizeM9574b.getHeight());
            Matrix matrix = new Matrix();
            EnumC8993g enumC8993g = this.f27434h;
            int iOrdinal = enumC8993g.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                AbstractC8072d6.m8487d("PreviewTransform", "Unexpected crop rect: " + enumC8993g);
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (enumC8993g == EnumC8993g.FIT_CENTER || enumC8993g == EnumC8993g.FIT_START || enumC8993g == EnumC8993g.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i10 == 1) {
                float width = size.getWidth() / 2.0f;
                float f10 = width + width;
                rectF = new RectF(f10 - rectF3.right, rectF3.top, f10 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixM5245a = AbstractC4503n.m5245a(new RectF(this.f27428b), rectF, this.f27429c, false);
        if (this.f27432f && this.f27433g) {
            if (AbstractC4503n.m5247c(this.f27429c)) {
                matrixM5245a.preScale(1.0f, -1.0f, this.f27428b.centerX(), this.f27428b.centerY());
            } else {
                matrixM5245a.preScale(-1.0f, 1.0f, this.f27428b.centerX(), this.f27428b.centerY());
            }
        }
        return matrixM5245a;
    }

    /* JADX INFO: renamed from: d */
    public final Matrix m9576d() {
        AbstractC4941g.m5559R(null, m9578f());
        RectF rectF = new RectF(0.0f, 0.0f, this.f27427a.getWidth(), this.f27427a.getHeight());
        return AbstractC4503n.m5245a(rectF, rectF, !this.f27433g ? this.f27429c : -AbstractC8470E2.m9102c(this.f27431e), false);
    }

    /* JADX INFO: renamed from: e */
    public final RectF m9577e(Size size, int i10) {
        AbstractC4941g.m5559R(null, m9578f());
        Matrix matrixM9575c = m9575c(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f27427a.getWidth(), this.f27427a.getHeight());
        matrixM9575c.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9578f() {
        return (this.f27428b == null || this.f27427a == null || !(!this.f27433g || this.f27431e != -1)) ? false : true;
    }
}
