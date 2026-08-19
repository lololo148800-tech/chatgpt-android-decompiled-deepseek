package p030B2;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756f0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0770m0 f2133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0794y0 f2134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0794y0 f2135c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2136d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f2137e;

    public C0756f0(C0770m0 c0770m0, C0794y0 c0794y0, C0794y0 c0794y1, int i10, View view) {
        this.f2133a = c0770m0;
        this.f2134b = c0794y0;
        this.f2135c = c0794y1;
        this.f2136d = i10;
        this.f2137e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC0778q0 c0774o0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0770m0 c0770m0 = this.f2133a;
        c0770m0.f2166a.mo1705d(animatedFraction);
        float fMo1703b = c0770m0.f2166a.mo1703b();
        PathInterpolator pathInterpolator = C0762i0.f2153e;
        int i10 = Build.VERSION.SDK_INT;
        C0794y0 c0794y0 = this.f2134b;
        if (i10 >= 30) {
            c0774o0 = new C0776p0(c0794y0);
        } else {
            c0774o0 = i10 >= 29 ? new C0774o0(c0794y0) : new C0772n0(c0794y0);
        }
        int i11 = 1;
        while (i11 <= 256) {
            int i12 = this.f2136d & i11;
            C0790w0 c0790w0 = c0794y0.f2209a;
            if (i12 == 0) {
                c0774o0.mo1741c(i11, c0790w0.mo1754f(i11));
            } else {
                C18862c c18862cMo1754f = c0790w0.mo1754f(i11);
                C18862c c18862cMo1754f2 = this.f2135c.f2209a.mo1754f(i11);
                float f10 = 1.0f - fMo1703b;
                c0774o0.mo1741c(i11, C0794y0.m1811e(c18862cMo1754f, (int) (((double) ((c18862cMo1754f.f60086a - c18862cMo1754f2.f60086a) * f10)) + 0.5d), (int) (((double) ((c18862cMo1754f.f60087b - c18862cMo1754f2.f60087b) * f10)) + 0.5d), (int) (((double) ((c18862cMo1754f.f60088c - c18862cMo1754f2.f60088c) * f10)) + 0.5d), (int) (((double) ((c18862cMo1754f.f60089d - c18862cMo1754f2.f60089d) * f10)) + 0.5d)));
            }
            i11 <<= 1;
            fMo1703b = fMo1703b;
            c0770m0 = c0770m0;
        }
        C0762i0.m1688g(this.f2137e, c0774o0.mo1714b(), Collections.singletonList(c0770m0));
    }
}
