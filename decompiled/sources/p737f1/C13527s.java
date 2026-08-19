package p737f1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: f1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C13527s extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42814Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13526r f42815Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13527s(C13526r c13526r, int i10) {
        super(0);
        this.f42814Y = i10;
        this.f42815Z = c13526r;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f42814Y) {
            case 0:
                this.f42815Z.m15077K0();
                break;
            default:
                C13526r c13526r = this.f42815Z;
                if (c13526r.f30960Y.f30972y0) {
                    AbstractC13512d.m15065z(c13526r);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
