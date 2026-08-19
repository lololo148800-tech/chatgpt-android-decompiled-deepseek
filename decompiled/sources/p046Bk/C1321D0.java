package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bk.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1321D0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC1391k0 f3485Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321D0(AbstractC1391k0 abstractC1391k0) {
        super(1);
        this.f3485Y = abstractC1391k0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = (C1383g0) this.f3485Y;
        action.f42521b = C1383g0.m2047a(c1383g0, null, null, null, null, false, null, false, null, null, String.valueOf(Integer.parseInt(c1383g0.f3688y0) + 1), false, 11775);
        return C17296C.f55119a;
    }
}
