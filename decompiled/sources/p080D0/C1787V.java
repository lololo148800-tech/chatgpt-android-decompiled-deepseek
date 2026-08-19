package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8088f6;
import p758g0.C13778o;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1787V extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C1787V f5120Z = new C1787V(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1787V f5121o0 = new C1787V(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1787V f5122p0 = new C1787V(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C1787V f5123q0 = new C1787V(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5124Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1787V(int i10, int i11) {
        super(i10);
        this.f5124Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f5124Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                return AbstractC8088f6.m8538d(j10) ? new C13778o(C13800b.m15306g(j10), C13800b.m15307h(j10)) : AbstractC1793a0.f5138a;
            case 1:
                C13778o c13778o = (C13778o) obj;
                return new C13800b(AbstractC8088f6.m8536b(c13778o.f43513a, c13778o.f43514b));
            case 2:
                return new C1821o0(((Number) obj).longValue());
            default:
                return C17296C.f55119a;
        }
    }
}
