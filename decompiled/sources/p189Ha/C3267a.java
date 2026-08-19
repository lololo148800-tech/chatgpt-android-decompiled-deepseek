package p189Ha;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: renamed from: Ha.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3267a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9941a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC3276j f9942b;

    public /* synthetic */ C3267a(AbstractC3276j abstractC3276j, int i10) {
        this.f9941a = i10;
        this.f9942b = abstractC3276j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9941a) {
            case 0:
                this.f9942b.m4152c();
                break;
            case 1:
                this.f9942b.m4153d();
                break;
            case 2:
                this.f9942b.m4152c();
                break;
            default:
                this.f9942b.m4153d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9941a) {
            case 1:
                AbstractC3276j abstractC3276j = this.f9942b;
                SnackbarContentLayout snackbarContentLayout = abstractC3276j.f9979j;
                int i10 = abstractC3276j.f9972c;
                int i11 = abstractC3276j.f9970a;
                int i12 = i10 - i11;
                snackbarContentLayout.f36699o0.setAlpha(0.0f);
                long j10 = i11;
                ViewPropertyAnimator duration = snackbarContentLayout.f36699o0.animate().alpha(1.0f).setDuration(j10);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f36701q0;
                long j11 = i12;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f36700p0.getVisibility() == 0) {
                    snackbarContentLayout.f36700p0.setAlpha(0.0f);
                    snackbarContentLayout.f36700p0.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                }
                break;
            case 2:
                AbstractC3276j abstractC3276j2 = this.f9942b;
                SnackbarContentLayout snackbarContentLayout2 = abstractC3276j2.f9979j;
                snackbarContentLayout2.f36699o0.setAlpha(1.0f);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout2.f36699o0.animate().alpha(0.0f);
                long j12 = abstractC3276j2.f9971b;
                ViewPropertyAnimator duration2 = viewPropertyAnimatorAlpha.setDuration(j12);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f36701q0;
                long j13 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j13).start();
                if (snackbarContentLayout2.f36700p0.getVisibility() == 0) {
                    snackbarContentLayout2.f36700p0.setAlpha(1.0f);
                    snackbarContentLayout2.f36700p0.animate().alpha(0.0f).setDuration(j12).setInterpolator(timeInterpolator2).setStartDelay(j13).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C3267a(AbstractC3276j abstractC3276j, int i10, int i11) {
        this.f9941a = i11;
        this.f9942b = abstractC3276j;
    }
}
