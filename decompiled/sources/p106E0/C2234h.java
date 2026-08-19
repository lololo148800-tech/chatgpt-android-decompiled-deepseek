package p106E0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p229J0.AbstractC3980S2;
import p758g0.C13733I;
import p774h1.AbstractC14334L;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: E0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2234h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6838Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f6839Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16043h f6840o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13733I f6841p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13733I f6842q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C13733I f6843r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C13733I f6844s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float f6845t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ long f6846u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234h(long j10, C16043h c16043h, float f10, long j11, C13733I c13733i, C13733I c13733i2, C13733I c13733i3, C13733I c13733i4) {
        super(1);
        this.f6839Z = j10;
        this.f6840o0 = c16043h;
        this.f6845t0 = f10;
        this.f6846u0 = j11;
        this.f6841p0 = c13733i;
        this.f6842q0 = c13733i2;
        this.f6843r0 = c13733i3;
        this.f6844s0 = c13733i4;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        float f10;
        float f11;
        switch (this.f6838Y) {
            case 0:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                C16043h c16043h = this.f6840o0;
                AbstractC2236j.m3268b(interfaceC16039d, 0.0f, 360.0f, this.f6839Z, c16043h);
                float fIntValue = (((Number) this.f6841p0.f43307p0.getValue()).intValue() * 216.0f) % 360.0f;
                float fFloatValue = ((Number) this.f6842q0.f43307p0.getValue()).floatValue();
                C13733I c13733i = this.f6843r0;
                float fAbs = Math.abs(fFloatValue - ((Number) c13733i.f43307p0.getValue()).floatValue());
                float fFloatValue2 = ((Number) c13733i.f43307p0.getValue()).floatValue() + ((Number) this.f6844s0.f43307p0.getValue()).floatValue() + (fIntValue - 90.0f);
                if (AbstractC14334L.m15642t(c16043h.f49486c, 0)) {
                    f10 = 0.0f;
                } else {
                    f10 = ((this.f6845t0 / (AbstractC2236j.f6854a / 2)) * 57.29578f) / 2.0f;
                }
                AbstractC2236j.m3268b(interfaceC16039d, f10 + fFloatValue2, Math.max(fAbs, 0.1f), this.f6846u0, c16043h);
                break;
            default:
                InterfaceC16039d interfaceC16039d2 = (InterfaceC16039d) obj;
                C16043h c16043h2 = this.f6840o0;
                AbstractC3980S2.m4672f(interfaceC16039d2, 0.0f, 360.0f, this.f6839Z, c16043h2);
                float fFloatValue3 = (((Number) this.f6841p0.f43307p0.getValue()).floatValue() * 216.0f) % 360.0f;
                float fFloatValue4 = ((Number) this.f6842q0.f43307p0.getValue()).floatValue();
                C13733I c13733i2 = this.f6843r0;
                float fAbs2 = Math.abs(fFloatValue4 - ((Number) c13733i2.f43307p0.getValue()).floatValue());
                float fFloatValue5 = ((Number) c13733i2.f43307p0.getValue()).floatValue() + ((Number) this.f6844s0.f43307p0.getValue()).floatValue() + (fFloatValue3 - 90.0f);
                if (AbstractC14334L.m15642t(c16043h2.f49486c, 0)) {
                    f11 = 0.0f;
                } else {
                    f11 = ((this.f6845t0 / (AbstractC3980S2.f12474e / 2)) * 57.29578f) / 2.0f;
                }
                AbstractC3980S2.m4672f(interfaceC16039d2, f11 + fFloatValue5, Math.max(fAbs2, 0.1f), this.f6846u0, c16043h2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234h(long j10, C16043h c16043h, C13733I c13733i, C13733I c13733i2, C13733I c13733i3, C13733I c13733i4, float f10, long j11) {
        super(1);
        this.f6839Z = j10;
        this.f6840o0 = c16043h;
        this.f6841p0 = c13733i;
        this.f6842q0 = c13733i2;
        this.f6843r0 = c13733i3;
        this.f6844s0 = c13733i4;
        this.f6845t0 = f10;
        this.f6846u0 = j11;
    }
}
