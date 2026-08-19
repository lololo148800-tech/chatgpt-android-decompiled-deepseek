package p099Dj;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2071i implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f6384a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f6385b;

    /* JADX INFO: renamed from: c */
    public final Button f6386c;

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f6387d;

    /* JADX INFO: renamed from: e */
    public final TextView f6388e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout f6389f;

    /* JADX INFO: renamed from: g */
    public final TextView f6390g;

    /* JADX INFO: renamed from: h */
    public final Pi2NavigationBar f6391h;

    /* JADX INFO: renamed from: i */
    public final TextView f6392i;

    public C2071i(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, Button button, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, TextView textView2, Pi2NavigationBar pi2NavigationBar, TextView textView3) {
        this.f6384a = coordinatorLayout;
        this.f6385b = linearLayout;
        this.f6386c = button;
        this.f6387d = textInputLayout;
        this.f6388e = textView;
        this.f6389f = textInputLayout2;
        this.f6390g = textView2;
        this.f6391h = pi2NavigationBar;
        this.f6392i = textView3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6384a;
    }
}
