package p1065vj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: vj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20630b implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f65475a;

    /* JADX INFO: renamed from: b */
    public final ThemeableLottieAnimationView f65476b;

    /* JADX INFO: renamed from: c */
    public final MaterialCardView f65477c;

    public C20630b(ConstraintLayout constraintLayout, ThemeableLottieAnimationView themeableLottieAnimationView, MaterialCardView materialCardView) {
        this.f65475a = constraintLayout;
        this.f65476b = themeableLottieAnimationView;
        this.f65477c = materialCardView;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f65475a;
    }
}
