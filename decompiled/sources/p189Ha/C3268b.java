package p189Ha;

import android.animation.ValueAnimator;
import p897n3.C17474a;

/* JADX INFO: renamed from: Ha.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3268b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC3276j f9944b;

    public /* synthetic */ C3268b(AbstractC3276j abstractC3276j, int i10, byte b) {
        this.f9943a = i10;
        this.f9944b = abstractC3276j;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC3276j abstractC3276j = this.f9944b;
        switch (this.f9943a) {
            case 0:
                abstractC3276j.f9978i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abstractC3276j.f9978i.setScaleX(fFloatValue);
                abstractC3276j.f9978i.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C17474a c17474a = AbstractC3276j.f9967x;
                abstractC3276j.f9978i.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C17474a c17474a2 = AbstractC3276j.f9967x;
                abstractC3276j.f9978i.setTranslationY(iIntValue2);
                break;
        }
    }

    public C3268b(AbstractC3276j abstractC3276j, int i10) {
        this.f9943a = 2;
        this.f9944b = abstractC3276j;
    }
}
