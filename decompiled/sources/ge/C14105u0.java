package ge;

import bf.AbstractC11372a0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p225Im.InterfaceC3759g;

/* JADX INFO: renamed from: ge.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14105u0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44357Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f44358Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f44359o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14111x0 f44360p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14105u0(InterfaceC1426a interfaceC1426a, InterfaceC3759g interfaceC3759g, C14111x0 c14111x0, int i10) {
        super(0);
        this.f44357Y = i10;
        this.f44358Z = interfaceC1426a;
        this.f44359o0 = interfaceC3759g;
        this.f44360p0 = c14111x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44357Y) {
            case 0:
                this.f44358Z.invoke();
                ((InterfaceC1436k) this.f44359o0).invoke(new C14021D(AbstractC11372a0.m12782a(this.f44360p0.f44411h0)));
                break;
            case 1:
                this.f44358Z.invoke();
                ((InterfaceC1436k) this.f44359o0).invoke(new C14112y(AbstractC11372a0.m12782a(this.f44360p0.f44411h0)));
                break;
            case 2:
                this.f44358Z.invoke();
                ((InterfaceC1436k) this.f44359o0).invoke(new C14037L(AbstractC11372a0.m12782a(this.f44360p0.f44411h0)));
                break;
            default:
                this.f44358Z.invoke();
                C20263a0 c20263a0 = this.f44360p0.f44411h0;
                if (c20263a0 != null) {
                    ((InterfaceC1436k) this.f44359o0).invoke(new C14094p(AbstractC11372a0.m12782a(c20263a0)));
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14105u0(InterfaceC1426a interfaceC1426a, C14111x0 c14111x0, InterfaceC3759g interfaceC3759g) {
        super(0);
        this.f44357Y = 3;
        this.f44358Z = interfaceC1426a;
        this.f44360p0 = c14111x0;
        this.f44359o0 = interfaceC3759g;
    }
}
