package p239Ja;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p523V9.AbstractC7979R3;
import p544W9.AbstractC8479G;
import p658b5.C11242m;
import p999s.C19329Y;
import za.AbstractC21828k;

/* JADX INFO: renamed from: Ja.x */
/* JADX INFO: loaded from: classes.dex */
public final class C4321x extends LinearLayout {

    /* JADX INFO: renamed from: o0 */
    public final TextInputLayout f14088o0;

    /* JADX INFO: renamed from: p0 */
    public final C19329Y f14089p0;

    /* JADX INFO: renamed from: q0 */
    public CharSequence f14090q0;

    /* JADX INFO: renamed from: r0 */
    public final CheckableImageButton f14091r0;

    /* JADX INFO: renamed from: s0 */
    public ColorStateList f14092s0;

    /* JADX INFO: renamed from: t0 */
    public PorterDuff.Mode f14093t0;

    /* JADX INFO: renamed from: u0 */
    public int f14094u0;

    /* JADX INFO: renamed from: v0 */
    public ImageView.ScaleType f14095v0;

    /* JADX INFO: renamed from: w0 */
    public View.OnLongClickListener f14096w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f14097x0;

    public C4321x(TextInputLayout textInputLayout, C11242m c11242m) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f14088o0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f14091r0 = checkableImageButton;
        C19329Y c19329y = new C19329Y(getContext(), null);
        this.f14089p0 = c19329y;
        if (AbstractC7979R3.m8283g(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f14096w0;
        checkableImageButton.setOnClickListener(null);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
        this.f14096w0 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC8479G.m9125f(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c11242m.f34019Z;
        if (typedArray.hasValue(67)) {
            this.f14092s0 = AbstractC7979R3.m8280d(getContext(), c11242m, 67);
        }
        if (typedArray.hasValue(68)) {
            this.f14093t0 = AbstractC21828k.m22312g(typedArray.getInt(68, -1), null);
        }
        if (typedArray.hasValue(64)) {
            m5133a(c11242m.m12601B(64));
            if (typedArray.hasValue(63) && checkableImageButton.getContentDescription() != (text = typedArray.getText(63))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(62, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f14094u0) {
            this.f14094u0 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(66)) {
            ImageView.ScaleType scaleTypeM9121b = AbstractC8479G.m9121b(typedArray.getInt(66, -1));
            this.f14095v0 = scaleTypeM9121b;
            checkableImageButton.setScaleType(scaleTypeM9121b);
        }
        c19329y.setVisibility(8);
        c19329y.setId(R.id.textinput_prefix_text);
        c19329y.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        c19329y.setAccessibilityLiveRegion(1);
        c19329y.setTextAppearance(typedArray.getResourceId(58, 0));
        if (typedArray.hasValue(59)) {
            c19329y.setTextColor(c11242m.m12600A(59));
        }
        CharSequence text2 = typedArray.getText(57);
        this.f14090q0 = TextUtils.isEmpty(text2) ? null : text2;
        c19329y.setText(text2);
        m5136d();
        addView(checkableImageButton);
        addView(c19329y);
    }

    /* JADX INFO: renamed from: a */
    public final void m5133a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f14091r0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f14092s0;
            PorterDuff.Mode mode = this.f14093t0;
            TextInputLayout textInputLayout = this.f14088o0;
            AbstractC8479G.m9120a(textInputLayout, checkableImageButton, colorStateList, mode);
            m5134b(true);
            AbstractC8479G.m9123d(textInputLayout, checkableImageButton, this.f14092s0);
            return;
        }
        m5134b(false);
        View.OnLongClickListener onLongClickListener = this.f14096w0;
        checkableImageButton.setOnClickListener(null);
        AbstractC8479G.m9125f(checkableImageButton, onLongClickListener);
        this.f14096w0 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC8479G.m9125f(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5134b(boolean z6) {
        CheckableImageButton checkableImageButton = this.f14091r0;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            m5135c();
            m5136d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5135c() {
        int paddingStart;
        EditText editText = this.f14088o0.f36768r0;
        if (editText == null) {
            return;
        }
        if (this.f14091r0.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
        this.f14089p0.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: d */
    public final void m5136d() {
        int i10 = (this.f14090q0 == null || this.f14097x0) ? 8 : 0;
        setVisibility((this.f14091r0.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f14089p0.setVisibility(i10);
        this.f14088o0.m13671q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m5135c();
    }
}
