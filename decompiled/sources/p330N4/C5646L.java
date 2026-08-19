package p330N4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p544W9.AbstractC8621d4;

/* JADX INFO: renamed from: N4.L */
/* JADX INFO: loaded from: classes.dex */
public final class C5646L extends AnimatorListenerAdapter implements InterfaceC5672w {

    /* JADX INFO: renamed from: a */
    public final View f18343a;

    /* JADX INFO: renamed from: b */
    public final int f18344b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f18345c;

    /* JADX INFO: renamed from: e */
    public boolean f18347e;

    /* JADX INFO: renamed from: f */
    public boolean f18348f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f18346d = true;

    public C5646L(View view, int i10) {
        this.f18343a = view;
        this.f18344b = i10;
        this.f18345c = (ViewGroup) view.getParent();
        m6078f(true);
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: a */
    public final void mo6066a() {
        m6078f(false);
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: d */
    public final void mo6069d() {
        m6078f(true);
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: e */
    public final void mo6070e(AbstractC5673x abstractC5673x) {
        if (!this.f18348f) {
            AbstractC5642H.f18332a.mo6072d(this.f18343a, this.f18344b);
            ViewGroup viewGroup = this.f18345c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m6078f(false);
        abstractC5673x.m6106w(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m6078f(boolean z6) {
        ViewGroup viewGroup;
        if (!this.f18346d || this.f18347e == z6 || (viewGroup = this.f18345c) == null) {
            return;
        }
        this.f18347e = z6;
        AbstractC8621d4.m9271b(viewGroup, z6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18348f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f18348f) {
            AbstractC5642H.f18332a.mo6072d(this.f18343a, this.f18344b);
            ViewGroup viewGroup = this.f18345c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m6078f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f18348f) {
            return;
        }
        AbstractC5642H.f18332a.mo6072d(this.f18343a, this.f18344b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f18348f) {
            return;
        }
        AbstractC5642H.f18332a.mo6072d(this.f18343a, 0);
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: c */
    public final void mo6068c() {
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: b */
    public final void mo6067b(AbstractC5673x abstractC5673x) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
