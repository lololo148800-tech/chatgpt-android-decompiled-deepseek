package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p311Ma.C5315c;
import p544W9.AbstractC8608b3;
import p806ia.C14955e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final C14955e f36836c;

    /* JADX INFO: renamed from: d */
    public final C14955e f36837d;

    public FabTransformationScrimBehavior() {
        this.f36836c = new C14955e(75L);
        this.f36837d = new C14955e(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p862l2.AbstractC16803b
    /* JADX INFO: renamed from: b */
    public final boolean mo13577b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: q */
    public final boolean mo13575q(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: s */
    public final AnimatorSet mo13691s(View view, View view2, boolean z6, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C14955e c14955e = z6 ? this.f36836c : this.f36837d;
        if (z6) {
            if (!z10) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c14955e.m16120a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC8608b3.m9259c(animatorSet, arrayList);
        animatorSet.addListener(new C5315c(view2, z6));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36836c = new C14955e(75L);
        this.f36837d = new C14955e(0L);
    }
}
