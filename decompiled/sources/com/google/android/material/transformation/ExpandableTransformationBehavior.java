package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p239Ja.C4308k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f36829b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: r */
    public void mo13690r(View view, View view2, boolean z6, boolean z10) {
        AnimatorSet animatorSet = this.f36829b;
        boolean z11 = animatorSet != null;
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo13691s = mo13691s(view, view2, z6, z11);
        this.f36829b = animatorSetMo13691s;
        animatorSetMo13691s.addListener(new C4308k(this, 1));
        this.f36829b.start();
        if (z10) {
            return;
        }
        this.f36829b.end();
    }

    /* JADX INFO: renamed from: s */
    public abstract AnimatorSet mo13691s(View view, View view2, boolean z6, boolean z10);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
