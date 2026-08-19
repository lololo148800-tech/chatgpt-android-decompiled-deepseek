package p140Fa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.javax.sip.C10808o;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import io.sentry.android.core.AbstractC15256t;
import java.util.BitSet;
import p057C3.C1546Y;
import p116Ea.C2362a;
import p523V9.AbstractC7941M4;
import p523V9.AbstractC8070d4;
import p817j$.util.Objects;
import p979r2.AbstractC18861b;
import va.C20509a;

/* JADX INFO: renamed from: Fa.g */
/* JADX INFO: loaded from: classes.dex */
public class C2687g extends Drawable implements InterfaceC2701u {

    /* JADX INFO: renamed from: I0 */
    public static final Paint f8237I0;

    /* JADX INFO: renamed from: A0 */
    public final Paint f8238A0;

    /* JADX INFO: renamed from: B0 */
    public final C2362a f8239B0;

    /* JADX INFO: renamed from: C0 */
    public final C10808o f8240C0;

    /* JADX INFO: renamed from: D0 */
    public final C1546Y f8241D0;

    /* JADX INFO: renamed from: E0 */
    public PorterDuffColorFilter f8242E0;

    /* JADX INFO: renamed from: F0 */
    public PorterDuffColorFilter f8243F0;

    /* JADX INFO: renamed from: G0 */
    public final RectF f8244G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f8245H0;

    /* JADX INFO: renamed from: Y */
    public C2686f f8246Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC2699s[] f8247Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC2699s[] f8248o0;

    /* JADX INFO: renamed from: p0 */
    public final BitSet f8249p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f8250q0;

    /* JADX INFO: renamed from: r0 */
    public final Matrix f8251r0;

    /* JADX INFO: renamed from: s0 */
    public final Path f8252s0;

    /* JADX INFO: renamed from: t0 */
    public final Path f8253t0;

    /* JADX INFO: renamed from: u0 */
    public final RectF f8254u0;

    /* JADX INFO: renamed from: v0 */
    public final RectF f8255v0;

    /* JADX INFO: renamed from: w0 */
    public final Region f8256w0;

    /* JADX INFO: renamed from: x0 */
    public final Region f8257x0;

    /* JADX INFO: renamed from: y0 */
    public C2691k f8258y0;

    /* JADX INFO: renamed from: z0 */
    public final Paint f8259z0;

    static {
        Paint paint = new Paint(1);
        f8237I0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2687g() {
        this(new C2691k());
    }

    /* JADX INFO: renamed from: a */
    public final void m3671a(RectF rectF, Path path) {
        C2686f c2686f = this.f8246Y;
        this.f8241D0.m2362b(c2686f.f8220a, c2686f.f8228i, rectF, this.f8240C0, path);
        if (this.f8246Y.f8227h != 1.0f) {
            Matrix matrix = this.f8251r0;
            matrix.reset();
            float f10 = this.f8246Y.f8227h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f8244G0, true);
    }

    /* JADX INFO: renamed from: b */
    public final int m3672b(int i10) {
        int i11;
        C2686f c2686f = this.f8246Y;
        float f10 = c2686f.f8232m + 0.0f + c2686f.f8231l;
        C20509a c20509a = c2686f.f8221b;
        if (c20509a == null || !c20509a.f65115a || AbstractC18861b.m20169g(i10, 255) != c20509a.f65118d) {
            return i10;
        }
        float f11 = c20509a.f65119e;
        float fMin = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iM8480g = AbstractC8070d4.m8480g(fMin, AbstractC18861b.m20169g(i10, 255), c20509a.f65116b);
        if (fMin > 0.0f && (i11 = c20509a.f65117c) != 0) {
            iM8480g = AbstractC18861b.m20167e(AbstractC18861b.m20169g(i11, C20509a.f65114f), iM8480g);
        }
        return AbstractC18861b.m20169g(iM8480g, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public final void m3673c(Canvas canvas) {
        if (this.f8249p0.cardinality() > 0) {
            AbstractC15256t.m16482t("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f8246Y.f8234o;
        Path path = this.f8252s0;
        C2362a c2362a = this.f8239B0;
        if (i10 != 0) {
            canvas.drawPath(path, c2362a.f7324a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            AbstractC2699s abstractC2699s = this.f8247Z[i11];
            int i12 = this.f8246Y.f8233n;
            Matrix matrix = AbstractC2699s.f8303b;
            abstractC2699s.mo3695a(matrix, c2362a, i12, canvas);
            this.f8248o0[i11].mo3695a(matrix, c2362a, this.f8246Y.f8233n, canvas);
        }
        if (this.f8245H0) {
            C2686f c2686f = this.f8246Y;
            int iSin = (int) (Math.sin(Math.toRadians(c2686f.f8235p)) * ((double) c2686f.f8234o));
            C2686f c2686f2 = this.f8246Y;
            int iCos = (int) (Math.cos(Math.toRadians(c2686f2.f8235p)) * ((double) c2686f2.f8234o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f8237I0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3674d(Canvas canvas, Paint paint, Path path, C2691k c2691k, RectF rectF) {
        if (!c2691k.m3693d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo3657a = c2691k.f8279f.mo3657a(rectF) * this.f8246Y.f8228i;
            canvas.drawRoundRect(rectF, fMo3657a, fMo3657a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f8259z0;
        paint.setColorFilter(this.f8242E0);
        int alpha = paint.getAlpha();
        int i10 = this.f8246Y.f8230k;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f8238A0;
        paint2.setColorFilter(this.f8243F0);
        paint2.setStrokeWidth(this.f8246Y.f8229j);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f8246Y.f8230k;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z6 = this.f8250q0;
        Path path = this.f8252s0;
        if (z6) {
            float f10 = -(m3678h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C2691k c2691k = this.f8246Y.f8220a;
            C2690j c2690jM3694e = c2691k.m3694e();
            InterfaceC2683c c2682b = c2691k.f8278e;
            if (!(c2682b instanceof C2688h)) {
                c2682b = new C2682b(f10, c2682b);
            }
            c2690jM3694e.f8265e = c2682b;
            InterfaceC2683c c2682b2 = c2691k.f8279f;
            if (!(c2682b2 instanceof C2688h)) {
                c2682b2 = new C2682b(f10, c2682b2);
            }
            c2690jM3694e.f8266f = c2682b2;
            InterfaceC2683c c2682b3 = c2691k.f8281h;
            if (!(c2682b3 instanceof C2688h)) {
                c2682b3 = new C2682b(f10, c2682b3);
            }
            c2690jM3694e.f8268h = c2682b3;
            InterfaceC2683c c2682b4 = c2691k.f8280g;
            if (!(c2682b4 instanceof C2688h)) {
                c2682b4 = new C2682b(f10, c2682b4);
            }
            c2690jM3694e.f8267g = c2682b4;
            C2691k c2691kM3689a = c2690jM3694e.m3689a();
            this.f8258y0 = c2691kM3689a;
            float f11 = this.f8246Y.f8228i;
            RectF rectF = this.f8255v0;
            rectF.set(m3676f());
            float strokeWidth = m3678h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f8241D0.m2362b(c2691kM3689a, f11, rectF, null, this.f8253t0);
            m3671a(m3676f(), path);
            this.f8250q0 = false;
        }
        C2686f c2686f = this.f8246Y;
        c2686f.getClass();
        if (c2686f.f8233n > 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (!m3680j() && !path.isConvex() && i12 < 29) {
                canvas.save();
                C2686f c2686f2 = this.f8246Y;
                int iSin = (int) (Math.sin(Math.toRadians(c2686f2.f8235p)) * ((double) c2686f2.f8234o));
                C2686f c2686f3 = this.f8246Y;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(c2686f3.f8235p)) * ((double) c2686f3.f8234o)));
                if (this.f8245H0) {
                    RectF rectF2 = this.f8244G0;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f8246Y.f8233n * 2) + ((int) rectF2.width()) + iWidth, (this.f8246Y.f8233n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f8246Y.f8233n) - iWidth;
                    float f13 = (getBounds().top - this.f8246Y.f8233n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    m3673c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m3673c(canvas);
                    canvas.restore();
                }
            }
        }
        C2686f c2686f4 = this.f8246Y;
        Paint.Style style = c2686f4.f8236q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m3674d(canvas, paint, path, c2686f4.f8220a, m3676f());
        }
        if (m3678h()) {
            mo3675e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public void mo3675e(Canvas canvas) {
        Paint paint = this.f8238A0;
        Path path = this.f8253t0;
        C2691k c2691k = this.f8258y0;
        RectF rectF = this.f8255v0;
        rectF.set(m3676f());
        float strokeWidth = m3678h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m3674d(canvas, paint, path, c2691k, rectF);
    }

    /* JADX INFO: renamed from: f */
    public final RectF m3676f() {
        RectF rectF = this.f8254u0;
        rectF.set(getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public final float m3677g() {
        return this.f8246Y.f8220a.f8278e.mo3657a(m3676f());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8246Y.f8230k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f8246Y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f8246Y.getClass();
        if (m3680j()) {
            outline.setRoundRect(getBounds(), m3677g() * this.f8246Y.f8228i);
        } else {
            RectF rectFM3676f = m3676f();
            Path path = this.f8252s0;
            m3671a(rectFM3676f, path);
            AbstractC7941M4.m8231c(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f8246Y.f8226g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f8256w0;
        region.set(bounds);
        RectF rectFM3676f = m3676f();
        Path path = this.f8252s0;
        m3671a(rectFM3676f, path);
        Region region2 = this.f8257x0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3678h() {
        Paint.Style style = this.f8246Y.f8236q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f8238A0.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m3679i(Context context) {
        this.f8246Y.f8221b = new C20509a(context);
        m3687q();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f8250q0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f8246Y.f8224e) == null || !colorStateList.isStateful())) {
            this.f8246Y.getClass();
            ColorStateList colorStateList3 = this.f8246Y.f8223d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f8246Y.f8222c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3680j() {
        return this.f8246Y.f8220a.m3693d(m3676f());
    }

    /* JADX INFO: renamed from: k */
    public final void m3681k(float f10) {
        C2686f c2686f = this.f8246Y;
        if (c2686f.f8232m != f10) {
            c2686f.f8232m = f10;
            m3687q();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3682l(ColorStateList colorStateList) {
        C2686f c2686f = this.f8246Y;
        if (c2686f.f8222c != colorStateList) {
            c2686f.f8222c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3683m(float f10) {
        C2686f c2686f = this.f8246Y;
        if (c2686f.f8228i != f10) {
            c2686f.f8228i = f10;
            this.f8250q0 = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f8246Y = new C2686f(this.f8246Y);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m3684n() {
        this.f8239B0.m3450a(-12303292);
        this.f8246Y.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3685o(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f8246Y.f8222c == null || color2 == (colorForState2 = this.f8246Y.f8222c.getColorForState(iArr, (color2 = (paint2 = this.f8259z0).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f8246Y.f8223d == null || color == (colorForState = this.f8246Y.f8223d.getColorForState(iArr, (color = (paint = this.f8238A0).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f8250q0 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z6 = m3685o(iArr) || m3686p();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3686p() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8242E0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f8243F0;
        C2686f c2686f = this.f8246Y;
        ColorStateList colorStateList = c2686f.f8224e;
        PorterDuff.Mode mode = c2686f.f8225f;
        Paint paint = this.f8259z0;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM3672b = m3672b(color);
            porterDuffColorFilter = iM3672b != color ? new PorterDuffColorFilter(iM3672b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m3672b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f8242E0 = porterDuffColorFilter;
        this.f8246Y.getClass();
        this.f8243F0 = null;
        this.f8246Y.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f8242E0) && Objects.equals(porterDuffColorFilter3, this.f8243F0)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final void m3687q() {
        C2686f c2686f = this.f8246Y;
        float f10 = c2686f.f8232m + 0.0f;
        c2686f.f8233n = (int) Math.ceil(0.75f * f10);
        this.f8246Y.f8234o = (int) Math.ceil(f10 * 0.25f);
        m3686p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        C2686f c2686f = this.f8246Y;
        if (c2686f.f8230k != i10) {
            c2686f.f8230k = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8246Y.getClass();
        super.invalidateSelf();
    }

    @Override // p140Fa.InterfaceC2701u
    public final void setShapeAppearanceModel(C2691k c2691k) {
        this.f8246Y.f8220a = c2691k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8246Y.f8224e = colorStateList;
        m3686p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C2686f c2686f = this.f8246Y;
        if (c2686f.f8225f != mode) {
            c2686f.f8225f = mode;
            m3686p();
            super.invalidateSelf();
        }
    }

    public C2687g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C2691k.m3691b(context, attributeSet, i10, i11).m3689a());
    }

    public C2687g(C2691k c2691k) {
        this(new C2686f(c2691k));
    }

    public C2687g(C2686f c2686f) {
        C1546Y c1546y;
        this.f8247Z = new AbstractC2699s[4];
        this.f8248o0 = new AbstractC2699s[4];
        this.f8249p0 = new BitSet(8);
        this.f8251r0 = new Matrix();
        this.f8252s0 = new Path();
        this.f8253t0 = new Path();
        this.f8254u0 = new RectF();
        this.f8255v0 = new RectF();
        this.f8256w0 = new Region();
        this.f8257x0 = new Region();
        Paint paint = new Paint(1);
        this.f8259z0 = paint;
        Paint paint2 = new Paint(1);
        this.f8238A0 = paint2;
        this.f8239B0 = new C2362a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1546y = AbstractC2692l.f8286a;
        } else {
            c1546y = new C1546Y();
        }
        this.f8241D0 = c1546y;
        this.f8244G0 = new RectF();
        this.f8245H0 = true;
        this.f8246Y = c2686f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m3686p();
        m3685o(getState());
        this.f8240C0 = new C10808o(this, 8);
    }
}
