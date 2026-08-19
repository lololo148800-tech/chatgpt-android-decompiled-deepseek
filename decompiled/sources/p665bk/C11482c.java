package p665bk;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: bk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11482c implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ScrollView f34730a;

    /* JADX INFO: renamed from: b */
    public final ImageView f34731b;

    /* JADX INFO: renamed from: c */
    public final ThemeableLottieAnimationView f34732c;

    /* JADX INFO: renamed from: d */
    public final Pi2NavigationBar f34733d;

    /* JADX INFO: renamed from: e */
    public final ConstraintLayout f34734e;

    /* JADX INFO: renamed from: f */
    public final Button f34735f;

    /* JADX INFO: renamed from: g */
    public final TextView f34736g;

    /* JADX INFO: renamed from: h */
    public final TextView f34737h;

    /* JADX INFO: renamed from: i */
    public final TextView f34738i;

    public C11482c(ScrollView scrollView, ImageView imageView, ThemeableLottieAnimationView themeableLottieAnimationView, Pi2NavigationBar pi2NavigationBar, ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, TextView textView3) {
        this.f34730a = scrollView;
        this.f34731b = imageView;
        this.f34732c = themeableLottieAnimationView;
        this.f34733d = pi2NavigationBar;
        this.f34734e = constraintLayout;
        this.f34735f = button;
        this.f34736g = textView;
        this.f34737h = textView2;
        this.f34738i = textView3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f34730a;
    }
}
