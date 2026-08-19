package uk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20372b implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64409a;

    /* JADX INFO: renamed from: b */
    public final MaterialRadioButton f64410b;

    /* JADX INFO: renamed from: c */
    public final TextView f64411c;

    /* JADX INFO: renamed from: d */
    public final TextView f64412d;

    public C20372b(ConstraintLayout constraintLayout, MaterialRadioButton materialRadioButton, TextView textView, TextView textView2) {
        this.f64409a = constraintLayout;
        this.f64410b = materialRadioButton;
        this.f64411c = textView;
        this.f64412d = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64409a;
    }
}
