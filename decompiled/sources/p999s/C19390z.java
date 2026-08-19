package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.openai.chatgpt.R;
import p084D4.C1904b;
import p108E2.InterfaceC2258q;
import p108E2.InterfaceC2259r;
import p183H4.C3231f;
import p571X9.AbstractC9106B3;
import p594Y9.AbstractC9877e0;

/* JADX INFO: renamed from: s.z */
/* JADX INFO: loaded from: classes.dex */
public class C19390z extends RadioButton implements InterfaceC2258q, InterfaceC2259r {

    /* JADX INFO: renamed from: o0 */
    public final C3231f f61408o0;

    /* JADX INFO: renamed from: p0 */
    public final C1904b f61409p0;

    /* JADX INFO: renamed from: q0 */
    public final C19321U f61410q0;

    /* JADX INFO: renamed from: r0 */
    public C19378t f61411r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19390z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC19313P0.m20399a(context);
        AbstractC19311O0.m20394a(this, getContext());
        C3231f c3231f = new C3231f(this);
        this.f61408o0 = c3231f;
        c3231f.m4124e(attributeSet, R.attr.radioButtonStyle);
        C1904b c1904b = new C1904b(this);
        this.f61409p0 = c1904b;
        c1904b.m3003k(attributeSet, R.attr.radioButtonStyle);
        C19321U c19321u = new C19321U(this);
        this.f61410q0 = c19321u;
        c19321u.m20416f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m20479a(attributeSet, R.attr.radioButtonStyle);
    }

    private C19378t getEmojiTextViewHelper() {
        if (this.f61411r0 == null) {
            this.f61411r0 = new C19378t(this);
        }
        return this.f61411r0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C19321U c19321u = this.f61410q0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    @Override // p108E2.InterfaceC2258q
    public ColorStateList getSupportButtonTintList() {
        C3231f c3231f = this.f61408o0;
        if (c3231f != null) {
            return (ColorStateList) c3231f.f9801e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3231f c3231f = this.f61408o0;
        if (c3231f != null) {
            return (PorterDuff.Mode) c3231f.f9802f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61410q0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61410q0.m20415e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m20480b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3231f c3231f = this.f61408o0;
        if (c3231f != null) {
            if (c3231f.f9799c) {
                c3231f.f9799c = false;
            } else {
                c3231f.f9799c = true;
                c3231f.m4120a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61410q0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61410q0;
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
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61409p0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // p108E2.InterfaceC2258q
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3231f c3231f = this.f61408o0;
        if (c3231f != null) {
            c3231f.f9801e = colorStateList;
            c3231f.f9797a = true;
            c3231f.m4120a();
        }
    }

    @Override // p108E2.InterfaceC2258q
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3231f c3231f = this.f61408o0;
        if (c3231f != null) {
            c3231f.f9802f = mode;
            c3231f.f9798b = true;
            c3231f.m4120a();
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61410q0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61410q0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC9106B3.m9636b(getContext(), i10));
    }
}
