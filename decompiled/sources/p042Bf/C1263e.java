package p042Bf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Bf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3348Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f3349Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f3350o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1263e(int i10, int i11, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f3348Y = i11;
        this.f3349Z = interfaceC1436k;
        this.f3350o0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3348Y) {
            case 0:
                this.f3349Z.invoke(Integer.valueOf(this.f3350o0));
                break;
            case 1:
                this.f3349Z.invoke(Integer.valueOf(this.f3350o0));
                break;
            case 2:
                this.f3349Z.invoke(Integer.valueOf(this.f3350o0));
                break;
            default:
                this.f3349Z.invoke(Integer.valueOf(this.f3350o0));
                break;
        }
        return C17296C.f55119a;
    }
}
