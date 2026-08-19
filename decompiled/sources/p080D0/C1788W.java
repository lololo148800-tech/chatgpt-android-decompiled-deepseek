package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p758g0.C13774m;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C1788W extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5125Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13774m f5126Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1788W(int i10, C13774m c13774m) {
        super(0);
        this.f5125Y = i10;
        this.f5126Z = c13774m;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5125Y) {
            case 0:
                return new C13800b(((C13800b) this.f5126Z.f43502Z.getValue()).f43584a);
            case 1:
                this.f5126Z.f43506r0 = false;
                return C17296C.f55119a;
            default:
                this.f5126Z.f43506r0 = false;
                return C17296C.f55119a;
        }
    }
}
