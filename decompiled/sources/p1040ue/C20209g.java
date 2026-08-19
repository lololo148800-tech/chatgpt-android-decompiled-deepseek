package p1040ue;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ue.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20209g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63978Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f63979Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20205c f63980o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20209g(InterfaceC1436k interfaceC1436k, InterfaceC20205c interfaceC20205c, int i10) {
        super(0);
        this.f63978Y = i10;
        this.f63979Z = interfaceC1436k;
        this.f63980o0 = interfaceC20205c;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f63978Y) {
            case 0:
                this.f63979Z.invoke(this.f63980o0);
                break;
            default:
                this.f63979Z.invoke(this.f63980o0);
                break;
        }
        return C17296C.f55119a;
    }
}
