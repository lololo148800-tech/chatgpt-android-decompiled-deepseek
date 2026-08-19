package p878lo;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p492U1.C7550o;
import p759g1.C13800b;
import p858ko.C16491J;
import p858ko.C16494M;
import p858ko.C16495N;

/* JADX INFO: renamed from: lo.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C17086I extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54607Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17087J f54608Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17086I(C17087J c17087j, int i10) {
        super(1);
        this.f54607Y = i10;
        this.f54608Z = c17087j;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [Bm.k, kotlin.jvm.internal.i] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54607Y) {
            case 0:
                return (Boolean) this.f54608Z.f54610C0.invoke(new C13800b(((C13800b) obj).f43584a));
            default:
                long j10 = ((C7550o) obj).f23912a;
                C16491J c16491j = this.f54608Z.f54612E0;
                c16491j.getClass();
                C16495N c16495n = c16491j.f51161Z;
                if (c16495n.f51169B0.m18057j()) {
                    AbstractC0575H.m1156D(c16495n.m10935y0(), null, null, new C16494M(c16495n, j10, null), 3);
                }
                return C17296C.f55119a;
        }
    }
}
