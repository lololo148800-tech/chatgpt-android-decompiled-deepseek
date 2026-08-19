package p084D4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p1103xa.AbstractC21167h;

/* JADX INFO: renamed from: D4.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1950y extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5774a;

    /* JADX INFO: renamed from: b */
    public boolean f5775b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5776c;

    public C1950y(AbstractC21167h abstractC21167h) {
        this.f5774a = 1;
        this.f5776c = abstractC21167h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5774a) {
            case 0:
                this.f5775b = true;
                break;
            default:
                this.f5775b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5774a) {
            case 0:
                if (!this.f5775b) {
                    C1876A c1876a = (C1876A) this.f5776c;
                    if (((Float) c1876a.f5450z.getAnimatedValue()).floatValue() != 0.0f) {
                        c1876a.f5423A = 2;
                        c1876a.f5443s.invalidate();
                    } else {
                        c1876a.f5423A = 0;
                        c1876a.m2857g(0);
                    }
                } else {
                    this.f5775b = false;
                }
                break;
            default:
                AbstractC21167h abstractC21167h = (AbstractC21167h) this.f5776c;
                abstractC21167h.f67298r = 0;
                abstractC21167h.f67292l = null;
                if (!this.f5775b) {
                    abstractC21167h.f67299s.m22313a(4, false);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5774a) {
            case 1:
                AbstractC21167h abstractC21167h = (AbstractC21167h) this.f5776c;
                abstractC21167h.f67299s.m22313a(0, false);
                abstractC21167h.f67298r = 1;
                abstractC21167h.f67292l = animator;
                this.f5775b = false;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C1950y(C1876A c1876a) {
        this.f5774a = 0;
        this.f5776c = c1876a;
        this.f5775b = false;
    }
}
