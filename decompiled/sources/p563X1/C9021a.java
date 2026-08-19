package p563X1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p329N3.RunnableC5611a;

/* JADX INFO: renamed from: X1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9021a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C9021a f27519Z = new C9021a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9021a f27520o0 = new C9021a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C9021a f27521p0 = new C9021a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C9021a f27522q0 = new C9021a(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27523Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9021a(int i10, int i11) {
        super(i10);
        this.f27523Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f27523Y) {
            case 0:
                AbstractC9029i abstractC9029i = (AbstractC9029i) obj;
                abstractC9029i.getHandler().post(new RunnableC5611a(abstractC9029i.f27546B0, 18));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return C17296C.f55119a;
    }
}
