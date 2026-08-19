package p311Ma;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p330N4.AbstractC5642H;
import p330N4.C5643I;

/* JADX INFO: renamed from: Ma.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5315c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17497a;

    /* JADX INFO: renamed from: b */
    public final View f17498b;

    /* JADX INFO: renamed from: c */
    public boolean f17499c;

    public C5315c(View view, boolean z6) {
        this.f17497a = 0;
        this.f17499c = z6;
        this.f17498b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17497a) {
            case 0:
                if (!this.f17499c) {
                    this.f17498b.setVisibility(4);
                }
                break;
            default:
                C5643I c5643i = AbstractC5642H.f18332a;
                View view = this.f17498b;
                c5643i.mo6077c(view, 1.0f);
                if (this.f17499c) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f17498b;
        switch (this.f17497a) {
            case 0:
                if (this.f17499c) {
                    view.setVisibility(0);
                }
                break;
            default:
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f17499c = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
        }
    }

    public C5315c(View view) {
        this.f17497a = 1;
        this.f17499c = false;
        this.f17498b = view;
    }
}
