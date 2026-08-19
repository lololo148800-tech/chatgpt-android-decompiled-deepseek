package p878lo;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p759g1.C13800b;
import p858ko.C16490I;
import p858ko.C16491J;
import p858ko.C16492K;
import p858ko.C16495N;

/* JADX INFO: renamed from: lo.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C17113v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54695Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17116y f54696Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17113v(C17116y c17116y, int i10) {
        super(1);
        this.f54695Y = i10;
        this.f54696Z = c17116y;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54695Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                C16491J c16491j = this.f54696Z.f54704B0;
                c16491j.getClass();
                C16495N c16495n = c16491j.f51161Z;
                AbstractC0575H.m1156D(c16495n.m10935y0(), null, null, new C16492K(c16495n, null), 3);
                break;
            case 1:
                long j11 = ((C13800b) obj).f43584a;
                InterfaceC1436k interfaceC1436k = this.f54696Z.f54705C0;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(new C13800b(j11));
                }
                break;
            case 2:
                long j12 = ((C13800b) obj).f43584a;
                InterfaceC1436k interfaceC1436k2 = this.f54696Z.f54706D0;
                if (interfaceC1436k2 != null) {
                    interfaceC1436k2.invoke(new C13800b(j12));
                }
                break;
            case 3:
                long j13 = ((C13800b) obj).f43584a;
                C17116y c17116y = this.f54696Z;
                if (c17116y.f54710H0) {
                    C16491J c16491j2 = c17116y.f54707E0;
                    c16491j2.getClass();
                    C16495N c16495n2 = c16491j2.f51161Z;
                    AbstractC0575H.m1156D(c16495n2.m10935y0(), null, null, new C16490I(c16495n2, j13, null), 3);
                }
                break;
            default:
                InterfaceC17104m it = (InterfaceC17104m) obj;
                AbstractC16544l.m18094g(it, "it");
                C17116y c17116y2 = this.f54696Z;
                if (c17116y2.f54710H0) {
                    c17116y2.f54711I0.mo2524p(it);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
