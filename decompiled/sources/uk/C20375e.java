package uk;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20375e implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64429a;

    /* JADX INFO: renamed from: b */
    public final TextView f64430b;

    /* JADX INFO: renamed from: c */
    public final TextInputLayout f64431c;

    /* JADX INFO: renamed from: d */
    public final TextView f64432d;

    /* JADX INFO: renamed from: e */
    public final TextInputLayout f64433e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout f64434f;

    public C20375e(ConstraintLayout constraintLayout, TextView textView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextView textView2, TextInputLayout textInputLayout2, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout3, TextInputEditText textInputEditText2) {
        this.f64429a = constraintLayout;
        this.f64430b = textView;
        this.f64431c = textInputLayout;
        this.f64432d = textView2;
        this.f64433e = textInputLayout2;
        this.f64434f = textInputLayout3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64429a;
    }
}
