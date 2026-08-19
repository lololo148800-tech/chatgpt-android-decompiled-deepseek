package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: zj.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C22114O extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69901Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22175m1 f69902Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22114O(C22175m1 c22175m1, int i10) {
        super(0);
        this.f69901Y = i10;
        this.f69902Z = c22175m1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69901Y) {
            case 0:
                this.f69902Z.f70226l.invoke();
                break;
            default:
                this.f69902Z.f70227m.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
