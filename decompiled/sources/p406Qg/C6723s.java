package p406Qg;

import ge.C14035K;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3759g;

/* JADX INFO: renamed from: Qg.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6723s extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21590Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3759g f21591Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f21592o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6723s(int i10, InterfaceC3759g interfaceC3759g, boolean z6) {
        super(0);
        this.f21590Y = i10;
        this.f21591Z = interfaceC3759g;
        this.f21592o0 = z6;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21590Y) {
            case 0:
                ((InterfaceC1436k) this.f21591Z).invoke(new C6717m(!this.f21592o0));
                break;
            case 1:
                ((InterfaceC1436k) this.f21591Z).invoke(new C6719o(!this.f21592o0));
                break;
            default:
                ((InterfaceC1436k) this.f21591Z).invoke(new C14035K(!this.f21592o0));
                break;
        }
        return C17296C.f55119a;
    }
}
