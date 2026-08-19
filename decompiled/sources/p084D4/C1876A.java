package p084D4;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p003A1.RunnableC0153B;
import p030B2.AbstractC0738T;

/* JADX INFO: renamed from: D4.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1876A extends AbstractC1898W {

    /* JADX INFO: renamed from: C */
    public static final int[] f5421C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f5422D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f5423A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0153B f5424B;

    /* JADX INFO: renamed from: a */
    public final int f5425a;

    /* JADX INFO: renamed from: b */
    public final int f5426b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f5427c;

    /* JADX INFO: renamed from: d */
    public final Drawable f5428d;

    /* JADX INFO: renamed from: e */
    public final int f5429e;

    /* JADX INFO: renamed from: f */
    public final int f5430f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f5431g;

    /* JADX INFO: renamed from: h */
    public final Drawable f5432h;

    /* JADX INFO: renamed from: i */
    public final int f5433i;

    /* JADX INFO: renamed from: j */
    public final int f5434j;

    /* JADX INFO: renamed from: k */
    public int f5435k;

    /* JADX INFO: renamed from: l */
    public int f5436l;

    /* JADX INFO: renamed from: m */
    public float f5437m;

    /* JADX INFO: renamed from: n */
    public int f5438n;

    /* JADX INFO: renamed from: o */
    public int f5439o;

    /* JADX INFO: renamed from: p */
    public float f5440p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f5443s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f5450z;

    /* JADX INFO: renamed from: q */
    public int f5441q = 0;

    /* JADX INFO: renamed from: r */
    public int f5442r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f5444t = false;

    /* JADX INFO: renamed from: u */
    public boolean f5445u = false;

    /* JADX INFO: renamed from: v */
    public int f5446v = 0;

    /* JADX INFO: renamed from: w */
    public int f5447w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f5448x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f5449y = new int[2];

    public C1876A(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5450z = valueAnimatorOfFloat;
        this.f5423A = 0;
        RunnableC0153B runnableC0153B = new RunnableC0153B(this, 1);
        this.f5424B = runnableC0153B;
        C1948x c1948x = new C1948x(this);
        this.f5427c = stateListDrawable;
        this.f5428d = drawable;
        this.f5431g = stateListDrawable2;
        this.f5432h = drawable2;
        this.f5429e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f5430f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f5433i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f5434j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f5425a = i11;
        this.f5426b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1950y(this));
        valueAnimatorOfFloat.addUpdateListener(new C1952z(this, 0));
        RecyclerView recyclerView2 = this.f5443s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC1900Y abstractC1900Y = recyclerView2.f33592B0;
            if (abstractC1900Y != null) {
                abstractC1900Y.mo2948c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f33596D0;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m12268R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5443s;
            recyclerView3.f33598E0.remove(this);
            if (recyclerView3.f33600F0 == this) {
                recyclerView3.f33600F0 = null;
            }
            ArrayList arrayList2 = this.f5443s.f33651t1;
            if (arrayList2 != null) {
                arrayList2.remove(c1948x);
            }
            this.f5443s.removeCallbacks(runnableC0153B);
        }
        this.f5443s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m12286i(this);
            this.f5443s.f33598E0.add(this);
            this.f5443s.m12288j(c1948x);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2853f(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @Override // p084D4.AbstractC1898W
    /* JADX INFO: renamed from: c */
    public final void mo2854c(Canvas canvas, RecyclerView recyclerView) {
        int i10 = this.f5441q;
        RecyclerView recyclerView2 = this.f5443s;
        if (i10 != recyclerView2.getWidth() || this.f5442r != recyclerView2.getHeight()) {
            this.f5441q = recyclerView2.getWidth();
            this.f5442r = recyclerView2.getHeight();
            m2857g(0);
            return;
        }
        if (this.f5423A != 0) {
            if (this.f5444t) {
                int i11 = this.f5441q;
                int i12 = this.f5429e;
                int i13 = i11 - i12;
                int i14 = this.f5436l;
                int i15 = this.f5435k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f5427c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f5442r;
                int i18 = this.f5430f;
                Drawable drawable = this.f5428d;
                drawable.setBounds(0, 0, i18, i17);
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f5445u) {
                int i19 = this.f5442r;
                int i20 = this.f5433i;
                int i21 = i19 - i20;
                int i22 = this.f5439o;
                int i23 = this.f5438n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f5431g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f5441q;
                int i26 = this.f5434j;
                Drawable drawable2 = this.f5432h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2855d(float f10, float f11) {
        if (f11 >= this.f5442r - this.f5433i) {
            int i10 = this.f5439o;
            int i11 = this.f5438n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2856e(float f10, float f11) {
        RecyclerView recyclerView = this.f5443s;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean z6 = recyclerView.getLayoutDirection() == 1;
        int i10 = this.f5429e;
        if (z6) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f5441q - i10) {
            return false;
        }
        int i11 = this.f5436l;
        int i12 = this.f5435k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    /* JADX INFO: renamed from: g */
    public final void m2857g(int i10) {
        RunnableC0153B runnableC0153B = this.f5424B;
        StateListDrawable stateListDrawable = this.f5427c;
        if (i10 == 2 && this.f5446v != 2) {
            stateListDrawable.setState(f5421C);
            this.f5443s.removeCallbacks(runnableC0153B);
        }
        if (i10 == 0) {
            this.f5443s.invalidate();
        } else {
            m2858h();
        }
        if (this.f5446v == 2 && i10 != 2) {
            stateListDrawable.setState(f5422D);
            this.f5443s.removeCallbacks(runnableC0153B);
            this.f5443s.postDelayed(runnableC0153B, 1200);
        } else if (i10 == 1) {
            this.f5443s.removeCallbacks(runnableC0153B);
            this.f5443s.postDelayed(runnableC0153B, 1500);
        }
        this.f5446v = i10;
    }

    /* JADX INFO: renamed from: h */
    public final void m2858h() {
        int i10 = this.f5423A;
        ValueAnimator valueAnimator = this.f5450z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f5423A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
