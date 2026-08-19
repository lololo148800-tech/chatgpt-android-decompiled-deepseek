package p059C5;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;

/* JADX INFO: renamed from: C5.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1597o implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4475Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC21069X f4476Z;

    public /* synthetic */ C1597o(AbstractC21069X abstractC21069X, int i10) {
        this.f4475Y = i10;
        this.f4476Z = abstractC21069X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        switch (this.f4475Y) {
            case 0:
                abstractC21068W.m21545d(this.f4476Z, 0, 0, 0.0f);
                break;
            default:
                abstractC21068W.m21546g(this.f4476Z, 0, 0, 0.0f);
                break;
        }
        return C17296C.f55119a;
    }
}
