package p330N4;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p544W9.AbstractC8615c4;

/* JADX INFO: renamed from: N4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C5670u extends AbstractC5648N {

    /* JADX INFO: renamed from: M0 */
    public static final DecelerateInterpolator f18391M0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: N0 */
    public static final AccelerateInterpolator f18392N0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: O0 */
    public static final C5667r f18393O0 = new C5667r(0);

    /* JADX INFO: renamed from: P0 */
    public static final C5667r f18394P0 = new C5667r(1);

    /* JADX INFO: renamed from: Q0 */
    public static final C5668s f18395Q0 = new C5668s(0);

    /* JADX INFO: renamed from: R0 */
    public static final C5667r f18396R0 = new C5667r(2);

    /* JADX INFO: renamed from: S0 */
    public static final C5667r f18397S0 = new C5667r(3);

    /* JADX INFO: renamed from: T0 */
    public static final C5668s f18398T0 = new C5668s(1);

    /* JADX INFO: renamed from: L0 */
    public final InterfaceC5669t f18399L0;

    public C5670u(int i10) {
        C5668s c5668s = f18398T0;
        this.f18399L0 = c5668s;
        if (i10 == 3) {
            this.f18399L0 = f18393O0;
        } else if (i10 == 5) {
            this.f18399L0 = f18396R0;
        } else if (i10 == 48) {
            this.f18399L0 = f18395Q0;
        } else if (i10 == 80) {
            this.f18399L0 = c5668s;
        } else if (i10 == 8388611) {
            this.f18399L0 = f18394P0;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f18399L0 = f18397S0;
        }
        C5666q c5666q = new C5666q();
        c5666q.f18388a = i10;
        this.f18412E0 = c5666q;
    }

    @Override // p330N4.AbstractC5648N
    /* JADX INFO: renamed from: K */
    public final ObjectAnimator mo6081K(ViewGroup viewGroup, View view, C5640F c5640f, C5640F c5640f2) {
        if (c5640f2 == null) {
            return null;
        }
        int[] iArr = (int[]) c5640f2.f18320a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return AbstractC8615c4.m9266a(view, c5640f2, iArr[0], iArr[1], this.f18399L0.mo6093b(viewGroup, view), this.f18399L0.mo6092a(viewGroup, view), translationX, translationY, f18391M0, this);
    }

    @Override // p330N4.AbstractC5648N
    /* JADX INFO: renamed from: L */
    public final ObjectAnimator mo6082L(ViewGroup viewGroup, View view, C5640F c5640f) {
        if (c5640f == null) {
            return null;
        }
        int[] iArr = (int[]) c5640f.f18320a.get("android:slide:screenPosition");
        return AbstractC8615c4.m9266a(view, c5640f, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f18399L0.mo6093b(viewGroup, view), this.f18399L0.mo6092a(viewGroup, view), f18392N0, this);
    }

    @Override // p330N4.AbstractC5648N, p330N4.AbstractC5673x
    /* JADX INFO: renamed from: c */
    public final void mo6056c(C5640F c5640f) {
        AbstractC5648N.m6079I(c5640f);
        int[] iArr = new int[2];
        c5640f.f18321b.getLocationOnScreen(iArr);
        c5640f.f18320a.put("android:slide:screenPosition", iArr);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: f */
    public final void mo6058f(C5640F c5640f) {
        AbstractC5648N.m6079I(c5640f);
        int[] iArr = new int[2];
        c5640f.f18321b.getLocationOnScreen(iArr);
        c5640f.f18320a.put("android:slide:screenPosition", iArr);
    }
}
