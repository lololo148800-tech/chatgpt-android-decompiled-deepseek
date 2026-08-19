package p084D4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: D4.J */
/* JADX INFO: loaded from: classes.dex */
public class C1886J {

    /* JADX INFO: renamed from: a */
    public int f5500a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f5501b;

    /* JADX INFO: renamed from: c */
    public AbstractC1900Y f5502c;

    /* JADX INFO: renamed from: d */
    public boolean f5503d;

    /* JADX INFO: renamed from: e */
    public boolean f5504e;

    /* JADX INFO: renamed from: f */
    public View f5505f;

    /* JADX INFO: renamed from: g */
    public final C1921j0 f5506g;

    /* JADX INFO: renamed from: h */
    public boolean f5507h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f5508i;

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f5509j;

    /* JADX INFO: renamed from: k */
    public PointF f5510k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f5511l;

    /* JADX INFO: renamed from: m */
    public boolean f5512m;

    /* JADX INFO: renamed from: n */
    public float f5513n;

    /* JADX INFO: renamed from: o */
    public int f5514o;

    /* JADX INFO: renamed from: p */
    public int f5515p;

    public C1886J(Context context) {
        C1921j0 c1921j0 = new C1921j0();
        c1921j0.f5624d = -1;
        c1921j0.f5626f = false;
        c1921j0.f5627g = 0;
        c1921j0.f5621a = 0;
        c1921j0.f5622b = 0;
        c1921j0.f5623c = Integer.MIN_VALUE;
        c1921j0.f5625e = null;
        this.f5506g = c1921j0;
        this.f5508i = new LinearInterpolator();
        this.f5509j = new DecelerateInterpolator();
        this.f5512m = false;
        this.f5514o = 0;
        this.f5515p = 0;
        this.f5511l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m2868a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int mo2869b(View view, int i10) {
        AbstractC1900Y abstractC1900Y = this.f5502c;
        if (abstractC1900Y == null || !abstractC1900Y.mo2950d()) {
            return 0;
        }
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        return m2868a((view.getLeft() - ((C1901Z) view.getLayoutParams()).f5558b.left) - ((ViewGroup.MarginLayoutParams) c1901z).leftMargin, view.getRight() + ((C1901Z) view.getLayoutParams()).f5558b.right + ((ViewGroup.MarginLayoutParams) c1901z).rightMargin, abstractC1900Y.m2925C(), abstractC1900Y.f5555n - abstractC1900Y.m2926D(), i10);
    }

    /* JADX INFO: renamed from: c */
    public float mo2870c(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: d */
    public int mo2871d(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f5512m) {
            this.f5513n = mo2870c(this.f5511l);
            this.f5512m = true;
        }
        return (int) Math.ceil(fAbs * this.f5513n);
    }

    /* JADX INFO: renamed from: e */
    public PointF mo2872e(int i10) {
        Object obj = this.f5502c;
        if (obj instanceof InterfaceC1923k0) {
            return ((InterfaceC1923k0) obj).mo3080a(i10);
        }
        AbstractC15256t.m16482t("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1923k0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX INFO: renamed from: f */
    public final void m2873f(int i10, int i11) {
        PointF pointFMo2872e;
        RecyclerView recyclerView = this.f5501b;
        if (this.f5500a == -1 || recyclerView == null) {
            m2875h();
        }
        if (this.f5503d && this.f5505f == null && this.f5502c != null && (pointFMo2872e = mo2872e(this.f5500a)) != null) {
            float f10 = pointFMo2872e.x;
            if (f10 != 0.0f || pointFMo2872e.y != 0.0f) {
                recyclerView.m12282f0((int) Math.signum(f10), (int) Math.signum(pointFMo2872e.y), null);
            }
        }
        this.f5503d = false;
        View view = this.f5505f;
        C1921j0 c1921j0 = this.f5506g;
        if (view != null) {
            this.f5501b.getClass();
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
            if ((abstractC1933p0M12244L != null ? abstractC1933p0M12244L.m3088c() : -1) == this.f5500a) {
                View view2 = this.f5505f;
                C1925l0 c1925l0 = recyclerView.f33647r1;
                mo2874g(view2, c1921j0);
                c1921j0.m3079a(recyclerView);
                m2875h();
            } else {
                AbstractC15256t.m16465c("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5505f = null;
            }
        }
        if (this.f5504e) {
            C1925l0 c1925l1 = recyclerView.f33647r1;
            if (this.f5501b.f33592B0.m2985v() == 0) {
                m2875h();
            } else {
                int i12 = this.f5514o;
                int i13 = i12 - i10;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f5514o = i13;
                int i14 = this.f5515p;
                int i15 = i14 - i11;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f5515p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF pointFMo2872e2 = mo2872e(this.f5500a);
                    if (pointFMo2872e2 != null) {
                        float f11 = pointFMo2872e2.x;
                        if (f11 == 0.0f && pointFMo2872e2.y == 0.0f) {
                            c1921j0.f5624d = this.f5500a;
                            m2875h();
                        } else {
                            float f12 = pointFMo2872e2.y;
                            float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                            float f13 = pointFMo2872e2.x / fSqrt;
                            pointFMo2872e2.x = f13;
                            float f14 = pointFMo2872e2.y / fSqrt;
                            pointFMo2872e2.y = f14;
                            this.f5510k = pointFMo2872e2;
                            this.f5514o = (int) (f13 * 10000.0f);
                            this.f5515p = (int) (f14 * 10000.0f);
                            int iMo2871d = mo2871d(ErrorBoundaryKt.SAMPLING_RATE);
                            int i16 = (int) (this.f5514o * 1.2f);
                            int i17 = (int) (this.f5515p * 1.2f);
                            LinearInterpolator linearInterpolator = this.f5508i;
                            c1921j0.f5621a = i16;
                            c1921j0.f5622b = i17;
                            c1921j0.f5623c = (int) (iMo2871d * 1.2f);
                            c1921j0.f5625e = linearInterpolator;
                            c1921j0.f5626f = true;
                        }
                    } else {
                        c1921j0.f5624d = this.f5500a;
                        m2875h();
                    }
                }
            }
            boolean z6 = c1921j0.f5624d >= 0;
            c1921j0.m3079a(recyclerView);
            if (z6 && this.f5504e) {
                this.f5503d = true;
                recyclerView.f33641o1.m3084b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    /* JADX INFO: renamed from: g */
    public void mo2874g(View view, C1921j0 c1921j0) {
        int i10;
        PointF pointF = this.f5510k;
        int i11 = -1;
        int iM2868a = 0;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 == 0.0f) {
                i10 = 0;
            } else {
                i10 = f10 > 0.0f ? 1 : -1;
            }
        } else {
            i10 = 0;
        }
        int iMo2869b = mo2869b(view, i10);
        PointF pointF2 = this.f5510k;
        if (pointF2 != null) {
            float f11 = pointF2.y;
            if (f11 == 0.0f) {
                i11 = 0;
            } else if (f11 > 0.0f) {
                i11 = 1;
            }
        } else {
            i11 = 0;
        }
        AbstractC1900Y abstractC1900Y = this.f5502c;
        if (abstractC1900Y != null && abstractC1900Y.mo2952e()) {
            C1901Z c1901z = (C1901Z) view.getLayoutParams();
            iM2868a = m2868a((view.getTop() - ((C1901Z) view.getLayoutParams()).f5558b.top) - ((ViewGroup.MarginLayoutParams) c1901z).topMargin, view.getBottom() + ((C1901Z) view.getLayoutParams()).f5558b.bottom + ((ViewGroup.MarginLayoutParams) c1901z).bottomMargin, abstractC1900Y.m2927E(), abstractC1900Y.f5556o - abstractC1900Y.m2924B(), i11);
        }
        int iCeil = (int) Math.ceil(((double) mo2871d((int) Math.sqrt((iM2868a * iM2868a) + (iMo2869b * iMo2869b)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f5509j;
            c1921j0.f5621a = -iMo2869b;
            c1921j0.f5622b = -iM2868a;
            c1921j0.f5623c = iCeil;
            c1921j0.f5625e = decelerateInterpolator;
            c1921j0.f5626f = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2875h() {
        if (this.f5504e) {
            this.f5504e = false;
            this.f5515p = 0;
            this.f5514o = 0;
            this.f5510k = null;
            this.f5501b.f33647r1.f5636a = -1;
            this.f5505f = null;
            this.f5500a = -1;
            this.f5503d = false;
            AbstractC1900Y abstractC1900Y = this.f5502c;
            if (abstractC1900Y.f5546e == this) {
                abstractC1900Y.f5546e = null;
            }
            this.f5502c = null;
            this.f5501b = null;
        }
    }
}
