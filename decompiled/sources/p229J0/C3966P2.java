package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: J0.P2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3966P2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12356Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12357Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f12358o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f12359p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f12360q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f12361r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3966P2(int i10, float f10, InterfaceC1426a interfaceC1426a, long j10, long j11, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f12356Y = i10;
        this.f12357Z = f10;
        this.f12358o0 = interfaceC1426a;
        this.f12359p0 = j10;
        this.f12360q0 = j11;
        this.f12361r0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
        float fM15331c = C13803e.m15331c(interfaceC16039d.mo17602i());
        boolean zM15642t = AbstractC14334L.m15642t(this.f12356Y, 0);
        float fMo7862P = this.f12357Z;
        if (!zM15642t && C13803e.m15331c(interfaceC16039d.mo17602i()) <= C13803e.m15333e(interfaceC16039d.mo17602i())) {
            fMo7862P += interfaceC16039d.mo7862P(fM15331c);
        }
        float fMo7862P2 = fMo7862P / interfaceC16039d.mo7862P(C13803e.m15333e(interfaceC16039d.mo17602i()));
        float fFloatValue = ((Number) this.f12358o0.invoke()).floatValue();
        float fMin = Math.min(fFloatValue, fMo7862P2) + fFloatValue;
        if (fMin <= 1.0f) {
            AbstractC3980S2.m4671e(interfaceC16039d, fMin, 1.0f, this.f12359p0, fM15331c, this.f12356Y);
        }
        AbstractC3980S2.m4671e(interfaceC16039d, 0.0f, fFloatValue, this.f12360q0, fM15331c, this.f12356Y);
        this.f12361r0.invoke(interfaceC16039d);
        return C17296C.f55119a;
    }
}
