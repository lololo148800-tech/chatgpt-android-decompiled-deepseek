package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: J0.M2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3951M2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1426a f12245Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f12246Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f12247o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f12248p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f12249q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16043h f12250r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f12251s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951M2(InterfaceC1426a interfaceC1426a, int i10, float f10, float f11, long j10, C16043h c16043h, long j11) {
        super(1);
        this.f12245Y = interfaceC1426a;
        this.f12246Z = i10;
        this.f12247o0 = f10;
        this.f12248p0 = f11;
        this.f12249q0 = j10;
        this.f12250r0 = c16043h;
        this.f12251s0 = j11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
        float fFloatValue = ((Number) this.f12245Y.invoke()).floatValue() * 360.0f;
        boolean zM15642t = AbstractC14334L.m15642t(this.f12246Z, 0);
        float f10 = this.f12247o0;
        if (!zM15642t && C13803e.m15331c(interfaceC16039d.mo17602i()) <= C13803e.m15333e(interfaceC16039d.mo17602i())) {
            f10 += this.f12248p0;
        }
        float fMo7862P = (f10 / ((float) (((double) interfaceC16039d.mo7862P(C13803e.m15333e(interfaceC16039d.mo17602i()))) * 3.141592653589793d))) * 360.0f;
        float fMin = Math.min(fFloatValue, fMo7862P) + 270.0f + fFloatValue;
        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo7862P) * 2);
        long j10 = this.f12249q0;
        C16043h c16043h = this.f12250r0;
        AbstractC3980S2.m4672f(interfaceC16039d, fMin, fMin2, j10, c16043h);
        AbstractC3980S2.m4672f(interfaceC16039d, 270.0f, fFloatValue, this.f12251s0, c16043h);
        return C17296C.f55119a;
    }
}
