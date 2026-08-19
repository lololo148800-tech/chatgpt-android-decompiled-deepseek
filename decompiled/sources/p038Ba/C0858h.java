package p038Ba;

import android.animation.ObjectAnimator;
import p523V9.AbstractC8070d4;
import p897n3.C17474a;

/* JADX INFO: renamed from: Ba.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0858h extends AbstractC0865o {

    /* JADX INFO: renamed from: l */
    public static final int[] f2388l = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: m */
    public static final int[] f2389m = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: n */
    public static final int[] f2390n = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: o */
    public static final C0857g f2391o = new C0857g(Float.class, "animationFraction", 0);

    /* JADX INFO: renamed from: p */
    public static final C0857g f2392p = new C0857g(Float.class, "completeEndFraction", 1);

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f2393d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f2394e;

    /* JADX INFO: renamed from: f */
    public final C17474a f2395f;

    /* JADX INFO: renamed from: g */
    public final C0859i f2396g;

    /* JADX INFO: renamed from: h */
    public int f2397h;

    /* JADX INFO: renamed from: i */
    public float f2398i;

    /* JADX INFO: renamed from: j */
    public float f2399j;

    /* JADX INFO: renamed from: k */
    public C0853c f2400k;

    public C0858h(C0859i c0859i) {
        super(0);
        this.f2397h = 0;
        this.f2400k = null;
        this.f2396g = c0859i;
        this.f2395f = new C17474a(1);
    }

    /* JADX INFO: renamed from: s */
    public final void m1921s() {
        int i10 = 0;
        if (this.f2393d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f2391o, 0.0f, 1.0f);
            this.f2393d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f2393d.setInterpolator(null);
            this.f2393d.setRepeatCount(-1);
            this.f2393d.addListener(new C0856f(this, i10));
        }
        if (this.f2394e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f2392p, 0.0f, 1.0f);
            this.f2394e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f2394e.setInterpolator(this.f2395f);
            this.f2394e.addListener(new C0856f(this, 1));
        }
        this.f2397h = 0;
        ((int[]) this.f2433c)[0] = AbstractC8070d4.m8476c(this.f2396g.f2403c[0], ((C0866p) this.f2431a).f2428v0);
        this.f2399j = 0.0f;
        this.f2393d.start();
    }
}
