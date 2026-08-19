package p189Ha;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import io.sentry.android.core.AbstractC15256t;
import za.AbstractC21828k;

/* JADX INFO: renamed from: Ha.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3270d implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9945Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC3276j f9946Z;

    public /* synthetic */ RunnableC3270d(AbstractC3276j abstractC3276j, int i10) {
        this.f9945Y = i10;
        this.f9946Z = abstractC3276j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        AbstractC3276j abstractC3276j = this.f9946Z;
        int i10 = 1;
        byte b = 0;
        switch (this.f9945Y) {
            case 0:
                if (abstractC3276j.f9978i != null) {
                    Context context = abstractC3276j.f9977h;
                    int i11 = AbstractC21828k.f69278d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    AbstractC3275i abstractC3275i = abstractC3276j.f9978i;
                    abstractC3275i.getLocationOnScreen(iArr);
                    int height = (iHeight - (abstractC3275i.getHeight() + iArr[1])) + ((int) abstractC3275i.getTranslationY());
                    int i12 = abstractC3276j.f9987r;
                    if (height < i12) {
                        ViewGroup.LayoutParams layoutParams = abstractC3275i.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            AbstractC15256t.m16482t(AbstractC3276j.f9966C, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i13 = abstractC3276j.f9987r;
                            abstractC3276j.f9988s = i13;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i13 - height) + marginLayoutParams.bottomMargin;
                            abstractC3275i.requestLayout();
                        }
                    } else {
                        abstractC3276j.f9988s = i12;
                    }
                }
                break;
            case 1:
                abstractC3276j.m4152c();
                break;
            default:
                AbstractC3275i abstractC3275i2 = abstractC3276j.f9978i;
                if (abstractC3275i2 != null) {
                    ViewParent parent = abstractC3275i2.getParent();
                    AbstractC3275i abstractC3275i3 = abstractC3276j.f9978i;
                    if (parent != null) {
                        abstractC3275i3.setVisibility(0);
                    }
                    if (abstractC3275i3.getAnimationMode() != 1) {
                        int height2 = abstractC3275i3.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = abstractC3275i3.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        abstractC3275i3.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(abstractC3276j.f9974e);
                        valueAnimator.setDuration(abstractC3276j.f9972c);
                        valueAnimator.addListener(new C3267a(abstractC3276j, i10));
                        valueAnimator.addUpdateListener(new C3268b(abstractC3276j, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(abstractC3276j.f9973d);
                        valueAnimatorOfFloat.addUpdateListener(new C3268b(abstractC3276j, b, b));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(abstractC3276j.f9975f);
                        valueAnimatorOfFloat2.addUpdateListener(new C3268b(abstractC3276j, i10, b));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(abstractC3276j.f9970a);
                        animatorSet.addListener(new C3267a(abstractC3276j, 3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
