package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: J0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3901E0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21069X f11900Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f11901Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f11902o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC21069X f11903p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f11904q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f11905r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f11906s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3901E0(AbstractC21069X abstractC21069X, int i10, int i11, AbstractC21069X abstractC21069X2, int i12, AbstractC21069X abstractC21069X3, int i13) {
        super(1);
        this.f11900Y = abstractC21069X;
        this.f11901Z = i10;
        this.f11902o0 = i11;
        this.f11903p0 = abstractC21069X2;
        this.f11904q0 = i12;
        this.f11905r0 = abstractC21069X3;
        this.f11906s0 = i13;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        int i10 = this.f11902o0;
        AbstractC21069X abstractC21069X = this.f11900Y;
        if (abstractC21069X != null) {
            abstractC21068W.m21546g(abstractC21069X, 0, AbstractC3794B0.m4492q(1, 0.0f, (i10 - this.f11901Z) / 2.0f), 0.0f);
        }
        AbstractC21069X abstractC21069X2 = this.f11903p0;
        int i11 = this.f11904q0;
        abstractC21068W.m21546g(abstractC21069X2, i11, 0, 0.0f);
        AbstractC21069X abstractC21069X3 = this.f11905r0;
        if (abstractC21069X3 != null) {
            abstractC21068W.m21546g(abstractC21069X3, i11 + abstractC21069X2.f66981Y, AbstractC3794B0.m4492q(1, 0.0f, (i10 - this.f11906s0) / 2.0f), 0.0f);
        }
        return C17296C.f55119a;
    }
}
