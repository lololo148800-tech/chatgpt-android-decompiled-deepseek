package p084D4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: D4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1928n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1930o f5657b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f5658c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f5659d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1934q f5660e;

    public /* synthetic */ C1928n(C1934q c1934q, C1930o c1930o, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f5656a = i10;
        this.f5660e = c1934q;
        this.f5657b = c1930o;
        this.f5658c = viewPropertyAnimator;
        this.f5659d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5656a) {
            case 0:
                this.f5658c.setListener(null);
                View view = this.f5659d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1930o c1930o = this.f5657b;
                AbstractC1933p0 abstractC1933p0 = c1930o.f5661a;
                C1934q c1934q = this.f5660e;
                c1934q.m2911c(abstractC1933p0);
                c1934q.f5711r.remove(c1930o.f5661a);
                c1934q.m3106i();
                break;
            default:
                this.f5658c.setListener(null);
                View view2 = this.f5659d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1930o c1930o2 = this.f5657b;
                AbstractC1933p0 abstractC1933p1 = c1930o2.f5662b;
                C1934q c1934q2 = this.f5660e;
                c1934q2.m2911c(abstractC1933p1);
                c1934q2.f5711r.remove(c1930o2.f5662b);
                c1934q2.m3106i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5656a) {
            case 0:
                AbstractC1933p0 abstractC1933p0 = this.f5657b.f5661a;
                this.f5660e.getClass();
                break;
            default:
                AbstractC1933p0 abstractC1933p1 = this.f5657b.f5662b;
                this.f5660e.getClass();
                break;
        }
    }
}
