package p858ko;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p492U1.C7550o;
import p759g1.C13800b;

/* JADX INFO: renamed from: ko.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C16491J extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51160Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16495N f51161Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16491J(C16495N c16495n, int i10) {
        super(1);
        this.f51160Y = i10;
        this.f51161Z = c16495n;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f51160Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                C16495N c16495n = this.f51161Z;
                AbstractC0575H.m1156D(c16495n.m10935y0(), null, null, new C16490I(c16495n, j10, null), 3);
                break;
            case 1:
                long j11 = ((C13800b) obj).f43584a;
                C16495N c16495n2 = this.f51161Z;
                AbstractC0575H.m1156D(c16495n2.m10935y0(), null, null, new C16492K(c16495n2, null), 3);
                break;
            default:
                long j12 = ((C7550o) obj).f23912a;
                C16495N c16495n3 = this.f51161Z;
                if (c16495n3.f51169B0.m18057j()) {
                    AbstractC0575H.m1156D(c16495n3.m10935y0(), null, null, new C16494M(c16495n3, j12, null), 3);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
