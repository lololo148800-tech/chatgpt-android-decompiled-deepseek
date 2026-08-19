package p772h;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: h.z */
/* JADX INFO: loaded from: classes.dex */
public final class C14244z extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44701Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14215F f44702Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14244z(C14215F c14215f, int i10) {
        super(0);
        this.f44701Y = i10;
        this.f44702Z = c14215f;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44701Y) {
            case 0:
                this.f44702Z.m15518c();
                break;
            case 1:
                this.f44702Z.m15517b();
                break;
            default:
                this.f44702Z.m15518c();
                break;
        }
        return C17296C.f55119a;
    }
}
