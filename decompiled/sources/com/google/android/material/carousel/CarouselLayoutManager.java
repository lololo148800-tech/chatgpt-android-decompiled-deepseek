package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p084D4.AbstractC1900Y;
import p084D4.C1889M;
import p084D4.C1901Z;
import p084D4.C1911e0;
import p084D4.C1925l0;
import p283L5.AbstractC4941g;
import p885m4.C17155e;
import pa.AbstractC18315b;
import pa.C18314a;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1900Y {

    /* JADX INFO: renamed from: p */
    public int f36502p;

    public CarouselLayoutManager() {
        new C18314a();
        m2964k0();
    }

    /* JADX INFO: renamed from: z0 */
    public static C17155e m13614z0(float f10, List list, boolean z6) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((AbstractC18315b) list.get(i14)).getClass();
            float fAbs = Math.abs(0.0f - f10);
            if (0.0f <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (0.0f > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (0.0f <= f14) {
                f14 = 0.0f;
                i11 = i14;
            }
            if (0.0f > f12) {
                f12 = 0.0f;
                i13 = i14;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        AbstractC18315b abstractC18315b = (AbstractC18315b) list.get(i10);
        AbstractC18315b abstractC18315b2 = (AbstractC18315b) list.get(i12);
        C17155e c17155e = new C17155e();
        abstractC18315b.getClass();
        abstractC18315b2.getClass();
        AbstractC4941g.m5555N(0.0f <= 0.0f);
        return c17155e;
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m13615A0() {
        return m2923A() == 1;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: R */
    public final void mo2936R(AccessibilityEvent accessibilityEvent) {
        super.mo2936R(accessibilityEvent);
        if (m2985v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC1900Y.m2917F(m2983u(0)));
            accessibilityEvent.setToIndex(AbstractC1900Y.m2917F(m2983u(m2985v() - 1)));
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: a0 */
    public final void mo2945a0(C1911e0 c1911e0, C1925l0 c1925l0) {
        if (c1925l0.m3082b() <= 0) {
            m2955f0(c1911e0);
        } else {
            m13615A0();
            View view = c1911e0.m3036k(0, Long.MAX_VALUE).f5680a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: b0 */
    public final void mo2947b0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return;
        }
        AbstractC1900Y.m2917F(m2983u(0));
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: d */
    public final boolean mo2950d() {
        return true;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: j */
    public final int mo2961j(C1925l0 c1925l0) {
        throw null;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: j0 */
    public final boolean mo2962j0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z10) {
        return false;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: k */
    public final int mo2963k(C1925l0 c1925l0) {
        return this.f36502p;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l */
    public final int mo2965l(C1925l0 c1925l0) {
        return 0 - 0;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l0 */
    public final int mo2966l0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        if (m2985v() == 0 || i10 == 0) {
            return 0;
        }
        int i11 = this.f36502p;
        int i12 = i11 + i10;
        if (i12 < 0 || i12 > 0) {
            i10 = 0 - i11;
        }
        this.f36502p = i11 + i10;
        m13615A0();
        throw null;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: m0 */
    public final void mo2968m0(int i10) {
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: r */
    public final C1901Z mo2977r() {
        return new C1901Z(-2, -2);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: w0 */
    public final void mo2987w0(RecyclerView recyclerView, int i10) {
        C1889M c1889m = new C1889M(this, recyclerView.getContext(), 1);
        c1889m.f5500a = i10;
        m2989x0(c1889m);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: y */
    public final void mo2990y(Rect rect, View view) {
        RecyclerView.m12245M(rect, view);
        rect.centerX();
        throw null;
    }
}
