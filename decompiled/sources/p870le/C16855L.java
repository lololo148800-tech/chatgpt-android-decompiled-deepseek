package p870le;

import ge.C14045P;
import ge.C14047Q;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: le.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C16855L extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54070Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f54071Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14111x0 f54072o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16855L(InterfaceC1436k interfaceC1436k, C14111x0 c14111x0, int i10) {
        super(0);
        this.f54070Y = i10;
        this.f54071Z = interfaceC1436k;
        this.f54072o0 = c14111x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54070Y) {
            case 0:
                this.f54071Z.invoke(this.f54072o0.f44430r ? C14047Q.f44159a : C14045P.f44153a);
                break;
            default:
                this.f54071Z.invoke(this.f54072o0.f44430r ? C14047Q.f44159a : C14045P.f44153a);
                break;
        }
        return C17296C.f55119a;
    }
}
