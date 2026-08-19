package p064Ca;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC7987S3;
import p523V9.AbstractC7995T3;
import p783ha.AbstractC14431a;
import p955q2.AbstractC18619k;

/* JADX INFO: renamed from: Ca.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1622d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f4592a;

    /* JADX INFO: renamed from: b */
    public final String f4593b;

    /* JADX INFO: renamed from: c */
    public final int f4594c;

    /* JADX INFO: renamed from: d */
    public final int f4595d;

    /* JADX INFO: renamed from: e */
    public final float f4596e;

    /* JADX INFO: renamed from: f */
    public final float f4597f;

    /* JADX INFO: renamed from: g */
    public final float f4598g;

    /* JADX INFO: renamed from: h */
    public final boolean f4599h;

    /* JADX INFO: renamed from: i */
    public final float f4600i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f4601j;

    /* JADX INFO: renamed from: k */
    public float f4602k;

    /* JADX INFO: renamed from: l */
    public final int f4603l;

    /* JADX INFO: renamed from: m */
    public boolean f4604m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f4605n;

    public C1622d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC14431a.f45364E);
        this.f4602k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f4601j = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 3);
        AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 4);
        AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 5);
        this.f4594c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f4595d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f4603l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f4593b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f4592a = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 6);
        this.f4596e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f4597f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f4598g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, AbstractC14431a.f45389v);
        this.f4599h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f4600i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m2479a() {
        String str;
        Typeface typeface = this.f4605n;
        int i10 = this.f4594c;
        if (typeface == null && (str = this.f4593b) != null) {
            this.f4605n = Typeface.create(str, i10);
        }
        if (this.f4605n == null) {
            int i11 = this.f4595d;
            if (i11 == 1) {
                this.f4605n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f4605n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f4605n = Typeface.DEFAULT;
            } else {
                this.f4605n = Typeface.MONOSPACE;
            }
            this.f4605n = Typeface.create(this.f4605n, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m2480b(Context context) {
        if (this.f4604m) {
            return this.f4605n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM19975b = AbstractC18619k.m19975b(context, this.f4603l);
                this.f4605n = typefaceM19975b;
                if (typefaceM19975b != null) {
                    this.f4605n = Typeface.create(typefaceM19975b, this.f4594c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f4593b, e10);
            }
        }
        m2479a();
        this.f4604m = true;
        return this.f4605n;
    }

    /* JADX INFO: renamed from: c */
    public final void m2481c(Context context, AbstractC7987S3 abstractC7987S3) {
        if (m2482d(context)) {
            m2480b(context);
        } else {
            m2479a();
        }
        int i10 = this.f4603l;
        if (i10 == 0) {
            this.f4604m = true;
        }
        if (this.f4604m) {
            abstractC7987S3.mo2476f(this.f4605n, true);
            return;
        }
        try {
            C1620b c1620b = new C1620b(this, abstractC7987S3);
            ThreadLocal threadLocal = AbstractC18619k.f59299a;
            if (context.isRestricted()) {
                c1620b.m19969a(-4);
            } else {
                AbstractC18619k.m19976c(context, i10, new TypedValue(), 0, c1620b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f4604m = true;
            abstractC7987S3.mo2475e(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f4593b, e10);
            this.f4604m = true;
            abstractC7987S3.mo2475e(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2482d(Context context) {
        Typeface typefaceM19976c = null;
        int i10 = this.f4603l;
        if (i10 != 0) {
            ThreadLocal threadLocal = AbstractC18619k.f59299a;
            if (!context.isRestricted()) {
                typefaceM19976c = AbstractC18619k.m19976c(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM19976c != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m2483e(Context context, TextPaint textPaint, AbstractC7987S3 abstractC7987S3) {
        m2484f(context, textPaint, abstractC7987S3);
        ColorStateList colorStateList = this.f4601j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f4592a;
        textPaint.setShadowLayer(this.f4598g, this.f4596e, this.f4597f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m2484f(Context context, TextPaint textPaint, AbstractC7987S3 abstractC7987S3) {
        if (m2482d(context)) {
            m2485g(context, textPaint, m2480b(context));
            return;
        }
        m2479a();
        m2485g(context, textPaint, this.f4605n);
        m2481c(context, new C1621c(this, context, textPaint, abstractC7987S3));
    }

    /* JADX INFO: renamed from: g */
    public final void m2485g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM8300f = AbstractC7995T3.m8300f(context.getResources().getConfiguration(), typeface);
        if (typefaceM8300f != null) {
            typeface = typefaceM8300f;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f4594c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4602k);
        if (this.f4599h) {
            textPaint.setLetterSpacing(this.f4600i);
        }
    }
}
