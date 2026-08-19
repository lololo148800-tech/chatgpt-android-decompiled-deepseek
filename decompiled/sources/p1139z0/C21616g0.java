package p1139z0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.EnumC0123W;
import p003A1.AbstractC0187M0;
import p003A1.C0190N0;
import p003A1.InterfaceC0182K1;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21690f;
import p349O0.C5984W0;
import p737f1.AbstractC13512d;
import p820j0.AbstractC16033d;

/* JADX INFO: renamed from: z0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21616g0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68477Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21640s0 f68478Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21616g0(C21640s0 c21640s0, int i10) {
        super(0);
        this.f68477Y = i10;
        this.f68478Z = c21640s0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f68477Y) {
            case 0:
                this.f68478Z.f68552D0.m416u();
                return Boolean.TRUE;
            case 1:
                C21640s0 c21640s0 = this.f68478Z;
                if (!c21640s0.m21990S0()) {
                    AbstractC13512d.m15028A(c21640s0);
                } else if (!c21640s0.f68554F0) {
                    ((C0190N0) c21640s0.m21992U0()).m572b();
                }
                return Boolean.TRUE;
            case 2:
                C21640s0 c21640s1 = this.f68478Z;
                if (!c21640s1.m21990S0()) {
                    AbstractC13512d.m15028A(c21640s1);
                }
                c21640s1.f68552D0.m419x(EnumC0123W.f528o0);
                return Boolean.TRUE;
            case 3:
                this.f68478Z.f68552D0.m403f(true);
                return Boolean.TRUE;
            case 4:
                this.f68478Z.f68552D0.m404g();
                return Boolean.TRUE;
            case 5:
                return AbstractC16033d.m17588a(this.f68478Z) != null ? AbstractC21614f0.f68474b : AbstractC21614f0.f68473a;
            case 6:
                C21640s0 c21640s2 = this.f68478Z;
                C21640s0.m21986O0(c21640s2, c21640s2.f68562N0.m21289b());
                return C17296C.f55119a;
            case 7:
                C5984W0 c5984w0 = AbstractC0187M0.f716r;
                C21640s0 c21640s3 = this.f68478Z;
                c21640s3.f68564P0 = (InterfaceC0182K1) AbstractC21690f.m22204i(c21640s3, c5984w0);
                c21640s3.m21991T0();
                return C17296C.f55119a;
            case 8:
                C21640s0 c21640s4 = this.f68478Z;
                if (c21640s4.f68568T0 != null) {
                    ((C0190N0) c21640s4.m21992U0()).m572b();
                } else {
                    c21640s4.m21993V0(true);
                }
                return C17296C.f55119a;
            default:
                return AbstractC16033d.m17588a(this.f68478Z);
        }
    }
}
