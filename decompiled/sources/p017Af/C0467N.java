package p017Af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0979P1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Af.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C0467N extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1515Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f1516Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0979P1 f1517o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0467N(InterfaceC1436k interfaceC1436k, C0979P1 c0979p1, int i10) {
        super(0);
        this.f1515Y = i10;
        this.f1516Z = interfaceC1436k;
        this.f1517o0 = c0979p1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1515Y) {
            case 0:
                this.f1516Z.invoke(this.f1517o0.f2762c);
                break;
            default:
                this.f1516Z.invoke(this.f1517o0.f2762c);
                break;
        }
        return C17296C.f55119a;
    }
}
