package p246Ji;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: Ji.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4366f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14222Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4365e f14223Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f14224o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4366f(C4365e c4365e, InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f14222Y = i10;
        this.f14223Z = c4365e;
        this.f14224o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f14222Y) {
            case 0:
                this.f14224o0.setValue(this.f14223Z.f14217s);
                break;
            case 1:
                this.f14224o0.setValue(this.f14223Z.f14218t);
                break;
            case 2:
                this.f14224o0.setValue(this.f14223Z.f14219u);
                break;
            default:
                this.f14224o0.setValue(this.f14223Z.f14220v);
                break;
        }
        return C17296C.f55119a;
    }
}
