package p108E2;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p003A1.RunnableC0153B;
import p030B2.AbstractC0738T;
import p999s.C19369o0;

/* JADX INFO: renamed from: E2.e */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2246e implements View.OnTouchListener {

    /* JADX INFO: renamed from: D0 */
    public static final int f6872D0 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A0 */
    public boolean f6873A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f6874B0;

    /* JADX INFO: renamed from: C0 */
    public final C19369o0 f6875C0;

    /* JADX INFO: renamed from: Y */
    public final C2242a f6876Y;

    /* JADX INFO: renamed from: Z */
    public final AccelerateInterpolator f6877Z;

    /* JADX INFO: renamed from: o0 */
    public final ListView f6878o0;

    /* JADX INFO: renamed from: p0 */
    public RunnableC0153B f6879p0;

    /* JADX INFO: renamed from: q0 */
    public final float[] f6880q0;

    /* JADX INFO: renamed from: r0 */
    public final float[] f6881r0;

    /* JADX INFO: renamed from: s0 */
    public final int f6882s0;

    /* JADX INFO: renamed from: t0 */
    public final int f6883t0;

    /* JADX INFO: renamed from: u0 */
    public final float[] f6884u0;

    /* JADX INFO: renamed from: v0 */
    public final float[] f6885v0;

    /* JADX INFO: renamed from: w0 */
    public final float[] f6886w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f6887x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f6888y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f6889z0;

    public ViewOnTouchListenerC2246e(C19369o0 c19369o0) {
        C2242a c2242a = new C2242a();
        c2242a.f6867e = Long.MIN_VALUE;
        c2242a.f6869g = -1L;
        c2242a.f6868f = 0L;
        this.f6876Y = c2242a;
        this.f6877Z = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6880q0 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6881r0 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6884u0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6885v0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6886w0 = fArr5;
        this.f6878o0 = c19369o0;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f6882s0 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6883t0 = f6872D0;
        c2242a.f6863a = 500;
        c2242a.f6864b = 500;
        this.f6875C0 = c19369o0;
    }

    /* JADX INFO: renamed from: b */
    public static float m3275b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: a */
    public final float m3276a(float f10, float f11, float f12, int i10) {
        float fM3275b;
        float interpolation;
        float fM3275b2 = m3275b(this.f6880q0[i10] * f11, 0.0f, this.f6881r0[i10]);
        float fM3277c = m3277c(f11 - f10, fM3275b2) - m3277c(f10, fM3275b2);
        AccelerateInterpolator accelerateInterpolator = this.f6877Z;
        if (fM3277c >= 0.0f) {
            if (fM3277c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM3277c);
            } else {
                fM3275b = 0.0f;
            }
            if (fM3275b == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f6884u0[i10];
            float f14 = this.f6885v0[i10];
            float f15 = this.f6886w0[i10];
            float f16 = f13 * f12;
            return fM3275b > 0.0f ? m3275b(fM3275b * f16, f14, f15) : -m3275b((-fM3275b) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM3277c);
        fM3275b = m3275b(interpolation, -1.0f, 1.0f);
        if (fM3275b == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f6884u0[i10];
        float f18 = this.f6885v0[i10];
        float f19 = this.f6886w0[i10];
        float f110 = f17 * f12;
        if (fM3275b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m3277c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f6882s0;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f6873A0 && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m3278d() {
        int i10 = 0;
        if (this.f6888y0) {
            this.f6873A0 = false;
            return;
        }
        C2242a c2242a = this.f6876Y;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - c2242a.f6867e);
        int i12 = c2242a.f6864b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c2242a.f6871i = i10;
        c2242a.f6870h = c2242a.m3270a(jCurrentAnimationTimeMillis);
        c2242a.f6869g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3279e() {
        C19369o0 c19369o0;
        int count;
        C2242a c2242a = this.f6876Y;
        float f10 = c2242a.f6866d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(c2242a.f6865c);
        if (iAbs == 0 || (count = (c19369o0 = this.f6875C0).getCount()) == 0) {
            return false;
        }
        int childCount = c19369o0.getChildCount();
        int firstVisiblePosition = c19369o0.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i10 >= count && c19369o0.getChildAt(childCount - 1).getBottom() <= c19369o0.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c19369o0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int i11 = 3;
        if (!this.f6874B0) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m3278d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m3278d();
                }
            }
            return false;
        }
        this.f6889z0 = true;
        this.f6887x0 = false;
        float x4 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f6878o0;
        float fM3276a = m3276a(x4, width, listView.getWidth(), 0);
        float fM3276a2 = m3276a(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1);
        C2242a c2242a = this.f6876Y;
        c2242a.f6865c = fM3276a;
        c2242a.f6866d = fM3276a2;
        if (!this.f6873A0 && m3279e()) {
            if (this.f6879p0 == null) {
                this.f6879p0 = new RunnableC0153B(this, i11);
            }
            this.f6873A0 = true;
            this.f6888y0 = true;
            if (this.f6887x0 || (i10 = this.f6883t0) <= 0) {
                this.f6879p0.run();
            } else {
                RunnableC0153B runnableC0153B = this.f6879p0;
                long j10 = i10;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                listView.postOnAnimationDelayed(runnableC0153B, j10);
            }
            this.f6887x0 = true;
        }
        return false;
    }
}
