package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p228J.AbstractC3794B0;
import p278L0.AbstractC4879i0;

/* JADX INFO: renamed from: J0.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3908F1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21069X f11956Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21069X f11957Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f11958o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f11959p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f11960q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f11961r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC21069X f11962s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ AbstractC21069X f11963t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f11964u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f11965v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ int f11966w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3908F1(AbstractC21069X abstractC21069X, AbstractC21069X abstractC21069X2, int i10, boolean z6, int i11, AbstractC21069X abstractC21069X3, AbstractC21069X abstractC21069X4, AbstractC21069X abstractC21069X5, int i12, int i13, int i14) {
        super(1);
        this.f11956Y = abstractC21069X;
        this.f11957Z = abstractC21069X2;
        this.f11958o0 = i10;
        this.f11959p0 = z6;
        this.f11960q0 = i11;
        this.f11961r0 = abstractC21069X3;
        this.f11962s0 = abstractC21069X4;
        this.f11963t0 = abstractC21069X5;
        this.f11964u0 = i12;
        this.f11965v0 = i13;
        this.f11966w0 = i14;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int iM4492q;
        int iM4492q2;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        int i10 = this.f11958o0;
        int i11 = this.f11964u0;
        int iM4492q3 = this.f11960q0;
        boolean z6 = this.f11959p0;
        AbstractC21069X abstractC21069X = this.f11956Y;
        if (abstractC21069X != null) {
            if (z6) {
                iM4492q2 = iM4492q3;
            } else {
                iM4492q2 = AbstractC3794B0.m4492q(1, 0.0f, (i11 - abstractC21069X.f66982Z) / 2.0f);
            }
            abstractC21068W.m21546g(abstractC21069X, i10, iM4492q2, 0.0f);
        }
        AbstractC21069X abstractC21069X2 = this.f11957Z;
        if (abstractC21069X2 != null) {
            int i12 = (this.f11965v0 - this.f11966w0) - abstractC21069X2.f66981Y;
            if (z6) {
                iM4492q = iM4492q3;
            } else {
                iM4492q = AbstractC3794B0.m4492q(1, 0.0f, (i11 - abstractC21069X2.f66982Z) / 2.0f);
            }
            abstractC21068W.m21546g(abstractC21069X2, i12, iM4492q, 0.0f);
        }
        int iM5515g = AbstractC4879i0.m5515g(abstractC21069X) + i10;
        AbstractC21069X abstractC21069X3 = this.f11963t0;
        AbstractC21069X abstractC21069X4 = this.f11962s0;
        AbstractC21069X abstractC21069X5 = this.f11961r0;
        if (!z6) {
            iM4492q3 = AbstractC3794B0.m4492q(1, 0.0f, (i11 - (AbstractC4879i0.m5514f(abstractC21069X3) + (AbstractC4879i0.m5514f(abstractC21069X4) + AbstractC4879i0.m5514f(abstractC21069X5)))) / 2.0f);
        }
        if (abstractC21069X4 != null) {
            abstractC21068W.m21546g(abstractC21069X4, iM5515g, iM4492q3, 0.0f);
        }
        int iM5514f = AbstractC4879i0.m5514f(abstractC21069X4) + iM4492q3;
        if (abstractC21069X5 != null) {
            abstractC21068W.m21546g(abstractC21069X5, iM5515g, iM5514f, 0.0f);
        }
        int iM5514f2 = AbstractC4879i0.m5514f(abstractC21069X5) + iM5514f;
        if (abstractC21069X3 != null) {
            abstractC21068W.m21546g(abstractC21069X3, iM5515g, iM5514f2, 0.0f);
        }
        return C17296C.f55119a;
    }
}
