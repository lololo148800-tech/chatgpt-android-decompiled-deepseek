package p730ek;

import android.animation.Animator;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.RunnableC0153B;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ek.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13437b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1426a f42539a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Pi2ProgressArcView f42540b;

    public C13437b(InterfaceC1426a interfaceC1426a, Pi2ProgressArcView pi2ProgressArcView) {
        this.f42539a = interfaceC1426a;
        this.f42540b = pi2ProgressArcView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC16544l.m18094g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC16544l.m18094g(animator, "animator");
        InterfaceC1426a interfaceC1426a = this.f42539a;
        if (interfaceC1426a != null) {
            this.f42540b.postDelayed(new RunnableC0153B(interfaceC1426a), 100L);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        AbstractC16544l.m18094g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC16544l.m18094g(animator, "animator");
    }
}
