package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0624m;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: J0.E3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3904E3 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11938Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3934J3 f11939Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3904E3(C3934J3 c3934j3, int i10) {
        super(0);
        this.f11938Y = i10;
        this.f11939Z = c3934j3;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f11938Y) {
            case 0:
                this.f11939Z.m4634a();
                return Boolean.TRUE;
            case 1:
                C0624m c0624m = this.f11939Z.f12113b;
                if (c0624m.m1266w()) {
                    c0624m.resumeWith(EnumC4001W3.f12553Z);
                }
                return C17296C.f55119a;
            default:
                this.f11939Z.m4634a();
                return C17296C.f55119a;
        }
    }
}
