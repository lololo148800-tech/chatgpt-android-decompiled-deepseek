package p986ra;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p064Ca.C1622d;
import p090Da.AbstractC1982a;
import p1002s2.InterfaceC19438a;
import p140Fa.C2681a;
import p140Fa.C2686f;
import p140Fa.C2687g;
import p140Fa.C2690j;
import p806ia.C14954d;
import p979r2.AbstractC18861b;
import za.C21826i;
import za.InterfaceC21825h;

/* JADX INFO: renamed from: ra.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18909f extends C2687g implements Drawable.Callback, InterfaceC21825h {

    /* JADX INFO: renamed from: R1 */
    public static final int[] f60277R1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: S1 */
    public static final ShapeDrawable f60278S1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A1 */
    public int f60279A1;

    /* JADX INFO: renamed from: B1 */
    public int f60280B1;

    /* JADX INFO: renamed from: C1 */
    public int f60281C1;

    /* JADX INFO: renamed from: D1 */
    public boolean f60282D1;

    /* JADX INFO: renamed from: E1 */
    public int f60283E1;

    /* JADX INFO: renamed from: F1 */
    public int f60284F1;

    /* JADX INFO: renamed from: G1 */
    public ColorFilter f60285G1;

    /* JADX INFO: renamed from: H1 */
    public PorterDuffColorFilter f60286H1;

    /* JADX INFO: renamed from: I1 */
    public ColorStateList f60287I1;

    /* JADX INFO: renamed from: J0 */
    public ColorStateList f60288J0;

    /* JADX INFO: renamed from: J1 */
    public PorterDuff.Mode f60289J1;

    /* JADX INFO: renamed from: K0 */
    public ColorStateList f60290K0;

    /* JADX INFO: renamed from: K1 */
    public int[] f60291K1;

    /* JADX INFO: renamed from: L0 */
    public float f60292L0;

    /* JADX INFO: renamed from: L1 */
    public ColorStateList f60293L1;

    /* JADX INFO: renamed from: M0 */
    public float f60294M0;

    /* JADX INFO: renamed from: M1 */
    public WeakReference f60295M1;

    /* JADX INFO: renamed from: N0 */
    public ColorStateList f60296N0;

    /* JADX INFO: renamed from: N1 */
    public TextUtils.TruncateAt f60297N1;

    /* JADX INFO: renamed from: O0 */
    public float f60298O0;

    /* JADX INFO: renamed from: O1 */
    public boolean f60299O1;

    /* JADX INFO: renamed from: P0 */
    public ColorStateList f60300P0;

    /* JADX INFO: renamed from: P1 */
    public int f60301P1;

    /* JADX INFO: renamed from: Q0 */
    public CharSequence f60302Q0;

    /* JADX INFO: renamed from: Q1 */
    public boolean f60303Q1;

    /* JADX INFO: renamed from: R0 */
    public boolean f60304R0;

    /* JADX INFO: renamed from: S0 */
    public Drawable f60305S0;

    /* JADX INFO: renamed from: T0 */
    public ColorStateList f60306T0;

    /* JADX INFO: renamed from: U0 */
    public float f60307U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f60308V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f60309W0;

    /* JADX INFO: renamed from: X0 */
    public Drawable f60310X0;

    /* JADX INFO: renamed from: Y0 */
    public RippleDrawable f60311Y0;

    /* JADX INFO: renamed from: Z0 */
    public ColorStateList f60312Z0;

    /* JADX INFO: renamed from: a1 */
    public float f60313a1;

    /* JADX INFO: renamed from: b1 */
    public SpannableStringBuilder f60314b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f60315c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f60316d1;

    /* JADX INFO: renamed from: e1 */
    public Drawable f60317e1;

    /* JADX INFO: renamed from: f1 */
    public ColorStateList f60318f1;

    /* JADX INFO: renamed from: g1 */
    public C14954d f60319g1;

    /* JADX INFO: renamed from: h1 */
    public C14954d f60320h1;

    /* JADX INFO: renamed from: i1 */
    public float f60321i1;

    /* JADX INFO: renamed from: j1 */
    public float f60322j1;

    /* JADX INFO: renamed from: k1 */
    public float f60323k1;

    /* JADX INFO: renamed from: l1 */
    public float f60324l1;

    /* JADX INFO: renamed from: m1 */
    public float f60325m1;

    /* JADX INFO: renamed from: n1 */
    public float f60326n1;

    /* JADX INFO: renamed from: o1 */
    public float f60327o1;

    /* JADX INFO: renamed from: p1 */
    public float f60328p1;

    /* JADX INFO: renamed from: q1 */
    public final Context f60329q1;

    /* JADX INFO: renamed from: r1 */
    public final Paint f60330r1;

    /* JADX INFO: renamed from: s1 */
    public final Paint.FontMetrics f60331s1;

    /* JADX INFO: renamed from: t1 */
    public final RectF f60332t1;

    /* JADX INFO: renamed from: u1 */
    public final PointF f60333u1;

    /* JADX INFO: renamed from: v1 */
    public final Path f60334v1;

    /* JADX INFO: renamed from: w1 */
    public final C21826i f60335w1;

    /* JADX INFO: renamed from: x1 */
    public int f60336x1;

    /* JADX INFO: renamed from: y1 */
    public int f60337y1;

    /* JADX INFO: renamed from: z1 */
    public int f60338z1;

    public C18909f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action);
        this.f60294M0 = -1.0f;
        this.f60330r1 = new Paint(1);
        this.f60331s1 = new Paint.FontMetrics();
        this.f60332t1 = new RectF();
        this.f60333u1 = new PointF();
        this.f60334v1 = new Path();
        this.f60284F1 = 255;
        this.f60289J1 = PorterDuff.Mode.SRC_IN;
        this.f60295M1 = new WeakReference(null);
        m3679i(context);
        this.f60329q1 = context;
        C21826i c21826i = new C21826i(this);
        this.f60335w1 = c21826i;
        this.f60302Q0 = "";
        c21826i.f69269a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f60277R1;
        setState(iArr);
        if (!Arrays.equals(this.f60291K1, iArr)) {
            this.f60291K1 = iArr;
            if (m20258X()) {
                m20265z(getState(), iArr);
            }
        }
        this.f60299O1 = true;
        int[] iArr2 = AbstractC1982a.f5854a;
        f60278S1.setTint(-1);
    }

    /* JADX INFO: renamed from: Y */
    public static void m20232Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m20233w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m20234x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m20235A(boolean z6) {
        if (this.f60315c1 != z6) {
            this.f60315c1 = z6;
            float fM20261t = m20261t();
            if (!z6 && this.f60282D1) {
                this.f60282D1 = false;
            }
            float fM20261t2 = m20261t();
            invalidateSelf();
            if (fM20261t != fM20261t2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m20236B(Drawable drawable) {
        if (this.f60317e1 != drawable) {
            float fM20261t = m20261t();
            this.f60317e1 = drawable;
            float fM20261t2 = m20261t();
            m20232Y(this.f60317e1);
            m20259r(this.f60317e1);
            invalidateSelf();
            if (fM20261t != fM20261t2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m20237C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f60318f1 != colorStateList) {
            this.f60318f1 = colorStateList;
            if (this.f60316d1 && (drawable = this.f60317e1) != null && this.f60315c1) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m20238D(boolean z6) {
        if (this.f60316d1 != z6) {
            boolean zM20256V = m20256V();
            this.f60316d1 = z6;
            boolean zM20256V2 = m20256V();
            if (zM20256V != zM20256V2) {
                if (zM20256V2) {
                    m20259r(this.f60317e1);
                } else {
                    m20232Y(this.f60317e1);
                }
                invalidateSelf();
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m20239E(float f10) {
        if (this.f60294M0 != f10) {
            this.f60294M0 = f10;
            C2690j c2690jM3694e = this.f8246Y.f8220a.m3694e();
            c2690jM3694e.f8265e = new C2681a(f10);
            c2690jM3694e.f8266f = new C2681a(f10);
            c2690jM3694e.f8267g = new C2681a(f10);
            c2690jM3694e.f8268h = new C2681a(f10);
            setShapeAppearanceModel(c2690jM3694e.m3689a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: F */
    public final void m20240F(Drawable drawable) {
        ?? r6;
        Object obj = this.f60305S0;
        if (obj == null) {
            r6 = 0;
        } else if (obj instanceof InterfaceC19438a) {
            r6 = obj;
            r6 = 0;
        }
        if (r6 != drawable) {
            float fM20261t = m20261t();
            this.f60305S0 = drawable != null ? drawable.mutate() : null;
            float fM20261t2 = m20261t();
            m20232Y(r6);
            if (m20257W()) {
                m20259r(this.f60305S0);
            }
            invalidateSelf();
            if (fM20261t != fM20261t2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m20241G(float f10) {
        if (this.f60307U0 != f10) {
            float fM20261t = m20261t();
            this.f60307U0 = f10;
            float fM20261t2 = m20261t();
            invalidateSelf();
            if (fM20261t != fM20261t2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m20242H(ColorStateList colorStateList) {
        this.f60308V0 = true;
        if (this.f60306T0 != colorStateList) {
            this.f60306T0 = colorStateList;
            if (m20257W()) {
                this.f60305S0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m20243I(boolean z6) {
        if (this.f60304R0 != z6) {
            boolean zM20257W = m20257W();
            this.f60304R0 = z6;
            boolean zM20257W2 = m20257W();
            if (zM20257W != zM20257W2) {
                if (zM20257W2) {
                    m20259r(this.f60305S0);
                } else {
                    m20232Y(this.f60305S0);
                }
                invalidateSelf();
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m20244J(ColorStateList colorStateList) {
        if (this.f60296N0 != colorStateList) {
            this.f60296N0 = colorStateList;
            if (this.f60303Q1) {
                C2686f c2686f = this.f8246Y;
                if (c2686f.f8223d != colorStateList) {
                    c2686f.f8223d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m20245K(float f10) {
        if (this.f60298O0 != f10) {
            this.f60298O0 = f10;
            this.f60330r1.setStrokeWidth(f10);
            if (this.f60303Q1) {
                this.f8246Y.f8229j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: L */
    public final void m20246L(Drawable drawable) {
        ?? r6;
        Object obj = this.f60310X0;
        if (obj == null) {
            r6 = 0;
        } else if (obj instanceof InterfaceC19438a) {
            r6 = obj;
            r6 = 0;
        }
        if (r6 != drawable) {
            float fM20262u = m20262u();
            this.f60310X0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC1982a.f5854a;
            this.f60311Y0 = new RippleDrawable(AbstractC1982a.m3155a(this.f60300P0), this.f60310X0, f60278S1);
            float fM20262u2 = m20262u();
            m20232Y(r6);
            if (m20258X()) {
                m20259r(this.f60310X0);
            }
            invalidateSelf();
            if (fM20262u != fM20262u2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m20247M(float f10) {
        if (this.f60327o1 != f10) {
            this.f60327o1 = f10;
            invalidateSelf();
            if (m20258X()) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m20248N(float f10) {
        if (this.f60313a1 != f10) {
            this.f60313a1 = f10;
            invalidateSelf();
            if (m20258X()) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m20249O(float f10) {
        if (this.f60326n1 != f10) {
            this.f60326n1 = f10;
            invalidateSelf();
            if (m20258X()) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m20250P(ColorStateList colorStateList) {
        if (this.f60312Z0 != colorStateList) {
            this.f60312Z0 = colorStateList;
            if (m20258X()) {
                this.f60310X0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m20251Q(boolean z6) {
        if (this.f60309W0 != z6) {
            boolean zM20258X = m20258X();
            this.f60309W0 = z6;
            boolean zM20258X2 = m20258X();
            if (zM20258X != zM20258X2) {
                if (zM20258X2) {
                    m20259r(this.f60310X0);
                } else {
                    m20232Y(this.f60310X0);
                }
                invalidateSelf();
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m20252R(float f10) {
        if (this.f60323k1 != f10) {
            float fM20261t = m20261t();
            this.f60323k1 = f10;
            float fM20261t2 = m20261t();
            invalidateSelf();
            if (fM20261t != fM20261t2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m20253S(float f10) {
        if (this.f60322j1 != f10) {
            float fM20261t = m20261t();
            this.f60322j1 = f10;
            float fM20261t2 = m20261t();
            invalidateSelf();
            if (fM20261t != fM20261t2) {
                m20264y();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m20254T(ColorStateList colorStateList) {
        if (this.f60300P0 != colorStateList) {
            this.f60300P0 = colorStateList;
            this.f60293L1 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m20255U(C1622d c1622d) {
        C21826i c21826i = this.f60335w1;
        if (c21826i.f69274f != c1622d) {
            c21826i.f69274f = c1622d;
            if (c1622d != null) {
                TextPaint textPaint = c21826i.f69269a;
                Context context = this.f60329q1;
                C18905b c18905b = c21826i.f69270b;
                c1622d.m2484f(context, textPaint, c18905b);
                InterfaceC21825h interfaceC21825h = (InterfaceC21825h) c21826i.f69273e.get();
                if (interfaceC21825h != null) {
                    textPaint.drawableState = interfaceC21825h.getState();
                }
                c1622d.m2483e(context, textPaint, c18905b);
                c21826i.f69272d = true;
            }
            InterfaceC21825h interfaceC21825h2 = (InterfaceC21825h) c21826i.f69273e.get();
            if (interfaceC21825h2 != null) {
                C18909f c18909f = (C18909f) interfaceC21825h2;
                c18909f.m20264y();
                c18909f.invalidateSelf();
                c18909f.onStateChange(interfaceC21825h2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m20256V() {
        return this.f60316d1 && this.f60317e1 != null && this.f60282D1;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m20257W() {
        return this.f60304R0 && this.f60305S0 != null;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m20258X() {
        return this.f60309W0 && this.f60310X0 != null;
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        RectF rectF2;
        float f10;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.f60284F1) == 0) {
            return;
        }
        int iSaveLayerAlpha = i10 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        boolean z6 = this.f60303Q1;
        Paint paint = this.f60330r1;
        RectF rectF3 = this.f60332t1;
        if (!z6) {
            paint.setColor(this.f60336x1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m20263v(), m20263v(), paint);
        }
        if (!this.f60303Q1) {
            paint.setColor(this.f60337y1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f60285G1;
            if (colorFilter == null) {
                colorFilter = this.f60286H1;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m20263v(), m20263v(), paint);
        }
        if (this.f60303Q1) {
            super.draw(canvas);
        }
        if (this.f60298O0 > 0.0f && !this.f60303Q1) {
            paint.setColor(this.f60279A1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f60303Q1) {
                ColorFilter colorFilter2 = this.f60285G1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f60286H1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.f60298O0 / 2.0f;
            rectF3.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.f60294M0 - (this.f60298O0 / 2.0f);
            canvas.drawRoundRect(rectF3, f13, f13, paint);
        }
        paint.setColor(this.f60280B1);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f60303Q1) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f60334v1;
            C2686f c2686f = this.f8246Y;
            this.f8241D0.m2362b(c2686f.f8220a, c2686f.f8228i, rectF4, this.f8240C0, path);
            m3674d(canvas, paint, path, this.f8246Y.f8220a, m3676f());
        } else {
            canvas.drawRoundRect(rectF3, m20263v(), m20263v(), paint);
        }
        if (m20257W()) {
            m20260s(bounds, rectF3);
            float f14 = rectF3.left;
            float f15 = rectF3.top;
            canvas.translate(f14, f15);
            this.f60305S0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f60305S0.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (m20256V()) {
            m20260s(bounds, rectF3);
            float f16 = rectF3.left;
            float f17 = rectF3.top;
            canvas.translate(f16, f17);
            this.f60317e1.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f60317e1.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (!this.f60299O1 || this.f60302Q0 == null) {
            rectF = rectF3;
            i11 = iSaveLayerAlpha;
            i12 = 255;
            i13 = 0;
        } else {
            PointF pointF = this.f60333u1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f60302Q0;
            C21826i c21826i = this.f60335w1;
            if (charSequence != null) {
                float fM20261t = m20261t() + this.f60321i1 + this.f60324l1;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM20261t;
                } else {
                    pointF.x = bounds.right - fM20261t;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c21826i.f69269a;
                Paint.FontMetrics fontMetrics = this.f60331s1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f60302Q0 != null) {
                float fM20261t2 = m20261t() + this.f60321i1 + this.f60324l1;
                float fM20262u = m20262u() + this.f60328p1 + this.f60325m1;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + fM20261t2;
                    rectF3.right = bounds.right - fM20262u;
                } else {
                    rectF3.left = bounds.left + fM20262u;
                    rectF3.right = bounds.right - fM20261t2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C1622d c1622d = c21826i.f69274f;
            TextPaint textPaint2 = c21826i.f69269a;
            if (c1622d != null) {
                textPaint2.drawableState = getState();
                c21826i.f69274f.m2483e(this.f60329q1, textPaint2, c21826i.f69270b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f60302Q0.toString();
            if (c21826i.f69272d) {
                float fMeasureText = string != null ? textPaint2.measureText((CharSequence) string, 0, string.length()) : 0.0f;
                c21826i.f69271c = fMeasureText;
                c21826i.f69272d = false;
                f10 = fMeasureText;
            } else {
                f10 = c21826i.f69271c;
            }
            boolean z10 = Math.round(f10) > Math.round(rectF3.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f60302Q0;
            if (z10 && this.f60297N1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f60297N1);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f18 = pointF.x;
            float f19 = pointF.y;
            rectF = rectF3;
            i11 = iSaveLayerAlpha;
            i12 = 255;
            i13 = 0;
            canvas.drawText(charSequence2, 0, length, f18, f19, textPaint2);
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m20258X()) {
            rectF.setEmpty();
            if (m20258X()) {
                float f20 = this.f60328p1 + this.f60327o1;
                if (getLayoutDirection() == 0) {
                    float f21 = bounds.right - f20;
                    rectF2 = rectF;
                    rectF2.right = f21;
                    rectF2.left = f21 - this.f60313a1;
                } else {
                    rectF2 = rectF;
                    float f22 = bounds.left + f20;
                    rectF2.left = f22;
                    rectF2.right = f22 + this.f60313a1;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f23 = this.f60313a1;
                float f24 = fExactCenterY - (f23 / 2.0f);
                rectF2.top = f24;
                rectF2.bottom = f24 + f23;
            } else {
                rectF2 = rectF;
            }
            float f25 = rectF2.left;
            float f26 = rectF2.top;
            canvas.translate(f25, f26);
            this.f60310X0.setBounds(i13, i13, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = AbstractC1982a.f5854a;
            this.f60311Y0.setBounds(this.f60310X0.getBounds());
            this.f60311Y0.jumpToCurrentState();
            this.f60311Y0.draw(canvas);
            canvas.translate(-f25, -f26);
        }
        if (this.f60284F1 < i12) {
            canvas.restoreToCount(i11);
        }
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f60284F1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f60285G1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f60292L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMeasureText;
        float fM20261t = m20261t() + this.f60321i1 + this.f60324l1;
        String string = this.f60302Q0.toString();
        C21826i c21826i = this.f60335w1;
        if (c21826i.f69272d) {
            fMeasureText = string == null ? 0.0f : c21826i.f69269a.measureText((CharSequence) string, 0, string.length());
            c21826i.f69271c = fMeasureText;
            c21826i.f69272d = false;
        } else {
            fMeasureText = c21826i.f69271c;
        }
        return Math.min(Math.round(m20262u() + fMeasureText + fM20261t + this.f60325m1 + this.f60328p1), this.f60301P1);
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f60303Q1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f60292L0, this.f60294M0);
        } else {
            outline.setRoundRect(bounds, this.f60294M0);
        }
        outline.setAlpha(this.f60284F1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C1622d c1622d;
        ColorStateList colorStateList;
        return m20233w(this.f60288J0) || m20233w(this.f60290K0) || m20233w(this.f60296N0) || !((c1622d = this.f60335w1.f69274f) == null || (colorStateList = c1622d.f4601j) == null || !colorStateList.isStateful()) || ((this.f60316d1 && this.f60317e1 != null && this.f60315c1) || m20234x(this.f60305S0) || m20234x(this.f60317e1) || m20233w(this.f60287I1));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (m20257W()) {
            zOnLayoutDirectionChanged |= this.f60305S0.setLayoutDirection(i10);
        }
        if (m20256V()) {
            zOnLayoutDirectionChanged |= this.f60317e1.setLayoutDirection(i10);
        }
        if (m20258X()) {
            zOnLayoutDirectionChanged |= this.f60310X0.setLayoutDirection(i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (m20257W()) {
            zOnLevelChange |= this.f60305S0.setLevel(i10);
        }
        if (m20256V()) {
            zOnLevelChange |= this.f60317e1.setLevel(i10);
        }
        if (m20258X()) {
            zOnLevelChange |= this.f60310X0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f60303Q1) {
            super.onStateChange(iArr);
        }
        return m20265z(iArr, this.f60291K1);
    }

    /* JADX INFO: renamed from: r */
    public final void m20259r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f60310X0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f60291K1);
            }
            drawable.setTintList(this.f60312Z0);
            return;
        }
        Drawable drawable2 = this.f60305S0;
        if (drawable == drawable2 && this.f60308V0) {
            drawable2.setTintList(this.f60306T0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m20260s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m20257W() || m20256V()) {
            float f10 = this.f60321i1 + this.f60322j1;
            Drawable drawable = this.f60282D1 ? this.f60317e1 : this.f60305S0;
            float intrinsicWidth = this.f60307U0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f60282D1 ? this.f60317e1 : this.f60305S0;
            float fCeil = this.f60307U0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f60329q1.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f60284F1 != i10) {
            this.f60284F1 = i10;
            invalidateSelf();
        }
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f60285G1 != colorFilter) {
            this.f60285G1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f60287I1 != colorStateList) {
            this.f60287I1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p140Fa.C2687g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f60289J1 != mode) {
            this.f60289J1 = mode;
            ColorStateList colorStateList = this.f60287I1;
            this.f60286H1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        if (m20257W()) {
            visible |= this.f60305S0.setVisible(z6, z10);
        }
        if (m20256V()) {
            visible |= this.f60317e1.setVisible(z6, z10);
        }
        if (m20258X()) {
            visible |= this.f60310X0.setVisible(z6, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t */
    public final float m20261t() {
        if (!m20257W() && !m20256V()) {
            return 0.0f;
        }
        float f10 = this.f60322j1;
        Drawable drawable = this.f60282D1 ? this.f60317e1 : this.f60305S0;
        float intrinsicWidth = this.f60307U0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f60323k1;
    }

    /* JADX INFO: renamed from: u */
    public final float m20262u() {
        if (m20258X()) {
            return this.f60326n1 + this.f60313a1 + this.f60327o1;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m20263v() {
        return this.f60303Q1 ? m3677g() : this.f60294M0;
    }

    /* JADX INFO: renamed from: y */
    public final void m20264y() {
        InterfaceC18908e interfaceC18908e = (InterfaceC18908e) this.f60295M1.get();
        if (interfaceC18908e != null) {
            Chip chip = (Chip) interfaceC18908e;
            chip.m13618b(chip.f36533D0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20265z(int[] iArr, int[] iArr2) {
        boolean z6;
        boolean z10;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f60288J0;
        int iM3672b = m3672b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f60336x1) : 0);
        if (this.f60336x1 != iM3672b) {
            this.f60336x1 = iM3672b;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f60290K0;
        int iM3672b2 = m3672b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f60337y1) : 0);
        if (this.f60337y1 != iM3672b2) {
            this.f60337y1 = iM3672b2;
            zOnStateChange = true;
        }
        int iM20167e = AbstractC18861b.m20167e(iM3672b2, iM3672b);
        if ((this.f60338z1 != iM20167e) | (this.f8246Y.f8222c == null)) {
            this.f60338z1 = iM20167e;
            m3682l(ColorStateList.valueOf(iM20167e));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f60296N0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f60279A1) : 0;
        if (this.f60279A1 != colorForState) {
            this.f60279A1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f60293L1 == null || !AbstractC1982a.m3156b(iArr)) ? 0 : this.f60293L1.getColorForState(iArr, this.f60280B1);
        if (this.f60280B1 != colorForState2) {
            this.f60280B1 = colorForState2;
        }
        C1622d c1622d = this.f60335w1.f69274f;
        int colorForState3 = (c1622d == null || (colorStateList = c1622d.f4601j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f60281C1);
        if (this.f60281C1 != colorForState3) {
            this.f60281C1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (state2[i10] != 16842912) {
                        i10++;
                    } else if (this.f60315c1) {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
                break;
            }
        } else {
            z6 = false;
            break;
        }
        if (this.f60282D1 == z6 || this.f60317e1 == null) {
            z10 = false;
        } else {
            float fM20261t = m20261t();
            this.f60282D1 = z6;
            if (fM20261t != m20261t()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                zOnStateChange = true;
                z10 = false;
            }
        }
        ColorStateList colorStateList5 = this.f60287I1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f60283E1) : 0;
        if (this.f60283E1 != colorForState4) {
            this.f60283E1 = colorForState4;
            ColorStateList colorStateList6 = this.f60287I1;
            PorterDuff.Mode mode = this.f60289J1;
            this.f60286H1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m20234x(this.f60305S0)) {
            state |= this.f60305S0.setState(iArr);
        }
        if (m20234x(this.f60317e1)) {
            state |= this.f60317e1.setState(iArr);
        }
        if (m20234x(this.f60310X0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f60310X0.setState(iArr3);
        }
        int[] iArr4 = AbstractC1982a.f5854a;
        if (m20234x(this.f60311Y0)) {
            state |= this.f60311Y0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            m20264y();
        }
        return state;
    }
}
