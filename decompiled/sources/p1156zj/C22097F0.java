package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;

/* JADX INFO: renamed from: zj.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22097F0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69847Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f69848Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22107K0 f69849o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22097F0(C13421l c13421l, C22107K0 c22107k0, int i10) {
        super(0);
        this.f69847Y = i10;
        this.f69848Z = c13421l;
        this.f69849o0 = c22107k0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69847Y) {
            case 0:
                InterfaceC13418i interfaceC13418iMo3400l = this.f69848Z.f42503Y.mo3400l();
                C22107K0 c22107k0 = this.f69849o0;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c22107k0, new C22087A0(c22107k0, 1)));
                break;
            case 1:
                AbstractC22120R0.m22359f(this.f69848Z, this.f69849o0.f69887m);
                break;
            case 2:
                AbstractC22120R0.m22359f(this.f69848Z, this.f69849o0.f69887m);
                break;
            case 3:
                AbstractC22120R0.m22362i(this.f69848Z, C22201v0.f70382a, this.f69849o0.f69887m);
                break;
            case 4:
                AbstractC22120R0.m22359f(this.f69848Z, this.f69849o0.f69887m);
                break;
            case 5:
                InterfaceC13418i interfaceC13418iMo3400l2 = this.f69848Z.f42503Y.mo3400l();
                C22107K0 c22107k1 = this.f69849o0;
                interfaceC13418iMo3400l2.mo3393B(AbstractC8215v5.m8839a(c22107k1, new C22087A0(c22107k1, 2)));
                break;
            default:
                AbstractC22120R0.m22359f(this.f69848Z, this.f69849o0.f69887m);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22097F0(C22107K0 c22107k0, C13421l c13421l) {
        super(0);
        this.f69847Y = 3;
        this.f69849o0 = c22107k0;
        this.f69848Z = c13421l;
    }
}
