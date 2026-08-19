package p038Ba;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
import p806ia.AbstractC14951a;

/* JADX INFO: renamed from: Ba.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863m extends Drawable implements Animatable {

    /* JADX INFO: renamed from: w0 */
    public static final C0857g f2418w0 = new C0857g(Float.class, "growFraction", 2);

    /* JADX INFO: renamed from: Y */
    public final Context f2419Y;

    /* JADX INFO: renamed from: Z */
    public final C0859i f2420Z;

    /* JADX INFO: renamed from: p0 */
    public ObjectAnimator f2422p0;

    /* JADX INFO: renamed from: q0 */
    public ObjectAnimator f2423q0;

    /* JADX INFO: renamed from: r0 */
    public ArrayList f2424r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f2425s0;

    /* JADX INFO: renamed from: t0 */
    public float f2426t0;

    /* JADX INFO: renamed from: v0 */
    public int f2428v0;

    /* JADX INFO: renamed from: u0 */
    public final Paint f2427u0 = new Paint();

    /* JADX INFO: renamed from: o0 */
    public C0851a f2421o0 = new C0851a();

    public AbstractC0863m(Context context, C0859i c0859i) {
        this.f2419Y = context;
        this.f2420Z = c0859i;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public final float m1924b() {
        C0859i c0859i = this.f2420Z;
        if (c0859i.f2405e == 0 && c0859i.f2406f == 0) {
            return 1.0f;
        }
        return this.f2426t0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1925c(boolean z6, boolean z10, boolean z11) {
        C0851a c0851a = this.f2421o0;
        ContentResolver contentResolver = this.f2419Y.getContentResolver();
        c0851a.getClass();
        return mo1922d(z6, z10, z11 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1922d(boolean z6, boolean z10, boolean z11) {
        int i10 = 1;
        int i11 = 0;
        ObjectAnimator objectAnimator = this.f2422p0;
        C0857g c0857g = f2418w0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c0857g, 0.0f, 1.0f);
            this.f2422p0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f2422p0.setInterpolator(AbstractC14951a.f46572b);
            ObjectAnimator objectAnimator2 = this.f2422p0;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f2422p0 = objectAnimator2;
            objectAnimator2.addListener(new C0862l(this, i11));
        }
        if (this.f2423q0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c0857g, 1.0f, 0.0f);
            this.f2423q0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f2423q0.setInterpolator(AbstractC14951a.f46572b);
            ObjectAnimator objectAnimator3 = this.f2423q0;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f2423q0 = objectAnimator3;
            objectAnimator3.addListener(new C0862l(this, i10));
        }
        if (!isVisible() && !z6) {
            return false;
        }
        ObjectAnimator objectAnimator4 = z6 ? this.f2422p0 : this.f2423q0;
        ObjectAnimator objectAnimator5 = z6 ? this.f2423q0 : this.f2422p0;
        if (!z11) {
            if (objectAnimator5.isRunning()) {
                boolean z12 = this.f2425s0;
                this.f2425s0 = true;
                new ValueAnimator[]{objectAnimator5}[0].cancel();
                this.f2425s0 = z12;
            }
            if (objectAnimator4.isRunning()) {
                objectAnimator4.end();
            } else {
                boolean z13 = this.f2425s0;
                this.f2425s0 = true;
                new ValueAnimator[]{objectAnimator4}[0].end();
                this.f2425s0 = z13;
            }
            return super.setVisible(z6, false);
        }
        if (z11 && objectAnimator4.isRunning()) {
            return false;
        }
        boolean z14 = !z6 || super.setVisible(z6, false);
        C0859i c0859i = this.f2420Z;
        if (!z6 ? c0859i.f2406f != 0 : c0859i.f2405e != 0) {
            boolean z15 = this.f2425s0;
            this.f2425s0 = true;
            new ValueAnimator[]{objectAnimator4}[0].end();
            this.f2425s0 = z15;
            return z14;
        }
        if (z10 || !objectAnimator4.isPaused()) {
            objectAnimator4.start();
        } else {
            objectAnimator4.resume();
        }
        return z14;
    }

    /* JADX INFO: renamed from: e */
    public final void m1926e(C0853c c0853c) {
        ArrayList arrayList = this.f2424r0;
        if (arrayList == null || !arrayList.contains(c0853c)) {
            return;
        }
        this.f2424r0.remove(c0853c);
        if (this.f2424r0.isEmpty()) {
            this.f2424r0 = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2428v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f2422p0;
        return (objectAnimator2 != null && objectAnimator2.isRunning()) || ((objectAnimator = this.f2423q0) != null && objectAnimator.isRunning());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f2428v0 = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2427u0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        return m1925c(z6, z10, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        mo1922d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        mo1922d(false, true, false);
    }
}
