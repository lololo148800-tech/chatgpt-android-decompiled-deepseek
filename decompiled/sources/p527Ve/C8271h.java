package p527Ve;

import androidx.compose.foundation.layout.AbstractC10844c;
import bf.C11386n;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p594Y9.AbstractC9809T2;
import p635a1.C10456n;

/* JADX INFO: renamed from: Ve.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C8271h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25781Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11386n f25782Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8271h(C11386n c11386n, int i10) {
        super(2);
        this.f25781Y = i10;
        this.f25782Z = c11386n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25781Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f25782Z.f34402b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C11386n c11386n = this.f25782Z;
                    AbstractC3878A1.m4597b(AbstractC9809T2.m10436d(c11386n.f34404d), c11386n.f34402b, AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23185b), 0L, c6021p2, 0, 8);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
