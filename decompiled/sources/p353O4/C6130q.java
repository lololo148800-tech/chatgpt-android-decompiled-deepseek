package p353O4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p138F8.vJO.anhfj;
import p499U9.AbstractC7589s;
import p523V9.AbstractC8234y0;
import p692d0.C12966e;
import p926of.yRae.sVDIzpC;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: O4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6130q extends AbstractC6121h {

    /* JADX INFO: renamed from: v0 */
    public static final PorterDuff.Mode f19978v0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: Z */
    public C6128o f19979Z;

    /* JADX INFO: renamed from: o0 */
    public PorterDuffColorFilter f19980o0;

    /* JADX INFO: renamed from: p0 */
    public ColorFilter f19981p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f19982q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f19983r0;

    /* JADX INFO: renamed from: s0 */
    public final float[] f19984s0;

    /* JADX INFO: renamed from: t0 */
    public final Matrix f19985t0;

    /* JADX INFO: renamed from: u0 */
    public final Rect f19986u0;

    public C6130q() {
        this.f19983r0 = true;
        this.f19984s0 = new float[9];
        this.f19985t0 = new Matrix();
        this.f19986u0 = new Rect();
        C6128o c6128o = new C6128o();
        c6128o.f19967c = null;
        c6128o.f19968d = f19978v0;
        c6128o.f19966b = new C6127n();
        this.f19979Z = c6128o;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m6674a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f19923Y;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f19986u0;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f19981p0;
        if (colorFilter == null) {
            colorFilter = this.f19980o0;
        }
        Matrix matrix = this.f19985t0;
        canvas.getMatrix(matrix);
        float[] fArr = this.f19984s0;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C6128o c6128o = this.f19979Z;
        Bitmap bitmap = c6128o.f19970f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c6128o.f19970f.getHeight()) {
            c6128o.f19970f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c6128o.f19975k = true;
        }
        if (this.f19983r0) {
            C6128o c6128o2 = this.f19979Z;
            if (c6128o2.f19975k || c6128o2.f19971g != c6128o2.f19967c || c6128o2.f19972h != c6128o2.f19968d || c6128o2.f19974j != c6128o2.f19969e || c6128o2.f19973i != c6128o2.f19966b.getRootAlpha()) {
                C6128o c6128o3 = this.f19979Z;
                c6128o3.f19970f.eraseColor(0);
                Canvas canvas2 = new Canvas(c6128o3.f19970f);
                C6127n c6127n = c6128o3.f19966b;
                c6127n.m6673a(c6127n.f19956g, C6127n.f19949p, canvas2, iMin, iMin2);
                C6128o c6128o4 = this.f19979Z;
                c6128o4.f19971g = c6128o4.f19967c;
                c6128o4.f19972h = c6128o4.f19968d;
                c6128o4.f19973i = c6128o4.f19966b.getRootAlpha();
                c6128o4.f19974j = c6128o4.f19969e;
                c6128o4.f19975k = false;
            }
        } else {
            C6128o c6128o5 = this.f19979Z;
            c6128o5.f19970f.eraseColor(0);
            Canvas canvas3 = new Canvas(c6128o5.f19970f);
            C6127n c6127n2 = c6128o5.f19966b;
            c6127n2.m6673a(c6127n2.f19956g, C6127n.f19949p, canvas3, iMin, iMin2);
        }
        C6128o c6128o6 = this.f19979Z;
        if (c6128o6.f19966b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c6128o6.f19976l == null) {
                Paint paint2 = new Paint();
                c6128o6.f19976l = paint2;
                paint2.setFilterBitmap(true);
            }
            c6128o6.f19976l.setAlpha(c6128o6.f19966b.getRootAlpha());
            c6128o6.f19976l.setColorFilter(colorFilter);
            paint = c6128o6.f19976l;
        }
        canvas.drawBitmap(c6128o6.f19970f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getAlpha() : this.f19979Z.f19966b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f19979Z.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getColorFilter() : this.f19981p0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f19923Y != null && Build.VERSION.SDK_INT >= 24) {
            return new C6129p(this.f19923Y.getConstantState());
        }
        this.f19979Z.f19965a = getChangingConfigurations();
        return this.f19979Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f19979Z.f19966b.f19958i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f19979Z.f19966b.f19957h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.isAutoMirrored() : this.f19979Z.f19969e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C6128o c6128o = this.f19979Z;
            if (c6128o != null) {
                C6127n c6127n = c6128o.f19966b;
                if (c6127n.f19963n == null) {
                    c6127n.f19963n = Boolean.valueOf(c6127n.f19956g.mo6670a());
                }
                if (c6127n.f19963n.booleanValue() || ((colorStateList = this.f19979Z.f19967c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f19982q0 && super.mutate() == this) {
            C6128o c6128o = this.f19979Z;
            C6128o c6128o2 = new C6128o();
            c6128o2.f19967c = null;
            c6128o2.f19968d = f19978v0;
            if (c6128o != null) {
                c6128o2.f19965a = c6128o.f19965a;
                C6127n c6127n = new C6127n(c6128o.f19966b);
                c6128o2.f19966b = c6127n;
                if (c6128o.f19966b.f19954e != null) {
                    c6127n.f19954e = new Paint(c6128o.f19966b.f19954e);
                }
                if (c6128o.f19966b.f19953d != null) {
                    c6128o2.f19966b.f19953d = new Paint(c6128o.f19966b.f19953d);
                }
                c6128o2.f19967c = c6128o.f19967c;
                c6128o2.f19968d = c6128o.f19968d;
                c6128o2.f19969e = c6128o.f19969e;
            }
            this.f19979Z = c6128o2;
            this.f19982q0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C6128o c6128o = this.f19979Z;
        ColorStateList colorStateList = c6128o.f19967c;
        if (colorStateList == null || (mode = c6128o.f19968d) == null) {
            z6 = false;
        } else {
            this.f19980o0 = m6674a(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        C6127n c6127n = c6128o.f19966b;
        if (c6127n.f19963n == null) {
            c6127n.f19963n = Boolean.valueOf(c6127n.f19956g.mo6670a());
        }
        if (c6127n.f19963n.booleanValue()) {
            boolean zMo6671b = c6128o.f19966b.f19956g.mo6671b(iArr);
            c6128o.f19975k |= zMo6671b;
            if (zMo6671b) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f19979Z.f19966b.getRootAlpha() != i10) {
            this.f19979Z.f19966b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f19979Z.f19969e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19981p0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            AbstractC8234y0.m8874b(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C6128o c6128o = this.f19979Z;
        if (c6128o.f19967c != colorStateList) {
            c6128o.f19967c = colorStateList;
            this.f19980o0 = m6674a(colorStateList, c6128o.f19968d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C6128o c6128o = this.f19979Z;
        if (c6128o.f19968d != mode) {
            c6128o.f19968d = mode;
            this.f19980o0 = m6674a(c6128o.f19967c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.setVisible(z6, z10) : super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C6128o c6128o = this.f19979Z;
        c6128o.f19966b = new C6127n();
        TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources, theme, attributeSet, AbstractC6114a.f19896a);
        C6128o c6128o2 = this.f19979Z;
        C6127n c6127n = c6128o2.f19966b;
        int i14 = !AbstractC18610b.m19961e(xmlPullParser, "tintMode") ? -1 : typedArrayM19964h.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i15 = 3;
        if (i14 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i14 != 5) {
            if (i14 != 9) {
                switch (i14) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c6128o2.f19968d = mode;
        ColorStateList colorStateListM19958b = AbstractC18610b.m19958b(typedArrayM19964h, xmlPullParser, theme);
        if (colorStateListM19958b != null) {
            c6128o2.f19967c = colorStateListM19958b;
        }
        boolean z10 = c6128o2.f19969e;
        if (AbstractC18610b.m19961e(xmlPullParser, "autoMirrored")) {
            z10 = typedArrayM19964h.getBoolean(5, z10);
        }
        c6128o2.f19969e = z10;
        float f10 = c6127n.f19959j;
        if (AbstractC18610b.m19961e(xmlPullParser, "viewportWidth")) {
            f10 = typedArrayM19964h.getFloat(7, f10);
        }
        c6127n.f19959j = f10;
        float f11 = c6127n.f19960k;
        if (AbstractC18610b.m19961e(xmlPullParser, "viewportHeight")) {
            f11 = typedArrayM19964h.getFloat(8, f11);
        }
        c6127n.f19960k = f11;
        if (c6127n.f19959j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM19964h.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            c6127n.f19957h = typedArrayM19964h.getDimension(3, c6127n.f19957h);
            int i16 = 2;
            float dimension = typedArrayM19964h.getDimension(2, c6127n.f19958i);
            c6127n.f19958i = dimension;
            if (c6127n.f19957h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM19964h.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c6127n.getAlpha();
                if (AbstractC18610b.m19961e(xmlPullParser, "alpha")) {
                    alpha = typedArrayM19964h.getFloat(4, alpha);
                }
                c6127n.setAlpha(alpha);
                boolean z11 = false;
                String string = typedArrayM19964h.getString(0);
                if (string != null) {
                    c6127n.f19962m = string;
                    c6127n.f19964o.put(string, c6127n);
                }
                typedArrayM19964h.recycle();
                c6128o.f19965a = getChangingConfigurations();
                int i17 = 1;
                c6128o.f19975k = true;
                C6128o c6128o3 = this.f19979Z;
                C6127n c6127n2 = c6128o3.f19966b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c6127n2.f19956g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z12 = true;
                while (eventType != i17 && (xmlPullParser.getDepth() >= depth || eventType != i15)) {
                    String str = anhfj.YhKjPxdBeysjc;
                    if (eventType == i16) {
                        String name = xmlPullParser.getName();
                        C6124k c6124k = (C6124k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i11 = depth;
                        C12966e c12966e = c6127n2.f19964o;
                        if (zEquals) {
                            C6123j c6123j = new C6123j();
                            c6123j.f19925e = 0.0f;
                            c6123j.f19927g = 1.0f;
                            c6123j.f19928h = 1.0f;
                            c6123j.f19929i = 0.0f;
                            c6123j.f19930j = 1.0f;
                            c6123j.f19931k = 0.0f;
                            Paint.Cap cap = Paint.Cap.BUTT;
                            c6123j.f19932l = cap;
                            Paint.Join join = Paint.Join.MITER;
                            c6123j.f19933m = join;
                            c6123j.f19934n = 4.0f;
                            TypedArray typedArrayM19964h2 = AbstractC18610b.m19964h(resources, theme, attributeSet, AbstractC6114a.f19898c);
                            if (AbstractC18610b.m19961e(xmlPullParser, "pathData")) {
                                String string2 = typedArrayM19964h2.getString(0);
                                if (string2 != null) {
                                    c6123j.f19947b = string2;
                                }
                                String string3 = typedArrayM19964h2.getString(2);
                                if (string3 != null) {
                                    c6123j.f19946a = AbstractC7589s.m7928c(string3);
                                }
                                c6123j.f19926f = AbstractC18610b.m19959c(typedArrayM19964h2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = c6123j.f19928h;
                                if (AbstractC18610b.m19961e(xmlPullParser, "fillAlpha")) {
                                    f12 = typedArrayM19964h2.getFloat(12, f12);
                                }
                                c6123j.f19928h = f12;
                                int i18 = !AbstractC18610b.m19961e(xmlPullParser, "strokeLineCap") ? -1 : typedArrayM19964h2.getInt(8, -1);
                                Paint.Cap cap2 = c6123j.f19932l;
                                if (i18 != 0) {
                                    if (i18 != 1) {
                                        cap = i18 != 2 ? cap2 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                }
                                c6123j.f19932l = cap;
                                int i19 = !AbstractC18610b.m19961e(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayM19964h2.getInt(9, -1);
                                Paint.Join join2 = c6123j.f19933m;
                                if (i19 == 0) {
                                    join2 = join;
                                } else if (i19 == 1) {
                                    join2 = Paint.Join.ROUND;
                                } else if (i19 == 2) {
                                    join2 = Paint.Join.BEVEL;
                                }
                                c6123j.f19933m = join2;
                                float f13 = c6123j.f19934n;
                                if (AbstractC18610b.m19961e(xmlPullParser, "strokeMiterLimit")) {
                                    f13 = typedArrayM19964h2.getFloat(10, f13);
                                }
                                c6123j.f19934n = f13;
                                c6123j.f19924d = AbstractC18610b.m19959c(typedArrayM19964h2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = c6123j.f19927g;
                                if (AbstractC18610b.m19961e(xmlPullParser, "strokeAlpha")) {
                                    f14 = typedArrayM19964h2.getFloat(11, f14);
                                }
                                c6123j.f19927g = f14;
                                float f15 = c6123j.f19925e;
                                if (AbstractC18610b.m19961e(xmlPullParser, "strokeWidth")) {
                                    f15 = typedArrayM19964h2.getFloat(4, f15);
                                }
                                c6123j.f19925e = f15;
                                float f16 = c6123j.f19930j;
                                if (AbstractC18610b.m19961e(xmlPullParser, "trimPathEnd")) {
                                    f16 = typedArrayM19964h2.getFloat(6, f16);
                                }
                                c6123j.f19930j = f16;
                                float f17 = c6123j.f19931k;
                                if (AbstractC18610b.m19961e(xmlPullParser, "trimPathOffset")) {
                                    f17 = typedArrayM19964h2.getFloat(7, f17);
                                }
                                c6123j.f19931k = f17;
                                float f18 = c6123j.f19929i;
                                if (AbstractC18610b.m19961e(xmlPullParser, "trimPathStart")) {
                                    f18 = typedArrayM19964h2.getFloat(5, f18);
                                }
                                c6123j.f19929i = f18;
                                int i20 = c6123j.f19948c;
                                if (AbstractC18610b.m19961e(xmlPullParser, "fillType")) {
                                    i20 = typedArrayM19964h2.getInt(13, i20);
                                }
                                c6123j.f19948c = i20;
                            }
                            typedArrayM19964h2.recycle();
                            c6124k.f19936b.add(c6123j);
                            if (c6123j.getPathName() != null) {
                                c12966e.put(c6123j.getPathName(), c6123j);
                            }
                            c6128o3.f19965a = c6128o3.f19965a;
                            z6 = false;
                            i13 = 1;
                            z12 = false;
                        } else {
                            c6127n2 = c6127n2;
                            if ("clip-path".equals(name)) {
                                C6122i c6122i = new C6122i();
                                if (AbstractC18610b.m19961e(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayM19964h3 = AbstractC18610b.m19964h(resources, theme, attributeSet, AbstractC6114a.f19899d);
                                    String string4 = typedArrayM19964h3.getString(0);
                                    if (string4 != null) {
                                        c6122i.f19947b = string4;
                                    }
                                    String string5 = typedArrayM19964h3.getString(1);
                                    if (string5 != null) {
                                        c6122i.f19946a = AbstractC7589s.m7928c(string5);
                                    }
                                    c6122i.f19948c = !AbstractC18610b.m19961e(xmlPullParser, "fillType") ? 0 : typedArrayM19964h3.getInt(2, 0);
                                    typedArrayM19964h3.recycle();
                                }
                                c6124k.f19936b.add(c6122i);
                                if (c6122i.getPathName() != null) {
                                    c12966e.put(c6122i.getPathName(), c6122i);
                                }
                                c6128o3.f19965a = c6128o3.f19965a;
                            } else if (str.equals(name)) {
                                C6124k c6124k2 = new C6124k();
                                TypedArray typedArrayM19964h4 = AbstractC18610b.m19964h(resources, theme, attributeSet, AbstractC6114a.f19897b);
                                float f19 = c6124k2.f19937c;
                                if (AbstractC18610b.m19961e(xmlPullParser, "rotation")) {
                                    f19 = typedArrayM19964h4.getFloat(5, f19);
                                }
                                c6124k2.f19937c = f19;
                                i13 = 1;
                                c6124k2.f19938d = typedArrayM19964h4.getFloat(1, c6124k2.f19938d);
                                c6124k2.f19939e = typedArrayM19964h4.getFloat(2, c6124k2.f19939e);
                                float f20 = c6124k2.f19940f;
                                if (AbstractC18610b.m19961e(xmlPullParser, "scaleX")) {
                                    f20 = typedArrayM19964h4.getFloat(3, f20);
                                }
                                c6124k2.f19940f = f20;
                                float f21 = c6124k2.f19941g;
                                if (AbstractC18610b.m19961e(xmlPullParser, "scaleY")) {
                                    f21 = typedArrayM19964h4.getFloat(4, f21);
                                }
                                c6124k2.f19941g = f21;
                                float f22 = c6124k2.f19942h;
                                if (AbstractC18610b.m19961e(xmlPullParser, "translateX")) {
                                    f22 = typedArrayM19964h4.getFloat(6, f22);
                                }
                                c6124k2.f19942h = f22;
                                float f23 = c6124k2.f19943i;
                                if (AbstractC18610b.m19961e(xmlPullParser, "translateY")) {
                                    f23 = typedArrayM19964h4.getFloat(7, f23);
                                }
                                c6124k2.f19943i = f23;
                                z6 = false;
                                String string6 = typedArrayM19964h4.getString(0);
                                if (string6 != null) {
                                    c6124k2.f19945k = string6;
                                }
                                c6124k2.m6672c();
                                typedArrayM19964h4.recycle();
                                c6124k.f19936b.add(c6124k2);
                                arrayDeque.push(c6124k2);
                                if (c6124k2.getGroupName() != null) {
                                    c12966e.put(c6124k2.getGroupName(), c6124k2);
                                }
                                c6128o3.f19965a = c6128o3.f19965a;
                            }
                            z6 = false;
                            i13 = 1;
                        }
                        i12 = i13;
                        i10 = 3;
                    } else {
                        z6 = z11;
                        c6127n2 = c6127n2;
                        i10 = i15;
                        i11 = depth;
                        i12 = 1;
                        if (eventType == i10 && str.equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i15 = i10;
                    z11 = z6;
                    i17 = i12;
                    depth = i11;
                    c6127n2 = c6127n2;
                    i16 = 2;
                }
                if (!z12) {
                    this.f19980o0 = m6674a(c6128o.f19967c, c6128o.f19968d);
                    return;
                }
                throw new XmlPullParserException(sVDIzpC.WuNjBkWhzkfgmD);
            }
            throw new XmlPullParserException(typedArrayM19964h.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM19964h.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C6130q(C6128o c6128o) {
        this.f19983r0 = true;
        this.f19984s0 = new float[9];
        this.f19985t0 = new Matrix();
        this.f19986u0 = new Rect();
        this.f19979Z = c6128o;
        this.f19980o0 = m6674a(c6128o.f19967c, c6128o.f19968d);
    }
}
