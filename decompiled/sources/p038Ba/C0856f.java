package p038Ba;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: Ba.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0856f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2385a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0858h f2386b;

    public /* synthetic */ C0856f(C0858h c0858h, int i10) {
        this.f2385a = i10;
        this.f2386b = c0858h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2385a) {
            case 1:
                super.onAnimationEnd(animator);
                C0858h c0858h = this.f2386b;
                ObjectAnimator objectAnimator = c0858h.f2393d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                C0853c c0853c = c0858h.f2400k;
                if (c0853c != null) {
                    c0853c.m1912a((C0866p) c0858h.f2431a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f2385a) {
            case 0:
                super.onAnimationRepeat(animator);
                C0858h c0858h = this.f2386b;
                c0858h.f2397h = (c0858h.f2397h + 4) % c0858h.f2396g.f2403c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
