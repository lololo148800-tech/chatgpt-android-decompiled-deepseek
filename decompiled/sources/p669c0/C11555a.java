package p669c0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11555a extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f34920a;

    /* JADX INFO: renamed from: b */
    public final Paint f34921b;

    /* JADX INFO: renamed from: c */
    public final RectF f34922c;

    /* JADX INFO: renamed from: d */
    public final Rect f34923d;

    /* JADX INFO: renamed from: e */
    public float f34924e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f34927h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f34928i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f34929j;

    /* JADX INFO: renamed from: f */
    public boolean f34925f = false;

    /* JADX INFO: renamed from: g */
    public boolean f34926g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f34930k = PorterDuff.Mode.SRC_IN;

    public C11555a(ColorStateList colorStateList, float f10) {
        this.f34920a = f10;
        Paint paint = new Paint(5);
        this.f34921b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f34927h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f34927h.getDefaultColor()));
        this.f34922c = new RectF();
        this.f34923d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m12932a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m12933b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f34922c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f34923d;
        rect2.set(rect);
        if (this.f34925f) {
            rect2.inset((int) Math.ceil(AbstractC11556b.m12934a(this.f34924e, this.f34920a, this.f34926g)), (int) Math.ceil(AbstractC11556b.m12935b(this.f34924e, this.f34920a, this.f34926g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6;
        Paint paint = this.f34921b;
        if (this.f34928i == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.f34928i);
            z6 = true;
        }
        RectF rectF = this.f34922c;
        float f10 = this.f34920a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f34923d, this.f34920a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f34929j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f34927h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m12933b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f34927h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f34921b;
        boolean z6 = colorForState != paint.getColor();
        if (z6) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f34929j;
        if (colorStateList2 == null || (mode = this.f34930k) == null) {
            return z6;
        }
        this.f34928i = m12932a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f34921b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34921b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f34929j = colorStateList;
        this.f34928i = m12932a(colorStateList, this.f34930k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f34930k = mode;
        this.f34928i = m12932a(this.f34929j, mode);
        invalidateSelf();
    }
}
