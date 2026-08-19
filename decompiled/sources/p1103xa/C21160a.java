package p1103xa;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p057C3.C1546Y;
import p140Fa.AbstractC2692l;
import p140Fa.C2691k;
import p140Fa.InterfaceC2683c;
import p353O4.C6118e;
import p523V9.AbstractC7941M4;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21160a extends Drawable {

    /* JADX INFO: renamed from: b */
    public final Paint f67236b;

    /* JADX INFO: renamed from: h */
    public float f67242h;

    /* JADX INFO: renamed from: i */
    public int f67243i;

    /* JADX INFO: renamed from: j */
    public int f67244j;

    /* JADX INFO: renamed from: k */
    public int f67245k;

    /* JADX INFO: renamed from: l */
    public int f67246l;

    /* JADX INFO: renamed from: m */
    public int f67247m;

    /* JADX INFO: renamed from: o */
    public C2691k f67249o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f67250p;

    /* JADX INFO: renamed from: a */
    public final C1546Y f67235a = AbstractC2692l.f8286a;

    /* JADX INFO: renamed from: c */
    public final Path f67237c = new Path();

    /* JADX INFO: renamed from: d */
    public final Rect f67238d = new Rect();

    /* JADX INFO: renamed from: e */
    public final RectF f67239e = new RectF();

    /* JADX INFO: renamed from: f */
    public final RectF f67240f = new RectF();

    /* JADX INFO: renamed from: g */
    public final C6118e f67241g = new C6118e(this);

    /* JADX INFO: renamed from: n */
    public boolean f67248n = true;

    public C21160a(C2691k c2691k) {
        this.f67249o = c2691k;
        Paint paint = new Paint(1);
        this.f67236b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6 = this.f67248n;
        Paint paint = this.f67236b;
        Rect rect = this.f67238d;
        if (z6) {
            copyBounds(rect);
            float fHeight = this.f67242h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC18861b.m20167e(this.f67243i, this.f67247m), AbstractC18861b.m20167e(this.f67244j, this.f67247m), AbstractC18861b.m20167e(AbstractC18861b.m20169g(this.f67244j, 0), this.f67247m), AbstractC18861b.m20167e(AbstractC18861b.m20169g(this.f67246l, 0), this.f67247m), AbstractC18861b.m20167e(this.f67246l, this.f67247m), AbstractC18861b.m20167e(this.f67245k, this.f67247m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f67248n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f67239e;
        rectF.set(rect);
        InterfaceC2683c interfaceC2683c = this.f67249o.f8278e;
        RectF rectF2 = this.f67240f;
        rectF2.set(getBounds());
        float fMin = Math.min(interfaceC2683c.mo3657a(rectF2), rectF.width() / 2.0f);
        C2691k c2691k = this.f67249o;
        rectF2.set(getBounds());
        if (c2691k.m3693d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f67241g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f67242h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C2691k c2691k = this.f67249o;
        RectF rectF = this.f67240f;
        rectF.set(getBounds());
        if (c2691k.m3693d(rectF)) {
            InterfaceC2683c interfaceC2683c = this.f67249o.f8278e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC2683c.mo3657a(rectF));
            return;
        }
        Rect rect = this.f67238d;
        copyBounds(rect);
        RectF rectF2 = this.f67239e;
        rectF2.set(rect);
        C2691k c2691k2 = this.f67249o;
        Path path = this.f67237c;
        this.f67235a.m2362b(c2691k2, 1.0f, rectF2, null, path);
        AbstractC7941M4.m8231c(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C2691k c2691k = this.f67249o;
        RectF rectF = this.f67240f;
        rectF.set(getBounds());
        if (!c2691k.m3693d(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f67242h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f67250p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f67248n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f67250p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f67247m)) != this.f67247m) {
            this.f67248n = true;
            this.f67247m = colorForState;
        }
        if (this.f67248n) {
            invalidateSelf();
        }
        return this.f67248n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f67236b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f67236b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
