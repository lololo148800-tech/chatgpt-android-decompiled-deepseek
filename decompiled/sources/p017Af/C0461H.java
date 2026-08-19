package p017Af;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1126m1;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8088f6;
import p759g1.C13803e;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p775h2.AbstractC14376f;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Af.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C0461H extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC14333K f1492Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f1493Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f1494o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1126m1 f1495p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Float f1496q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Float f1497r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f1498s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461H(InterfaceC14333K interfaceC14333K, List list, long j10, C1126m1 c1126m1, Float f10, Float f11, long j11) {
        super(1);
        this.f1492Y = interfaceC14333K;
        this.f1493Z = list;
        this.f1494o0 = j10;
        this.f1495p0 = c1126m1;
        this.f1496q0 = f10;
        this.f1497r0 = f11;
        this.f1498s0 = j11;
    }

    /* JADX INFO: renamed from: a */
    public static final float m1109a(List list, InterfaceC16039d interfaceC16039d, int i10) {
        int i11 = ((C1126m1) AbstractC17680n.m19341Q(list)).f3040a;
        return C13803e.m15333e(interfaceC16039d.mo17602i()) * ((((C1126m1) list.get(i10)).f3040a - i11) / (((C1126m1) AbstractC17680n.m19351a0(list)).f3040a - i11));
    }

    /* JADX INFO: renamed from: b */
    public static final Float m1110b(C1126m1 c1126m1, InterfaceC16039d interfaceC16039d, float f10, Float f11, Float f12) {
        Float f13 = c1126m1.f3041b;
        if (f13 == null) {
            return null;
        }
        float fFloatValue = f13.floatValue();
        return Float.valueOf((C13803e.m15331c(interfaceC16039d.mo17602i()) - f10) - ((C13803e.m15331c(interfaceC16039d.mo17602i()) - (f10 * 2.0f)) * ((fFloatValue - f11.floatValue()) / (f12.floatValue() - f11.floatValue()))));
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC16039d Canvas = (InterfaceC16039d) obj;
        AbstractC16544l.m18094g(Canvas, "$this$Canvas");
        float fMo7864b0 = Canvas.mo7864b0(AbstractC0462I.f1500b);
        float fMo7864b1 = Canvas.mo7864b0(2);
        C14353i c14353i = (C14353i) this.f1492Y;
        c14353i.f45039a.rewind();
        List list = this.f1493Z;
        C1126m1 c1126m1 = (C1126m1) AbstractC17680n.m19341Q(list);
        Float f10 = this.f1496q0;
        Float f11 = this.f1497r0;
        Float fM1110b = m1110b(c1126m1, Canvas, fMo7864b0, f10, f11);
        c14353i.m15731c(0.0f, fM1110b != null ? fM1110b.floatValue() : 0.0f);
        int i10 = 0;
        for (Object obj2 : AbstractC17680n.m19336L(list, 1)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            float fM1109a = m1109a(list, Canvas, i10);
            Float fM1110b2 = m1110b((C1126m1) obj2, Canvas, fMo7864b0, f10, f11);
            if (fM1110b2 != null) {
                c14353i.m15730b(fM1109a, fM1110b2.floatValue());
            }
            i10 = i11;
        }
        AbstractC14376f.m15848n(Canvas, this.f1492Y, this.f1494o0, 0.0f, new C16043h(fMo7864b1, 0.0f, 0, 1, 22), 52);
        C1126m1 c1126m2 = this.f1495p0;
        if (c1126m2 != null) {
            float fM1109a2 = m1109a(list, Canvas, list.indexOf(c1126m2));
            Canvas.mo17607x0(C14365u.m15774b(0.38f, this.f1498s0), AbstractC8088f6.m8536b(fM1109a2, 0.0f), AbstractC8088f6.m8536b(fM1109a2, C13803e.m15331c(Canvas.mo17602i())), Canvas.mo7864b0(1), (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        }
        return C17296C.f55119a;
    }
}
