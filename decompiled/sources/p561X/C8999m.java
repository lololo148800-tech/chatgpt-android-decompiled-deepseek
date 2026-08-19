package p561X;

import android.animation.Animator;
import p329N3.RunnableC5611a;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: X.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8999m implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RunnableC5611a f27459a;

    public C8999m(RunnableC5611a runnableC5611a) {
        this.f27459a = runnableC5611a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC8072d6.m8486c("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
        this.f27459a.run();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
