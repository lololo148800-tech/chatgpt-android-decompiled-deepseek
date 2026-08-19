package p935p;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p594Y9.AbstractC9740H4;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18257c extends AbstractC9740H4 {

    /* JADX INFO: renamed from: a */
    public final ObjectAnimator f58182a;

    /* JADX INFO: renamed from: b */
    public final boolean f58183b;

    public C18257c(AnimationDrawable animationDrawable, boolean z6, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z6 ? numberOfFrames - 1 : 0;
        int i11 = z6 ? 0 : numberOfFrames - 1;
        C18258d c18258d = new C18258d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c18258d.f58185b = numberOfFrames2;
        int[] iArr = c18258d.f58184a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c18258d.f58184a = new int[numberOfFrames2];
        }
        int[] iArr2 = c18258d.f58184a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z6 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        c18258d.f58186c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c18258d.f58186c);
        objectAnimatorOfInt.setInterpolator(c18258d);
        this.f58183b = z10;
        this.f58182a = objectAnimatorOfInt;
    }

    @Override // p594Y9.AbstractC9740H4
    /* JADX INFO: renamed from: a */
    public final boolean mo10331a() {
        return this.f58183b;
    }

    @Override // p594Y9.AbstractC9740H4
    /* JADX INFO: renamed from: b */
    public final void mo10332b() {
        this.f58182a.reverse();
    }

    @Override // p594Y9.AbstractC9740H4
    /* JADX INFO: renamed from: c */
    public final void mo10333c() {
        this.f58182a.start();
    }

    @Override // p594Y9.AbstractC9740H4
    /* JADX INFO: renamed from: d */
    public final void mo10334d() {
        this.f58182a.cancel();
    }
}
