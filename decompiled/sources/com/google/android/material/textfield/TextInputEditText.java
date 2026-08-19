package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.openai.chatgpt.R;
import java.util.Locale;
import p160G5.p161rK.TVCuK;
import p174Gk.uSfJ.HpucjswO;
import p287La.AbstractC4967a;
import p783ha.AbstractC14431a;
import p999s.C19376s;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends C19376s {

    /* JADX INFO: renamed from: u0 */
    public final Rect f36710u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f36711v0;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        this.f36710u0 = new Rect();
        int[] iArr = AbstractC14431a.f45365F;
        AbstractC21828k.m22306a(context, attributeSet, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText);
        AbstractC21828k.m22307b(context, attributeSet, iArr, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f36711v0 || rect == null) {
            return;
        }
        Rect rect2 = this.f36710u0;
        textInputLayout.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !this.f36711v0) ? super.getGlobalVisibleRect(rect, point) : textInputLayout.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f36738Q0) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // p999s.C19376s, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f36711v0 || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight() - getHeight();
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom + height;
        Rect rect2 = this.f36710u0;
        rect2.set(i10, i11, i12, i13);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z6) {
        this.f36711v0 = z6;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f36738Q0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(TVCuK.RIOIudJOgNuS)) {
            setHint(HpucjswO.vAU);
        }
    }
}
