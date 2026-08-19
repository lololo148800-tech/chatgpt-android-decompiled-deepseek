package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: zj.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C22188r extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f70255Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22194t f70256Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22188r(C22194t c22194t, int i10) {
        super(0);
        this.f70255Y = i10;
        this.f70256Z = c22194t;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f70255Y) {
            case 0:
                this.f70256Z.f70329u0.invoke();
                break;
            default:
                this.f70256Z.f70330v0.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
