package p021Aj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22147d0;
import p729ej.C13430u;
import p994rk.C19067A1;

/* JADX INFO: renamed from: Aj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0521f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1669Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22147d0 f1670Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19067A1 f1671o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0521f(C22147d0 c22147d0, C19067A1 c19067a1, int i10) {
        super(1);
        this.f1669Y = i10;
        this.f1670Z = c22147d0;
        this.f1671o0 = c19067a1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1669Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                C22147d0 c22147d0 = this.f1670Z;
                if (!(c22147d0 instanceof C22147d0)) {
                    c22147d0 = null;
                }
                if (c22147d0 != null) {
                    action.f42521b = C22147d0.m22382i(c22147d0, this.f1671o0.f60745Z, null, 767);
                }
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                C22147d0 c22147d1 = this.f1670Z;
                if (!(c22147d1 instanceof C22147d0)) {
                    c22147d1 = null;
                }
                if (c22147d1 != null) {
                    action2.f42521b = C22147d0.m22382i(c22147d1, null, this.f1671o0.f60745Z, 511);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
