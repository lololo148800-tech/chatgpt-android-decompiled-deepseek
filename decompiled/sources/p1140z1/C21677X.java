package p1140z1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: z1.X */
/* JADX INFO: loaded from: classes.dex */
public final class C21677X extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68788Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21678Y f68789Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC10458p f68790o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21686d f68791p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f68792q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C21713r f68793r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f68794s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ boolean f68795t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ float f68796u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21677X(AbstractC21678Y abstractC21678Y, AbstractC10458p abstractC10458p, C21686d c21686d, long j10, C21713r c21713r, boolean z6, boolean z10, float f10, int i10) {
        super(0);
        this.f68788Y = i10;
        this.f68789Z = abstractC21678Y;
        this.f68790o0 = abstractC10458p;
        this.f68791p0 = c21686d;
        this.f68792q0 = j10;
        this.f68793r0 = c21713r;
        this.f68794s0 = z6;
        this.f68795t0 = z10;
        this.f68796u0 = f10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f68788Y) {
            case 0:
                AbstractC10458p abstractC10458pM22200e = AbstractC21690f.m22200e(this.f68790o0, this.f68791p0.m22195b());
                boolean z6 = this.f68795t0;
                AbstractC21678Y abstractC21678Y = this.f68789Z;
                C21686d c21686d = this.f68791p0;
                long j10 = this.f68792q0;
                C21713r c21713r = this.f68793r0;
                boolean z10 = this.f68794s0;
                if (abstractC10458pM22200e == null) {
                    abstractC21678Y.mo22164O0(c21686d, j10, c21713r, z10, z6);
                } else {
                    abstractC21678Y.getClass();
                    float f10 = this.f68796u0;
                    c21713r.m22227j(abstractC10458pM22200e, f10, z6, new C21677X(abstractC21678Y, abstractC10458pM22200e, c21686d, j10, c21713r, z10, z6, f10, 0));
                }
                break;
            default:
                this.f68789Z.m22175Z0(AbstractC21690f.m22200e(this.f68790o0, this.f68791p0.m22195b()), this.f68791p0, this.f68792q0, this.f68793r0, this.f68794s0, this.f68795t0, this.f68796u0);
                break;
        }
        return C17296C.f55119a;
    }
}
