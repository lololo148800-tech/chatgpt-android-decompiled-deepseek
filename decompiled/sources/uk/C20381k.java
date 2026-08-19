package uk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20381k implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64456a;

    /* JADX INFO: renamed from: b */
    public final MaterialCheckBox f64457b;

    /* JADX INFO: renamed from: c */
    public final TextView f64458c;

    public C20381k(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView) {
        this.f64456a = constraintLayout;
        this.f64457b = materialCheckBox;
        this.f64458c = textView;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64456a;
    }
}
