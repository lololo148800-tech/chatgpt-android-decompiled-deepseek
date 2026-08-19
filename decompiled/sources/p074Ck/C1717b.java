package p074Ck;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.SignatureView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Ck.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1717b implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f4918a;

    /* JADX INFO: renamed from: b */
    public final Button f4919b;

    /* JADX INFO: renamed from: c */
    public final ImageView f4920c;

    /* JADX INFO: renamed from: d */
    public final Button f4921d;

    /* JADX INFO: renamed from: e */
    public final View f4922e;

    /* JADX INFO: renamed from: f */
    public final SignatureView f4923f;

    /* JADX INFO: renamed from: g */
    public final TextView f4924g;

    /* JADX INFO: renamed from: h */
    public final TextView f4925h;

    /* JADX INFO: renamed from: i */
    public final ConstraintLayout f4926i;

    public C1717b(FrameLayout frameLayout, Button button, ImageView imageView, Button button2, View view, SignatureView signatureView, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.f4918a = frameLayout;
        this.f4919b = button;
        this.f4920c = imageView;
        this.f4921d = button2;
        this.f4922e = view;
        this.f4923f = signatureView;
        this.f4924g = textView;
        this.f4925h = textView2;
        this.f4926i = constraintLayout;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f4918a;
    }
}
