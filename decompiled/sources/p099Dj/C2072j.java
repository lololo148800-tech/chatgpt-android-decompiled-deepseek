package p099Dj;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2072j implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f6393a;

    /* JADX INFO: renamed from: b */
    public final ThemeableLottieAnimationView f6394b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f6395c;

    /* JADX INFO: renamed from: d */
    public final TextView f6396d;

    /* JADX INFO: renamed from: e */
    public final TextView f6397e;

    public C2072j(TextView textView, TextView textView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f6393a = constraintLayout;
        this.f6394b = themeableLottieAnimationView;
        this.f6395c = constraintLayout2;
        this.f6396d = textView;
        this.f6397e = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6393a;
    }
}
