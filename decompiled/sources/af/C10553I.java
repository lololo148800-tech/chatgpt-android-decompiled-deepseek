package af;

import bf.C11349D;
import bf.C11364T;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: af.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C10553I extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31324Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f31325Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11364T f31326o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11349D f31327p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10553I(InterfaceC1436k interfaceC1436k, C11364T c11364t, C11349D c11349d, int i10) {
        super(0);
        this.f31324Y = i10;
        this.f31325Z = interfaceC1436k;
        this.f31326o0 = c11364t;
        this.f31327p0 = c11349d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31324Y) {
            case 0:
                this.f31325Z.invoke(new C10548D(this.f31326o0, this.f31327p0));
                break;
            default:
                InterfaceC1436k interfaceC1436k = this.f31325Z;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(new C10548D(this.f31326o0, this.f31327p0));
                }
                break;
        }
        return C17296C.f55119a;
    }
}
