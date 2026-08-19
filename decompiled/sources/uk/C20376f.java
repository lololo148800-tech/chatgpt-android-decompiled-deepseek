package uk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.openai.chatgpt.R;
import p396Q4.InterfaceC6571a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: uk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20376f implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64435a;

    /* JADX INFO: renamed from: b */
    public final MaterialCheckBox f64436b;

    /* JADX INFO: renamed from: c */
    public final TextView f64437c;

    /* JADX INFO: renamed from: d */
    public final TextView f64438d;

    /* JADX INFO: renamed from: e */
    public final TextView f64439e;

    public C20376f(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, TextView textView2, TextView textView3) {
        this.f64435a = constraintLayout;
        this.f64436b = materialCheckBox;
        this.f64437c = textView;
        this.f64438d = textView2;
        this.f64439e = textView3;
    }

    /* JADX INFO: renamed from: a */
    public static C20376f m21045a(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.pi2_ui_input_checkbox, (ViewGroup) linearLayout, false);
        int i10 = R.id.bottom_barrier;
        if (((Barrier) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_barrier)) != null) {
            i10 = R.id.checkbox;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC9123E2.m9654b(viewInflate, R.id.checkbox);
            if (materialCheckBox != null) {
                i10 = R.id.checkbox_description;
                TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.checkbox_description);
                if (textView != null) {
                    i10 = R.id.checkbox_error;
                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.checkbox_error);
                    if (textView2 != null) {
                        i10 = R.id.checkbox_label;
                        TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.checkbox_label);
                        if (textView3 != null) {
                            return new C20376f((ConstraintLayout) viewInflate, materialCheckBox, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64435a;
    }
}
