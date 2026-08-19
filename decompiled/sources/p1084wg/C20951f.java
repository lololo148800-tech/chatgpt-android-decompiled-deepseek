package p1084wg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: wg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20951f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f66731Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f66732Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20951f(int i10, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f66731Y = i10;
        this.f66732Z = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f66731Y) {
            case 0:
                this.f66732Z.invoke();
                break;
            default:
                this.f66732Z.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
