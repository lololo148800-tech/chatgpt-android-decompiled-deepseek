package p1156zj;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p149Fj.AbstractC2887u;
import p149Fj.C2884r;
import p729ej.C13421l;
import p729ej.C13430u;

/* JADX INFO: renamed from: zj.H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22101H0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC2887u f69862Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22107K0 f69863Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f69864o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22101H0(AbstractC2887u abstractC2887u, C22107K0 c22107k0, C13421l c13421l) {
        super(1);
        this.f69862Y = abstractC2887u;
        this.f69863Z = c22107k0;
        this.f69864o0 = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        AbstractC22180o0 abstractC22180o0Mo22377c = ((AbstractC22180o0) action.f42521b).mo22377c();
        C2884r c2884r = (C2884r) this.f69862Y;
        boolean zIsRecoverable = c2884r.f8675a.isRecoverable();
        C22107K0 c22107k0 = this.f69863Z;
        if (!zIsRecoverable || abstractC22180o0Mo22377c == null) {
            AbstractC22120R0.m22362i(this.f69864o0, new C22204w0(c2884r.f8675a), c22107k0.f69887m);
        } else {
            String string = c22107k0.f69875a.getString(R.string.pi2_network_connection_error);
            AbstractC16544l.m18093f(string, "getString(...)");
            action.f42521b = abstractC22180o0Mo22377c.m22398a(string);
        }
        return C17296C.f55119a;
    }
}
