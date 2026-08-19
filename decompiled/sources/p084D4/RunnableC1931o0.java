package p084D4;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;

/* JADX INFO: renamed from: D4.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1931o0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public int f5667Y;

    /* JADX INFO: renamed from: Z */
    public int f5668Z;

    /* JADX INFO: renamed from: o0 */
    public OverScroller f5669o0;

    /* JADX INFO: renamed from: p0 */
    public Interpolator f5670p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f5671q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f5672r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ RecyclerView f5673s0;

    public RunnableC1931o0(RecyclerView recyclerView) {
        this.f5673s0 = recyclerView;
        InterpolatorC1892P interpolatorC1892P = RecyclerView.f33588S1;
        this.f5670p0 = interpolatorC1892P;
        this.f5671q0 = false;
        this.f5672r0 = false;
        this.f5669o0 = new OverScroller(recyclerView.getContext(), interpolatorC1892P);
    }

    /* JADX INFO: renamed from: a */
    public final void m3083a(int i10, int i11) {
        RecyclerView recyclerView = this.f5673s0;
        recyclerView.setScrollState(2);
        this.f5668Z = 0;
        this.f5667Y = 0;
        Interpolator interpolator = this.f5670p0;
        InterpolatorC1892P interpolatorC1892P = RecyclerView.f33588S1;
        if (interpolator != interpolatorC1892P) {
            this.f5670p0 = interpolatorC1892P;
            this.f5669o0 = new OverScroller(recyclerView.getContext(), interpolatorC1892P);
        }
        this.f5669o0.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m3084b();
    }

    /* JADX INFO: renamed from: b */
    public final void m3084b() {
        if (this.f5671q0) {
            this.f5672r0 = true;
            return;
        }
        RecyclerView recyclerView = this.f5673s0;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m3085c(int i10, int i11, int i12, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f5673s0;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z6 = iAbs > iAbs2;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z6) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f33588S1;
        }
        if (this.f5670p0 != interpolator) {
            this.f5670p0 = interpolator;
            this.f5669o0 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5668Z = 0;
        this.f5667Y = 0;
        recyclerView.setScrollState(2);
        this.f5669o0.startScroll(0, 0, i10, i11, i13);
        m3084b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f5673s0;
        if (recyclerView.f33592B0 == null) {
            recyclerView.removeCallbacks(this);
            this.f5669o0.abortAnimation();
            return;
        }
        this.f5672r0 = false;
        this.f5671q0 = true;
        recyclerView.m12295p();
        OverScroller overScroller = this.f5669o0;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f5667Y;
            int i16 = currY - this.f5668Z;
            this.f5667Y = currX;
            this.f5668Z = currY;
            int iM12253o = RecyclerView.m12253o(i15, recyclerView.f33621V0, recyclerView.f33623X0, recyclerView.getWidth());
            int iM12253o2 = RecyclerView.m12253o(i16, recyclerView.f33622W0, recyclerView.f33624Y0, recyclerView.getHeight());
            int[] iArr = recyclerView.f33597D1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM12300u = recyclerView.m12300u(iM12253o, iM12253o2, 1, iArr, null);
            int[] iArr2 = recyclerView.f33597D1;
            if (zM12300u) {
                iM12253o -= iArr2[0];
                iM12253o2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m12294n(iM12253o, iM12253o2);
            }
            if (recyclerView.f33590A0 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m12282f0(iM12253o, iM12253o2, iArr2);
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                int i19 = iM12253o - i17;
                int i20 = iM12253o2 - i18;
                C1886J c1886j = recyclerView.f33592B0.f5546e;
                if (c1886j != null && !c1886j.f5503d && c1886j.f5504e) {
                    int iM3082b = recyclerView.f33647r1.m3082b();
                    if (iM3082b == 0) {
                        c1886j.m2875h();
                    } else if (c1886j.f5500a >= iM3082b) {
                        c1886j.f5500a = iM3082b - 1;
                        c1886j.m2873f(i17, i18);
                    } else {
                        c1886j.m2873f(i17, i18);
                    }
                }
                i13 = i17;
                i10 = i19;
                i11 = i20;
                i12 = i18;
            } else {
                i10 = iM12253o;
                i11 = iM12253o2;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f33596D0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f33597D1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i21 = i12;
            recyclerView.m12301v(i13, i12, i10, i11, null, 1, iArr3);
            int i22 = i10 - iArr2[0];
            int i23 = i11 - iArr2[1];
            if (i13 != 0 || i21 != 0) {
                recyclerView.m12302w(i13, i21);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i22 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i23 != 0));
            C1886J c1886j2 = recyclerView.f33592B0.f5546e;
            if ((c1886j2 == null || !c1886j2.f5503d) && z6) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i22 < 0) {
                        i14 = -currVelocity;
                    } else {
                        i14 = i22 > 0 ? currVelocity : 0;
                    }
                    if (i23 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i23 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.m12304y();
                        if (recyclerView.f33621V0.isFinished()) {
                            recyclerView.f33621V0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.m12305z();
                        if (recyclerView.f33623X0.isFinished()) {
                            recyclerView.f33623X0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m12254A();
                        if (recyclerView.f33622W0.isFinished()) {
                            recyclerView.f33622W0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m12303x();
                        if (recyclerView.f33624Y0.isFinished()) {
                            recyclerView.f33624Y0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f33586Q1) {
                    C1878B c1878b = recyclerView.f33645q1;
                    int[] iArr4 = c1878b.f5455a;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1878b.f5458d = 0;
                }
            } else {
                m3084b();
                RunnableC1880D runnableC1880D = recyclerView.f33643p1;
                if (runnableC1880D != null) {
                    runnableC1880D.m2864a(recyclerView, i13, i21);
                }
            }
        }
        C1886J c1886j3 = recyclerView.f33592B0.f5546e;
        if (c1886j3 != null && c1886j3.f5503d) {
            c1886j3.m2873f(0, 0);
        }
        this.f5671q0 = false;
        if (!this.f5672r0) {
            recyclerView.setScrollState(0);
            recyclerView.m12292l0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
            recyclerView.postOnAnimation(this);
        }
    }
}
