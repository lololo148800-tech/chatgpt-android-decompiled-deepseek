package p099Dj;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: Dj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2064b implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f6291a;

    /* JADX INFO: renamed from: b */
    public final ProgressBar f6292b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f6293c;

    /* JADX INFO: renamed from: d */
    public final Button f6294d;

    /* JADX INFO: renamed from: e */
    public final TextView f6295e;

    /* JADX INFO: renamed from: f */
    public final TextView f6296f;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f6297g;

    /* JADX INFO: renamed from: h */
    public final ToggleButton f6298h;

    /* JADX INFO: renamed from: i */
    public final TextView f6299i;

    /* JADX INFO: renamed from: j */
    public final FrameLayout f6300j;

    /* JADX INFO: renamed from: k */
    public final Pi2NavigationBar f6301k;

    /* JADX INFO: renamed from: l */
    public final View f6302l;

    /* JADX INFO: renamed from: m */
    public final ImageView f6303m;

    /* JADX INFO: renamed from: n */
    public final ConstraintLayout f6304n;

    /* JADX INFO: renamed from: o */
    public final ThemeableLottieAnimationView f6305o;

    /* JADX INFO: renamed from: p */
    public final ConstraintLayout f6306p;

    /* JADX INFO: renamed from: q */
    public final TextView f6307q;

    /* JADX INFO: renamed from: r */
    public final View f6308r;

    /* JADX INFO: renamed from: s */
    public final PreviewView f6309s;

    /* JADX INFO: renamed from: t */
    public final ProgressBar f6310t;

    /* JADX INFO: renamed from: u */
    public final LottieAnimationView f6311u;

    /* JADX INFO: renamed from: v */
    public final ScanningView f6312v;

    /* JADX INFO: renamed from: w */
    public final SpotlightView f6313w;

    /* JADX INFO: renamed from: x */
    public final TextView f6314x;

    public C2064b(FrameLayout frameLayout, Camera2PreviewView camera2PreviewView, ProgressBar progressBar, ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, LinearLayout linearLayout, ToggleButton toggleButton, TextView textView3, FrameLayout frameLayout2, Pi2NavigationBar pi2NavigationBar, View view, ImageView imageView, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout3, TextView textView4, View view2, PreviewView previewView, ProgressBar progressBar2, LottieAnimationView lottieAnimationView, ScanningView scanningView, SpotlightView spotlightView, TextView textView5) {
        this.f6291a = frameLayout;
        this.f6292b = progressBar;
        this.f6293c = constraintLayout;
        this.f6294d = button;
        this.f6295e = textView;
        this.f6296f = textView2;
        this.f6297g = linearLayout;
        this.f6298h = toggleButton;
        this.f6299i = textView3;
        this.f6300j = frameLayout2;
        this.f6301k = pi2NavigationBar;
        this.f6302l = view;
        this.f6303m = imageView;
        this.f6304n = constraintLayout2;
        this.f6305o = themeableLottieAnimationView;
        this.f6306p = constraintLayout3;
        this.f6307q = textView4;
        this.f6308r = view2;
        this.f6309s = previewView;
        this.f6310t = progressBar2;
        this.f6311u = lottieAnimationView;
        this.f6312v = scanningView;
        this.f6313w = spotlightView;
        this.f6314x = textView5;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f6291a;
    }
}
