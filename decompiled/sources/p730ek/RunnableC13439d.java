package p730ek;

import cn.UfGr.EhBykzn;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p665bk.C11483d;

/* JADX INFO: renamed from: ek.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13439d implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42543Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SelfieOverlayView f42544Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11483d f42545o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f42546p0;

    public /* synthetic */ RunnableC13439d(SelfieOverlayView selfieOverlayView, C11483d c11483d, InterfaceC1426a interfaceC1426a, int i10) {
        this.f42543Y = i10;
        this.f42544Z = selfieOverlayView;
        this.f42545o0 = c11483d;
        this.f42546p0 = interfaceC1426a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1426a interfaceC1426a = this.f42546p0;
        C11483d this_playBlinkAnimation = this.f42545o0;
        String str = EhBykzn.WEIxcYT;
        SelfieOverlayView selfieOverlayView = this.f42544Z;
        switch (this.f42543Y) {
            case 0:
                int i10 = SelfieOverlayView.f40876S0;
                AbstractC16544l.m18094g(selfieOverlayView, str);
                AbstractC16544l.m18094g(this_playBlinkAnimation, "$this_playBlinkAnimation");
                SelfieOverlayView.m14567l(this_playBlinkAnimation.f34740b, 80L).withEndAction(new RunnableC0156C(9, interfaceC1426a));
                break;
            default:
                AbstractC16544l.m18094g(selfieOverlayView, str);
                AbstractC16544l.m18094g(this_playBlinkAnimation, qffLJgOYizGmMj.FpH);
                selfieOverlayView.f40886P0.add(new C13442g(selfieOverlayView, this_playBlinkAnimation, interfaceC1426a));
                this_playBlinkAnimation.f34742d.m13144f();
                break;
        }
    }
}
