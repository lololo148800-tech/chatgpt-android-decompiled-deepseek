package p021Aj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Aj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C0530o extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1693Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0532q f1694Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0530o(C0532q c0532q, int i10) {
        super(0);
        this.f1693Y = i10;
        this.f1694Z = c0532q;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1693Y) {
            case 0:
                this.f1694Z.f1701r0.invoke();
                break;
            default:
                this.f1694Z.f1702s0.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
