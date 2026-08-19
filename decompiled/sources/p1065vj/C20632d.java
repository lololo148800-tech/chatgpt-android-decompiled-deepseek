package p1065vj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: vj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20632d implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f65485a;

    /* JADX INFO: renamed from: b */
    public final MaterialCardView f65486b;

    /* JADX INFO: renamed from: c */
    public final TextView f65487c;

    /* JADX INFO: renamed from: d */
    public final ImageView f65488d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f65489e;

    /* JADX INFO: renamed from: f */
    public final CircularProgressIndicator f65490f;

    /* JADX INFO: renamed from: g */
    public final ThemeableLottieAnimationView f65491g;

    public C20632d(ConstraintLayout constraintLayout, MaterialCardView materialCardView, TextView textView, ImageView imageView, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f65485a = constraintLayout;
        this.f65486b = materialCardView;
        this.f65487c = textView;
        this.f65488d = imageView;
        this.f65489e = linearLayout;
        this.f65490f = circularProgressIndicator;
        this.f65491g = themeableLottieAnimationView;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f65485a;
    }
}
