package p552Wg;

import ge.C14019C;
import ge.C14029H;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.EnumC20898q;
import p225Im.InterfaceC3759g;

/* JADX INFO: renamed from: Wg.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8863y extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27126Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f27127Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f27128o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8863y(InterfaceC1426a interfaceC1426a, InterfaceC3759g interfaceC3759g, int i10) {
        super(0);
        this.f27126Y = i10;
        this.f27127Z = interfaceC1426a;
        this.f27128o0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f27126Y) {
            case 0:
                this.f27127Z.invoke();
                ((InterfaceC1436k) this.f27128o0).invoke(C8860v.f27124a);
                break;
            case 1:
                this.f27127Z.invoke();
                ((InterfaceC1436k) this.f27128o0).invoke(C8861w.f27125a);
                break;
            case 2:
                this.f27127Z.invoke();
                ((InterfaceC1436k) this.f27128o0).invoke(new C14029H(EnumC20898q.f66612Y));
                break;
            default:
                this.f27127Z.invoke();
                ((InterfaceC1436k) this.f27128o0).invoke(new C14019C(true));
                break;
        }
        return C17296C.f55119a;
    }
}
