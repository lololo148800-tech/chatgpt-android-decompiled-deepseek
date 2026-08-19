package p706df;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: df.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C13100t extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41600Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f41601Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13087g f41602o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13100t(InterfaceC1436k interfaceC1436k, C13087g c13087g, int i10) {
        super(0);
        this.f41600Y = i10;
        this.f41601Z = interfaceC1436k;
        this.f41602o0 = c13087g;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f41600Y) {
            case 0:
                this.f41601Z.invoke(new C13089i(this.f41602o0.f41579a));
                break;
            default:
                this.f41601Z.invoke(new C13090j(this.f41602o0.f41579a));
                break;
        }
        return C17296C.f55119a;
    }
}
