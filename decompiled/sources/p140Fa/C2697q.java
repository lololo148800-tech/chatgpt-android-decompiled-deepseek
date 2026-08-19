package p140Fa;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: Fa.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2697q extends AbstractC2698r {

    /* JADX INFO: renamed from: b */
    public float f8300b;

    /* JADX INFO: renamed from: c */
    public float f8301c;

    @Override // p140Fa.AbstractC2698r
    /* JADX INFO: renamed from: a */
    public final void mo3697a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8302a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f8300b, this.f8301c);
        path.transform(matrix);
    }
}
