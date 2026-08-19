package uk;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20379i implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f64447a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f64448b;

    /* JADX INFO: renamed from: c */
    public final TextView f64449c;

    /* JADX INFO: renamed from: d */
    public final TextView f64450d;

    public C20379i(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f64447a = linearLayout;
        this.f64448b = linearLayout2;
        this.f64449c = textView;
        this.f64450d = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64447a;
    }
}
