package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.openai.chatgpt.R;
import p030B2.AbstractC0738T;
import p084D4.C1904b;
import p108E2.InterfaceC2259r;
import p183H4.C3231f;
import p523V9.AbstractC8166p4;
import p523V9.AbstractC8186s0;
import p571X9.AbstractC9106B3;
import p658b5.C11242m;
import p880m.AbstractC17123a;

/* JADX INFO: renamed from: s.p */
/* JADX INFO: loaded from: classes.dex */
public final class C19370p extends CheckedTextView implements InterfaceC2259r {

    /* JADX INFO: renamed from: o0 */
    public final C3231f f61348o0;

    /* JADX INFO: renamed from: p0 */
    public final C1904b f61349p0;

    /* JADX INFO: renamed from: q0 */
    public final C19321U f61350q0;

    /* JADX INFO: renamed from: r0 */
    public C19378t f61351r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19370p(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC19313P0.m20399a(context);
        AbstractC19311O0.m20394a(this, getContext());
        C19321U c19321u = new C19321U(this);
        this.f61350q0 = c19321u;
        c19321u.m20416f(attributeSet, R.attr.checkedTextViewStyle);
        c19321u.m20413b();
        C1904b c1904b = new C1904b(this);
        this.f61349p0 = c1904b;
        c1904b.m3003k(attributeSet, R.attr.checkedTextViewStyle);
        this.f61348o0 = new C3231f(this);
        Context context2 = getContext();
        int[] iArr = AbstractC17123a.f54743l;
        C11242m c11242mM12599G = C11242m.m12599G(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        AbstractC0738T.m1583k(this, getContext(), iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC9106B3.m9636b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC9106B3.m9636b(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC9106B3.m9636b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c11242mM12599G.m12600A(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC19357i0.m20463b(typedArray.getInt(3, -1), null));
            }
            c11242mM12599G.m12606H();
            getEmojiTextViewHelper().m20479a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th2) {
            c11242mM12599G.m12606H();
            throw th2;
        }
    }

    private C19378t getEmojiTextViewHelper() {
        if (this.f61351r0 == null) {
            this.f61351r0 = new C19378t(this);
        }
        return this.f61351r0;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C19321U c19321u = this.f61350q0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C3231f c3231f = this.f61348o0;
        if (c3231f != null) {
            c3231f.m4121b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC8166p4.m8739g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3231f c3231f = this.f61348o0;
        if (c3231f != null) {
            return (ColorStateList) c3231f.f9801e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3231f c3231f = this.f61348o0;
        if (c3231f != null) {
            return (PorterDuff.Mode) c3231f.f9802f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61350q0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61350q0.m20415e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC8186s0.m8768a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m20480b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3231f c3231f = this.f61348o0;
        if (c3231f != null) {
            if (c3231f.f9799c) {
                c3231f.f9799c = false;
            } else {
                c3231f.f9799c = true;
                c3231f.m4121b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61350q0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61350q0;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61349p0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3231f c3231f = this.f61348o0;
        if (c3231f != null) {
            c3231f.f9801e = colorStateList;
            c3231f.f9797a = true;
            c3231f.m4121b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3231f c3231f = this.f61348o0;
        if (c3231f != null) {
            c3231f.f9802f = mode;
            c3231f.f9798b = true;
            c3231f.m4121b();
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61350q0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61350q0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C19321U c19321u = this.f61350q0;
        if (c19321u != null) {
            c19321u.m20417g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC9106B3.m9636b(getContext(), i10));
    }
}
