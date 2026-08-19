package p1027tp;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: tp.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C20073q extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63570Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20059c f63571Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20073q(InterfaceC20059c interfaceC20059c, int i10) {
        super(1);
        this.f63570Y = i10;
        this.f63571Z = interfaceC20059c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f63570Y) {
            case 0:
                this.f63571Z.cancel();
                break;
            default:
                this.f63571Z.cancel();
                break;
        }
        return C17296C.f55119a;
    }
}
