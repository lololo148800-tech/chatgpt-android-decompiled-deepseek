package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.C6002f0;
import p758g0.C13733I;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: J0.R2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3975R2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12436Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12437Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13733I f12438o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f12439p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13733I f12440q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f12441r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C13733I f12442s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C13733I f12443t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3975R2(int i10, float f10, C13733I c13733i, long j10, C13733I c13733i2, long j11, C13733I c13733i3, C13733I c13733i4) {
        super(1);
        this.f12436Y = i10;
        this.f12437Z = f10;
        this.f12438o0 = c13733i;
        this.f12439p0 = j10;
        this.f12440q0 = c13733i2;
        this.f12441r0 = j11;
        this.f12442s0 = c13733i3;
        this.f12443t0 = c13733i4;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
        float fM15331c = C13803e.m15331c(interfaceC16039d.mo17602i());
        boolean zM15642t = AbstractC14334L.m15642t(this.f12436Y, 0);
        float fMo7862P = this.f12437Z;
        if (!zM15642t && C13803e.m15331c(interfaceC16039d.mo17602i()) <= C13803e.m15333e(interfaceC16039d.mo17602i())) {
            fMo7862P += interfaceC16039d.mo7862P(fM15331c);
        }
        float fMo7862P2 = fMo7862P / interfaceC16039d.mo7862P(C13803e.m15333e(interfaceC16039d.mo17602i()));
        C13733I c13733i = this.f12438o0;
        float fFloatValue = ((Number) c13733i.f43307p0.getValue()).floatValue();
        float f10 = 1.0f - fMo7862P2;
        C6002f0 c6002f0 = c13733i.f43307p0;
        if (fFloatValue < f10) {
            AbstractC3980S2.m4671e(interfaceC16039d, ((Number) c6002f0.getValue()).floatValue() > 0.0f ? ((Number) c6002f0.getValue()).floatValue() + fMo7862P2 : 0.0f, 1.0f, this.f12439p0, fM15331c, this.f12436Y);
        }
        float fFloatValue2 = ((Number) c6002f0.getValue()).floatValue();
        C13733I c13733i2 = this.f12440q0;
        float fFloatValue3 = fFloatValue2 - ((Number) c13733i2.f43307p0.getValue()).floatValue();
        C6002f0 c6002f1 = c13733i2.f43307p0;
        if (fFloatValue3 > 0.0f) {
            AbstractC3980S2.m4671e(interfaceC16039d, ((Number) c6002f0.getValue()).floatValue(), ((Number) c6002f1.getValue()).floatValue(), this.f12441r0, fM15331c, this.f12436Y);
        }
        float fFloatValue4 = ((Number) c6002f1.getValue()).floatValue();
        C13733I c13733i3 = this.f12442s0;
        if (fFloatValue4 > fMo7862P2) {
            AbstractC3980S2.m4671e(interfaceC16039d, ((Number) c13733i3.f43307p0.getValue()).floatValue() > 0.0f ? ((Number) c13733i3.f43307p0.getValue()).floatValue() + fMo7862P2 : 0.0f, ((Number) c6002f1.getValue()).floatValue() < 1.0f ? ((Number) c6002f1.getValue()).floatValue() - fMo7862P2 : 1.0f, this.f12439p0, fM15331c, this.f12436Y);
        }
        float fFloatValue5 = ((Number) c13733i3.f43307p0.getValue()).floatValue();
        C13733I c13733i4 = this.f12443t0;
        float fFloatValue6 = fFloatValue5 - ((Number) c13733i4.f43307p0.getValue()).floatValue();
        C6002f0 c6002f2 = c13733i4.f43307p0;
        if (fFloatValue6 > 0.0f) {
            AbstractC3980S2.m4671e(interfaceC16039d, ((Number) c13733i3.f43307p0.getValue()).floatValue(), ((Number) c6002f2.getValue()).floatValue(), this.f12441r0, fM15331c, this.f12436Y);
        }
        if (((Number) c6002f2.getValue()).floatValue() > fMo7862P2) {
            AbstractC3980S2.m4671e(interfaceC16039d, 0.0f, ((Number) c6002f2.getValue()).floatValue() < 1.0f ? ((Number) c6002f2.getValue()).floatValue() - fMo7862P2 : 1.0f, this.f12439p0, fM15331c, this.f12436Y);
        }
        return C17296C.f55119a;
    }
}
