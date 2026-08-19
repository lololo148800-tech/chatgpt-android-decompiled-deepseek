package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: J0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4119r extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC3923H4 f13282Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f13283Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4119r(InterfaceC3923H4 interfaceC3923H4, float f10) {
        super(0);
        this.f13282Y = interfaceC3923H4;
        this.f13283Z = f10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C3935J4 state;
        InterfaceC3923H4 interfaceC3923H4 = this.f13282Y;
        Float fValueOf = (interfaceC3923H4 == null || (state = interfaceC3923H4.getState()) == null) ? null : Float.valueOf(state.f12115a.m6409g());
        float f10 = -this.f13283Z;
        if (!AbstractC16544l.m18088a(fValueOf, f10)) {
            C3935J4 state2 = interfaceC3923H4 != null ? interfaceC3923H4.getState() : null;
            if (state2 != null) {
                state2.f12115a.m6410h(f10);
            }
        }
        return C17296C.f55119a;
    }
}
