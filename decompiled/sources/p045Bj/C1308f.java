package p045Bj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1156zj.AbstractC22120R0;
import p1156zj.C22195t0;
import p140Fa.C2685e;
import p729ej.C13421l;

/* JADX INFO: renamed from: Bj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1308f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3454Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1313k f3455Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f3456o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22195t0 f3457p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2685e f3458q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1308f(C1313k c1313k, C13421l c13421l, C22195t0 c22195t0, C2685e c2685e, int i10) {
        super(0);
        this.f3454Y = i10;
        this.f3455Z = c1313k;
        this.f3456o0 = c13421l;
        this.f3457p0 = c22195t0;
        this.f3458q0 = c2685e;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3454Y) {
            case 0:
                Context context = (Context) this.f3455Z.f3467b;
                this.f3458q0.getClass();
                C22195t0 c22195t0 = this.f3457p0;
                AbstractC22120R0.m22360g(context, this.f3456o0, c22195t0, C2685e.m3660i(c22195t0));
                break;
            default:
                Context context2 = (Context) this.f3455Z.f3467b;
                this.f3458q0.getClass();
                C22195t0 c22195t1 = this.f3457p0;
                AbstractC22120R0.m22360g(context2, this.f3456o0, c22195t1, C2685e.m3660i(c22195t1));
                break;
        }
        return C17296C.f55119a;
    }
}
