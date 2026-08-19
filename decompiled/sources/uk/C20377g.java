package uk;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20377g implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f64440a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f64441b;

    /* JADX INFO: renamed from: c */
    public final TextView f64442c;

    /* JADX INFO: renamed from: d */
    public final TextView f64443d;

    public C20377g(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f64440a = linearLayout;
        this.f64441b = linearLayout2;
        this.f64442c = textView;
        this.f64443d = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64440a;
    }
}
