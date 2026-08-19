package p999s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p030B2.AbstractC0718B;
import p082D2.AbstractC1857d;
import p084D4.C1904b;
import p108E2.InterfaceC2243b;
import p108E2.InterfaceC2259r;
import p1141z2.AbstractC21725d;
import p1141z2.C21724c;
import p523V9.AbstractC8020X;
import p523V9.AbstractC8166p4;
import p523V9.AbstractC8186s0;
import p571X9.AbstractC9106B3;
import p594Y9.AbstractC9877e0;
import p784hb.C14437f;
import p979r2.AbstractC18865f;

/* JADX INFO: renamed from: s.Y */
/* JADX INFO: loaded from: classes.dex */
public class C19329Y extends TextView implements InterfaceC2259r, InterfaceC2243b {

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61216o0;

    /* JADX INFO: renamed from: p0 */
    public final C19321U f61217p0;

    /* JADX INFO: renamed from: q0 */
    public final C19388y f61218q0;

    /* JADX INFO: renamed from: r0 */
    public C19378t f61219r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f61220s0;

    /* JADX INFO: renamed from: t0 */
    public C14437f f61221t0;

    /* JADX INFO: renamed from: u0 */
    public Future f61222u0;

    public C19329Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C19378t getEmojiTextViewHelper() {
        if (this.f61219r0 == null) {
            this.f61219r0 = new C19378t(this);
        }
        return this.f61219r0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20427g() {
        Future future = this.f61222u0;
        if (future == null) {
            return;
        }
        try {
            this.f61222u0 = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC8166p4.m8734b(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeMaxTextSize();
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            return Math.round(c19321u.f61203i.f61267e);
        }
        return -1;
    }

    @Override // android.widget.TextView, p108E2.InterfaceC2243b
    public int getAutoSizeMinTextSize() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeMinTextSize();
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            return Math.round(c19321u.f61203i.f61266d);
        }
        return -1;
    }

    @Override // android.widget.TextView, p108E2.InterfaceC2243b
    public int getAutoSizeStepGranularity() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeStepGranularity();
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            return Math.round(c19321u.f61203i.f61265c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C19321U c19321u = this.f61217p0;
        return c19321u != null ? c19321u.f61203i.f61268f : new int[0];
    }

    @Override // android.widget.TextView, p108E2.InterfaceC2243b
    public int getAutoSizeTextType() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            return c19321u.f61203i.f61263a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC8166p4.m8739g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC19323V getSuperCaller() {
        if (this.f61221t0 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f61221t0 = new C19327X(this);
            } else if (i10 >= 28) {
                this.f61221t0 = new C19325W(this);
            } else if (i10 >= 26) {
                this.f61221t0 = new C14437f(this);
            }
        }
        return this.f61221t0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61217p0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61217p0.m20415e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m20427g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C19388y c19388y;
        if (Build.VERSION.SDK_INT >= 28 || (c19388y = this.f61218q0) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c19388y.f61406c;
        return textClassifier == null ? AbstractC19308N.m20393a((TextView) c19388y.f61405b) : textClassifier;
    }

    public C21724c getTextMetricsParamsCompat() {
        return AbstractC8166p4.m8734b(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f61217p0.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC1857d.m2739c(editorInfo, getText());
        }
        AbstractC8186s0.m8768a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        C19321U c19321u = this.f61217p0;
        if (c19321u == null || AbstractC19353g1.f61285c) {
            return;
        }
        c19321u.f61203i.m20449a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m20427g();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C19321U c19321u = this.f61217p0;
        if (c19321u == null || AbstractC19353g1.f61285c) {
            return;
        }
        C19343d0 c19343d0 = c19321u.f61203i;
        if (c19343d0.m20451f()) {
            c19343d0.m20449a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m20480b(z6);
    }

    @Override // android.widget.TextView, p108E2.InterfaceC2243b
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (AbstractC19353g1.f61285c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20418h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (AbstractC19353g1.f61285c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20419i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (AbstractC19353g1.f61285c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20420j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC8166p4.m8740h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().m20481c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC9877e0) getEmojiTextViewHelper().f61374b.f42001Y).mo8004b(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo15955b(i10);
        } else {
            AbstractC8166p4.m8736d(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo15954a(i10);
        } else {
            AbstractC8166p4.m8737e(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        AbstractC8166p4.m8738f(this, i10);
    }

    public void setPrecomputedText(AbstractC21725d abstractC21725d) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC8166p4.m8734b(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61216o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61217p0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61217p0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20417g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C19388y c19388y;
        if (Build.VERSION.SDK_INT >= 28 || (c19388y = this.f61218q0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c19388y.f61406c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC21725d> future) {
        this.f61222u0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C21724c c21724c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c21724c.f68918b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(c21724c.f68917a);
        setBreakStrategy(c21724c.f68919c);
        setHyphenationFrequency(c21724c.f68920d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z6 = AbstractC19353g1.f61285c;
        if (z6) {
            super.setTextSize(i10, f10);
            return;
        }
        C19321U c19321u = this.f61217p0;
        if (c19321u == null || z6) {
            return;
        }
        C19343d0 c19343d0 = c19321u.f61203i;
        if (c19343d0.m20451f()) {
            return;
        }
        c19343d0.m20452g(i10, f10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f61220s0) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC8020X abstractC8020X = AbstractC18865f.f60093a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f61220s0 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f61220s0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19329Y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC19313P0.m20399a(context);
        this.f61220s0 = false;
        this.f61221t0 = null;
        AbstractC19311O0.m20394a(this, getContext());
        C1904b c1904b = new C1904b(this);
        this.f61216o0 = c1904b;
        c1904b.m3003k(attributeSet, i10);
        C19321U c19321u = new C19321U(this);
        this.f61217p0 = c19321u;
        c19321u.m20416f(attributeSet, i10);
        c19321u.m20413b();
        C19388y c19388y = new C19388y();
        c19388y.f61405b = this;
        this.f61218q0 = c19388y;
        getEmojiTextViewHelper().m20479a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().mo15956c(i10, f10);
        } else if (i11 >= 34) {
            AbstractC0718B.m1501l(this, i10, f10);
        } else {
            AbstractC8166p4.m8738f(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC9106B3.m9636b(context, i10) : null, i11 != 0 ? AbstractC9106B3.m9636b(context, i11) : null, i12 != 0 ? AbstractC9106B3.m9636b(context, i12) : null, i13 != 0 ? AbstractC9106B3.m9636b(context, i13) : null);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC9106B3.m9636b(context, i10) : null, i11 != 0 ? AbstractC9106B3.m9636b(context, i11) : null, i12 != 0 ? AbstractC9106B3.m9636b(context, i12) : null, i13 != 0 ? AbstractC9106B3.m9636b(context, i13) : null);
        C19321U c19321u = this.f61217p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }
}
