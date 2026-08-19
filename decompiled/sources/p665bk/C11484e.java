package p665bk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: bk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C11484e implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f34747a;

    /* JADX INFO: renamed from: b */
    public final ThemeableLottieAnimationView f34748b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f34749c;

    /* JADX INFO: renamed from: d */
    public final TextView f34750d;

    /* JADX INFO: renamed from: e */
    public final TextView f34751e;

    public C11484e(TextView textView, TextView textView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f34747a = constraintLayout;
        this.f34748b = themeableLottieAnimationView;
        this.f34749c = constraintLayout2;
        this.f34750d = textView;
        this.f34751e = textView2;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f34747a;
    }
}
