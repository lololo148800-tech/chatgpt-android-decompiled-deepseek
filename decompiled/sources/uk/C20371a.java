package uk;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20371a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f64399a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f64400b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f64401c;

    /* JADX INFO: renamed from: d */
    public final View f64402d;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f64403e;

    /* JADX INFO: renamed from: f */
    public final TextInputEditText f64404f;

    /* JADX INFO: renamed from: g */
    public final TextInputLayout f64405g;

    /* JADX INFO: renamed from: h */
    public final View f64406h;

    /* JADX INFO: renamed from: i */
    public final TextView f64407i;

    /* JADX INFO: renamed from: j */
    public final MaterialToolbar f64408j;

    public C20371a(FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, View view, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, View view2, TextView textView, MaterialToolbar materialToolbar) {
        this.f64399a = frameLayout;
        this.f64400b = frameLayout2;
        this.f64401c = linearLayout;
        this.f64402d = view;
        this.f64403e = recyclerView;
        this.f64404f = textInputEditText;
        this.f64405g = textInputLayout;
        this.f64406h = view2;
        this.f64407i = textView;
        this.f64408j = materialToolbar;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64399a;
    }
}
