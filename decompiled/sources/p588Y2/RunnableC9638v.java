package p588Y2;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p030B2.ViewTreeObserverOnPreDrawListenerC0787v;

/* JADX INFO: renamed from: Y2.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9638v extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final ViewGroup f29055Y;

    /* JADX INFO: renamed from: Z */
    public final View f29056Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f29057o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f29058p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f29059q0;

    public RunnableC9638v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f29059q0 = true;
        this.f29055Y = viewGroup;
        this.f29056Z = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f29059q0 = true;
        if (this.f29057o0) {
            return !this.f29058p0;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f29057o0 = true;
            ViewTreeObserverOnPreDrawListenerC0787v.m1779a(this.f29055Y, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f29057o0;
        ViewGroup viewGroup = this.f29055Y;
        if (z6 || !this.f29059q0) {
            viewGroup.endViewTransition(this.f29056Z);
            this.f29058p0 = true;
        } else {
            this.f29059q0 = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f29059q0 = true;
        if (this.f29057o0) {
            return !this.f29058p0;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f29057o0 = true;
            ViewTreeObserverOnPreDrawListenerC0787v.m1779a(this.f29055Y, this);
        }
        return true;
    }
}
