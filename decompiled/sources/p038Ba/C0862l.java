package p038Ba;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Ba.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0862l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0863m f2417b;

    public /* synthetic */ C0862l(AbstractC0863m abstractC0863m, int i10) {
        this.f2416a = i10;
        this.f2417b = abstractC0863m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2416a) {
            case 1:
                super.onAnimationEnd(animator);
                AbstractC0863m abstractC0863m = this.f2417b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = abstractC0863m.f2424r0;
                if (arrayList != null && !abstractC0863m.f2425s0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0853c) it.next()).m1912a(abstractC0863m);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2416a) {
            case 0:
                super.onAnimationStart(animator);
                AbstractC0863m abstractC0863m = this.f2417b;
                ArrayList arrayList = abstractC0863m.f2424r0;
                if (arrayList != null && !abstractC0863m.f2425s0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0853c) it.next()).m1913b(abstractC0863m);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
