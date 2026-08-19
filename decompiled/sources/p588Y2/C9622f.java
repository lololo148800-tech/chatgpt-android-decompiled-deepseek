package p588Y2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Y2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9622f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9624h f28994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f28995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f28996c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9614S f28997d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9620d f28998e;

    public C9622f(C9624h c9624h, View view, boolean z6, C9614S c9614s, C9620d c9620d) {
        this.f28994a = c9624h;
        this.f28995b = view;
        this.f28996c = z6;
        this.f28997d = c9614s;
        this.f28998e = c9620d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        AbstractC16544l.m18094g(anim, "anim");
        ViewGroup viewGroup = this.f28994a.f29003a;
        View viewToAnimate = this.f28995b;
        viewGroup.endViewTransition(viewToAnimate);
        C9614S c9614s = this.f28997d;
        if (this.f28996c) {
            int i10 = c9614s.f28948a;
            AbstractC16544l.m18093f(viewToAnimate, "viewToAnimate");
            AbstractC9306j0.m9884c(viewToAnimate, i10);
        }
        this.f28998e.m770d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + c9614s + " has ended.");
        }
    }
}
