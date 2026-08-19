package uk;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: uk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C20383m implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f64462a;

    /* JADX INFO: renamed from: b */
    public final TextView f64463b;

    /* JADX INFO: renamed from: c */
    public final ImageView f64464c;

    /* JADX INFO: renamed from: d */
    public final TextView f64465d;

    /* JADX INFO: renamed from: e */
    public final TextView f64466e;

    /* JADX INFO: renamed from: f */
    public final MaterialCardView f64467f;

    /* JADX INFO: renamed from: g */
    public final ImageView f64468g;

    public C20383m(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, MaterialCardView materialCardView, ImageView imageView2) {
        this.f64462a = constraintLayout;
        this.f64463b = textView;
        this.f64464c = imageView;
        this.f64465d = textView2;
        this.f64466e = textView3;
        this.f64467f = materialCardView;
        this.f64468g = imageView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f64462a;
    }
}
