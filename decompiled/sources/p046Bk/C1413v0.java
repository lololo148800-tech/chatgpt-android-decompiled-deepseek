package p046Bk;

import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;
import p994rk.AbstractC19213r2;
import p994rk.C19218t;

/* JADX INFO: renamed from: Bk.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1413v0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1318C f3779Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1383g0 f3780Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1360X0 f3781o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1389j0 f3782p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413v0(InterfaceC1318C interfaceC1318C, C1383g0 c1383g0, C1360X0 c1360x0, InterfaceC1389j0 interfaceC1389j0) {
        super(1);
        this.f3779Y = interfaceC1318C;
        this.f3780Z = c1383g0;
        this.f3781o0 = c1360x0;
        this.f3782p0 = interfaceC1389j0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C1383g0 c1383g0M2047a;
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        if (((C1316B) this.f3779Y).f3480a instanceof InternalErrorInfo.NetworkErrorInfo) {
            c1383g0M2047a = C1383g0.m2047a(this.f3780Z, null, null, this.f3781o0.f3599a.getString(R.string.pi2_network_connection_error), null, false, null, false, null, null, null, false, 16239);
        } else {
            C1383g0 c1383g0 = this.f3780Z;
            List list = c1383g0.f3676Y;
            C19218t c19218t = ((C1385h0) this.f3782p0).f3693Y;
            c1383g0M2047a = C1383g0.m2047a(c1383g0, AbstractC19213r2.m20323f(list, c19218t, C19218t.m20326a(c19218t, true, null, 207)), null, null, null, false, null, false, null, null, null, false, 16254);
        }
        action.f42521b = c1383g0M2047a;
        return C17296C.f55119a;
    }
}
