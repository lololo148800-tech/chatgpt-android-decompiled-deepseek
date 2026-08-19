package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;

/* JADX INFO: renamed from: J0.O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3962O3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21069X f12317Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f12318Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC21069X f12319o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f12320p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f12321q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f12322r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f12323s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f12324t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3962O3(AbstractC21069X abstractC21069X, int i10, AbstractC21069X abstractC21069X2, int i11, int i12, AbstractC21069X abstractC21069X3, int i13, int i14) {
        super(1);
        this.f12317Y = abstractC21069X;
        this.f12318Z = i10;
        this.f12319o0 = abstractC21069X2;
        this.f12320p0 = i11;
        this.f12321q0 = i12;
        this.f12322r0 = abstractC21069X3;
        this.f12323s0 = i13;
        this.f12324t0 = i14;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        abstractC21068W.m21546g(this.f12317Y, 0, this.f12318Z, 0.0f);
        AbstractC21069X abstractC21069X = this.f12319o0;
        if (abstractC21069X != null) {
            abstractC21068W.m21546g(abstractC21069X, this.f12320p0, this.f12321q0, 0.0f);
        }
        AbstractC21069X abstractC21069X2 = this.f12322r0;
        if (abstractC21069X2 != null) {
            abstractC21068W.m21546g(abstractC21069X2, this.f12323s0, this.f12324t0, 0.0f);
        }
        return C17296C.f55119a;
    }
}
