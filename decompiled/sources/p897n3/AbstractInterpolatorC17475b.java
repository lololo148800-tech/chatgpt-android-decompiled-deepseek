package p897n3;

import android.view.animation.Interpolator;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC17475b implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f55849a;

    /* JADX INFO: renamed from: b */
    public final float f55850b;

    public AbstractInterpolatorC17475b(float[] fArr) {
        this.f55849a = fArr;
        this.f55850b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f55849a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f55850b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return AbstractC12107L1.m13818i(fArr[iMin + 1], f13, f12, f13);
    }
}
