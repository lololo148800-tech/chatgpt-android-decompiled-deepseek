package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;

/* JADX INFO: renamed from: J0.R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3974R1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12432Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21069X f12433Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f12434o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f12435p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3974R1(int i10, int i11, AbstractC21069X abstractC21069X) {
        super(1);
        this.f12432Y = 0;
        this.f12434o0 = i10;
        this.f12433Z = abstractC21069X;
        this.f12435p0 = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f12432Y) {
            case 0:
                AbstractC21069X abstractC21069X = this.f12433Z;
                ((AbstractC21068W) obj).m21545d(abstractC21069X, AbstractC2119a.m3195i((this.f12434o0 - abstractC21069X.f66981Y) / 2.0f), AbstractC2119a.m3195i((this.f12435p0 - abstractC21069X.f66982Z) / 2.0f), 0.0f);
                break;
            case 1:
                AbstractC21068W.m21540j((AbstractC21068W) obj, this.f12433Z, this.f12434o0, this.f12435p0);
                break;
            case 2:
                ((AbstractC21068W) obj).m21545d(this.f12433Z, this.f12434o0, this.f12435p0, 0.0f);
                break;
            case 3:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                layout.m21546g(this.f12433Z, this.f12434o0 / 2, this.f12435p0 / 2, 0.0f);
                break;
            default:
                ((AbstractC21068W) obj).m21545d(this.f12433Z, -this.f12434o0, -this.f12435p0, 0.0f);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3974R1(AbstractC21069X abstractC21069X, int i10, int i11, int i12) {
        super(1);
        this.f12432Y = i12;
        this.f12433Z = abstractC21069X;
        this.f12434o0 = i10;
        this.f12435p0 = i11;
    }
}
