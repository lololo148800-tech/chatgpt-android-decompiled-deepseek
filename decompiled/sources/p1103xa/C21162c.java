package p1103xa;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: xa.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21162c implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final float[] f67251a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f67252b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f67253c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC21167h f67254d;

    public C21162c(AbstractC21167h abstractC21167h) {
        this.f67254d = abstractC21167h;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        this.f67254d.f67296p = f10;
        float[] fArr = this.f67251a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f67252b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = AbstractC12107L1.m13818i(f11, f12, f10, f12);
        }
        Matrix matrix = this.f67253c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
