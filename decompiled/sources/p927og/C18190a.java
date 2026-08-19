package p927og;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p990rg.C18982i;

/* JADX INFO: renamed from: og.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18190a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58006Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18982i f58007Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18190a(C18982i c18982i, int i10) {
        super(2);
        this.f58006Y = i10;
        this.f58007Z = c18982i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58006Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f58007Z.f60542a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c6021p, 0, 3072, 122878);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f58007Z.f60543b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p2, 0, 3120, 120830);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11239q = AbstractC10842a.m11239q(C10456n.f30959Y, 2);
                    C18982i c18982i = this.f58007Z;
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1908487148, c6021p3, new C18190a(c18982i, 0)), interfaceC10459qM11239q, null, AbstractC8411c.m8969c(-1595389073, c6021p3, new C18190a(c18982i, 1)), null, null, null, 0.0f, 0.0f, c6021p3, 3126, 500);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
