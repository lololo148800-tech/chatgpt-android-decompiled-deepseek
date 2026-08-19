package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p758g0.C13767i0;

/* JADX INFO: renamed from: L0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4871e0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15857Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13767i0 f15858Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4871e0(C13767i0 c13767i0, int i10) {
        super(0);
        this.f15857Y = i10;
        this.f15858Z = c13767i0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f15857Y) {
            case 0:
                return Boolean.valueOf(((Number) this.f15858Z.f43468t0.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f15858Z.f43468t0.getValue()).floatValue() > 0.0f);
        }
    }
}
