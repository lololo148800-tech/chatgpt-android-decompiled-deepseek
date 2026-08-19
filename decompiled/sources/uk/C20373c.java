package uk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20373c implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64413a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f64414b;

    /* JADX INFO: renamed from: c */
    public final TextView f64415c;

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f64416d;

    /* JADX INFO: renamed from: e */
    public final MaterialAutoCompleteTextView f64417e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout f64418f;

    /* JADX INFO: renamed from: g */
    public final MaterialAutoCompleteTextView f64419g;

    /* JADX INFO: renamed from: h */
    public final ConstraintLayout f64420h;

    /* JADX INFO: renamed from: i */
    public final ConstraintLayout f64421i;

    /* JADX INFO: renamed from: j */
    public final TextView f64422j;

    /* JADX INFO: renamed from: k */
    public final TextInputLayout f64423k;

    /* JADX INFO: renamed from: l */
    public final TextInputLayout f64424l;

    /* JADX INFO: renamed from: m */
    public final TextInputLayout f64425m;

    /* JADX INFO: renamed from: n */
    public final CircularProgressIndicator f64426n;

    public C20373c(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, MaterialAutoCompleteTextView materialAutoCompleteTextView, TextInputLayout textInputLayout3, MaterialAutoCompleteTextView materialAutoCompleteTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView2, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, CircularProgressIndicator circularProgressIndicator) {
        this.f64413a = constraintLayout;
        this.f64414b = textInputLayout;
        this.f64415c = textView;
        this.f64416d = textInputLayout2;
        this.f64417e = materialAutoCompleteTextView;
        this.f64418f = textInputLayout3;
        this.f64419g = materialAutoCompleteTextView2;
        this.f64420h = constraintLayout2;
        this.f64421i = constraintLayout3;
        this.f64422j = textView2;
        this.f64423k = textInputLayout4;
        this.f64424l = textInputLayout5;
        this.f64425m = textInputLayout6;
        this.f64426n = circularProgressIndicator;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64413a;
    }
}
