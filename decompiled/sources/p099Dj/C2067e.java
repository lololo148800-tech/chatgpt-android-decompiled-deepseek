package p099Dj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2067e implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f6336a;

    /* JADX INFO: renamed from: b */
    public final ImageView f6337b;

    /* JADX INFO: renamed from: c */
    public final ImageView f6338c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f6339d;

    /* JADX INFO: renamed from: e */
    public final TextView f6340e;

    /* JADX INFO: renamed from: f */
    public final ConstraintLayout f6341f;

    public C2067e(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, ConstraintLayout constraintLayout3) {
        this.f6336a = constraintLayout;
        this.f6337b = imageView;
        this.f6338c = imageView2;
        this.f6339d = constraintLayout2;
        this.f6340e = textView;
        this.f6341f = constraintLayout3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6336a;
    }
}
