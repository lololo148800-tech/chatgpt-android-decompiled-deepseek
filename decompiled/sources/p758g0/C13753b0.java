package p758g0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: g0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13753b0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16525B f43382Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f43383Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC13766i f43384o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13774m f43385p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f43386q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13753b0(C16525B c16525b, float f10, InterfaceC13766i interfaceC13766i, C13774m c13774m, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f43382Y = c16525b;
        this.f43383Z = f10;
        this.f43384o0 = interfaceC13766i;
        this.f43385p0 = c13774m;
        this.f43386q0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f43382Y.f51262Y;
        AbstractC16544l.m18091d(obj2);
        AbstractC13758e.m15249n((C13770k) obj2, jLongValue, this.f43383Z, this.f43384o0, this.f43385p0, this.f43386q0);
        return C17296C.f55119a;
    }
}
