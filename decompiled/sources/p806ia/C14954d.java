package p806ia;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import p692d0.C12959L;

/* JADX INFO: renamed from: ia.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14954d {

    /* JADX INFO: renamed from: a */
    public final C12959L f46576a = new C12959L(0);

    /* JADX INFO: renamed from: b */
    public final C12959L f46577b = new C12959L(0);

    /* JADX INFO: renamed from: a */
    public static C14954d m16116a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return m16117b(context, resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static C14954d m16117b(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m16118c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m16118c(arrayList);
        } catch (Exception e10) {
            AbstractC15256t.m16483u("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C14954d m16118c(ArrayList arrayList) {
        C14954d c14954d = new C14954d();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c14954d.f46577b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC14951a.f46572b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC14951a.f46573c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC14951a.f46574d;
            }
            C14955e c14955e = new C14955e();
            c14955e.f46581d = 0;
            c14955e.f46582e = 1;
            c14955e.f46578a = startDelay;
            c14955e.f46579b = duration;
            c14955e.f46580c = interpolator;
            c14955e.f46581d = objectAnimator.getRepeatCount();
            c14955e.f46582e = objectAnimator.getRepeatMode();
            c14954d.f46576a.put(propertyName, c14955e);
        }
        return c14954d;
    }

    /* JADX INFO: renamed from: d */
    public final C14955e m16119d(String str) {
        C12959L c12959l = this.f46576a;
        if (c12959l.get(str) != null) {
            return (C14955e) c12959l.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14954d) {
            return this.f46576a.equals(((C14954d) obj).f46576a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46576a.hashCode();
    }

    public final String toString() {
        return Separators.RETURN + C14954d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f46576a + "}\n";
    }
}
