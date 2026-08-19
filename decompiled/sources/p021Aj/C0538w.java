package p021Aj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1156zj.C22166j1;

/* JADX INFO: renamed from: Aj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C0538w extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1713Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22166j1 f1714Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0538w(C22166j1 c22166j1, int i10) {
        super(0);
        this.f1713Y = i10;
        this.f1714Z = c22166j1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1713Y) {
            case 0:
                this.f1714Z.f70128n.invoke();
                break;
            default:
                this.f1714Z.f70129o.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
