package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: J0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4149w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13441Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3923H4 f13442Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4149w(InterfaceC3923H4 interfaceC3923H4, int i10) {
        super(1);
        this.f13441Y = i10;
        this.f13442Z = interfaceC3923H4;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f13441Y) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C3935J4 state = this.f13442Z.getState();
                state.m4636b(state.f12117c.m6409g() + fFloatValue);
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                C3935J4 state2 = this.f13442Z.getState();
                state2.m4636b(state2.f12117c.m6409g() + fFloatValue2);
                break;
        }
        return C17296C.f55119a;
    }
}
