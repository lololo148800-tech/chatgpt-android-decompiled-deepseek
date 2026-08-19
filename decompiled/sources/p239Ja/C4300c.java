package p239Ja;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: Ja.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4300c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4301d f13979b;

    public /* synthetic */ C4300c(C4301d c4301d, int i10) {
        this.f13978a = i10;
        this.f13979b = c4301d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f13978a) {
            case 1:
                this.f13979b.f14043b.m5113g(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f13978a) {
            case 0:
                this.f13979b.f14043b.m5113g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
