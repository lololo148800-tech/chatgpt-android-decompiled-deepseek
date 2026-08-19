package p099Dj;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2065c implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f6315a;

    /* JADX INFO: renamed from: b */
    public final Space f6316b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f6317c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f6318d;

    /* JADX INFO: renamed from: e */
    public final Button f6319e;

    /* JADX INFO: renamed from: f */
    public final ThemeableLottieAnimationView f6320f;

    /* JADX INFO: renamed from: g */
    public final ConstraintLayout f6321g;

    /* JADX INFO: renamed from: h */
    public final TextView f6322h;

    /* JADX INFO: renamed from: i */
    public final View f6323i;

    /* JADX INFO: renamed from: j */
    public final TextView f6324j;

    /* JADX INFO: renamed from: k */
    public final TextView f6325k;

    public C2065c(FrameLayout frameLayout, Space space, FrameLayout frameLayout2, LinearLayout linearLayout, Button button, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, TextView textView3) {
        this.f6315a = frameLayout;
        this.f6316b = space;
        this.f6317c = frameLayout2;
        this.f6318d = linearLayout;
        this.f6319e = button;
        this.f6320f = themeableLottieAnimationView;
        this.f6321g = constraintLayout;
        this.f6322h = textView;
        this.f6323i = view;
        this.f6324j = textView2;
        this.f6325k = textView3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6315a;
    }
}
