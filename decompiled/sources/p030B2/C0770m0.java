package p030B2;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: B2.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0770m0 {

    /* JADX INFO: renamed from: a */
    public AbstractC0768l0 f2166a;

    public C0770m0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2166a = new C0766k0(AbstractC0791x.m1792i(i10, interpolator, j10));
        } else {
            this.f2166a = new C0762i0(i10, interpolator, j10);
        }
    }
}
