package uk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20380j implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64451a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f64452b;

    /* JADX INFO: renamed from: c */
    public final TextView f64453c;

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f64454d;

    /* JADX INFO: renamed from: e */
    public final TextInputLayout f64455e;

    public C20380j(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, TextView textView2, TextInputLayout textInputLayout3) {
        this.f64451a = constraintLayout;
        this.f64452b = textInputLayout;
        this.f64453c = textView;
        this.f64454d = textInputLayout2;
        this.f64455e = textInputLayout3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64451a;
    }
}
