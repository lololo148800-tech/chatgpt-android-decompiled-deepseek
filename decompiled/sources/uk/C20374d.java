package uk;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20374d implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64427a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f64428b;

    public /* synthetic */ C20374d(ViewGroup viewGroup, int i10) {
        this.f64427a = i10;
        this.f64428b = viewGroup;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        switch (this.f64427a) {
            case 0:
                return (ConstraintLayout) this.f64428b;
            case 1:
                return (ConstraintLayout) this.f64428b;
            default:
                return (TextInputLayout) this.f64428b;
        }
    }
}
