package p925oe;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17665J;

/* JADX INFO: renamed from: oe.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18109e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57763Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f57764Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f57765o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18109e(String str, boolean z6, int i10) {
        super(1);
        this.f57763Y = i10;
        this.f57764Z = str;
        this.f57765o0 = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f57763Y) {
            case 0:
                C18102a0 state = (C18102a0) obj;
                AbstractC16544l.m18094g(state, "state");
                return new C18102a0(AbstractC17665J.m19267g(state.f57743a, new C18098X(this.f57764Z, this.f57765o0)));
            default:
                C18120j0 state2 = (C18120j0) obj;
                AbstractC16544l.m18094g(state2, "state");
                return C18120j0.m19715a(state2, AbstractC17665J.m19267g(state2.f57802b, new C18108d0(this.f57764Z, this.f57765o0)));
        }
    }
}
