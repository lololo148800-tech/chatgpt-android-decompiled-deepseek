package p239Ja;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputNumberComponent;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2153Q0;
import p1066vk.C20642j;
import p1113xn.AbstractC21328v;
import p749fd.C13628m;

/* JADX INFO: renamed from: Ja.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4322y implements TextWatcher {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14098Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f14099Z;

    public /* synthetic */ C4322y(Object obj, int i10) {
        this.f14098Y = i10;
        this.f14099Z = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s10) {
        String string;
        switch (this.f14098Y) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.f14099Z;
                textInputLayout.m13675u(!textInputLayout.f36730I1, false);
                if (textInputLayout.f36782y0) {
                    textInputLayout.m13669o(s10);
                }
                if (textInputLayout.f36725G0) {
                    textInputLayout.m13676v(s10);
                }
                break;
            case 1:
                AbstractC16544l.m18094g(s10, "s");
                break;
            case 2:
                ((C2153Q0) ((InputNumberComponent) this.f14099Z).numberController.f34081Z).setValue((s10 == null || (string = s10.toString()) == null) ? null : AbstractC21328v.m21719f(string));
                break;
            default:
                String strValueOf = String.valueOf(s10);
                C20642j c20642j = (C20642j) this.f14099Z;
                c20642j.f65515h = strValueOf;
                c20642j.m21198g();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f14098Y;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f14098Y) {
            case 1:
                ((C13628m) this.f14099Z).invoke(charSequence);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m5137a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: b */
    private final void m5138b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m5139c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m5140d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: e */
    private final void m5141e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: f */
    private final void m5142f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: g */
    private final void m5143g(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
