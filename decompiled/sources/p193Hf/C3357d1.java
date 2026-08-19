package p193Hf;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1140z1.C21660F;
import p523V9.AbstractC8088f6;
import p604Yk.C10077b;
import p759g1.C13803e;
import p774h1.C14327E;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Hf.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3357d1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10250Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3369h1 f10251Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f10252o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3357d1(C3369h1 c3369h1, long j10, int i10) {
        super(1);
        this.f10250Y = i10;
        this.f10251Z = c3369h1;
        this.f10252o0 = j10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) throws Throwable {
        long j10;
        C13711h c13711h;
        long j11;
        C17296C c17296c = C17296C.f55119a;
        long j12 = this.f10252o0;
        C3369h1 c3369h1 = this.f10251Z;
        switch (this.f10250Y) {
            case 0:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                float fM3195i = AbstractC2119a.m3195i(((Number) c3369h1.f10290a.m15224e()).floatValue());
                float fMo7864b0 = drawWithContent.mo7864b0(AbstractC3366g1.f10277b);
                float fM15333e = C13803e.m15333e(drawWithContent.mo17602i());
                float fM15331c = C13803e.m15331c(drawWithContent.mo17602i());
                C16037b c16037b = drawWithContent.f68674Y;
                C13711h c13711h2 = c16037b.f49479Z;
                long jM15202x = c13711h2.m15202x();
                c13711h2.m15196m().mo15706e();
                try {
                    j10 = jM15202x;
                    c13711h = c13711h2;
                    try {
                        ((C10077b) c13711h2.f43259Z).m10675z(0.0f, fM3195i, fM15333e, fM15331c, 1);
                        drawWithContent.m22080a();
                        c13711h.m15196m().mo15719r();
                        c13711h.m15189L(j10);
                        AbstractC14376f.m15849o(drawWithContent, new C14327E(AbstractC17681o.m19382k(new C14365u(j12), new C14365u(C14365u.m15774b(0.0f, j12))), null, AbstractC8088f6.m8536b(0.0f, fM3195i), AbstractC8088f6.m8536b(0.0f, fM3195i + fMo7864b0), 0), AbstractC8088f6.m8536b(0.0f, fM3195i), C13803e.m15329a(fMo7864b0, c16037b.f49479Z.m15202x()), 0.0f, null, 0, 120);
                        return c17296c;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC12107L1.m13830u(c13711h, j10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = jM15202x;
                    c13711h = c13711h2;
                }
                break;
            default:
                C21660F drawWithContent2 = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent2, "$this$drawWithContent");
                float fM3195i2 = AbstractC2119a.m3195i(((Number) c3369h1.f10290a.m15224e()).floatValue());
                float fMo7864b1 = drawWithContent2.mo7864b0(AbstractC3366g1.f10277b);
                float fM15333e2 = C13803e.m15333e(drawWithContent2.mo17602i());
                C13711h c13711h3 = drawWithContent2.f68674Y.f49479Z;
                long jM15202x2 = c13711h3.m15202x();
                c13711h3.m15196m().mo15706e();
                try {
                    try {
                        ((C10077b) c13711h3.f43259Z).m10675z(0.0f, 0.0f, fM15333e2, fM3195i2, 1);
                        drawWithContent2.m22080a();
                        float f10 = fM3195i2 - fMo7864b1;
                        AbstractC14376f.m15849o(drawWithContent2, new C14327E(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.0f, j12)), new C14365u(j12)), null, AbstractC8088f6.m8536b(0.0f, f10), AbstractC8088f6.m8536b(0.0f, fM3195i2), 0), AbstractC8088f6.m8536b(0.0f, f10), C13803e.m15329a(fMo7864b1, drawWithContent2.mo17602i()), 0.0f, null, 0, 120);
                        AbstractC12107L1.m13830u(c13711h3, jM15202x2);
                        return c17296c;
                    } catch (Throwable th4) {
                        th = th4;
                        j11 = jM15202x2;
                        AbstractC12107L1.m13830u(c13711h3, j11);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j11 = jM15202x2;
                }
                break;
        }
    }
}
