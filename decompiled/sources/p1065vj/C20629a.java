package p1065vj;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: vj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20629a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f65470a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f65471b;

    /* JADX INFO: renamed from: c */
    public final TextView f65472c;

    /* JADX INFO: renamed from: d */
    public final ThemeableLottieAnimationView f65473d;

    /* JADX INFO: renamed from: e */
    public final TextView f65474e;

    public C20629a(TextView textView, TextView textView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f65470a = constraintLayout;
        this.f65471b = constraintLayout2;
        this.f65472c = textView;
        this.f65473d = themeableLottieAnimationView;
        this.f65474e = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f65470a;
    }
}
