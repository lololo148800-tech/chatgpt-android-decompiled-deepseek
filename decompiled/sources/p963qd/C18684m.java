package p963qd;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import bf.C11377e;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1051v0.AbstractC20417e;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8126k4;
import p571X9.AbstractC9256a4;
import p635a1.C10456n;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: qd.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18684m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59481Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11377e f59482Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18684m(C11377e c11377e, int i10) {
        super(2);
        this.f59481Y = i10;
        this.f59482Z = c11377e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59481Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String str = this.f59482Z.f34383c;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 0, 3120, 120830);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str2 = this.f59482Z.f34384d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p2, 0, 3120, 120830);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C11377e c11377e = this.f59482Z;
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(AbstractC9256a4.m9830c(c11377e.f34384d), c6021p3, 0);
                    long j10 = ((C3949M0) c6021p3.m6548k(AbstractC3959O0.f12302a)).f12240v;
                    C10456n c10456n = C10456n.f30959Y;
                    long jM9828a = AbstractC9256a4.m9828a(c11377e.f34384d);
                    float f10 = AbstractC7313q.f23199d;
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10842a.m11233k(AbstractC10833a.m11207b(c10456n, jM9828a, AbstractC20417e.m21079a(f10)), f10), j10, c6021p3, 48, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
