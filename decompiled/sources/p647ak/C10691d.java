package p647ak;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ak.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10691d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31755Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10652K0 f31756Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10691d(C10652K0 c10652k0, int i10) {
        super(0);
        this.f31755Y = i10;
        this.f31756Z = c10652k0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31755Y) {
            case 0:
                this.f31756Z.f31619j.invoke();
                break;
            default:
                this.f31756Z.f31618i.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
