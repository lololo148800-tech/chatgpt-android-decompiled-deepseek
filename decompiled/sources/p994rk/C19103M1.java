package p994rk;

import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21284g;

/* JADX INFO: renamed from: rk.M1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19103M1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60792Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19094J1 f60793Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19103M1(C14525c c14525c, C19094J1 c19094j1) {
        super(0);
        this.f60792Y = c14525c;
        this.f60793Z = c19094j1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C14525c c14525c = this.f60792Y;
        ThemeableLottieAnimationView lottieView = (ThemeableLottieAnimationView) c14525c.f45778c;
        AbstractC16544l.m18093f(lottieView, "lottieView");
        AbstractC21284g.m21627c(lottieView, this.f60793Z.f60779Y);
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) c14525c.f45778c;
        themeableLottieAnimationView.setRepeatMode(1);
        themeableLottieAnimationView.setRepeatCount(-1);
        themeableLottieAnimationView.m13144f();
        return C17296C.f55119a;
    }
}
