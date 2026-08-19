package p247Jj;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Jj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C4391K extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14271Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4399O f14272Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4391K(C4399O c4399o, int i10) {
        super(0);
        this.f14271Y = i10;
        this.f14272Z = c4399o;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f14271Y) {
            case 0:
                return new C4377D(this.f14272Z.f33156r0);
            default:
                return this.f14272Z;
        }
    }
}
