package p437Rn;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Rn.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C6963u extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6964v f22267Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ char f22268Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6963u(C6964v c6964v, char c9) {
        super(0);
        this.f22267Y = c6964v;
        this.f22268Z = c9;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return "Expected " + this.f22267Y.f22270b + " but got " + this.f22268Z;
    }
}
