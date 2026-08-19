package p994rk;

import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21284g;

/* JADX INFO: renamed from: rk.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19140Z0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60843Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19134X0 f60844Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String[] f60845o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String[] f60846p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19140Z0(C14525c c14525c, C19134X0 c19134x0, String[] strArr, String[] strArr2) {
        super(0);
        this.f60843Y = c14525c;
        this.f60844Z = c19134x0;
        this.f60845o0 = strArr;
        this.f60846p0 = strArr2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ThemeableLottieAnimationView lottieView = (ThemeableLottieAnimationView) this.f60843Y.f45778c;
        AbstractC16544l.m18093f(lottieView, "lottieView");
        AbstractC21284g.m21625a(lottieView, this.f60844Z.f60836Y.getStyles(), this.f60845o0, this.f60846p0, new String[0]);
        return C17296C.f55119a;
    }
}
