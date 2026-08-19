package p544W9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import p285L8.AbstractC4960c;
import p285L8.C4958a;

/* JADX INFO: renamed from: W9.b3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8608b3 {
    /* JADX INFO: renamed from: c */
    public static void m9259c(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC4960c mo5608a() {
        return new C4958a((System.currentTimeMillis() / 1000) << 32, mo5607b());
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo5607b();
}
