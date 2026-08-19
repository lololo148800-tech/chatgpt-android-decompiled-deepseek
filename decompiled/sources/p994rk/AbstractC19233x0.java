package p994rk;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.ViewOnClickListenerC1332J;
import p1113xn.AbstractC21322p;
import p594Y9.AbstractC9716D4;

/* JADX INFO: renamed from: rk.x0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19233x0 {
    /* JADX INFO: renamed from: a */
    public static final void m20329a(TextInputLayout textInputLayout, C19234x1 c19234x1) {
        EditText editText;
        EditText editText2;
        Object tag = textInputLayout.getTag(R.id.pi2_current_state);
        if (AbstractC16544l.m18089b(tag instanceof C19234x1 ? (C19234x1) tag : null, c19234x1)) {
            return;
        }
        textInputLayout.setTag(R.id.pi2_current_state, c19234x1);
        String str = c19234x1.f60982a;
        if (str != null && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setText(str);
        }
        String str2 = c19234x1.f60985d;
        if (str2 != null) {
            textInputLayout.setHint(str2);
        }
        String str3 = c19234x1.f60986e;
        if (str3 != null) {
            textInputLayout.setPlaceholderText(str3);
            AbstractC9716D4.m10309a(textInputLayout);
        }
        boolean zM18089b = AbstractC16544l.m18089b(c19234x1.f60984c, Boolean.TRUE);
        String str4 = c19234x1.f60983b;
        if (zM18089b && str4 != null) {
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(R.string.pi2_toggle_secure_button));
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(textInputLayout.getContext().getDrawable(R.drawable.pi2_material_ic_visibility_on));
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTransformationMethod(new C19126U1(str4));
            }
            textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC1332J(textInputLayout, 4, str4));
        }
        Object tag2 = textInputLayout.getTag(R.id.pi2_mask_text_watcher);
        C19237y1 c19237y1 = tag2 instanceof C19237y1 ? (C19237y1) tag2 : null;
        if (c19237y1 != null && (editText = textInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(c19237y1);
        }
        if (str4 == null || AbstractC21322p.m21681O(str4)) {
            return;
        }
        C19237y1 c19237y2 = new C19237y1(str4);
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.addTextChangedListener(c19237y2);
        }
        textInputLayout.setTag(R.id.pi2_mask_text_watcher, c19237y2);
    }
}
