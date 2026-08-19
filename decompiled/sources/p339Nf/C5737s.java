package p339Nf;

import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import mm.C17311n;
import p040Bd.C0954L0;
import p040Bd.C0989R0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3984T1;
import p273Kl.C4714D;
import p324Mn.C5521B;
import p349O0.C6013l;
import p349O0.C6021p;
import p571X9.AbstractC9233X;
import p635a1.C10456n;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: Nf.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C5737s extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18653Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18654Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f18655o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5521B f18656p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5521B f18657q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f18658r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f18659s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ List f18660t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f18661u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5737s(String str, String str2, Object obj, C5521B c5521b, C5521B c5521b2, InterfaceC1436k interfaceC1436k, int i10, List list, int i11) {
        super(3);
        this.f18653Y = i11;
        this.f18654Z = str;
        this.f18655o0 = str2;
        this.f18661u0 = obj;
        this.f18656p0 = c5521b;
        this.f18657q0 = c5521b2;
        this.f18658r0 = interfaceC1436k;
        this.f18659s0 = i10;
        this.f18660t0 = list;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objM9806b;
        switch (this.f18653Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g((C10845a) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C0954L0 c0954l0 = (C0954L0) this.f18661u0;
                    String str = c0954l0.f2715c;
                    String str2 = c0954l0.f2714b;
                    Map mapM19258c = AbstractC17660E.m19258c(new C17309l(str, str2));
                    c6021p.m6524S(2133438531);
                    InterfaceC1436k interfaceC1436k = this.f18658r0;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(c0954l0);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C4714D(interfaceC1436k, 8, c0954l0);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    int i10 = this.f18659s0;
                    AbstractC5741w.m6161d(this.f18654Z, this.f18655o0, str, str2, c0954l0.f2713a, null, str, mapM19258c, this.f18656p0, this.f18657q0, (InterfaceC1426a) objM6514H, false, new C5721c("domain", i10, i10), c6021p, 196608, 48);
                    if (i10 != this.f18660t0.size() - 1) {
                        AbstractC3984T1.m4692k(AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC5741w.f18690a, 0.0f, 2), 0.0f, 0L, c6021p, 6, 6);
                    }
                }
                break;
            default:
                C10845a item = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(item) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C0989R0 c0989r0 = (C0989R0) this.f18661u0;
                    String str3 = c0989r0.f2772b;
                    try {
                        objM9806b = Uri.parse(str3);
                    } catch (Throwable th2) {
                        objM9806b = AbstractC9233X.m9806b(th2);
                    }
                    if (objM9806b instanceof C17311n) {
                        objM9806b = null;
                    }
                    Uri uri = (Uri) objM9806b;
                    String host = uri != null ? uri.getHost() : null;
                    if (host == null) {
                        host = "";
                    }
                    String str4 = c0989r0.f2773c;
                    String str5 = c0989r0.f2772b;
                    Map mapM19258c2 = AbstractC17660E.m19258c(new C17309l(str5, str4));
                    c6021p2.m6524S(2133487909);
                    InterfaceC1436k interfaceC1436k2 = this.f18658r0;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k2) | c6021p2.m6545h(c0989r0);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C4714D(interfaceC1436k2, 9, c0989r0);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                    c6021p2.m6553p(false);
                    int i11 = this.f18659s0;
                    AbstractC5741w.m6161d(this.f18654Z, this.f18655o0, str3, host, c0989r0.f2771a, null, str5, mapM19258c2, this.f18656p0, this.f18657q0, interfaceC1426a, i11 == 0, new C5721c("citation", i11, i11), c6021p2, 196608, 0);
                    if (i11 != this.f18660t0.size() - 1) {
                        AbstractC3984T1.m4692k(AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC5741w.f18690a, 0.0f, 2), 0.0f, 0L, c6021p2, 6, 6);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
