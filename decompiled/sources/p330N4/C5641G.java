package p330N4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: N4.G */
/* JADX INFO: loaded from: classes.dex */
public final class C5641G extends AnimatorListenerAdapter implements InterfaceC5672w {

    /* JADX INFO: renamed from: a */
    public final View f18323a;

    /* JADX INFO: renamed from: b */
    public final View f18324b;

    /* JADX INFO: renamed from: c */
    public final int f18325c;

    /* JADX INFO: renamed from: d */
    public final int f18326d;

    /* JADX INFO: renamed from: e */
    public int[] f18327e;

    /* JADX INFO: renamed from: f */
    public float f18328f;

    /* JADX INFO: renamed from: g */
    public float f18329g;

    /* JADX INFO: renamed from: h */
    public final float f18330h;

    /* JADX INFO: renamed from: i */
    public final float f18331i;

    public C5641G(View view, View view2, int i10, int i11, float f10, float f11) {
        this.f18324b = view;
        this.f18323a = view2;
        this.f18325c = i10 - Math.round(view.getTranslationX());
        this.f18326d = i11 - Math.round(view.getTranslationY());
        this.f18330h = f10;
        this.f18331i = f11;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.f18327e = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: e */
    public final void mo6070e(AbstractC5673x abstractC5673x) {
        View view = this.f18324b;
        view.setTranslationX(this.f18330h);
        view.setTranslationY(this.f18331i);
        abstractC5673x.m6106w(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f18327e == null) {
            this.f18327e = new int[2];
        }
        int[] iArr = this.f18327e;
        float f10 = this.f18325c;
        View view = this.f18324b;
        iArr[0] = Math.round(view.getTranslationX() + f10);
        this.f18327e[1] = Math.round(view.getTranslationY() + this.f18326d);
        this.f18323a.setTag(R.id.transition_position, this.f18327e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        View view = this.f18324b;
        this.f18328f = view.getTranslationX();
        this.f18329g = view.getTranslationY();
        view.setTranslationX(this.f18330h);
        view.setTranslationY(this.f18331i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        float f10 = this.f18328f;
        View view = this.f18324b;
        view.setTranslationX(f10);
        view.setTranslationY(this.f18329g);
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: a */
    public final void mo6066a() {
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: c */
    public final void mo6068c() {
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: d */
    public final void mo6069d() {
    }

    @Override // p330N4.InterfaceC5672w
    /* JADX INFO: renamed from: b */
    public final void mo6067b(AbstractC5673x abstractC5673x) {
    }
}
