package p860l0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import p025An.AbstractC0575H;
import p635a1.InterfaceC10460r;
import p758g0.C13796x;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: l0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C16684J implements InterfaceC16661B0 {

    /* JADX INFO: renamed from: a */
    public C13796x f53455a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10460r f53456b;

    public C16684J(C13796x c13796x) {
        C16700O0 c16700o0 = AbstractC10840a.f32469b;
        this.f53455a = c13796x;
        this.f53456b = c16700o0;
    }

    @Override // p860l0.InterfaceC16661B0
    /* JADX INFO: renamed from: a */
    public final Object mo18490a(InterfaceC16694M0 interfaceC16694M0, float f10, InterfaceC18770c interfaceC18770c) {
        return AbstractC0575H.m1168P(this.f53456b, new C16681I(f10, this, interfaceC16694M0, null), interfaceC18770c);
    }
}
