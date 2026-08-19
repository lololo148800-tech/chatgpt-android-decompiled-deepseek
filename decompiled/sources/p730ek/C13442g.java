package p730ek;

import android.view.View;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p665bk.C11483d;

/* JADX INFO: renamed from: ek.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13442g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42563Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11483d f42564Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SelfieOverlayView f42565o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f42566p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13442g(C11483d c11483d, SelfieOverlayView selfieOverlayView, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f42564Z = c11483d;
        this.f42565o0 = selfieOverlayView;
        this.f42566p0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1426a interfaceC1426a = this.f42566p0;
        SelfieOverlayView selfieOverlayView = this.f42565o0;
        C11483d c11483d = this.f42564Z;
        switch (this.f42563Y) {
            case 0:
                ThemeableLottieAnimationView themeableLottieAnimationView = c11483d.f34742d;
                int i10 = SelfieOverlayView.f40876S0;
                selfieOverlayView.getClass();
                SelfieOverlayView.m14567l(themeableLottieAnimationView, 200L).withEndAction(new RunnableC0156C(10, interfaceC1426a));
                View view = c11483d.f34744f;
                selfieOverlayView.getClass();
                SelfieOverlayView.m14567l(view, 200L);
                break;
            default:
                c11483d.f34742d.setFrame(0);
                ThemeableLottieAnimationView themeableLottieAnimationView2 = c11483d.f34742d;
                int i11 = SelfieOverlayView.f40876S0;
                selfieOverlayView.getClass();
                SelfieOverlayView.m14568m(themeableLottieAnimationView2, 200L).withEndAction(new RunnableC13439d(selfieOverlayView, c11483d, interfaceC1426a, 1));
                View view2 = c11483d.f34744f;
                selfieOverlayView.getClass();
                SelfieOverlayView.m14568m(view2, 200L);
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13442g(SelfieOverlayView selfieOverlayView, C11483d c11483d, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f42565o0 = selfieOverlayView;
        this.f42564Z = c11483d;
        this.f42566p0 = interfaceC1426a;
    }
}
