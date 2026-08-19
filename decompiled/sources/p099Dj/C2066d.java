package p099Dj;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2066d implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f6326a;

    /* JADX INFO: renamed from: b */
    public final TextView f6327b;

    /* JADX INFO: renamed from: c */
    public final MaterialButton f6328c;

    /* JADX INFO: renamed from: d */
    public final ThemeableLottieAnimationView f6329d;

    /* JADX INFO: renamed from: e */
    public final View f6330e;

    /* JADX INFO: renamed from: f */
    public final ConstraintLayout f6331f;

    /* JADX INFO: renamed from: g */
    public final CardView f6332g;

    /* JADX INFO: renamed from: h */
    public final Pi2NavigationBar f6333h;

    /* JADX INFO: renamed from: i */
    public final TextView f6334i;

    /* JADX INFO: renamed from: j */
    public final Button f6335j;

    public C2066d(CoordinatorLayout coordinatorLayout, TextView textView, MaterialButton materialButton, ThemeableLottieAnimationView themeableLottieAnimationView, View view, ConstraintLayout constraintLayout, CardView cardView, Pi2NavigationBar pi2NavigationBar, TextView textView2, Button button) {
        this.f6326a = coordinatorLayout;
        this.f6327b = textView;
        this.f6328c = materialButton;
        this.f6329d = themeableLottieAnimationView;
        this.f6330e = view;
        this.f6331f = constraintLayout;
        this.f6332g = cardView;
        this.f6333h = pi2NavigationBar;
        this.f6334i = textView2;
        this.f6335j = button;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6326a;
    }
}
