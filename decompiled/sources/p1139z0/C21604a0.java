package p1139z0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;

/* JADX INFO: renamed from: z0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21604a0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68424Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21612e0 f68425Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC21059M f68426o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f68427p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC21069X f68428q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21604a0(C21612e0 c21612e0, InterfaceC21059M interfaceC21059M, int i10, AbstractC21069X abstractC21069X, int i11) {
        super(1);
        this.f68424Y = i11;
        this.f68425Z = c21612e0;
        this.f68426o0 = interfaceC21059M;
        this.f68427p0 = i10;
        this.f68428q0 = abstractC21069X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68424Y) {
            case 0:
                AbstractC21069X abstractC21069X = this.f68428q0;
                int i10 = abstractC21069X.f66981Y;
                C21612e0 c21612e0 = this.f68425Z;
                long j10 = c21612e0.f68459E0.m21881c().f67818Z;
                InterfaceC21059M interfaceC21059M = this.f68426o0;
                C21612e0.m21951N0(c21612e0, interfaceC21059M, this.f68427p0, i10, j10, interfaceC21059M.getLayoutDirection());
                ((AbstractC21068W) obj).m21546g(abstractC21069X, -c21612e0.f68463I0.f44952a.m6412g(), 0, 0.0f);
                break;
            default:
                AbstractC21069X abstractC21069X2 = this.f68428q0;
                int i11 = abstractC21069X2.f66982Z;
                C21612e0 c21612e1 = this.f68425Z;
                long j11 = c21612e1.f68459E0.m21881c().f67818Z;
                InterfaceC21059M interfaceC21059M2 = this.f68426o0;
                C21612e0.m21951N0(c21612e1, interfaceC21059M2, this.f68427p0, i11, j11, interfaceC21059M2.getLayoutDirection());
                ((AbstractC21068W) obj).m21546g(abstractC21069X2, 0, -c21612e1.f68463I0.f44952a.m6412g(), 0.0f);
                break;
        }
        return C17296C.f55119a;
    }
}
