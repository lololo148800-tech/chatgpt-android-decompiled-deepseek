package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p228J.AbstractC3794B0;
import p239Ja.C4308k;
import p523V9.AbstractC8034Z;
import p806ia.AbstractC14951a;
import p862l2.AbstractC16803b;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC16803b {

    /* JADX INFO: renamed from: b */
    public int f36396b;

    /* JADX INFO: renamed from: c */
    public int f36397c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f36398d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f36399e;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f36402h;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f36395a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f36400f = 0;

    /* JADX INFO: renamed from: g */
    public int f36401g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f36400f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f36396b = AbstractC8034Z.m8389d(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f36397c = AbstractC8034Z.m8389d(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f36398d = AbstractC8034Z.m8390e(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC14951a.f46574d);
        this.f36399e = AbstractC8034Z.m8390e(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC14951a.f46573c);
        return false;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: k */
    public final void mo13570k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f36395a;
        if (i10 > 0) {
            if (this.f36401g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f36402h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f36401g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC3794B0.m4497v(it);
            }
            this.f36402h = view.animate().translationY(this.f36400f).setInterpolator(this.f36399e).setDuration(this.f36397c).setListener(new C4308k(this, 6));
            return;
        }
        if (i10 >= 0 || this.f36401g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f36402h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f36401g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC3794B0.m4497v(it2);
        }
        this.f36402h = view.animate().translationY(0).setInterpolator(this.f36398d).setDuration(this.f36396b).setListener(new C4308k(this, 6));
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: o */
    public boolean mo13573o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
