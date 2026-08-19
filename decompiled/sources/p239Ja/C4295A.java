package p239Ja;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p030B2.C0747b;
import p056C2.C1512f;
import p999s.C19329Y;

/* JADX INFO: renamed from: Ja.A */
/* JADX INFO: loaded from: classes.dex */
public final class C4295A extends C0747b {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f13971d;

    public C4295A(TextInputLayout textInputLayout) {
        this.f13971d = textInputLayout;
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2118a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f13971d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z6 = textInputLayout.f36718C1;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C4321x c4321x = textInputLayout.f36764p0;
        C19329Y c19329y = c4321x.f14089p0;
        if (c19329y.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c19329y);
            accessibilityNodeInfo.setTraversalAfter(c19329y);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c4321x.f14091r0);
        }
        if (!zIsEmpty) {
            c1512f.m2223m(text);
        } else if (!TextUtils.isEmpty(string)) {
            c1512f.m2223m(string);
            if (!z6 && placeholderText != null) {
                c1512f.m2223m(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c1512f.m2223m(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                c1512f.m2221k(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c1512f.m2223m(string);
            }
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                c1512f.m2218h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C19329Y c19329y2 = textInputLayout.f36780x0.f14078y;
        if (c19329y2 != null) {
            accessibilityNodeInfo.setLabelFor(c19329y2);
        }
        textInputLayout.f36766q0.m5108b().mo5063n(c1512f);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: e */
    public final void mo1591e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1591e(view, accessibilityEvent);
        this.f13971d.f36766q0.m5108b().mo5064o(accessibilityEvent);
    }
}
