package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: zj.g1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22157g1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f70059Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22163i1 f70060Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22157g1(C22163i1 c22163i1, int i10) {
        super(0);
        this.f70059Y = i10;
        this.f70060Z = c22163i1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f70059Y) {
            case 0:
                this.f70060Z.f70105x0.invoke();
                break;
            default:
                this.f70060Z.f70106y0.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
