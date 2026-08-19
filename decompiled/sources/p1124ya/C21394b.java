package p1124ya;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.openai.chatgpt.R;
import p057C3.C1546Y;
import p140Fa.AbstractC2692l;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import p913o2.AbstractC17803d;
import p999s.C19382v;

/* JADX INFO: renamed from: ya.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21394b extends C19382v implements InterfaceC2701u {

    /* JADX INFO: renamed from: A0 */
    public float f67904A0;

    /* JADX INFO: renamed from: B0 */
    public final Path f67905B0;

    /* JADX INFO: renamed from: C0 */
    public final int f67906C0;

    /* JADX INFO: renamed from: D0 */
    public final int f67907D0;

    /* JADX INFO: renamed from: E0 */
    public final int f67908E0;

    /* JADX INFO: renamed from: F0 */
    public final int f67909F0;

    /* JADX INFO: renamed from: G0 */
    public final int f67910G0;

    /* JADX INFO: renamed from: H0 */
    public final int f67911H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f67912I0;

    /* JADX INFO: renamed from: r0 */
    public final C1546Y f67913r0;

    /* JADX INFO: renamed from: s0 */
    public final RectF f67914s0;

    /* JADX INFO: renamed from: t0 */
    public final RectF f67915t0;

    /* JADX INFO: renamed from: u0 */
    public final Paint f67916u0;

    /* JADX INFO: renamed from: v0 */
    public final Paint f67917v0;

    /* JADX INFO: renamed from: w0 */
    public final Path f67918w0;

    /* JADX INFO: renamed from: x0 */
    public ColorStateList f67919x0;

    /* JADX INFO: renamed from: y0 */
    public C2687g f67920y0;

    /* JADX INFO: renamed from: z0 */
    public C2691k f67921z0;

    public C21394b(Context context) {
        super(AbstractC4967a.m5610a(context, null, 0, R.style.Widget_MaterialComponents_ShapeableImageView), null, 0);
        this.f67913r0 = AbstractC2692l.f8286a;
        this.f67918w0 = new Path();
        this.f67912I0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f67917v0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f67914s0 = new RectF();
        this.f67915t0 = new RectF();
        this.f67905B0 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, AbstractC14431a.f45361B, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f67919x0 = AbstractC7979R3.m8279c(context2, typedArrayObtainStyledAttributes, 9);
        this.f67904A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f67906C0 = dimensionPixelSize;
        this.f67907D0 = dimensionPixelSize;
        this.f67908E0 = dimensionPixelSize;
        this.f67909F0 = dimensionPixelSize;
        this.f67906C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f67907D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f67908E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f67909F0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f67910G0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f67911H0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f67916u0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f67921z0 = C2691k.m3691b(context2, null, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m3689a();
        setOutlineProvider(new C21393a(this));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21775c() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m21776d(int i10, int i11) {
        RectF rectF = this.f67914s0;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        C2691k c2691k = this.f67921z0;
        Path path = this.f67918w0;
        this.f67913r0.m2362b(c2691k, 1.0f, rectF, null, path);
        Path path2 = this.f67905B0;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f67915t0;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f67909F0;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f67911H0;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return m21775c() ? this.f67906C0 : this.f67908E0;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (this.f67910G0 != Integer.MIN_VALUE || this.f67911H0 != Integer.MIN_VALUE) {
            if (m21775c() && (i11 = this.f67911H0) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!m21775c() && (i10 = this.f67910G0) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f67906C0;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (this.f67910G0 != Integer.MIN_VALUE || this.f67911H0 != Integer.MIN_VALUE) {
            if (m21775c() && (i11 = this.f67910G0) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!m21775c() && (i10 = this.f67911H0) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f67908E0;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f67910G0;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return m21775c() ? this.f67908E0 : this.f67906C0;
    }

    public int getContentPaddingTop() {
        return this.f67907D0;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C2691k getShapeAppearanceModel() {
        return this.f67921z0;
    }

    public ColorStateList getStrokeColor() {
        return this.f67919x0;
    }

    public float getStrokeWidth() {
        return this.f67904A0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f67905B0, this.f67917v0);
        if (this.f67919x0 == null) {
            return;
        }
        Paint paint = this.f67916u0;
        paint.setStrokeWidth(this.f67904A0);
        int colorForState = this.f67919x0.getColorForState(getDrawableState(), this.f67919x0.getDefaultColor());
        if (this.f67904A0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f67918w0, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f67912I0 && isLayoutDirectionResolved()) {
            this.f67912I0 = true;
            if (!isPaddingRelative() && this.f67910G0 == Integer.MIN_VALUE && this.f67911H0 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m21776d(i10, i11);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // p140Fa.InterfaceC2701u
    public void setShapeAppearanceModel(C2691k c2691k) {
        this.f67921z0 = c2691k;
        C2687g c2687g = this.f67920y0;
        if (c2687g != null) {
            c2687g.setShapeAppearanceModel(c2691k);
        }
        m21776d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f67919x0 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(AbstractC17803d.m19556c(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f67904A0 != f10) {
            this.f67904A0 = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
