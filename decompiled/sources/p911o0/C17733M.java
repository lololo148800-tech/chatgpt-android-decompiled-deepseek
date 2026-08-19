package p911o0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21069X;
import p692d0.C12970i;

/* JADX INFO: renamed from: o0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C17733M extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56616Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17734N f56617Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17737Q f56618o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17733M(C17734N c17734n, C17737Q c17737q, int i10) {
        super(1);
        this.f56616Y = i10;
        this.f56617Z = c17734n;
        this.f56618o0 = c17737q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int iMo21549L;
        int iMo21548K;
        int iMo21549L2;
        int iMo21548K2;
        switch (this.f56616Y) {
            case 0:
                AbstractC21069X abstractC21069X = (AbstractC21069X) obj;
                if (abstractC21069X != null) {
                    this.f56618o0.getClass();
                    iMo21549L = abstractC21069X.mo21549L();
                    iMo21548K = abstractC21069X.mo21548K();
                } else {
                    iMo21549L = 0;
                    iMo21548K = 0;
                }
                C12970i c12970i = new C12970i(C12970i.m14660a(iMo21549L, iMo21548K));
                C17734N c17734n = this.f56617Z;
                c17734n.f56626h = c12970i;
                c17734n.f56623e = abstractC21069X;
                break;
            default:
                AbstractC21069X abstractC21069X2 = (AbstractC21069X) obj;
                if (abstractC21069X2 != null) {
                    this.f56618o0.getClass();
                    iMo21549L2 = abstractC21069X2.mo21549L();
                    iMo21548K2 = abstractC21069X2.mo21548K();
                } else {
                    iMo21549L2 = 0;
                    iMo21548K2 = 0;
                }
                C12970i c12970i2 = new C12970i(C12970i.m14660a(iMo21549L2, iMo21548K2));
                C17734N c17734n2 = this.f56617Z;
                c17734n2.f56627i = c12970i2;
                c17734n2.f56625g = abstractC21069X2;
                break;
        }
        return C17296C.f55119a;
    }
}
