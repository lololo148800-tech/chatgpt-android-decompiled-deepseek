package p1044uj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: uj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20342j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64326Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20350n f64327Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20342j(C20350n c20350n, int i10) {
        super(0);
        this.f64326Y = i10;
        this.f64327Z = c20350n;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f64326Y) {
            case 0:
                this.f64327Z.f64348p0.invoke();
                break;
            default:
                this.f64327Z.f64349q0.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
