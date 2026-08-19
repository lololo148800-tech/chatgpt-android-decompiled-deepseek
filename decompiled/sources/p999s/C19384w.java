package p999s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p084D4.C1904b;
import p108E2.InterfaceC2259r;
import p523V9.AbstractC8186s0;
import p571X9.AbstractC9106B3;
import p658b5.C11242m;

/* JADX INFO: renamed from: s.w */
/* JADX INFO: loaded from: classes.dex */
public final class C19384w extends MultiAutoCompleteTextView implements InterfaceC2259r {

    /* JADX INFO: renamed from: r0 */
    public static final int[] f61397r0 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61398o0;

    /* JADX INFO: renamed from: p0 */
    public final C19321U f61399p0;

    /* JADX INFO: renamed from: q0 */
    public final C19388y f61400q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19384w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.openai.chatgpt.R.attr.autoCompleteTextViewStyle);
        AbstractC19313P0.m20399a(context);
        AbstractC19311O0.m20394a(this, getContext());
        C11242m c11242mM12599G = C11242m.m12599G(getContext(), attributeSet, f61397r0, com.openai.chatgpt.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c11242mM12599G.f34019Z).hasValue(0)) {
            setDropDownBackgroundDrawable(c11242mM12599G.m12601B(0));
        }
        c11242mM12599G.m12606H();
        C1904b c1904b = new C1904b(this);
        this.f61398o0 = c1904b;
        c1904b.m3003k(attributeSet, com.openai.chatgpt.R.attr.autoCompleteTextViewStyle);
        C19321U c19321u = new C19321U(this);
        this.f61399p0 = c19321u;
        c19321u.m20416f(attributeSet, com.openai.chatgpt.R.attr.autoCompleteTextViewStyle);
        c19321u.m20413b();
        C19388y c19388y = new C19388y(this);
        this.f61400q0 = c19388y;
        c19388y.mo20357b(attributeSet, com.openai.chatgpt.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM20488a = c19388y.m20488a(keyListener);
        if (keyListenerM20488a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM20488a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C19321U c19321u = this.f61399p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61399p0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61399p0.m20415e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC8186s0.m8768a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f61400q0.m20489c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61399p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61399p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f61400q0.m20490d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f61400q0.m20488a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61398o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61399p0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61399p0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C19321U c19321u = this.f61399p0;
        if (c19321u != null) {
            c19321u.m20417g(context, i10);
        }
    }
}
