package p298Lm;

import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5185k0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16868Y;

    /* JADX INFO: renamed from: Z */
    public final C5189m0 f16869Z;

    public /* synthetic */ C5185k0(C5189m0 c5189m0, int i10) {
        this.f16868Y = i10;
        this.f16869Z = c5189m0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16868Y) {
            case 0:
                return new C5187l0(this.f16869Z);
            default:
                return this.f16869Z.m5756q();
        }
    }
}
