package p298Lm;

import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5179h0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16860Y;

    /* JADX INFO: renamed from: Z */
    public final C5183j0 f16861Z;

    public /* synthetic */ C5179h0(C5183j0 c5183j0, int i10) {
        this.f16860Y = i10;
        this.f16861Z = c5183j0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16860Y) {
            case 0:
                return new C5181i0(this.f16861Z);
            default:
                return this.f16861Z.m5756q();
        }
    }
}
