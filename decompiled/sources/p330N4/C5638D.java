package p330N4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: N4.D */
/* JADX INFO: loaded from: classes.dex */
public final class C5638D implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final float[] f18314a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f18315b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f18316c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        float[] fArr = this.f18314a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f18315b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = AbstractC12107L1.m13818i(f11, f12, f10, f12);
        }
        Matrix matrix = this.f18316c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
