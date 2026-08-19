package p084D4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: D4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1926m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1933p0 f5650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5651b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5652c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5653d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f5654e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1934q f5655f;

    public C1926m(C1934q c1934q, AbstractC1933p0 abstractC1933p0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5655f = c1934q;
        this.f5650a = abstractC1933p0;
        this.f5651b = i10;
        this.f5652c = view;
        this.f5653d = i11;
        this.f5654e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f5651b;
        View view = this.f5652c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f5653d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5654e.setListener(null);
        C1934q c1934q = this.f5655f;
        AbstractC1933p0 abstractC1933p0 = this.f5650a;
        c1934q.m2911c(abstractC1933p0);
        c1934q.f5709p.remove(abstractC1933p0);
        c1934q.m3106i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5655f.getClass();
    }
}
