package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8088f6;
import p759g1.C13803e;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: J0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4037d1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12710Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12711Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f12712o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4037d1(float f10, int i10, long j10) {
        super(1);
        this.f12710Y = i10;
        this.f12711Z = f10;
        this.f12712o0 = j10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f12710Y) {
            case 0:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                float f10 = this.f12711Z;
                float f11 = 2;
                interfaceC16039d.mo17607x0(this.f12712o0, AbstractC8088f6.m8536b(0.0f, interfaceC16039d.mo7864b0(f10) / f11), AbstractC8088f6.m8536b(C13803e.m15333e(interfaceC16039d.mo17602i()), interfaceC16039d.mo7864b0(f10) / f11), interfaceC16039d.mo7864b0(f10), (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                break;
            default:
                InterfaceC16039d interfaceC16039d2 = (InterfaceC16039d) obj;
                float f12 = this.f12711Z;
                float f13 = 2;
                interfaceC16039d2.mo17607x0(this.f12712o0, AbstractC8088f6.m8536b(interfaceC16039d2.mo7864b0(f12) / f13, 0.0f), AbstractC8088f6.m8536b(interfaceC16039d2.mo7864b0(f12) / f13, C13803e.m15331c(interfaceC16039d2.mo17602i())), interfaceC16039d2.mo7864b0(f12), (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                break;
        }
        return C17296C.f55119a;
    }
}
