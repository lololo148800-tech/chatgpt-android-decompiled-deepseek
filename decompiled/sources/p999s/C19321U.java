package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import mo.C17342i;
import p030B2.AbstractC0718B;
import p030B2.AbstractC0738T;
import p108E2.InterfaceC2259r;
import p523V9.AbstractC8166p4;
import p658b5.C11242m;
import p880m.AbstractC17123a;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: s.U */
/* JADX INFO: loaded from: classes.dex */
public final class C19321U {

    /* JADX INFO: renamed from: a */
    public final TextView f61195a;

    /* JADX INFO: renamed from: b */
    public C17342i f61196b;

    /* JADX INFO: renamed from: c */
    public C17342i f61197c;

    /* JADX INFO: renamed from: d */
    public C17342i f61198d;

    /* JADX INFO: renamed from: e */
    public C17342i f61199e;

    /* JADX INFO: renamed from: f */
    public C17342i f61200f;

    /* JADX INFO: renamed from: g */
    public C17342i f61201g;

    /* JADX INFO: renamed from: h */
    public C17342i f61202h;

    /* JADX INFO: renamed from: i */
    public final C19343d0 f61203i;

    /* JADX INFO: renamed from: j */
    public int f61204j = 0;

    /* JADX INFO: renamed from: k */
    public int f61205k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f61206l;

    /* JADX INFO: renamed from: m */
    public boolean f61207m;

    public C19321U(TextView textView) {
        this.f61195a = textView;
        this.f61203i = new C19343d0(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C17342i m20411c(Context context, C19372q c19372q, int i10) {
        ColorStateList colorStateListM20386i;
        synchronized (c19372q) {
            colorStateListM20386i = c19372q.f61354a.m20386i(context, i10);
        }
        if (colorStateListM20386i == null) {
            return null;
        }
        C17342i c17342i = new C17342i();
        c17342i.f55253b = true;
        c17342i.f55254c = colorStateListM20386i;
        return c17342i;
    }

    /* JADX INFO: renamed from: a */
    public final void m20412a(Drawable drawable, C17342i c17342i) {
        if (drawable == null || c17342i == null) {
            return;
        }
        C19372q.m20476e(drawable, c17342i, this.f61195a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m20413b() {
        C17342i c17342i = this.f61196b;
        TextView textView = this.f61195a;
        if (c17342i != null || this.f61197c != null || this.f61198d != null || this.f61199e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m20412a(compoundDrawables[0], this.f61196b);
            m20412a(compoundDrawables[1], this.f61197c);
            m20412a(compoundDrawables[2], this.f61198d);
            m20412a(compoundDrawables[3], this.f61199e);
        }
        if (this.f61200f == null && this.f61201g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m20412a(compoundDrawablesRelative[0], this.f61200f);
        m20412a(compoundDrawablesRelative[2], this.f61201g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m20414d() {
        C17342i c17342i = this.f61202h;
        if (c17342i != null) {
            return (ColorStateList) c17342i.f55254c;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m20415e() {
        C17342i c17342i = this.f61202h;
        if (c17342i != null) {
            return (PorterDuff.Mode) c17342i.f55255d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m20416f(AttributeSet attributeSet, int i10) {
        boolean z6;
        boolean z10;
        String string;
        String string2;
        boolean z11;
        int i11;
        int i12;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        int i14;
        TextView textView = this.f61195a;
        Context context = textView.getContext();
        C19372q c19372qM20473a = C19372q.m20473a();
        int[] iArr = AbstractC17123a.f54739h;
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, iArr, i10);
        AbstractC0738T.m1583k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, i10);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f61196b = m20411c(context, c19372qM20473a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f61197c = m20411c(context, c19372qM20473a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f61198d = m20411c(context, c19372qM20473a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f61199e = m20411c(context, c19372qM20473a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f61200f = m20411c(context, c19372qM20473a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f61201g = m20411c(context, c19372qM20473a, typedArray.getResourceId(6, 0));
        }
        c11242mM12599G.m12606H();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC17123a.f54753v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C11242m c11242m = new C11242m(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z6 = false;
                z10 = false;
            } else {
                z6 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            m20423m(context, c11242m);
            int i15 = Build.VERSION.SDK_INT;
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i14 = 26;
            } else {
                i14 = 26;
                string2 = null;
            }
            string = (i15 < i14 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c11242m.m12606H();
        } else {
            z6 = false;
            z10 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        C11242m c11242m2 = new C11242m(context, typedArrayObtainStyledAttributes2);
        if (z12 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = z6;
        } else {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        int i16 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i16 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i16 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m20423m(context, c11242m2);
        c11242m2.m12606H();
        if (!z12 && z10) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f61206l;
        if (typeface != null) {
            if (this.f61205k == -1) {
                textView.setTypeface(typeface, this.f61204j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC19317S.m20405d(textView, string);
        }
        if (str != null) {
            if (i16 >= 24) {
                AbstractC19314Q.m20401b(textView, AbstractC19314Q.m20400a(str));
            } else {
                textView.setTextLocale(AbstractC19312P.m20398a(str.split(Separators.COMMA)[0]));
            }
        }
        int[] iArr3 = AbstractC17123a.f54740i;
        C19343d0 c19343d0 = this.f61203i;
        Context context2 = c19343d0.f61272j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c19343d0.f61271i;
        AbstractC0738T.m1583k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c19343d0.f61263a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = typedArrayObtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                c19343d0.f61268f = C19343d0.m20446b(iArr4);
                c19343d0.m20454i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c19343d0.m20455j()) {
            c19343d0.f61263a = 0;
        } else if (c19343d0.f61263a == 1) {
            if (!c19343d0.f61269g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c19343d0.m20456k(dimension2, dimension3, dimension);
            }
            c19343d0.m20453h();
        }
        if (AbstractC19353g1.f61285c && c19343d0.f61263a != 0) {
            int[] iArr5 = c19343d0.f61268f;
            if (iArr5.length > 0) {
                if (AbstractC19317S.m20402a(textView) != -1.0f) {
                    AbstractC19317S.m20403b(textView, Math.round(c19343d0.f61266d), Math.round(c19343d0.f61267e), Math.round(c19343d0.f61265c), 0);
                } else {
                    AbstractC19317S.m20404c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM20477b = resourceId4 != -1 ? c19372qM20473a.m20477b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM20477b2 = resourceId5 != -1 ? c19372qM20473a.m20477b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM20477b3 = resourceId6 != -1 ? c19372qM20473a.m20477b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM20477b4 = resourceId7 != -1 ? c19372qM20473a.m20477b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM20477b5 = resourceId8 != -1 ? c19372qM20473a.m20477b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM20477b6 = resourceId9 != -1 ? c19372qM20473a.m20477b(context, resourceId9) : null;
        if (drawableM20477b5 != null || drawableM20477b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM20477b5 == null) {
                drawableM20477b5 = compoundDrawablesRelative[0];
            }
            if (drawableM20477b2 == null) {
                drawableM20477b2 = compoundDrawablesRelative[1];
            }
            if (drawableM20477b6 == null) {
                drawableM20477b6 = compoundDrawablesRelative[2];
            }
            if (drawableM20477b4 == null) {
                drawableM20477b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM20477b5, drawableM20477b2, drawableM20477b6, drawableM20477b4);
        } else if (drawableM20477b != null || drawableM20477b2 != null || drawableM20477b3 != null || drawableM20477b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM20477b == null) {
                    drawableM20477b = compoundDrawables[0];
                }
                if (drawableM20477b2 == null) {
                    drawableM20477b2 = compoundDrawables[1];
                }
                if (drawableM20477b3 == null) {
                    drawableM20477b3 = compoundDrawables[2];
                }
                if (drawableM20477b4 == null) {
                    drawableM20477b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM20477b, drawableM20477b2, drawableM20477b3, drawableM20477b4);
            } else {
                if (drawableM20477b2 == null) {
                    drawableM20477b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM20477b4 == null) {
                    drawableM20477b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM20477b2, compoundDrawablesRelative2[2], drawableM20477b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC17803d.m19556c(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof InterfaceC2259r) {
                ((InterfaceC2259r) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeM20463b = AbstractC19357i0.m20463b(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(modeM20463b);
            } else if (textView instanceof InterfaceC2259r) {
                ((InterfaceC2259r) textView).setSupportCompoundDrawablesTintMode(modeM20463b);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i12 = -1;
            } else {
                int i18 = typedValuePeekValue.data;
                int i19 = i18 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i18);
                i12 = i19;
                i11 = -1;
            }
        } else {
            i11 = -1;
            i12 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            AbstractC8166p4.m8736d(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            AbstractC8166p4.m8737e(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == i11) {
                AbstractC8166p4.m8738f(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0718B.m1501l(textView, i12, dimensionPixelSize);
            } else {
                AbstractC8166p4.m8738f(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20417g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC17123a.f54753v);
        C11242m c11242m = new C11242m(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f61195a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m20423m(context, c11242m);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC19317S.m20405d(textView, string);
        }
        c11242m.m12606H();
        Typeface typeface = this.f61206l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f61204j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20418h(int i10, int i11, int i12, int i13) {
        C19343d0 c19343d0 = this.f61203i;
        if (c19343d0.m20455j()) {
            DisplayMetrics displayMetrics = c19343d0.f61272j.getResources().getDisplayMetrics();
            c19343d0.m20456k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c19343d0.m20453h()) {
                c19343d0.m20449a();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20419i(int[] iArr, int i10) {
        C19343d0 c19343d0 = this.f61203i;
        if (c19343d0.m20455j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c19343d0.f61272j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c19343d0.f61268f = C19343d0.m20446b(iArrCopyOf);
                if (!c19343d0.m20454i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c19343d0.f61269g = false;
            }
            if (c19343d0.m20453h()) {
                c19343d0.m20449a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m20420j(int i10) {
        C19343d0 c19343d0 = this.f61203i;
        if (c19343d0.m20455j()) {
            if (i10 == 0) {
                c19343d0.f61263a = 0;
                c19343d0.f61266d = -1.0f;
                c19343d0.f61267e = -1.0f;
                c19343d0.f61265c = -1.0f;
                c19343d0.f61268f = new int[0];
                c19343d0.f61264b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c19343d0.f61272j.getResources().getDisplayMetrics();
            c19343d0.m20456k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c19343d0.m20453h()) {
                c19343d0.m20449a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m20421k(ColorStateList colorStateList) {
        if (this.f61202h == null) {
            this.f61202h = new C17342i();
        }
        C17342i c17342i = this.f61202h;
        c17342i.f55254c = colorStateList;
        c17342i.f55253b = colorStateList != null;
        this.f61196b = c17342i;
        this.f61197c = c17342i;
        this.f61198d = c17342i;
        this.f61199e = c17342i;
        this.f61200f = c17342i;
        this.f61201g = c17342i;
    }

    /* JADX INFO: renamed from: l */
    public final void m20422l(PorterDuff.Mode mode) {
        if (this.f61202h == null) {
            this.f61202h = new C17342i();
        }
        C17342i c17342i = this.f61202h;
        c17342i.f55255d = mode;
        c17342i.f55252a = mode != null;
        this.f61196b = c17342i;
        this.f61197c = c17342i;
        this.f61198d = c17342i;
        this.f61199e = c17342i;
        this.f61200f = c17342i;
        this.f61201g = c17342i;
    }

    /* JADX INFO: renamed from: m */
    public final void m20423m(Context context, C11242m c11242m) {
        String string;
        int i10 = this.f61204j;
        TypedArray typedArray = (TypedArray) c11242m.f34019Z;
        this.f61204j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f61205k = i12;
            if (i12 != -1) {
                this.f61204j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f61207m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f61206l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f61206l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f61206l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f61206l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f61205k;
        int i16 = this.f61204j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM12603D = c11242m.m12603D(i14, this.f61204j, new C19310O(this, i15, i16, new WeakReference(this.f61195a)));
                if (typefaceM12603D != null) {
                    if (i11 < 28 || this.f61205k == -1) {
                        this.f61206l = typefaceM12603D;
                    } else {
                        this.f61206l = AbstractC19319T.m20410a(Typeface.create(typefaceM12603D, 0), this.f61205k, (this.f61204j & 2) != 0);
                    }
                }
                this.f61207m = this.f61206l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f61206l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f61205k == -1) {
            this.f61206l = Typeface.create(string, this.f61204j);
        } else {
            this.f61206l = AbstractC19319T.m20410a(Typeface.create(string, 0), this.f61205k, (this.f61204j & 2) != 0);
        }
    }
}
