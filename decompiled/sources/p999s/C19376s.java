package p999s;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.openai.chatgpt.R;
import p001A.C0072l;
import p030B2.AbstractC0738T;
import p030B2.C0751d;
import p030B2.C0755f;
import p030B2.InterfaceC0749c;
import p030B2.InterfaceC0785u;
import p082D2.AbstractC1857d;
import p084D4.C1904b;
import p108E2.C2257p;
import p108E2.InterfaceC2259r;
import p477Tb.C7296c;
import p523V9.AbstractC8166p4;
import p523V9.AbstractC8186s0;

/* JADX INFO: renamed from: s.s */
/* JADX INFO: loaded from: classes.dex */
public class C19376s extends EditText implements InterfaceC0785u, InterfaceC2259r {

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61367o0;

    /* JADX INFO: renamed from: p0 */
    public final C19321U f61368p0;

    /* JADX INFO: renamed from: q0 */
    public final C19388y f61369q0;

    /* JADX INFO: renamed from: r0 */
    public final C2257p f61370r0;

    /* JADX INFO: renamed from: s0 */
    public final C19388y f61371s0;

    /* JADX INFO: renamed from: t0 */
    public C19374r f61372t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19376s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC19313P0.m20399a(context);
        AbstractC19311O0.m20394a(this, getContext());
        C1904b c1904b = new C1904b(this);
        this.f61367o0 = c1904b;
        c1904b.m3003k(attributeSet, R.attr.editTextStyle);
        C19321U c19321u = new C19321U(this);
        this.f61368p0 = c19321u;
        c19321u.m20416f(attributeSet, R.attr.editTextStyle);
        c19321u.m20413b();
        C19388y c19388y = new C19388y();
        c19388y.f61405b = this;
        this.f61369q0 = c19388y;
        this.f61370r0 = new C2257p();
        C19388y c19388y2 = new C19388y(this);
        this.f61371s0 = c19388y2;
        c19388y2.mo20357b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM20488a = c19388y2.m20488a(keyListener);
        if (keyListenerM20488a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM20488a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C19374r getSuperCaller() {
        if (this.f61372t0 == null) {
            this.f61372t0 = new C19374r(this);
        }
        return this.f61372t0;
    }

    @Override // p030B2.InterfaceC0785u
    /* JADX INFO: renamed from: a */
    public final C0755f mo1533a(C0755f c0755f) {
        this.f61370r0.getClass();
        return C2257p.m3299a(this, c0755f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C19321U c19321u = this.f61368p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC8166p4.m8739g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f61368p0.m20414d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f61368p0.m20415e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C19388y c19388y;
        if (Build.VERSION.SDK_INT >= 28 || (c19388y = this.f61369q0) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c19388y.f61406c;
        return textClassifier == null ? AbstractC19308N.m20393a((TextView) c19388y.f61405b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM1578f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f61368p0.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC1857d.m2739c(editorInfo, getText());
        }
        AbstractC8186s0.m8768a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrM1578f = AbstractC0738T.m1578f(this)) != null) {
            AbstractC1857d.m2738b(editorInfo, strArrM1578f);
            inputConnectionOnCreateInputConnection = AbstractC1857d.m2737a(inputConnectionOnCreateInputConnection, editorInfo, new C0072l(this, 16));
        }
        return this.f61371s0.m20489c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean zM20346a = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && AbstractC0738T.m1578f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM20346a = AbstractC19284B.m20346a(dragEvent, this, activity);
            }
        }
        if (zM20346a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        C0751d c0751d;
        InterfaceC0749c interfaceC0749c;
        int i11;
        C7296c c7296c;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 || AbstractC0738T.m1578f(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i12 >= 31) {
                c7296c = new C7296c(primaryClip, 1);
            } else {
                c0751d = new C0751d();
                c0751d.f2125Z = primaryClip;
                c0751d.f2126o0 = 1;
            }
            if (i10 == 16908322) {
                interfaceC0749c = c0751d;
                interfaceC0749c = c7296c;
                i11 = 0;
            } else {
                interfaceC0749c = c0751d;
                interfaceC0749c = c7296c;
                i11 = 1;
            }
            interfaceC0749c.mo1598k(i11);
            AbstractC0738T.m1580h(this, interfaceC0749c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61368p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C19321U c19321u = this.f61368p0;
        if (c19321u != null) {
            c19321u.m20413b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC8166p4.m8740h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f61371s0.m20490d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f61371s0.m20488a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61367o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C19321U c19321u = this.f61368p0;
        c19321u.m20421k(colorStateList);
        c19321u.m20413b();
    }

    @Override // p108E2.InterfaceC2259r
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C19321U c19321u = this.f61368p0;
        c19321u.m20422l(mode);
        c19321u.m20413b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C19321U c19321u = this.f61368p0;
        if (c19321u != null) {
            c19321u.m20417g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C19388y c19388y;
        if (Build.VERSION.SDK_INT >= 28 || (c19388y = this.f61369q0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c19388y.f61406c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
