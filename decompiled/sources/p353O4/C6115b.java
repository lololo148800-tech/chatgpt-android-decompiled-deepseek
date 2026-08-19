package p353O4;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p038Ba.C0853c;

/* JADX INFO: renamed from: O4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6115b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0853c f19907a;

    public C6115b(C0853c c0853c) {
        this.f19907a = c0853c;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f19907a.m1912a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f19907a.m1913b(drawable);
    }
}
