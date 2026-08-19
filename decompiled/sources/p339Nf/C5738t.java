package p339Nf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p040Bd.C1054b4;
import p040Bd.C1075e4;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3984T1;
import p273Kl.C4714D;
import p324Mn.C5521B;
import p349O0.C6013l;
import p349O0.C6021p;
import p635a1.C10456n;

/* JADX INFO: renamed from: Nf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C5738t extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f18662Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18663Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1054b4 f18664o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1075e4 f18665p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Map f18666q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5521B f18667r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5521B f18668s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f18669t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f18670u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f18671v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C16558z f18672w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ List f18673x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ List f18674y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5738t(String str, String str2, C1054b4 c1054b4, C1075e4 c1075e4, Map map, C5521B c5521b, C5521B c5521b2, InterfaceC1436k interfaceC1436k, int i10, int i11, C16558z c16558z, List list, List list2) {
        super(3);
        this.f18662Y = str;
        this.f18663Z = str2;
        this.f18664o0 = c1054b4;
        this.f18665p0 = c1075e4;
        this.f18666q0 = map;
        this.f18667r0 = c5521b;
        this.f18668s0 = c5521b2;
        this.f18669t0 = interfaceC1436k;
        this.f18670u0 = i10;
        this.f18671v0 = i11;
        this.f18672w0 = c16558z;
        this.f18673x0 = list;
        this.f18674y0 = list2;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10845a item = (C10845a) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(item, "$this$item");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C1054b4 c1054b4 = this.f18664o0;
            String str = c1054b4.f2883a;
            C1075e4 c1075e4 = this.f18665p0;
            c6021p.m6524S(1990508865);
            InterfaceC1436k interfaceC1436k = this.f18669t0;
            boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(c1054b4);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C4714D(interfaceC1436k, 10, c1054b4);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
            c6021p.m6553p(false);
            int i10 = this.f18671v0;
            int i11 = this.f18670u0;
            boolean z6 = i11 == 0 && i10 == 0;
            C16558z c16558z = this.f18672w0;
            int i12 = c16558z.f51287Y;
            AbstractC5741w.m6161d(this.f18662Y, this.f18663Z, str, c1075e4.f2927a, c1054b4.f2884b, c1054b4.f2886d, c1054b4.f2887e, this.f18666q0, this.f18667r0, this.f18668s0, interfaceC1426a, z6, new C5721c("search_result", i12, this.f18673x0.size() + i12), c6021p, 0, 0);
            c16558z.f51287Y++;
            if (i11 != this.f18674y0.size() - 1 || i10 != c1075e4.f2928b.size() - 1) {
                AbstractC3984T1.m4692k(AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC5741w.f18690a, 0.0f, 2), 0.0f, 0L, c6021p, 6, 6);
            }
        }
        return C17296C.f55119a;
    }
}
