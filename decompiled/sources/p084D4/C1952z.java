package p084D4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p140Fa.C2687g;

/* JADX INFO: renamed from: D4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1952z implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5783b;

    public /* synthetic */ C1952z(Object obj, int i10) {
        this.f5782a = i10;
        this.f5783b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5782a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1876A c1876a = (C1876A) this.f5783b;
                c1876a.f5427c.setAlpha(iFloatValue);
                c1876a.f5428d.setAlpha(iFloatValue);
                c1876a.f5443s.invalidate();
                break;
            case 1:
                ((TextInputLayout) this.f5783b).f36720D1.m22301k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2687g c2687g = ((BottomSheetBehavior) this.f5783b).f36451j;
                if (c2687g != null) {
                    c2687g.m3683m(fFloatValue);
                }
                break;
        }
    }
}
