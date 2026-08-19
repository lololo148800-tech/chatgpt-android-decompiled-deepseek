package p239Ja;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: Ja.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4311n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4313p f14014a;

    public C4311n(C4313p c4313p) {
        this.f14014a = c4313p;
    }

    /* JADX INFO: renamed from: a */
    public final void m5067a(TextInputLayout textInputLayout) {
        C4313p c4313p = this.f14014a;
        if (c4313p.f14026G0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c4313p.f14026G0;
        C4310m c4310m = c4313p.f14029J0;
        if (editText != null) {
            editText.removeTextChangedListener(c4310m);
            if (c4313p.f14026G0.getOnFocusChangeListener() == c4313p.m5108b().mo5044e()) {
                c4313p.f14026G0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c4313p.f14026G0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c4310m);
        }
        c4313p.m5108b().mo5047m(c4313p.f14026G0);
        c4313p.m5115i(c4313p.m5108b());
    }
}
