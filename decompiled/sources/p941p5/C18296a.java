package p941p5;

import android.content.res.ColorStateList;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import p038Ba.C0853c;
import p102Dm.AbstractC2119a;
import p1098x5.EnumC21128g;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9189P2;

/* JADX INFO: renamed from: p5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18296a extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: Y */
    public final EnumC21128g f58398Y;

    /* JADX INFO: renamed from: Z */
    public final int f58399Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f58400o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f58401p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f58402q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public final int f58403r0;

    /* JADX INFO: renamed from: s0 */
    public final int f58404s0;

    /* JADX INFO: renamed from: t0 */
    public long f58405t0;

    /* JADX INFO: renamed from: u0 */
    public int f58406u0;

    /* JADX INFO: renamed from: v0 */
    public int f58407v0;

    /* JADX INFO: renamed from: w0 */
    public Drawable f58408w0;

    /* JADX INFO: renamed from: x0 */
    public final Drawable f58409x0;

    public C18296a(Drawable drawable, Drawable drawable2, EnumC21128g enumC21128g, int i10, boolean z6, boolean z10) {
        this.f58398Y = enumC21128g;
        this.f58399Z = i10;
        this.f58400o0 = z6;
        this.f58401p0 = z10;
        this.f58403r0 = m19837a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f58404s0 = m19837a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f58406u0 = 255;
        this.f58408w0 = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f58409x0 = drawableMutate;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.f58408w0;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m19837a(Integer num, Integer num2) {
        if (this.f58401p0 || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m19838b() {
        this.f58407v0 = 2;
        this.f58408w0 = null;
        ArrayList arrayList = this.f58402q0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0853c) arrayList.get(i10)).m1912a(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19839c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM9749a = AbstractC9189P2.m9749a(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f58398Y);
        double d10 = 2;
        int iM3194h = AbstractC2119a.m3194h((((double) iWidth) - (((double) intrinsicWidth) * dM9749a)) / d10);
        int iM3194h2 = AbstractC2119a.m3194h((((double) iHeight) - (dM9749a * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + iM3194h, rect.top + iM3194h2, rect.right - iM3194h, rect.bottom - iM3194h2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i10 = this.f58407v0;
        if (i10 == 0) {
            Drawable drawable2 = this.f58408w0;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f58406u0);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.f58409x0;
        if (i10 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f58406u0);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f58405t0) / ((double) this.f58399Z);
        double dM8919j = AbstractC8301I.m8919j(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.f58406u0;
        int i12 = (int) (dM8919j * ((double) i11));
        if (this.f58400o0) {
            i11 -= i12;
        }
        boolean z6 = dUptimeMillis >= 1.0d;
        if (!z6 && (drawable = this.f58408w0) != null) {
            drawable.setAlpha(i11);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave3);
                throw th2;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i12);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave4);
                throw th3;
            }
        }
        if (z6) {
            m19838b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f58406u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i10 = this.f58407v0;
        if (i10 == 0) {
            Drawable drawable = this.f58408w0;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f58409x0;
        if (i10 != 1) {
            if (i10 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f58408w0;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f58404s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f58403r0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f58408w0;
        int i10 = this.f58407v0;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f58409x0;
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f58407v0 == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f58408w0;
        if (drawable != null) {
            m19839c(drawable, rect);
        }
        Drawable drawable2 = this.f58409x0;
        if (drawable2 != null) {
            m19839c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f58408w0;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f58409x0;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f58408w0;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f58409x0;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid alpha: ").toString());
        }
        this.f58406u0 = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f58408w0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f58409x0;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f58408w0;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f58409x0;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f58408w0;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f58409x0;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f58408w0;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f58409x0;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f58408w0;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f58409x0;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f58408w0;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f58409x0;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f58407v0 != 0) {
            return;
        }
        this.f58407v0 = 1;
        this.f58405t0 = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f58402q0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0853c) arrayList.get(i10)).m1913b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f58408w0;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f58409x0;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f58407v0 != 2) {
            m19838b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
