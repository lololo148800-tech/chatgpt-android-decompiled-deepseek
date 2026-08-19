package p038Ba;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import fo.C13711h;
import java.util.ArrayList;
import p442S2.C6988b;
import p442S2.C6990d;
import p442S2.C6991e;
import p442S2.ChoreographerFrameCallbackC6987a;
import p523V9.AbstractC8070d4;

/* JADX INFO: renamed from: Ba.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0861k extends AbstractC0863m {

    /* JADX INFO: renamed from: C0 */
    public static final C0860j f2410C0 = new C0860j();

    /* JADX INFO: renamed from: A0 */
    public float f2411A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f2412B0;

    /* JADX INFO: renamed from: x0 */
    public final C0855e f2413x0;

    /* JADX INFO: renamed from: y0 */
    public final C6991e f2414y0;

    /* JADX INFO: renamed from: z0 */
    public final C6990d f2415z0;

    public C0861k(Context context, C0859i c0859i, C0855e c0855e) {
        super(context, c0859i);
        this.f2412B0 = false;
        this.f2413x0 = c0855e;
        c0855e.f2430b = this;
        C6991e c6991e = new C6991e();
        this.f2414y0 = c6991e;
        c6991e.f22364b = 1.0f;
        c6991e.f22365c = false;
        c6991e.f22363a = Math.sqrt(50.0f);
        c6991e.f22365c = false;
        C6990d c6990d = new C6990d(this);
        this.f2415z0 = c6990d;
        c6990d.f22360k = c6991e;
        if (this.f2426t0 != 1.0f) {
            this.f2426t0 = 1.0f;
            invalidateSelf();
        }
    }

    @Override // p038Ba.AbstractC0863m
    /* JADX INFO: renamed from: d */
    public final boolean mo1922d(boolean z6, boolean z10, boolean z11) {
        boolean zMo1922d = super.mo1922d(z6, z10, z11);
        C0851a c0851a = this.f2421o0;
        ContentResolver contentResolver = this.f2419Y.getContentResolver();
        c0851a.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == 0.0f) {
            this.f2412B0 = true;
        } else {
            this.f2412B0 = false;
            float f11 = 50.0f / f10;
            C6991e c6991e = this.f2414y0;
            c6991e.getClass();
            if (f11 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c6991e.f22363a = Math.sqrt(f11);
            c6991e.f22365c = false;
        }
        return zMo1922d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f2413x0.m1927a(canvas, getBounds(), m1924b());
            C0855e c0855e = this.f2413x0;
            Paint paint = this.f2427u0;
            c0855e.m1919d(canvas, paint);
            this.f2413x0.m1918c(canvas, paint, 0.0f, this.f2411A0, AbstractC8070d4.m8476c(this.f2420Z.f2403c[0], this.f2428v0));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2413x0.m1920e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2413x0.m1920e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f2415z0.m7390b();
        this.f2411A0 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z6 = this.f2412B0;
        C6990d c6990d = this.f2415z0;
        if (z6) {
            c6990d.m7390b();
            this.f2411A0 = i10 / 10000.0f;
            invalidateSelf();
        } else {
            c6990d.f22351b = this.f2411A0 * 10000.0f;
            c6990d.f22352c = true;
            float f10 = i10;
            if (c6990d.f22355f) {
                c6990d.f22361l = f10;
            } else {
                if (c6990d.f22360k == null) {
                    c6990d.f22360k = new C6991e(f10);
                }
                C6991e c6991e = c6990d.f22360k;
                double d10 = f10;
                c6991e.f22371i = d10;
                double d11 = (float) d10;
                if (d11 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d11 < -3.4028235E38f) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(c6990d.f22357h * 0.75f);
                c6991e.f22366d = dAbs;
                c6991e.f22367e = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z10 = c6990d.f22355f;
                if (!z10 && !z10) {
                    c6990d.f22355f = true;
                    if (!c6990d.f22352c) {
                        c6990d.f22354e.getClass();
                        c6990d.f22351b = c6990d.f22353d.f2411A0 * 10000.0f;
                    }
                    float f11 = c6990d.f22351b;
                    if (f11 > Float.MAX_VALUE || f11 < -3.4028235E38f) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal threadLocal = C6988b.f22338f;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new C6988b());
                    }
                    C6988b c6988b = (C6988b) threadLocal.get();
                    ArrayList arrayList = c6988b.f22340b;
                    if (arrayList.size() == 0) {
                        if (c6988b.f22342d == null) {
                            c6988b.f22342d = new C13711h(c6988b.f22341c);
                        }
                        C13711h c13711h = c6988b.f22342d;
                        ((Choreographer) c13711h.f43260o0).postFrameCallback((ChoreographerFrameCallbackC6987a) c13711h.f43261p0);
                    }
                    if (!arrayList.contains(c6990d)) {
                        arrayList.add(c6990d);
                    }
                }
            }
        }
        return true;
    }
}
