package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5982V0;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p759g1.C13803e;
import p775h2.AbstractC14376f;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: J0.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4134t2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13374Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f13375Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5982V0 f13376o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4134t2(long j10, InterfaceC5982V0 interfaceC5982V0, int i10) {
        super(1);
        this.f13374Y = i10;
        this.f13375Z = j10;
        this.f13376o0 = interfaceC5982V0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f13374Y) {
            case 0:
                AbstractC14376f.m15850p((InterfaceC16039d) obj, this.f13375Z, 0L, 0L, AbstractC8301I.m8920k(((Number) this.f13376o0.getValue()).floatValue(), 0.0f, 1.0f), 118);
                break;
            default:
                InterfaceC16039d drawBehind = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(drawBehind, "$this$drawBehind");
                long jM8536b = AbstractC8088f6.m8536b((((Number) this.f13376o0.getValue()).floatValue() * C13803e.m15333e(drawBehind.mo17602i())) / 2.0f, 0.0f);
                long jM8603a = AbstractC8112i6.m8603a(C13803e.m15333e(drawBehind.mo17602i()) / 2.0f, C13803e.m15331c(drawBehind.mo17602i()));
                float fM15331c = C13803e.m15331c(drawBehind.mo17602i());
                AbstractC14376f.m15852r(drawBehind, this.f13375Z, jM8536b, jM8603a, AbstractC8072d6.m8484a(fM15331c, fM15331c), null, 240);
                break;
        }
        return C17296C.f55119a;
    }
}
