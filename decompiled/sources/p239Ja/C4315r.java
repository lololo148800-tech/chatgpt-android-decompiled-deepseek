package p239Ja;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p999s.C19329Y;

/* JADX INFO: renamed from: Ja.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4315r extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f14047b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f14048c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f14049d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4317t f14050e;

    public C4315r(C4317t c4317t, int i10, TextView textView, int i11, TextView textView2) {
        this.f14050e = c4317t;
        this.f14046a = i10;
        this.f14047b = textView;
        this.f14048c = i11;
        this.f14049d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C19329Y c19329y;
        int i10 = this.f14046a;
        C4317t c4317t = this.f14050e;
        c4317t.f14067n = i10;
        c4317t.f14065l = null;
        TextView textView = this.f14047b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f14048c == 1 && (c19329y = c4317t.f14071r) != null) {
                c19329y.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f14049d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f14049d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
