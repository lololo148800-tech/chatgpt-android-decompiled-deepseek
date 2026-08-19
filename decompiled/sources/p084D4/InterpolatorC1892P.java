package p084D4;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: D4.P */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC1892P implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5528a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f5528a) {
            case 0:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                float f12 = f10 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }
}
