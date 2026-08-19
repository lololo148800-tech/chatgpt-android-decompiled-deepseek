package p588Y2;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0066i;

/* JADX INFO: renamed from: Y2.g */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC9623g implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9614S f28999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9624h f29000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f29001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9620d f29002d;

    public AnimationAnimationListenerC9623g(C9614S c9614s, C9624h c9624h, View view, C9620d c9620d) {
        this.f28999a = c9614s;
        this.f29000b = c9624h;
        this.f29001c = view;
        this.f29002d = c9620d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC16544l.m18094g(animation, "animation");
        C9624h c9624h = this.f29000b;
        c9624h.f29003a.post(new RunnableC0066i(c9624h, this.f29001c, this.f29002d, 19));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f28999a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC16544l.m18094g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC16544l.m18094g(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f28999a + " has reached onAnimationStart.");
        }
    }
}
