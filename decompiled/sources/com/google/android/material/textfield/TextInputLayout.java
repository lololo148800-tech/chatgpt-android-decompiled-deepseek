package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p001A.C0095w0;
import p030B2.AbstractC0732M;
import p030B2.AbstractC0738T;
import p064Ca.C1619a;
import p064Ca.C1622d;
import p084D4.C1952z;
import p1141z2.AbstractC21727f;
import p1141z2.C21723b;
import p117Eb.C2385o;
import p140Fa.C2681a;
import p140Fa.C2685e;
import p140Fa.C2686f;
import p140Fa.C2687g;
import p140Fa.C2689i;
import p140Fa.C2690j;
import p140Fa.C2691k;
import p140Fa.InterfaceC2683c;
import p239Ja.C4295A;
import p239Ja.C4297C;
import p239Ja.C4303f;
import p239Ja.C4304g;
import p239Ja.C4309l;
import p239Ja.C4311n;
import p239Ja.C4313p;
import p239Ja.C4316s;
import p239Ja.C4317t;
import p239Ja.C4321x;
import p239Ja.C4322y;
import p239Ja.InterfaceC4296B;
import p239Ja.RunnableC4323z;
import p287La.AbstractC4967a;
import p330N4.AbstractC5636B;
import p330N4.C5661l;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8034Z;
import p523V9.AbstractC8070d4;
import p523V9.AbstractC8143m5;
import p523V9.AbstractC8151n5;
import p544W9.AbstractC8473F;
import p544W9.AbstractC8479G;
import p571X9.AbstractC9106B3;
import p594Y9.C9895g4;
import p658b5.C11242m;
import p783ha.AbstractC14431a;
import p806ia.AbstractC14951a;
import p913o2.AbstractC17803d;
import p979r2.AbstractC18861b;
import p999s.AbstractC19357i0;
import p999s.C19329Y;
import p999s.C19372q;
import za.AbstractC21820c;
import za.AbstractC21828k;
import za.C21819b;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: J1 */
    public static final int[][] f36712J1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A0 */
    public boolean f36713A0;

    /* JADX INFO: renamed from: A1 */
    public int f36714A1;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC4296B f36715B0;

    /* JADX INFO: renamed from: B1 */
    public int f36716B1;

    /* JADX INFO: renamed from: C0 */
    public C19329Y f36717C0;

    /* JADX INFO: renamed from: C1 */
    public boolean f36718C1;

    /* JADX INFO: renamed from: D0 */
    public int f36719D0;

    /* JADX INFO: renamed from: D1 */
    public final C21819b f36720D1;

    /* JADX INFO: renamed from: E0 */
    public int f36721E0;

    /* JADX INFO: renamed from: E1 */
    public boolean f36722E1;

    /* JADX INFO: renamed from: F0 */
    public CharSequence f36723F0;

    /* JADX INFO: renamed from: F1 */
    public boolean f36724F1;

    /* JADX INFO: renamed from: G0 */
    public boolean f36725G0;

    /* JADX INFO: renamed from: G1 */
    public ValueAnimator f36726G1;

    /* JADX INFO: renamed from: H0 */
    public C19329Y f36727H0;

    /* JADX INFO: renamed from: H1 */
    public boolean f36728H1;

    /* JADX INFO: renamed from: I0 */
    public ColorStateList f36729I0;

    /* JADX INFO: renamed from: I1 */
    public boolean f36730I1;

    /* JADX INFO: renamed from: J0 */
    public int f36731J0;

    /* JADX INFO: renamed from: K0 */
    public C5661l f36732K0;

    /* JADX INFO: renamed from: L0 */
    public C5661l f36733L0;

    /* JADX INFO: renamed from: M0 */
    public ColorStateList f36734M0;

    /* JADX INFO: renamed from: N0 */
    public ColorStateList f36735N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f36736O0;

    /* JADX INFO: renamed from: P0 */
    public CharSequence f36737P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f36738Q0;

    /* JADX INFO: renamed from: R0 */
    public C2687g f36739R0;

    /* JADX INFO: renamed from: S0 */
    public C2687g f36740S0;

    /* JADX INFO: renamed from: T0 */
    public StateListDrawable f36741T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f36742U0;

    /* JADX INFO: renamed from: V0 */
    public C2687g f36743V0;

    /* JADX INFO: renamed from: W0 */
    public C2687g f36744W0;

    /* JADX INFO: renamed from: X0 */
    public C2691k f36745X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f36746Y0;

    /* JADX INFO: renamed from: Z0 */
    public final int f36747Z0;

    /* JADX INFO: renamed from: a1 */
    public int f36748a1;

    /* JADX INFO: renamed from: b1 */
    public int f36749b1;

    /* JADX INFO: renamed from: c1 */
    public int f36750c1;

    /* JADX INFO: renamed from: d1 */
    public int f36751d1;

    /* JADX INFO: renamed from: e1 */
    public int f36752e1;

    /* JADX INFO: renamed from: f1 */
    public int f36753f1;

    /* JADX INFO: renamed from: g1 */
    public int f36754g1;

    /* JADX INFO: renamed from: h1 */
    public final Rect f36755h1;

    /* JADX INFO: renamed from: i1 */
    public final Rect f36756i1;

    /* JADX INFO: renamed from: j1 */
    public final RectF f36757j1;

    /* JADX INFO: renamed from: k1 */
    public Typeface f36758k1;

    /* JADX INFO: renamed from: l1 */
    public ColorDrawable f36759l1;

    /* JADX INFO: renamed from: m1 */
    public int f36760m1;

    /* JADX INFO: renamed from: n1 */
    public final LinkedHashSet f36761n1;

    /* JADX INFO: renamed from: o0 */
    public final FrameLayout f36762o0;

    /* JADX INFO: renamed from: o1 */
    public ColorDrawable f36763o1;

    /* JADX INFO: renamed from: p0 */
    public final C4321x f36764p0;

    /* JADX INFO: renamed from: p1 */
    public int f36765p1;

    /* JADX INFO: renamed from: q0 */
    public final C4313p f36766q0;

    /* JADX INFO: renamed from: q1 */
    public Drawable f36767q1;

    /* JADX INFO: renamed from: r0 */
    public EditText f36768r0;

    /* JADX INFO: renamed from: r1 */
    public ColorStateList f36769r1;

    /* JADX INFO: renamed from: s0 */
    public CharSequence f36770s0;

    /* JADX INFO: renamed from: s1 */
    public ColorStateList f36771s1;

    /* JADX INFO: renamed from: t0 */
    public int f36772t0;

    /* JADX INFO: renamed from: t1 */
    public int f36773t1;

    /* JADX INFO: renamed from: u0 */
    public int f36774u0;

    /* JADX INFO: renamed from: u1 */
    public int f36775u1;

    /* JADX INFO: renamed from: v0 */
    public int f36776v0;

    /* JADX INFO: renamed from: v1 */
    public int f36777v1;

    /* JADX INFO: renamed from: w0 */
    public int f36778w0;

    /* JADX INFO: renamed from: w1 */
    public ColorStateList f36779w1;

    /* JADX INFO: renamed from: x0 */
    public final C4317t f36780x0;

    /* JADX INFO: renamed from: x1 */
    public int f36781x1;

    /* JADX INFO: renamed from: y0 */
    public boolean f36782y0;

    /* JADX INFO: renamed from: y1 */
    public int f36783y1;

    /* JADX INFO: renamed from: z0 */
    public int f36784z0;

    /* JADX INFO: renamed from: z1 */
    public int f36785z1;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, com.openai.chatgpt.R.attr.textInputStyle, com.openai.chatgpt.R.style.Widget_Design_TextInputLayout), attributeSet, com.openai.chatgpt.R.attr.textInputStyle);
        this.f36772t0 = -1;
        this.f36774u0 = -1;
        this.f36776v0 = -1;
        this.f36778w0 = -1;
        this.f36780x0 = new C4317t(this);
        this.f36715B0 = new C2385o(12);
        this.f36755h1 = new Rect();
        this.f36756i1 = new Rect();
        this.f36757j1 = new RectF();
        this.f36761n1 = new LinkedHashSet();
        C21819b c21819b = new C21819b(this);
        this.f36720D1 = c21819b;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f36762o0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC14951a.f46571a;
        c21819b.f69208Q = linearInterpolator;
        c21819b.m22298h(false);
        c21819b.f69207P = linearInterpolator;
        c21819b.m22298h(false);
        if (c21819b.f69230g != 8388659) {
            c21819b.f69230g = 8388659;
            c21819b.m22298h(false);
        }
        int[] iArr = AbstractC14431a.f45366G;
        AbstractC21828k.m22306a(context2, attributeSet, com.openai.chatgpt.R.attr.textInputStyle, com.openai.chatgpt.R.style.Widget_Design_TextInputLayout);
        AbstractC21828k.m22307b(context2, attributeSet, iArr, com.openai.chatgpt.R.attr.textInputStyle, com.openai.chatgpt.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.openai.chatgpt.R.attr.textInputStyle, com.openai.chatgpt.R.style.Widget_Design_TextInputLayout);
        C11242m c11242m = new C11242m(context2, typedArrayObtainStyledAttributes);
        C4321x c4321x = new C4321x(this, c11242m);
        this.f36764p0 = c4321x;
        this.f36736O0 = typedArrayObtainStyledAttributes.getBoolean(46, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f36724F1 = typedArrayObtainStyledAttributes.getBoolean(45, true);
        this.f36722E1 = typedArrayObtainStyledAttributes.getBoolean(40, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f36745X0 = C2691k.m3691b(context2, attributeSet, com.openai.chatgpt.R.attr.textInputStyle, com.openai.chatgpt.R.style.Widget_Design_TextInputLayout).m3689a();
        this.f36747Z0 = context2.getResources().getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f36749b1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f36751d1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f36752e1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f36750c1 = this.f36751d1;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C2690j c2690jM3694e = this.f36745X0.m3694e();
        if (dimension >= 0.0f) {
            c2690jM3694e.f8265e = new C2681a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c2690jM3694e.f8266f = new C2681a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c2690jM3694e.f8267g = new C2681a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c2690jM3694e.f8268h = new C2681a(dimension4);
        }
        this.f36745X0 = c2690jM3694e.m3689a();
        ColorStateList colorStateListM8280d = AbstractC7979R3.m8280d(context2, c11242m, 7);
        if (colorStateListM8280d != null) {
            int defaultColor = colorStateListM8280d.getDefaultColor();
            this.f36781x1 = defaultColor;
            this.f36754g1 = defaultColor;
            if (colorStateListM8280d.isStateful()) {
                this.f36783y1 = colorStateListM8280d.getColorForState(new int[]{-16842910}, -1);
                this.f36785z1 = colorStateListM8280d.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f36714A1 = colorStateListM8280d.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f36785z1 = this.f36781x1;
                ColorStateList colorStateListM19556c = AbstractC17803d.m19556c(context2, com.openai.chatgpt.R.color.mtrl_filled_background_color);
                this.f36783y1 = colorStateListM19556c.getColorForState(new int[]{-16842910}, -1);
                this.f36714A1 = colorStateListM19556c.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f36754g1 = 0;
            this.f36781x1 = 0;
            this.f36783y1 = 0;
            this.f36785z1 = 0;
            this.f36714A1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM12600A = c11242m.m12600A(1);
            this.f36771s1 = colorStateListM12600A;
            this.f36769r1 = colorStateListM12600A;
        }
        ColorStateList colorStateListM8280d2 = AbstractC7979R3.m8280d(context2, c11242m, 14);
        this.f36777v1 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f36773t1 = context2.getColor(com.openai.chatgpt.R.color.mtrl_textinput_default_box_stroke_color);
        this.f36716B1 = context2.getColor(com.openai.chatgpt.R.color.mtrl_textinput_disabled_color);
        this.f36775u1 = context2.getColor(com.openai.chatgpt.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM8280d2 != null) {
            setBoxStrokeColorStateList(colorStateListM8280d2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC7979R3.m8280d(context2, c11242m, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(47, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(47, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(38, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(33);
        int i10 = typedArrayObtainStyledAttributes.getInt(32, 1);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(34, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(43, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(42, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(41);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(55, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(54);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f36721E0 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f36719D0 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.f36719D0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f36721E0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(39)) {
            setErrorTextColor(c11242m.m12600A(39));
        }
        if (typedArrayObtainStyledAttributes.hasValue(44)) {
            setHelperTextColor(c11242m.m12600A(44));
        }
        if (typedArrayObtainStyledAttributes.hasValue(48)) {
            setHintTextColor(c11242m.m12600A(48));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c11242m.m12600A(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c11242m.m12600A(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(56)) {
            setPlaceholderTextColor(c11242m.m12600A(56));
        }
        C4313p c4313p = new C4313p(this, c11242m);
        this.f36766q0 = c4313p;
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c11242m.m12606H();
        setImportantForAccessibility(2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i11 >= 26) {
            AbstractC0732M.m1560b(this, 1);
        }
        frameLayout.addView(c4321x);
        frameLayout.addView(c4313p);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z6);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f36768r0;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC8473F.m9107b(editText)) {
            return this.f36739R0;
        }
        int iM8478e = AbstractC8070d4.m8478e(this.f36768r0, com.openai.chatgpt.R.attr.colorControlHighlight);
        int i10 = this.f36748a1;
        int[][] iArr = f36712J1;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            C2687g c2687g = this.f36739R0;
            int i11 = this.f36754g1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC8070d4.m8480g(0.1f, iM8478e, i11), i11}), c2687g, c2687g);
        }
        Context context = getContext();
        C2687g c2687g2 = this.f36739R0;
        TypedValue typedValueM8265f = AbstractC7972Q3.m8265f(com.openai.chatgpt.R.attr.colorSurface, context, "TextInputLayout");
        int i12 = typedValueM8265f.resourceId;
        int color = i12 != 0 ? context.getColor(i12) : typedValueM8265f.data;
        C2687g c2687g3 = new C2687g(c2687g2.f8246Y.f8220a);
        int iM8480g = AbstractC8070d4.m8480g(0.1f, iM8478e, color);
        c2687g3.m3682l(new ColorStateList(iArr, new int[]{iM8480g, 0}));
        c2687g3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM8480g, color});
        C2687g c2687g4 = new C2687g(c2687g2.f8246Y.f8220a);
        c2687g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2687g3, c2687g4), c2687g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f36741T0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f36741T0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f36741T0.addState(new int[0], m13661f(false));
        }
        return this.f36741T0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f36740S0 == null) {
            this.f36740S0 = m13661f(true);
        }
        return this.f36740S0;
    }

    /* JADX INFO: renamed from: k */
    public static void m13655k(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                m13655k((ViewGroup) childAt, z6);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f36768r0 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f36768r0 = editText;
        int i10 = this.f36772t0;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f36776v0);
        }
        int i11 = this.f36774u0;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f36778w0);
        }
        this.f36742U0 = false;
        m13664i();
        setTextInputAccessibilityDelegate(new C4295A(this));
        Typeface typeface = this.f36768r0.getTypeface();
        C21819b c21819b = this.f36720D1;
        c21819b.m22303m(typeface);
        float textSize = this.f36768r0.getTextSize();
        if (c21819b.f69231h != textSize) {
            c21819b.f69231h = textSize;
            c21819b.m22298h(false);
        }
        float letterSpacing = this.f36768r0.getLetterSpacing();
        if (c21819b.f69214W != letterSpacing) {
            c21819b.f69214W = letterSpacing;
            c21819b.m22298h(false);
        }
        int gravity = this.f36768r0.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (c21819b.f69230g != i12) {
            c21819b.f69230g = i12;
            c21819b.m22298h(false);
        }
        if (c21819b.f69228f != gravity) {
            c21819b.f69228f = gravity;
            c21819b.m22298h(false);
        }
        this.f36768r0.addTextChangedListener(new C4322y(this, 0));
        if (this.f36769r1 == null) {
            this.f36769r1 = this.f36768r0.getHintTextColors();
        }
        if (this.f36736O0) {
            if (TextUtils.isEmpty(this.f36737P0)) {
                CharSequence hint = this.f36768r0.getHint();
                this.f36770s0 = hint;
                setHint(hint);
                this.f36768r0.setHint((CharSequence) null);
            }
            this.f36738Q0 = true;
        }
        if (this.f36717C0 != null) {
            m13669o(this.f36768r0.getText());
        }
        m13672r();
        this.f36780x0.m5124b();
        this.f36764p0.bringToFront();
        C4313p c4313p = this.f36766q0;
        c4313p.bringToFront();
        Iterator it = this.f36761n1.iterator();
        while (it.hasNext()) {
            ((C4311n) it.next()).m5067a(this);
        }
        c4313p.m5118l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m13675u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f36737P0)) {
            return;
        }
        this.f36737P0 = charSequence;
        C21819b c21819b = this.f36720D1;
        if (charSequence == null || !TextUtils.equals(c21819b.f69192A, charSequence)) {
            c21819b.f69192A = charSequence;
            c21819b.f69193B = null;
            Bitmap bitmap = c21819b.f69196E;
            if (bitmap != null) {
                bitmap.recycle();
                c21819b.f69196E = null;
            }
            c21819b.m22298h(false);
        }
        if (this.f36718C1) {
            return;
        }
        m13665j();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f36725G0 == z6) {
            return;
        }
        if (z6) {
            C19329Y c19329y = this.f36727H0;
            if (c19329y != null) {
                this.f36762o0.addView(c19329y);
                this.f36727H0.setVisibility(0);
            }
        } else {
            C19329Y c19329y2 = this.f36727H0;
            if (c19329y2 != null) {
                c19329y2.setVisibility(8);
            }
            this.f36727H0 = null;
        }
        this.f36725G0 = z6;
    }

    /* JADX INFO: renamed from: a */
    public final void m13656a(float f10) {
        int i10 = 1;
        C21819b c21819b = this.f36720D1;
        if (c21819b.f69220b == f10) {
            return;
        }
        if (this.f36726G1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36726G1 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC8034Z.m8390e(getContext(), com.openai.chatgpt.R.attr.motionEasingEmphasizedInterpolator, AbstractC14951a.f46572b));
            this.f36726G1.setDuration(AbstractC8034Z.m8389d(getContext(), com.openai.chatgpt.R.attr.motionDurationMedium4, 167));
            this.f36726G1.addUpdateListener(new C1952z(this, i10));
        }
        this.f36726G1.setFloatValues(c21819b.f69220b, f10);
        this.f36726G1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f36762o0;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m13674t();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m13657b() {
        int i10;
        int i11;
        C2687g c2687g = this.f36739R0;
        if (c2687g == null) {
            return;
        }
        C2691k c2691k = c2687g.f8246Y.f8220a;
        C2691k c2691k2 = this.f36745X0;
        if (c2691k != c2691k2) {
            c2687g.setShapeAppearanceModel(c2691k2);
        }
        if (this.f36748a1 == 2 && (i10 = this.f36750c1) > -1 && (i11 = this.f36753f1) != 0) {
            C2687g c2687g2 = this.f36739R0;
            c2687g2.f8246Y.f8229j = i10;
            c2687g2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            C2686f c2686f = c2687g2.f8246Y;
            if (c2686f.f8223d != colorStateListValueOf) {
                c2686f.f8223d = colorStateListValueOf;
                c2687g2.onStateChange(c2687g2.getState());
            }
        }
        int iM20167e = this.f36754g1;
        if (this.f36748a1 == 1) {
            iM20167e = AbstractC18861b.m20167e(this.f36754g1, AbstractC8070d4.m8477d(getContext(), com.openai.chatgpt.R.attr.colorSurface, 0));
        }
        this.f36754g1 = iM20167e;
        this.f36739R0.m3682l(ColorStateList.valueOf(iM20167e));
        C2687g c2687g3 = this.f36743V0;
        if (c2687g3 != null && this.f36744W0 != null) {
            if (this.f36750c1 > -1 && this.f36753f1 != 0) {
                c2687g3.m3682l(this.f36768r0.isFocused() ? ColorStateList.valueOf(this.f36773t1) : ColorStateList.valueOf(this.f36753f1));
                this.f36744W0.m3682l(ColorStateList.valueOf(this.f36753f1));
            }
            invalidate();
        }
        m13673s();
    }

    /* JADX INFO: renamed from: c */
    public final int m13658c() {
        float fM22295d;
        if (!this.f36736O0) {
            return 0;
        }
        int i10 = this.f36748a1;
        C21819b c21819b = this.f36720D1;
        if (i10 == 0) {
            fM22295d = c21819b.m22295d();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fM22295d = c21819b.m22295d() / 2.0f;
        }
        return (int) fM22295d;
    }

    /* JADX INFO: renamed from: d */
    public final C5661l m13659d() {
        C5661l c5661l = new C5661l();
        c5661l.f18416o0 = AbstractC8034Z.m8389d(getContext(), com.openai.chatgpt.R.attr.motionDurationShort2, 87);
        c5661l.f18417p0 = AbstractC8034Z.m8390e(getContext(), com.openai.chatgpt.R.attr.motionEasingLinearInterpolator, AbstractC14951a.f46571a);
        return c5661l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f36768r0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f36770s0 != null) {
            boolean z6 = this.f36738Q0;
            this.f36738Q0 = false;
            CharSequence hint = editText.getHint();
            this.f36768r0.setHint(this.f36770s0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f36768r0.setHint(hint);
                this.f36738Q0 = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f36762o0;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f36768r0) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f36730I1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f36730I1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2687g c2687g;
        int i10;
        super.draw(canvas);
        boolean z6 = this.f36736O0;
        C21819b c21819b = this.f36720D1;
        if (z6) {
            c21819b.getClass();
            int iSave = canvas.save();
            if (c21819b.f69193B != null) {
                RectF rectF = c21819b.f69226e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c21819b.f69205N;
                    textPaint.setTextSize(c21819b.f69198G);
                    float f10 = c21819b.f69239p;
                    float f11 = c21819b.f69240q;
                    float f12 = c21819b.f69197F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    if (c21819b.f69225d0 <= 1 || c21819b.f69194C) {
                        canvas.translate(f10, f11);
                        c21819b.f69216Y.draw(canvas);
                    } else {
                        float lineStart = c21819b.f69239p - c21819b.f69216Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (c21819b.f69221b0 * f13));
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            textPaint.setShadowLayer(c21819b.f69199H, c21819b.f69200I, c21819b.f69201J, AbstractC8070d4.m8476c(c21819b.f69202K, textPaint.getAlpha()));
                        }
                        c21819b.f69216Y.draw(canvas);
                        textPaint.setAlpha((int) (c21819b.f69219a0 * f13));
                        if (i11 >= 31) {
                            textPaint.setShadowLayer(c21819b.f69199H, c21819b.f69200I, c21819b.f69201J, AbstractC8070d4.m8476c(c21819b.f69202K, textPaint.getAlpha()));
                        }
                        int lineBaseline = c21819b.f69216Y.getLineBaseline(0);
                        CharSequence charSequence = c21819b.f69223c0;
                        float f14 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                        if (i11 >= 31) {
                            textPaint.setShadowLayer(c21819b.f69199H, c21819b.f69200I, c21819b.f69201J, c21819b.f69202K);
                        }
                        String strTrim = c21819b.f69223c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i10 = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i10 = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c21819b.f69216Y.getLineEnd(i10), str.length()), 0.0f, f14, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f36744W0 == null || (c2687g = this.f36743V0) == null) {
            return;
        }
        c2687g.draw(canvas);
        if (this.f36768r0.isFocused()) {
            Rect bounds = this.f36744W0.getBounds();
            Rect bounds2 = this.f36743V0.getBounds();
            float f15 = c21819b.f69220b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC14951a.m16115c(f15, iCenterX, bounds2.left);
            bounds.right = AbstractC14951a.m16115c(f15, iCenterX, bounds2.right);
            this.f36744W0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z6;
        ColorStateList colorStateList;
        if (this.f36728H1) {
            return;
        }
        this.f36728H1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C21819b c21819b = this.f36720D1;
        if (c21819b != null) {
            c21819b.f69203L = drawableState;
            ColorStateList colorStateList2 = c21819b.f69234k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c21819b.f69233j) == null || !colorStateList.isStateful())) {
                z6 = false;
            } else {
                c21819b.m22298h(false);
                z6 = true;
            }
        } else {
            z6 = false;
        }
        if (this.f36768r0 != null) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            m13675u(isLaidOut() && isEnabled(), false);
        }
        m13672r();
        m13678x();
        if (z6) {
            invalidate();
        }
        this.f36728H1 = false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13660e() {
        return this.f36736O0 && !TextUtils.isEmpty(this.f36737P0) && (this.f36739R0 instanceof C4304g);
    }

    /* JADX INFO: renamed from: f */
    public final C2687g m13661f(boolean z6) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z6 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f36768r0;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.openai.chatgpt.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2689i c2689i = new C2689i();
        C2689i c2689i2 = new C2689i();
        C2689i c2689i3 = new C2689i();
        C2689i c2689i4 = new C2689i();
        C2685e c2685e = new C2685e();
        C2685e c2685e2 = new C2685e();
        C2685e c2685e3 = new C2685e();
        C2685e c2685e4 = new C2685e();
        C2681a c2681a = new C2681a(f10);
        C2681a c2681a2 = new C2681a(f10);
        C2681a c2681a3 = new C2681a(dimensionPixelOffset);
        C2681a c2681a4 = new C2681a(dimensionPixelOffset);
        C2691k c2691k = new C2691k();
        c2691k.f8274a = c2689i;
        c2691k.f8275b = c2689i2;
        c2691k.f8276c = c2689i3;
        c2691k.f8277d = c2689i4;
        c2691k.f8278e = c2681a;
        c2691k.f8279f = c2681a2;
        c2691k.f8280g = c2681a4;
        c2691k.f8281h = c2681a3;
        c2691k.f8282i = c2685e;
        c2691k.f8283j = c2685e2;
        c2691k.f8284k = c2685e3;
        c2691k.f8285l = c2685e4;
        Context context = getContext();
        Paint paint = C2687g.f8237I0;
        TypedValue typedValueM8265f = AbstractC7972Q3.m8265f(com.openai.chatgpt.R.attr.colorSurface, context, C2687g.class.getSimpleName());
        int i10 = typedValueM8265f.resourceId;
        int color = i10 != 0 ? context.getColor(i10) : typedValueM8265f.data;
        C2687g c2687g = new C2687g();
        c2687g.m3679i(context);
        c2687g.m3682l(ColorStateList.valueOf(color));
        c2687g.m3681k(popupElevation);
        c2687g.setShapeAppearanceModel(c2691k);
        C2686f c2686f = c2687g.f8246Y;
        if (c2686f.f8226g == null) {
            c2686f.f8226g = new Rect();
        }
        c2687g.f8246Y.f8226g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c2687g.invalidateSelf();
        return c2687g;
    }

    /* JADX INFO: renamed from: g */
    public final int m13662g(int i10, boolean z6) {
        int compoundPaddingLeft = this.f36768r0.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z6) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f36768r0;
        if (editText == null) {
            return super.getBaseline();
        }
        return m13658c() + getPaddingTop() + editText.getBaseline();
    }

    public C2687g getBoxBackground() {
        int i10 = this.f36748a1;
        if (i10 == 1 || i10 == 2) {
            return this.f36739R0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f36754g1;
    }

    public int getBoxBackgroundMode() {
        return this.f36748a1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f36749b1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM22310e = AbstractC21828k.m22310e(this);
        RectF rectF = this.f36757j1;
        return zM22310e ? this.f36745X0.f8281h.mo3657a(rectF) : this.f36745X0.f8280g.mo3657a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM22310e = AbstractC21828k.m22310e(this);
        RectF rectF = this.f36757j1;
        return zM22310e ? this.f36745X0.f8280g.mo3657a(rectF) : this.f36745X0.f8281h.mo3657a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM22310e = AbstractC21828k.m22310e(this);
        RectF rectF = this.f36757j1;
        return zM22310e ? this.f36745X0.f8278e.mo3657a(rectF) : this.f36745X0.f8279f.mo3657a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM22310e = AbstractC21828k.m22310e(this);
        RectF rectF = this.f36757j1;
        return zM22310e ? this.f36745X0.f8279f.mo3657a(rectF) : this.f36745X0.f8278e.mo3657a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f36777v1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f36779w1;
    }

    public int getBoxStrokeWidth() {
        return this.f36751d1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f36752e1;
    }

    public int getCounterMaxLength() {
        return this.f36784z0;
    }

    public CharSequence getCounterOverflowDescription() {
        C19329Y c19329y;
        if (this.f36782y0 && this.f36713A0 && (c19329y = this.f36717C0) != null) {
            return c19329y.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f36735N0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f36734M0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f36769r1;
    }

    public EditText getEditText() {
        return this.f36768r0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f36766q0.f14036u0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f36766q0.f14036u0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f36766q0.f14020A0;
    }

    public int getEndIconMode() {
        return this.f36766q0.f14038w0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f36766q0.f14021B0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f36766q0.f14036u0;
    }

    public CharSequence getError() {
        C4317t c4317t = this.f36780x0;
        if (c4317t.f14070q) {
            return c4317t.f14069p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f36780x0.f14073t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f36780x0.f14072s;
    }

    public int getErrorCurrentTextColors() {
        C19329Y c19329y = this.f36780x0.f14071r;
        if (c19329y != null) {
            return c19329y.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f36766q0.f14032q0.getDrawable();
    }

    public CharSequence getHelperText() {
        C4317t c4317t = this.f36780x0;
        if (c4317t.f14077x) {
            return c4317t.f14076w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C19329Y c19329y = this.f36780x0.f14078y;
        if (c19329y != null) {
            return c19329y.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f36736O0) {
            return this.f36737P0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f36720D1.m22295d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C21819b c21819b = this.f36720D1;
        return c21819b.m22296e(c21819b.f69234k);
    }

    public ColorStateList getHintTextColor() {
        return this.f36771s1;
    }

    public InterfaceC4296B getLengthCounter() {
        return this.f36715B0;
    }

    public int getMaxEms() {
        return this.f36774u0;
    }

    public int getMaxWidth() {
        return this.f36778w0;
    }

    public int getMinEms() {
        return this.f36772t0;
    }

    public int getMinWidth() {
        return this.f36776v0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f36766q0.f14036u0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f36766q0.f14036u0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f36725G0) {
            return this.f36723F0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f36731J0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f36729I0;
    }

    public CharSequence getPrefixText() {
        return this.f36764p0.f14090q0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f36764p0.f14089p0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f36764p0.f14089p0;
    }

    public C2691k getShapeAppearanceModel() {
        return this.f36745X0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f36764p0.f14091r0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f36764p0.f14091r0.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f36764p0.f14094u0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f36764p0.f14095v0;
    }

    public CharSequence getSuffixText() {
        return this.f36766q0.f14023D0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f36766q0.f14024E0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f36766q0.f14024E0;
    }

    public Typeface getTypeface() {
        return this.f36758k1;
    }

    /* JADX INFO: renamed from: h */
    public final int m13663h(int i10, boolean z6) {
        int compoundPaddingRight = i10 - this.f36768r0.getCompoundPaddingRight();
        return (getPrefixText() == null || !z6) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* JADX INFO: renamed from: i */
    public final void m13664i() {
        int i10 = this.f36748a1;
        if (i10 == 0) {
            this.f36739R0 = null;
            this.f36743V0 = null;
            this.f36744W0 = null;
        } else if (i10 == 1) {
            this.f36739R0 = new C2687g(this.f36745X0);
            this.f36743V0 = new C2687g();
            this.f36744W0 = new C2687g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(AbstractC10763a.m11056n(new StringBuilder(), this.f36748a1, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f36736O0 || (this.f36739R0 instanceof C4304g)) {
                this.f36739R0 = new C2687g(this.f36745X0);
            } else {
                C2691k c2691k = this.f36745X0;
                int i11 = C4304g.f13991K0;
                if (c2691k == null) {
                    c2691k = new C2691k();
                }
                C4303f c4303f = new C4303f(c2691k, new RectF());
                C4304g c4304g = new C4304g(c4303f);
                c4304g.f13992J0 = c4303f;
                this.f36739R0 = c4304g;
            }
            this.f36743V0 = null;
            this.f36744W0 = null;
        }
        m13673s();
        m13678x();
        if (this.f36748a1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f36749b1 = getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC7979R3.m8283g(getContext())) {
                this.f36749b1 = getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f36768r0 != null && this.f36748a1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f36768r0;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f36768r0.getPaddingEnd(), getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC7979R3.m8283g(getContext())) {
                EditText editText2 = this.f36768r0;
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f36768r0.getPaddingEnd(), getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f36748a1 != 0) {
            m13674t();
        }
        EditText editText3 = this.f36768r0;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f36748a1;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX INFO: renamed from: j */
    public final void m13665j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (m13660e()) {
            int width = this.f36768r0.getWidth();
            int gravity = this.f36768r0.getGravity();
            C21819b c21819b = this.f36720D1;
            boolean zM22293b = c21819b.m22293b(c21819b.f69192A);
            c21819b.f69194C = zM22293b;
            Rect rect = c21819b.f69224d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM22293b) {
                        i11 = rect.left;
                        f12 = i11;
                    } else {
                        f10 = rect.right;
                        f11 = c21819b.f69217Z;
                    }
                } else if (zM22293b) {
                    f10 = rect.right;
                    f11 = c21819b.f69217Z;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
                float fMax = Math.max(f12, rect.left);
                rectF = this.f36757j1;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f13 = (width / 2.0f) + (c21819b.f69217Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c21819b.f69194C) {
                        f13 = fMax + c21819b.f69217Z;
                    } else {
                        i10 = rect.right;
                        f13 = i10;
                    }
                } else if (c21819b.f69194C) {
                    i10 = rect.right;
                    f13 = i10;
                } else {
                    f13 = c21819b.f69217Z + fMax;
                }
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = c21819b.m22295d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f14 = rectF.left;
                float f15 = this.f36747Z0;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f36750c1);
                C4304g c4304g = (C4304g) this.f36739R0;
                c4304g.getClass();
                c4304g.m5053r(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f10 = width / 2.0f;
            f11 = c21819b.f69217Z / 2.0f;
            f12 = f10 - f11;
            float fMax2 = Math.max(f12, rect.left);
            rectF = this.f36757j1;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f13 = (width / 2.0f) + (c21819b.f69217Z / 2.0f);
            } else {
                f13 = (width / 2.0f) + (c21819b.f69217Z / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = c21819b.m22295d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13666l(float f10, float f11, float f12, float f13) {
        boolean zM22310e = AbstractC21828k.m22310e(this);
        this.f36746Y0 = zM22310e;
        float f14 = zM22310e ? f11 : f10;
        if (!zM22310e) {
            f10 = f11;
        }
        float f15 = zM22310e ? f13 : f12;
        if (!zM22310e) {
            f12 = f13;
        }
        C2687g c2687g = this.f36739R0;
        if (c2687g != null && c2687g.m3677g() == f14) {
            C2687g c2687g2 = this.f36739R0;
            if (c2687g2.f8246Y.f8220a.f8279f.mo3657a(c2687g2.m3676f()) == f10) {
                C2687g c2687g3 = this.f36739R0;
                if (c2687g3.f8246Y.f8220a.f8281h.mo3657a(c2687g3.m3676f()) == f15) {
                    C2687g c2687g4 = this.f36739R0;
                    if (c2687g4.f8246Y.f8220a.f8280g.mo3657a(c2687g4.m3676f()) == f12) {
                        return;
                    }
                }
            }
        }
        C2690j c2690jM3694e = this.f36745X0.m3694e();
        c2690jM3694e.f8265e = new C2681a(f14);
        c2690jM3694e.f8266f = new C2681a(f10);
        c2690jM3694e.f8268h = new C2681a(f15);
        c2690jM3694e.f8267g = new C2681a(f12);
        this.f36745X0 = c2690jM3694e.m3689a();
        m13657b();
    }

    /* JADX INFO: renamed from: m */
    public final void m13667m(C19329Y c19329y, int i10) {
        try {
            c19329y.setTextAppearance(i10);
            if (c19329y.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c19329y.setTextAppearance(com.openai.chatgpt.R.style.TextAppearance_AppCompat_Caption);
        c19329y.setTextColor(getContext().getColor(com.openai.chatgpt.R.color.design_error));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13668n() {
        C4317t c4317t = this.f36780x0;
        return (c4317t.f14068o != 1 || c4317t.f14071r == null || TextUtils.isEmpty(c4317t.f14069p)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public final void m13669o(Editable editable) {
        ((C2385o) this.f36715B0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z6 = this.f36713A0;
        int i10 = this.f36784z0;
        String string = null;
        if (i10 == -1) {
            this.f36717C0.setText(String.valueOf(length));
            this.f36717C0.setContentDescription(null);
            this.f36713A0 = false;
        } else {
            this.f36713A0 = length > i10;
            Context context = getContext();
            this.f36717C0.setContentDescription(context.getString(this.f36713A0 ? com.openai.chatgpt.R.string.character_counter_overflowed_content_description : com.openai.chatgpt.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f36784z0)));
            if (z6 != this.f36713A0) {
                m13670p();
            }
            String str = C21723b.f68912b;
            C21723b c21723b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C21723b.f68915e : C21723b.f68914d;
            C19329Y c19329y = this.f36717C0;
            String string2 = getContext().getString(com.openai.chatgpt.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f36784z0));
            if (string2 == null) {
                c21723b.getClass();
            } else {
                c21723b.getClass();
                C0095w0 c0095w0 = AbstractC21727f.f68922a;
                string = c21723b.m22234c(string2).toString();
            }
            c19329y.setText(string);
        }
        if (this.f36768r0 == null || z6 == this.f36713A0) {
            return;
        }
        m13675u(false, false);
        m13678x();
        m13672r();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36720D1.m22297g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        EditText editText = this.f36768r0;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC21820c.f69250a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f36755h1;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC21820c.f69250a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC21820c.m22304a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC21820c.f69251b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C2687g c2687g = this.f36743V0;
            if (c2687g != null) {
                int i14 = rect.bottom;
                c2687g.setBounds(rect.left, i14 - this.f36751d1, rect.right, i14);
            }
            C2687g c2687g2 = this.f36744W0;
            if (c2687g2 != null) {
                int i15 = rect.bottom;
                c2687g2.setBounds(rect.left, i15 - this.f36752e1, rect.right, i15);
            }
            if (this.f36736O0) {
                float textSize = this.f36768r0.getTextSize();
                C21819b c21819b = this.f36720D1;
                if (c21819b.f69231h != textSize) {
                    c21819b.f69231h = textSize;
                    c21819b.m22298h(false);
                }
                int gravity = this.f36768r0.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (c21819b.f69230g != i16) {
                    c21819b.f69230g = i16;
                    c21819b.m22298h(false);
                }
                if (c21819b.f69228f != gravity) {
                    c21819b.f69228f = gravity;
                    c21819b.m22298h(false);
                }
                if (this.f36768r0 == null) {
                    throw new IllegalStateException();
                }
                boolean zM22310e = AbstractC21828k.m22310e(this);
                int i17 = rect.bottom;
                Rect rect2 = this.f36756i1;
                rect2.bottom = i17;
                int i18 = this.f36748a1;
                if (i18 == 1) {
                    rect2.left = m13662g(rect.left, zM22310e);
                    rect2.top = rect.top + this.f36749b1;
                    rect2.right = m13663h(rect.right, zM22310e);
                } else if (i18 != 2) {
                    rect2.left = m13662g(rect.left, zM22310e);
                    rect2.top = getPaddingTop();
                    rect2.right = m13663h(rect.right, zM22310e);
                } else {
                    rect2.left = this.f36768r0.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m13658c();
                    rect2.right = rect.right - this.f36768r0.getPaddingRight();
                }
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                int i22 = rect2.bottom;
                Rect rect3 = c21819b.f69224d;
                if (rect3.left != i19 || rect3.top != i20 || rect3.right != i21 || rect3.bottom != i22) {
                    rect3.set(i19, i20, i21, i22);
                    c21819b.f69204M = true;
                }
                if (this.f36768r0 == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c21819b.f69206O;
                textPaint.setTextSize(c21819b.f69231h);
                textPaint.setTypeface(c21819b.f69244u);
                textPaint.setLetterSpacing(c21819b.f69214W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f36768r0.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f36748a1 != 1 || this.f36768r0.getMinLines() > 1) ? rect.top + this.f36768r0.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f36768r0.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f36748a1 != 1 || this.f36768r0.getMinLines() > 1) ? rect.bottom - this.f36768r0.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i23 = rect2.left;
                int i24 = rect2.top;
                int i25 = rect2.right;
                Rect rect4 = c21819b.f69222c;
                if (rect4.left != i23 || rect4.top != i24 || rect4.right != i25 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i23, i24, i25, compoundPaddingBottom);
                    c21819b.f69204M = true;
                }
                c21819b.m22298h(false);
                if (!m13660e() || this.f36718C1) {
                    return;
                }
                m13665j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        int iMax;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f36768r0;
        C4313p c4313p = this.f36766q0;
        boolean z6 = false;
        if (editText2 != null && this.f36768r0.getMeasuredHeight() < (iMax = Math.max(c4313p.getMeasuredHeight(), this.f36764p0.getMeasuredHeight()))) {
            this.f36768r0.setMinimumHeight(iMax);
            z6 = true;
        }
        boolean zM13671q = m13671q();
        if (z6 || zM13671q) {
            this.f36768r0.post(new RunnableC4323z(this, 1));
        }
        if (this.f36727H0 != null && (editText = this.f36768r0) != null) {
            this.f36727H0.setGravity(editText.getGravity());
            this.f36727H0.setPadding(this.f36768r0.getCompoundPaddingLeft(), this.f36768r0.getCompoundPaddingTop(), this.f36768r0.getCompoundPaddingRight(), this.f36768r0.getCompoundPaddingBottom());
        }
        c4313p.m5118l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4297C)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4297C c4297c = (C4297C) parcelable;
        super.onRestoreInstanceState(c4297c.f16000Y);
        setError(c4297c.f13972o0);
        if (c4297c.f13973p0) {
            post(new RunnableC4323z(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z6 = i10 == 1;
        if (z6 != this.f36746Y0) {
            InterfaceC2683c interfaceC2683c = this.f36745X0.f8278e;
            RectF rectF = this.f36757j1;
            float fMo3657a = interfaceC2683c.mo3657a(rectF);
            float fMo3657a2 = this.f36745X0.f8279f.mo3657a(rectF);
            float fMo3657a3 = this.f36745X0.f8281h.mo3657a(rectF);
            float fMo3657a4 = this.f36745X0.f8280g.mo3657a(rectF);
            C2691k c2691k = this.f36745X0;
            AbstractC8143m5 abstractC8143m5 = c2691k.f8274a;
            AbstractC8143m5 abstractC8143m6 = c2691k.f8275b;
            AbstractC8143m5 abstractC8143m7 = c2691k.f8277d;
            AbstractC8143m5 abstractC8143m8 = c2691k.f8276c;
            C2685e c2685e = new C2685e();
            C2685e c2685e2 = new C2685e();
            C2685e c2685e3 = new C2685e();
            C2685e c2685e4 = new C2685e();
            C2690j.m3688b(abstractC8143m6);
            C2690j.m3688b(abstractC8143m5);
            C2690j.m3688b(abstractC8143m8);
            C2690j.m3688b(abstractC8143m7);
            C2681a c2681a = new C2681a(fMo3657a2);
            C2681a c2681a2 = new C2681a(fMo3657a);
            C2681a c2681a3 = new C2681a(fMo3657a4);
            C2681a c2681a4 = new C2681a(fMo3657a3);
            C2691k c2691k2 = new C2691k();
            c2691k2.f8274a = abstractC8143m6;
            c2691k2.f8275b = abstractC8143m5;
            c2691k2.f8276c = abstractC8143m7;
            c2691k2.f8277d = abstractC8143m8;
            c2691k2.f8278e = c2681a;
            c2691k2.f8279f = c2681a2;
            c2691k2.f8280g = c2681a4;
            c2691k2.f8281h = c2681a3;
            c2691k2.f8282i = c2685e;
            c2691k2.f8283j = c2685e2;
            c2691k2.f8284k = c2685e3;
            c2691k2.f8285l = c2685e4;
            this.f36746Y0 = z6;
            setShapeAppearanceModel(c2691k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4297C c4297c = new C4297C(super.onSaveInstanceState());
        if (m13668n()) {
            c4297c.f13972o0 = getError();
        }
        C4313p c4313p = this.f36766q0;
        c4297c.f13973p0 = c4313p.f14038w0 != 0 && c4313p.f14036u0.f36659r0;
        return c4297c;
    }

    /* JADX INFO: renamed from: p */
    public final void m13670p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C19329Y c19329y = this.f36717C0;
        if (c19329y != null) {
            m13667m(c19329y, this.f36713A0 ? this.f36719D0 : this.f36721E0);
            if (!this.f36713A0 && (colorStateList2 = this.f36734M0) != null) {
                this.f36717C0.setTextColor(colorStateList2);
            }
            if (!this.f36713A0 || (colorStateList = this.f36735N0) == null) {
                return;
            }
            this.f36717C0.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX INFO: renamed from: q */
    public final boolean m13671q() {
        boolean z6;
        if (this.f36768r0 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z10 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C4321x c4321x = this.f36764p0;
            if (c4321x.getMeasuredWidth() > 0) {
                int measuredWidth = c4321x.getMeasuredWidth() - this.f36768r0.getPaddingLeft();
                if (this.f36759l1 == null || this.f36760m1 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f36759l1 = colorDrawable;
                    this.f36760m1 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f36768r0.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f36759l1;
                if (drawable != colorDrawable2) {
                    this.f36768r0.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else if (this.f36759l1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f36768r0.getCompoundDrawablesRelative();
                this.f36768r0.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f36759l1 = null;
                z6 = true;
            } else {
                z6 = false;
            }
        } else if (this.f36759l1 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f36768r0.getCompoundDrawablesRelative();
            this.f36768r0.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f36759l1 = null;
            z6 = true;
        } else {
            z6 = false;
        }
        C4313p c4313p = this.f36766q0;
        if ((c4313p.m5110d() || ((c4313p.f14038w0 != 0 && c4313p.m5109c()) || c4313p.f14023D0 != null)) && c4313p.getMeasuredWidth() > 0) {
            int measuredWidth2 = c4313p.f14024E0.getMeasuredWidth() - this.f36768r0.getPaddingRight();
            if (c4313p.m5110d()) {
                checkableImageButton = c4313p.f14032q0;
            } else if (c4313p.f14038w0 != 0 && c4313p.m5109c()) {
                checkableImageButton = c4313p.f14036u0;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f36768r0.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f36763o1;
            if (colorDrawable3 == null || this.f36765p1 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f36763o1 = colorDrawable4;
                    this.f36765p1 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative4[2];
                ColorDrawable colorDrawable5 = this.f36763o1;
                if (drawable2 != colorDrawable5) {
                    this.f36767q1 = drawable2;
                    this.f36768r0.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                } else {
                    z10 = z6;
                }
            } else {
                this.f36765p1 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f36768r0.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f36763o1, compoundDrawablesRelative4[3]);
            }
        } else {
            if (this.f36763o1 == null) {
                return z6;
            }
            Drawable[] compoundDrawablesRelative5 = this.f36768r0.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f36763o1) {
                this.f36768r0.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f36767q1, compoundDrawablesRelative5[3]);
            } else {
                z10 = z6;
            }
            this.f36763o1 = null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: r */
    public final void m13672r() {
        Drawable background;
        C19329Y c19329y;
        EditText editText = this.f36768r0;
        if (editText == null || this.f36748a1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC19357i0.f61310a;
        Drawable drawableMutate = background.mutate();
        if (m13668n()) {
            drawableMutate.setColorFilter(C19372q.m20474c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f36713A0 && (c19329y = this.f36717C0) != null) {
            drawableMutate.setColorFilter(C19372q.m20474c(c19329y.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f36768r0.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13673s() {
        EditText editText = this.f36768r0;
        if (editText == null || this.f36739R0 == null) {
            return;
        }
        if ((this.f36742U0 || editText.getBackground() == null) && this.f36748a1 != 0) {
            EditText editText2 = this.f36768r0;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            editText2.setBackground(editTextBoxBackground);
            this.f36742U0 = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f36754g1 != i10) {
            this.f36754g1 = i10;
            this.f36781x1 = i10;
            this.f36785z1 = i10;
            this.f36714A1 = i10;
            m13657b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(getContext().getColor(i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f36781x1 = defaultColor;
        this.f36754g1 = defaultColor;
        this.f36783y1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f36785z1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f36714A1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m13657b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f36748a1) {
            return;
        }
        this.f36748a1 = i10;
        if (this.f36768r0 != null) {
            m13664i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f36749b1 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        C2690j c2690jM3694e = this.f36745X0.m3694e();
        InterfaceC2683c interfaceC2683c = this.f36745X0.f8278e;
        AbstractC8143m5 abstractC8143m5M8693a = AbstractC8151n5.m8693a(i10);
        c2690jM3694e.f8261a = abstractC8143m5M8693a;
        C2690j.m3688b(abstractC8143m5M8693a);
        c2690jM3694e.f8265e = interfaceC2683c;
        InterfaceC2683c interfaceC2683c2 = this.f36745X0.f8279f;
        AbstractC8143m5 abstractC8143m5M8693a2 = AbstractC8151n5.m8693a(i10);
        c2690jM3694e.f8262b = abstractC8143m5M8693a2;
        C2690j.m3688b(abstractC8143m5M8693a2);
        c2690jM3694e.f8266f = interfaceC2683c2;
        InterfaceC2683c interfaceC2683c3 = this.f36745X0.f8281h;
        AbstractC8143m5 abstractC8143m5M8693a3 = AbstractC8151n5.m8693a(i10);
        c2690jM3694e.f8264d = abstractC8143m5M8693a3;
        C2690j.m3688b(abstractC8143m5M8693a3);
        c2690jM3694e.f8268h = interfaceC2683c3;
        InterfaceC2683c interfaceC2683c4 = this.f36745X0.f8280g;
        AbstractC8143m5 abstractC8143m5M8693a4 = AbstractC8151n5.m8693a(i10);
        c2690jM3694e.f8263c = abstractC8143m5M8693a4;
        C2690j.m3688b(abstractC8143m5M8693a4);
        c2690jM3694e.f8267g = interfaceC2683c4;
        this.f36745X0 = c2690jM3694e.m3689a();
        m13657b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f36777v1 != i10) {
            this.f36777v1 = i10;
            m13678x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f36773t1 = colorStateList.getDefaultColor();
            this.f36716B1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f36775u1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f36777v1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f36777v1 != colorStateList.getDefaultColor()) {
            this.f36777v1 = colorStateList.getDefaultColor();
        }
        m13678x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f36779w1 != colorStateList) {
            this.f36779w1 = colorStateList;
            m13678x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f36751d1 = i10;
        m13678x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f36752e1 = i10;
        m13678x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f36782y0 != z6) {
            C4317t c4317t = this.f36780x0;
            if (z6) {
                C19329Y c19329y = new C19329Y(getContext(), null);
                this.f36717C0 = c19329y;
                c19329y.setId(com.openai.chatgpt.R.id.textinput_counter);
                Typeface typeface = this.f36758k1;
                if (typeface != null) {
                    this.f36717C0.setTypeface(typeface);
                }
                this.f36717C0.setMaxLines(1);
                c4317t.m5123a(this.f36717C0, 2);
                ((ViewGroup.MarginLayoutParams) this.f36717C0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.openai.chatgpt.R.dimen.mtrl_textinput_counter_margin_start));
                m13670p();
                if (this.f36717C0 != null) {
                    EditText editText = this.f36768r0;
                    m13669o(editText != null ? editText.getText() : null);
                }
            } else {
                c4317t.m5129g(this.f36717C0, 2);
                this.f36717C0 = null;
            }
            this.f36782y0 = z6;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f36784z0 != i10) {
            if (i10 > 0) {
                this.f36784z0 = i10;
            } else {
                this.f36784z0 = -1;
            }
            if (!this.f36782y0 || this.f36717C0 == null) {
                return;
            }
            EditText editText = this.f36768r0;
            m13669o(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f36719D0 != i10) {
            this.f36719D0 = i10;
            m13670p();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f36735N0 != colorStateList) {
            this.f36735N0 = colorStateList;
            m13670p();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f36721E0 != i10) {
            this.f36721E0 = i10;
            m13670p();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f36734M0 != colorStateList) {
            this.f36734M0 = colorStateList;
            m13670p();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f36769r1 = colorStateList;
        this.f36771s1 = colorStateList;
        if (this.f36768r0 != null) {
            m13675u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        m13655k(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f36766q0.f14036u0.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f36766q0.f14036u0.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i10) {
        C4313p c4313p = this.f36766q0;
        CharSequence text = i10 != 0 ? c4313p.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = c4313p.f14036u0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        C4313p c4313p = this.f36766q0;
        Drawable drawableM9636b = i10 != 0 ? AbstractC9106B3.m9636b(c4313p.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = c4313p.f14036u0;
        checkableImageButton.setImageDrawable(drawableM9636b);
        if (drawableM9636b != null) {
            ColorStateList colorStateList = c4313p.f14040y0;
            PorterDuff.Mode mode = c4313p.f14041z0;
            TextInputLayout textInputLayout = c4313p.f14030o0;
            AbstractC8479G.m9120a(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC8479G.m9123d(textInputLayout, checkableImageButton, c4313p.f14040y0);
        }
    }

    public void setEndIconMinSize(int i10) {
        C4313p c4313p = this.f36766q0;
        if (i10 < 0) {
            c4313p.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != c4313p.f14020A0) {
            c4313p.f14020A0 = i10;
            CheckableImageButton checkableImageButton = c4313p.f14036u0;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = c4313p.f14032q0;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f36766q0.m5112f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C4313p c4313p = this.f36766q0;
        View.OnLongClickListener onLongClickListener = c4313p.f14022C0;
        CheckableImageButton checkableImageButton = c4313p.f14036u0;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14022C0 = onLongClickListener;
        CheckableImageButton checkableImageButton = c4313p.f14036u0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14021B0 = scaleType;
        c4313p.f14036u0.setScaleType(scaleType);
        c4313p.f14032q0.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C4313p c4313p = this.f36766q0;
        if (c4313p.f14040y0 != colorStateList) {
            c4313p.f14040y0 = colorStateList;
            AbstractC8479G.m9120a(c4313p.f14030o0, c4313p.f14036u0, colorStateList, c4313p.f14041z0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C4313p c4313p = this.f36766q0;
        if (c4313p.f14041z0 != mode) {
            c4313p.f14041z0 = mode;
            AbstractC8479G.m9120a(c4313p.f14030o0, c4313p.f14036u0, c4313p.f14040y0, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        this.f36766q0.m5113g(z6);
    }

    public void setError(CharSequence charSequence) {
        C4317t c4317t = this.f36780x0;
        if (!c4317t.f14070q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c4317t.m5128f();
            return;
        }
        c4317t.m5125c();
        c4317t.f14069p = charSequence;
        c4317t.f14071r.setText(charSequence);
        int i10 = c4317t.f14067n;
        if (i10 != 1) {
            c4317t.f14068o = 1;
        }
        c4317t.m5131i(i10, c4317t.f14068o, c4317t.m5130h(c4317t.f14071r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        C4317t c4317t = this.f36780x0;
        c4317t.f14073t = i10;
        C19329Y c19329y = c4317t.f14071r;
        if (c19329y != null) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            c19329y.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C4317t c4317t = this.f36780x0;
        c4317t.f14072s = charSequence;
        C19329Y c19329y = c4317t.f14071r;
        if (c19329y != null) {
            c19329y.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) {
        C4317t c4317t = this.f36780x0;
        if (c4317t.f14070q == z6) {
            return;
        }
        c4317t.m5125c();
        TextInputLayout textInputLayout = c4317t.f14061h;
        if (z6) {
            C19329Y c19329y = new C19329Y(c4317t.f14060g, null);
            c4317t.f14071r = c19329y;
            c19329y.setId(com.openai.chatgpt.R.id.textinput_error);
            c4317t.f14071r.setTextAlignment(5);
            Typeface typeface = c4317t.f14053B;
            if (typeface != null) {
                c4317t.f14071r.setTypeface(typeface);
            }
            int i10 = c4317t.f14074u;
            c4317t.f14074u = i10;
            C19329Y c19329y2 = c4317t.f14071r;
            if (c19329y2 != null) {
                textInputLayout.m13667m(c19329y2, i10);
            }
            ColorStateList colorStateList = c4317t.f14075v;
            c4317t.f14075v = colorStateList;
            C19329Y c19329y3 = c4317t.f14071r;
            if (c19329y3 != null && colorStateList != null) {
                c19329y3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c4317t.f14072s;
            c4317t.f14072s = charSequence;
            C19329Y c19329y4 = c4317t.f14071r;
            if (c19329y4 != null) {
                c19329y4.setContentDescription(charSequence);
            }
            int i11 = c4317t.f14073t;
            c4317t.f14073t = i11;
            C19329Y c19329y5 = c4317t.f14071r;
            if (c19329y5 != null) {
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                c19329y5.setAccessibilityLiveRegion(i11);
            }
            c4317t.f14071r.setVisibility(4);
            c4317t.m5123a(c4317t.f14071r, 0);
        } else {
            c4317t.m5128f();
            c4317t.m5129g(c4317t.f14071r, 0);
            c4317t.f14071r = null;
            textInputLayout.m13672r();
            textInputLayout.m13678x();
        }
        c4317t.f14070q = z6;
    }

    public void setErrorIconDrawable(int i10) {
        C4313p c4313p = this.f36766q0;
        c4313p.m5114h(i10 != 0 ? AbstractC9106B3.m9636b(c4313p.getContext(), i10) : null);
        AbstractC8479G.m9123d(c4313p.f14030o0, c4313p.f14032q0, c4313p.f14033r0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C4313p c4313p = this.f36766q0;
        CheckableImageButton checkableImageButton = c4313p.f14032q0;
        View.OnLongClickListener onLongClickListener = c4313p.f14035t0;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14035t0 = onLongClickListener;
        CheckableImageButton checkableImageButton = c4313p.f14032q0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C4313p c4313p = this.f36766q0;
        if (c4313p.f14033r0 != colorStateList) {
            c4313p.f14033r0 = colorStateList;
            AbstractC8479G.m9120a(c4313p.f14030o0, c4313p.f14032q0, colorStateList, c4313p.f14034s0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C4313p c4313p = this.f36766q0;
        if (c4313p.f14034s0 != mode) {
            c4313p.f14034s0 = mode;
            AbstractC8479G.m9120a(c4313p.f14030o0, c4313p.f14032q0, c4313p.f14033r0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        C4317t c4317t = this.f36780x0;
        c4317t.f14074u = i10;
        C19329Y c19329y = c4317t.f14071r;
        if (c19329y != null) {
            c4317t.f14061h.m13667m(c19329y, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C4317t c4317t = this.f36780x0;
        c4317t.f14075v = colorStateList;
        C19329Y c19329y = c4317t.f14071r;
        if (c19329y == null || colorStateList == null) {
            return;
        }
        c19329y.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f36722E1 != z6) {
            this.f36722E1 = z6;
            m13675u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C4317t c4317t = this.f36780x0;
        if (zIsEmpty) {
            if (c4317t.f14077x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c4317t.f14077x) {
            setHelperTextEnabled(true);
        }
        c4317t.m5125c();
        c4317t.f14076w = charSequence;
        c4317t.f14078y.setText(charSequence);
        int i10 = c4317t.f14067n;
        if (i10 != 2) {
            c4317t.f14068o = 2;
        }
        c4317t.m5131i(i10, c4317t.f14068o, c4317t.m5130h(c4317t.f14078y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C4317t c4317t = this.f36780x0;
        c4317t.f14052A = colorStateList;
        C19329Y c19329y = c4317t.f14078y;
        if (c19329y == null || colorStateList == null) {
            return;
        }
        c19329y.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        C4317t c4317t = this.f36780x0;
        if (c4317t.f14077x == z6) {
            return;
        }
        c4317t.m5125c();
        if (z6) {
            C19329Y c19329y = new C19329Y(c4317t.f14060g, null);
            c4317t.f14078y = c19329y;
            c19329y.setId(com.openai.chatgpt.R.id.textinput_helper_text);
            c4317t.f14078y.setTextAlignment(5);
            Typeface typeface = c4317t.f14053B;
            if (typeface != null) {
                c4317t.f14078y.setTypeface(typeface);
            }
            c4317t.f14078y.setVisibility(4);
            c4317t.f14078y.setAccessibilityLiveRegion(1);
            int i10 = c4317t.f14079z;
            c4317t.f14079z = i10;
            C19329Y c19329y2 = c4317t.f14078y;
            if (c19329y2 != null) {
                c19329y2.setTextAppearance(i10);
            }
            ColorStateList colorStateList = c4317t.f14052A;
            c4317t.f14052A = colorStateList;
            C19329Y c19329y3 = c4317t.f14078y;
            if (c19329y3 != null && colorStateList != null) {
                c19329y3.setTextColor(colorStateList);
            }
            c4317t.m5123a(c4317t.f14078y, 1);
            c4317t.f14078y.setAccessibilityDelegate(new C4316s(c4317t));
        } else {
            c4317t.m5125c();
            int i11 = c4317t.f14067n;
            if (i11 == 2) {
                c4317t.f14068o = 0;
            }
            c4317t.m5131i(i11, c4317t.f14068o, c4317t.m5130h(c4317t.f14078y, ""));
            c4317t.m5129g(c4317t.f14078y, 1);
            c4317t.f14078y = null;
            TextInputLayout textInputLayout = c4317t.f14061h;
            textInputLayout.m13672r();
            textInputLayout.m13678x();
        }
        c4317t.f14077x = z6;
    }

    public void setHelperTextTextAppearance(int i10) {
        C4317t c4317t = this.f36780x0;
        c4317t.f14079z = i10;
        C19329Y c19329y = c4317t.f14078y;
        if (c19329y != null) {
            c19329y.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f36736O0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f36724F1 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f36736O0) {
            this.f36736O0 = z6;
            if (z6) {
                CharSequence hint = this.f36768r0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f36737P0)) {
                        setHint(hint);
                    }
                    this.f36768r0.setHint((CharSequence) null);
                }
                this.f36738Q0 = true;
            } else {
                this.f36738Q0 = false;
                if (!TextUtils.isEmpty(this.f36737P0) && TextUtils.isEmpty(this.f36768r0.getHint())) {
                    this.f36768r0.setHint(this.f36737P0);
                }
                setHintInternal(null);
            }
            if (this.f36768r0 != null) {
                m13674t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        C21819b c21819b = this.f36720D1;
        TextInputLayout textInputLayout = c21819b.f69218a;
        C1622d c1622d = new C1622d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = c1622d.f4601j;
        if (colorStateList != null) {
            c21819b.f69234k = colorStateList;
        }
        float f10 = c1622d.f4602k;
        if (f10 != 0.0f) {
            c21819b.f69232i = f10;
        }
        ColorStateList colorStateList2 = c1622d.f4592a;
        if (colorStateList2 != null) {
            c21819b.f69212U = colorStateList2;
        }
        c21819b.f69210S = c1622d.f4596e;
        c21819b.f69211T = c1622d.f4597f;
        c21819b.f69209R = c1622d.f4598g;
        c21819b.f69213V = c1622d.f4600i;
        C1619a c1619a = c21819b.f69248y;
        if (c1619a != null) {
            c1619a.f4584c = true;
        }
        C9895g4 c9895g4 = new C9895g4(c21819b);
        c1622d.m2479a();
        c21819b.f69248y = new C1619a(c9895g4, c1622d.f4605n);
        c1622d.m2481c(textInputLayout.getContext(), c21819b.f69248y);
        c21819b.m22298h(false);
        this.f36771s1 = c21819b.f69234k;
        if (this.f36768r0 != null) {
            m13675u(false, false);
            m13674t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f36771s1 != colorStateList) {
            if (this.f36769r1 == null) {
                C21819b c21819b = this.f36720D1;
                if (c21819b.f69234k != colorStateList) {
                    c21819b.f69234k = colorStateList;
                    c21819b.m22298h(false);
                }
            }
            this.f36771s1 = colorStateList;
            if (this.f36768r0 != null) {
                m13675u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC4296B interfaceC4296B) {
        this.f36715B0 = interfaceC4296B;
    }

    public void setMaxEms(int i10) {
        this.f36774u0 = i10;
        EditText editText = this.f36768r0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f36778w0 = i10;
        EditText editText = this.f36768r0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f36772t0 = i10;
        EditText editText = this.f36768r0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f36776v0 = i10;
        EditText editText = this.f36768r0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14036u0.setContentDescription(i10 != 0 ? c4313p.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14036u0.setImageDrawable(i10 != 0 ? AbstractC9106B3.m9636b(c4313p.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        C4313p c4313p = this.f36766q0;
        if (z6 && c4313p.f14038w0 != 1) {
            c4313p.m5112f(1);
        } else if (z6) {
            c4313p.getClass();
        } else {
            c4313p.m5112f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14040y0 = colorStateList;
        AbstractC8479G.m9120a(c4313p.f14030o0, c4313p.f14036u0, colorStateList, c4313p.f14041z0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C4313p c4313p = this.f36766q0;
        c4313p.f14041z0 = mode;
        AbstractC8479G.m9120a(c4313p.f14030o0, c4313p.f14036u0, c4313p.f14040y0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f36727H0 == null) {
            C19329Y c19329y = new C19329Y(getContext(), null);
            this.f36727H0 = c19329y;
            c19329y.setId(com.openai.chatgpt.R.id.textinput_placeholder);
            this.f36727H0.setImportantForAccessibility(2);
            C5661l c5661lM13659d = m13659d();
            this.f36732K0 = c5661lM13659d;
            c5661lM13659d.f18415Z = 67L;
            this.f36733L0 = m13659d();
            setPlaceholderTextAppearance(this.f36731J0);
            setPlaceholderTextColor(this.f36729I0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f36725G0) {
                setPlaceholderTextEnabled(true);
            }
            this.f36723F0 = charSequence;
        }
        EditText editText = this.f36768r0;
        m13676v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f36731J0 = i10;
        C19329Y c19329y = this.f36727H0;
        if (c19329y != null) {
            c19329y.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f36729I0 != colorStateList) {
            this.f36729I0 = colorStateList;
            C19329Y c19329y = this.f36727H0;
            if (c19329y == null || colorStateList == null) {
                return;
            }
            c19329y.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C4321x c4321x = this.f36764p0;
        c4321x.getClass();
        c4321x.f14090q0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c4321x.f14089p0.setText(charSequence);
        c4321x.m5136d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f36764p0.f14089p0.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f36764p0.f14089p0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2691k c2691k) {
        C2687g c2687g = this.f36739R0;
        if (c2687g == null || c2687g.f8246Y.f8220a == c2691k) {
            return;
        }
        this.f36745X0 = c2691k;
        m13657b();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f36764p0.f14091r0.setCheckable(z6);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36764p0.f14091r0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC9106B3.m9636b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        C4321x c4321x = this.f36764p0;
        if (i10 < 0) {
            c4321x.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != c4321x.f14094u0) {
            c4321x.f14094u0 = i10;
            CheckableImageButton checkableImageButton = c4321x.f14091r0;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C4321x c4321x = this.f36764p0;
        View.OnLongClickListener onLongClickListener = c4321x.f14096w0;
        CheckableImageButton checkableImageButton = c4321x.f14091r0;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C4321x c4321x = this.f36764p0;
        c4321x.f14096w0 = onLongClickListener;
        CheckableImageButton checkableImageButton = c4321x.f14091r0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C4321x c4321x = this.f36764p0;
        c4321x.f14095v0 = scaleType;
        c4321x.f14091r0.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C4321x c4321x = this.f36764p0;
        if (c4321x.f14092s0 != colorStateList) {
            c4321x.f14092s0 = colorStateList;
            AbstractC8479G.m9120a(c4321x.f14088o0, c4321x.f14091r0, colorStateList, c4321x.f14093t0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C4321x c4321x = this.f36764p0;
        if (c4321x.f14093t0 != mode) {
            c4321x.f14093t0 = mode;
            AbstractC8479G.m9120a(c4321x.f14088o0, c4321x.f14091r0, c4321x.f14092s0, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        this.f36764p0.m5134b(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        C4313p c4313p = this.f36766q0;
        c4313p.getClass();
        c4313p.f14023D0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c4313p.f14024E0.setText(charSequence);
        c4313p.m5119m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f36766q0.f14024E0.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f36766q0.f14024E0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4295A c4295a) {
        EditText editText = this.f36768r0;
        if (editText != null) {
            AbstractC0738T.m1584l(editText, c4295a);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f36758k1) {
            this.f36758k1 = typeface;
            this.f36720D1.m22303m(typeface);
            C4317t c4317t = this.f36780x0;
            if (typeface != c4317t.f14053B) {
                c4317t.f14053B = typeface;
                C19329Y c19329y = c4317t.f14071r;
                if (c19329y != null) {
                    c19329y.setTypeface(typeface);
                }
                C19329Y c19329y2 = c4317t.f14078y;
                if (c19329y2 != null) {
                    c19329y2.setTypeface(typeface);
                }
            }
            C19329Y c19329y3 = this.f36717C0;
            if (c19329y3 != null) {
                c19329y3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13674t() {
        if (this.f36748a1 != 1) {
            FrameLayout frameLayout = this.f36762o0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM13658c = m13658c();
            if (iM13658c != layoutParams.topMargin) {
                layoutParams.topMargin = iM13658c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m13675u(boolean z6, boolean z10) {
        ColorStateList colorStateList;
        C19329Y c19329y;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f36768r0;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f36768r0;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f36769r1;
        C21819b c21819b = this.f36720D1;
        if (colorStateList2 != null) {
            c21819b.m22299i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f36769r1;
            c21819b.m22299i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f36716B1) : this.f36716B1));
        } else if (m13668n()) {
            C19329Y c19329y2 = this.f36780x0.f14071r;
            c21819b.m22299i(c19329y2 != null ? c19329y2.getTextColors() : null);
        } else if (this.f36713A0 && (c19329y = this.f36717C0) != null) {
            c21819b.m22299i(c19329y.getTextColors());
        } else if (z12 && (colorStateList = this.f36771s1) != null && c21819b.f69234k != colorStateList) {
            c21819b.f69234k = colorStateList;
            c21819b.m22298h(false);
        }
        C4313p c4313p = this.f36766q0;
        C4321x c4321x = this.f36764p0;
        if (z11 || !this.f36722E1 || (isEnabled() && z12)) {
            if (z10 || this.f36718C1) {
                ValueAnimator valueAnimator = this.f36726G1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f36726G1.cancel();
                }
                if (z6 && this.f36724F1) {
                    m13656a(1.0f);
                } else {
                    c21819b.m22301k(1.0f);
                }
                this.f36718C1 = false;
                if (m13660e()) {
                    m13665j();
                }
                EditText editText3 = this.f36768r0;
                m13676v(editText3 != null ? editText3.getText() : null);
                c4321x.f14097x0 = false;
                c4321x.m5136d();
                c4313p.f14025F0 = false;
                c4313p.m5119m();
                return;
            }
            return;
        }
        if (z10 || !this.f36718C1) {
            ValueAnimator valueAnimator2 = this.f36726G1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f36726G1.cancel();
            }
            if (z6 && this.f36724F1) {
                m13656a(0.0f);
            } else {
                c21819b.m22301k(0.0f);
            }
            if (m13660e() && !((C4304g) this.f36739R0).f13992J0.f13990r.isEmpty() && m13660e()) {
                ((C4304g) this.f36739R0).m5053r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f36718C1 = true;
            C19329Y c19329y3 = this.f36727H0;
            if (c19329y3 != null && this.f36725G0) {
                c19329y3.setText((CharSequence) null);
                AbstractC5636B.m6041a(this.f36762o0, this.f36733L0);
                this.f36727H0.setVisibility(4);
            }
            c4321x.f14097x0 = true;
            c4321x.m5136d();
            c4313p.f14025F0 = true;
            c4313p.m5119m();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13676v(Editable editable) {
        ((C2385o) this.f36715B0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f36762o0;
        if (length != 0 || this.f36718C1) {
            C19329Y c19329y = this.f36727H0;
            if (c19329y == null || !this.f36725G0) {
                return;
            }
            c19329y.setText((CharSequence) null);
            AbstractC5636B.m6041a(frameLayout, this.f36733L0);
            this.f36727H0.setVisibility(4);
            return;
        }
        if (this.f36727H0 == null || !this.f36725G0 || TextUtils.isEmpty(this.f36723F0)) {
            return;
        }
        this.f36727H0.setText(this.f36723F0);
        AbstractC5636B.m6041a(frameLayout, this.f36732K0);
        this.f36727H0.setVisibility(0);
        this.f36727H0.bringToFront();
        announceForAccessibility(this.f36723F0);
    }

    /* JADX INFO: renamed from: w */
    public final void m13677w(boolean z6, boolean z10) {
        int defaultColor = this.f36779w1.getDefaultColor();
        int colorForState = this.f36779w1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f36779w1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f36753f1 = colorForState2;
        } else if (z10) {
            this.f36753f1 = colorForState;
        } else {
            this.f36753f1 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m13678x() {
        C19329Y c19329y;
        EditText editText;
        EditText editText2;
        if (this.f36739R0 == null || this.f36748a1 == 0) {
            return;
        }
        boolean z6 = false;
        boolean z10 = isFocused() || ((editText2 = this.f36768r0) != null && editText2.hasFocus());
        boolean z11 = isHovered() || ((editText = this.f36768r0) != null && editText.isHovered());
        if (m13668n() || (this.f36717C0 != null && this.f36713A0)) {
            z6 = true;
        }
        if (!isEnabled()) {
            this.f36753f1 = this.f36716B1;
        } else if (m13668n()) {
            if (this.f36779w1 != null) {
                m13677w(z10, z11);
            } else {
                this.f36753f1 = getErrorCurrentTextColors();
            }
        } else if (!this.f36713A0 || (c19329y = this.f36717C0) == null) {
            if (z10) {
                this.f36753f1 = this.f36777v1;
            } else if (z11) {
                this.f36753f1 = this.f36775u1;
            } else {
                this.f36753f1 = this.f36773t1;
            }
        } else if (this.f36779w1 != null) {
            m13677w(z10, z11);
        } else {
            this.f36753f1 = c19329y.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueM8263d = AbstractC7972Q3.m8263d(context, com.openai.chatgpt.R.attr.colorControlActivated);
            ColorStateList colorStateListValueOf = null;
            if (typedValueM8263d != null) {
                int i10 = typedValueM8263d.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = AbstractC17803d.m19556c(context, i10);
                } else {
                    int i11 = typedValueM8263d.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    }
                }
            }
            EditText editText3 = this.f36768r0;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.f36768r0.getTextCursorDrawable();
                if (z6) {
                    ColorStateList colorStateListValueOf2 = this.f36779w1;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.f36753f1);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                textCursorDrawable.setTintList(colorStateListValueOf);
            }
        }
        C4313p c4313p = this.f36766q0;
        c4313p.m5117k();
        CheckableImageButton checkableImageButton = c4313p.f14032q0;
        ColorStateList colorStateList = c4313p.f14033r0;
        TextInputLayout textInputLayout = c4313p.f14030o0;
        AbstractC8479G.m9123d(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c4313p.f14040y0;
        CheckableImageButton checkableImageButton2 = c4313p.f14036u0;
        AbstractC8479G.m9123d(textInputLayout, checkableImageButton2, colorStateList2);
        if (c4313p.m5108b() instanceof C4309l) {
            if (!textInputLayout.m13668n() || checkableImageButton2.getDrawable() == null) {
                AbstractC8479G.m9120a(textInputLayout, checkableImageButton2, c4313p.f14040y0, c4313p.f14041z0);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C4321x c4321x = this.f36764p0;
        AbstractC8479G.m9123d(c4321x.f14088o0, c4321x.f14091r0, c4321x.f14092s0);
        if (this.f36748a1 == 2) {
            int i12 = this.f36750c1;
            if (z10 && isEnabled()) {
                this.f36750c1 = this.f36752e1;
            } else {
                this.f36750c1 = this.f36751d1;
            }
            if (this.f36750c1 != i12 && m13660e() && !this.f36718C1) {
                if (m13660e()) {
                    ((C4304g) this.f36739R0).m5053r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m13665j();
            }
        }
        if (this.f36748a1 == 1) {
            if (!isEnabled()) {
                this.f36754g1 = this.f36783y1;
            } else if (z11 && !z10) {
                this.f36754g1 = this.f36714A1;
            } else if (z10) {
                this.f36754g1 = this.f36785z1;
            } else {
                this.f36754g1 = this.f36781x1;
            }
        }
        m13657b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f36764p0.m5133a(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f36766q0.f14036u0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f36766q0.f14036u0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f36766q0.m5114h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36766q0.f14036u0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C4313p c4313p = this.f36766q0;
        CheckableImageButton checkableImageButton = c4313p.f14036u0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c4313p.f14040y0;
            PorterDuff.Mode mode = c4313p.f14041z0;
            TextInputLayout textInputLayout = c4313p.f14030o0;
            AbstractC8479G.m9120a(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC8479G.m9123d(textInputLayout, checkableImageButton, c4313p.f14040y0);
        }
    }
}
