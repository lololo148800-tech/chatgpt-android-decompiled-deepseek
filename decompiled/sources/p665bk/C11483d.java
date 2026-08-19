package p665bk;

import android.view.View;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: bk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11483d implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final SelfieOverlayView f34739a;

    /* JADX INFO: renamed from: b */
    public final View f34740b;

    /* JADX INFO: renamed from: c */
    public final Pi2CircleMaskView f34741c;

    /* JADX INFO: renamed from: d */
    public final ThemeableLottieAnimationView f34742d;

    /* JADX INFO: renamed from: e */
    public final ImageView f34743e;

    /* JADX INFO: renamed from: f */
    public final View f34744f;

    /* JADX INFO: renamed from: g */
    public final View f34745g;

    /* JADX INFO: renamed from: h */
    public final Pi2ProgressArcView f34746h;

    public C11483d(SelfieOverlayView selfieOverlayView, View view, Pi2CircleMaskView pi2CircleMaskView, ThemeableLottieAnimationView themeableLottieAnimationView, ImageView imageView, View view2, View view3, Pi2ProgressArcView pi2ProgressArcView) {
        this.f34739a = selfieOverlayView;
        this.f34740b = view;
        this.f34741c = pi2CircleMaskView;
        this.f34742d = themeableLottieAnimationView;
        this.f34743e = imageView;
        this.f34744f = view2;
        this.f34745g = view3;
        this.f34746h = pi2ProgressArcView;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f34739a;
    }
}
