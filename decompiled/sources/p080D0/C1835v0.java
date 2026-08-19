package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: D0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1835v0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5299Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1837w0 f5300Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1835v0(C1837w0 c1837w0, int i10) {
        super(0);
        this.f5299Y = i10;
        this.f5300Z = c1837w0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5299Y) {
            case 0:
                C1837w0 c1837w0 = this.f5300Z;
                c1837w0.m2679b(true);
                c1837w0.m2687k();
                return C17296C.f55119a;
            case 1:
                C1837w0 c1837w1 = this.f5300Z;
                c1837w1.m2680d();
                c1837w1.m2687k();
                return C17296C.f55119a;
            case 2:
                C1837w0 c1837w2 = this.f5300Z;
                c1837w2.m2688l();
                c1837w2.m2687k();
                return C17296C.f55119a;
            case 3:
                this.f5300Z.m2689m();
                return C17296C.f55119a;
            case 4:
                this.f5300Z.m2688l();
                return Boolean.TRUE;
            case 5:
                this.f5300Z.m2682f(true);
                return Boolean.TRUE;
            case 6:
                this.f5300Z.m2679b(true);
                return Boolean.TRUE;
            default:
                this.f5300Z.m2680d();
                return Boolean.TRUE;
        }
    }
}
