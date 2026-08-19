package p730ek;

import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ek.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C13441f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42560Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SelfieOverlayView f42561Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f42562o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13441f(SelfieOverlayView selfieOverlayView, InterfaceC1426a interfaceC1426a, int i10) {
        super(0);
        this.f42560Y = i10;
        this.f42561Z = selfieOverlayView;
        this.f42562o0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f42560Y) {
            case 0:
                SelfieOverlayView selfieOverlayView = this.f42561Z;
                selfieOverlayView.m14572p(selfieOverlayView.f40877G0, R.raw.pi2_selfie_capture_success, this.f42562o0);
                break;
            default:
                SelfieOverlayView selfieOverlayView2 = this.f42561Z;
                selfieOverlayView2.m14572p(selfieOverlayView2.f40877G0, R.raw.pi2_selfie_capture_success, this.f42562o0);
                break;
        }
        return C17296C.f55119a;
    }
}
