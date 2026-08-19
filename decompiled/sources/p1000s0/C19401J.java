package p1000s0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: s0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C19401J extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61471Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f61472Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f61473o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19401J(int i10, float f10, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f61471Y = i10;
        this.f61472Z = f10;
        this.f61473o0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return new C19408d(this.f61471Y, this.f61472Z, this.f61473o0);
    }
}
