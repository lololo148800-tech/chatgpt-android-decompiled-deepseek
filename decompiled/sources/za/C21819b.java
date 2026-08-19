package za;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p064Ca.C1619a;
import p1141z2.AbstractC21727f;
import p523V9.AbstractC7995T3;
import p806ia.AbstractC14951a;
import p897n3.C17474a;

/* JADX INFO: renamed from: za.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21819b {

    /* JADX INFO: renamed from: A */
    public CharSequence f69192A;

    /* JADX INFO: renamed from: B */
    public CharSequence f69193B;

    /* JADX INFO: renamed from: C */
    public boolean f69194C;

    /* JADX INFO: renamed from: E */
    public Bitmap f69196E;

    /* JADX INFO: renamed from: F */
    public float f69197F;

    /* JADX INFO: renamed from: G */
    public float f69198G;

    /* JADX INFO: renamed from: H */
    public float f69199H;

    /* JADX INFO: renamed from: I */
    public float f69200I;

    /* JADX INFO: renamed from: J */
    public float f69201J;

    /* JADX INFO: renamed from: K */
    public int f69202K;

    /* JADX INFO: renamed from: L */
    public int[] f69203L;

    /* JADX INFO: renamed from: M */
    public boolean f69204M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f69205N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f69206O;

    /* JADX INFO: renamed from: P */
    public LinearInterpolator f69207P;

    /* JADX INFO: renamed from: Q */
    public LinearInterpolator f69208Q;

    /* JADX INFO: renamed from: R */
    public float f69209R;

    /* JADX INFO: renamed from: S */
    public float f69210S;

    /* JADX INFO: renamed from: T */
    public float f69211T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f69212U;

    /* JADX INFO: renamed from: V */
    public float f69213V;

    /* JADX INFO: renamed from: W */
    public float f69214W;

    /* JADX INFO: renamed from: X */
    public float f69215X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f69216Y;

    /* JADX INFO: renamed from: Z */
    public float f69217Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f69218a;

    /* JADX INFO: renamed from: a0 */
    public float f69219a0;

    /* JADX INFO: renamed from: b */
    public float f69220b;

    /* JADX INFO: renamed from: b0 */
    public float f69221b0;

    /* JADX INFO: renamed from: c */
    public final Rect f69222c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f69223c0;

    /* JADX INFO: renamed from: d */
    public final Rect f69224d;

    /* JADX INFO: renamed from: e */
    public final RectF f69226e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f69233j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f69234k;

    /* JADX INFO: renamed from: l */
    public float f69235l;

    /* JADX INFO: renamed from: m */
    public float f69236m;

    /* JADX INFO: renamed from: n */
    public float f69237n;

    /* JADX INFO: renamed from: o */
    public float f69238o;

    /* JADX INFO: renamed from: p */
    public float f69239p;

    /* JADX INFO: renamed from: q */
    public float f69240q;

    /* JADX INFO: renamed from: r */
    public Typeface f69241r;

    /* JADX INFO: renamed from: s */
    public Typeface f69242s;

    /* JADX INFO: renamed from: t */
    public Typeface f69243t;

    /* JADX INFO: renamed from: u */
    public Typeface f69244u;

    /* JADX INFO: renamed from: v */
    public Typeface f69245v;

    /* JADX INFO: renamed from: w */
    public Typeface f69246w;

    /* JADX INFO: renamed from: x */
    public Typeface f69247x;

    /* JADX INFO: renamed from: y */
    public C1619a f69248y;

    /* JADX INFO: renamed from: f */
    public int f69228f = 16;

    /* JADX INFO: renamed from: g */
    public int f69230g = 16;

    /* JADX INFO: renamed from: h */
    public float f69231h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f69232i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f69249z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f69195D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f69225d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f69227e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f69229f0 = 1;

    public C21819b(TextInputLayout textInputLayout) {
        this.f69218a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f69205N = textPaint;
        this.f69206O = new TextPaint(textPaint);
        this.f69224d = new Rect();
        this.f69222c = new Rect();
        this.f69226e = new RectF();
        m22297g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m22291a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    /* JADX INFO: renamed from: f */
    public static float m22292f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AbstractC14951a.m16113a(f10, f11, f12);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22293b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean z6 = this.f69218a.getLayoutDirection() == 1;
        if (this.f69195D) {
            return (z6 ? AbstractC21727f.f68925d : AbstractC21727f.f68924c).m376m(charSequence.length(), charSequence);
        }
        return z6;
    }

    /* JADX INFO: renamed from: c */
    public final void m22294c(float f10, boolean z6) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        if (this.f69192A == null) {
            return;
        }
        float fWidth = this.f69224d.width();
        float fWidth2 = this.f69222c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f69232i;
            f12 = this.f69213V;
            this.f69197F = 1.0f;
            typeface = this.f69241r;
        } else {
            float f13 = this.f69231h;
            float f14 = this.f69214W;
            Typeface typeface2 = this.f69244u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.f69197F = 1.0f;
            } else {
                this.f69197F = m22292f(this.f69231h, this.f69232i, f10, this.f69208Q) / this.f69231h;
            }
            float f15 = this.f69232i / this.f69231h;
            fWidth = (!z6 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f69205N;
        if (fWidth > 0.0f) {
            boolean z11 = this.f69198G != f11;
            boolean z12 = this.f69215X != f12;
            boolean z13 = this.f69247x != typeface;
            StaticLayout staticLayout = this.f69216Y;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f69204M;
            this.f69198G = f11;
            this.f69215X = f12;
            this.f69247x = typeface;
            this.f69204M = false;
            textPaint.setLinearText(this.f69197F != 1.0f);
            z10 = z14;
        } else {
            z10 = false;
        }
        if (this.f69193B == null || z10) {
            textPaint.setTextSize(this.f69198G);
            textPaint.setTypeface(this.f69247x);
            textPaint.setLetterSpacing(this.f69215X);
            boolean zM22293b = m22293b(this.f69192A);
            this.f69194C = zM22293b;
            int i10 = this.f69225d0;
            if (i10 <= 1 || zM22293b) {
                i10 = 1;
            }
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f69228f, zM22293b ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f69194C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f69194C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            C21824g c21824g = new C21824g(this.f69192A, textPaint, (int) fWidth);
            c21824g.f69268k = this.f69249z;
            c21824g.f69267j = zM22293b;
            c21824g.f69262e = alignment;
            c21824g.f69266i = false;
            c21824g.f69263f = i10;
            c21824g.f69264g = this.f69227e0;
            c21824g.f69265h = this.f69229f0;
            StaticLayout staticLayoutM22305a = c21824g.m22305a();
            staticLayoutM22305a.getClass();
            this.f69216Y = staticLayoutM22305a;
            this.f69193B = staticLayoutM22305a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m22295d() {
        TextPaint textPaint = this.f69206O;
        textPaint.setTextSize(this.f69232i);
        textPaint.setTypeface(this.f69241r);
        textPaint.setLetterSpacing(this.f69213V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m22296e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f69203L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m22297g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f69243t;
            if (typeface != null) {
                this.f69242s = AbstractC7995T3.m8300f(configuration, typeface);
            }
            Typeface typeface2 = this.f69246w;
            if (typeface2 != null) {
                this.f69245v = AbstractC7995T3.m8300f(configuration, typeface2);
            }
            Typeface typeface3 = this.f69242s;
            if (typeface3 == null) {
                typeface3 = this.f69243t;
            }
            this.f69241r = typeface3;
            Typeface typeface4 = this.f69245v;
            if (typeface4 == null) {
                typeface4 = this.f69246w;
            }
            this.f69244u = typeface4;
            m22298h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22298h(boolean z6) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f69218a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z6) {
            return;
        }
        m22294c(1.0f, z6);
        CharSequence charSequence = this.f69193B;
        TextPaint textPaint = this.f69205N;
        if (charSequence != null && (staticLayout = this.f69216Y) != null) {
            this.f69223c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f69249z);
        }
        CharSequence charSequence2 = this.f69223c0;
        if (charSequence2 != null) {
            this.f69217Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f69217Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f69230g, this.f69194C ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f69224d;
        if (i10 == 48) {
            this.f69236m = rect.top;
        } else if (i10 != 80) {
            this.f69236m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f69236m = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f69238o = rect.centerX() - (this.f69217Z / 2.0f);
        } else if (i11 != 5) {
            this.f69238o = rect.left;
        } else {
            this.f69238o = rect.right - this.f69217Z;
        }
        m22294c(0.0f, z6);
        StaticLayout staticLayout2 = this.f69216Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f69216Y;
        if (staticLayout3 == null || this.f69225d0 <= 1) {
            CharSequence charSequence3 = this.f69193B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f69216Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f69228f, this.f69194C ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f69222c;
        if (i12 == 48) {
            this.f69235l = rect2.top;
        } else if (i12 != 80) {
            this.f69235l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f69235l = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f69237n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f69237n = rect2.left;
        } else {
            this.f69237n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f69196E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f69196E = null;
        }
        m22302l(this.f69220b);
        float f10 = this.f69220b;
        float fM22292f = m22292f(rect2.left, rect.left, f10, this.f69207P);
        RectF rectF = this.f69226e;
        rectF.left = fM22292f;
        rectF.top = m22292f(this.f69235l, this.f69236m, f10, this.f69207P);
        rectF.right = m22292f(rect2.right, rect.right, f10, this.f69207P);
        rectF.bottom = m22292f(rect2.bottom, rect.bottom, f10, this.f69207P);
        this.f69239p = m22292f(this.f69237n, this.f69238o, f10, this.f69207P);
        this.f69240q = m22292f(this.f69235l, this.f69236m, f10, this.f69207P);
        m22302l(f10);
        C17474a c17474a = AbstractC14951a.f46572b;
        this.f69219a0 = 1.0f - m22292f(0.0f, 1.0f, 1.0f - f10, c17474a);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        textInputLayout.postInvalidateOnAnimation();
        this.f69221b0 = m22292f(1.0f, 0.0f, f10, c17474a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f69234k;
        ColorStateList colorStateList2 = this.f69233j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m22291a(f10, m22296e(colorStateList2), m22296e(this.f69234k)));
        } else {
            textPaint.setColor(m22296e(colorStateList));
        }
        float f11 = this.f69213V;
        float f12 = this.f69214W;
        if (f11 != f12) {
            textPaint.setLetterSpacing(m22292f(f12, f11, f10, c17474a));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.f69199H = AbstractC14951a.m16113a(0.0f, this.f69209R, f10);
        this.f69200I = AbstractC14951a.m16113a(0.0f, this.f69210S, f10);
        this.f69201J = AbstractC14951a.m16113a(0.0f, this.f69211T, f10);
        int iM22291a = m22291a(f10, 0, m22296e(this.f69212U));
        this.f69202K = iM22291a;
        textPaint.setShadowLayer(this.f69199H, this.f69200I, this.f69201J, iM22291a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m22299i(ColorStateList colorStateList) {
        if (this.f69234k == colorStateList && this.f69233j == colorStateList) {
            return;
        }
        this.f69234k = colorStateList;
        this.f69233j = colorStateList;
        m22298h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22300j(Typeface typeface) {
        C1619a c1619a = this.f69248y;
        if (c1619a != null) {
            c1619a.f4584c = true;
        }
        if (this.f69243t == typeface) {
            return false;
        }
        this.f69243t = typeface;
        Typeface typefaceM8300f = AbstractC7995T3.m8300f(this.f69218a.getContext().getResources().getConfiguration(), typeface);
        this.f69242s = typefaceM8300f;
        if (typefaceM8300f == null) {
            typefaceM8300f = this.f69243t;
        }
        this.f69241r = typefaceM8300f;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m22301k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f69220b) {
            this.f69220b = f10;
            Rect rect = this.f69222c;
            float f11 = rect.left;
            Rect rect2 = this.f69224d;
            float fM22292f = m22292f(f11, rect2.left, f10, this.f69207P);
            RectF rectF = this.f69226e;
            rectF.left = fM22292f;
            rectF.top = m22292f(this.f69235l, this.f69236m, f10, this.f69207P);
            rectF.right = m22292f(rect.right, rect2.right, f10, this.f69207P);
            rectF.bottom = m22292f(rect.bottom, rect2.bottom, f10, this.f69207P);
            this.f69239p = m22292f(this.f69237n, this.f69238o, f10, this.f69207P);
            this.f69240q = m22292f(this.f69235l, this.f69236m, f10, this.f69207P);
            m22302l(f10);
            C17474a c17474a = AbstractC14951a.f46572b;
            this.f69219a0 = 1.0f - m22292f(0.0f, 1.0f, 1.0f - f10, c17474a);
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            TextInputLayout textInputLayout = this.f69218a;
            textInputLayout.postInvalidateOnAnimation();
            this.f69221b0 = m22292f(1.0f, 0.0f, f10, c17474a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f69234k;
            ColorStateList colorStateList2 = this.f69233j;
            TextPaint textPaint = this.f69205N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m22291a(f10, m22296e(colorStateList2), m22296e(this.f69234k)));
            } else {
                textPaint.setColor(m22296e(colorStateList));
            }
            float f12 = this.f69213V;
            float f13 = this.f69214W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(m22292f(f13, f12, f10, c17474a));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f69199H = AbstractC14951a.m16113a(0.0f, this.f69209R, f10);
            this.f69200I = AbstractC14951a.m16113a(0.0f, this.f69210S, f10);
            this.f69201J = AbstractC14951a.m16113a(0.0f, this.f69211T, f10);
            int iM22291a = m22291a(f10, 0, m22296e(this.f69212U));
            this.f69202K = iM22291a;
            textPaint.setShadowLayer(this.f69199H, this.f69200I, this.f69201J, iM22291a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22302l(float f10) {
        m22294c(f10, false);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        this.f69218a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: m */
    public final void m22303m(Typeface typeface) {
        boolean z6;
        boolean zM22300j = m22300j(typeface);
        if (this.f69246w != typeface) {
            this.f69246w = typeface;
            Typeface typefaceM8300f = AbstractC7995T3.m8300f(this.f69218a.getContext().getResources().getConfiguration(), typeface);
            this.f69245v = typefaceM8300f;
            if (typefaceM8300f == null) {
                typefaceM8300f = this.f69246w;
            }
            this.f69244u = typefaceM8300f;
            z6 = true;
        } else {
            z6 = false;
        }
        if (zM22300j || z6) {
            m22298h(false);
        }
    }
}
