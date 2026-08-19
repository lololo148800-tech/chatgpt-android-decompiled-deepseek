package p046Bk;

import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p994rk.C19221t2;

/* JADX INFO: renamed from: Bk.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1335K0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3525Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1360X0 f3526Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC1391k0 f3527o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13421l f3528p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1335K0(int i10, AbstractC1391k0 abstractC1391k0, C1360X0 c1360x0, C13421l c13421l) {
        super(1);
        this.f3525Y = i10;
        this.f3526Z = c1360x0;
        this.f3527o0 = abstractC1391k0;
        this.f3528p0 = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3525Y) {
            case 0:
                GovernmentIdNfcScanComponent component = (GovernmentIdNfcScanComponent) obj;
                AbstractC16544l.m18094g(component, "component");
                AbstractC1391k0 abstractC1391k0 = this.f3527o0;
                C1360X0 c1360x0 = this.f3526Z;
                C1360X0.m2031e(c1360x0, component, (C1383g0) abstractC1391k0);
                this.f3528p0.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, new C1333J0(abstractC1391k0, component)));
                break;
            default:
                C19221t2 it = (C19221t2) obj;
                AbstractC16544l.m18094g(it, "it");
                AbstractC1391k0 abstractC1391k1 = this.f3527o0;
                C1360X0 c1360x1 = this.f3526Z;
                C1360X0.m2031e(c1360x1, it, (C1383g0) abstractC1391k1);
                this.f3528p0.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x1, new C1337L0(abstractC1391k1, it)));
                break;
        }
        return C17296C.f55119a;
    }
}
