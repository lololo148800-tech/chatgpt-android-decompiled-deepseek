package p140Fa;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: Fa.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2696p extends AbstractC2698r {

    /* JADX INFO: renamed from: h */
    public static final RectF f8293h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f8294b;

    /* JADX INFO: renamed from: c */
    public final float f8295c;

    /* JADX INFO: renamed from: d */
    public final float f8296d;

    /* JADX INFO: renamed from: e */
    public final float f8297e;

    /* JADX INFO: renamed from: f */
    public float f8298f;

    /* JADX INFO: renamed from: g */
    public float f8299g;

    public C2696p(float f10, float f11, float f12, float f13) {
        this.f8294b = f10;
        this.f8295c = f11;
        this.f8296d = f12;
        this.f8297e = f13;
    }

    @Override // p140Fa.AbstractC2698r
    /* JADX INFO: renamed from: a */
    public final void mo3697a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8302a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f8293h;
        rectF.set(this.f8294b, this.f8295c, this.f8296d, this.f8297e);
        path.arcTo(rectF, this.f8298f, this.f8299g, false);
        path.transform(matrix);
    }
}
