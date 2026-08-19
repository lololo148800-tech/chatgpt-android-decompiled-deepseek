package p017Af;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;

/* JADX INFO: renamed from: Af.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0480k extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1557Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21069X f1558Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f1559o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0480k(int i10, int i11, AbstractC21069X abstractC21069X) {
        super(1);
        this.f1557Y = i11;
        this.f1558Z = abstractC21069X;
        this.f1559o0 = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1557Y) {
            case 0:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                layout.m21546g(this.f1558Z, -this.f1559o0, 0, 0.0f);
                break;
            default:
                ((AbstractC21068W) obj).m21545d(this.f1558Z, 0, -this.f1559o0, 0.0f);
                break;
        }
        return C17296C.f55119a;
    }
}
