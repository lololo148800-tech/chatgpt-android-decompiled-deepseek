package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1071w0.C20699B;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;

/* JADX INFO: renamed from: zj.E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22095E0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69842Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22195t0 f69843Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC22180o0 f69844o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13421l f69845p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22107K0 f69846q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22095E0(C13421l c13421l, AbstractC22180o0 abstractC22180o0, C22195t0 c22195t0, C22107K0 c22107k0) {
        super(0);
        this.f69842Y = 2;
        this.f69845p0 = c13421l;
        this.f69846q0 = c22107k0;
        this.f69844o0 = abstractC22180o0;
        this.f69843Z = c22195t0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69842Y) {
            case 0:
                AbstractC22121S.m22369f(this.f69843Z, (AbstractC22165j0) this.f69844o0, this.f69845p0, this.f69846q0.f69887m);
                break;
            case 1:
                AbstractC22121S.m22369f(this.f69843Z, (AbstractC22165j0) this.f69844o0, this.f69845p0, this.f69846q0.f69887m);
                break;
            default:
                C13421l c13421l = this.f69845p0;
                InterfaceC13418i interfaceC13418iMo3400l = c13421l.f42503Y.mo3400l();
                AbstractC22180o0 abstractC22180o0 = this.f69844o0;
                C22195t0 c22195t0 = this.f69843Z;
                C22107K0 c22107k0 = this.f69846q0;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c22107k0, new C20699B(abstractC22180o0, c22195t0, c13421l, c22107k0, 2)));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22095E0(C22195t0 c22195t0, AbstractC22180o0 abstractC22180o0, C13421l c13421l, C22107K0 c22107k0, int i10) {
        super(0);
        this.f69842Y = i10;
        this.f69843Z = c22195t0;
        this.f69844o0 = abstractC22180o0;
        this.f69845p0 = c13421l;
        this.f69846q0 = c22107k0;
    }
}
