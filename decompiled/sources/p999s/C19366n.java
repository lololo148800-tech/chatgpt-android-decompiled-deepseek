package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p084D4.C1904b;
import p108E2.InterfaceC2243b;
import p108E2.InterfaceC2259r;
import p523V9.AbstractC8166p4;
import p594Y9.AbstractC9877e0;

/* JADX INFO: renamed from: s.n */
/* JADX INFO: loaded from: classes.dex */
public class C19366n extends Button implements InterfaceC2243b, InterfaceC2259r {

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61328o0;

    /* JADX INFO: renamed from: p0 */
    public final C19321U f61329p0;

    /* JADX INFO: renamed from: q0 */
    public C19378t f61330q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19366n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC19313P0.m20399a(context);
        AbstractC19311O0.m20394a(this, getContext());
        C1904b c1904b = new C1904b(this);
        this.f61328o0 = c1904b;
        c1904b.m3003k(attributeSet, i10);
        C19321U c19321u = new C19321U(this);
        this.f61329p0 = c19321u;
        c19321u.m20416f(attributeSet, i10);
        c19321u.m20413b();
        getEmojiTextViewHelper().m20479a(attributeSet, i10);
    }

    private C19378t getEmojiTextViewHelper() {
        if (this.f61330q0 == null) {
            this.f61330q0 = new C19378t(this);
        }
        return this.f61330q0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C19321U c19321u = this.f61329p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeMaxTextSize();
        }
        C19321U c19321u = this.f61329p0;
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
        C19321U c19321u = this.f61329p0;
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
        C19321U c19321u = this.f61329p0;
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
        C19321U c19321u = this.f61329p0;
        return c19321u != null ? c19321u.f61203i.f61268f : new int[0];
    }

    @Override // android.widget.TextView, p108E2.InterfaceC2243b
    public int getAutoSizeTextType() {
        if (AbstractC19353g1.f61285c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C19321U c19321u = this.f61329p0;
        if (c19321u != null) {
            return c19321u.f61203i.f61263a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC8166p4.m8739g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61329p0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61329p0.m20415e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        C19321U c19321u = this.f61329p0;
        if (c19321u == null || AbstractC19353g1.f61285c) {
            return;
        }
        c19321u.f61203i.m20449a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C19321U c19321u = this.f61329p0;
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
        C19321U c19321u = this.f61329p0;
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
        C19321U c19321u = this.f61329p0;
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
        C19321U c19321u = this.f61329p0;
        if (c19321u != null) {
            c19321u.m20420j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
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

    public void setSupportAllCaps(boolean z6) {
        C19321U c19321u = this.f61329p0;
        if (c19321u != null) {
            c19321u.f61195a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61328o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61329p0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61329p0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C19321U c19321u = this.f61329p0;
        if (c19321u != null) {
            c19321u.m20417g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z6 = AbstractC19353g1.f61285c;
        if (z6) {
            super.setTextSize(i10, f10);
            return;
        }
        C19321U c19321u = this.f61329p0;
        if (c19321u == null || z6) {
            return;
        }
        C19343d0 c19343d0 = c19321u.f61203i;
        if (c19343d0.m20451f()) {
            return;
        }
        c19343d0.m20452g(i10, f10);
    }
}
