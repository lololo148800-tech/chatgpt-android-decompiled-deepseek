package p999s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p084D4.C1904b;
import p108E2.InterfaceC2259r;
import p594Y9.AbstractC9877e0;

/* JADX INFO: renamed from: s.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19346e0 extends ToggleButton implements InterfaceC2259r {

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61277o0;

    /* JADX INFO: renamed from: p0 */
    public final C19321U f61278p0;

    /* JADX INFO: renamed from: q0 */
    public C19378t f61279q0;

    public C19346e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC19311O0.m20394a(this, getContext());
        C1904b c1904b = new C1904b(this);
        this.f61277o0 = c1904b;
        c1904b.m3003k(attributeSet, R.attr.buttonStyleToggle);
        C19321U c19321u = new C19321U(this);
        this.f61278p0 = c19321u;
        c19321u.m20416f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m20479a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C19378t getEmojiTextViewHelper() {
        if (this.f61279q0 == null) {
            this.f61279q0 = new C19378t(this);
        }
        return this.f61279q0;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C19321U c19321u = this.f61278p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61278p0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61278p0.m20415e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m20480b(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61278p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61278p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().m20481c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC9877e0) getEmojiTextViewHelper().f61374b.f42001Y).mo8004b(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61277o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61278p0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61278p0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }
}
