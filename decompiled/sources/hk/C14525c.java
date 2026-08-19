package hk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: hk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14525c implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45776a;

    /* JADX INFO: renamed from: b */
    public final View f45777b;

    /* JADX INFO: renamed from: c */
    public final View f45778c;

    public /* synthetic */ C14525c(View view, View view2, int i10) {
        this.f45776a = i10;
        this.f45777b = view;
        this.f45778c = view2;
    }

    /* JADX INFO: renamed from: a */
    public static C14525c m16033a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pi2_ui_image_lottie, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) viewInflate;
        return new C14525c(themeableLottieAnimationView, themeableLottieAnimationView, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C14525c m16034b(LayoutInflater layoutInflater, ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        layoutInflater.inflate(R.layout.pi2_ui_button_with_loading_indicator, buttonWithLoadingIndicator);
        ProgressBar progressBar = (ProgressBar) AbstractC9123E2.m9654b(buttonWithLoadingIndicator, R.id.progress_bar);
        if (progressBar != null) {
            return new C14525c(buttonWithLoadingIndicator, progressBar, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(buttonWithLoadingIndicator.getResources().getResourceName(R.id.progress_bar)));
    }

    /* JADX INFO: renamed from: c */
    public static C14525c m16035c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pi2_ui_image_view, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) viewInflate;
        return new C14525c(imageView, imageView, 2);
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        switch (this.f45776a) {
            case 0:
                return (ViewGroup) this.f45777b;
            case 1:
                return (ThemeableLottieAnimationView) this.f45777b;
            case 2:
                return (ImageView) this.f45777b;
            default:
                return (ConstraintLayout) this.f45777b;
        }
    }

    public C14525c(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4) {
        this.f45776a = 3;
        this.f45777b = constraintLayout;
        this.f45778c = textInputLayout2;
    }
}
