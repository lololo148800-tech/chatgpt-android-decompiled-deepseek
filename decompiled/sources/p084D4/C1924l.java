package p084D4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: D4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1924l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5631a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1933p0 f5632b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5633c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f5634d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1934q f5635e;

    public C1924l(C1934q c1934q, AbstractC1933p0 abstractC1933p0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5635e = c1934q;
        this.f5632b = abstractC1933p0;
        this.f5634d = viewPropertyAnimator;
        this.f5633c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5631a) {
            case 1:
                this.f5633c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5631a) {
            case 0:
                this.f5634d.setListener(null);
                this.f5633c.setAlpha(1.0f);
                C1934q c1934q = this.f5635e;
                AbstractC1933p0 abstractC1933p0 = this.f5632b;
                c1934q.m2911c(abstractC1933p0);
                c1934q.f5710q.remove(abstractC1933p0);
                c1934q.m3106i();
                break;
            default:
                this.f5634d.setListener(null);
                C1934q c1934q2 = this.f5635e;
                AbstractC1933p0 abstractC1933p1 = this.f5632b;
                c1934q2.m2911c(abstractC1933p1);
                c1934q2.f5708o.remove(abstractC1933p1);
                c1934q2.m3106i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5631a) {
            case 0:
                this.f5635e.getClass();
                break;
            default:
                this.f5635e.getClass();
                break;
        }
    }

    public C1924l(C1934q c1934q, AbstractC1933p0 abstractC1933p0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5635e = c1934q;
        this.f5632b = abstractC1933p0;
        this.f5633c = view;
        this.f5634d = viewPropertyAnimator;
    }
}
