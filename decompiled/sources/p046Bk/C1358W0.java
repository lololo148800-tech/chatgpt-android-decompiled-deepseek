package p046Bk;

import com.openai.chatgpt.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p100Dk.AbstractC2099z;
import p100Dk.C2097x;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bk.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1358W0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC2099z f3595Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1383g0 f3596Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1360X0 f3597o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358W0(AbstractC2099z abstractC2099z, C1383g0 c1383g0, C1360X0 c1360x0) {
        super(1);
        this.f3595Y = abstractC2099z;
        this.f3596Z = c1383g0;
        this.f3597o0 = c1360x0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C2097x c2097x = (C2097x) this.f3595Y;
        if (c2097x.f6446b.isRecoverable()) {
            C1383g0 c1383g0 = this.f3596Z;
            List list = c1383g0.f3676Y;
            String string = this.f3597o0.f3599a.getString(R.string.pi2_network_connection_error);
            action.f42521b = new C1383g0(list, c1383g0.f3677Z, null, c1383g0.f3679p0, string, 16292);
        } else {
            action.m14964a(new C1401p0(c2097x.f6445a, c2097x.f6446b));
        }
        return C17296C.f55119a;
    }
}
