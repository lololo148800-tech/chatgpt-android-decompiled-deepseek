package p046Bk;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1327G0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC1391k0 f3502Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Map f3503Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19201o2 f3504o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327G0(AbstractC1391k0 abstractC1391k0, Map map, InterfaceC19201o2 interfaceC19201o2) {
        super(1);
        this.f3502Y = abstractC1391k0;
        this.f3503Z = map;
        this.f3504o0 = interfaceC19201o2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.f42521b = C1383g0.m2047a((C1383g0) this.f3502Y, null, null, null, null, false, null, true, this.f3503Z, this.f3504o0, null, false, 12799);
        return C17296C.f55119a;
    }
}
