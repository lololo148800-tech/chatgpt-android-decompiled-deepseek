package p1095x1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p349O0.AbstractC6025r;

/* JADX INFO: renamed from: x1.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21079d0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f66996Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21081e0 f66997Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21079d0(C21081e0 c21081e0, int i10) {
        super(2);
        this.f66996Y = i10;
        this.f66997Z = c21081e0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66996Y) {
            case 0:
                this.f66997Z.m21572a().f66956Z = (AbstractC6025r) obj2;
                break;
            case 1:
                C21053G c21053gM21572a = this.f66997Z.m21572a();
                ((C21658D) obj).m22067x0(new C21050D(c21053gM21572a, (InterfaceC1439n) obj2, c21053gM21572a.f66954B0));
                break;
            default:
                C21658D c21658d = (C21658D) obj;
                C21053G c21053g = c21658d.f68639J0;
                C21081e0 c21081e0 = this.f66997Z;
                if (c21053g == null) {
                    c21053g = new C21053G(c21658d, c21081e0.f67001a);
                    c21658d.f68639J0 = c21053g;
                }
                c21081e0.f67002b = c21053g;
                c21081e0.m21572a().m21509d();
                C21053G c21053gM21572a2 = c21081e0.m21572a();
                InterfaceC21087h0 interfaceC21087h0 = c21053gM21572a2.f66957o0;
                InterfaceC21087h0 interfaceC21087h1 = c21081e0.f67001a;
                if (interfaceC21087h0 != interfaceC21087h1) {
                    c21053gM21572a2.f66957o0 = interfaceC21087h1;
                    c21053gM21572a2.m21510e(false);
                    C21658D.m22001s0(c21053gM21572a2.f66955Y, false, 7);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
