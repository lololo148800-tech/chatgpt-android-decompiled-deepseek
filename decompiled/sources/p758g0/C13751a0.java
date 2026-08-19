package p758g0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p080D0.C1788W;

/* JADX INFO: renamed from: g0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13751a0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16525B f43373Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f43374Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC13766i f43375o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC13784r f43376p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13774m f43377q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f43378r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1436k f43379s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13751a0(C16525B c16525b, Object obj, InterfaceC13766i interfaceC13766i, AbstractC13784r abstractC13784r, C13774m c13774m, float f10, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f43373Y = c16525b;
        this.f43374Z = obj;
        this.f43375o0 = interfaceC13766i;
        this.f43376p0 = abstractC13784r;
        this.f43377q0 = c13774m;
        this.f43378r0 = f10;
        this.f43379s0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC13766i interfaceC13766i = this.f43375o0;
        C13783q0 c13783q0Mo15231f = interfaceC13766i.mo15231f();
        Object objMo15235j = interfaceC13766i.mo15235j();
        C1788W c1788w = new C1788W(1, this.f43377q0);
        C13770k c13770k = new C13770k(this.f43374Z, c13783q0Mo15231f, this.f43376p0, jLongValue, objMo15235j, jLongValue, c1788w);
        AbstractC13758e.m15249n(c13770k, jLongValue, this.f43378r0, this.f43375o0, this.f43377q0, this.f43379s0);
        this.f43373Y.f51262Y = c13770k;
        return C17296C.f55119a;
    }
}
