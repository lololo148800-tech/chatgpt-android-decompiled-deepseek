package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: w0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20762m0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65901Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20772r0 f65902Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20762m0(InterfaceC20772r0 interfaceC20772r0, int i10) {
        super(0);
        this.f65901Y = i10;
        this.f65902Z = interfaceC20772r0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f65901Y) {
            case 0:
                this.f65902Z.mo464a();
                break;
            default:
                this.f65902Z.onCancel();
                break;
        }
        return C17296C.f55119a;
    }
}
