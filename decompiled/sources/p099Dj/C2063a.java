package p099Dj;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2063a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f6286a;

    /* JADX INFO: renamed from: b */
    public final Button f6287b;

    /* JADX INFO: renamed from: c */
    public final ThemeableLottieAnimationView f6288c;

    /* JADX INFO: renamed from: d */
    public final Pi2NavigationBar f6289d;

    /* JADX INFO: renamed from: e */
    public final TextView f6290e;

    public C2063a(CoordinatorLayout coordinatorLayout, Button button, ThemeableLottieAnimationView themeableLottieAnimationView, Pi2NavigationBar pi2NavigationBar, TextView textView) {
        this.f6286a = coordinatorLayout;
        this.f6287b = button;
        this.f6288c = themeableLottieAnimationView;
        this.f6289d = pi2NavigationBar;
        this.f6290e = textView;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6286a;
    }
}
