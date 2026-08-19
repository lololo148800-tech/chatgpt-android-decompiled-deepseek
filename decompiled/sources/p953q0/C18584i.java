package p953q0;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16557y;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p530Vi.AbstractC8301I;
import p758g0.C13770k;
import p758g0.C13774m;
import p860l0.InterfaceC16694M0;

/* JADX INFO: renamed from: q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C18584i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC18590l f59191Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f59192Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f59193o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16557y f59194p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC16694M0 f59195q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16556x f59196r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f59197s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float f59198t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C16558z f59199u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f59200v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C16525B f59201w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18584i(InterfaceC18590l interfaceC18590l, int i10, float f10, C16557y c16557y, InterfaceC16694M0 interfaceC16694M0, C16556x c16556x, boolean z6, float f11, C16558z c16558z, int i11, C16525B c16525b) {
        super(1);
        this.f59191Y = interfaceC18590l;
        this.f59192Z = i10;
        this.f59193o0 = f10;
        this.f59194p0 = c16557y;
        this.f59195q0 = interfaceC16694M0;
        this.f59196r0 = c16556x;
        this.f59197s0 = z6;
        this.f59198t0 = f11;
        this.f59199u0 = c16558z;
        this.f59200v0 = i11;
        this.f59201w0 = c16525b;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13770k c13770k = (C13770k) obj;
        InterfaceC18590l interfaceC18590l = this.f59191Y;
        int i10 = this.f59192Z;
        boolean zM19951a = AbstractC18588k.m19951a(interfaceC18590l, i10);
        C16556x c16556x = this.f59196r0;
        int i11 = this.f59200v0;
        boolean z6 = this.f59197s0;
        if (!zM19951a) {
            float f10 = this.f59193o0;
            float fM8917h = f10 > 0.0f ? AbstractC8301I.m8917h(((Number) c13770k.f43484e.getValue()).floatValue(), f10) : AbstractC8301I.m8915f(((Number) c13770k.f43484e.getValue()).floatValue(), f10);
            C16557y c16557y = this.f59194p0;
            float f11 = fM8917h - c16557y.f51286Y;
            float fMo18510a = this.f59195q0.mo18510a(f11);
            if (AbstractC18588k.m19951a(interfaceC18590l, i10) || C18586j.m19950c(z6, interfaceC18590l, i10, i11)) {
                if (C18586j.m19950c(z6, interfaceC18590l, i10, i11)) {
                    interfaceC18590l.mo10222w(i10, i11);
                    c16556x.f51285Y = false;
                    c13770k.m15268a();
                } else if (AbstractC18588k.m19951a(interfaceC18590l, i10)) {
                    throw new C18582h(AbstractC2119a.m3195i(interfaceC18590l.mo10196G(i10)), (C13774m) this.f59201w0.f51262Y);
                }
            } else if (f11 == fMo18510a) {
                c16557y.f51286Y += f11;
                float f12 = this.f59198t0;
                if (z6) {
                    if (((Number) c13770k.f43484e.getValue()).floatValue() > f12) {
                        c13770k.m15268a();
                    }
                } else if (((Number) c13770k.f43484e.getValue()).floatValue() < (-f12)) {
                    c13770k.m15268a();
                }
                C16558z c16558z = this.f59199u0;
                if (z6) {
                    if (c16558z.f51287Y >= 2 && i10 - interfaceC18590l.mo10218n() > 100) {
                        interfaceC18590l.mo10222w(i10 - 100, 0);
                    }
                } else if (c16558z.f51287Y >= 2 && interfaceC18590l.mo10197H() - i10 > 100) {
                    interfaceC18590l.mo10222w(i10 + 100, 0);
                }
                if (C18586j.m19950c(z6, interfaceC18590l, i10, i11)) {
                    interfaceC18590l.mo10222w(i10, i11);
                    c16556x.f51285Y = false;
                    c13770k.m15268a();
                } else if (AbstractC18588k.m19951a(interfaceC18590l, i10)) {
                    throw new C18582h(AbstractC2119a.m3195i(interfaceC18590l.mo10196G(i10)), (C13774m) this.f59201w0.f51262Y);
                }
            } else {
                c13770k.m15268a();
                c16556x.f51285Y = false;
            }
        } else if (C18586j.m19950c(z6, interfaceC18590l, i10, i11)) {
            interfaceC18590l.mo10222w(i10, i11);
            c16556x.f51285Y = false;
            c13770k.m15268a();
        } else if (AbstractC18588k.m19951a(interfaceC18590l, i10)) {
            throw new C18582h(AbstractC2119a.m3195i(interfaceC18590l.mo10196G(i10)), (C13774m) this.f59201w0.f51262Y);
        }
        return C17296C.f55119a;
    }
}
