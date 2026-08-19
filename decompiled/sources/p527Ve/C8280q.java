package p527Ve;

import androidx.compose.foundation.layout.AbstractC10844c;
import bf.C11349D;
import bf.InterfaceC11374b0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p594Y9.AbstractC9815U2;
import p635a1.C10456n;

/* JADX INFO: renamed from: Ve.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8280q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25805Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC11374b0 f25806Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f25807o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8280q(InterfaceC11374b0 interfaceC11374b0, boolean z6, int i10) {
        super(2);
        this.f25805Y = i10;
        this.f25806Z = interfaceC11374b0;
        this.f25807o0 = z6;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25805Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C3582M c3582m = (C3582M) c6021p.m6548k(AbstractC4124r4.f13310a);
                    String str = ((C11349D) this.f25806Z).f34319b;
                    c6021p.m6524S(-1447650174);
                    if (!this.f25807o0) {
                        c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i;
                    }
                    C3582M c3582m2 = c3582m;
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c3582m2, c6021p, 0, 3120, 55294);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9815U2.m10448g(this.f25806Z, AbstractC10844c.m11252l(C10456n.f30959Y, this.f25807o0 ? AbstractC7312p.f23188e : AbstractC7312p.f23186c), c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
