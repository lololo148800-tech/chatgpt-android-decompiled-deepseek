package p647ak;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8170q0;

/* JADX INFO: renamed from: ak.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10700g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31799Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC8170q0 f31800Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10700g(AbstractC8170q0 abstractC8170q0, int i10) {
        super(0);
        this.f31799Y = i10;
        this.f31800Z = abstractC8170q0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31799Y) {
            case 0:
                ((C10642F0) this.f31800Z).f31571a.invoke();
                break;
            case 1:
                ((C10640E0) this.f31800Z).f31568a.invoke();
                break;
            default:
                ((C10636C0) this.f31800Z).f31557b.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
