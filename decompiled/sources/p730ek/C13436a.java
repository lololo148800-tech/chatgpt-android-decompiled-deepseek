package p730ek;

import android.animation.ValueAnimator;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ek.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13436a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42535a;

    /* JADX INFO: renamed from: b */
    public float f42536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ValueAnimator f42537c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Pi2ProgressArcView f42538d;

    public /* synthetic */ C13436a(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView, int i10) {
        this.f42535a = i10;
        this.f42537c = valueAnimator;
        this.f42538d = pi2ProgressArcView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        switch (this.f42535a) {
            case 0:
                AbstractC16544l.m18094g(animator, "animator");
                Object animatedValue = this.f42537c.getAnimatedValue();
                AbstractC16544l.m18092e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                float fAbs = Math.abs(fFloatValue - this.f42536b);
                Pi2ProgressArcView pi2ProgressArcView = this.f42538d;
                float f10 = pi2ProgressArcView.f40875v0;
                float f11 = (fAbs + f10) % 360;
                pi2ProgressArcView.f40875v0 = f11;
                if (f10 > f11) {
                    pi2ProgressArcView.f40875v0 = 0.0f;
                    animator.cancel();
                }
                this.f42536b = fFloatValue;
                pi2ProgressArcView.invalidate();
                break;
            default:
                AbstractC16544l.m18094g(animator, "animator");
                Object animatedValue2 = this.f42537c.getAnimatedValue();
                AbstractC16544l.m18092e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                float fAbs2 = Math.abs(fFloatValue2 - this.f42536b);
                Pi2ProgressArcView pi2ProgressArcView2 = this.f42538d;
                pi2ProgressArcView2.f40875v0 = (pi2ProgressArcView2.f40875v0 + fAbs2) % 360;
                this.f42536b = fFloatValue2;
                pi2ProgressArcView2.invalidate();
                break;
        }
    }
}
