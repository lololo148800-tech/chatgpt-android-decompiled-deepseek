package p1103xa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import p140Fa.C2687g;

/* JADX INFO: renamed from: xa.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21166g extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public boolean f67266a;

    /* JADX INFO: renamed from: b */
    public float f67267b;

    /* JADX INFO: renamed from: c */
    public float f67268c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C21169j f67269d;

    public AbstractC21166g(C21169j c21169j) {
        this.f67269d = c21169j;
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo21594a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = (int) this.f67268c;
        C2687g c2687g = this.f67269d.f67282b;
        if (c2687g != null) {
            c2687g.m3681k(f10);
        }
        this.f67266a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z6 = this.f67266a;
        C21169j c21169j = this.f67269d;
        if (!z6) {
            C2687g c2687g = c21169j.f67282b;
            this.f67267b = c2687g == null ? 0.0f : c2687g.f8246Y.f8232m;
            this.f67268c = mo21594a();
            this.f67266a = true;
        }
        float f10 = this.f67267b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f67268c - f10)) + f10);
        C2687g c2687g2 = c21169j.f67282b;
        if (c2687g2 != null) {
            c2687g2.m3681k(animatedFraction);
        }
    }
}
