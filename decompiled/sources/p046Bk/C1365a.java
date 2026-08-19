package p046Bk;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.InterfaceC19138Y1;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1365a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1383g0 f3622Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3623Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f3624o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365a(C1383g0 c1383g0, InterfaceC19201o2 interfaceC19201o2, String str, C1420z c1420z) {
        super(1);
        this.f3622Y = c1383g0;
        this.f3623Z = interfaceC19201o2;
        this.f3624o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = this.f3622Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 interfaceC19201o2 = this.f3623Z;
        String str = this.f3624o0;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, interfaceC19201o2, ((InterfaceC19138Y1) interfaceC19201o2).mo14581b(str)), C1420z.m2048a(str.length() == 0, c1383g0.f3678o0, interfaceC19201o2.getName(), null), null, null, false, null, false, null, null, null, false, 16378);
        return C17296C.f55119a;
    }
}
