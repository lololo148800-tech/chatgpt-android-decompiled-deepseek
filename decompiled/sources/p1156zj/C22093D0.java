package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1071w0.C20720L0;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.InterfaceC13418i;

/* JADX INFO: renamed from: zj.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22093D0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69834Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f69835Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22107K0 f69836o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC22180o0 f69837p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22093D0(C13421l c13421l, C22107K0 c22107k0, AbstractC22180o0 abstractC22180o0, int i10) {
        super(0);
        this.f69834Y = i10;
        this.f69835Z = c13421l;
        this.f69836o0 = c22107k0;
        this.f69837p0 = abstractC22180o0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69834Y) {
            case 0:
                this.f69835Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f69836o0, new C22091C0(this.f69837p0, 0)));
                break;
            case 1:
                this.f69835Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f69836o0, new C22091C0(this.f69837p0, 1)));
                break;
            case 2:
                this.f69835Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f69836o0, new C22091C0(this.f69837p0, 2)));
                break;
            case 3:
                this.f69835Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f69836o0, new C22091C0(this.f69837p0, 3)));
                break;
            default:
                InterfaceC13418i interfaceC13418iMo3400l = this.f69835Z.f42503Y.mo3400l();
                AbstractC22180o0 abstractC22180o0 = this.f69837p0;
                C22107K0 c22107k0 = this.f69836o0;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c22107k0, new C20720L0(c22107k0, 5, abstractC22180o0)));
                break;
        }
        return C17296C.f55119a;
    }
}
