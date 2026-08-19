package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;

/* JADX INFO: renamed from: f0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C13477O extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13478P f42643Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f42644Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f42645o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f42646p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC21059M f42647q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21069X f42648r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13477O(C13478P c13478p, long j10, int i10, int i11, InterfaceC21059M interfaceC21059M, AbstractC21069X abstractC21069X) {
        super(1);
        this.f42643Y = c13478p;
        this.f42644Z = j10;
        this.f42645o0 = i10;
        this.f42646p0 = i11;
        this.f42647q0 = interfaceC21059M;
        this.f42648r0 = abstractC21069X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        this.f42643Y.getClass();
        long jM9643a = AbstractC9113C4.m9643a(this.f42645o0, this.f42646p0);
        EnumC7546k layoutDirection = this.f42647q0.getLayoutDirection();
        long j10 = this.f42644Z;
        float f10 = (((int) (jM9643a >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (jM9643a & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f12 = layoutDirection == EnumC7546k.f23904Y ? -1.0f : (-1) * (-1.0f);
        float f13 = 1;
        AbstractC21068W.m21537f(abstractC21068W, this.f42648r0, AbstractC9101A4.m9631a(Math.round((f12 + f13) * f10), Math.round((f13 - 1.0f) * f11)));
        return C17296C.f55119a;
    }
}
