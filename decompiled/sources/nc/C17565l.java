package nc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p594Y9.AbstractC9961r4;
import p923oc.C18061q;
import p923oc.C18062r;

/* JADX INFO: renamed from: nc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C17565l extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56202Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f56203Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC9961r4 f56204o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17565l(InterfaceC1436k interfaceC1436k, AbstractC9961r4 abstractC9961r4, int i10) {
        super(0);
        this.f56202Y = i10;
        this.f56203Z = interfaceC1436k;
        this.f56204o0 = abstractC9961r4;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f56202Y) {
            case 0:
                this.f56203Z.invoke(((C18061q) this.f56204o0).f57614a);
                break;
            default:
                this.f56203Z.invoke(((C18062r) this.f56204o0).f57617b);
                break;
        }
        return C17296C.f55119a;
    }
}
