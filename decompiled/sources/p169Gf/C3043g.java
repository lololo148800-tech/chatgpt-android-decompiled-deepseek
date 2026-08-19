package p169Gf;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0103B;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1082wd.C20909b;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4034c4;
import p229J0.C3949M0;
import p269Kh.C4679f;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p479Td.C7320F;
import p523V9.AbstractC8080e6;
import p537W0.AbstractC8411c;
import p575Xd.C9436E;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Gf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3043g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9164Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f9165Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f9166o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f9167p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f9168q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f9169r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f9170s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043g(InterfaceC10459q interfaceC10459q, C4679f c4679f, C20909b c20909b, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, boolean z6) {
        super(2);
        this.f9167p0 = interfaceC10459q;
        this.f9168q0 = c4679f;
        this.f9169r0 = c20909b;
        this.f9165Z = interfaceC1436k;
        this.f9170s0 = interfaceC1426a;
        this.f9166o0 = z6;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9164Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC7313q.f23202g, 0.0f, 2);
                    AbstractC8080e6.m8506a((String) this.f9167p0, (String) this.f9168q0, (C7320F) this.f9169r0, this.f9166o0, (C9436E) this.f9170s0, this.f9165Z, interfaceC10459qM11235m, c6021p, 0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C20416d c20416dM21079a = AbstractC20417e.m21079a(AbstractC7313q.f23200e);
                    long j10 = ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12234p;
                    AbstractC4034c4.m4725a(AbstractC10842a.m11233k((InterfaceC10459q) this.f9167p0, AbstractC7313q.f23199d), c20416dM21079a, j10, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1590148643, c6021p2, new C0103B((C4679f) this.f9168q0, (C20909b) this.f9169r0, this.f9165Z, (InterfaceC1426a) this.f9170s0, this.f9166o0)), c6021p2, 12582912, 120);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3043g(String str, String str2, C7320F c7320f, boolean z6, C9436E c9436e, InterfaceC1436k interfaceC1436k) {
        super(2);
        this.f9167p0 = str;
        this.f9168q0 = str2;
        this.f9169r0 = c7320f;
        this.f9166o0 = z6;
        this.f9170s0 = c9436e;
        this.f9165Z = interfaceC1436k;
    }
}
