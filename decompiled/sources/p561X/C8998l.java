package p561X;

import android.animation.ValueAnimator;
import p001A.C0053b0;
import p178H.InterfaceC3122O;
import p197Hj.C3455a;
import p329N3.RunnableC5611a;
import p523V9.AbstractC8072d6;
import p817j$.util.Objects;

/* JADX INFO: renamed from: X.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8998l implements InterfaceC3122O {

    /* JADX INFO: renamed from: a */
    public float f27456a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f27457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9000n f27458c;

    public C8998l(C9000n c9000n) {
        this.f27458c = c9000n;
    }

    @Override // p178H.InterfaceC3122O
    /* JADX INFO: renamed from: a */
    public final void mo3954a(long j10, C0053b0 c0053b0) {
        AbstractC8072d6.m8486c("ScreenFlashView", "ScreenFlash#apply");
        C9000n c9000n = this.f27458c;
        this.f27456a = c9000n.getBrightness();
        c9000n.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.f27457b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(c0053b0);
        RunnableC5611a runnableC5611a = new RunnableC5611a(c0053b0, 15);
        AbstractC8072d6.m8486c("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(c9000n.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new C3455a(c9000n, 3));
        valueAnimatorOfFloat.addListener(new C8999m(runnableC5611a));
        valueAnimatorOfFloat.start();
        this.f27457b = valueAnimatorOfFloat;
    }

    @Override // p178H.InterfaceC3122O
    public final void clear() {
        AbstractC8072d6.m8486c("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.f27457b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f27457b = null;
        }
        C9000n c9000n = this.f27458c;
        c9000n.setAlpha(0.0f);
        c9000n.setBrightness(this.f27456a);
    }
}
