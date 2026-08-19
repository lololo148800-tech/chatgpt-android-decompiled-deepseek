package p046Bk;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.C19218t;
import p994rk.InterfaceC19174i;
import p994rk.InterfaceC19201o2;
import pk.C18500e;

/* JADX INFO: renamed from: Bk.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1421z0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC1391k0 f3802Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19218t f3803Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19201o2 f3804o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421z0(AbstractC1391k0 abstractC1391k0, C19218t c19218t, InterfaceC19201o2 interfaceC19201o2) {
        super(1);
        this.f3802Y = abstractC1391k0;
        this.f3803Z = c19218t;
        this.f3804o0 = interfaceC19201o2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C1383g0 c1383g0 = (C1383g0) this.f3802Y;
        List list = c1383g0.f3676Y;
        InterfaceC19201o2 old = this.f3804o0;
        InterfaceC19174i interfaceC19174i = old instanceof InterfaceC19174i ? (InterfaceC19174i) old : null;
        if (interfaceC19174i != null) {
            interfaceC19174i.mo20308T(true);
        }
        C19218t c19218t = this.f3803Z;
        AbstractC16544l.m18094g(c19218t, "<this>");
        AbstractC16544l.m18094g(old, "old");
        C18500e c18500e = c19218t.f60966t0;
        List list2 = c18500e.f58960Y;
        action.f42521b = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, c19218t, C19218t.m20326a(c19218t, false, new C18500e(list2 != null ? AbstractC19213r2.m20323f(list2, old, old) : null, c18500e.f58961Z), 127)), null, null, null, false, new C1385h0(c19218t), false, null, null, null, false, 16254);
        return C17296C.f55119a;
    }
}
