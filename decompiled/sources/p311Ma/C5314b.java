package p311Ma;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: Ma.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5314b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f17494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f17495b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f17496c;

    public C5314b(boolean z6, View view, View view2) {
        this.f17494a = z6;
        this.f17495b = view;
        this.f17496c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f17494a) {
            return;
        }
        this.f17495b.setVisibility(4);
        View view = this.f17496c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f17494a) {
            this.f17495b.setVisibility(0);
            View view = this.f17496c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
