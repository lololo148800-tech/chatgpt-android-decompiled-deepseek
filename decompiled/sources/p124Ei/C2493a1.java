package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.C20862H;
import p1081wc.C20900s;
import p1081wc.InterfaceC20904w;
import p909nm.C17690x;

/* JADX INFO: renamed from: Ei.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2493a1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7767Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f7768Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7769o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2493a1(InterfaceC20904w interfaceC20904w, InterfaceC1436k interfaceC1436k, int i10) {
        super(0);
        this.f7767Y = i10;
        this.f7768Z = interfaceC20904w;
        this.f7769o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f7767Y) {
            case 0:
                this.f7768Z.mo21447a(C20862H.f66403k, C17690x.f56481Y);
                this.f7769o0.invoke(new C2528m0(true));
                break;
            case 1:
                this.f7768Z.mo21447a(C20900s.f66620d, C17690x.f56481Y);
                this.f7769o0.invoke(Boolean.TRUE);
                break;
            default:
                this.f7768Z.mo21447a(C20900s.f66619c, C17690x.f56481Y);
                this.f7769o0.invoke(Boolean.FALSE);
                break;
        }
        return C17296C.f55119a;
    }
}
