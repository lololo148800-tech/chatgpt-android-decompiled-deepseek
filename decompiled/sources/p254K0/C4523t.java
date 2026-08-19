package p254K0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: K0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4523t extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14781Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f14782Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f14783o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f14784p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4523t(float f10, float f11, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f14782Z = f10;
        this.f14783o0 = f11;
        this.f14784p0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f14781Y) {
            case 0:
                C4522s c4522s = (C4522s) obj;
                c4522s.m5264a(this.f14782Z, true);
                C4504a c4504a = (C4504a) this.f14784p0;
                for (int i10 = 0; i10 < c4504a.f14700g; i10++) {
                    c4522s.m5264a(c4504a.f14699f, false);
                }
                for (int i11 = 0; i11 < c4504a.f14698e; i11++) {
                    c4522s.m5264a(c4504a.f14697d, false);
                }
                for (int i12 = 0; i12 < c4504a.f14696c; i12++) {
                    c4522s.m5264a(c4504a.f14695b, false);
                }
                c4522s.m5264a(this.f14783o0, true);
                break;
            default:
                ((InterfaceC1436k) this.f14784p0).invoke(Float.valueOf(AbstractC8301I.m8920k(this.f14782Z - (((Number) obj).floatValue() / this.f14783o0), 0.0f, 1.0f)));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4523t(float f10, C4504a c4504a, float f11) {
        super(1);
        this.f14782Z = f10;
        this.f14784p0 = c4504a;
        this.f14783o0 = f11;
    }
}
