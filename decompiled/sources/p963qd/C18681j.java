package p963qd;

import bf.C11349D;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1155zi.C21936L0;

/* JADX INFO: renamed from: qd.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18681j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59463Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f59464Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11349D f59465o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18681j(InterfaceC1436k interfaceC1436k, C11349D c11349d, int i10) {
        super(0);
        this.f59463Y = i10;
        this.f59464Z = interfaceC1436k;
        this.f59465o0 = c11349d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f59463Y) {
            case 0:
                this.f59464Z.invoke(new C21936L0(this.f59465o0.f34318a));
                break;
            default:
                this.f59464Z.invoke(new C21936L0(this.f59465o0.f34318a));
                break;
        }
        return C17296C.f55119a;
    }
}
