package p046Bk;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1329H0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Map f3509Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3510Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1329H0(Map map, InterfaceC19201o2 interfaceC19201o2) {
        super(1);
        this.f3509Y = map;
        this.f3510Z = interfaceC19201o2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        Object obj2 = action.f42521b;
        C1383g0 c1383g0 = obj2 instanceof C1383g0 ? (C1383g0) obj2 : null;
        if (c1383g0 != null) {
            action.f42521b = C1383g0.m2047a(c1383g0, null, null, null, null, false, null, false, this.f3509Y, this.f3510Z, null, true, 5119);
        }
        return C17296C.f55119a;
    }
}
