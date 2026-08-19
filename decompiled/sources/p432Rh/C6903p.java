package p432Rh;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p364Oh.C6244r;
import p571X9.AbstractC9248Z2;
import p582Xk.HXHG.TfazcFv;
import p857kl.C16452T;
import p857kl.C16464l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Rh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C6903p extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22128Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16464l f22129Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16452T f22130o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6903p(C16464l c16464l, C16452T c16452t, int i10) {
        super(1);
        this.f22128Y = i10;
        this.f22129Z = c16464l;
        this.f22130o0 = c16452t;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f22128Y) {
            case 0:
                C16464l it = (C16464l) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(AbstractC16544l.m18089b(it.f51070a, this.f22129Z.f51070a) && AbstractC9248Z2.m9823c(it, this.f22130o0));
            default:
                C6244r current = (C6244r) obj;
                AbstractC16544l.m18094g(current, "current");
                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(AbstractC9248Z2.m9822b(current));
                C16464l c16464lM18038a = this.f22129Z;
                C16452T requestUrl = this.f22130o0;
                AbstractC17686t.m19393A(arrayListM19323D0, new C6903p(c16464lM18038a, requestUrl, 0));
                AbstractC16544l.m18094g(requestUrl, "requestUrl");
                String str = c16464lM18038a.f51076g;
                if (str == null || !AbstractC21329w.m21734u(str, TfazcFv.mtOY, false)) {
                    c16464lM18038a = C16464l.m18038a(c16464lM18038a, null, (String) requestUrl.f51044j.getValue(), 959);
                }
                String str2 = c16464lM18038a.f51075f;
                if (str2 == null || AbstractC21322p.m21681O(str2)) {
                    c16464lM18038a = C16464l.m18038a(c16464lM18038a, requestUrl.f51035a, null, 991);
                }
                arrayListM19323D0.add(c16464lM18038a);
                return AbstractC9248Z2.m9821a(arrayListM19323D0);
        }
    }
}
