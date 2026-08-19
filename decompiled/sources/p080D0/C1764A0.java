package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p544W9.AbstractC8590Y3;
import p842k0.C16305n;

/* JADX INFO: renamed from: D0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1764A0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5037Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16305n f5038Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1837w0 f5039o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1764A0(C16305n c16305n, C1837w0 c1837w0, int i10) {
        super(0);
        this.f5037Y = i10;
        this.f5038Z = c16305n;
        this.f5039o0 = c1837w0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5037Y) {
            case 0:
                this.f5039o0.m2680d();
                AbstractC8590Y3.m9254a(this.f5038Z);
                break;
            case 1:
                this.f5039o0.m2679b(false);
                AbstractC8590Y3.m9254a(this.f5038Z);
                break;
            case 2:
                this.f5039o0.m2688l();
                AbstractC8590Y3.m9254a(this.f5038Z);
                break;
            default:
                this.f5039o0.m2689m();
                AbstractC8590Y3.m9254a(this.f5038Z);
                break;
        }
        return C17296C.f55119a;
    }
}
