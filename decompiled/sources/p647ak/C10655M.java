package p647ak;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ak.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10655M extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31637Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10654L0 f31638Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10655M(C10654L0 c10654l0, int i10) {
        super(0);
        this.f31637Y = i10;
        this.f31638Z = c10654l0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31637Y) {
            case 0:
                this.f31638Z.f31635j.invoke();
                break;
            default:
                this.f31638Z.f31636k.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
