package p046Bk;

import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bk.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1415w0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1367a1 f3786Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1360X0 f3787Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1383g0 f3788o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415w0(InterfaceC1367a1 interfaceC1367a1, C1360X0 c1360x0, C1383g0 c1383g0) {
        super(1);
        this.f3786Y = interfaceC1367a1;
        this.f3787Z = c1360x0;
        this.f3788o0 = c1383g0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C1383g0 c1383g0M2047a;
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        if (((C1364Z0) this.f3786Y).f3621a instanceof InternalErrorInfo.NetworkErrorInfo) {
            c1383g0M2047a = C1383g0.m2047a(this.f3788o0, null, null, this.f3787Z.f3599a.getString(R.string.pi2_network_connection_error), null, false, null, false, null, null, null, false, 16239);
        } else {
            c1383g0M2047a = C1383g0.m2047a(this.f3788o0, null, null, null, null, false, null, false, null, null, null, false, 16255);
        }
        action.f42521b = c1383g0M2047a;
        return C17296C.f55119a;
    }
}
