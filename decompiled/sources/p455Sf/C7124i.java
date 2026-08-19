package p455Sf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1081wc.C20869O;
import p1081wc.C20878Y;
import p1081wc.InterfaceC20904w;
import p507Uh.InterfaceC7678d;
import p909nm.C17690x;

/* JADX INFO: renamed from: Sf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C7124i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22673Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f22674Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC7678d f22675o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7124i(InterfaceC20904w interfaceC20904w, InterfaceC7678d interfaceC7678d, int i10) {
        super(0);
        this.f22673Y = i10;
        this.f22674Z = interfaceC20904w;
        this.f22675o0 = interfaceC7678d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f22673Y) {
            case 0:
                this.f22674Z.mo21447a(C20878Y.f66491d, C17690x.f56481Y);
                this.f22675o0.mo3587b();
                break;
            default:
                this.f22674Z.mo21447a(C20869O.f66435d, C17690x.f56481Y);
                this.f22675o0.mo3587b();
                break;
        }
        return C17296C.f55119a;
    }
}
