package p994rk;

import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21284g;

/* JADX INFO: renamed from: rk.g1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19168g1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60885Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19134X0 f60886Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19168g1(C14525c c14525c, C19134X0 c19134x0) {
        super(0);
        this.f60885Y = c14525c;
        this.f60886Z = c19134x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ThemeableLottieAnimationView lottieView = (ThemeableLottieAnimationView) this.f60885Y.f45778c;
        AbstractC16544l.m18093f(lottieView, "lottieView");
        AbstractC21284g.m21625a(lottieView, this.f60886Z.f60836Y.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
        return C17296C.f55119a;
    }
}
