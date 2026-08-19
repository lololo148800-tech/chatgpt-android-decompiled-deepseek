package p254K0;

import android.graphics.Path;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p349O0.C5998d0;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7313q;
import p492U1.C7543h;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p571X9.AbstractC9101A4;
import p636a2.C10468e;
import p636a2.C10482s;
import p758g0.C13771k0;
import p759g1.C13803e;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p775h2.AbstractC14376f;
import p821j1.C16042g;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p860l0.C16782u;
import tf.AbstractC19915U;

/* JADX INFO: renamed from: K0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4526w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14801Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f14802Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f14803o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4526w(float f10, InterfaceC5985X interfaceC5985X) {
        super(1);
        this.f14801Y = 1;
        this.f14802Z = f10;
        this.f14803o0 = interfaceC5985X;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f14801Y) {
            case 0:
                C4522s c4522s = (C4522s) obj;
                C4520q c4520q = (C4520q) this.f14803o0;
                int size = c4520q.f14770Y.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C4519p c4519p = c4520q.get(i10);
                    c4522s.m5264a(c4519p.f14762a - Math.abs(this.f14802Z), c4519p.f14766e);
                }
                return C17296C.f55119a;
            case 1:
                long j10 = ((C13803e) obj).f43598a;
                float fM15333e = C13803e.m15333e(j10);
                float f10 = this.f14802Z;
                float f11 = fM15333e * f10;
                float fM15331c = C13803e.m15331c(j10) * f10;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f14803o0;
                if (C13803e.m15333e(((C13803e) interfaceC5985X.getValue()).f43598a) != f11 || C13803e.m15331c(((C13803e) interfaceC5985X.getValue()).f43598a) != fM15331c) {
                    interfaceC5985X.setValue(new C13803e(AbstractC8112i6.m8603a(f11, fM15331c)));
                }
                return C17296C.f55119a;
            case 2:
                InterfaceC7537b offset = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(offset, "$this$offset");
                return new C7543h(AbstractC9101A4.m9631a(AbstractC2119a.m3195i(((C16782u) this.f14803o0).f53868j.m6409g() - this.f14802Z), 0));
            case 3:
                C10482s state = (C10482s) obj;
                AbstractC16544l.m18094g(state, "state");
                state.m10948a(((C10468e) this.f14803o0).f30998a).f41901d = this.f14802Z;
                return C17296C.f55119a;
            case 4:
                long jLongValue = ((Number) obj).longValue();
                C13771k0 c13771k0 = (C13771k0) this.f14803o0;
                if (!c13771k0.m15276g()) {
                    C5998d0 c5998d0 = c13771k0.f43495g;
                    if (c5998d0.m6471g() == Long.MIN_VALUE) {
                        c5998d0.m6472h(jLongValue);
                        c13771k0.f43489a.f43329a.setValue(Boolean.TRUE);
                    }
                    long jM6471g = jLongValue - c5998d0.m6471g();
                    float f12 = this.f14802Z;
                    if (f12 != 0.0f) {
                        jM6471g = AbstractC2119a.m3196j(jM6471g / ((double) f12));
                    }
                    if (c13771k0.f43490b == null) {
                        c13771k0.f43494f.m6472h(jM6471g);
                    }
                    c13771k0.m15277h(jM6471g, f12 == 0.0f);
                }
                return C17296C.f55119a;
            case 5:
                InterfaceC16039d Canvas = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(Canvas, "$this$Canvas");
                InterfaceC14333K trianglePath = (InterfaceC14333K) this.f14803o0;
                AbstractC16544l.m18094g(trianglePath, "trianglePath");
                float fMo7864b0 = Canvas.mo7864b0(AbstractC7313q.f23198c);
                C14353i c14353i = (C14353i) trianglePath;
                Path path = c14353i.f45039a;
                path.rewind();
                float f13 = 2;
                c14353i.m15731c(C13803e.m15333e(Canvas.mo17602i()) / f13, C13803e.m15331c(Canvas.mo17602i()) - fMo7864b0);
                c14353i.m15730b(C13803e.m15333e(Canvas.mo17602i()) - fMo7864b0, fMo7864b0);
                c14353i.m15730b(fMo7864b0, fMo7864b0);
                path.close();
                long j11 = C14365u.f45055e;
                AbstractC14376f.m15848n(Canvas, trianglePath, C14365u.m15774b(0.8f, j11), 0.0f, C16042g.f49483a, 52);
                float f14 = AbstractC19915U.f63139d;
                C16043h c16043h = new C16043h(Canvas.mo7864b0(f14), 0.0f, 0, 0, 30);
                long j12 = AbstractC19915U.f63140e;
                AbstractC14376f.m15848n(Canvas, trianglePath, j12, 0.0f, c16043h, 52);
                long jM8536b = AbstractC8088f6.m8536b(C13803e.m15333e(Canvas.mo17602i()) / f13, (1 - this.f14802Z) * C13803e.m15331c(Canvas.mo17602i()));
                float f15 = AbstractC19915U.f63138c;
                Canvas.mo17591U(j11, (112 & 2) != 0 ? C13803e.m15332d(Canvas.mo17602i()) / 2.0f : Canvas.mo7864b0(f15), (112 & 4) != 0 ? Canvas.mo17604o0() : jM8536b, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                Canvas.mo17591U(j12, (112 & 2) != 0 ? C13803e.m15332d(Canvas.mo17602i()) / 2.0f : Canvas.mo7864b0(f15), (112 & 4) != 0 ? Canvas.mo17604o0() : jM8536b, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : new C16043h(Canvas.mo7864b0(f14), 0.0f, 0, 0, 30), null, 3);
                return C17296C.f55119a;
            default:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                layout.m21545d((AbstractC21069X) this.f14803o0, -((int) Math.floor(this.f14802Z)), 0, 0.0f);
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4526w(Object obj, float f10, int i10) {
        super(1);
        this.f14801Y = i10;
        this.f14803o0 = obj;
        this.f14802Z = f10;
    }
}
