package uk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import p396Q4.InterfaceC6571a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: uk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20378h implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64444a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f64445b;

    /* JADX INFO: renamed from: c */
    public final TextInputLayout f64446c;

    public /* synthetic */ C20378h(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, int i10) {
        this.f64444a = i10;
        this.f64445b = textInputLayout;
        this.f64446c = textInputLayout2;
    }

    /* JADX INFO: renamed from: a */
    public static C20378h m21046a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pi2_ui_list_select, (ViewGroup) null, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate;
        if (((AutoCompleteTextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_input_select)) != null) {
            return new C20378h(textInputLayout, textInputLayout, 3);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.textview_input_select)));
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        switch (this.f64444a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f64445b;
    }

    public /* synthetic */ C20378h(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, int i10) {
        this.f64444a = i10;
        this.f64445b = textInputLayout;
        this.f64446c = textInputLayout2;
    }
}
