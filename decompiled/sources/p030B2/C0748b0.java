package p030B2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p330N4.AbstractC5673x;
import p692d0.C12966e;

/* JADX INFO: renamed from: B2.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0748b0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2120a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2122c;

    public /* synthetic */ C0748b0(Object obj, View view, int i10) {
        this.f2120a = i10;
        this.f2122c = obj;
        this.f2121b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2120a) {
            case 0:
                ((InterfaceC0752d0) this.f2122c).mo1607a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2120a) {
            case 0:
                ((InterfaceC0752d0) this.f2122c).mo1609c();
                break;
            case 1:
                C0770m0 c0770m0 = (C0770m0) this.f2122c;
                c0770m0.f2166a.mo1705d(1.0f);
                C0762i0.m1686e((View) this.f2121b, c0770m0);
                break;
            default:
                ((C12966e) this.f2122c).remove(animator);
                ((AbstractC5673x) this.f2121b).f18426y0.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2120a) {
            case 0:
                ((InterfaceC0752d0) this.f2122c).mo1608b();
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((AbstractC5673x) this.f2121b).f18426y0.add(animator);
                break;
        }
    }

    public C0748b0(AbstractC5673x abstractC5673x, C12966e c12966e) {
        this.f2120a = 2;
        this.f2121b = abstractC5673x;
        this.f2122c = c12966e;
    }
}
