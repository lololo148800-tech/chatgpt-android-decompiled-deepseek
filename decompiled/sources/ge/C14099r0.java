package ge;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.C20859E;
import p1081wc.C20896o;
import p1081wc.InterfaceC20904w;
import p153Fn.C2925c;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p349O0.InterfaceC5982V0;
import p454Se.C7112f;
import p749fd.C13625j;
import p909nm.AbstractC17659D;
import p909nm.C17690x;
import tf.C19903H;

/* JADX INFO: renamed from: ge.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14099r0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44340Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f44341Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f44342o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f44343p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f44344q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f44345r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f44346s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f44347t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f44348u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14099r0(InterfaceC1426a interfaceC1426a, String str, C4676c c4676c, C4684k c4684k, C4688o c4688o, InterfaceC20904w interfaceC20904w, InterfaceC1436k interfaceC1436k, C4679f c4679f) {
        super(0);
        this.f44343p0 = interfaceC1426a;
        this.f44344q0 = str;
        this.f44345r0 = c4676c;
        this.f44346s0 = c4684k;
        this.f44347t0 = c4688o;
        this.f44341Z = interfaceC20904w;
        this.f44342o0 = interfaceC1436k;
        this.f44348u0 = c4679f;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String str;
        C4688o c4688oM5396c;
        C7112f c7112f;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f44344q0;
        Object obj2 = this.f44347t0;
        Object obj3 = this.f44346s0;
        Object obj4 = this.f44348u0;
        Object obj5 = this.f44343p0;
        Object obj6 = this.f44345r0;
        InterfaceC20904w interfaceC20904w = this.f44341Z;
        switch (this.f44340Y) {
            case 0:
                ((InterfaceC1426a) obj5).invoke();
                C4676c c4676c = (C4676c) obj6;
                String str2 = (String) obj;
                if (str2 == null || (c4688oM5396c = c4676c.m5396c(str2)) == null || (str = c4688oM5396c.f15253b) == null) {
                    str = "unknown";
                }
                C4684k c4684k = (C4684k) obj3;
                C4688o c4688oM5396c2 = c4676c.m5396c(c4684k.f15236a);
                if (c4688oM5396c2 == null) {
                    c4688oM5396c2 = (C4688o) obj2;
                }
                interfaceC20904w.mo21447a(C20896o.f66600d, AbstractC17659D.m19244f(new C17309l("from_model_slug", str), new C17309l("to_model_slug", c4688oM5396c2.f15253b)));
                boolean z6 = c4684k.f15248m;
                InterfaceC1436k interfaceC1436k = this.f44342o0;
                if (z6) {
                    interfaceC1436k.invoke(new C14102t(((C4679f) obj4).f15229b));
                } else if (!AbstractC16544l.m18089b(str2, c4684k.f15236a)) {
                    interfaceC1436k.invoke(new C14039M(c4688oM5396c2));
                }
                break;
            default:
                interfaceC20904w.mo21447a(C20859E.f66349c, C17690x.f56481Y);
                if (((Boolean) ((InterfaceC5982V0) obj6).getValue()).booleanValue() && (c7112f = (C7112f) obj5) != null) {
                    AbstractC0575H.m1156D((C2925c) obj, null, null, new C19903H(c7112f, (C13625j) obj3, (Context) obj2, (InterfaceC0832p) obj4, this.f44342o0, null), 3);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14099r0(InterfaceC20904w interfaceC20904w, C7112f c7112f, C2925c c2925c, InterfaceC5982V0 interfaceC5982V0, C13625j c13625j, Context context, InterfaceC0832p interfaceC0832p, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f44341Z = interfaceC20904w;
        this.f44343p0 = c7112f;
        this.f44344q0 = c2925c;
        this.f44345r0 = interfaceC5982V0;
        this.f44346s0 = c13625j;
        this.f44347t0 = context;
        this.f44348u0 = interfaceC0832p;
        this.f44342o0 = interfaceC1436k;
    }
}
